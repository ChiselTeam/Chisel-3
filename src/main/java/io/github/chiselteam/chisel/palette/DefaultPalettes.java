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
                palette("Weathered Castle", "Give your castle a few stories to tell with rough gray stone, cracks and a little moss.",
                        Blocks.STONE_BRICKS, Blocks.COBBLESTONE, Blocks.ANDESITE, Blocks.CRACKED_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS),
                palette("Forest Ruins", "Let the forest reclaim a corner of your build. Mossy walls make lovely garden ruins.",
                        Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_COBBLESTONE, Blocks.STONE_BRICKS, Blocks.COBBLESTONE, Blocks.CHISELED_STONE_BRICKS),
                palette("Deepstone Keep", "Raise a sturdy dark keep with a dash of polish. Every tower deserves a good entrance.",
                        Blocks.DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_TILES),
                palette("Volcanic Fortress", "Go bold with blackstone and basalt, then let a rare gilded fleck catch your eye.",
                        Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.BLACKSTONE, Blocks.POLISHED_BASALT, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.GILDED_BLACKSTONE),
                palette("Desert Temple", "Warm sandstone, pale highlights and a few carvings. Your desert wonder starts here.",
                        Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.CHISELED_SANDSTONE, Blocks.END_STONE),
                palette("Mesa Adobe", "Wrap a sunny little home in earthy orange, red sandstone and cozy terracotta.",
                        Blocks.TERRACOTTA, Blocks.RED_SANDSTONE, Blocks.ORANGE_TERRACOTTA, Blocks.SMOOTH_RED_SANDSTONE, Blocks.RED_TERRACOTTA),
                palette("Coastal Cottage", "Soft pale stone for a seaside escape. Pick a view and leave room for a porch.",
                        Blocks.CALCITE, Blocks.DIORITE, Blocks.POLISHED_DIORITE, Blocks.WHITE_TERRACOTTA, Blocks.SMOOTH_QUARTZ),
                palette("Copper Workshop", "Mix copper's weathered colors with sturdy stone for a workshop full of character.",
                        Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_CUT_COPPER, Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER, Blocks.POLISHED_ANDESITE),
                palette("Ocean Sanctuary", "Dive into blue-green prismarine with a little lantern glow for your ocean hideaway.",
                        Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE, Blocks.DARK_PRISMARINE, Blocks.CYAN_TERRACOTTA, Blocks.SEA_LANTERN),
                palette("Nether Citadel", "Build a grand red citadel with warm patches and worn bricks. Quite the Nether welcome.",
                        Blocks.NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, Blocks.NETHERRACK, Blocks.CRACKED_NETHER_BRICKS, Blocks.CHISELED_NETHER_BRICKS),
                palette("End Observatory", "Pale end stone with a splash of purple. Give your skywatching spot a little End charm.",
                        Blocks.END_STONE_BRICKS, Blocks.END_STONE, Blocks.SMOOTH_SANDSTONE, Blocks.PURPUR_BLOCK, Blocks.PURPUR_PILLAR),
                palette("Muddy Foundations", "Get happily muddy with earthy brick paths, sturdy foundations and countryside walls.",
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
