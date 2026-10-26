package io.github.chiselteam.chisel.client.gui.preview;

import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public record PreviewPIPState(BlockState blockState, int[][] positions, float rotX, float rotY, float zoom, float previewScale, float centerX, float centerY, int x0, int y0, int x1, int y1, @Nullable ScreenRectangle scissorArea) {

}
