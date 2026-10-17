package io.github.chiselteam.chisel.guide.page;

import io.github.chiselteam.chisel.guide.section.StructureSection;

public record StructurePageElement(StructureSection structure) implements HandbookPageElement {
    public int height() {
        return 94;
    }
}
