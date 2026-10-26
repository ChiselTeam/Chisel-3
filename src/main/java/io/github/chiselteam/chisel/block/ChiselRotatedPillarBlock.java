package io.github.chiselteam.chisel.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ChiselRotatedPillarBlock extends RotatedPillarBlock {
    public ChiselRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean skipRendering(@NotNull BlockState state, BlockState neighborState, @NotNull Direction direction) {
        return neighborState.is(this) || super.skipRendering(state, neighborState, direction);
    }
}
