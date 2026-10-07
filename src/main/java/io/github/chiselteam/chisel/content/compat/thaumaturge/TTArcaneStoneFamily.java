package io.github.chiselteam.chisel.content.compat.thaumaturge;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TTArcaneStoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tt_arcane_stone", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Arcane"))
            .variant("arcane_border", v -> v.description("Border").model(ChiselModelHandlers.CONNECTED))
            .variant("arcane_crack", v -> v.description("Cracked").model(ChiselModelHandlers.V9))
            .variant("arcane_matrix", v -> v.description("Matrix").model(ChiselModelHandlers.V9))
            .variant("arcane_tile", v -> v.description("Tile").model(ChiselModelHandlers.CONNECTED))
            .variant("arcane_big_brick", v -> v.description("Big Brick").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tt_arcane_stone/arcane_big_brick-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("arcane_border_brain", v -> v.description("Border Brain").model(ChiselModelHandlers.CONNECTED))
            .variant("arcane_conduit", v -> v.description("Conduit").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tt_arcane_stone/arcane_conduit-ctm_corner")))
            .variant("arcane_moon_engrave", v -> v.description("Moon Engraved").model(ChiselModelHandlers.CUBE_ALL))
            .variant("arcane_moon_glow", v -> v.description("Moon Glow").model(ChiselModelHandlers.CUBE_ALL))
            .variant("arcane_runes", v -> v.description("Runes").model(ChiselModelHandlers.V16)
                    .textureFromBase("v16_row_0_column_0"))
            .variant("arcane_runes_glow", v -> v.description("Runes Glow").model(ChiselModelHandlers.V16)
                    .textureFromBase("v16_row_0_column_0")));

    private TTArcaneStoneFamily() {
    }
}
