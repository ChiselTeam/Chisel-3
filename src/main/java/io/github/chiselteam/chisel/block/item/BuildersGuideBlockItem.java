package io.github.chiselteam.chisel.block.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BuildersGuideBlockItem extends BlockItem {
    public BuildersGuideBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, List<Component> builder, @NotNull TooltipFlag tooltipFlag) {
        builder.add(Component.translatable("tooltip.chisel.builders_guide.mode_desc").withStyle(ChatFormatting.GRAY));
        builder.add(Component.translatable("tooltip.chisel.builders_guide.length_desc").withStyle(ChatFormatting.GRAY));
        builder.add(Component.translatable("tooltip.chisel.builders_guide.width_desc").withStyle(ChatFormatting.GRAY));
        builder.add(Component.translatable("tooltip.chisel.builders_guide.height_desc").withStyle(ChatFormatting.GRAY));
        builder.add(Component.translatable("tooltip.chisel.builders_guide.place_desc").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, context, builder, tooltipFlag);
    }
}
