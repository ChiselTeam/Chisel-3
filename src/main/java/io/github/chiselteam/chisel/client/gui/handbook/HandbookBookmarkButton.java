package io.github.chiselteam.chisel.client.gui.handbook;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

public final class HandbookBookmarkButton extends Button {
    private final Identifier texture;

    public HandbookBookmarkButton(Builder builder, Identifier texture) {
        super(builder);
        this.texture = texture;
    }

    @Override
    protected void extractContents(@NonNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        graphics.blit(RenderPipelines.GUI_TEXTURED, texture, getX(), getY(), 0, 0, getWidth(), getHeight(), 16, 32, 16, 32);
        if (isHoveredOrFocused()) graphics.fill(getX() + 2, getBottom() - 1, getRight() - 2, getBottom(), 0xFFFFE1A6);
    }
}
