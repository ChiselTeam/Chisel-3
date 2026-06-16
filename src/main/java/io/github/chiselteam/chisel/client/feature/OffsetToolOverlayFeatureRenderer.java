package io.github.chiselteam.chisel.client.feature;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.client.renderer.feature.FeatureFrameContext;
import net.minecraft.client.renderer.feature.FeatureRendererType;
import net.minecraft.client.renderer.feature.RenderTypeFeatureRenderer;
import net.minecraft.client.renderer.feature.submit.BatchableSubmit;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;
import org.jspecify.annotations.NonNull;

import java.awt.geom.Line2D;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static net.minecraft.core.Direction.DOWN;
import static net.minecraft.core.Direction.EAST;
import static net.minecraft.core.Direction.NORTH;
import static net.minecraft.core.Direction.SOUTH;
import static net.minecraft.core.Direction.UP;
import static net.minecraft.core.Direction.WEST;

public class OffsetToolOverlayFeatureRenderer extends RenderTypeFeatureRenderer<OffsetToolOverlayFeatureRenderer.Submit> {
    public static final FeatureRendererType<OffsetToolOverlayFeatureRenderer.Submit> TYPE = FeatureRendererType.create("%s:offset_tool_overlay".formatted(Chisel.MODID));

    @Override
    protected void buildGroup(@NonNull FeatureFrameContext context, @NonNull List<Submit> submits) {
        for(Submit submit : submits) {
            VertexConsumer buffer = getVertexBuilder(RenderTypes.lines());

            Vec3 vec = submit.hit.getLocation();
            Direction face = submit.hit.getDirection();

            // Bias each face slightly outward to prevent z-fighting with the block surface.
            float x = (float) (Math.max(0, face.getStepX()) + (0.01 * face.getStepX()));
            float y = (float) (Math.max(0, face.getStepY()) + (0.01 * face.getStepY()));
            float z = (float) (Math.max(0, face.getStepZ()) + (0.01 * face.getStepZ()));

            submit.pose.pushPose();
            submit.pose.translate(submit.cameraRelativePos.x, submit.cameraRelativePos.y, submit.cameraRelativePos.z);
            PoseStack.Pose last = submit.pose.last();

            // --- Draw the X (two diagonals across the hit face) ---
            if (face.getStepX() != 0) {
                drawLine(buffer, last, submit.outlineColor, x, 0, 0, x, 1, 1);
                drawLine(buffer, last, submit.outlineColor, x, 1, 0, x, 0, 1);
            } else if (face.getStepY() != 0) {
                drawLine(buffer, last, submit.outlineColor, 0, y, 0, 1, y, 1);
                drawLine(buffer, last, submit.outlineColor, 1, y, 0, 0, y, 1);
            } else {
                drawLine(buffer, last, submit.outlineColor, 0, 0, z, 1, 1, z);
                drawLine(buffer, last, submit.outlineColor, 1, 0, z, 0, 1, z);
            }

            // --- Draw the triangle pointing toward the offset direction ---
            Direction moveDir = getMoveDir(face, vec.x() - submit.pos.getX(), vec.y() - submit.pos.getY(), vec.z() - submit.pos.getZ());
            float clampedX = Math.max(0, moveDir.getStepX());
            float clampedY = Math.max(0, moveDir.getStepY());
            float clampedZ = Math.max(0, moveDir.getStepZ());
            boolean isX = moveDir.getStepX() != 0;
            boolean isY = moveDir.getStepY() != 0;
            boolean isZ = moveDir.getStepZ() != 0;

            // Center of face, plus the two corners of the edge in the move direction.
            float cx, cy, cz, ax, ay, az, bx, by, bz;
            if (face.getStepX() != 0) {
                cx = x;
                cy = 0.5F;
                cz = 0.5F;
                ax = x;
                ay = isY ? clampedY : 0;
                az = isZ ? clampedZ : 0;
                bx = x;
                by = isY ? clampedY : 1;
                bz = isZ ? clampedZ : 1;
            } else if (face.getStepY() != 0) {
                cx = 0.5F;
                cy = y;
                cz = 0.5F;
                ax = isX ? clampedX : 0;
                ay = y;
                az = isZ ? clampedZ : 0;
                bx = isX ? clampedX : 1;
                by = y;
                bz = isZ ? clampedZ : 1;
            } else {
                cx = 0.5F;
                cy = 0.5F;
                cz = z;
                ax = isX ? clampedX : 0;
                ay = isY ? clampedY : 0;
                az = z;
                bx = isX ? clampedX : 1;
                by = isY ? clampedY : 1;
                bz = z;
            }
            VertexConsumer triBuffer = getVertexBuilder(RenderTypes.debugTriangleFan());
            triBuffer.addVertex(last, cx, cy, cz).setColor(submit.triangleColor);
            triBuffer.addVertex(last, ax, ay, az).setColor(submit.triangleColor);
            triBuffer.addVertex(last, bx, by, bz).setColor(submit.triangleColor);

            submit.pose.popPose();
        }
    }

    /**
     * Emits a single line segment:
     * the per-vertex normal is the normalized line direction, and a line width is applied so the
     * line shader can extrude the segment correctly.
     */
    private static void drawLine(VertexConsumer buffer, PoseStack.Pose pose, int color,
                                 float x1, float y1, float z1,
                                 float x2, float y2, float z2) {
        Vector3f normal = new Vector3f(x2 - x1, y2 - y1, z2 - z1).normalize();
        buffer.addVertex(pose, x1, y1, z1).setColor(color).setNormal(pose, normal).setLineWidth(3.0F);
        buffer.addVertex(pose, x2, y2, z2).setColor(color).setNormal(pose, normal).setLineWidth(3.0F);
    }

    public Direction getMoveDir(Direction face, double x, double y, double z) {
        Map<Double, Direction> map = Maps.newHashMap();
        if (face.getStepX() != 0) {
            fillMap(map, z, y, DOWN, UP, NORTH, SOUTH);
        } else if (face.getStepY() != 0) {
            fillMap(map, x, z, NORTH, SOUTH, WEST, EAST);
        } else if (face.getStepZ() != 0) {
            fillMap(map, x, y, DOWN, UP, WEST, EAST);
        }
        List<Double> keys = Lists.newArrayList(map.keySet());
        Collections.sort(keys);
        return map.get(keys.getFirst());
    }

    private void fillMap(Map<Double, Direction> map, double x, double y, Direction... dirs) {
        map.put(Line2D.ptLineDistSq(0, 0, 1, 0, x, y), dirs[0]);
        map.put(Line2D.ptLineDistSq(0, 1, 1, 1, x, y), dirs[1]);
        map.put(Line2D.ptLineDistSq(0, 0, 0, 1, x, y), dirs[2]);
        map.put(Line2D.ptLineDistSq(1, 0, 1, 1, x, y), dirs[3]);
    }

    public record Submit(PoseStack pose, BlockPos pos, BlockHitResult hit, Vec3 cameraRelativePos, int outlineColor, int triangleColor) implements BatchableSubmit {

        @Override
        public @NonNull Object batchKey() {
            return RenderTypes.lines();
        }

        @Override
        public @NonNull FeatureRendererType<Submit> featureType() {
            return TYPE;
        }
    }
}
