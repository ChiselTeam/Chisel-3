package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PaleOakFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("pale_oak_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS))
                    .blockName("Pale Oak Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.PALE_OAK_PLANKS)
            .variant("pale_oak_planks_braced", variant -> variant
                    .description("Pale Oak Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/pale_oak_planks/pale_oak_planks_log_bordered-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/pale_oak_planks/pale_oak_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("pale_oak_planks_braid", variant -> variant
                    .description("Pale Oak Wood Braid"))
            .variant("pale_oak_planks_crude_horizontal", variant -> variant
                    .description("Vertical Pale Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("pale_oak_planks_crude_paneling", variant -> variant
                    .description("Pale Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("pale_oak_planks_crude_vertical", variant -> variant
                    .description("Vertical Pale Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("pale_oak_planks_encased", variant -> variant
                    .description("Encased Pale Oak Wood Panel"))
            .variant("pale_oak_planks_encased_large", variant -> variant
                    .description("Large Long Pale Oak Wood Planks"))
            .variant("pale_oak_planks_encased_smooth", variant -> variant
                    .description("Smooth Pale Oak Wood Planks"))
            .variant("pale_oak_planks_large", variant -> variant
                    .description("Large Long Pale Oak Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("pale_oak_planks_log_bordered", variant -> variant
                    .description("Log Bordered Pale Oak Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/pale_oak_planks/pale_oak_planks_braced")))
            .variant("pale_oak_planks_log_cabin_ns", variant -> variant
                    .description("Pale Oak Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/pale_oak_planks/pale_oak_planks_log_cabin_ew-ctm_vertical"))
                    .texture("ctm_horizontal", Chisel.prefix("block/pale_oak_planks/pale_oak_planks_log_cabin_ns-ctm_corner"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("pale_oak_planks_log_cabin_ew", variant -> variant
                    .description("Pale Oak Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/pale_oak_planks/pale_oak_planks_log_cabin_ew-ctm_vertical"))
                    .texture("ctm_horizontal", Chisel.prefix("block/pale_oak_planks/pale_oak_planks_log_cabin_ew-ctm_corner")))
            .variant("pale_oak_planks_paneling", variant -> variant
                    .description("Pale Oak Wood Panel"))
            .variant("pale_oak_planks_shipping", variant -> variant
                    .description("Pale Oak Wood Crate"))
            .variant("pale_oak_planks_smooth", variant -> variant
                    .description("Smooth Pale Oak Wood Planks"))
            .variant("pale_oak_planks_stacked", variant -> variant
                    .description("Stacked Pale Oak Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("pale_oak_planks_vertical", variant -> variant
                    .description("Vertical Pale Oak Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private PaleOakFamily() {
    }
}
