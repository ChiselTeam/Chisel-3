package io.github.chiselteam.chisel.content.family;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.List;

public class MetalFamilies {
    public static final ChiselFamily ALUMINUM, BRONZE, COBALT, COPPER, EXPOSED_COPPER, WEATHERED_COPPER, OXIDIZED_COPPER, DIAMOND, ELECTRUM, EMERALD, GOLD, INVAR, IRON, LAPIS, LEAD, NETHERITE, NICKEL, PLATINUM, SILVER, STEEL, THAUMIUM, TIN, URANIUM;
    private static final List<ChiselFamily> FAMILIES;

    static {
        ALUMINUM = ChiselFamily.build("aluminum", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("aluminum_bad_greggy", ChiselModelHandlers.CONNECTED).translation("aluminum_bad_greggy", "Aluminum", "An Old Relic from the land of Oneteufyv")
                .addVariant("aluminum_bolted").translation("aluminum_bolted", "Aluminum", "Fancy Bolted Plating")
                .addVariant("aluminum_caution", ChiselModelHandlers.CONNECTED).translation("aluminum_caution", "Aluminum", "Caution Stripes")
                .addVariant("aluminum_crate", ChiselModelHandlers.CONNECTED).translation("aluminum_crate", "Aluminum", "Shipping Crate")
                .addVariant("aluminum_machine").translation("aluminum_machine", "Aluminum", "Machine")
                .addVariant("aluminum_scaffold", ChiselModelHandlers.CONNECTED).translation("aluminum_scaffold", "Aluminum", "Scaffold")
                .addVariant("aluminum_thermal", ChiselModelHandlers.TBS).translation("aluminum_thermal", "Aluminum", "Thermal")
                .build());

        BRONZE = ChiselFamily.build("bronze", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("bronze_bad_greggy", ChiselModelHandlers.CONNECTED).translation("bronze_bad_greggy", "Bronze", "An Old Relic from the land of Oneteufyv")
                .addVariant("bronze_bolted").translation("bronze_bolted", "Bronze", "Fancy Bolted Plating")
                .addVariant("bronze_caution", ChiselModelHandlers.CONNECTED).translation("bronze_caution", "Bronze", "Caution Stripes")
                .addVariant("bronze_crate", ChiselModelHandlers.CONNECTED).translation("bronze_crate", "Bronze", "Shipping Crate")
                .addVariant("bronze_machine").translation("bronze_machine", "Bronze", "Machine")
                .addVariant("bronze_scaffold", ChiselModelHandlers.CONNECTED).translation("bronze_scaffold", "Bronze", "Scaffold")
                .addVariant("bronze_thermal", ChiselModelHandlers.TBS).translation("bronze_thermal", "Bronze", "Thermal")
                .build());

        COBALT = ChiselFamily.build("cobalt", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("cobalt_bad_greggy", ChiselModelHandlers.CONNECTED).translation("cobalt_bad_greggy", "Cobalt", "An Old Relic from the land of Oneteufyv")
                .addVariant("cobalt_bolted").translation("cobalt_bolted", "Cobalt", "Fancy Bolted Plating")
                .addVariant("cobalt_caution", ChiselModelHandlers.CONNECTED).translation("cobalt_caution", "Cobalt", "Caution Stripes")
                .addVariant("cobalt_crate", ChiselModelHandlers.CONNECTED).translation("cobalt_crate", "Cobalt", "Shipping Crate")
                .addVariant("cobalt_machine").translation("cobalt_machine", "Cobalt", "Machine")
                .addVariant("cobalt_scaffold", ChiselModelHandlers.CONNECTED).translation("cobalt_scaffold", "Cobalt", "Scaffold")
                .addVariant("cobalt_thermal", ChiselModelHandlers.TBS).translation("cobalt_thermal", "Cobalt", "Thermal")
                .build());

        COPPER = ChiselFamily.build("copper", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK))
                .addVariant(Blocks.COPPER_BLOCK)
                // .addVariant(Blocks.CHISELED_COPPER)
                // .addVariant(Blocks.CUT_COPPER)
                // .addVariant(Blocks.COPPER_GRATE)
                .addWeatheringVariant("copper_bad_greggy", ChiselModelHandlers.CONNECTED).waxedTranslation("copper_bad_greggy", "Block of Copper", "An Old Relic from the land of Oneteufyv")
                .addWeatheringVariant("copper_bolted", ChiselModelHandlers.CUBE_ALL).waxedTranslation("copper_bolted", "Block of Copper", "Fancy Bolted Plating")
                .addWeatheringVariant("copper_caution", ChiselModelHandlers.CONNECTED).waxedTranslation("copper_caution", "Block of Copper", "Caution Stripes")
                .addWeatheringVariant("copper_crate", ChiselModelHandlers.CONNECTED).waxedTranslation("copper_crate", "Block of Copper", "Shipping Crate")
                .addWeatheringVariant("copper_machine", ChiselModelHandlers.CUBE_ALL).waxedTranslation("copper_machine", "Block of Copper", "Machine")
                .addWeatheringVariant("copper_scaffold", ChiselModelHandlers.CONNECTED).waxedTranslation("copper_scaffold", "Block of Copper", "Scaffold")
                .addWeatheringVariant("copper_thermal", ChiselModelHandlers.TBS).waxedTranslation("copper_thermal", "Block of Copper", "Thermal")
                .build());

        EXPOSED_COPPER = ChiselFamily.build("exposed_copper", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER))
                .addVariant(Blocks.EXPOSED_COPPER)
                // .addVariant(Blocks.EXPOSED_CHISELED_COPPER)
                // .addVariant(Blocks.EXPOSED_CUT_COPPER)
                // .addVariant(Blocks.EXPOSED_COPPER_GRATE)
                .addWeatheringVariant("exposed_copper_bad_greggy", ChiselModelHandlers.CONNECTED).waxedTranslation("exposed_copper_bad_greggy", "Exposed Copper", "An Old Relic from the land of Oneteufyv")
                .addWeatheringVariant("exposed_copper_bolted", ChiselModelHandlers.CUBE_ALL).waxedTranslation("exposed_copper_bolted", "Exposed Copper", "Fancy Bolted Plating")
                .addWeatheringVariant("exposed_copper_caution", ChiselModelHandlers.CONNECTED).waxedTranslation("exposed_copper_caution", "Exposed Copper", "Caution Stripes")
                .addWeatheringVariant("exposed_copper_crate", ChiselModelHandlers.CONNECTED).waxedTranslation("exposed_copper_crate", "Exposed Copper", "Shipping Crate")
                .addWeatheringVariant("exposed_copper_machine", ChiselModelHandlers.CUBE_ALL).waxedTranslation("exposed_copper_machine", "Exposed Copper", "Machine")
                .addWeatheringVariant("exposed_copper_scaffold", ChiselModelHandlers.CONNECTED).waxedTranslation("exposed_copper_scaffold", "Exposed Copper", "Scaffold")
                .addWeatheringVariant("exposed_copper_thermal", ChiselModelHandlers.TBS).waxedTranslation("exposed_copper_thermal", "Exposed Copper", "Thermal")
                .build());

        WEATHERED_COPPER = ChiselFamily.build("weathered_copper", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER))
                .addVariant(Blocks.WEATHERED_COPPER)
                // .addVariant(Blocks.WEATHERED_CHISELED_COPPER)
                // .addVariant(Blocks.WEATHERED_CUT_COPPER)
                // .addVariant(Blocks.WEATHERED_COPPER_GRATE)
                .addWeatheringVariant("weathered_copper_bad_greggy", ChiselModelHandlers.CONNECTED).waxedTranslation("weathered_copper_bad_greggy", "Weathered Copper", "An Old Relic from the land of Oneteufyv")
                .addWeatheringVariant("weathered_copper_bolted", ChiselModelHandlers.CUBE_ALL).waxedTranslation("weathered_copper_bolted", "Weathered Copper", "Fancy Bolted Plating")
                .addWeatheringVariant("weathered_copper_caution", ChiselModelHandlers.CONNECTED).waxedTranslation("weathered_copper_caution", "Weathered Copper", "Caution Stripes")
                .addWeatheringVariant("weathered_copper_crate", ChiselModelHandlers.CONNECTED).waxedTranslation("weathered_copper_crate", "Weathered Copper", "Shipping Crate")
                .addWeatheringVariant("weathered_copper_machine", ChiselModelHandlers.CUBE_ALL).waxedTranslation("weathered_copper_machine", "Weathered Copper", "Machine")
                .addWeatheringVariant("weathered_copper_scaffold", ChiselModelHandlers.CONNECTED).waxedTranslation("weathered_copper_scaffold", "Weathered Copper", "Scaffold")
                .addWeatheringVariant("weathered_copper_thermal", ChiselModelHandlers.TBS).waxedTranslation("weathered_copper_thermal", "Weathered Copper", "Thermal")
                .build());

        OXIDIZED_COPPER = ChiselFamily.build("oxidized_copper", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER))
                .addVariant(Blocks.OXIDIZED_COPPER)
                // .addVariant(Blocks.OXIDIZED_CHISELED_COPPER)
                // .addVariant(Blocks.OXIDIZED_CUT_COPPER)
                // .addVariant(Blocks.OXIDIZED_COPPER_GRATE)
                .addWeatheringVariant("oxidized_copper_bad_greggy", ChiselModelHandlers.CONNECTED).waxedTranslation("oxidized_copper_bad_greggy", "Oxidized Copper", "An Old Relic from the land of Oneteufyv")
                .addWeatheringVariant("oxidized_copper_bolted", ChiselModelHandlers.CUBE_ALL).waxedTranslation("oxidized_copper_bolted", "Oxidized Copper", "Fancy Bolted Plating")
                .addWeatheringVariant("oxidized_copper_caution", ChiselModelHandlers.CONNECTED).waxedTranslation("oxidized_copper_caution", "Oxidized Copper", "Caution Stripes")
                .addWeatheringVariant("oxidized_copper_crate", ChiselModelHandlers.CONNECTED).waxedTranslation("oxidized_copper_crate", "Oxidized Copper", "Shipping Crate")
                .addWeatheringVariant("oxidized_copper_machine", ChiselModelHandlers.CUBE_ALL).waxedTranslation("oxidized_copper_machine", "Oxidized Copper", "Machine")
                .addWeatheringVariant("oxidized_copper_scaffold", ChiselModelHandlers.CONNECTED).waxedTranslation("oxidized_copper_scaffold", "Oxidized Copper", "Scaffold")
                .addWeatheringVariant("oxidized_copper_thermal", ChiselModelHandlers.TBS).waxedTranslation("oxidized_copper_thermal", "Oxidized Copper", "Thermal")
                .build());

        DIAMOND = ChiselFamily.build("diamond", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK))
                .addVariant(Blocks.DIAMOND_BLOCK)
                .addVariant("diamond_bismuth").translation("diamond_bismuth", "Block of Diamond", "Bismuth Diamond Block")
                .addVariant("diamond_cells").translation("diamond_cells", "Block of Diamond", "Diamond Cells")
                .addVariant("diamond_crushed").translation("diamond_crushed", "Block of Diamond", "Crushed Diamond")
                .addVariant("diamond_embossed", ChiselModelHandlers.TBS).translation("diamond_embossed", "Block of Diamond", "Embossed Diamond Block")
                .addVariant("diamond_obsidian").translation("diamond_obsidian", "Block of Diamond", "Diamonds in Obsidian")
                .addVariant("diamond_obsidian_purple").translation("diamond_obsidian_purple", "Block of Diamond", "Diamonds in Purple Obsidian")
                .addVariant("diamond_ornate").translation("diamond_ornate", "Block of Diamond", "Diamond Block with Ornate Layer")
                .addVariant("diamond_panel", ChiselModelHandlers.TBS).translation("diamond_panel", "Block of Diamond", "Diamond Block with Panel")
                .addVariant("diamond_simple", ChiselModelHandlers.TBS).translation("diamond_simple", "Block of Diamond", "Simple Diamond Block")
                .addVariant("diamond_small_blocks").translation("diamond_small_blocks", "Block of Diamond", "Small Diamond Blocks")
                .addVariant("diamond_small_blocks_ornate").translation("diamond_small_blocks_ornate", "Block of Diamond", "Small Ornate Diamond Blocks")
                .addVariant("diamond_zelda").translation("diamond_zelda", "Block of Diamond", "Zelda Diamond Block")
                .build());

        ELECTRUM = ChiselFamily.build("electrum", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("electrum_bad_greggy", ChiselModelHandlers.CONNECTED).translation("electrum_bad_greggy", "Electrum", "An Old Relic from the land of Oneteufyv")
                .addVariant("electrum_bolted").translation("electrum_bolted", "Electrum", "Fancy Bolted Plating")
                .addVariant("electrum_caution", ChiselModelHandlers.CONNECTED).translation("electrum_caution", "Electrum", "Caution Stripes")
                .addVariant("electrum_crate", ChiselModelHandlers.CONNECTED).translation("electrum_crate", "Electrum", "Shipping Crate")
                .addVariant("electrum_machine").translation("electrum_machine", "Electrum", "Machine")
                .addVariant("electrum_scaffold", ChiselModelHandlers.CONNECTED).translation("electrum_scaffold", "Electrum", "Scaffold")
                .addVariant("electrum_thermal", ChiselModelHandlers.TBS).translation("electrum_thermal", "Electrum", "Thermal")
                .build());

        EMERALD = ChiselFamily.build("emerald", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK))
                .addVariant(Blocks.EMERALD_BLOCK)
                .addVariant("emerald_bismuth").translation("emerald_bismuth", "Block of Emerald", "Emerald Bismuth")
                .addVariant("emerald_blocks_small").translation("emerald_blocks_small", "Block of Emerald", "Small Emerald Blocks")
                .addVariant("emerald_blocks_small_ornate").translation("emerald_blocks_small_ornate", "Block of Emerald", "Small Ornate Emerald Blocks")
                .addVariant("emerald_cell").translation("emerald_cell", "Block of Emerald", "Emerald Cell")
                .addVariant("emerald_chunk").translation("emerald_chunk", "Block of Emerald", "Emerald Chunk")
                .addVariant("emerald_circle").translation("emerald_circle", "Block of Emerald", "Circle")
                .addVariant("emerald_masonry").translation("emerald_masonry", "Block of Emerald", "Masonry")
                .addVariant("emerald_ornate").translation("emerald_ornate", "Block of Emerald", "Ornate Emerald Block")
                .addVariant("emerald_ornate_layer").translation("emerald_ornate_layer", "Block of Emerald", "Emerald with Ornate Layer")
                .addVariant("emerald_panel").translation("emerald_panel", "Block of Emerald", "Emerald Panel")
                .addVariant("emerald_panel_classic").translation("emerald_panel_classic", "Block of Emerald", "Classic emerald Panel")
                .addVariant("emerald_prismatic").translation("emerald_prismatic", "Block of Emerald", "Prismatic")
                .addVariant("emerald_smooth").translation("emerald_smooth", "Block of Emerald", "Smooth Emerald")
                .addVariant("emerald_zelda").translation("emerald_zelda", "Block of Emerald", "Zelda Emerald Block")
                .build());

        GOLD = ChiselFamily.build("gold", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK))
                .addVariant(Blocks.GOLD_BLOCK)
                .addVariant("gold_125").translation("gold_125", "Block of Gold", "125")
                .addVariant("gold_adv").translation("gold_adv", "Block of Gold", "Advanced")
                .addVariant("gold_bad_greggy", ChiselModelHandlers.CONNECTED).translation("gold_bad_greggy", "Block of Gold", "An Old Relic from the land of Oneteufyv")
                .addVariant("gold_brick", ChiselModelHandlers.TBS).translation("gold_brick", "Block of Gold", "Golden Bricks")
                .addVariant("gold_caution", ChiselModelHandlers.CONNECTED).translation("gold_caution", "Block of Gold", "Caution Stripes")
                .addVariant("gold_cart", ChiselModelHandlers.TBS).translation("gold_cart", "Block of Gold", "Gold Cart")
                .addVariant("gold_coin_heads", ChiselModelHandlers.TBS).translation("gold_coin_heads", "Block of Gold", "Golden Coin Stack Heads-up")
                .addVariant("gold_coin_tails", ChiselModelHandlers.TBS).translation("gold_coin_tails", "Block of Gold", "Golden Coin Stack Heads-down")
                .addVariant("gold_crate_dark", ChiselModelHandlers.TBS).translation("gold_crate_dark", "Block of Gold", "Dark Gold Crate")
                .addVariant("gold_crate_light", ChiselModelHandlers.TBS).translation("gold_crate_light", "Block of Gold", "Light Gold Crate")
                .addVariant("gold_egregious", ChiselModelHandlers.CONNECTED).translation("gold_egregious", "Block of Gold", "Egregiously Bordered Block")
                .addVariant("gold_ingots_large", ChiselModelHandlers.TBS).translation("gold_ingots_large", "Block of Gold", "Large Golden Ingots")
                .addVariant("gold_ingots_small", ChiselModelHandlers.TBS).translation("gold_ingots_small", "Block of Gold", "Small Golden Ingots")
                .addVariant("gold_machine").translation("gold_machine", "Block of Gold", "Machine")
                .addVariant("gold_plates", ChiselModelHandlers.TBS).translation("gold_plates", "Block of Gold", "Golden Plates")
                .addVariant("gold_rivets", ChiselModelHandlers.TBS).translation("gold_rivets", "Block of Gold", "Gold Plates with Rivets")
                .addVariant("gold_scaffold", ChiselModelHandlers.CONNECTED).translation("gold_scaffold", "Block of Gold", "Scaffold")
                .addVariant("gold_shipping").translation("gold_shipping", "Block of Gold", "Shipping Crate")
                .addVariant("gold_simple", ChiselModelHandlers.TBS).translation("gold_simple", "Block of Gold", "Simple Gold Block")
                .addVariant("gold_star_decor", ChiselModelHandlers.TBS).translation("gold_star_decor", "Block of Gold", "Gold Block with Star Decoration")
                .addVariant("gold_star_obsidian", ChiselModelHandlers.TBS).translation("gold_star_obsidian", "Block of Gold", "Golden Star in Obsidian")
                .addVariant("gold_star_obsidian_purple", ChiselModelHandlers.TBS).translation("gold_star_obsidian_purple", "Block of Gold", "Golden Star in Purple Obsidian")
                .addVariant("gold_thermal", ChiselModelHandlers.TBS).translation("gold_thermal", "Block of Gold", "Thermal")
                .build());

        INVAR = ChiselFamily.build("invar", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("invar_bad_greggy", ChiselModelHandlers.CONNECTED).translation("invar_bad_greggy", "Invar", "An Old Relic from the land of Oneteufyv")
                .addVariant("invar_bolted").translation("invar_bolted", "Invar", "Fancy Bolted Plating")
                .addVariant("invar_caution", ChiselModelHandlers.CONNECTED).translation("invar_caution", "Invar", "Caution Stripes")
                .addVariant("invar_crate", ChiselModelHandlers.CONNECTED).translation("invar_crate", "Invar", "Shipping Crate")
                .addVariant("invar_machine").translation("invar_machine", "Invar", "Machine")
                .addVariant("invar_scaffold", ChiselModelHandlers.CONNECTED).translation("invar_scaffold", "Invar", "Scaffold")
                .addVariant("invar_thermal", ChiselModelHandlers.TBS).translation("invar_thermal", "Invar", "Thermal")
                .build());

        IRON = ChiselFamily.build("iron", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant(Blocks.IRON_BLOCK)
                .addVariant("iron_bad_greggy", ChiselModelHandlers.CONNECTED).translation("iron_bad_greggy", "Block of Iron", "An Old Relic from the land of Oneteufyv")
                .addVariant("iron_bolted").translation("iron_bolted", "Block of Iron", "Fancy Bolted Plating")
                .addVariant("iron_caution", ChiselModelHandlers.CONNECTED).translation("iron_caution", "Block of Iron", "Caution Stripes")
                .addVariant("iron_crate", ChiselModelHandlers.CONNECTED).translation("iron_crate", "Block of Iron", "Shipping Crate")
                .addVariant("iron_machine").translation("iron_machine", "Block of Iron", "Machine")
                .addVariant("iron_scaffold", ChiselModelHandlers.CONNECTED).translation("iron_scaffold", "Block of Iron", "Scaffold")
                .addVariant("iron_thermal", ChiselModelHandlers.TBS).translation("iron_thermal", "Block of Iron", "Thermal")
                .addVariant("iron_125").translation("iron_125", "Block of Iron", "125")
                .addVariant("iron_bordered", ChiselModelHandlers.CONNECTED).translation("iron_bordered", "Block of Iron", "Egregiously Bordered Block")
                .addVariant("iron_brick", ChiselModelHandlers.TBS).translation("iron_brick", "Block of Iron", "Iron Bricks")
                .addVariant("iron_coin_heads", ChiselModelHandlers.TBS).translation("iron_coin_heads", "Block of Iron", "Iron Coin Stack Heads-up")
                .addVariant("iron_coin_tails", ChiselModelHandlers.TBS).translation("iron_coin_tails", "Block of Iron", "Iron Coin Stack Heads-down")
                .addVariant("iron_crate_dark", ChiselModelHandlers.TBS).translation("iron_crate_dark", "Block of Iron", "Dark Iron Crate")
                .addVariant("iron_crate_light", ChiselModelHandlers.TBS).translation("iron_crate_light", "Block of Iron", "Light Iron Crate")
                .addVariant("iron_gears", ChiselModelHandlers.TBS).translation("iron_gears", "Block of Iron", "Iron Gears")
                .addVariant("iron_ingots_large", ChiselModelHandlers.TBS).translation("iron_ingots_large", "Block of Iron", "Large Iron Ingots")
                .addVariant("iron_ingots_small", ChiselModelHandlers.TBS).translation("iron_ingots_small", "Block of Iron", "Small Iron Ingots")
                .addVariant("iron_moon", ChiselModelHandlers.TBS).translation("iron_moon", "Block of Iron", "Iron Block with Moon Decoration")
                .addVariant("iron_moon_obsidian").translation("iron_moon_obsidian", "Block of Iron", "Iron Moon in Obsidian")
                .addVariant("iron_moon_obsidian_purple").translation("iron_moon_obsidian_purple", "Block of Iron", "Iron Moon in Purple Obsidian")
                .addVariant("iron_plates", ChiselModelHandlers.TBS).translation("iron_plates", "Block of Iron", "Iron Plates")
                .addVariant("iron_rivets", ChiselModelHandlers.TBS).translation("iron_rivets", "Block of Iron", "Iron Plates with Rivets")
                .addVariant("iron_shipping", ChiselModelHandlers.CONNECTED).translation("iron_shipping", "Block of Iron", "Shipping Crate")
                .addVariant("iron_simple", ChiselModelHandlers.TBS).translation("iron_simple", "Block of Iron", "Simple Iron Block")
                .addVariant("iron_vents", ChiselModelHandlers.TBS).translation("iron_vents", "Block of Iron", "Iron Vents")
                .build());

        LAPIS = ChiselFamily.build("lapis", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK))
                .addVariant(Blocks.LAPIS_BLOCK)
                .addVariant("lapis_chunky").translation("lapis_chunky", "Block of Lapis Lazuli", "Chunky Lapis Block")
                .addVariant("lapis_dark").translation("lapis_dark", "Block of Lapis Lazuli", "Dark Lapis Block")
                .addVariant("lapis_masonry").translation("lapis_masonry", "Block of Lapis Lazuli", "Masonry")
                .addVariant("lapis_ornate").translation("lapis_ornate", "Block of Lapis Lazuli", "Ornate Lapis Block")
                .addVariant("lapis_ornate_layer").translation("lapis_ornate_layer", "Block of Lapis Lazuli", "Lapis with Ornate Layer")
                .addVariant("lapis_panel").translation("lapis_panel", "Block of Lapis Lazuli", "Lapis Panel")
                .addVariant("lapis_smooth").translation("lapis_smooth", "Block of Lapis Lazuli", "Smooth Lapis")
                .addVariant("lapis_tile").translation("lapis_tile", "Block of Lapis Lazuli", "Lapis Tile")
                .addVariant("lapis_zelda").translation("lapis_zelda", "Block of Lapis Lazuli", "Zelda Lapis Block")
                .build());

        LEAD = ChiselFamily.build("lead", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("lead_bad_greggy", ChiselModelHandlers.CONNECTED).translation("lead_bad_greggy", "Lead", "An Old Relic from the land of Oneteufyv")
                .addVariant("lead_bolted").translation("lead_bolted", "Lead", "Fancy Bolted Plating")
                .addVariant("lead_caution", ChiselModelHandlers.CONNECTED).translation("lead_caution", "Lead", "Caution Stripes")
                .addVariant("lead_crate", ChiselModelHandlers.CONNECTED).translation("lead_crate", "Lead", "Shipping Crate")
                .addVariant("lead_machine").translation("lead_machine", "Lead", "Machine")
                .addVariant("lead_scaffold", ChiselModelHandlers.CONNECTED).translation("lead_scaffold", "Lead", "Scaffold")
                .addVariant("lead_thermal", ChiselModelHandlers.TBS).translation("lead_thermal", "Lead", "Thermal")
                .build());

        NETHERITE = ChiselFamily.build("netherite", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK))
                .addVariant(Blocks.NETHERITE_BLOCK)
                .addVariant("netherite_array", ChiselModelHandlers.MULTIBLOCK_2X2).translation("netherite_array", "Block of Netherite", "Array")
                .addVariant("netherite_border_square", ChiselModelHandlers.CONNECTED).translation("netherite_border_square", "Block of Netherite", "Square Border")
                .addVariant("netherite_braid").translation("netherite_braid", "Block of Netherite", "Braid")
                .addVariant("netherite_braid_encased", ChiselModelHandlers.CONNECTED).translation("netherite_braid_encased", "Block of Netherite", "Encased Braid")
                .addVariant("netherite_bricks_cracked").translation("netherite_bricks_cracked", "Block of Netherite", "Cracked Bricks")
                .addVariant("netherite_bricks_encased", ChiselModelHandlers.CONNECTED).translation("netherite_bricks_encased", "Block of Netherite", "Encased Bricks")
                .addVariant("netherite_bricks_indent").translation("netherite_bricks_indent", "Block of Netherite", "Indent Bricks")
                .addVariant("netherite_bricks_inlayed").translation("netherite_bricks_inlayed", "Block of Netherite", "Inlayed Bricks")
                .addVariant("netherite_bricks_large", ChiselModelHandlers.MULTIBLOCK_2X2).translation("netherite_bricks_large", "Block of Netherite", "Large Bricks")
                .addVariant("netherite_bricks_small").translation("netherite_bricks_small", "Block of Netherite", "Small Bricks")
                .addVariant("netherite_bricks_soft").translation("netherite_bricks_soft", "Block of Netherite", "Soft Bricks")
                .addVariant("netherite_bricks_solid").translation("netherite_bricks_solid", "Block of Netherite", "Solid Bricks")
                .addVariant("netherite_bricks_triple").translation("netherite_bricks_triple", "Block of Netherite", "Triple Bricks")
                .addVariant("netherite_bricks_vertical").translation("netherite_bricks_vertical", "Block of Netherite", "Vertical Bricks")
                .addVariant("netherite_chaotic", ChiselModelHandlers.MULTIBLOCK_3X3).translation("netherite_chaotic", "Block of Netherite", "Chaotic")
                .addVariant("netherite_chaotic_medium").translation("netherite_chaotic_medium", "Block of Netherite", "Chaotic Medium")
                .addVariant("netherite_chaotic_small").translation("netherite_chaotic_small", "Block of Netherite", "Chaotic Small")
                .addVariant("netherite_checker").translation("netherite_checker", "Block of Netherite", "Checker")
                .addVariant("netherite_checker_small").translation("netherite_checker_small", "Block of Netherite", "Small Checker")
                .addVariant("netherite_circular", ChiselModelHandlers.CONNECTED).translation("netherite_circular", "Block of Netherite", "Circular")
		.addVariant("netherite_cracked").translation("netherite_cracked", "Block of Netherite", "Cracked")
                .addVariant("netherite_cobble").translation("netherite_cobble", "Block of Netherite", "Cobble")
                .addVariant("netherite_cuts", ChiselModelHandlers.MULTIBLOCK_4X4).translation("netherite_cuts", "Block of Netherite", "Cuts")
                .addVariant("netherite_dent", ChiselModelHandlers.CONNECTED).translation("netherite_dent", "Block of Netherite", "Dent")
                .addVariant("netherite_french_1").translation("netherite_french_1", "Block of Netherite", "French 1")
                .addVariant("netherite_french_2").translation("netherite_french_2", "Block of Netherite", "French 2")
                .addVariant("netherite_indent", ChiselModelHandlers.CONNECTED).translation("netherite_indent", "Block of Netherite", "Indent")
                .addVariant("netherite_jellybean", ChiselModelHandlers.MULTIBLOCK_2X2).translation("netherite_jellybean", "Block of Netherite", "Jellybean")
                .addVariant("netherite_layers").translation("netherite_layers", "Block of Netherite", "Layers")
                .addVariant("netherite_layers_connected", ChiselModelHandlers.CONNECTED).translation("netherite_layers_connected", "Block of Netherite", "Layers Connected")
                .addVariant("netherite_line_horizontal").translation("netherite_line_horizontal", "Block of Netherite", "Horizontal Line")
                .addVariant("netherite_line_vertical").translation("netherite_line_vertical", "Block of Netherite", "Vertical Line")
                .addVariant("netherite_meander_horizontal", ChiselModelHandlers.CTMH).translation("netherite_meander_horizontal", "Block of Netherite", "Horizontal Meander")
                .addVariant("netherite_meander_vertical", ChiselModelHandlers.CTMV).translation("netherite_meander_vertical", "Block of Netherite", "Vertical Meander")
                .addVariant("netherite_mosaic", ChiselModelHandlers.CONNECTED).translation("netherite_mosaic", "Block of Netherite", "Mosaic")
                .addVariant("netherite_ornate_small").translation("netherite_ornate_small", "Block of Netherite", "Small Ornate")
                .addVariant("netherite_panel").translation("netherite_panel", "Block of Netherite", "Panel")
                .addVariant("netherite_pillar", ChiselModelHandlers.TBS).translation("netherite_pillar", "Block of Netherite", "Pillar")
                .addVariant("netherite_pillar_basic", ChiselModelHandlers.CTMV).translation("netherite_pillar_basic", "Block of Netherite", "Basic Pillar")
                .addVariant("netherite_pillar_basic_dent", ChiselModelHandlers.CTMV).translation("netherite_pillar_basic_dent", "Block of Netherite", "Basic Dent Pillar")
                .addVariant("netherite_pillar_basic_plain", ChiselModelHandlers.CTMV).translation("netherite_pillar_basic_plain", "Block of Netherite", "Basic Plain Pillar")
                .addVariant("netherite_pillar_basic_round", ChiselModelHandlers.CTMV).translation("netherite_pillar_basic_round", "Block of Netherite", "Basic Round Pillar")
                .addVariant("netherite_pillar_basic_spiral", ChiselModelHandlers.CTMV).translation("netherite_pillar_basic_spiral", "Block of Netherite", "Basic Spiral Pillar")
                .addVariant("netherite_pillar_classic", ChiselModelHandlers.TBS).translation("netherite_pillar_classic", "Block of Netherite", "Classic Pillar")
                .addVariant("netherite_pillar_classic_large", ChiselModelHandlers.TBS).translation("netherite_pillar_classic_large", "Block of Netherite", "Large Classic Pillar")
                .addVariant("netherite_pillar_ionic", ChiselModelHandlers.CTMV).translation("netherite_pillar_ionic", "Block of Netherite", "Ionic Pillar")
                .addVariant("netherite_pillar_ionic_dent", ChiselModelHandlers.CTMV).translation("netherite_pillar_ionic_dent", "Block of Netherite", "Ionic Dent Pillar")
                .addVariant("netherite_pillar_ionic_plain", ChiselModelHandlers.CTMV).translation("netherite_pillar_ionic_plain", "Block of Netherite", "Ionic Plain Pillar")
                .addVariant("netherite_pillar_ionic_round", ChiselModelHandlers.CTMV).translation("netherite_pillar_ionic_round", "Block of Netherite", "Ionic Round Pillar")
                .addVariant("netherite_pillar_ionic_spiral", ChiselModelHandlers.CTMV).translation("netherite_pillar_ionic_spiral", "Block of Netherite", "Ionic Spiral Pillar")
                .addVariant("netherite_pillar_large_basic_triple", ChiselModelHandlers.CTMV).translation("netherite_pillar_large_basic_triple", "Block of Netherite", "Large Basic Triple Pillar")
                .addVariant("netherite_pillar_large_ionic_triple", ChiselModelHandlers.CTMV).translation("netherite_pillar_large_ionic_triple", "Block of Netherite", "Large Ionic Triple Pillar")
                .addVariant("netherite_pillar_meander", ChiselModelHandlers.CTMV).translation("netherite_pillar_meander", "Block of Netherite", "Meander Pillar")
                .addVariant("netherite_pillar_meander_dent", ChiselModelHandlers.CTMV).translation("netherite_pillar_meander_dent", "Block of Netherite", "Meander Dent Pillar")
                .addVariant("netherite_pillar_meander_plain", ChiselModelHandlers.CTMV).translation("netherite_pillar_meander_plain", "Block of Netherite", "Meander Plain Pillar")
                .addVariant("netherite_pillar_meander_round", ChiselModelHandlers.CTMV).translation("netherite_pillar_meander_round", "Block of Netherite", "Meander Round Pillar")
                .addVariant("netherite_pillar_meander_spiral", ChiselModelHandlers.CTMV).translation("netherite_pillar_meander_spiral", "Block of Netherite", "Meander Spiral Pillar")
                .addVariant("netherite_plate").translation("netherite_plate", "Block of Netherite", "Plate")
                .addVariant("netherite_plate_connected", ChiselModelHandlers.CONNECTED).translation("netherite_plate_connected", "Block of Netherite", "Plate Connected")
                .addVariant("netherite_polished").translation("netherite_polished", "Block of Netherite", "Polished")
                .addVariant("netherite_polished_encased", ChiselModelHandlers.CONNECTED).translation("netherite_polished_encased", "Block of Netherite", "Polished Encased")
                .addVariant("netherite_prism").translation("netherite_prism", "Block of Netherite", "Prismatic")
                .addVariant("netherite_raw").translation("netherite_raw", "Block of Netherite", "Raw")
                .addVariant("netherite_road").translation("netherite_road", "Block of Netherite", "Road")
                .addVariant("netherite_slanted", ChiselModelHandlers.MULTIBLOCK_2X2).translation("netherite_slanted", "Block of Netherite", "Slanted")
                .addVariant("netherite_tiles").translation("netherite_tiles", "Block of Netherite", "Tiles")
                .addVariant("netherite_tiles_large", ChiselModelHandlers.CONNECTED).translation("netherite_tiles_large", "Block of Netherite", "Large Tiles")
                .addVariant("netherite_tiles_small").translation("netherite_tiles_small", "Block of Netherite", "Small Tiles")
                .addVariant("netherite_twisted", ChiselModelHandlers.TBS).translation("netherite_twisted", "Block of Netherite", "Twisted")
                .addVariant("netherite_weaver", ChiselModelHandlers.CONNECTED).translation("netherite_weaver", "Block of Netherite", "Weaver")
                .addVariant("netherite_zag", ChiselModelHandlers.V4).translation("netherite_zag", "Block of Netherite", "Zag")
                .addVariant("netherite_crate", ChiselModelHandlers.CONNECTED).translation("netherite_crate", "Block of Netherite", "Crate")
                .addVariant("netherite_herringbone").translation("netherite_herringbone", "Block of Netherite", "Herringbone")
                .addVariant("netherite_herringbone_encased", ChiselModelHandlers.CONNECTED).translation("netherite_herringbone_encased", "Block of Netherite", "Encased Herringbone")
                .addVariant("netherite_medallion").translation("netherite_medallion", "Block of Netherite", "Medallion")
                .addVariant("netherite_medallion_encased", ChiselModelHandlers.CONNECTED).translation("netherite_medallion_encased", "Block of Netherite", "Encased Medallion")
                .addVariant("netherite_dots").translation("netherite_dots", "Block of Netherite", "Dots")
                .addVariant("netherite_dots_encased", ChiselModelHandlers.CONNECTED).translation("netherite_dots_encased", "Block of Netherite", "Encased Dots")
                .addVariant("netherite_heart").translation("netherite_heart", "Block of Netherite", "Heart")
                .addVariant("netherite_star").translation("netherite_star", "Block of Netherite", "Star")
                .addVariant("netherite_plating").translation("netherite_plating", "Block of Netherite", "Plating")
                .addVariant("netherite_lodestone").translation("netherite_lodestone", "Block of Netherite", "Lodestone")
                .addVariant("netherite_lodestone_connected", ChiselModelHandlers.CONNECTED).translation("netherite_lodestone_connected", "Block of Netherite", "Lodestone Connected")
                .addVariant("netherite_plank").translation("netherite_plank", "Block of Netherite", "Plank")
                .addVariant("netherite_plank_connected", ChiselModelHandlers.CONNECTED).translation("netherite_plank_connected", "Block of Netherite", "Plank Connected")
                .addVariant("netherite_frame").translation("netherite_frame", "Block of Netherite", "Frame")
                .addVariant("netherite_panel_1").translation("netherite_panel_1", "Block of Netherite", "Panel 1")
                .addVariant("netherite_panel_2").translation("netherite_panel_2", "Block of Netherite", "Panel 2")
                .addVariant("netherite_panel_3").translation("netherite_panel_3", "Block of Netherite", "Panel 3")
                .addVariant("netherite_skull_creeper").translation("netherite_skull_creeper", "Block of Netherite", "Creeper Skull")
                .addVariant("netherite_skull_skeleton").translation("netherite_skull_skeleton", "Block of Netherite", "Skeleton Skull")
                .addVariant("netherite_stripes").translation("netherite_stripes", "Block of Netherite", "Stripes")
                .addVariant("netherite_stripes_encased", ChiselModelHandlers.CONNECTED).translation("netherite_stripes_encased", "Block of Netherite", "Encased Stripes")
                .addVariant("netherite_chisel_1").translation("netherite_chisel_1", "Block of Netherite", "Chisel 1")
                .addVariant("netherite_chisel_2").translation("netherite_chisel_2", "Block of Netherite", "Chisel 2")
                .addVariant("netherite_chisel_3").translation("netherite_chisel_3", "Block of Netherite", "Chisel 3")
                .addVariant("netherite_chisel_4").translation("netherite_chisel_4", "Block of Netherite", "Chisel 4")
                .addVariant("netherite_chisel_5").translation("netherite_chisel_5", "Block of Netherite", "Chisel 5")
                .addVariant("netherite_chisel_6").translation("netherite_chisel_6", "Block of Netherite", "Chisel 6")
                .addVariant("netherite_facet").translation("netherite_facet", "Block of Netherite", "Facet")
                .addVariant("netherite_facet_small").translation("netherite_facet_small", "Block of Netherite", "Small Facet")
                .addVariant("netherite_facet_small_encased", ChiselModelHandlers.CONNECTED).translation("netherite_facet_small_encased", "Block of Netherite", "Encased Small Facet")
                .addVariant("netherite_shiny").translation("netherite_shiny", "Block of Netherite", "Shiny")
                .addVariant("netherite_shiny_connected", ChiselModelHandlers.CONNECTED).translation("netherite_shiny_connected", "Block of Netherite", "Shiny Connected")
                .addVariant("netherite_gem").translation("netherite_gem", "Block of Netherite", "Gem")
                .addVariant("netherite_gem_1").translation("netherite_gem_1", "Block of Netherite", "Gem 1")
                .addVariant("netherite_gem_1_connected", ChiselModelHandlers.CONNECTED).translation("netherite_gem_1_connected", "Block of Netherite", "Gem 1 Connected")
                .addVariant("netherite_gem_2").translation("netherite_gem_2", "Block of Netherite", "Gem 2")
                .addVariant("netherite_gem_2_connected", ChiselModelHandlers.CONNECTED).translation("netherite_gem_2_connected", "Block of Netherite", "Gem 2 Connected")
                .addVariant("netherite_gem_3").translation("netherite_gem_3", "Block of Netherite", "Gem 3")
                .addVariant("netherite_gem_3_connected", ChiselModelHandlers.CONNECTED).translation("netherite_gem_3_connected", "Block of Netherite", "Gem 3 Connected")
                .addVariant("netherite_bricks_square").translation("netherite_bricks_square", "Block of Netherite", "Square Bricks")
                .addVariant("netherite_slab").translation("netherite_slab", "Block of Netherite", "Slab")
                .addVariant("netherite_scaffold").translation("netherite_scaffold", "Block of Netherite", "Scaffold")
                .addVariant("netherite_scaffold_encased", ChiselModelHandlers.CONNECTED).translation("netherite_scaffold_encased", "Block of Netherite", "Encased Scaffold")
                .addVariant("netherite_tiles_inlayed").translation("netherite_tiles_inlayed", "Block of Netherite", "Inlayed Tiles")
                .addVariant("netherite_waves", ChiselModelHandlers.MULTIBLOCK_2X2).translation("netherite_waves", "Block of Netherite", "Waves")
                .addVariant("netherite_parquet").translation("netherite_parquet", "Block of Netherite", "Parquet")
                .addVariant("netherite_parquet_encased", ChiselModelHandlers.CONNECTED).translation("netherite_parquet_encased", "Block of Netherite", "Encased Parquet")
                .build());

        NICKEL = ChiselFamily.build("nickel", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("nickel_bad_greggy", ChiselModelHandlers.CONNECTED).translation("nickel_bad_greggy", "Nickel", "An Old Relic from the land of Oneteufyv")
                .addVariant("nickel_bolted").translation("nickel_bolted", "Nickel", "Fancy Bolted Plating")
                .addVariant("nickel_caution", ChiselModelHandlers.CONNECTED).translation("nickel_caution", "Nickel", "Caution Stripes")
                .addVariant("nickel_crate").translation("nickel_crate", "Nickel", "Shipping Crate")
                .addVariant("nickel_machine").translation("nickel_machine", "Nickel", "Machine")
                .addVariant("nickel_scaffold", ChiselModelHandlers.CONNECTED).translation("nickel_scaffold", "Nickel", "Scaffold")
                .addVariant("nickel_thermal", ChiselModelHandlers.TBS).translation("nickel_thermal", "Nickel", "Thermal")
                .build());

        PLATINUM = ChiselFamily.build("platinum", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("platinum_bad_greggy", ChiselModelHandlers.CONNECTED).translation("platinum_bad_greggy", "Platinum", "An Old Relic from the land of Oneteufyv")
                .addVariant("platinum_bolted").translation("platinum_bolted", "Platinum", "Fancy Bolted Plating")
                .addVariant("platinum_caution", ChiselModelHandlers.CONNECTED).translation("platinum_caution", "Platinum", "Caution Stripes")
                .addVariant("platinum_crate", ChiselModelHandlers.CONNECTED).translation("platinum_crate", "Platinum", "Shipping Crate")
                .addVariant("platinum_machine").translation("platinum_machine", "Platinum", "Machine")
                .addVariant("platinum_scaffold", ChiselModelHandlers.CONNECTED).translation("platinum_scaffold", "Platinum", "Scaffold")
                .addVariant("platinum_thermal", ChiselModelHandlers.TBS).translation("platinum_thermal", "Platinum", "Thermal")
                .build());

        SILVER = ChiselFamily.build("silver", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("silver_125").translation("silver_125", "Silver", "125")
                .addVariant("silver_bad_greggy", ChiselModelHandlers.CONNECTED).translation("silver_bad_greggy", "Silver", "An Old Relic from the land of Oneteufyv")
                .addVariant("silver_bolted").translation("silver_bolted", "Silver", "Fancy Bolted Plating")
                .addVariant("silver_caution", ChiselModelHandlers.CONNECTED).translation("silver_caution", "Silver", "Caution Stripes")
                .addVariant("silver_crate", ChiselModelHandlers.CONNECTED).translation("silver_crate", "Silver", "Shipping Crate")
                .addVariant("silver_scaffold", ChiselModelHandlers.CONNECTED).translation("silver_scaffold", "Silver", "Scaffold")
                .addVariant("silver_thermal", ChiselModelHandlers.TBS).translation("silver_thermal", "Silver", "Thermal")
                .build());

        STEEL = ChiselFamily.build("steel", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("steel_125").translation("steel_125", "Steel", "125")
                .addVariant("steel_bad_greggy", ChiselModelHandlers.CONNECTED).translation("steel_bad_greggy", "Steel", "An Old Relic from the land of Oneteufyv")
                .addVariant("steel_bolted").translation("steel_bolted", "Steel", "Fancy Bolted Plating")
                .addVariant("steel_caution", ChiselModelHandlers.CONNECTED).translation("steel_caution", "Steel", "Caution Stripes")
                .addVariant("steel_crate", ChiselModelHandlers.CONNECTED).translation("steel_crate", "Steel", "Shipping Crate")
                .addVariant("steel_egregious", ChiselModelHandlers.CONNECTED).translation("steel_egregious", "Steel", "Egregiously Bordered Block")
                .addVariant("steel_scaffold", ChiselModelHandlers.CONNECTED).translation("steel_scaffold", "Steel", "Scaffold")
                .addVariant("steel_thermal", ChiselModelHandlers.TBS).translation("steel_thermal", "Steel", "Thermal")
                .build());

        THAUMIUM = ChiselFamily.build("thaumium", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("thaumium_bevel").translation("thaumium_bevel", "Thaumium", "Bevel")
                .addVariant("thaumium_block").translation("thaumium_block", "Thaumium", "Block")
                .addVariant("thaumium_bricks", ChiselModelHandlers.CONNECTED).translation("thaumium_bricks", "Thaumium", "Bricks")
                .addVariant("thaumium_chunks").translation("thaumium_chunks", "Thaumium", "Chunks")
                .addVariant("thaumium_lattice").translation("thaumium_lattice", "Thaumium", "Lattice")
                .addVariant("thaumium_ornate").translation("thaumium_ornate", "Thaumium", "Ornate")
                .addVariant("thaumium_planks", ChiselModelHandlers.CONNECTED).translation("thaumium_planks", "Thaumium", "Planks")
                .addVariant("thaumium_runes_purple", ChiselModelHandlers.V9).translation("thaumium_runes_purple", "Thaumium", "Purple Runes")
                .addVariant("thaumium_runes", ChiselModelHandlers.V9).translation("thaumium_runes", "Thaumium", "Runes")
                .addVariant("thaumium_small").translation("thaumium_small", "Thaumium", "Small")
                .addVariant("thaumium_totem", ChiselModelHandlers.R4).translation("thaumium_totem", "Thaumium", "Totem")
                .build());

        TIN = ChiselFamily.build("tin", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("tin_125").translation("tin_125", "Tin", "125")
                .addVariant("tin_bad_greggy", ChiselModelHandlers.CONNECTED).translation("tin_bad_greggy", "Tin", "An Old Relic from the land of Oneteufyv")
                .addVariant("tin_bolted").translation("tin_bolted", "Tin", "Fancy Bolted Plating")
                .addVariant("tin_caution", ChiselModelHandlers.CONNECTED).translation("tin_caution", "Tin", "Caution Stripes")
                .addVariant("tin_crate", ChiselModelHandlers.CONNECTED).translation("tin_crate", "Tin", "Shipping Crate")
                .addVariant("tin_egregious", ChiselModelHandlers.CONNECTED).translation("tin_egregious", "Tin", "Egregiously Bordered Block")
                .addVariant("tin_scaffold", ChiselModelHandlers.CONNECTED).translation("tin_scaffold", "Tin", "Scaffold")
                .addVariant("tin_thermal", ChiselModelHandlers.TBS).translation("tin_thermal", "Tin", "Thermal")
                .build());

        URANIUM = ChiselFamily.build("uranium", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                .addVariant("uranium_125").translation("uranium_125", "Uranium", "125")
                .addVariant("uranium_bad_greggy", ChiselModelHandlers.CONNECTED).translation("uranium_bad_greggy", "Uranium", "An Old Relic from the land of Oneteufyv")
                .addVariant("uranium_bolted").translation("uranium_bolted", "Uranium", "Fancy Bolted Plating")
                .addVariant("uranium_caution", ChiselModelHandlers.CONNECTED).translation("uranium_caution", "Uranium", "Caution Stripes")
                .addVariant("uranium_crate", ChiselModelHandlers.CONNECTED).translation("uranium_crate", "Uranium", "Shipping Crate")
                .addVariant("uranium_machine").translation("uranium_machine", "Uranium", "Machine")
                .addVariant("uranium_scaffold", ChiselModelHandlers.CONNECTED).translation("uranium_scaffold", "Uranium", "Scaffold")
                .addVariant("uranium_thermal", ChiselModelHandlers.TBS).translation("uranium_thermal", "Uranium", "Thermal")
                .build());

        FAMILIES = List.of(ALUMINUM, BRONZE, COBALT, COPPER, EXPOSED_COPPER, WEATHERED_COPPER, OXIDIZED_COPPER, DIAMOND, ELECTRUM, EMERALD, GOLD, INVAR, IRON, LAPIS, LEAD, NETHERITE, NICKEL, PLATINUM, SILVER, STEEL, THAUMIUM, TIN, URANIUM);
    }

    private MetalFamilies() {
    }

    public static List<ChiselFamily> families() {
        return FAMILIES;
    }
}
