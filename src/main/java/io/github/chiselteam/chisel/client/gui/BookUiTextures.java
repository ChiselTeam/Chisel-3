package io.github.chiselteam.chisel.client.gui;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;

public final class BookUiTextures {
    public static final Identifier PARCHMENT = texture("panel_parchment_clipped");
    public static final Identifier BROWN_PANEL = texture("panel_brown_gold");
    public static final Identifier BROWN_BUTTON = texture("button_brown_gold");
    public static final Identifier FRAME = texture("frame_nested_corners");
    public static final Identifier BOOKMARK_SEAL = texture("bookmark_red_seal");
    public static final Identifier BOOKMARK_COMPASS = texture("bookmark_compass");

    private BookUiTextures() {
    }

    private static Identifier texture(String name) {
        return Chisel.prefix("textures/gui/handbook/" + name + ".png");
    }

    public static void image(GuiGraphicsExtractor graphics, Identifier texture, int x, int y, int width, int height) {
        graphics.blit(RenderPipelines.GUI_TEXTURED, texture, x, y, 0, 0, width, height, width, height);
    }

    public static void nineSlice(GuiGraphicsExtractor graphics, Identifier texture, int x, int y, int width, int height, int sourceWidth, int sourceHeight, int capX, int capY) {
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
                graphics.blit(RenderPipelines.GUI_TEXTURED, texture, targetX[column], targetY[row], sourceX[column], sourceY[row], w, h, sourceX[column + 1] - sourceX[column], sourceY[row + 1] - sourceY[row], sourceWidth, sourceHeight);
            }
        }
    }
}
