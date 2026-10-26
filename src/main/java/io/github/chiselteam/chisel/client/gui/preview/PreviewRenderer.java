package io.github.chiselteam.chisel.client.gui.preview;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.data.ModelData;
import org.joml.Quaternionf;

import java.util.Map;

public final class PreviewRenderer {
    public static void render(GuiGraphics graphics, PreviewPIPState state) { PreviewPIP.render(graphics, state); }
    public static void render(GuiGraphics graphics, io.github.chiselteam.chisel.client.gui.palette.PaletteWallState state) {
        io.github.chiselteam.chisel.client.gui.palette.PaletteWallRenderer.render(graphics, state);
    }
    public static void renderBlocks(GuiGraphics graphics, Map<BlockPos, BlockState> blocks, PreviewGetter getter,
            int x0, int y0, int x1, int y1, float scale, float rotX, float rotY, float panX, float panY, float cx, float cy, float cz) {
        var minecraft = Minecraft.getInstance();
        graphics.flush();
        graphics.enableScissor(x0, y0, x1, y1);
        var pose = graphics.pose();
        pose.pushPose();
        pose.translate((x0+x1)/2F + panX, (y0+y1)/2F + panY, 200);
        pose.scale(scale, -scale, scale);
        pose.mulPose(new Quaternionf().rotateX(rotX).rotateY(rotY));
        pose.translate(-cx, -cy, -cz);
        RenderSystem.enableDepthTest();
        var dispatcher = minecraft.getBlockRenderer();
        var random = RandomSource.create(42);
        for (var cell : blocks.entrySet()) {
            var pos = cell.getKey(); var state = cell.getValue();
            var model = dispatcher.getBlockModel(state);
            var data = model.getModelData(getter, pos, state, ModelData.EMPTY);
            pose.pushPose();
            pose.translate(pos.getX(), pos.getY(), pos.getZ());
            for (var layer : model.getRenderTypes(state, random, data)) {
                var buffer = minecraft.renderBuffers().bufferSource().getBuffer(layer);
                dispatcher.getModelRenderer().tesselateBlock(getter, model, state, pos, pose, buffer, true, random, 42, OverlayTexture.NO_OVERLAY, data, layer);
            }
            pose.popPose();
        }
        minecraft.renderBuffers().bufferSource().endBatch();
        pose.popPose();
        graphics.disableScissor();
        RenderSystem.disableDepthTest();
    }
}
