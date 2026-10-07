package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SeaLanternFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("sea_lantern", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN))
                    .blockName("Sea Lantern"))
            .existingBlock(Blocks.SEA_LANTERN)
            .variant("sea_lantern_connected", variant -> variant
                    .description("Connected")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED)
                    .texture("bg", Chisel.prefix("block/sea_lantern/sea_lantern_raw"))
                    .texture("ctm_cornerless", Chisel.prefix("block/magma/magma_dent-ctm_cornerless")))
            .variant("sea_lantern_dent", variant -> variant
                    .description("Dented")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED)
                    .texture("bg", Chisel.prefix("block/sea_lantern/sea_lantern_raw")))
            .variant("sea_lantern_braid", variant -> variant
                    .description("Braid"))
            .variant("sea_lantern_braid_invert", variant -> variant
                    .description("Inverted Braid"))
            .variant("sea_lantern_layer", variant -> variant
                    .description("Layered"))
            .variant("sea_lantern_layer_invert", variant -> variant
                    .description("Inverted Layered"))
            .variant("sea_lantern_road", variant -> variant
                    .description("Road"))
            .variant("sea_lantern_road_invert", variant -> variant
                    .description("Inverted Road"))
            .variant("sea_lantern_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("sea_lantern_checker", variant -> variant
                    .description("Checker"))
            .variant("sea_lantern_bricks", variant -> variant
                    .description("Bricks"))
            .variant("sea_lantern_bricks_invert", variant -> variant
                    .description("Inverted Bricks"))
            .variant("sea_lantern_frame1", variant -> variant
                    .description("Frame 1"))
            .variant("sea_lantern_raw", variant -> variant
                    .description("Raw"))
            .variant("sea_lantern_pillar_dent", variant -> variant
                    .description("Pillar Dented")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/sea_lantern/sea_lantern_pillar_dent-top")))
            .variant("sea_lantern_pillar_dent_invert", variant -> variant
                    .description("Inverted Pillar Dented")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/sea_lantern/sea_lantern_pillar_dent_invert-top")))
            .variant("sea_lantern_frame2", variant -> variant
                    .description("Frame 2")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED)
                    .texture("bg", Chisel.prefix("block/sea_lantern/sea_lantern_raw"))));

    private SeaLanternFamily() {
    }
}
