package io.github.chiselteam.chisel.datagen.registry;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.content.ChiselFamilies;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

public class ChiselConfiguredFeatures {

    public static final ResourceKey<Feature> MARBLE = create("marble_configured_feature");
    public static final ResourceKey<Feature> LIMESTONE = create("limestone_configured_feature");
    public static final ResourceKey<Feature> BASALT = create("basalt_configured_feature");

    public static void bootstrap(BootstrapContext<Feature> context) {
        context.register(MARBLE, new OreFeature(new BlockMatchTest(Blocks.STONE), ChiselFamilies.MARBLE.getVariant("marble_raw").get().defaultBlockState(), 32));
        context.register(LIMESTONE, new OreFeature(new BlockMatchTest(Blocks.STONE), ChiselFamilies.LIMESTONE.getVariant("limestone_raw").get().defaultBlockState(), 32));
        context.register(BASALT, new OreFeature(new BlockMatchTest(Blocks.STONE), ChiselFamilies.BASALT.getVariant("basalt_raw").get().defaultBlockState(), 32));
    }

    private static ResourceKey<Feature> create(final String name) {
        return ResourceKey.create(Registries.FEATURE, Chisel.prefix(name));
    }
}
