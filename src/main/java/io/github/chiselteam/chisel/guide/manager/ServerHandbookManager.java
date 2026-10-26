package io.github.chiselteam.chisel.guide.manager;

import io.github.chiselteam.chisel.guide.HandbookCategory;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import net.minecraft.resources.ResourceLocation;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ServerHandbookManager {
    private static Map<ResourceLocation, HandbookGuide> guides = Map.of();
    private static Map<ResourceLocation, HandbookCategory> categories = Map.of();

    private ServerHandbookManager() {
    }

    public static void replaceGuides(Map<ResourceLocation, HandbookGuide> newGuides) {
        guides = Collections.unmodifiableMap(new LinkedHashMap<>(newGuides));
    }

    public static void replaceCategories(Map<ResourceLocation, HandbookCategory> newCategories) {
        categories = Collections.unmodifiableMap(new LinkedHashMap<>(newCategories));
    }

    public static Map<ResourceLocation, HandbookGuide> getGuides() {
        return guides;
    }

    public static Map<ResourceLocation, HandbookCategory> getCategories() {
        return categories;
    }
}
