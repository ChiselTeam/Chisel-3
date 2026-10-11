package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GoldFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("gold", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)).blockName("Block of Gold").model(ChiselModelHandlers.TBS))
            .existingBlock(Blocks.GOLD_BLOCK)
            .variant("gold_125", v -> v.description("125").model(ChiselModelHandlers.CUBE_ALL))
            .variant("gold_adv", v -> v.description("Advanced").model(ChiselModelHandlers.CUBE_ALL)
                    .texture(Chisel.prefix("block/gold/gold_125")))
            .variant("gold_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv").model(ChiselModelHandlers.CONNECTED))
            .variant("gold_brick", v -> v.description("Golden Bricks")
                    .texture("bottom", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_caution", v -> v.description("Caution Stripes").model(ChiselModelHandlers.CONNECTED))
            .variant("gold_cart", v -> v.description("Gold Cart")
                    .texture("bottom", Chisel.prefix("block/gold/gold_cart-top")))
            .variant("gold_coin_heads", v -> v.description("Golden Coin Stack Heads-up"))
            .variant("gold_coin_tails", v -> v.description("Golden Coin Stack Heads-down")
                    .texture("side", Chisel.prefix("block/gold/gold_coin_heads-side")))
            .variant("gold_crate_dark", v -> v.description("Dark Gold Crate")
                    .texture("top", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_crate_light", v -> v.description("Light Gold Crate")
                    .texture("top", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_egregious", v -> v.description("Egregiously Bordered Block").model(ChiselModelHandlers.CONNECTED))
            .variant("gold_ingots_large", v -> v.description("Large Golden Ingots")
                    .texture("top", Chisel.prefix("block/gold/gold_cart-top")))
            .variant("gold_ingots_small", v -> v.description("Small Golden Ingots")
                    .texture("top", Chisel.prefix("block/gold/gold_brick-top")))
            .variant("gold_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("gold_plates", v -> v.description("Golden Plates")
                    .texture("side", Chisel.prefix("block/gold/gold_plates-top")))
            .variant("gold_rivets", v -> v.description("Gold Plates with Rivets"))
            .variant("gold_scaffold", v -> v.description("Scaffold").model(ChiselModelHandlers.CONNECTED))
            .variant("gold_shipping", v -> v.description("Shipping Crate").model(ChiselModelHandlers.CUBE_ALL))
            .variant("gold_simple", v -> v.description("Simple Gold Block")
                    .texture("top", Chisel.prefix("block/gold/gold_cart-top")))
            .variant("gold_star_decor", v -> v.description("Gold Block with Star Decoration"))
            .variant("gold_star_obsidian", v -> v.description("Golden Star in Obsidian")
                    .texture("bottom", Chisel.prefix("block/gold/gold_star_obsidian-top"))
                    .textureAlias("side", "bottom"))
            .variant("gold_star_obsidian_purple", v -> v.description("Golden Star in Purple Obsidian")
                    .texture("side", Chisel.prefix("block/gold/gold_star_obsidian_purple-top")))
            .variant("gold_thermal", v -> v.description("Thermal")));

    private GoldFamily() {
    }
}
