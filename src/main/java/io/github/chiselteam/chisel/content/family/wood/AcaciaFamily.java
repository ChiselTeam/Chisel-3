package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AcaciaFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("acacia_planks", builder -> builder
            .defaults(v -> v.blockName("Acacia Planks").model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.ACACIA_PLANKS)
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)))
            .variant("acacia_planks_braced", v -> v.description("Acacia Wood Panel").model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/acacia_planks/acacia_planks_encased-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/acacia_planks/acacia_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("acacia_planks_braid", v -> v.description("Acacia Wood Braid"))
            .variant("acacia_planks_crude_horizontal", v -> v.description("Vertical Acacia Wood Planks in Disarray").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("acacia_planks_crude_paneling", v -> v.description("Acacia Wood Planks in Disarray").model(ChiselModelHandlers.CUBE_ALL))
            .variant("acacia_planks_crude_vertical", v -> v.description("Vertical Acacia Wood Planks in Disarray").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("acacia_planks_encased", v -> v.description("Encased Acacia Wood Panel"))
            .variant("acacia_planks_encased_large", v -> v.description("Large Long Acacia Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/acacia_planks/acacia_planks_large")))
            .variant("acacia_planks_encased_smooth", v -> v.description("Smooth Acacia Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/acacia_planks/acacia_planks_smooth-ctm_cornerless")))
            .variant("acacia_planks_large", v -> v.description("Large Long Acacia Wood Planks").model(ChiselModelHandlers.CUBE_ALL))
            .variant("acacia_planks_log_bordered", v -> v.description("Log Bordered Acacia Wood Panel")
                    .textureFromBase("ctm_corner")
                    .texture("ctm_cornerless", Chisel.prefix("block/acacia_planks/acacia_planks_encased-ctm_cornerless"))
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/acacia_planks/acacia_planks_braced")))
            .variant("acacia_planks_log_cabin_ns", v -> v.description("Acacia Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/acacia_planks/acacia_planks_log_cabin_ns-ctm_vertical"))
                    .textureFromBase("ctm_horizontal"))
            .variant("acacia_planks_log_cabin_ew", v -> v.description("Acacia Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/acacia_planks/acacia_planks_braced"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("acacia_planks_paneling", v -> v.description("Acacia Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/acacia_planks/acacia_planks_paneling-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("acacia_planks_shipping", v -> v.description("Acacia Wood Crate"))
            .variant("acacia_planks_smooth", v -> v.description("Smooth Acacia Wood Planks"))
            .variant("acacia_planks_stacked", v -> v.description("Stacked Acacia Wood Tiles").model(ChiselModelHandlers.CUBE_ALL))
            .variant("acacia_planks_vertical", v -> v.description("Vertical Acacia Wood Planks").model(ChiselModelHandlers.CUBE_ALL)));

    private AcaciaFamily() {
    }
}
