package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class OakFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("oak_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
                    .blockName("Oak Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.OAK_PLANKS)
            .variant("oak_planks_braced", variant -> variant
                    .description("Oak Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/oak_planks/oak_planks_encased-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/oak_planks/oak_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("oak_planks_braid", variant -> variant
                    .description("Oak Wood Braid"))
            .variant("oak_planks_crude_horizontal", variant -> variant
                    .description("Vertical Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("oak_planks_crude_paneling", variant -> variant
                    .description("Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_planks_crude_vertical", variant -> variant
                    .description("Vertical Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("oak_planks_encased", variant -> variant
                    .description("Encased Oak Wood Panel"))
            .variant("oak_planks_encased_large", variant -> variant
                    .description("Large Long Oak Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/oak_planks/oak_planks_large")))
            .variant("oak_planks_encased_smooth", variant -> variant
                    .description("Smooth Oak Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/oak_planks/oak_planks_smooth-ctm_cornerless")))
            .variant("oak_planks_large", variant -> variant
                    .description("Large Long Oak Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_planks_log_bordered", variant -> variant
                    .description("Log Bordered Oak Wood Panel")
                    .textureFromBase("ctm_corner")
                    .texture("ctm_cornerless", Chisel.prefix("block/oak_planks/oak_planks_encased-ctm_cornerless"))
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/oak_planks/oak_planks_braced")))
            .variant("oak_planks_log_cabin_ns", variant -> variant
                    .description("Oak Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/oak_planks/oak_planks_log_cabin_ns-ctm_vertical"))
                    .textureFromBase("ctm_horizontal"))
            .variant("oak_planks_log_cabin_ew", variant -> variant
                    .description("Oak Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/oak_planks/oak_planks_braced"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("oak_planks_paneling", variant -> variant
                    .description("Oak Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/oak_planks/oak_planks_paneling-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("oak_planks_shipping", variant -> variant
                    .description("Oak Wood Crate"))
            .variant("oak_planks_smooth", variant -> variant
                    .description("Smooth Oak Wood Planks"))
            .variant("oak_planks_stacked", variant -> variant
                    .description("Stacked Oak Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_planks_vertical", variant -> variant
                    .description("Vertical Oak Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private OakFamily() {
    }
}
