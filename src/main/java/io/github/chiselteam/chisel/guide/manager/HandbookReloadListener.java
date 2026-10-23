package io.github.chiselteam.chisel.guide.manager;

import io.github.chiselteam.chisel.guide.HandbookGuide;
import net.minecraft.resources.FileToIdConverter;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import org.jspecify.annotations.NonNull;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HandbookReloadListener extends SimpleJsonResourceReloadListener<HandbookGuide> {

    public HandbookReloadListener() {
        super(HandbookGuide.CODEC, FileToIdConverter.json("chisel/handbook_guides"));
    }

    @Override
    protected void apply(@NonNull Map<Identifier, HandbookGuide> prepared, @NonNull ResourceManager resourceManager, @NonNull ProfilerFiller profilerFiller) {
        var validGuides = new LinkedHashMap<Identifier, HandbookGuide>();
        var sortedGuides = prepared.entrySet().stream().sorted(Comparator.comparing(entry -> entry.getKey().toString())).toList();
        var rejectedGuides = 0;
        var structures = new HandbookStructureLoader(resourceManager);

        for (var entry : sortedGuides) {
            var id = entry.getKey();
            var guide = entry.getValue();
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
