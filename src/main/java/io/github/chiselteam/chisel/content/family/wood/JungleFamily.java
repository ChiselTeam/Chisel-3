package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class JungleFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("jungle_planks", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)).blockName("Jungle Planks").model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.JUNGLE_PLANKS)
            .variant("jungle_planks_braced", v -> v.description("Jungle Wood Panel").model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/jungle_planks/jungle_planks_log_bordered-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/jungle_planks/jungle_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("jungle_planks_braid", v -> v.description("Jungle Wood Braid"))
            .variant("jungle_planks_crude_horizontal", v -> v.description("Vertical Jungle Wood Planks in Disarray").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("jungle_planks_crude_paneling", v -> v.description("Jungle Wood Planks in Disarray").model(ChiselModelHandlers.CUBE_ALL))
            .variant("jungle_planks_crude_vertical", v -> v.description("Vertical Jungle Wood Planks in Disarray").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("jungle_planks_encased", v -> v.description("Encased Jungle Wood Panel"))
            .variant("jungle_planks_encased_large", v -> v.description("Large Long Jungle Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/jungle_planks/jungle_planks_large")))
            .variant("jungle_planks_encased_smooth", v -> v.description("Smooth Jungle Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/jungle_planks/jungle_planks_smooth-ctm_cornerless")))
            .variant("jungle_planks_large", v -> v.description("Large Long Jungle Wood Planks").model(ChiselModelHandlers.CUBE_ALL))
            .variant("jungle_planks_log_bordered", v -> v.description("Log Bordered Jungle Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/jungle_planks/jungle_planks_braced")))
            .variant("jungle_planks_log_cabin_ns", v -> v.description("Jungle Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/jungle_planks/jungle_planks_log_cabin_ns-ctm_vertical"))
                    .textureFromBase("ctm_horizontal"))
            .variant("jungle_planks_log_cabin_ew", v -> v.description("Jungle Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/jungle_planks/jungle_planks_braced"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("jungle_planks_paneling", v -> v.description("Jungle Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/jungle_planks/jungle_planks_paneling-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("jungle_planks_shipping", v -> v.description("Jungle Wood Crate"))
            .variant("jungle_planks_smooth", v -> v.description("Smooth Jungle Wood Planks"))
            .variant("jungle_planks_stacked", v -> v.description("Stacked Jungle Wood Tiles").model(ChiselModelHandlers.CUBE_ALL))
            .variant("jungle_planks_vertical", v -> v.description("Vertical Jungle Wood Planks").model(ChiselModelHandlers.CUBE_ALL)));

    private JungleFamily() {
    }
}
