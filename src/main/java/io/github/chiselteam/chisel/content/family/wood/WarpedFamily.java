package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class WarpedFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("warped_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS))
                    .blockName("Warped Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.WARPED_PLANKS)
            .variant("warped_planks_braced", variant -> variant
                    .description("Warped Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/warped_planks/warped_planks_log_bordered-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .texture("top-ctm_corner", Chisel.prefix("block/warped_planks/warped_planks_log_bordered"))
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .textureAlias("top-ctm_horizontal", "top-ctm_corner")
                    .textureFromBase("top-ctm_vertical"))
            .variant("warped_planks_braid", variant -> variant
                    .description("Warped Wood Braid"))
            .variant("warped_planks_crude_horizontal", variant -> variant
                    .description("Vertical Warped Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("warped_planks_crude_paneling", variant -> variant
                    .description("Warped Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("warped_planks_crude_vertical", variant -> variant
                    .description("Vertical Warped Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("warped_planks_encased", variant -> variant
                    .description("Encased Warped Wood Panel"))
            .variant("warped_planks_encased_large", variant -> variant
                    .description("Large Long Warped Wood Planks"))
            .variant("warped_planks_encased_smooth", variant -> variant
                    .description("Smooth Warped Wood Planks"))
            .variant("warped_planks_large", variant -> variant
                    .description("Large Long Warped Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("warped_planks_log_bordered", variant -> variant
                    .description("Log Bordered Warped Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/warped_planks/warped_planks_braced")))
            .variant("warped_planks_log_cabin_ns", variant -> variant
                    .description("Warped Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/warped_planks/warped_planks_log_cabin_ew-ctm_cornerless"))
                    .texture("ctm_vertical", Chisel.prefix("block/warped_planks/warped_planks_log_cabin_ew-ctm_vertical")))
            .variant("warped_planks_log_cabin_ew", variant -> variant
                    .description("Warped Wood Log Cabin (East-West)"))
            .variant("warped_planks_paneling", variant -> variant
                    .description("Warped Wood Panel"))
            .variant("warped_planks_shipping", variant -> variant
                    .description("Warped Wood Crate"))
            .variant("warped_planks_smooth", variant -> variant
                    .description("Smooth Warped Wood Planks"))
            .variant("warped_planks_stacked", variant -> variant
                    .description("Stacked Warped Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("warped_planks_vertical", variant -> variant
                    .description("Vertical Warped Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private WarpedFamily() {
    }
}
