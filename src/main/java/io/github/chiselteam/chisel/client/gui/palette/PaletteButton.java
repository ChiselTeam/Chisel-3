package io.github.chiselteam.chisel.client.gui.palette;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import org.jetbrains.annotations.NotNull;

public final class PaletteButton extends Button {
    public PaletteButton(Builder builder) {
        super(builder);
    }

    @Override
    protected void renderWidget(@NotNull GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        PaletteTheme.control(graphics, getX(), getY(), width, height, active, isHoveredOrFocused());
        renderString(graphics, net.minecraft.client.Minecraft.getInstance().font, active ? PaletteTheme.INK : PaletteTheme.MUTED);
    }
}
