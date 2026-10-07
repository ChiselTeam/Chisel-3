package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class IronFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("iron", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Block of Iron")
                    .model(ChiselModelHandlers.TBS))
            .existingBlock(Blocks.IRON_BLOCK)
            .variant("iron_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("iron_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_caution", variant -> variant
                    .description("Caution Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("iron_crate", variant -> variant
                    .description("Shipping Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("iron_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_scaffold", variant -> variant
                    .description("Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("iron_thermal", variant -> variant
                    .description("Thermal"))
            .variant("iron_125", variant -> variant
                    .description("125")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_bordered", variant -> variant
                    .description("Egregiously Bordered Block")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("iron_brick", variant -> variant
                    .description("Iron Bricks")
                    .texture("bottom", Chisel.prefix("block/iron/iron_brick-top")))
            .variant("iron_coin_heads", variant -> variant
                    .description("Iron Coin Stack Heads-up"))
            .variant("iron_coin_tails", variant -> variant
                    .description("Iron Coin Stack Heads-down")
                    .texture("side", Chisel.prefix("block/iron/iron_coin_heads-side")))
            .variant("iron_crate_dark", variant -> variant
                    .description("Dark Iron Crate")
                    .texture("bottom", Chisel.prefix("block/gold/gold_crate_dark-bottom")))
            .variant("iron_crate_light", variant -> variant
                    .description("Light Iron Crate")
                    .texture("bottom", Chisel.prefix("block/gold/gold_crate_light-bottom"))
                    .texture("top", Chisel.prefix("block/iron/iron_crate_dark-top")))
            .variant("iron_gears", variant -> variant
                    .description("Iron Gears")
                    .texture("bottom", Chisel.prefix("block/iron/iron_gears-top")))
            .variant("iron_ingots_large", variant -> variant
                    .description("Large Iron Ingots"))
            .variant("iron_ingots_small", variant -> variant
                    .description("Small Iron Ingots")
                    .texture("top", Chisel.prefix("block/iron/iron_crate_dark-top")))
            .variant("iron_moon", variant -> variant
                    .description("Iron Block with Moon Decoration"))
            .variant("iron_moon_obsidian", variant -> variant
                    .description("Iron Moon in Obsidian")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_moon_obsidian_purple", variant -> variant
                    .description("Iron Moon in Purple Obsidian")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("iron_plates", variant -> variant
                    .description("Iron Plates")
                    .texture("side", Chisel.prefix("block/iron/iron_plates-top")))
            .variant("iron_rivets", variant -> variant
                    .description("Iron Plates with Rivets"))
            .variant("iron_shipping", variant -> variant
                    .description("Shipping Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("iron_simple", variant -> variant
                    .description("Simple Iron Block"))
            .variant("iron_vents", variant -> variant
                    .description("Iron Vents")
                    .texture("bottom", Chisel.prefix("block/iron/iron_vents-top"))));

    private IronFamily() {
    }
}
