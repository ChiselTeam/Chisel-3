package io.github.chiselteam.chisel.client.gui.handbook;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public final class HandbookBookmarkButton extends Button {
    private final ResourceLocation texture;

    public HandbookBookmarkButton(Builder builder, ResourceLocation texture) {
        super(builder);
        this.texture = texture;
    }

    @Override
    protected void renderWidget(@NotNull GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        graphics.blit(texture, getX(), getY(), getWidth(), getHeight(), 0, 0, 16, 32, 16, 32);
        if (isHoveredOrFocused()) graphics.fill(getX() + 2, getBottom() - 1, getRight() - 2, getBottom(), 0xFFFFE1A6);
    }
}
