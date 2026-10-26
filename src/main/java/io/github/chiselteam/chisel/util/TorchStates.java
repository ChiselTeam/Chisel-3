package io.github.chiselteam.chisel.util;

import io.github.chiselteam.chisel.block.item.TorchBlockItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.Nullable;

public final class TorchStates {
    private TorchStates() {
    }

    public static Block standingBlock(Block block) {
        if (block == Blocks.WALL_TORCH) return Blocks.TORCH;
        if (block.asItem() instanceof TorchBlockItem item) return item.getBlock();
        return block;
    }

    public static @Nullable Block wallBlock(Block block) {
        if (block == Blocks.TORCH || block == Blocks.WALL_TORCH) return Blocks.WALL_TORCH;
        if (block.asItem() instanceof TorchBlockItem item) return item.getWallBlock();
        return null;
    }

    public static boolean isTorch(Block block) {
        return wallBlock(block) != null;
    }

    public static @Nullable BlockState replacement(LevelReader level, BlockPos pos, BlockState current, BlockState requested) {
        if (!isTorch(current.getBlock())) return requested;

        var standing = standingBlock(requested.getBlock());
        var wall = wallBlock(standing);
        if (wall == null) return null;

        var result = current.getBlock() != standingBlock(current.getBlock())
                ? wall.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, current.getValue(BlockStateProperties.HORIZONTAL_FACING))
                : standing.defaultBlockState();
        return result.canSurvive(level, pos) ? result : null;
    }
}
