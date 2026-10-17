package io.github.chiselteam.chisel.client.gui.palette;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import org.jspecify.annotations.NonNull;

public final class PaletteButton extends Button {
    public PaletteButton(Builder builder) {
        super(builder);
    }

    @Override
    protected void extractContents(@NonNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        PaletteTheme.control(graphics, getX(), getY(), width, height, active, isHoveredOrFocused());
        extractDefaultLabel(graphics.textRendererForWidget(this, GuiGraphicsExtractor.HoveredTextEffects.NONE));
    }
}
