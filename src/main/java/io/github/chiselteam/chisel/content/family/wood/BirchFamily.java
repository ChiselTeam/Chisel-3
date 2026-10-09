package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BirchFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("birch_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS))
                    .blockName("Birch Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.BIRCH_PLANKS)
            .variant("birch_planks_braced", variant -> variant
                    .description("Birch Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/birch_planks/birch_planks_braced-top-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/birch_planks/birch_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("birch_planks_braid", variant -> variant
                    .description("Birch Wood Braid"))
            .variant("birch_planks_crude_horizontal", variant -> variant
                    .description("Vertical Birch Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("birch_planks_crude_paneling", variant -> variant
                    .description("Birch Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("birch_planks_crude_vertical", variant -> variant
                    .description("Vertical Birch Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("birch_planks_encased", variant -> variant
                    .description("Encased Birch Wood Panel"))
            .variant("birch_planks_encased_large", variant -> variant
                    .description("Large Long Birch Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/birch_planks/birch_planks_large")))
            .variant("birch_planks_encased_smooth", variant -> variant
                    .description("Smooth Birch Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/birch_planks/birch_planks_smooth-ctm_cornerless")))
            .variant("birch_planks_large", variant -> variant
                    .description("Large Long Birch Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("birch_planks_log_bordered", variant -> variant
                    .description("Log Bordered Birch Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/birch_planks/birch_planks_encased-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/birch_planks/birch_planks_log_bordered-ctm_corner")))
            .variant("birch_planks_log_cabin_ew", variant -> variant
                    .description("Birch Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/birch_planks/birch_planks_braced"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("birch_planks_log_cabin_ns", variant -> variant
                    .description("Birch Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/birch_planks/birch_planks_log_cabin_ns-ctm_vertical"))
                    .textureFromBase("ctm_horizontal"))
            .variant("birch_planks_paneling", variant -> variant
                    .description("Birch Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/birch_planks/birch_planks_paneling-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("birch_planks_shipping", variant -> variant
                    .description("Birch Wood Crate"))
            .variant("birch_planks_smooth", variant -> variant
                    .description("Smooth Birch Wood Planks"))
            .variant("birch_planks_stacked", variant -> variant
                    .description("Stacked Birch Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("birch_planks_vertical", variant -> variant
                    .description("Vertical Birch Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private BirchFamily() {
    }
}
