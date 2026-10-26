package io.github.chiselteam.chisel.client.gui;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;

public final class BookUiTextures {
    public static final ResourceLocation CRAFTING_GRID = texture("crafting_grid");
    public static final ResourceLocation PARCHMENT = texture("panel_parchment_clipped");
    public static final ResourceLocation BROWN_PANEL = texture("panel_brown_gold");
    public static final ResourceLocation BROWN_BUTTON = texture("button_brown_gold");
    public static final ResourceLocation FRAME = texture("frame_nested_corners");
    public static final ResourceLocation BOOKMARK_SEAL = texture("bookmark_red_seal");
    public static final ResourceLocation BOOKMARK_COMPASS = texture("bookmark_compass");

    private BookUiTextures() {
    }

    private static ResourceLocation texture(String name) {
        return Chisel.prefix("textures/gui/handbook/" + name + ".png");
    }

    public static void image(GuiGraphics graphics, ResourceLocation texture, int x, int y, int width, int height) {
        graphics.blit(texture, x, y, 0, 0, width, height, width, height);
    }

    public static void nineSlice(GuiGraphics graphics, ResourceLocation texture, int x, int y, int width, int height, int sourceWidth, int sourceHeight, int capX, int capY) {
        if (width <= 0 || height <= 0) return;
        int dx = Math.min(capX, width / 2), dy = Math.min(capY, height / 2);
        int[] targetX = {x, x + dx, x + width - dx, x + width};
        int[] targetY = {y, y + dy, y + height - dy, y + height};
        int[] sourceX = {0, capX, sourceWidth - capX, sourceWidth};
        int[] sourceY = {0, capY, sourceHeight - capY, sourceHeight};
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                int w = targetX[column + 1] - targetX[column], h = targetY[row + 1] - targetY[row];
                if (w <= 0 || h <= 0) continue;
                graphics.blit(texture, targetX[column], targetY[row], w, h, sourceX[column], sourceY[row], sourceX[column + 1] - sourceX[column], sourceY[row + 1] - sourceY[row], sourceWidth, sourceHeight);
            }
        }
    }
}
