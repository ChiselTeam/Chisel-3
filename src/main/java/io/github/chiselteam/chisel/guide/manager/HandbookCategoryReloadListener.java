package io.github.chiselteam.chisel.guide.manager;

import io.github.chiselteam.chisel.guide.HandbookCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HandbookCategoryReloadListener extends SimpleJsonResourceReloadListener {

    public HandbookCategoryReloadListener() {
        super(new com.google.gson.Gson(), "chisel/handbook_categories");
    }

    @Override
    protected void apply(@NotNull Map<ResourceLocation, com.google.gson.JsonElement> prepared, @NotNull ResourceManager resourceManager, @NotNull ProfilerFiller profilerFiller) {
        var validCategories = new LinkedHashMap<ResourceLocation, HandbookCategory>();

        prepared.entrySet().stream().sorted(Comparator.comparing(entry -> entry.getKey().toString())).forEach(entry -> {
            var id = entry.getKey();
            var decoded = HandbookCategory.CODEC.parse(com.mojang.serialization.JsonOps.INSTANCE, entry.getValue())
                    .resultOrPartial(error -> HandbookValidator.LOGGER.error("Rejected handbook category '{}': {}", id, error));
            if (decoded.isEmpty()) return;
            var category = decoded.get();

            if (HandbookCategoryValidator.validate(id, category)) {
                validCategories.put(id, category);
            }
        });

        ServerHandbookManager.replaceCategories(validCategories);
        HandbookValidator.LOGGER.info("Loaded {} handbook category definitions", validCategories.size());
    }
}
