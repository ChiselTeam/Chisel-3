package io.github.chiselteam.chisel.client.gui.handbook;

import io.github.chiselteam.chisel.client.gui.BookUiTextures;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
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
        BookUiTextures.image(graphics, texture, getX(), getY(), 16, 32);
        if (isHoveredOrFocused()) graphics.fill(getX() + 2, getBottom() - 1, getRight() - 2, getBottom(), 0xFFFFE1A6);
    }
}
