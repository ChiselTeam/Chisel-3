package io.github.chiselteam.chisel.client.gui.palette;

import io.github.chiselteam.chisel.client.gui.BookUiTextures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;

import java.util.Map;
import java.util.function.Supplier;

public final class PaletteWallPreview extends AbstractWidget {
    private final Supplier<Map<BlockPos, BlockState>> wall;
    private final float sensitivity;
    private float rotationX = 0.06F, rotationY = -0.18F, zoom = 1F, panX, panY;

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
    public void onClick(@NonNull MouseButtonEvent event, boolean doubleClick) {
        if (doubleClick) {
            rotationX = 0.06F;
            rotationY = -0.18F;
            zoom = 1;
            panX = 0;
            panY = 0;
        }
    }

    @Override
    protected void onDrag(@NonNull MouseButtonEvent event, double dx, double dy) {
        if (Minecraft.getInstance().hasShiftDown()) {
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
    protected void extractWidgetRenderState(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        graphics.fill(getX() + 4, getY() + 4, getRight() - 4, getBottom() - 4, PaletteTheme.INSET);
        var blocks = wall.get();
        if (!blocks.isEmpty()) graphics.submitPictureInPictureRenderState(new PaletteWallState(blocks, rotationX, rotationY, zoom, panX, panY, getX() + 6, getY() + 6, getRight() - 6, getBottom() - 6));
        else
            graphics.text(Minecraft.getInstance().font, Component.translatable("chisel.palette.preview_empty"), getX() + 4, getY() + 8, PaletteTheme.MUTED, false);
        graphics.nextStratum();
        BookUiTextures.nineSlice(graphics, BookUiTextures.FRAME, getX(), getY(), width, height, 48, 48, 16, 16);
    }

    @Override
    protected void updateWidgetNarration(@NonNull NarrationElementOutput output) {
        defaultButtonNarrationText(output);
    }
}
