package io.github.chiselteam.chisel.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class NoParticleTorchBlock extends BaseTorchBlock {

    public static final MapCodec<NoParticleTorchBlock> CODEC = simpleCodec(NoParticleTorchBlock::new);

    public NoParticleTorchBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NonNull MapCodec<? extends BaseTorchBlock> codec() {
        return CODEC;
    }

    @Override
    protected boolean canSurvive(@NonNull BlockState state, @NonNull LevelReader level, @NonNull BlockPos pos) {
        return canSupportCenter(level, pos.below(), Direction.UP);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().canSurvive(context.getLevel(), context.getClickedPos()) ? this.defaultBlockState() : null;
    }
}
