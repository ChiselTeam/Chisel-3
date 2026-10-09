package io.github.chiselteam.chisel.content.compat.thaumaturge;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TTThaumiumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tt_thaumium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Thaumium"))
            .variant("thaumium_bevel", v -> v.description("Bevel"))
            .variant("thaumium_block", v -> v.description("Block"))
            .variant("thaumium_bricks", v -> v.description("Bricks").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tt_thaumium/thaumium_bricks-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("thaumium_chunks", v -> v.description("Chunks"))
            .variant("thaumium_lattice", v -> v.description("Lattice"))
            .variant("thaumium_ornate", v -> v.description("Ornate"))
            .variant("thaumium_planks", v -> v.description("Planks").model(ChiselModelHandlers.CONNECTED))
            .variant("thaumium_runes_purple", v -> v.description("Purple Runes").model(ChiselModelHandlers.V9)
                    .textureFromBase("v9_top_left"))
            .variant("thaumium_runes", v -> v.description("Runes").model(ChiselModelHandlers.V9)
                    .textureFromBase("v9_top_left"))
            .variant("thaumium_small", v -> v.description("Small"))
            .variant("thaumium_totem", v -> v.description("Totem").model(ChiselModelHandlers.R4)
                    .textureFromBase("r4_top_right")));

    private TTThaumiumFamily() {
    }
}
