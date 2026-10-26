package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.datagen.ChiselHandbookCategories;
import io.github.chiselteam.chisel.datagen.ChiselHandbookGuides;
import io.github.chiselteam.chisel.datagen.ChiselParticleDescriptions;
import io.github.chiselteam.chisel.datagen.ChiselRegistries;
import io.github.chiselteam.chisel.datagen.lang.ChiselLang;
import io.github.chiselteam.chisel.datagen.model.ChiselModelProvider;
import io.github.chiselteam.chisel.datagen.providers.ChiselSoundDefinitionProvider;
import io.github.chiselteam.chisel.datagen.tags.ChiselBlockTags;
import io.github.chiselteam.chisel.datagen.tags.ChiselItemTags;
import net.minecraft.data.structures.SnbtToNbt;
import net.minecraft.data.structures.StructureUpdater;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;

import java.nio.file.Files;
import java.nio.file.Path;

@EventBusSubscriber(modid = Chisel.MODID)
public class GatherDataEventHandler {

    @SubscribeEvent
    public static void gatherRegistries(GatherDataRegistryEntriesEvent event) {
        ChiselRegistries.gather(event);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(ChiselModelProvider::new);
        event.createProvider(ChiselLang::new);
        event.createProvider(ChiselSoundDefinitionProvider::new);
        event.createProvider(ChiselBlockTags::new);
        event.createProvider(ChiselItemTags::new);
        event.createProvider(ChiselParticleDescriptions::new);
        event.createProvider(ChiselHandbookGuides::new);
        event.createProvider(ChiselHandbookCategories::new);
        var structureInput = System.getProperty("chisel.structureInput");
        // Guides may reference vanilla templates without any local SNBT sources.
        if (structureInput != null && Files.isDirectory(Path.of(structureInput))) {
            event.createProvider(output -> new SnbtToNbt(output, Path.of(structureInput))
                    .addFilter(StructureUpdater::update));
        }
    }
}
