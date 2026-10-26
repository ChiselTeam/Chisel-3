package io.github.chiselteam.chisel.client.gui.palette;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class PaletteBlockButton extends Button {
    private final ItemStack icon;

    public PaletteBlockButton(int x, int y, int size, ItemStack icon, Component label, Runnable action) {
        super(x, y, size, size, label, ignored -> action.run(), DEFAULT_NARRATION);
        this.icon = icon;
        setTooltip(Tooltip.create(label));
    }

    @Override
    protected void renderWidget(@NotNull GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        PaletteTheme.control(graphics, getX(), getY(), width, height, active, isHoveredOrFocused());
        graphics.renderItem(icon, getX() + (width - 16) / 2, getY() + (height - 16) / 2);
    }
}
