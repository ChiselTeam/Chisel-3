package io.github.chiselteam.chisel.client.gui.palette;
import io.github.chiselteam.chisel.client.gui.preview.PreviewGetter;
import io.github.chiselteam.chisel.client.gui.preview.PreviewRenderer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
public final class PaletteWallRenderer {
    public static void render(GuiGraphics graphics, PaletteWallState state) {
        if (state.blocks().isEmpty()) return;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, minZ = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, maxZ = Integer.MIN_VALUE;
        for (var p : state.blocks().keySet()) {
            minX = Math.min(minX, p.getX()); maxX = Math.max(maxX, p.getX());
            minY = Math.min(minY, p.getY()); maxY = Math.max(maxY, p.getY());
            minZ = Math.min(minZ, p.getZ()); maxZ = Math.max(maxZ, p.getZ());
        }
        float scale = state.zoom() * PalettePreviewCamera.fitScale(maxX-minX+1, maxY-minY+1, maxZ-minZ+1,
                state.rotationX(), state.rotationY(), state.x1()-state.x0(), state.y1()-state.y0());
        var getter = new PreviewGetter(Blocks.AIR.defaultBlockState(), new int[0][]) {
            @Override public BlockState getBlockState(BlockPos pos) { return state.blocks().getOrDefault(pos, Blocks.AIR.defaultBlockState()); }
        };
        PreviewRenderer.renderBlocks(graphics, state.blocks(), getter, state.x0(), state.y0(), state.x1(), state.y1(), scale,
                state.rotationX(), state.rotationY(), state.panX(), state.panY(), (minX+maxX+1)/2F, (minY+maxY+1)/2F, (minZ+maxZ+1)/2F);
    }
}
