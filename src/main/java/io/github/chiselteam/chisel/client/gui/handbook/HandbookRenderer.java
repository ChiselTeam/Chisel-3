package io.github.chiselteam.chisel.client.gui.handbook;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.gui.BookUiTextures;
import io.github.chiselteam.chisel.guide.HandbookView;
import io.github.chiselteam.chisel.guide.manager.HandbookPaginator;
import io.github.chiselteam.chisel.guide.page.*;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;

import java.util.ArrayList;
import java.util.List;

import static io.github.chiselteam.chisel.client.gui.handbook.HandbookLayout.*;

public final class HandbookRenderer {
    private static final ResourceLocation COVER_TEXTURE = Chisel.prefix("textures/gui/handbook_cover.png");
    private static final ResourceLocation PAGES_TEXTURE = Chisel.prefix("textures/gui/handbook_pages.png");
    private static final ResourceLocation LEFT_ARROW_TEXTURE = Chisel.prefix("textures/gui/arrow_left.png");
    private static final ResourceLocation RIGHT_ARROW_TEXTURE = Chisel.prefix("textures/gui/arrow_right.png");

    private static final int COVER_TEXTURE_WIDTH = 240;
    private static final int COVER_TEXTURE_HEIGHT = 282;
    private static final int COVER_TITLE_WIDTH = 80;

    private static final int PAGES_TEXTURE_WIDTH = 480;
    private static final int PAGES_TEXTURE_HEIGHT = 288;

    private static final int ARROW_TEXTURE_WIDTH = 15;
    private static final int ARROW_TEXTURE_HEIGHT = 10;

    private static final int TEXT_COLOR = 0xFF3D3333;
    private static final int MUTED_TEXT_COLOR = 0xFF6F5A48;
    private static final int TIP_BACKGROUND_COLOR = 0x30B55945;
    private static final int BAR_BACKGROUND_COLOR = 0x406F5A48;
    private static final int BAR_FILL_COLOR = 0xFF9B7155;

    private static final int GUIDE_HOVER_COLOR = 0x30785138;
    private static final int GUIDE_HOVER_ACCENT_COLOR = 0xFF987155;

    private java.util.function.Consumer<GuiGraphics> tooltip;
    private final Font font;
    private final HandbookLayout layout;
    private final HandbookNavigation navigation;

    public HandbookRenderer(Font font, HandbookLayout layout, HandbookNavigation navigation) {
        this.font = font;
        this.layout = layout;
        this.navigation = navigation;
    }

    public void render(GuiGraphics graphics, int mouseX, int mouseY, boolean showTooltips) {
        tooltip = null;
        switch (navigation.view()) {
            case COVER -> extractCover(graphics);
            case CONTENTS, CATEGORY -> {
                extractOpenBookBackground(graphics);
                renderWidget(graphics, mouseX, mouseY, showTooltips);
            }
            case GUIDE -> {
                extractOpenBookBackground(graphics);
                extractSelectedGuide(graphics, mouseX, mouseY);
            }
        }
    }

    public void renderTooltip(GuiGraphics graphics) {
        if (tooltip != null) tooltip.accept(graphics);
    }

    private void extractCover(GuiGraphics graphics) {
        graphics.blit(COVER_TEXTURE, layout.coverX(), layout.coverY(), COVER_WIDTH, COVER_HEIGHT, 0F, 0F, COVER_TEXTURE_WIDTH, COVER_TEXTURE_HEIGHT, COVER_TEXTURE_WIDTH, COVER_TEXTURE_HEIGHT);
        graphics.flush();
        var titleLines = font.split(Component.translatable("chisel.builders_handbook.title"), COVER_TITLE_WIDTH);
        int titleY = layout.coverY() + 90 - (titleLines.size() - 1) * HandbookPaginator.LINE_HEIGHT / 2;
        extractCenteredLines(graphics, titleLines, layout.coverX() + COVER_WIDTH / 2, titleY, TEXT_COLOR);
    }

    private void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, boolean showTooltips) {
        int leftX = layout.bookLeft() + LEFT_PAGE_X + PAGE_HORIZONTAL_PADDING;
        int rightX = layout.listX();
        int pageY = layout.bookTop() + PAGE_Y;
        int hoveredRow = layout.hoveredRow(mouseX, mouseY, navigation.visibleCount());

        if (hoveredRow >= 0) {
            int rowY = layout.rowY(hoveredRow);
            graphics.fill(rightX - 2, rowY, rightX + HandbookPaginator.PAGE_CONTENT_WIDTH, rowY + LIST_ROW_HEIGHT, GUIDE_HOVER_COLOR);
            graphics.fill(rightX - 2, rowY, rightX, rowY + LIST_ROW_HEIGHT, GUIDE_HOVER_ACCENT_COLOR);
        }

        graphics.flush();

        var introduction = navigation.introduction();
        var title = introduction.title();
        var description = introduction.description();
        graphics.enableScissor(layout.toScreen(leftX), layout.toScreen(pageY), layout.toScreen(leftX + HandbookPaginator.PAGE_CONTENT_WIDTH), layout.toScreen(pageY + PAGE_HEIGHT));
        var titleLines = font.split(title, HandbookPaginator.PAGE_CONTENT_WIDTH);
        extractCenteredLines(graphics, titleLines, leftX + HandbookPaginator.PAGE_CONTENT_WIDTH / 2, pageY, TEXT_COLOR);
        extractLines(graphics, font.split(description, HandbookPaginator.PAGE_CONTENT_WIDTH), leftX, pageY + titleLines.size() * HandbookPaginator.LINE_HEIGHT + 8, TEXT_COLOR);
        graphics.disableScissor();
        extractCenteredText(graphics, Component.translatable(navigation.view() == HandbookView.CONTENTS ? "chisel.builders_handbook.contents" : "chisel.builders_handbook.guides"), rightX + HandbookPaginator.PAGE_CONTENT_WIDTH / 2, pageY, TEXT_COLOR);

        graphics.enableScissor(layout.toScreen(rightX - 2), layout.toScreen(pageY + 18), layout.toScreen(rightX + HandbookPaginator.PAGE_CONTENT_WIDTH), layout.toScreen(pageY + PAGE_HEIGHT));
        for (int row = 0; row < navigation.visibleCount(); row++) {
            var entry = navigation.entry(row);
            extractEntry(graphics, entry.title(), entry.icon(), rightX, layout.rowY(row));
        }
        if (navigation.visibleCount() == 0) {
            extractLines(graphics, font.split(Component.translatable("chisel.builders_handbook.empty"),
                    HandbookPaginator.PAGE_CONTENT_WIDTH), rightX, pageY + 18, MUTED_TEXT_COLOR);
        }
        graphics.disableScissor();

        extractArrows(graphics);
        if (hoveredRow >= 0 && showTooltips) extractEntryTooltip(graphics, hoveredRow, mouseX, mouseY);
    }

    private void extractEntryTooltip(GuiGraphics graphics, int index, int mouseX, int mouseY) {
        var entry = navigation.entry(index);
        var title = entry.title();
        var description = entry.description();

        int tooltipWidth = Math.clamp(layout.width() - 24, 1, 220);
        var lines = new ArrayList<>(font.split(title, tooltipWidth));
        if (!description.getString().isBlank()) {
            lines.addAll(font.split(description.copy().withStyle(ChatFormatting.GRAY), tooltipWidth));
        }
        tooltip = target -> target.renderTooltip(font, lines, layout.toScreen(mouseX), layout.toScreen(mouseY));
    }

    private void extractSelectedGuide(GuiGraphics graphics, int mouseX, int mouseY) {
        if (navigation.spreads().isEmpty()) return;
        var spread = navigation.spreads().get(navigation.spreadIndex());
        extractPage(graphics, spread.leftPage(), layout.bookLeft() + LEFT_PAGE_X, layout.bookTop() + PAGE_Y, mouseX, mouseY);
        extractPage(graphics, spread.rightPage(), layout.bookLeft() + RIGHT_PAGE_X, layout.bookTop() + PAGE_Y, mouseX, mouseY);
        extractPageNumbers(graphics);
        extractArrows(graphics);
    }

    private void extractEntry(GuiGraphics graphics, Component title, ResourceLocation iconId, int x, int y) {
        BuiltInRegistries.ITEM.getOptional(iconId).ifPresent(icon -> graphics.renderItem(new ItemStack(icon), x, y));
        var titleLines = font.split(title, HandbookPaginator.PAGE_CONTENT_WIDTH - 20);
        int lineY = y + 2;

        for (int c = 0; c < Math.min(titleLines.size(), 2); c++) {
            graphics.drawString(font, titleLines.get(c), x + 20, lineY, TEXT_COLOR, false);
            lineY += HandbookPaginator.LINE_HEIGHT;
        }
    }

    private void extractOpenBookBackground(GuiGraphics graphics) {
        graphics.blit(PAGES_TEXTURE, layout.bookLeft(), layout.bookTop(), BOOK_WIDTH, BOOK_HEIGHT, 0, 0, PAGES_TEXTURE_WIDTH, PAGES_TEXTURE_HEIGHT, PAGES_TEXTURE_WIDTH, PAGES_TEXTURE_HEIGHT);
        graphics.flush();
    }

    private void extractPage(GuiGraphics graphics, HandbookPage page, int x, int y, int mouseX, int mouseY) {
        int contentX = x + PAGE_HORIZONTAL_PADDING;
        int elementY = y;

        graphics.enableScissor(layout.toScreen(x), layout.toScreen(y), layout.toScreen(x + PAGE_WIDTH), layout.toScreen(y + PAGE_HEIGHT));

        for (var element : page.elements()) {
            extractElement(graphics, element, contentX, elementY, HandbookPaginator.PAGE_CONTENT_WIDTH, mouseX, mouseY);
            elementY += element.height();
        }

        graphics.disableScissor();
    }

    private void extractElement(GuiGraphics graphics, HandbookPageElement element, int x, int y, int contentWidth, int mouseX, int mouseY) {
        switch (element) {
            case CraftingRecipePageElement recipe -> extractCraftingRecipe(graphics, recipe, x, y, contentWidth, mouseX, mouseY);
            case ImagePageElement image ->
                    graphics.blit(image.image().texture(), x + (contentWidth - image.imageWidth()) / 2, y, image.imageWidth(), image.imageHeight(), 0F, 0F, image.image().width(), image.image().height(), image.image().width(), image.image().height());
            case StructurePageElement ignored -> {
            }
            case TitlePageElement titlePage ->
                    extractCenteredLines(graphics, titlePage.lines(), x + contentWidth / 2, y, TEXT_COLOR);
            case TextPageElement text -> extractLines(graphics, text.lines(), x, y, TEXT_COLOR);
            case TipPageElement tip -> extractTip(graphics, tip, x, y, contentWidth);
            case PaletteTitlePageElement paletteTitle ->
                    extractCenteredLines(graphics, paletteTitle.lines(), x + contentWidth / 2, y, TEXT_COLOR);
            case PaletteEntryPageElement paletteEntry -> extractPaletteEntry(graphics, paletteEntry, x, y, contentWidth);
        }
    }

    private void extractCraftingRecipe(GuiGraphics graphics, CraftingRecipePageElement element, int x, int y, int contentWidth, int mouseX, int mouseY) {
        var display = element.recipe().display().orElse(null);
        var level = Minecraft.getInstance().level;
        if (display == null || level == null) {
            extractLines(graphics, font.split(Component.translatable("chisel.handbook.recipe.unavailable"), contentWidth), x, y, MUTED_TEXT_COLOR);
            return;
        }
        List<Ingredient> ingredients;
        int width;
        boolean shapeless;
        if (display instanceof ShapedRecipe shaped) {
            ingredients = shaped.getIngredients();
            width = shaped.getWidth();
            shapeless = false;
        } else if (display instanceof ShapelessRecipe recipe) {
            ingredients = recipe.getIngredients();
            width = 3;
            shapeless = true;
        } else {
            return;
        }
        extractCenteredText(graphics, Component.translatable(shapeless ? "chisel.handbook.recipe.shapeless" : "chisel.handbook.recipe.shaped"), x + contentWidth / 2, y, MUTED_TEXT_COLOR);
        int gridX = x + (contentWidth - 104) / 2;
        int gridY = y + 11;
        BookUiTextures.image(graphics, BookUiTextures.CRAFTING_GRID, gridX, gridY, 64, 64);
        BookUiTextures.image(graphics, BookUiTextures.PARCHMENT, gridX + 80, gridY + 20, 24, 24);
        graphics.flush();

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                int index = row * width + column;
                var slot = column < width && index < ingredients.size() ? ingredients.get(index) : Ingredient.EMPTY;
                extractRecipeSlot(graphics, slot.getItems(), gridX + 5 + column * 18, gridY + 5 + row * 18, mouseX, mouseY);
            }
        }
        graphics.drawString(font, Component.literal("→"), gridX + 67, gridY + 27, TEXT_COLOR, false);
        extractRecipeSlot(graphics, new net.minecraft.world.item.ItemStack[]{display.getResultItem(level.registryAccess())}, gridX + 83, gridY + 23, mouseX, mouseY);
    }

    private void extractRecipeSlot(GuiGraphics graphics, net.minecraft.world.item.ItemStack[] stacks,
                                   int x, int y, int mouseX, int mouseY) {
        if (stacks.length == 0) return;
        int cycle = (int) ((net.minecraft.Util.getMillis() / 1000) % stacks.length);
        var stack = stacks[cycle];
        graphics.renderItem(stack, x + 1, y + 1);
        graphics.renderItemDecorations(font, stack, x + 1, y + 1);
        if (mouseX >= x && mouseX < x + 18 && mouseY >= y && mouseY < y + 18)
            tooltip = target -> target.renderTooltip(font, stack, layout.toScreen(mouseX), layout.toScreen(mouseY));
    }

    private void extractLines(GuiGraphics graphics, List<FormattedCharSequence> lines, int x, int y, int color) {
        for (var line : lines) {
            graphics.drawString(font, line, x, y, color, false);
            y += HandbookPaginator.LINE_HEIGHT;
        }
    }

    private void extractCenteredLines(GuiGraphics graphics, List<FormattedCharSequence> lines, int centerX, int y, int color) {
        for (var line : lines) {
            graphics.drawString(font, line, centerX - font.width(line) / 2, y, color, false);
            y += HandbookPaginator.LINE_HEIGHT;
        }
    }

    private void extractTip(GuiGraphics graphics, TipPageElement tip, int x, int y, int contentWidth) {
        graphics.fill(x, y, x + contentWidth, y + tip.height() - 2, TIP_BACKGROUND_COLOR);
        extractLines(graphics, tip.lines(), x + 4, y + 4, MUTED_TEXT_COLOR);
    }

    private void extractPaletteEntry(GuiGraphics graphics, PaletteEntryPageElement element, int x, int y, int contentWidth) {
        var block = BuiltInRegistries.BLOCK.getOptional(element.entry().block()).orElse(null);
        var name = block == null ? Component.literal(element.entry().block().toString()) : block.getName();

        if (block != null) graphics.renderItem(new ItemStack(block), x, y);

        int percentageX = x + contentWidth - font.width("100%");
        var nameLines = font.split(name, percentageX - x - 24);
        if (!nameLines.isEmpty()) graphics.drawString(font, nameLines.getFirst(), x + 18, y + 1, TEXT_COLOR, false);

        int barX = x + 19;
        int barY = y + 12;
        int barWidth = percentageX - barX - 5;
        int filledWidth = Math.round(barWidth * element.percentage() / 100F);

        graphics.fill(barX, barY, barX + barWidth, barY + 5, BAR_BACKGROUND_COLOR);
        graphics.fill(barX, barY, barX + filledWidth, barY + 5, BAR_FILL_COLOR);
        graphics.drawString(font, Component.literal("%d%%".formatted(element.percentage())), percentageX, y + 7, MUTED_TEXT_COLOR, false);
    }

    private void extractPageNumbers(GuiGraphics graphics) {
        int left = navigation.spreadIndex() * 2 + 1;
        int right = left + 1;
        int y = layout.bookTop() + PAGE_Y + PAGE_HEIGHT + 5;

        extractCenteredText(graphics, Integer.toString(left), layout.bookLeft() + LEFT_PAGE_X + PAGE_WIDTH / 2, y, MUTED_TEXT_COLOR);
        extractCenteredText(graphics, Integer.toString(right), layout.bookLeft() + RIGHT_PAGE_X + PAGE_WIDTH / 2, y, MUTED_TEXT_COLOR);
    }

    private void extractArrows(GuiGraphics graphics) {
        if (navigation.canPrevious())
            extractArrow(graphics, LEFT_ARROW_TEXTURE, layout.previousArrowX(), layout.arrowY());
        if (navigation.canNext()) extractArrow(graphics, RIGHT_ARROW_TEXTURE, layout.nextArrowX(), layout.arrowY());
    }

    private void extractArrow(GuiGraphics graphics, ResourceLocation texture, int x, int y) {
        graphics.blit(texture, x, y, ARROW_WIDTH, ARROW_HEIGHT, 0, 0, ARROW_TEXTURE_WIDTH, ARROW_TEXTURE_HEIGHT, ARROW_TEXTURE_WIDTH, ARROW_TEXTURE_HEIGHT);
    }

    private void extractCenteredText(GuiGraphics graphics, String text, int centerX, int y, int color) {
        extractCenteredText(graphics, Component.literal(text), centerX, y, color);
    }

    private void extractCenteredText(GuiGraphics graphics, Component text, int centerX, int y, int color) {
        graphics.drawString(font, text, centerX - font.width(text) / 2, y, color, false);
    }

}
