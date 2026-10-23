package io.github.chiselteam.chisel.guide.manager;

import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.section.CraftingRecipeSection;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.RecipeMap;
import net.minecraft.world.item.crafting.display.ShapedCraftingRecipeDisplay;
import net.minecraft.world.item.crafting.display.ShapelessCraftingRecipeDisplay;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public final class HandbookRecipeResolver {
    private HandbookRecipeResolver() {
    }

    public static Map<Identifier, HandbookGuide> resolve(Map<Identifier, HandbookGuide> guides, RecipeMap recipes) {
        var resolved = new LinkedHashMap<Identifier, HandbookGuide>();
        guides.forEach((id, guide) -> {
            var sections = guide.sections().stream().map(section -> {
                if (!(section instanceof CraftingRecipeSection crafting)) return section;
                var display = Optional.ofNullable(recipes.byKey(ResourceKey.create(Registries.RECIPE, crafting.recipe())))
                        .stream().flatMap(holder -> holder.value().display().stream())
                        .filter(candidate -> candidate instanceof ShapedCraftingRecipeDisplay shaped
                                && shaped.width() >= 1 && shaped.width() <= 3 && shaped.height() >= 1 && shaped.height() <= 3
                                || candidate instanceof ShapelessCraftingRecipeDisplay shapeless && shapeless.ingredients().size() <= 9)
                        .findFirst();
                if (display.isEmpty()) HandbookValidator.LOGGER.warn("Handbook guide '{}' references missing or unsupported crafting recipe '{}'", id, crafting.recipe());
                return new CraftingRecipeSection(crafting.recipe(), display);
            }).toList();
            resolved.put(id, new HandbookGuide(guide.title(), guide.description(), guide.icon(), guide.categories(), sections, guide.sortOrder()));
        });
        return resolved;
    }
}
