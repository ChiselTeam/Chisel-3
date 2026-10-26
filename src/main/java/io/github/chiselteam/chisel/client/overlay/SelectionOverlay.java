package io.github.chiselteam.chisel.client.overlay;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

public final class SelectionOverlay {
    private static final int ROW_HEIGHT = 20;
    private static final int PADDING = 6;
    private static final int ICON_WIDTH = 20;
    private static final int SELECTED_BACKGROUND = 0xA0000000;
    private static final int SELECTED_TEXT = 0xFFFFFFFF;
    private static final int INACTIVE_TEXT = 0xFFAAAAAA;

    public static void render(GuiGraphics graphics, SelectionOverlayState state) {
        if (state.entries().isEmpty()) return;
        var font = Minecraft.getInstance().font;
        boolean hasIcons = state.entries().stream().anyMatch(entry -> !entry.icon().isEmpty());
        int iconWidth = hasIcons ? ICON_WIDTH : 0;
        int width = state.entries().stream().mapToInt(entry -> font.width(entry.label())).max().orElse(0) + PADDING * 2 + iconWidth;
        int x = graphics.guiWidth() / 2 + 24;
        width = Math.min(width, graphics.guiWidth() - x - PADDING);
        if (width <= PADDING * 2 + iconWidth) return;
        int selectedY = graphics.guiHeight() / 2 - ROW_HEIGHT / 2;
        graphics.fill(x, selectedY, x + width, selectedY + ROW_HEIGHT, SELECTED_BACKGROUND);

        float progress = Math.clamp(state.animationProgress(), 0.0F, 1.0F);
        int direction = state.animationDirection();
        float inverse = 1.0F - progress;
        float eased = 1.0F - inverse * inverse * inverse;
        boolean animating = direction != 0 && progress < 1.0F;
        float offset = animating ? direction * ROW_HEIGHT * (1.0F - eased) : 0;

        graphics.enableScissor(x, selectedY - ROW_HEIGHT, x + width, selectedY + ROW_HEIGHT * 2);
        try {
            int start = state.entries().size() == 1 ? 0 : animating ? -2 : -1;
            int end = state.entries().size() == 1 ? 0 : animating ? 2 : 1;
            for (int relative = start; relative <= end; relative++) {
                float alpha = 1.0F;
                if (animating) {
                    if (direction > 0 && relative == -1 || direction < 0 && relative == 1) alpha = eased;
                    if (direction > 0 && relative == 2 || direction < 0 && relative == -2) alpha = 1.0F - eased;
                }
                var entry = state.entries().get(Math.floorMod(state.selectedIndex() + relative, state.entries().size()));
                drawEntry(graphics, font, entry, x, selectedY + relative * ROW_HEIGHT + offset, width, iconWidth, relative == 0 ? SELECTED_TEXT : INACTIVE_TEXT, alpha);
            }
        } finally {
            graphics.disableScissor();
        }
    }

    private static void drawEntry(GuiGraphics graphics, Font font, SelectionOverlayEntry entry,
                                  int x, float y, int width, int iconWidth, int rgb, float alpha) {
        if (alpha <= 0.0F) return;
        if (!entry.icon().isEmpty()) graphics.renderItem(entry.icon(), x + PADDING, Math.round(y + 2));
        int availableWidth = width - PADDING * 2 - iconWidth;
        var label = entry.label();
        if (font.width(label) > availableWidth) {
            label = Component.literal(font.plainSubstrByWidth(label.getString(), Math.max(0, availableWidth - font.width("…"))) + "…");
        }
        int textX = iconWidth > 0 ? x + PADDING + iconWidth : x + (width - font.width(label)) / 2;
        int textY = Math.round(y + (ROW_HEIGHT - font.lineHeight) / 2.0F);
        int color = Math.round(255.0F * alpha) << 24 | rgb & 0x00FFFFFF;
        graphics.drawStringWithBackdrop(font, label, textX, textY, width, color);
    }
}
