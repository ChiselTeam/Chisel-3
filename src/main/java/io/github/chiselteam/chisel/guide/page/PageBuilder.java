package io.github.chiselteam.chisel.guide.page;

import io.github.chiselteam.chisel.guide.manager.HandbookPaginator;
import net.minecraft.util.FormattedCharSequence;

import java.util.ArrayList;
import java.util.List;

public class PageBuilder {
    private final List<HandbookPage> pages = new ArrayList<>();
    private final List<HandbookPageElement> currentElements = new ArrayList<>();
    private int usedHeight;

    public void add(HandbookPageElement element) {
        if (!currentElements.isEmpty() && element.height() > getRemainingHeight()) createNewPage();
        currentElements.add(element);
        usedHeight += element.height();
    }

    public void addText(List<FormattedCharSequence> lines, boolean tip) {
        if (lines.isEmpty()) return;
        if (tip) {
            var element = new TipPageElement(List.copyOf(lines));

            if (element.height() <= HandbookPaginator.PAGE_CONTENT_HEIGHT) {
                add(element);
                return;
            }
        }
        int padding = tip ? 10 : 4;
        int index = 0;

        while (index < lines.size()) {
            int availableLines = (getRemainingHeight() - padding) / HandbookPaginator.LINE_HEIGHT;

            if (availableLines <= 0) {
                createNewPage();
                continue;
            }

            int end = Math.min(lines.size(), index + availableLines);
            var pageLines = List.copyOf(lines.subList(index, end));
            add(tip ? new TipPageElement(pageLines) : new TextPageElement(pageLines));
            index = end;
        }
    }

    public void createNewPage() {
        if (!currentElements.isEmpty()) pages.add(new HandbookPage(List.copyOf(currentElements)));
        currentElements.clear();
        usedHeight = 0;
    }

    public int getRemainingHeight() {
        return HandbookPaginator.PAGE_CONTENT_HEIGHT - usedHeight;
    }

    public List<HandbookPage> finish() {
        createNewPage();
        if (pages.isEmpty()) pages.add(HandbookPage.EMPTY);
        return pages;
    }
}
