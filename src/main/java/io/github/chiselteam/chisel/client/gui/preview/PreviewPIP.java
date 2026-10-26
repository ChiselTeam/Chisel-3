package io.github.chiselteam.chisel.client.gui.preview;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;

import java.util.LinkedHashMap;

public final class PreviewPIP {
    public static void render(GuiGraphics graphics, PreviewPIPState state) {
        var getter = new PreviewGetter(state.blockState(), state.positions());
        var blocks = new LinkedHashMap<BlockPos, net.minecraft.world.level.block.state.BlockState>();
        for (var p : state.positions()) { var pos = new BlockPos(p[0], p[1], p[2]); blocks.put(pos, getter.getBlockState(pos)); }
        PreviewRenderer.renderBlocks(graphics, blocks, getter, state.x0(), state.y0(), state.x1(), state.y1(),
                30 * state.zoom() * state.previewScale(), state.rotX(), state.rotY(), 0, 0, state.centerX(), state.centerY(), 0.5F);
    }
}
