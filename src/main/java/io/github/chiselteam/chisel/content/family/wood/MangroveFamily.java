package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MangroveFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("mangrove_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS))
                    .blockName("Mangrove Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.MANGROVE_PLANKS)
            .variant("mangrove_planks_braced", variant -> variant
                    .description("Mangrove Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/mangrove_planks/mangrove_planks_log_bordered-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless"))
            .variant("mangrove_planks_braid", variant -> variant
                    .description("Mangrove Wood Braid"))
            .variant("mangrove_planks_crude_horizontal", variant -> variant
                    .description("Vertical Mangrove Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("mangrove_planks_crude_paneling", variant -> variant
                    .description("Mangrove Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("mangrove_planks_crude_vertical", variant -> variant
                    .description("Vertical Mangrove Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("mangrove_planks_encased", variant -> variant
                    .description("Encased Mangrove Wood Panel"))
            .variant("mangrove_planks_encased_large", variant -> variant
                    .description("Large Long Mangrove Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/mangrove_planks/mangrove_planks_large")))
            .variant("mangrove_planks_encased_smooth", variant -> variant
                    .description("Smooth Mangrove Wood Planks"))
            .variant("mangrove_planks_large", variant -> variant
                    .description("Large Long Mangrove Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("mangrove_planks_log_bordered", variant -> variant
                    .description("Log Bordered Mangrove Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/mangrove_planks/mangrove_planks_braced")))
            .variant("mangrove_planks_log_cabin_ns", variant -> variant
                    .description("Mangrove Wood Log Cabin (North-South)")
                    .textureFromBase("ctm_corner")
                    .texture("ctm_cornerless", Chisel.prefix("block/mangrove_planks/mangrove_planks_braced"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("mangrove_planks_log_cabin_ew", variant -> variant
                    .description("Mangrove Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/mangrove_planks/mangrove_planks_braced"))
                    .texture("ctm_horizontal", Chisel.prefix("block/mangrove_planks/mangrove_planks_log_cabin_ew-ctm_corner"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("mangrove_planks_paneling", variant -> variant
                    .description("Mangrove Wood Panel")
                    .texture("ctm_horizontal", Chisel.prefix("block/mangrove_planks/mangrove_planks_paneling-ctm_corner"))
                    .textureFromBase("ctm_vertical"))
            .variant("mangrove_planks_shipping", variant -> variant
                    .description("Mangrove Wood Crate"))
            .variant("mangrove_planks_smooth", variant -> variant
                    .description("Smooth Mangrove Wood Planks"))
            .variant("mangrove_planks_stacked", variant -> variant
                    .description("Stacked Mangrove Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("mangrove_planks_vertical", variant -> variant
                    .description("Vertical Mangrove Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private MangroveFamily() {
    }
}
