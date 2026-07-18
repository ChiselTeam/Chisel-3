package io.github.chiselteam.chisel.block;

import io.github.chiselteam.chisel.core.weathering.WeatheringChains;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import org.jspecify.annotations.NonNull;

public class WeatheringBlock extends Block {

    public WeatheringBlock(Properties properties) {
        super(properties);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static BlockState copySharedProperties(BlockState from, BlockState to) {
        for (Property<?> prop : from.getProperties()) {
            if (to.hasProperty(prop)) {
                to = to.setValue((Property) prop, from.getValue((Property) prop));
            }
        }
        return to;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringChains.getNext(state.getBlock()).isPresent();
    }

    @Override
    public void randomTick(BlockState state, @NonNull ServerLevel level, @NonNull BlockPos pos, @NonNull RandomSource random) {
        WeatheringChains.reloadFrom(level.registryAccess());
        WeatheringChains.getNext(state.getBlock()).ifPresent(nextBlock -> {
            float rate = WeatheringChains.getRate(state.getBlock(), 0.25f);
            if (random.nextFloat() < rate) {
                BlockState nextState = copySharedProperties(state, nextBlock.defaultBlockState());
                level.setBlock(pos, nextState, Block.UPDATE_ALL);
            }
        });
    }
}
