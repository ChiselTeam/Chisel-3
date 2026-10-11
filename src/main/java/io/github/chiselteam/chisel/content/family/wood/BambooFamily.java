package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BambooFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bamboo_planks", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)).blockName("Bamboo Planks").model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.BAMBOO_PLANKS)
            .variant("bamboo_planks_braced", v -> v.description("Bamboo Panel").model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/bamboo_planks/bamboo_planks_encased-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .texture("top-ctm_corner", Chisel.prefix("block/bamboo_planks/bamboo_planks_log_bordered-ctm_corner"))
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/bamboo_planks/bamboo_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("bamboo_planks_braid", v -> v.description("Bamboo Braid"))
            //.variant("bamboo_planks_crude_horizontal", variant -> variant.model(ChiselModelHandlers.MULTIBLOCK_3X3))
            //.variant("bamboo_planks_crude_paneling", variant -> variant.model(ChiselModelHandlers.CUBE_ALL))
            //.variant("bamboo_planks_crude_vertical", variant -> variant.model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("bamboo_planks_encased", v -> v.description("Encased Bamboo Panel"))
            .variant("bamboo_planks_encased_2", v -> v.description("Encased Bamboo Panel")
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/bamboo_planks/bamboo_planks_encased-ctm_horizontal")))
            .variant("bamboo_planks_encased_large", v -> v.description("Large Long Bamboo Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/bamboo_planks/bamboo_planks_large")))
            .variant("bamboo_planks_encased_smooth", v -> v.description("Smooth Bamboo Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/bamboo_planks/bamboo_planks_smooth-ctm_cornerless")))
            .variant("bamboo_planks_large", v -> v.description("Large Long Bamboo Planks").model(ChiselModelHandlers.CUBE_ALL))
            .variant("bamboo_planks_log_bordered", v -> v.description("Log Bordered Bamboo Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/bamboo_planks/bamboo_planks_encased-ctm_cornerless"))
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/bamboo_planks/bamboo_planks_braced")))
            //.variant("bamboo_planks_log_cabin_ew", variant -> variant.model(ChiselModelHandlers.CONNECTED))
            //.variant("bamboo_planks_log_cabin_ns", variant -> variant.model(ChiselModelHandlers.CONNECTED))
            //.variant("bamboo_planks_paneling", variant -> variant.model(ChiselModelHandlers.CONNECTED))
            .variant("bamboo_planks_shipping", v -> v.description("Bamboo Crate"))
            .variant("bamboo_planks_smooth", v -> v.description("Smooth Bamboo Planks"))
            //.variant("bamboo_planks_stacked", variant -> variant.model(ChiselModelHandlers.CUBE_ALL))
            .variant("bamboo_planks_vertical", v -> v.description("Vertical Bamboo Planks").model(ChiselModelHandlers.CUBE_ALL)));

    private BambooFamily() {
    }
}
