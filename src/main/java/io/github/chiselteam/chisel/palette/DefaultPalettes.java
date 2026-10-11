package io.github.chiselteam.chisel.palette;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public final class DefaultPalettes {
    private DefaultPalettes() {
    }

    public static List<PlayerPalette> create() {
        return List.of(
                palette("Weathered Castle", "Rough gray masonry with occasional cracks and moss.",
                        Blocks.STONE_BRICKS, Blocks.COBBLESTONE, Blocks.ANDESITE, Blocks.CRACKED_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS),
                palette("Forest Ruins", "Overgrown walls for forgotten buildings and garden ruins.",
                        Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_COBBLESTONE, Blocks.STONE_BRICKS, Blocks.COBBLESTONE, Blocks.CHISELED_STONE_BRICKS),
                palette("Deepstone Keep", "Dark stone walls with a little polished detail.",
                        Blocks.DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_TILES),
                palette("Volcanic Fortress", "Blackstone and basalt with rare gilded highlights.",
                        Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.BLACKSTONE, Blocks.POLISHED_BASALT, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.GILDED_BLACKSTONE),
                palette("Desert Temple", "Warm sandstone with pale and carved accents.",
                        Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.CHISELED_SANDSTONE, Blocks.END_STONE),
                palette("Mesa Adobe", "Earthy orange walls with red sandstone and terracotta.",
                        Blocks.TERRACOTTA, Blocks.RED_SANDSTONE, Blocks.ORANGE_TERRACOTTA, Blocks.SMOOTH_RED_SANDSTONE, Blocks.RED_TERRACOTTA),
                palette("Coastal Cottage", "Soft pale stone for seaside buildings.",
                        Blocks.CALCITE, Blocks.DIORITE, Blocks.POLISHED_DIORITE, Blocks.WHITE_TERRACOTTA, Blocks.SMOOTH_QUARTZ),
                palette("Copper Workshop", "A mix of copper weathering stages with industrial stone accents.",
                        Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_CUT_COPPER, Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.POLISHED_ANDESITE),
                palette("Ocean Sanctuary", "Blue-green prismarine with occasional glowing highlights.",
                        Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE, Blocks.DARK_PRISMARINE, Blocks.CYAN_TERRACOTTA, Blocks.SEA_LANTERN),
                palette("Nether Citadel", "Dark red masonry with warmer patches and worn bricks.",
                        Blocks.NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, Blocks.NETHERRACK, Blocks.CRACKED_NETHER_BRICKS, Blocks.CHISELED_NETHER_BRICKS),
                palette("End Observatory", "Pale end stone with restrained purple accents.",
                        Blocks.END_STONE_BRICKS, Blocks.END_STONE, Blocks.SMOOTH_SANDSTONE, Blocks.PURPUR_BLOCK, Blocks.PURPUR_PILLAR),
                palette("Muddy Foundations", "Muted earth and brick for paths, foundations, and rural walls.",
                        Blocks.MUD_BRICKS, Blocks.PACKED_MUD, Blocks.MUD, Blocks.BROWN_TERRACOTTA, Blocks.DRIPSTONE_BLOCK)
        );
    }

    private static PlayerPalette palette(String name, String description, Block... blocks) {
        int[] weights = {50, 25, 15, 7, 3};
        var entries = IntStream.range(0, blocks.length)
                .mapToObj(i -> new WeightedBlock(BuiltInRegistries.BLOCK.getKey(blocks[i]), weights[i], true)).toList();
        var definition = new PaletteDefinition(name, description, BuiltInRegistries.ITEM.getKey(blocks[0].asItem()), entries);
        return new PlayerPalette(UUID.randomUUID(), definition);
    }
}
