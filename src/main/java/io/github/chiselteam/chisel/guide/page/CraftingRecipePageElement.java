package io.github.chiselteam.chisel.guide.page;

import io.github.chiselteam.chisel.guide.section.CraftingRecipeSection;

public record CraftingRecipePageElement(CraftingRecipeSection recipe) implements HandbookPageElement {
    @Override
    public int height() {
        return 82;
    }
}
