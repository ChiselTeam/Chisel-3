package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PoplarFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("poplar_planks", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.POPLAR_PLANKS)).blockName("Poplar Planks").model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.POPLAR_PLANKS)
            .variant("poplar_planks_braid", v -> v.description("Poplar Wood Braid"))
            .variant("poplar_planks_circular", v -> v.description("Circular Poplar Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/poplar_planks/poplar_planks_encased-ctm_cornerless")))
            .variant("poplar_planks_crude_horizontal", v -> v.description("Horizontal Poplar Wood Planks in Disarray").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("poplar_planks_crude_paneling", v -> v.description("Poplar Wood Planks in Disarray").model(ChiselModelHandlers.CUBE_ALL))
            .variant("poplar_planks_crude_vertical", v -> v.description("Vertical Poplar Wood Planks in Disarray").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("poplar_planks_encased", v -> v.description("Encased Poplar Wood Panel"))
            .variant("poplar_planks_encased_large", v -> v.description("Encased Large Poplar Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/poplar_planks/poplar_planks_large")))
            .variant("poplar_planks_encased_smooth", v -> v.description("Encased Smooth Poplar Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/poplar_planks/poplar_planks_smooth-ctm_cornerless")))
            .variant("poplar_planks_large", v -> v.description("Large Long Poplar Wood Planks").model(ChiselModelHandlers.CUBE_ALL))
            .variant("poplar_planks_paneling", v -> v.description("Poplar Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/poplar_planks/poplar_planks_paneling-ctm_corner"))
                    .textureFromBase("ctm_vertical")
                    .textureAlias("ctm_horizontal", "ctm_cornerless"))
            .variant("poplar_planks_shipping", v -> v.description("Poplar Wood Crate"))
            .variant("poplar_planks_smooth", v -> v.description("Smooth Poplar Wood Planks"))
            .variant("poplar_planks_stacked", v -> v.description("Stacked Poplar Wood Tiles").model(ChiselModelHandlers.CUBE_ALL))
            .variant("poplar_planks_vertical", v -> v.description("Vertical Poplar Wood Planks").model(ChiselModelHandlers.CUBE_ALL)));

    private PoplarFamily() {
    }
}
