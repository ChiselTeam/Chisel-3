package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class IronFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("iron", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Block of Iron").model(ChiselModelHandlers.TBS))
            .existingBlock(Blocks.IRON_BLOCK)
            .variant("iron_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv").model(ChiselModelHandlers.CONNECTED))
            .variant("iron_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_caution", v -> v.description("Caution Stripes").model(ChiselModelHandlers.CONNECTED))
            .variant("iron_crate", v -> v.description("Shipping Crate").model(ChiselModelHandlers.CONNECTED))
            .variant("iron_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_scaffold", v -> v.description("Scaffold").model(ChiselModelHandlers.CONNECTED))
            .variant("iron_thermal", v -> v.description("Thermal"))
            .variant("iron_125", v -> v.description("125").model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_bordered", v -> v.description("Egregiously Bordered Block").model(ChiselModelHandlers.CONNECTED))
            .variant("iron_brick", v -> v.description("Iron Bricks")
                    .texture("bottom", Chisel.prefix("block/iron/iron_brick-top")))
            .variant("iron_coin_heads", v -> v.description("Iron Coin Stack Heads-up"))
            .variant("iron_coin_tails", v -> v.description("Iron Coin Stack Heads-down")
                    .texture("side", Chisel.prefix("block/iron/iron_coin_heads-side")))
            .variant("iron_crate_dark", v -> v.description("Dark Iron Crate")
                    .texture("bottom", Chisel.prefix("block/gold/gold_crate_dark-bottom")))
            .variant("iron_crate_light", v -> v.description("Light Iron Crate")
                    .texture("bottom", Chisel.prefix("block/gold/gold_crate_light-bottom"))
                    .texture("top", Chisel.prefix("block/iron/iron_crate_dark-top")))
            .variant("iron_gears", v -> v.description("Iron Gears")
                    .texture("bottom", Chisel.prefix("block/iron/iron_gears-top")))
            .variant("iron_ingots_large", v -> v.description("Large Iron Ingots"))
            .variant("iron_ingots_small", v -> v.description("Small Iron Ingots")
                    .texture("top", Chisel.prefix("block/iron/iron_crate_dark-top")))
            .variant("iron_moon", v -> v.description("Iron Block with Moon Decoration"))
            .variant("iron_moon_obsidian", v -> v.description("Iron Moon in Obsidian").model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_moon_obsidian_purple", v -> v.description("Iron Moon in Purple Obsidian").model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_plates", v -> v.description("Iron Plates")
                    .texture("side", Chisel.prefix("block/iron/iron_plates-top")))
            .variant("iron_rivets", v -> v.description("Iron Plates with Rivets"))
            .variant("iron_shipping", v -> v.description("Shipping Crate").model(ChiselModelHandlers.CONNECTED))
            .variant("iron_simple", v -> v.description("Simple Iron Block"))
            .variant("iron_vents", v -> v.description("Iron Vents")
                    .texture("bottom", Chisel.prefix("block/iron/iron_vents-top"))));

    private IronFamily() {
    }
}
