package io.github.chiselteam.chisel.block;

import io.github.chiselteam.chisel.weathering.WeatheringChains;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.ItemAbilities;
import org.jetbrains.annotations.NotNull;

public class WaxedWeatheringBlock extends ConnectedTextureBlock {
    public WaxedWeatheringBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        if (stack.canPerformAction(ItemAbilities.AXE_SCRAPE)) {
            Block unwaxedBlock = WeatheringChains.getUnwaxed(state.getBlock()).orElse(null);
            if (unwaxedBlock != null) {
                level.setBlockAndUpdate(pos, WeatheringBlock.copySharedProperties(state, unwaxedBlock.defaultBlockState()));
                level.levelEvent(player, LevelEvent.PARTICLES_WAX_OFF, pos, 0);
                stack.hurtAndBreak(1, player, hand == InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
                return ItemInteractionResult.SUCCESS;
            }
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    @Override
    public boolean isRandomlyTicking(@NotNull BlockState state) {
        return false;
    }
}
