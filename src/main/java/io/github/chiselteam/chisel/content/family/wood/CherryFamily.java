package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CherryFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("cherry_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS))
                    .blockName("Cherry Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.CHERRY_PLANKS)
            .variant("cherry_planks_braced", variant -> variant
                    .description("Cherry Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/cherry_planks/cherry_planks_log_bordered-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/cherry_planks/cherry_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("cherry_planks_braid", variant -> variant
                    .description("Cherry Wood Braid"))
            .variant("cherry_planks_crude_horizontal", variant -> variant
                    .description("Vertical Cherry Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("cherry_planks_crude_paneling", variant -> variant
                    .description("Cherry Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("cherry_planks_crude_vertical", variant -> variant
                    .description("Vertical Cherry Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("cherry_planks_encased", variant -> variant
                    .description("Encased Cherry Wood Panel"))
            .variant("cherry_planks_encased_large", variant -> variant
                    .description("Large Long Cherry Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/cherry_planks/cherry_planks_large")))
            .variant("cherry_planks_encased_smooth", variant -> variant
                    .description("Smooth Cherry Wood Planks"))
            .variant("cherry_planks_large", variant -> variant
                    .description("Large Long Cherry Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("cherry_planks_log_bordered", variant -> variant
                    .description("Log Bordered Cherry Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/cherry_planks/cherry_planks_braced")))
            .variant("cherry_planks_log_cabin_ns", variant -> variant
                    .description("Cherry Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/cherry_planks/cherry_planks_log_cabin_ns-ctm_vertical"))
                    .texture("ctm_horizontal", Chisel.prefix("block/cherry_planks/cherry_planks_log_cabin_ns-ctm_corner")))
            .variant("cherry_planks_log_cabin_ew", variant -> variant
                    .description("Cherry Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/cherry_planks/cherry_planks_braced"))
                    .texture("ctm_horizontal", Chisel.prefix("block/cherry_planks/cherry_planks_log_cabin_ew-ctm_corner"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("cherry_planks_paneling", variant -> variant
                    .description("Cherry Wood Panel"))
            .variant("cherry_planks_shipping", variant -> variant
                    .description("Cherry Wood Crate"))
            .variant("cherry_planks_smooth", variant -> variant
                    .description("Smooth Cherry Wood Planks"))
            .variant("cherry_planks_stacked", variant -> variant
                    .description("Stacked Cherry Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("cherry_planks_vertical", variant -> variant
                    .description("Vertical Cherry Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private CherryFamily() {
    }
}
