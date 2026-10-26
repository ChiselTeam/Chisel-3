package io.github.chiselteam.chisel.guide.manager;

import io.github.chiselteam.chisel.guide.HandbookEntry;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HandbookCategoryIndex {
    public static Map<ResourceLocation, List<HandbookEntry>> buildCategories(Map<ResourceLocation, HandbookGuide> guides) {
        var categoryIndex = new LinkedHashMap<ResourceLocation, List<HandbookEntry>>();

        guides.forEach((id, guide) -> {
            var entry = new HandbookEntry(id, guide);
            for (var category : guide.categories().stream().distinct().toList()) {
                categoryIndex.computeIfAbsent(category, ignored -> new ArrayList<>()).add(entry);
            }
        });

        categoryIndex.replaceAll((ignored, entry) -> List.copyOf(entry));
        return categoryIndex;
    }
}
