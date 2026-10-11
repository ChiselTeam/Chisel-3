package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SeaLanternFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("sea_lantern", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN)).blockName("Sea Lantern"))
            .existingBlock(Blocks.SEA_LANTERN)
            .variant("sea_lantern_connected", v -> v.description("Connected").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED)
                    .texture("bg", Chisel.prefix("block/sea_lantern/sea_lantern_raw"))
                    .texture("ctm_cornerless", Chisel.prefix("block/magma/magma_dent-ctm_cornerless")))
            .variant("sea_lantern_dent", v -> v.description("Dented").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED)
                    .texture("bg", Chisel.prefix("block/sea_lantern/sea_lantern_raw")))
            .variant("sea_lantern_braid", v -> v.description("Braid"))
            .variant("sea_lantern_braid_invert", v -> v.description("Inverted Braid"))
            .variant("sea_lantern_layer", v -> v.description("Layered"))
            .variant("sea_lantern_layer_invert", v -> v.description("Inverted Layered"))
            .variant("sea_lantern_road", v -> v.description("Road"))
            .variant("sea_lantern_road_invert", v -> v.description("Inverted Road"))
            .variant("sea_lantern_checker_small", v -> v.description("Small Checker"))
            .variant("sea_lantern_checker", v -> v.description("Checker"))
            .variant("sea_lantern_bricks", v -> v.description("Bricks"))
            .variant("sea_lantern_bricks_invert", v -> v.description("Inverted Bricks"))
            .variant("sea_lantern_frame1", v -> v.description("Frame 1"))
            .variant("sea_lantern_raw", v -> v.description("Raw"))
            .variant("sea_lantern_pillar_dent", v -> v.description("Pillar Dented").model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/sea_lantern/sea_lantern_pillar_dent-top")))
            .variant("sea_lantern_pillar_dent_invert", v -> v.description("Inverted Pillar Dented").model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/sea_lantern/sea_lantern_pillar_dent_invert-top")))
            .variant("sea_lantern_frame2", v -> v.description("Frame 2").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED)
                    .texture("bg", Chisel.prefix("block/sea_lantern/sea_lantern_raw"))));

    private SeaLanternFamily() {
    }
}
