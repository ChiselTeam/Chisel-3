package io.github.chiselteam.chisel.content.family.wood;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DarkOakFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("dark_oak_planks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS))
                    .blockName("Dark Oak Planks")
                    .model(ChiselModelHandlers.CONNECTED))
            .existingBlock(Blocks.DARK_OAK_PLANKS)
            .variant("dark_oak_planks_braced", variant -> variant
                    .description("Dark Oak Wood Panel")
                    .model(ChiselModelHandlers.CONNECTED_TBS)
                    .textureFromBase("bottom")
                    .textureFromBase("side")
                    .texture("side-ctm_cornerless", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_log_bordered-ctm_cornerless"))
                    .textureFromBase("side-ctm_vertical")
                    .textureFromBase("top")
                    .textureAlias("top-ctm_cornerless", "side-ctm_cornerless")
                    .texture("top-ctm_horizontal", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_log_bordered"))
                    .textureFromBase("top-ctm_vertical"))
            .variant("dark_oak_planks_braid", variant -> variant
                    .description("Dark Oak Wood Braid"))
            .variant("dark_oak_planks_crude_horizontal", variant -> variant
                    .description("Vertical Dark Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("dark_oak_planks_crude_paneling", variant -> variant
                    .description("Dark Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("dark_oak_planks_crude_vertical", variant -> variant
                    .description("Vertical Dark Oak Wood Planks in Disarray")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("dark_oak_planks_encased", variant -> variant
                    .description("Encased Dark Oak Wood Panel"))
            .variant("dark_oak_planks_encased_large", variant -> variant
                    .description("Large Long Dark Oak Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_large")))
            .variant("dark_oak_planks_encased_smooth", variant -> variant
                    .description("Smooth Dark Oak Wood Planks")
                    .texture("ctm_cornerless", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_smooth-ctm_cornerless")))
            .variant("dark_oak_planks_large", variant -> variant
                    .description("Large Long Dark Oak Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("dark_oak_planks_log_bordered", variant -> variant
                    .description("Log Bordered Dark Oak Wood Panel")
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .texture("ctm_vertical", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_braced")))
            .variant("dark_oak_planks_log_cabin_ns", variant -> variant
                    .description("Dark Oak Wood Log Cabin (North-South)")
                    .texture("ctm_cornerless", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_log_cabin_ns-ctm_vertical"))
                    .textureFromBase("ctm_horizontal"))
            .variant("dark_oak_planks_log_cabin_ew", variant -> variant
                    .description("Dark Oak Wood Log Cabin (East-West)")
                    .texture("ctm_cornerless", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_braced"))
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("dark_oak_planks_paneling", variant -> variant
                    .description("Dark Oak Wood Panel")
                    .texture("ctm_cornerless", Chisel.prefix("block/dark_oak_planks/dark_oak_planks_paneling-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("dark_oak_planks_shipping", variant -> variant
                    .description("Dark Oak Wood Crate"))
            .variant("dark_oak_planks_smooth", variant -> variant
                    .description("Smooth Dark Oak Wood Planks"))
            .variant("dark_oak_planks_stacked", variant -> variant
                    .description("Stacked Dark Oak Wood Tiles")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("dark_oak_planks_vertical", variant -> variant
                    .description("Vertical Dark Oak Wood Planks")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private DarkOakFamily() {
    }
}
