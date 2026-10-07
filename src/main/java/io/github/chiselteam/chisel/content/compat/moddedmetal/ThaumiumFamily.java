package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ThaumiumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("thaumium", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Thaumium"))
            .variant("thaumium_bevel", variant -> variant
                    .description("Bevel"))
            .variant("thaumium_block", variant -> variant
                    .description("Block"))
            .variant("thaumium_bricks", variant -> variant
                    .description("Bricks")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/thaumium/thaumium_bricks-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("thaumium_chunks", variant -> variant
                    .description("Chunks"))
            .variant("thaumium_lattice", variant -> variant
                    .description("Lattice"))
            .variant("thaumium_ornate", variant -> variant
                    .description("Ornate"))
            .variant("thaumium_planks", variant -> variant
                    .description("Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("thaumium_runes_purple", variant -> variant
                    .description("Purple Runes")
                    .model(ChiselModelHandlers.V9)
                    .textureFromBase("v9_top_left"))
            .variant("thaumium_runes", variant -> variant
                    .description("Runes")
                    .model(ChiselModelHandlers.V9)
                    .textureFromBase("v9_top_left"))
            .variant("thaumium_small", variant -> variant
                    .description("Small"))
            .variant("thaumium_totem", variant -> variant
                    .description("Totem")
                    .model(ChiselModelHandlers.R4)
                    .textureFromBase("r4_top_right")));

    private ThaumiumFamily() {
    }
}
