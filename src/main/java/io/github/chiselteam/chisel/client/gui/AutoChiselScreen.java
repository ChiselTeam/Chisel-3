package io.github.chiselteam.chisel.client.gui;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import io.github.chiselteam.chisel.family.VariantFamilyLookup;
import io.github.chiselteam.chisel.menu.AutoChiselMenu;
import io.github.chiselteam.chisel.network.AutoChiselTemplatePacket;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.Rect2i;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class AutoChiselScreen extends AbstractContainerScreen<AutoChiselMenu> {

    private final ResourceLocation TEXTURE = Chisel.prefix("textures/gui/auto_chisel.png");
    private static final int TEXTURE_WIDTH = 256;
    private static final int TEXTURE_HEIGHT = 256;
    private static final ResourceLocation RECIPE_BOOK_TEXTURE = ResourceLocation.withDefaultNamespace("textures/gui/recipe_book.png");
    public static final WidgetSprites RECIPE_BUTTON_SPRITES = new WidgetSprites(ResourceLocation.withDefaultNamespace("recipe_book/button"), ResourceLocation.withDefaultNamespace("recipe_book/button_highlighted"));
    private static final ResourceLocation SLOT_CRAFTABLE_SPRITE = ResourceLocation.withDefaultNamespace("recipe_book/slot_craftable");
    private static final int PICKER_COLUMNS = 5;
    private static final int PICKER_ROWS = 4;
    private static final int PICKER_WIDTH = 147;
    private static final int PICKER_HEIGHT = 166;
    private final List<ItemStack> variants = new ArrayList<>();
    private final List<ItemStack> filteredVariants = new ArrayList<>();
    private EditBox searchBox;
    private ImageButton pickerToggleButton;
    private Button previousPageButton;
    private Button nextPageButton;
    private boolean pickerOpen;
    private boolean widthTooNarrow;
    private int page;
    private ItemStack observedTemplate = ItemStack.EMPTY;

    public AutoChiselScreen(AutoChiselMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
        imageWidth = 176;
        imageHeight = 200;
        inventoryLabelY = topPos + 107;
        titleLabelY = topPos + 8;
    }

    @Override
    protected void init() {
        super.init();
        widthTooNarrow = width < 379;
        leftPos = updateScreenPosition();

        pickerToggleButton = addRenderableWidget(new ImageButton(
                leftPos + 78, topPos + 7, 20, 18, RECIPE_BUTTON_SPRITES, ignored -> togglePicker()));

        searchBox = new EditBox(font, pickerLeft() + 25, pickerTop() + 16, 96, 14, Component.translatable("itemGroup.search"));
        searchBox.setMaxLength(50);
        searchBox.setResponder(this::filterVariants);
        searchBox.setHint(Component.translatable("gui.recipebook.search_hint").withStyle(net.minecraft.ChatFormatting.ITALIC));
        searchBox.setTextColor(0xFFC6C6C6);
        searchBox.setVisible(false);
        addRenderableWidget(searchBox);

        previousPageButton = Button.builder(Component.literal("<"), ignored -> changePage(-1))
                .bounds(pickerLeft() + 37, pickerTop() + 139, 20, 18).build();
        nextPageButton = Button.builder(Component.literal(">"), ignored -> changePage(1))
                .bounds(pickerLeft() + 90, pickerTop() + 139, 20, 18).build();
        previousPageButton.visible = false;
        nextPageButton.visible = false;
        addRenderableWidget(previousPageButton);
        addRenderableWidget(nextPageButton);
    }

    private void togglePicker() {
        pickerOpen = !pickerOpen;
        leftPos = updateScreenPosition();
        positionPickerWidgets();
        searchBox.setVisible(pickerOpen);
        if (pickerOpen) {
            refreshVariants();
            searchBox.setFocused(true);
        } else {
            searchBox.setFocused(false);
        }
        updatePageButtons();
    }

    private void closePicker() {
        if (pickerOpen) togglePicker();
    }

    private int pickerLeft() {
        return widthTooNarrow ? (width - PICKER_WIDTH) / 2 : leftPos - PICKER_WIDTH;
    }

    private int pickerTop() {
        return (height - PICKER_HEIGHT) / 2;
    }

    public List<Rect2i> getPickerBounds() {
        return pickerOpen ? List.of(new Rect2i(pickerLeft(), pickerTop(), PICKER_WIDTH, PICKER_HEIGHT)) : List.of();
    }

    private int updateScreenPosition() {
        return pickerOpen && !widthTooNarrow
                ? 177 + (width - imageWidth - 200) / 2
                : (width - imageWidth) / 2;
    }

    private void positionPickerWidgets() {
        pickerToggleButton.setPosition(leftPos + 78, topPos + 7);
        searchBox.setPosition(pickerLeft() + 25, pickerTop() + 13);
        previousPageButton.setPosition(pickerLeft() + 37, pickerTop() + 139);
        nextPageButton.setPosition(pickerLeft() + 90, pickerTop() + 139);
    }

    private void refreshVariants() {
        variants.clear();
        Slot templateSlot = menu.slots.get(AutoChiselBlockEntity.TEMPLATE_SLOT);
        observedTemplate = templateSlot.getItem().copy();
        if (templateSlot.getItem().getItem() instanceof BlockItem blockItem) {
            VariantFamily family = VariantFamilyLookup.getFamilyForBlock(blockItem.getBlock(),
                    Objects.requireNonNull(getMinecraft().player).level().registryAccess());
            if (family != null) {
                family.getAllVariants().forEach(variant -> {
                    if (variant.getBlock() != null && variant.getBlock().asItem() != net.minecraft.world.item.Items.AIR) {
                        variants.add(new ItemStack(variant.getBlock()));
                    }
                });
            }
        }
        filterVariants(searchBox == null ? "" : searchBox.getValue());
    }

    private void filterVariants(String query) {
        String filter = query.toLowerCase(Locale.ROOT);
        filteredVariants.clear();
        for (ItemStack stack : variants) {
            if (filter.isEmpty()) filteredVariants.add(stack);
            else if (stack.getHoverName().getString().toLowerCase(Locale.ROOT).contains(filter))
                filteredVariants.add(stack);
            else if (stack.getItem() instanceof BlockItem blockItem) {
                if (Component.translatable("%s.desc".formatted(blockItem.getDescriptionId())).getString().toLowerCase(Locale.ROOT).contains(filter))
                    filteredVariants.add(stack);
            }
        }
        page = 0;
        updatePageButtons();
    }

    private void changePage(int direction) {
        page = Math.clamp(page + direction, 0, pageCount() - 1);
        updatePageButtons();
    }

    private int pageCount() {
        return Math.max(1, (filteredVariants.size() + PICKER_COLUMNS * PICKER_ROWS - 1) / (PICKER_COLUMNS * PICKER_ROWS));
    }

    private void updatePageButtons() {
        if (previousPageButton == null) return;
        previousPageButton.visible = pickerOpen && page > 0;
        nextPageButton.visible = pickerOpen && page + 1 < pageCount();
    }

    @Override
    public void containerTick() {
        super.containerTick();
        if (pickerOpen) {
            ItemStack template = menu.slots.get(AutoChiselBlockEntity.TEMPLATE_SLOT).getItem();
            if (!ItemStack.isSameItemSameComponents(template, observedTemplate)) refreshVariants();
        }
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (pickerOpen && keyCode == GLFW.GLFW_KEY_ESCAPE) {
            closePicker();
            return true;
        }
        if (pickerOpen && searchBox.keyPressed(keyCode, scanCode, modifiers)) return true;
        if (pickerOpen && searchBox.isFocused()) return true;
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (!pickerOpen) return super.mouseClicked(mouseX, mouseY, button);
        if (pickerToggleButton.isMouseOver(mouseX, mouseY) || searchBox.isMouseOver(mouseX, mouseY)
                || previousPageButton.isMouseOver(mouseX, mouseY) || nextPageButton.isMouseOver(mouseX, mouseY)) {
            return super.mouseClicked(mouseX, mouseY, button);
        }

        int index = variantAt(mouseX, mouseY);
        if (button == 0 && index >= 0) {
            ItemStack selected = filteredVariants.get(index);
            Objects.requireNonNull(getMinecraft().getConnection()).send(new AutoChiselTemplatePacket(
                    BuiltInRegistries.BLOCK.getKey(((BlockItem) selected.getItem()).getBlock())));
            return true;
        }
        if (isOverPicker(mouseX, mouseY)) return true;
        return super.mouseClicked(mouseX, mouseY, button);
    }

    private int variantAt(double mouseX, double mouseY) {
        int x = (int) mouseX - (pickerLeft() + 11);
        int y = (int) mouseY - (pickerTop() + 32);
        if (x < 0 || y < 0 || x >= PICKER_COLUMNS * 25 || y >= PICKER_ROWS * 25) return -1;
        int column = x / 25;
        int row = y / 25;
        int index = page * PICKER_COLUMNS * PICKER_ROWS + row * PICKER_COLUMNS + column;
        return index < filteredVariants.size() ? index : -1;
    }

    private boolean isOverPicker(double mouseX, double mouseY) {
        return mouseX >= pickerLeft() && mouseX < pickerLeft() + PICKER_WIDTH
                && mouseY >= pickerTop() && mouseY < pickerTop() + PICKER_HEIGHT;
    }

    @Override
    protected void renderBg(@NotNull GuiGraphics graphics, float a, int mouseX, int mouseY) {
        graphics.blit(TEXTURE, leftPos, topPos, 0, 0, 176, 200, TEXTURE_WIDTH, TEXTURE_HEIGHT);

        // Progress arrow
        int progress = menu.getProgress();
        if (progress > 0) {
            int arrowWidth = (int) (progress * 50.0 / 100.0);
            graphics.blit(TEXTURE, leftPos + 63, topPos + 28, 176, 17, arrowWidth, 17, TEXTURE_WIDTH, TEXTURE_HEIGHT);
        }

        // Ghost preview

        if(!menu.isTemplateInvalid()) {
            Slot templateSlot = menu.slots.get(AutoChiselBlockEntity.TEMPLATE_SLOT);
            if (templateSlot.hasItem()) {
                ItemStack template = templateSlot.getItem();
                ItemStack preview = template.copy();
                preview.setCount(1);
                // Draw ghost item at output slots if they are empty
                for (int i = 0; i < 12; i++) {
                    Slot outputSlot = menu.slots.get(14 + i);
                    if (!outputSlot.hasItem()) {
                        graphics.renderItem(preview, leftPos + outputSlot.x, topPos + outputSlot.y);
                        graphics.fill(leftPos + outputSlot.x, topPos + outputSlot.y, leftPos + outputSlot.x + 16, topPos + outputSlot.y + 16, 0x88FFFFFF);
                        break;
                    }
                }
            } else {
                graphics.blit(TEXTURE, leftPos + 80, topPos + 28, 176, 34, 16, 16, TEXTURE_WIDTH, TEXTURE_HEIGHT);
            }
        }

        Slot chiselSlot = menu.slots.get(AutoChiselBlockEntity.CHISEL_SLOT);
        if (!chiselSlot.hasItem()) {
            graphics.blit(TEXTURE, leftPos + 80, topPos + 64, 176, 51, 16, 16, TEXTURE_WIDTH, TEXTURE_HEIGHT);
        }

        // Invalid Highlighting
        if (menu.isTemplateInvalid()) {
            graphics.fill(leftPos + 80, topPos + 28, leftPos + 80 + 16, topPos + 28 + 16, 0x88FF0000);
        }
        if (menu.isChiselInvalid()) {
            graphics.fill(leftPos + 80, topPos + 64, leftPos + 80 + 16, topPos + 64 + 16, 0x88FF0000);
        }

        if (pickerOpen) extractVariantPicker(graphics);
    }

    private void extractVariantPicker(GuiGraphics graphics) {
        int x = pickerLeft();
        int y = pickerTop();
        graphics.blit(RECIPE_BOOK_TEXTURE, x, y, 1, 1, PICKER_WIDTH, PICKER_HEIGHT, 256, 256);

        for (int row = 0; row < PICKER_ROWS; row++) {
            for (int column = 0; column < PICKER_COLUMNS; column++) {
                int slotX = x + 11 + column * 25;
                int slotY = y + 32 + row * 25;
                int index = page * PICKER_COLUMNS * PICKER_ROWS + row * PICKER_COLUMNS + column;
                if (index < filteredVariants.size()) {
                    graphics.blitSprite(SLOT_CRAFTABLE_SPRITE, slotX, slotY, 25, 25);
                    graphics.renderFakeItem(filteredVariants.get(index), slotX + 4, slotY + 4);
                }
            }
        }
        if (filteredVariants.isEmpty()) {
            graphics.drawString(font, Component.translatable("chisel.gui.no_variants"), x + 20, y + 78, 0xFFC6C6C6, false);
        } else if (pageCount() > 1) {
            Component pageText = Component.literal((page + 1) + "/" + pageCount());
            graphics.drawString(font, pageText, x + (PICKER_WIDTH - font.width(pageText)) / 2, y + 144, 0xFFC6C6C6, false);
        }
    }
    @Override
    public void renderLabels(@NotNull GuiGraphics graphics, int mouseX, int mouseY) {
        super.renderLabels(graphics, mouseX, mouseY);

        // Input invalid highlighting
        for (int i = 0; i < 12; i++) {
            Slot slot = menu.slots.get(i);
            if (slot.hasItem() && menu.isInputInvalid(i)) {
                graphics.fill(slot.x, slot.y, slot.x + 16, slot.y + 16, 0x88FF0000);
            }
        }
    }
}
