package io.github.chiselteam.chisel.client.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.chiselteam.chisel.block.entity.BuildersGuideBlockEntity;
import io.github.chiselteam.chisel.client.entity.state.BuildersGuideBlockEntityRenderState;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.*;

public class BuildersGuideBlockEntityRenderer implements BlockEntityRenderer<BuildersGuideBlockEntity, BuildersGuideBlockEntityRenderState> {

    /** ARGB colour used for the ghost cubes: white with ~40% opacity. */
    private static final int GHOST_COLOR = 0x66FFFFFF;

    /** Duration in milliseconds of the pop-in / pop-out animation. */
    private static final long ANIM_DURATION_MS = 200L;

    /**
     * Per-BuildersGuide animation state, keyed by the block position so multiple BuildersGuide
     * blocks in the world don't clobber each other's animations.
     */
    private static final Map<BlockPos, GuideAnim> ANIMATIONS = new HashMap<>();

    public BuildersGuideBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void extractRenderState(BuildersGuideBlockEntity guide, BuildersGuideBlockEntityRenderState state, float partialTicks, Vec3 camera, ModelFeatureRenderer.@Nullable CrumblingOverlay breakProgress) {
        BlockEntityRenderer.super.extractRenderState(guide, state, partialTicks, camera, breakProgress);
        state.origin = guide.getBlockPos();
        state.ghostBlocks = guide.getGhostBlocks();
    }

    @Override
    public @NonNull BuildersGuideBlockEntityRenderState createRenderState() {
        return new BuildersGuideBlockEntityRenderState();
    }

    @Override
    public void submit(@NonNull BuildersGuideBlockEntityRenderState state, @NonNull PoseStack pose, @NonNull SubmitNodeCollector submit, @NonNull CameraRenderState camera) {
        final BlockPos origin = state.origin;
        final long now = System.currentTimeMillis();

        GuideAnim anim = ANIMATIONS.computeIfAbsent(origin, k -> new GuideAnim());
        anim.update(state.ghostBlocks, now);

        if (anim.entries.isEmpty()) return;

        submit.submitCustomGeometry(pose, RenderTypes.debugFilledBox(), (p, buffer) -> {
            for (Map.Entry<BlockPos, Entry> e : anim.entries.entrySet()) {
                BlockPos ghost = e.getKey();
                float scale = e.getValue().scale(now);
                if (scale <= 0.0F) continue;

                float cxF = (ghost.getX() - origin.getX()) + 0.5F;
                float cyF = (ghost.getY() - origin.getY()) + 0.5F;
                float czF = (ghost.getZ() - origin.getZ()) + 0.5F;
                // Each ghost cube is 1/16 of a block smaller than a full cube (1/32 shaved off
                // each side), scaled by the current pop animation factor.
                float half = (0.5F - 1.0F / 32.0F) * scale;
                drawCube(p, buffer,
                        cxF - half, cyF - half, czF - half,
                        cxF + half, cyF + half, czF + half);
            }
        });
    }

    /**
     * Emits the six faces of an axis-aligned cube as {@code QUADS} into the supplied vertex
     * consumer. Uses the {@code POSITION_COLOR} vertex format expected by
     * {@link RenderTypes#debugFilledBox()} and the fixed {@link #GHOST_COLOR}.
     */
    private static void drawCube(PoseStack.Pose pose, VertexConsumer buffer,
                                 float minX, float minY, float minZ,
                                 float maxX, float maxY, float maxZ) {
        // -Y (bottom)
        buffer.addVertex(pose, minX, minY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, minX, minY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, minY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, minY, minZ).setColor(GHOST_COLOR);
        // +Y (top)
        buffer.addVertex(pose, minX, maxY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, maxY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, maxY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, minX, maxY, maxZ).setColor(GHOST_COLOR);
        // -Z (north)
        buffer.addVertex(pose, minX, minY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, minY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, maxY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, minX, maxY, minZ).setColor(GHOST_COLOR);
        // +Z (south)
        buffer.addVertex(pose, minX, minY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, minX, maxY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, maxY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, minY, maxZ).setColor(GHOST_COLOR);
        // -X (west)
        buffer.addVertex(pose, minX, minY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, minX, maxY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, minX, maxY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, minX, minY, maxZ).setColor(GHOST_COLOR);
        // +X (east)
        buffer.addVertex(pose, maxX, minY, minZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, minY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, maxY, maxZ).setColor(GHOST_COLOR);
        buffer.addVertex(pose, maxX, maxY, minZ).setColor(GHOST_COLOR);
    }

    /**
     * Per-BuildersGuide animation state: tracks each ghost position and whether it's currently
     * popping in (target scale = 1) or popping out (target scale = 0). Positions that finish
     * popping out are removed entirely.
     */
    private static final class GuideAnim {
        final Map<BlockPos, Entry> entries = new HashMap<>();

        /**
         * Reconciles the previous set of animated positions with the latest ghost-block set:
         * new positions start popping in from scale 0, positions that vanished start popping out
         * from their current scale, and fully popped-out entries are removed.
         */
        void update(List<BlockPos> current, long now) {
            Set<BlockPos> currentSet = new HashSet<>(current);

            // Ensure every currently-active position has an entry targeting scale 1.
            for (BlockPos pos : currentSet) {
                Entry e = entries.get(pos);
                if (e == null) {
                    entries.put(pos, new Entry(0.0F, 1.0F, now));
                } else if (e.target != 1.0F) {
                    // Was popping out; retarget to popping in from its current scale.
                    entries.put(pos, new Entry(e.scale(now), 1.0F, now));
                }
            }

            // Positions no longer active start popping out (or get cleaned up if fully out).
            Iterator<Map.Entry<BlockPos, Entry>> it = entries.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<BlockPos, Entry> e = it.next();
                if (currentSet.contains(e.getKey())) continue;
                Entry v = e.getValue();
                if (v.target != 0.0F) {
                    e.setValue(new Entry(v.scale(now), 0.0F, now));
                } else if (v.scale(now) <= 0.0F) {
                    it.remove();
                }
            }
        }
    }

    /**
         * Single ghost-block animation entry: interpolates from {@link #from} to {@link #target}
         * over {@link #ANIM_DURATION_MS} starting at {@link #startMs}, using a smoothstep curve.
         */
        private record Entry(float from, float target, long startMs) {

        float scale(long now) {
                long elapsed = now - startMs;
                if (elapsed >= ANIM_DURATION_MS) return target;
                if (elapsed <= 0L) return from;
                float t = elapsed / (float) ANIM_DURATION_MS;
                t = t * t * (3.0F - 2.0F * t); // smoothstep
                return from + (target - from) * t;
            }
        }
}
