package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.datagen.providers.ChiselLootTableProvider;
import io.github.chiselteam.chisel.datagen.registry.*;
import io.github.chiselteam.chisel.registry.ChiselVariantFamilies;
import io.github.chiselteam.chisel.weathering.WeatheringChains;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ChiselRegistries {

    public static void gather(GatherDataRegistryEntriesEvent event) {
        event.add(Registries.FEATURE, ChiselConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ChiselPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ChiselBiomeModifiers::bootstrap)
            .add(io.github.chiselteam.chisel.registry.ChiselSmashingRockRegistry.KEY, ChiselSmashingRockRegistry::bootstrap)
            .add(WeatheringChains.KEY, ChiselWeatheringRegistry::bootstrap)
                .add(ChiselVariantFamilies.KEY, ChiselVariantFamilyRegistry::bootstrap)
                .add(Registries.LOOT_TABLE, new ChiselLootTableProvider())
                .recipe(ChiselRecipes::new)
                .recipe(ChiselCompatRecipes::new);
    }
}
