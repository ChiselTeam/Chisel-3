package io.github.chiselteam.chisel.client.gui.palette;

import io.github.chiselteam.chisel.client.gui.BookUiTextures;
import net.minecraft.client.gui.GuiGraphicsExtractor;

public final class PaletteTheme {
    public static final int INK = 0xFF3D3333;
    public static final int MUTED = 0xFF6F5A48;
    public static final int PARCHMENT = 0xFFF0DDB4;
    public static final int INSET = 0xFFD6BD91;
    public static final int GOLD = 0xFFB38A46;
    public static final int LEATHER = 0xFF51382B;

    private PaletteTheme() {
    }

    public static void control(GuiGraphicsExtractor graphics, int x, int y, int width, int height, boolean active, boolean highlighted) {
        if (width < 32) BookUiTextures.nineSlice(graphics, BookUiTextures.BROWN_PANEL, x, y, width, height, 48, 48, 8, 8);
        else BookUiTextures.nineSlice(graphics, BookUiTextures.BROWN_BUTTON, x, y, width, height, 48, 16, 8, 7);
        if (active && highlighted) {
            graphics.fill(x + 8, y + 1, x + width - 8, y + 2, PARCHMENT);
            graphics.fill(x + 8, y + height - 2, x + width - 8, y + height - 1, PARCHMENT);
        }
    }

    public static void panel(GuiGraphicsExtractor graphics, int x, int y, int width, int height) {
        BookUiTextures.nineSlice(graphics, BookUiTextures.PARCHMENT, x, y, width, height, 48, 48, 16, 16);
    }
}
