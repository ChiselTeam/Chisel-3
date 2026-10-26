package io.github.chiselteam.chisel.client.gui.palette;

import io.github.chiselteam.chisel.client.gui.BookUiTextures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Supplier;

public final class PaletteWallPreview extends AbstractWidget {
    private final Supplier<Map<BlockPos, BlockState>> wall;
    private final float sensitivity;
    private long lastClick;
    private float rotationX = PalettePreviewCamera.DEFAULT_PITCH, rotationY = PalettePreviewCamera.DEFAULT_YAW, zoom = 1F, panX, panY;

    public PaletteWallPreview(Supplier<Map<BlockPos, BlockState>> wall) {
        this(wall, 1F);
    }

    public PaletteWallPreview(Supplier<Map<BlockPos, BlockState>> wall, float sensitivity) {
        super(0, 0, 1, 1, Component.translatable("chisel.palette.preview"));
        this.wall = wall;
        this.sensitivity = sensitivity;
        setTooltip(Tooltip.create(Component.translatable("chisel.palette.preview_controls")));
    }

    @Override
    public void onClick(double mouseX, double mouseY) {
        long now = net.minecraft.Util.getMillis();
        boolean doubleClick = now - lastClick < 250;
        lastClick = now;
        if (doubleClick) {
            rotationX = PalettePreviewCamera.DEFAULT_PITCH;
            rotationY = PalettePreviewCamera.DEFAULT_YAW;
            zoom = 1;
            panX = 0;
            panY = 0;
        }
    }

    @Override
    protected void onDrag(double mouseX, double mouseY, double dx, double dy) {
        if (net.minecraft.client.gui.screens.Screen.hasShiftDown()) {
            panX = Math.clamp(panX + (float) dx * sensitivity, -width, width);
            panY = Math.clamp(panY + (float) dy * sensitivity, -height, height);
        } else {
            rotationY += (float) Math.toRadians(dx * 0.15 * sensitivity);
            rotationX += (float) Math.toRadians(dy * 0.15 * sensitivity);
        }
    }

    @Override
    public boolean mouseScrolled(double x, double y, double dx, double dy) {
        if (!visible || !active || !isMouseOver(x, y)) return false;
        zoom = Math.clamp(zoom + (float) dy * 0.1F * sensitivity, 0.25F, 4F);
        return true;
    }

    @Override
    protected void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        graphics.fill(getX() + 4, getY() + 4, getRight() - 4, getBottom() - 4, PaletteTheme.INSET);
        var blocks = wall.get();
        if (!blocks.isEmpty()) io.github.chiselteam.chisel.client.gui.preview.PreviewRenderer.render(graphics, new PaletteWallState(blocks, rotationX, rotationY, zoom, panX, panY, getX() + 6, getY() + 6, getRight() - 6, getBottom() - 6));
        else
            graphics.drawString(Minecraft.getInstance().font, Component.translatable("chisel.palette.preview_empty"), getX() + 4, getY() + 8, PaletteTheme.MUTED, false);
        graphics.flush();
        BookUiTextures.nineSlice(graphics, BookUiTextures.FRAME, getX(), getY(), width, height, 48, 48, 16, 16);
    }

    @Override
    protected void updateWidgetNarration(@NotNull NarrationElementOutput output) {
        defaultButtonNarrationText(output);
    }
}
