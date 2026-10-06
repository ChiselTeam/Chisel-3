package io.github.chiselteam.chisel.content.compat;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.List;

public class ModdedMetalFamilies {
    public static final ChiselFamily ALUMINUM, BRONZE, COBALT, ELECTRUM, INVAR, LEAD, NICKEL, PLATINUM, SILVER, STEEL, THAUMIUM, TIN, URANIUM;
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
                .texture("thaumium_bricks", "ctm_cornerless", Chisel.prefix("block/thaumium/thaumium_bricks-ctm_corner"))
                .texture("thaumium_bricks", "ctm_horizontal", Chisel.prefix("block/thaumium/thaumium_bricks"))
                .texture("thaumium_bricks", "ctm_vertical", Chisel.prefix("block/thaumium/thaumium_bricks-ctm_corner"))
                .addVariant("thaumium_chunks").translation("thaumium_chunks", "Thaumium", "Chunks")
                .addVariant("thaumium_lattice").translation("thaumium_lattice", "Thaumium", "Lattice")
                .addVariant("thaumium_ornate").translation("thaumium_ornate", "Thaumium", "Ornate")
                .addVariant("thaumium_planks", ChiselModelHandlers.CONNECTED).translation("thaumium_planks", "Thaumium", "Planks")
                .addVariant("thaumium_runes_purple", ChiselModelHandlers.V9).translation("thaumium_runes_purple", "Thaumium", "Purple Runes")
                .texture("thaumium_runes_purple", "v9_top_left", Chisel.prefix("block/thaumium/thaumium_runes_purple"))
                .addVariant("thaumium_runes", ChiselModelHandlers.V9).translation("thaumium_runes", "Thaumium", "Runes")
                .texture("thaumium_runes", "v9_top_left", Chisel.prefix("block/thaumium/thaumium_runes"))
                .addVariant("thaumium_small").translation("thaumium_small", "Thaumium", "Small")
                .addVariant("thaumium_totem", ChiselModelHandlers.R4).translation("thaumium_totem", "Thaumium", "Totem")
                .texture("thaumium_totem", "r4_top_right", Chisel.prefix("block/thaumium/thaumium_totem"))
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

        FAMILIES = List.of(ALUMINUM, BRONZE, COBALT, ELECTRUM, INVAR, LEAD, NICKEL, PLATINUM, SILVER, STEEL, THAUMIUM, TIN, URANIUM);
    }

    private ModdedMetalFamilies() {
    }

    public static List<ChiselFamily> families() {
        return FAMILIES;
    }
}
