package io.github.chiselteam.chisel.guide.manager;

import io.github.chiselteam.chisel.guide.HandbookGuide;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HandbookReloadListener extends SimpleJsonResourceReloadListener {

    public HandbookReloadListener() {
        super(new com.google.gson.Gson(), "chisel/handbook_guides");
    }

    @Override
    protected void apply(@NotNull Map<ResourceLocation, com.google.gson.JsonElement> prepared, @NotNull ResourceManager resourceManager, @NotNull ProfilerFiller profilerFiller) {
        var validGuides = new LinkedHashMap<ResourceLocation, HandbookGuide>();
        var sortedGuides = prepared.entrySet().stream().sorted(Comparator.comparing(entry -> entry.getKey().toString())).toList();
        var rejectedGuides = 0;
        var structures = new HandbookStructureLoader(resourceManager);

        for (var entry : sortedGuides) {
            var id = entry.getKey();
            var decoded = HandbookGuide.CODEC.parse(com.mojang.serialization.JsonOps.INSTANCE, entry.getValue())
                    .resultOrPartial(error -> HandbookValidator.LOGGER.error("Rejected handbook guide '{}': {}", id, error));
            if (decoded.isEmpty()) { rejectedGuides++; continue; }
            var guide = decoded.get();
            try {
                guide = structures.resolve(guide);
            } catch (IllegalArgumentException error) {
                HandbookValidator.LOGGER.error("Rejected handbook guide '{}': {}", id, error.getMessage());
                rejectedGuides++;
                continue;
            }
            if (!HandbookValidator.validate(id, guide)) {
                rejectedGuides++;
                continue;
            }
            validGuides.put(id, guide);
        }

        ServerHandbookManager.replaceGuides(validGuides);
        HandbookValidator.LOGGER.info("Loaded {} handbook entries; Rejected {}", validGuides.size(), rejectedGuides);
    }
}
