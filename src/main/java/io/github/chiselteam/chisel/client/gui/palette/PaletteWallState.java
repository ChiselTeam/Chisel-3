package io.github.chiselteam.chisel.client.gui.palette;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

public record PaletteWallState(Map<BlockPos, BlockState> blocks, float rotationX, float rotationY, float zoom,
                               float panX, float panY, int x0, int y0, int x1,
                               int y1) {
    public PaletteWallState { blocks = Map.copyOf(blocks); }


}
