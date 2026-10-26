package io.github.chiselteam.chisel.client.gui.palette;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.QuadInstance;
import io.github.chiselteam.chisel.client.gui.preview.PreviewGetter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.ARGB;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.joml.Quaternionf;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaletteWallRenderer extends PictureInPictureRenderer<PaletteWallState> {

    private static final long MODEL_SEED = 42L;

    @Override
    public @NonNull Class<PaletteWallState> getRenderStateClass() {
        return PaletteWallState.class;
    }

    @Override
    protected float getTranslateY(int height, int guiScale) {
        return height / 2.0F;

    }

    @Override
    protected void renderToTexture(@NonNull PaletteWallState state, @NonNull PoseStack pose, SubmitNodeCollector collector) {
        pose.translate(state.panX(), state.panY(), 0);
        if (state.blocks().isEmpty()) return;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, minZ = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, maxZ = Integer.MIN_VALUE;
        for (var pos : state.blocks().keySet()) {
            minX = Math.min(minX, pos.getX());
            maxX = Math.max(maxX, pos.getX());
            minY = Math.min(minY, pos.getY());
            maxY = Math.max(maxY, pos.getY());
            minZ = Math.min(minZ, pos.getZ());
            maxZ = Math.max(maxZ, pos.getZ());
        }
        float scale = state.zoom() * PalettePreviewCamera.fitScale(
                maxX - minX + 1, maxY - minY + 1, maxZ - minZ + 1,
                state.rotationX(), state.rotationY(), state.x1() - state.x0(), state.y1() - state.y0());
        pose.scale(scale, scale, scale);
        pose.rotate(new Quaternionf().rotateX((float) Math.PI + state.rotationX()).rotateY(state.rotationY()));
        pose.translate(-(minX + maxX + 1) / 2F, -(minY + maxY + 1) / 2F, -(minZ + maxZ + 1) / 2F);

        var modelSet = Minecraft.getInstance().getModelManager().getBlockStateModelSet();
        var getter = new PreviewGetter(Blocks.AIR.defaultBlockState(), new int[0][]) {
            @Override
            public @NonNull BlockState getBlockState(@NonNull BlockPos pos) {
                return state.blocks().getOrDefault(pos, Blocks.AIR.defaultBlockState());
            }
        };
        var random = RandomSource.create();

        for (var cell : state.blocks().entrySet()) {
            pose.pushPose();
            var pos = cell.getKey();
            var block = cell.getValue();
            var model = modelSet.get(block);
            pose.translate(pos.getX(), pos.getY(), pos.getZ());
            random.setSeed(MODEL_SEED);
            List<BlockStateModelPart> parts = new ArrayList<>();
            model.collectParts(getter, pos, block, random, parts);

            parts.forEach(part -> {
                Arrays.stream(Direction.values()).forEach(side -> {
                    var neighborPos = pos.relative(side);
                    var neighborState = getter.getBlockState(neighborPos);

                    if (!block.skipRendering(neighborState, side)) {
                        bakeQuads(side, part, pose, block, getter, pos, collector);
                    }
                });

                bakeQuads(null, part, pose, block, getter, pos, collector);
            });
            pose.popPose();
        }
    }

    private void bakeQuads(Direction side, BlockStateModelPart part, PoseStack pose, BlockState block, PreviewGetter getter, BlockPos pos, SubmitNodeCollector collector) {
        part.getQuads(side).forEach(quad -> {
            var quads = new QuadInstance();
            quads.setColor(-1);
            // Full-bright light coordinates still need face shading to show corners and depth.
            var shadeDirection = quad.materialInfo().shadeDirectionOverride();
            quads.scaleColor(getter.cardinalLighting().byFace(shadeDirection != null ? shadeDirection : quad.direction()));
            int tintIndex = quad.materialInfo().tintIndex();
            if (tintIndex >= 0) {
                var tint = Minecraft.getInstance().getBlockColors().getTintSource(block, tintIndex);
                // Biome resolvers return RGB; multiplying its absent alpha hides cutout faces.
                if (tint != null) quads.multiplyColor(ARGB.opaque(tint.colorInWorld(block, getter, pos)));
            }
            quads.setLightCoords(15728880);
            collector.submitCustomGeometry(pose, getRenderTypeForLayer(quad.materialInfo().layer()), (entry, buffer) -> {
                buffer.putBakedQuad(entry, quad, quads);
            });
        });
    }

    private RenderType getRenderTypeForLayer(ChunkSectionLayer layer) {
        return switch (layer) {
            case SOLID -> RenderTypes.solidMovingBlock();
            case CUTOUT -> RenderTypes.cutoutMovingBlock();
            case TRANSLUCENT -> RenderTypes.translucentMovingBlock();
        };
    }

    @Override
    protected @NonNull String getTextureLabel() {
        return "Palette wall preview";
    }
}
