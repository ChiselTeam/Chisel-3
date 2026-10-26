package io.github.chiselteam.chisel.block;

import io.github.chiselteam.chisel.weathering.WeatheringChains;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.ItemAbilities;
import org.jetbrains.annotations.NotNull;

public class WeatheringBlock extends ConnectedTextureBlock {

    public WeatheringBlock(Properties properties) {
        super(properties);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static BlockState copySharedProperties(BlockState from, BlockState to) {
        for (Property<?> prop : from.getProperties()) {
            if (to.hasProperty(prop)) {
                to = to.setValue((Property) prop, from.getValue((Property) prop));
            }
        }
        return to;
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        if (stack.is(Items.HONEYCOMB)) {
            Block waxedBlock = WeatheringChains.getWaxed(state.getBlock()).orElse(null);
            if (waxedBlock != null) {
                if (player instanceof ServerPlayer serverPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, pos, stack);
                }

                stack.shrink(1);
                level.setBlockAndUpdate(pos, copySharedProperties(state, waxedBlock.defaultBlockState()));
                level.levelEvent(player, LevelEvent.PARTICLES_AND_SOUND_WAX_ON, pos, 0);
                return ItemInteractionResult.SUCCESS;
            }
        }

        if (stack.canPerformAction(ItemAbilities.AXE_SCRAPE)) {
            Block prevBlock = WeatheringChains.getPrev(state.getBlock()).orElse(null);
            if (prevBlock != null) {
                level.setBlockAndUpdate(pos, copySharedProperties(state, prevBlock.defaultBlockState()));
                level.levelEvent(player, LevelEvent.PARTICLES_SCRAPE, pos, 0);
                stack.hurtAndBreak(1, player, hand == InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
                return ItemInteractionResult.SUCCESS;
            }
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    @Override
    public boolean isRandomlyTicking(@NotNull BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource random) {
        Block currentBlock = state.getBlock();
        Block nextBlock = WeatheringChains.getNext(currentBlock).orElse(null);
        if (nextBlock == null) return;

        float rate = WeatheringChains.getRate(currentBlock, 0.05688889F);
        if (random.nextFloat() >= rate) return;

        int currentAge = WeatheringChains.getAge(currentBlock).orElse(0);
        int sameAge = 0;
        int higherAge = 0;

        for (BlockPos nearbyPos : BlockPos.withinManhattan(pos, 4, 4, 4)) {
            int distance = nearbyPos.distManhattan(pos);
            if (distance > 4) break;
            if (nearbyPos.equals(pos)) continue;

            Block nearbyBlock = level.getBlockState(nearbyPos).getBlock();
            Integer nearbyAge = WeatheringChains.getAge(nearbyBlock).orElse(null);
            if (nearbyAge == null) continue;

            // A less-weathered block prevents this block from advancing.
            if (nearbyAge < currentAge) return;
            if (nearbyAge > currentAge) higherAge++;
            else sameAge++;
        }

        float proportion = (higherAge + 1.0F) / (higherAge + sameAge + 1.0F);
        float modifier = currentAge == 0 ? 0.75F : 1.0F;
        if (random.nextFloat() < modifier * proportion * proportion) {
            BlockState nextState = copySharedProperties(state, nextBlock.defaultBlockState());
            level.setBlock(pos, nextState, Block.UPDATE_ALL);
        }
    }
}
