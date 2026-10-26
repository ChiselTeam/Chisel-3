package io.github.chiselteam.chisel.client.gui.palette;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractContainerWidget;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.narration.NarratedElementType;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public final class PaletteEntryList extends AbstractContainerWidget {
    private double scroll;
    private boolean scrolling;
    private static final int ROW_HEIGHT = 42;
    private final Font font;
    private final PaletteDraft draft;
    private final Runnable changed, removed;
    private final List<AbstractWidget> widgets = new ArrayList<>();
    private final List<PaletteWeightSlider> sliders = new ArrayList<>();
    private final List<Integer> offsets = new ArrayList<>();

    public PaletteEntryList(Font font, PaletteDraft draft, int x, int y, int width, int height, Runnable changed, Runnable removed) {
        super(x, y, width, height, Component.translatable("chisel.palette.entry_list"));
        this.font = font;
        this.draft = draft;
        this.changed = changed;
        this.removed = removed;
        rebuild();
    }

    public void rebuild() {
        setFocused(null);
        setDragging(false);
        widgets.clear();
        sliders.clear();
        offsets.clear();
        int x = getX() + 3, w = width - scrollbarWidth() - 8;
        for (int i = 0; i < draft.value().entries().size(); i++) {
            int index = i, offset = 2 + i * ROW_HEIGHT;
            var entry = draft.value().entries().get(i);
            var block = BuiltInRegistries.BLOCK.getOptional(entry.block()).orElse(null);
            boolean available = block != null && !block.defaultBlockState().isAir() && block.asItem() != Items.AIR;
            var icon = new PaletteBlockButton(x, 0, 18, new ItemStack(available ? block.asItem() : Items.BARRIER), Component.translatable("chisel.palette.use_icon", name(entry.block())), () -> {
                draft.icon(BuiltInRegistries.ITEM.getKey(block.asItem()));
                changed.run();
            });
            icon.active = available;
            add(icon, offset);
            add(Button.builder(Component.literal("x"), unused -> {
                draft.remove(index);
                rebuild();
                changed.run();
                removed.run();
            }).bounds(x + w - 18, 0, 18, 18).tooltip(Tooltip.create(Component.translatable("chisel.palette.remove", name(entry.block())))).build(PaletteButton::new), offset);
            var slider = new PaletteWeightSlider(x, 0, w - 50, draft, index, changed);
            sliders.add(slider);
            add(slider, offset + 20);
            add(Button.builder(Component.translatable(entry.enabled() ? "chisel.palette.enabled" : "chisel.palette.disabled"), unused -> {
                draft.toggle(index);
                rebuild();
                changed.run();
            }).bounds(x + w - 48, 0, 48, 18).build(PaletteButton::new), offset + 20);
        }
        refreshScrollAmount();
    }

    private void add(AbstractWidget widget, int offset) {
        widgets.add(widget);
        offsets.add(offset);
    }

    public void refreshWeights() {
        sliders.forEach(PaletteWeightSlider::refreshMessage);
    }

    public void scrollToEnd() {
        setScrollAmount(maxScrollAmount());
    }

    public double scrollAmount() { return scroll; }
    private int scrollbarWidth() { return 6; }
    private double maxScrollAmount() { return Math.max(0, contentHeight() - height); }
    private void refreshScrollAmount() { setScrollAmount(scroll); }
    private boolean isOverScrollbar(double x, double y) { return maxScrollAmount() > 0 && x >= getRight()-7 && x < getRight() && y >= getY() && y < getBottom(); }
    private void extractScrollbar(GuiGraphics graphics, int mouseX, int mouseY) {
        if (maxScrollAmount() <= 0) return;
        int thumb = Math.max(16, height * height / contentHeight());
        int top = getY() + (int) ((height-thumb) * scroll / maxScrollAmount());
        graphics.fill(getRight()-6, getY(), getRight(), getBottom(), PaletteTheme.INSET);
        graphics.fill(getRight()-6, top, getRight(), top+thumb, PaletteTheme.MUTED);
    }
    @Override public boolean mouseReleased(double x, double y, int button) {
        scrolling = false; return super.mouseReleased(x, y, button);
    }
    private Component name(ResourceLocation id) {
        return BuiltInRegistries.BLOCK.getOptional(id).map(Block::getName).orElse(Component.literal(id.toString()));
    }

    @Override
    public @NotNull List<? extends GuiEventListener> children() {
        return widgets;
    }

    private int contentHeight() {
        return draft.value().entries().size() * ROW_HEIGHT + 4;
    }

    public void setScrollAmount(double amount) {
        scroll = Math.clamp(amount, 0, maxScrollAmount());
        for (int i = 0; i < widgets.size(); i++)
            widgets.get(i).setY(getY() + offsets.get(i) - (int) scrollAmount());
    }

    @Override
    public void setFocused(GuiEventListener listener) {
        if (listener != null && !widgets.contains(listener)) return;
        super.setFocused(listener);
        if (listener instanceof AbstractWidget widget) {
            if (widget.getY() < getY()) setScrollAmount(scrollAmount() + widget.getY() - getY());
            else if (widget.getBottom() > getBottom())
                setScrollAmount(scrollAmount() + widget.getBottom() - getBottom());
        }
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (!active || !isMouseOver(mouseX, mouseY)) return false;
        if (isOverScrollbar(mouseX, mouseY)) { setFocused(null); scrolling = true; return true; }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseScrolled(double x, double y, double dx, double dy) {
        if (!active || !isMouseOver(x, y)) return false;
        setScrollAmount(scroll - dy * 21);
        return true;
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double dx, double dy) {
        if (!active) return false;
        if (scrolling) setScrollAmount(scroll + dy * contentHeight() / Math.max(1, height));
        else super.mouseDragged(mouseX, mouseY, button, dx, dy);
        return true;
    }

    @Override
    protected void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        graphics.fill(getX(), getY(), getRight(), getBottom(), PaletteTheme.INSET);
        graphics.enableScissor(getX(), getY(), getRight() - scrollbarWidth() - 1, getBottom());
        boolean hovered = active && isMouseOver(mouseX, mouseY) && !isOverScrollbar(mouseX, mouseY);
        for (var widget : widgets)
            if (widget.getBottom() > getY() && widget.getY() < getBottom())
                widget.render(graphics, hovered ? mouseX : -1, hovered ? mouseY : -1, partialTick);
        for (int i = 0; i < draft.value().entries().size(); i++) {
            int y = getY() + 2 + i * ROW_HEIGHT - (int) scrollAmount();
            if (y + 18 <= getY() || y >= getBottom()) continue;
            var label = name(draft.value().entries().get(i).block());
            graphics.drawString(font, font.plainSubstrByWidth(label.getString(), width - scrollbarWidth() - 50), getX() + 24, y + 5, PaletteTheme.INK, false);
            if (hovered && mouseX >= getX() + 24 && mouseX < getRight() - scrollbarWidth() - 24 && mouseY >= y && mouseY < y + 18)
                graphics.renderTooltip(font, List.of(label.getVisualOrderText()), mouseX, mouseY);
        }
        graphics.disableScissor();
        extractScrollbar(graphics, mouseX, mouseY);
    }

    @Override
    protected void updateWidgetNarration(NarrationElementOutput output) {
        output.add(NarratedElementType.TITLE, getMessage());
        if (getFocused() instanceof AbstractWidget widget) widget.updateNarration(output.nest());
    }
}
