package io.github.chiselteam.chisel.client.gui.palette;

import io.github.chiselteam.chisel.client.gui.BookUiTextures;
import io.github.chiselteam.chisel.palette.PaletteDefinition;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public final class PaletteCardButton extends Button {
    private final PaletteDefinition palette;

    public PaletteCardButton(Builder builder, PaletteDefinition palette) {
        super(builder);
        this.palette = palette;
    }

    @Override
    protected void renderWidget(@NotNull GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        BookUiTextures.nineSlice(graphics, BookUiTextures.BROWN_PANEL, getX(), getY(), width, height, 48, 48, 8, 8);
        if (isHoveredOrFocused()) graphics.fill(getX() + 8, getY() + 2, getRight() - 8, getY() + 3, PaletteTheme.PARCHMENT);
        graphics.fill(getX() + 8, getY() + 8, getX() + 36, getBottom() - 8, PaletteTheme.INSET);
        graphics.renderItem(new ItemStack(BuiltInRegistries.ITEM.getOptional(palette.icon()).orElse(Items.BARRIER)), getX() + 14, getY() + (height - 16) / 2);
        var font = Minecraft.getInstance().font;
        graphics.enableScissor(getX() + 42, getY() + 6, getRight() - 8, getBottom() - 6);
        graphics.drawString(font, font.plainSubstrByWidth(palette.name(), width - 50), getX() + 42, getY() + 10, PaletteTheme.PARCHMENT, false);
        graphics.drawString(font, Component.translatable("chisel.palette.card_entries", palette.entries().size()), getX() + 42, getY() + 25, 0xFFE0C69E, false);
        graphics.disableScissor();
    }
}
