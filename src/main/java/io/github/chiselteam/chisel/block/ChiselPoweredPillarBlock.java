package io.github.chiselteam.chisel.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ChiselPoweredPillarBlock extends ChiselRotatedPillarBlock {
    public ChiselPoweredPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean isSignalSource(@NotNull BlockState state) {
        return true;
    }

    @Override
    protected int getSignal(@NotNull BlockState state, @NotNull BlockGetter level, net.minecraft.core.@NotNull BlockPos pos, @NotNull Direction direction) {
        return 15;
    }
}
