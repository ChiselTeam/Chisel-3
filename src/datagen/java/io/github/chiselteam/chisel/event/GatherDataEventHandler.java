package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.datagen.*;
import io.github.chiselteam.chisel.datagen.lang.ChiselLang;
import io.github.chiselteam.chisel.datagen.model.ChiselModelProvider;
import io.github.chiselteam.chisel.datagen.providers.ChiselLootTableProvider;
import io.github.chiselteam.chisel.datagen.providers.ChiselSoundDefinitionProvider;
import io.github.chiselteam.chisel.datagen.tags.ChiselBlockTags;
import io.github.chiselteam.chisel.datagen.tags.ChiselItemTags;
import net.minecraft.data.structures.SnbtToNbt;
import net.minecraft.data.structures.StructureUpdater;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.nio.file.Files;
import java.nio.file.Path;

@EventBusSubscriber(modid = Chisel.MODID)
public class GatherDataEventHandler {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        var registries = event.getLookupProvider();
        generator.addProvider(event.includeClient(), new ChiselModelProvider(output));
        generator.addProvider(event.includeClient(), new ChiselAnimatedTextures(output, event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), new ChiselLootTableProvider(output, registries));
        generator.addProvider(event.includeClient(), new ChiselLang(output));
        generator.addProvider(event.includeClient(), new ChiselSoundDefinitionProvider(output, event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), new ChiselRecipes(output, registries));
        generator.addProvider(event.includeServer(), new net.minecraft.data.DataProvider() {
            @Override public java.util.concurrent.CompletableFuture<?> run(net.minecraft.data.CachedOutput cache) { return new ChiselCompatRecipes(output, registries).run(cache); }
            @Override public String getName() { return "Chisel compatibility recipes"; }
        });
        generator.addProvider(event.includeServer(), new ChiselBlockTags(output, registries));
        generator.addProvider(event.includeServer(), new ChiselItemTags(output, registries));
        generator.addProvider(event.includeServer(), new ChiselRegistries(output, registries));
        generator.addProvider(event.includeClient(), new ChiselParticleDescriptions(output));
        generator.addProvider(event.includeServer(), new ChiselHandbookGuides(output, registries));
        generator.addProvider(event.includeServer(), new ChiselHandbookCategories(output, registries));
        var structureInput = System.getProperty("chisel.structureInput");
        // Guides may reference vanilla templates without any local SNBT sources.
        if (structureInput != null && Files.isDirectory(Path.of(structureInput))) {
            generator.addProvider(event.includeServer(), new SnbtToNbt(output, java.util.List.of(Path.of(structureInput)))
                    .addFilter(StructureUpdater::update));
        }
    }
}
