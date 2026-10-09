package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GoldFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("gold", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK))
                    .blockName("Block of Gold")
                    .model(ChiselModelHandlers.TBS))
            .existingBlock(Blocks.GOLD_BLOCK)
            .variant("gold_125", variant -> variant
                    .description("125")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("gold_adv", variant -> variant
                    .description("Advanced")
                    .model(ChiselModelHandlers.CUBE_ALL)
                    .texture(Chisel.prefix("block/gold/gold_125")))
            .variant("gold_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("gold_brick", variant -> variant
                    .description("Golden Bricks")
                    .texture("bottom", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_caution", variant -> variant
                    .description("Caution Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("gold_cart", variant -> variant
                    .description("Gold Cart")
                    .texture("bottom", Chisel.prefix("block/gold/gold_cart-top")))
            .variant("gold_coin_heads", variant -> variant
                    .description("Golden Coin Stack Heads-up"))
            .variant("gold_coin_tails", variant -> variant
                    .description("Golden Coin Stack Heads-down")
                    .texture("side", Chisel.prefix("block/gold/gold_coin_heads-side")))
            .variant("gold_crate_dark", variant -> variant
                    .description("Dark Gold Crate")
                    .texture("top", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_crate_light", variant -> variant
                    .description("Light Gold Crate")
                    .texture("top", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_egregious", variant -> variant
                    .description("Egregiously Bordered Block")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("gold_ingots_large", variant -> variant
                    .description("Large Golden Ingots")
                    .texture("top", Chisel.prefix("block/gold/gold_cart-top")))
            .variant("gold_ingots_small", variant -> variant
                    .description("Small Golden Ingots")
                    .texture("top", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("gold_plates", variant -> variant
                    .description("Golden Plates")
                    .texture("side", Chisel.prefix("block/gold/gold_plates-top")))
            .variant("gold_rivets", variant -> variant
                    .description("Gold Plates with Rivets"))
            .variant("gold_scaffold", variant -> variant
                    .description("Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("gold_shipping", variant -> variant
                    .description("Shipping Crate")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("gold_simple", variant -> variant
                    .description("Simple Gold Block")
                    .texture("top", Chisel.prefix("block/gold/gold_cart-top")))
            .variant("gold_star_decor", variant -> variant
                    .description("Gold Block with Star Decoration"))
            .variant("gold_star_obsidian", variant -> variant
                    .description("Golden Star in Obsidian")
                    .texture("bottom", Chisel.prefix("block/gold/gold_star_obsidian-top"))
                    .textureAlias("side", "bottom"))
            .variant("gold_star_obsidian_purple", variant -> variant
                    .description("Golden Star in Purple Obsidian")
                    .texture("side", Chisel.prefix("block/gold/gold_star_obsidian_purple-top")))
            .variant("gold_thermal", variant -> variant
                    .description("Thermal")));

    private GoldFamily() {
    }
}
