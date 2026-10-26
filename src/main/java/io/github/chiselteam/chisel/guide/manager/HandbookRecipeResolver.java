package io.github.chiselteam.chisel.guide.manager;

import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.section.CraftingRecipeSection;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;

import java.util.LinkedHashMap;
import java.util.Map;

public final class HandbookRecipeResolver {
    private HandbookRecipeResolver() {
    }

    public static Map<ResourceLocation, HandbookGuide> resolve(Map<ResourceLocation, HandbookGuide> guides, RecipeManager recipes) {
        var resolved = new LinkedHashMap<ResourceLocation, HandbookGuide>();
        guides.forEach((id, guide) -> {
            var sections = guide.sections().stream().map(section -> {
                if (!(section instanceof CraftingRecipeSection crafting)) return section;
                var display = recipes.byKey(crafting.recipe()).<net.minecraft.world.item.crafting.Recipe<?>>map(holder -> holder.value())
                        .filter(candidate -> candidate instanceof ShapedRecipe shaped
                                && shaped.getWidth() >= 1 && shaped.getWidth() <= 3 && shaped.getHeight() >= 1 && shaped.getHeight() <= 3
                                || candidate instanceof ShapelessRecipe shapeless && shapeless.getIngredients().size() <= 9);
                if (display.isEmpty()) HandbookValidator.LOGGER.warn("Handbook guide '{}' references missing or unsupported crafting recipe '{}'", id, crafting.recipe());
                return new CraftingRecipeSection(crafting.recipe(), display);
            }).toList();
            resolved.put(id, new HandbookGuide(guide.title(), guide.description(), guide.icon(), guide.categories(), sections, guide.sortOrder()));
        });
        return resolved;
    }
}
