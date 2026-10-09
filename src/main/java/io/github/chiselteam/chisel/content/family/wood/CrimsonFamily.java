package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CrimsonFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("crimson_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS))
                    .blockName("Crimson Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.CRIMSON_PLANKS)
            .variant("crimson_planks_braced", variant -> variant
                    .description("Crimson Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/crimson_planks/crimson_planks_log_bordered-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .texture("top-ctm_corner", Chisel.prefix("block/crimson_planks/crimson_planks_log_bordered"))
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .textureAlias("top-ctm_horizontal", "top-ctm_corner")
                    .textureFromBase("top-ctm_vertical"))
            .variant("crimson_planks_braid", variant -> variant
                    .description("Crimson Wood Braid"))
            .variant("crimson_planks_crude_horizontal", variant -> variant
                    .description("Vertical Crimson Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("crimson_planks_crude_paneling", variant -> variant
                    .description("Crimson Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("crimson_planks_crude_vertical", variant -> variant
                    .description("Vertical Crimson Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("crimson_planks_encased", variant -> variant
                    .description("Encased Crimson Wood Panel"))
            .variant("crimson_planks_encased_large", variant -> variant
                    .description("Large Long Crimson Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/crimson_planks/crimson_planks_large")))
            .variant("crimson_planks_encased_smooth", variant -> variant
                    .description("Smooth Crimson Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/crimson_planks/crimson_planks_smooth-ctm_cornerless")))
            .variant("crimson_planks_large", variant -> variant
                    .description("Large Long Crimson Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("crimson_planks_log_bordered", variant -> variant
                    .description("Log Bordered Crimson Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/crimson_planks/crimson_planks_braced")))
            .variant("crimson_planks_log_cabin_ew", variant -> variant
                    .description("Crimson Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/crimson_planks/crimson_planks_braced"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("crimson_planks_log_cabin_ns", variant -> variant
                    .description("Crimson Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/crimson_planks/crimson_planks_log_cabin_ns-ctm_vertical"))
                    .textureFromBase("ctm_horizontal"))
            .variant("crimson_planks_paneling", variant -> variant
                    .description("Crimson Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/crimson_planks/crimson_planks_paneling-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("crimson_planks_shipping", variant -> variant
                    .description("Crimson Wood Crate"))
            .variant("crimson_planks_smooth", variant -> variant
                    .description("Smooth Crimson Wood Planks"))
            .variant("crimson_planks_stacked", variant -> variant
                    .description("Stacked Crimson Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("crimson_planks_vertical", variant -> variant
                    .description("Vertical Crimson Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private CrimsonFamily() {
    }
}
