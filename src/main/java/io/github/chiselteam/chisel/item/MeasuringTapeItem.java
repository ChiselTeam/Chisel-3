package io.github.chiselteam.chisel.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class MeasuringTapeItem extends Item {

    private static final String FIRST_POS_KEY = "firstPos";
    private static final String SECOND_POS_KEY = "secondPos";
    private static final String MIDDLE_POS_KEY = "middlePos";

    public MeasuringTapeItem(Properties properties) {
        super(properties);
    }

    public static Optional<BlockPos> getFirstPosition(@NotNull ItemStack stack) {
        CompoundTag tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        return (tag.contains(FIRST_POS_KEY) ? Optional.of(BlockPos.of(tag.getLong(FIRST_POS_KEY))) : Optional.empty());
    }

    public static Optional<BlockPos> getSecondPosition(@NotNull ItemStack stack) {
        CompoundTag tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        return (tag.contains(SECOND_POS_KEY) ? Optional.of(BlockPos.of(tag.getLong(SECOND_POS_KEY))) : Optional.empty());
    }

    public static Optional<BlockPos> getMiddlePosition(@NotNull ItemStack stack) {
        CompoundTag tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        return (tag.contains(MIDDLE_POS_KEY) ? Optional.of(BlockPos.of(tag.getLong(MIDDLE_POS_KEY))) : Optional.empty());
    }

    @Override
    public @NotNull InteractionResult onItemUseFirst(@NotNull ItemStack stack, @NotNull UseOnContext context) {
        if (context.getLevel().isClientSide) {
            return InteractionResult.SUCCESS;
        }

        if (context.getPlayer() != null) {
            Player player = context.getPlayer();
            if (player.isShiftKeyDown()) {
                resetTagData(stack);
            }

            CompoundTag tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
            BlockPos clickedPos = context.getClickedPos();
            BlockPos firstPos = (tag.contains(FIRST_POS_KEY) ? Optional.of(BlockPos.of(tag.getLong(FIRST_POS_KEY))) : Optional.<BlockPos>empty()).orElse(null);
            boolean measured = tag.contains(SECOND_POS_KEY);

            if (firstPos == null || measured) {
                tag.putLong(FIRST_POS_KEY, clickedPos.asLong());
                tag.remove(SECOND_POS_KEY);
            } else if (!firstPos.equals(clickedPos)) {
                int dist = Math.max(Math.abs(firstPos.getX()-clickedPos.getX()), Math.max(Math.abs(firstPos.getY()-clickedPos.getY()), Math.abs(firstPos.getZ()-clickedPos.getZ()))) + 1;
                tag.putLong(SECOND_POS_KEY, clickedPos.asLong());
                if (dist % 2 == 1) {
                    var x = (firstPos.getX() + clickedPos.getX()) / 2;
                    var y = (firstPos.getY() + clickedPos.getY()) / 2;
                    var z = (firstPos.getZ() + clickedPos.getZ()) / 2;
                    var middle = new BlockPos(x, y, z);
                    tag.putLong(MIDDLE_POS_KEY, middle.asLong());
                }
                player.sendSystemMessage(Component.literal("%d blocks".formatted(dist)));
            }

            stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
        }
        return InteractionResult.SUCCESS;
    }

    private void resetTagData(@NotNull ItemStack stack) {
        CompoundTag tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        tag.remove(FIRST_POS_KEY);
        tag.remove(SECOND_POS_KEY);
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }
}
