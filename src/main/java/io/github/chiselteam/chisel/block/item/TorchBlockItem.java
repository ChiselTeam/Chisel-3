package io.github.chiselteam.chisel.block.item;

import io.github.chiselteam.chisel.api.family.Variant;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TorchBlockItem extends StandingAndWallBlockItem {

    private final Variant variant;

    public TorchBlockItem(Variant variant, Block block, Block wallBlock, Properties properties) {
        super(block, wallBlock, properties, Direction.DOWN);
        this.variant = variant;
    }

    public Block getWallBlock() {
        return wallBlock;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> builder, @NotNull TooltipFlag flag) {
        builder.add(Component.translatable(variant.getTranslationKey()).withStyle(ChatFormatting.GRAY));
    }
}
