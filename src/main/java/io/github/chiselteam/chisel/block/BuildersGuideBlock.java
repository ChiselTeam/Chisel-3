package io.github.chiselteam.chisel.block;

import com.mojang.serialization.MapCodec;
import io.github.chiselteam.chisel.block.entity.BuildersGuideBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BuildersGuideBlock extends BaseEntityBlock {

    public static final MapCodec<BuildersGuideBlock> CODEC = simpleCodec(BuildersGuideBlock::new);

    public BuildersGuideBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new BuildersGuideBlockEntity(pos, state);
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        var guide = (BuildersGuideBlockEntity) level.getBlockEntity(pos);
        if(guide == null) return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
        if(guide.getGhostBlocks().isEmpty()) return super.useItemOn(stack, state, level, pos, player, hand, hitResult);

        if(stack.getItem() instanceof DyeItem) {
            var dye = stack.getItem() instanceof DyeItem item ? item.getDyeColor() : null;
            guide.setColor(dye);
            if(!player.isCreative()) stack.shrink(1);
            player.swing(hand);
            return ItemInteractionResult.CONSUME;
        }

        if(stack.getItem() instanceof BlockItem blockItem) {
            var block = blockItem.getBlock();
            guide.placeBlock(block);
            if(!player.isCreative()) stack.shrink(1);
            player.swing(hand);
            return ItemInteractionResult.CONSUME;
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    protected @NotNull net.minecraft.world.InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        var entity = level.getBlockEntity(pos);
        if(entity == null) return super.useWithoutItem(state, level, pos, player, hitResult);

        if(entity instanceof BuildersGuideBlockEntity guide) {
            if(player.isShiftKeyDown()) {
                guide.cycleBuildingMode();
                player.displayClientMessage(Component.translatable("chisel.builders_guide.mode_changed").append(" ").append(guide.getBuildingMode().getDescription()), true);
            } else {
                switch(hitResult.getDirection()) {
                    case NORTH -> guide.increaseLength();
                    case SOUTH -> guide.decreaseLength();
                    case EAST -> guide.increaseWidth();
                    case WEST -> guide.decreaseWidth();
                    case DOWN -> guide.decreaseHeight();
                    case UP -> guide.increaseHeight();
                }
                player.displayClientMessage(Component.translatable("chisel.builders_guide.size_changed")
                        .append(" ")
                        .append("%d".formatted(guide.getLength()))
                        .append("x")
                        .append("%d".formatted(guide.getWidth()))
                        .append("x")
                        .append("%d".formatted(guide.getHeight()))
                , true);
            }
        }

        return super.useWithoutItem(state, level, pos, player, hitResult);
    }
}
