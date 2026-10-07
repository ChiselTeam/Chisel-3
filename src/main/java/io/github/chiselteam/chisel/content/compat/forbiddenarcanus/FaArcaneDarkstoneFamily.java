package io.github.chiselteam.chisel.content.compat.forbiddenarcanus;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class FaArcaneDarkstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("fa_arcane_darkstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Arcane")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("arcane_border", variant -> variant
                    .description("Border"))
            .variant("arcane_crack", variant -> variant
                    .description("Cracked")
                    .model(ChiselModelHandlers.V9))
            .variant("arcane_matrix", variant -> variant
                    .description("Matrix")
                    .model(ChiselModelHandlers.V9))
            .variant("arcane_tile", variant -> variant
                    .description("Tile"))
            .variant("arcane_big_brick", variant -> variant
                    .description("Big Brick")
                    .texture("ctm_cornerless", Chisel.prefix("block/fa_arcane_darkstone/arcane_big_brick-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("arcane_border_brain", variant -> variant
                    .description("Border Brain"))
            .variant("arcane_conduit", variant -> variant
                    .description("Conduit")
                    .texture("ctm_cornerless", Chisel.prefix("block/fa_arcane_darkstone/arcane_conduit-ctm_corner")))
            .variant("arcane_moon_engrave", variant -> variant
                    .description("Moon Engraved")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("arcane_moon_glow", variant -> variant
                    .description("Moon Glow")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("arcane_runes", variant -> variant
                    .description("Runes")
                    .model(ChiselModelHandlers.V16)
                    .textureFromBase("v16_row_0_column_0"))
            .variant("arcane_runes_glow", variant -> variant
                    .description("Runes Glow")
                    .model(ChiselModelHandlers.V16)
                    .textureFromBase("v16_row_0_column_0")));

    private FaArcaneDarkstoneFamily() {
    }
}
