package io.github.chiselteam.chisel.datagen.registry;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.content.ChiselFamilies;
import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.weathering.WeatheringChainData;
import io.github.chiselteam.chisel.weathering.WeatheringChains;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Datapack registry for weathering chains. Entries are defined by `WeatheringChainData`.
 * Data files should be placed under `data/<namespace>/chisel/weathering_chains/*.json` when using datagen.
 * Runtime datapacks can register entries under this registry key.
 */
public class ChiselWeatheringRegistry {

    public static void bootstrap(BootstrapContext<WeatheringChainData> context) {
        Stream.of("bad_greggy", "bolted", "caution", "crate", "machine", "scaffold", "thermal",
                "array", "border_square", "border_square_small", "braid", "braid_encased",
                "bricks_cracked", "bricks_encased", "bricks_indent", "bricks_inlayed", "bricks_large",
                "large_bricks", "bricks_small", "bricks_soft", "bricks_solid", "bricks_triple",
                "bricks_vertical", "chaotic", "chaotic_medium", "chaotic_small", "checker",
                "checker_small", "circular", "cracked", "cobble", "cuts",
                "dent", "french_1", "french_2", "indent", "jellybean",
                "layers", "layers_connected", "line_horizontal", "line_vertical", "meander_horizontal",
                "meander_vertical", "mosaic", "ornate_small", "panel", "pillar",
                "pillar_basic", "pillar_basic_dent", "pillar_basic_plain", "pillar_basic_round", "pillar_basic_spiral",
                "pillar_classic", "pillar_classic_large", "pillar_ionic", "pillar_ionic_dent", "pillar_ionic_plain",
                "pillar_ionic_round", "pillar_ionic_spiral", "pillar_large_basic_triple", "pillar_large_ionic_triple", "pillar_meander",
                "pillar_meander_dent", "pillar_meander_plain", "pillar_meander_round", "pillar_meander_spiral", "plate",
                "plate_connected", "polished", "polished_encased", "prism", "raw",
                "road", "slanted", "tiles", "tiles_large", "tiles_small",
                "twisted", "weaver", "zag", "crate_2", "herringbone",
                "herringbone_encased", "medallion", "medallion_encased", "dots", "dots_encased",
                "heart", "star", "plating", "lodestone", "lodestone_connected",
                "plank", "plank_connected", "frame", "panel_1", "panel_2",
                "panel_3", "skull_creeper", "skull_skeleton", "stripes", "stripes_encased",
                "chisel_1", "chisel_2", "chisel_3", "chisel_4", "chisel_5",
                "chisel_6", "facet", "facet_small", "facet_small_encased", "shiny",
                "shiny_connected", "gem", "gem_1", "gem_1_connected", "gem_2",
                "gem_2_connected", "gem_3", "gem_3_connected", "bricks_square", "slab",
                "scaffold_2", "scaffold_encased_2", "tiles_inlayed", "waves", "parquet",
                "parquet_encased", "bricks_large_rough", "tiles_small_encased", "bricks_round").forEach(variant -> {
            Block copper = ChiselFamilies.COPPER.getVariant("copper_%s".formatted(variant)).get();
            Block exposed = ChiselFamilies.EXPOSED_COPPER.getVariant("exposed_copper_%s".formatted(variant)).get();
            Block weathered = ChiselFamilies.WEATHERED_COPPER.getVariant("weathered_copper_%s".formatted(variant)).get();
            Block oxidized = ChiselFamilies.OXIDIZED_COPPER.getVariant("oxidized_copper_%s".formatted(variant)).get();

            Map<ResourceLocation, ResourceLocation> waxedMap = new HashMap<>();
            addWaxed(waxedMap, copper, "waxed_copper_%s".formatted(variant), ChiselFamilies.COPPER);
            addWaxed(waxedMap, exposed, "waxed_exposed_copper_%s".formatted(variant), ChiselFamilies.EXPOSED_COPPER);
            addWaxed(waxedMap, weathered, "waxed_weathered_copper_%s".formatted(variant), ChiselFamilies.WEATHERED_COPPER);
            addWaxed(waxedMap, oxidized, "waxed_oxidized_copper_%s".formatted(variant), ChiselFamilies.OXIDIZED_COPPER);

            context.register(create("copper_%s".formatted(variant)), new WeatheringChainData(
                    List.of(
                            BuiltInRegistries.BLOCK.getKey(copper),
                            BuiltInRegistries.BLOCK.getKey(exposed),
                            BuiltInRegistries.BLOCK.getKey(weathered),
                            BuiltInRegistries.BLOCK.getKey(oxidized)
                    ),
                    0.05688889F,
                    waxedMap
            ));
        });
    }

    private static void addWaxed(Map<ResourceLocation, ResourceLocation> map, Block unwaxed, String waxedName, ChiselFamily family) {
        Block waxed = family.getVariant(waxedName).get();
        map.put(BuiltInRegistries.BLOCK.getKey(unwaxed), BuiltInRegistries.BLOCK.getKey(waxed));
        WeatheringChains.registerWaxable(unwaxed, waxed);
    }

    private static ResourceKey<WeatheringChainData> create(String name) {
        return ResourceKey.create(WeatheringChains.KEY, Chisel.prefix(name));
    }
}
