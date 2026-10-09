package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SpruceFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("spruce_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS))
                    .blockName("Spruce Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.SPRUCE_PLANKS)
            .variant("spruce_planks_braced", variant -> variant
                    .description("Spruce Wood Panel")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("spruce_planks_braid", variant -> variant
                    .description("Spruce Wood Braid"))
            .variant("spruce_planks_crude_horizontal", variant -> variant
                    .description("Vertical Spruce Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("spruce_planks_crude_paneling", variant -> variant
                    .description("Spruce Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("spruce_planks_crude_vertical", variant -> variant
                    .description("Vertical Spruce Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("spruce_planks_encased", variant -> variant
                    .description("Encased Spruce Wood Panel"))
            .variant("spruce_planks_encased_large", variant -> variant
                    .description("Large Long Spruce Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/spruce_planks/spruce_planks_large")))
            .variant("spruce_planks_encased_smooth", variant -> variant
                    .description("Smooth Spruce Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/spruce_planks/spruce_planks_smooth-ctm_cornerless")))
            .variant("spruce_planks_large", variant -> variant
                    .description("Large Long Spruce Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("spruce_planks_log_bordered", variant -> variant
                    .description("Log Bordered Spruce Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/spruce_planks/spruce_planks_braced")))
            .variant("spruce_planks_log_cabin_ew", variant -> variant
                    .description("Spruce Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/spruce_planks/spruce_planks_braced"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("spruce_planks_log_cabin_ns", variant -> variant
                    .description("Spruce Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/spruce_planks/spruce_planks_log_cabin_ns-ctm_vertical")))
            .variant("spruce_planks_paneling", variant -> variant
                    .description("Spruce Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/spruce_planks/spruce_planks_paneling-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless"))
            .variant("spruce_planks_shipping", variant -> variant
                    .description("Spruce Wood Crate"))
            .variant("spruce_planks_smooth", variant -> variant
                    .description("Smooth Spruce Wood Planks"))
            .variant("spruce_planks_stacked", variant -> variant
                    .description("Stacked Spruce Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("spruce_planks_vertical", variant -> variant
                    .description("Vertical Spruce Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private SpruceFamily() {
    }
}
