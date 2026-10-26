package io.github.chiselteam.chisel.datagen.guide;

import io.github.chiselteam.chisel.guide.HandbookCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.Objects;

public final class HandbookCategoryBuilder {
    public static HandbookCategoryBuilder builder(Component title, ResourceLocation icon) {
        return new HandbookCategoryBuilder(title, icon);
    }

    private final Component title;
    private final ResourceLocation icon;
    private Component description = Component.empty();
    private int sortOrder;

    public HandbookCategoryBuilder(Component title, ResourceLocation icon) {
        this.title = Objects.requireNonNull(title, "Category title cannot be null");
        this.icon = Objects.requireNonNull(icon, "Category icon cannot be null");
        if (title.getString().isBlank()) throw new IllegalArgumentException("Category title must not be empty");
    }

    public HandbookCategoryBuilder description(Component description) {
        this.description = Objects.requireNonNull(description, "Category description cannot be null");
        return this;
    }

    public HandbookCategoryBuilder sortOrder(int sortOrder) {
        if (sortOrder < 0) throw new IllegalArgumentException("Category sort order must be zero or greater");
        this.sortOrder = sortOrder;
        return this;
    }

    public HandbookCategory build() {
        return new HandbookCategory(title, description, icon, sortOrder);
    }
}
