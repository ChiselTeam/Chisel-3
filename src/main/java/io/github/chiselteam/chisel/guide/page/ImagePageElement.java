package io.github.chiselteam.chisel.guide.page;

import io.github.chiselteam.chisel.guide.manager.HandbookPaginator;
import io.github.chiselteam.chisel.guide.section.ImageSection;

public record ImagePageElement(ImageSection image) implements HandbookPageElement {
    public int imageWidth() {
        return Math.max(1, Math.round(image.width() * scale()));
    }

    public int imageHeight() {
        return Math.max(1, Math.round(image.height() * scale()));
    }

    private float scale() {
        return Math.min((float) HandbookPaginator.PAGE_CONTENT_WIDTH / image.width(), 120F / image.height());
    }

    public int height() {
        return imageHeight() + 4;
    }
}
