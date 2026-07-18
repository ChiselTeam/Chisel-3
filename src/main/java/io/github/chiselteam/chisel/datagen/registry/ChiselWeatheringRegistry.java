package io.github.chiselteam.chisel.datagen.registry;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.core.weathering.WeatheringChainData;
import io.github.chiselteam.chisel.registry.ChiselBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;

import java.util.List;
import java.util.stream.Stream;

/**
 * Datapack registry for weathering chains. Entries are defined by `WeatheringChainData`.
 * Data files should be placed under `data/<namespace>/chisel/weathering_chains/*.json` when using datagen.
 * Runtime datapacks can register entries under this registry key.
 */
public class ChiselWeatheringRegistry {

    public static final ResourceKey<Registry<WeatheringChainData>> KEY = ResourceKey.createRegistryKey(Chisel.prefix("weathering_chains"));

    public static void bootstrap(BootstrapContext<WeatheringChainData> context) {
        Stream.of("bad_greggy", "bolted", "caution", "crate", "machine", "scaffold", "thermal").forEach(variant -> {
            context.register(create("copper_%s".formatted(variant)), new WeatheringChainData(
                    List.of(
                            BuiltInRegistries.BLOCK.getKey(ChiselBlocks.COPPER.getVariant("copper_%s".formatted(variant)).get()),
                            BuiltInRegistries.BLOCK.getKey(ChiselBlocks.EXPOSED_COPPER.getVariant("exposed_copper_%s".formatted(variant)).get()),
                            BuiltInRegistries.BLOCK.getKey(ChiselBlocks.WEATHERED_COPPER.getVariant("weathered_copper_%s".formatted(variant)).get()),
                            BuiltInRegistries.BLOCK.getKey(ChiselBlocks.OXIDIZED_COPPER.getVariant("oxidized_copper_%s".formatted(variant)).get())
                    ),
                    0.25f
            ));
        });
    }

    private static ResourceKey<WeatheringChainData> create(String name) {
        return ResourceKey.create(KEY, Chisel.prefix(name));
    }
}
