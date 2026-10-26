package io.github.chiselteam.chisel.client.gui.preview;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PreviewGetter implements BlockAndTintGetter {

    private final BlockState state;
    private final Set<BlockPos> positions;

    public PreviewGetter(BlockState state, int[][] positions) {
        this.state = state;
        this.positions = new HashSet<>();
        Arrays.stream(positions).map(position -> new BlockPos(position[0], position[1], position[2])).forEach(this.positions::add);
    }

    public BlockState getState() {
        return state;
    }

    @Override
    public float getShade(net.minecraft.core.Direction direction, boolean shade) {
        if (!shade) return 1.0F;
        return switch (direction) { case DOWN -> 0.5F; case UP -> 1F; case NORTH, SOUTH -> 0.8F; case WEST, EAST -> 0.6F; };
    }

    @Override
    public int getBlockTint(@NotNull BlockPos pos, @NotNull ColorResolver color) {
        var minecraft = Minecraft.getInstance();
        if (minecraft.level != null) {
            var origin = minecraft.player != null ? minecraft.player.blockPosition() : BlockPos.ZERO;
            return minecraft.level.getBlockTint(origin.offset(pos), color);
        }
        if (color == BiomeColors.WATER_COLOR_RESOLVER) return 0x3F76E4;
        if (color == BiomeColors.FOLIAGE_COLOR_RESOLVER) return net.minecraft.world.level.FoliageColor.getDefaultColor();
        return 0x7CBD6B;
    }

    @Override
    public @NotNull LevelLightEngine getLightEngine() {
        return java.util.Objects.requireNonNull(Minecraft.getInstance().level).getLightEngine();
    }

    @Override
    public int getBrightness(net.minecraft.world.level.LightLayer layer, BlockPos pos) { return 15;
    }

    @Override
    public int getRawBrightness(BlockPos pos, int skyDarken) { return 15;
    }

    @Override
    public @Nullable BlockEntity getBlockEntity(@NotNull BlockPos pos) {
        return null;
    }

    @Override
    public @NotNull BlockState getBlockState(@NotNull BlockPos pos) {
        if (!positions.contains(pos)) return Blocks.AIR.defaultBlockState();

        if (state.getBlock() instanceof IronBarsBlock) {
            return state.setValue(IronBarsBlock.NORTH, positions.contains(pos.north()))
                    .setValue(IronBarsBlock.EAST, positions.contains(pos.east()))
                    .setValue(IronBarsBlock.SOUTH, positions.contains(pos.south()))
                    .setValue(IronBarsBlock.WEST, positions.contains(pos.west()));
        }
        return state;
    }

    @Override
    public @NotNull FluidState getFluidState(@NotNull BlockPos pos) {
        return getBlockState(pos).getFluidState();
    }

    @Override
    public int getHeight() {
        return 256;
    }

    @Override
    public int getMinBuildHeight() {
        return 0;
    }
}
