package io.github.chiselteam.chisel.client.gui;

import io.github.chiselteam.chisel.client.gui.handbook.*;
import io.github.chiselteam.chisel.client.gui.palette.PaletteWallPreview;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.HandbookView;
import io.github.chiselteam.chisel.guide.manager.ClientHandbookManager;
import io.github.chiselteam.chisel.guide.manager.HandbookPaginator;
import io.github.chiselteam.chisel.guide.page.HandbookPage;
import io.github.chiselteam.chisel.guide.page.HandbookSpread;
import io.github.chiselteam.chisel.guide.page.StructurePageElement;
import io.github.chiselteam.chisel.guide.section.StructureSection;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static io.github.chiselteam.chisel.client.gui.handbook.HandbookLayout.*;

public class BuildersHandbookScreen extends Screen {
    private final HandbookNavigation navigation = new HandbookNavigation();
    private HandbookLayout layout;
    private HandbookRenderer renderer;
    private final List<PaletteWallPreview> structurePreviews = new ArrayList<>();
    private HandbookSpread shownSpread;
    private Button bookmark;
    private Button readBookmark;

    public BuildersHandbookScreen() {
        super(Component.translatable("chisel.builders_handbook.title"));
    }

    @Override
    protected void init() {
        super.init();
        layout = new HandbookLayout(width, height);
        renderer = new HandbookRenderer(font, layout, navigation);
        navigation.refresh(ClientHandbookManager.getSnapshot(), this::paginate);
        shownSpread = null;
        structurePreviews.clear();
        bookmark = addRenderableWidget(Button.builder(Component.translatable("chisel.handbook.bookmark.save"), button -> {
            if (navigation.guideId() != null && HandbookBookmark.save(navigation.guideId(), navigation.spreadIndex())) {
                button.setMessage(Component.translatable("chisel.handbook.bookmark.saved"));
                button.setTooltip(Tooltip.create(button.getMessage()));
            }
        }).bounds(layout.bookLeft() + 258, Math.max(0, layout.bookTop() - 14), 16, 32).tooltip(Tooltip.create(Component.translatable("chisel.handbook.bookmark.save"))).build(builder -> new HandbookBookmarkButton(builder, BookUiTextures.BOOKMARK_SEAL)));
        readBookmark = addRenderableWidget(Button.builder(Component.translatable("chisel.handbook.bookmark.open"), button -> {
            var saved = HandbookBookmark.load();
            button.setTooltip(Tooltip.create(Component.translatable("chisel.handbook.bookmark.open")));
            try {
                var id = Identifier.tryParse(saved.getProperty("guide", ""));
                if (id == null || !navigation.openBookmark(id, Integer.parseInt(saved.getProperty("spread", "0")), this::paginate))
                    button.setTooltip(Tooltip.create(Component.translatable("chisel.handbook.bookmark.missing")));
            } catch (NumberFormatException error) {
                button.setTooltip(Tooltip.create(Component.translatable("chisel.handbook.bookmark.missing")));
            }
        }).bounds(layout.bookLeft() + 280, Math.max(0, layout.bookTop() - 14), 16, 32).tooltip(Tooltip.create(Component.translatable("chisel.handbook.bookmark.open"))).build(builder -> new HandbookBookmarkButton(builder, BookUiTextures.BOOKMARK_COMPASS)));
        readBookmark.visible = navigation.view() != HandbookView.COVER;
        readBookmark.active = readBookmark.visible;
        bookmark.active = navigation.guideId() != null;
        bookmark.visible = bookmark.active;
    }

    @Override
    public void tick() {
        super.tick();
        if (navigation.revision() != ClientHandbookManager.getRevision()) {
            navigation.refresh(ClientHandbookManager.getSnapshot(), this::paginate);
        }
    }

    private List<HandbookSpread> paginate(HandbookGuide guide) {
        return HandbookPaginator.paginate(guide, font);
    }

    @Override
    public void extractRenderState(@NonNull GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTick) {
        syncPreviews();
        renderer.render(graphics, mouseX, mouseY, getMinecraft().hasShiftDown());
        graphics.nextStratum();
        super.extractRenderState(graphics, mouseX, mouseY, partialTick);
    }

    private void syncPreviews() {
        readBookmark.visible = navigation.view() != HandbookView.COVER;
        readBookmark.active = readBookmark.visible;
        bookmark.active = navigation.guideId() != null;
        bookmark.visible = bookmark.active;
        var spread = navigation.view() == HandbookView.GUIDE && !navigation.spreads().isEmpty() ? navigation.spreads().get(navigation.spreadIndex()) : null;
        if (spread == shownSpread) return;
        if (structurePreviews.contains(getFocused())) {
            setFocused(null);
            setDragging(false);
        }
        structurePreviews.forEach(this::removeWidget);
        structurePreviews.clear();
        shownSpread = spread;
        bookmark.setMessage(Component.translatable("chisel.handbook.bookmark.save"));
        bookmark.setTooltip(Tooltip.create(bookmark.getMessage()));
        if (spread == null) return;
        addPreviews(spread.leftPage(), layout.bookLeft() + LEFT_PAGE_X + PAGE_HORIZONTAL_PADDING);
        addPreviews(spread.rightPage(), layout.bookLeft() + RIGHT_PAGE_X + PAGE_HORIZONTAL_PADDING);
    }

    private void addPreviews(HandbookPage page, int x) {
        int y = layout.bookTop() + PAGE_Y;
        for (var element : page.elements()) {
            if (element instanceof StructurePageElement(StructureSection section)) {
                var blocks = new LinkedHashMap<BlockPos, BlockState>();
                section.blocks().forEach(cell -> blocks.put(cell.pos(), cell.state()));
                var preview = new PaletteWallPreview(() -> blocks, 1.5F);
                preview.setX(x);
                preview.setY(y);
                preview.setWidth(HandbookPaginator.PAGE_CONTENT_WIDTH);
                preview.setHeight(element.height() - 4);
                structurePreviews.add(addRenderableWidget(preview));
            }
            y += element.height();
        }
    }

    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubleClick) {
        if (event.button() != 0) return super.mouseClicked(event, doubleClick);
        if (navigation.view() == HandbookView.COVER && layout.onCover(event.x(), event.y())) {
            navigation.open();
            return true;
        }
        if (navigation.canPrevious() && layout.onPrevious(event.x(), event.y())) {
            navigation.previous();
            return true;
        }
        if (navigation.canNext() && layout.onNext(event.x(), event.y())) {
            navigation.next();
            return true;
        }
        int row = layout.hoveredRow(event.x(), event.y(), navigation.visibleCount());
        if (row >= 0) {
            navigation.selectRow(row, this::paginate);
            return true;
        }
        return super.mouseClicked(event, doubleClick);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
