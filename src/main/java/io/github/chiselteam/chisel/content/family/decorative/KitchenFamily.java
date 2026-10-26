package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class KitchenFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("kitchen", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white())).blockName("Kitchen Block"))
            .variant("kitchen_checker", v -> v.description("Checker Kitchen")
                    .texture(Chisel.prefix("block/kitchen/kitchen_checker_large")))
            .variant("kitchen_checker_small", v -> v.description("Checker Small Kitchen"))
            .variant("kitchen_checker_large", v -> v.description("Checker Large Kitchen").model(ChiselModelHandlers.V4)
                    .texture("v4_top_left", Chisel.prefix("block/kitchen/kitchen_checker_large-v4_bottom_right"))
                    .texture("v4_top_right", Chisel.prefix("block/kitchen/kitchen_checker_large-v4_bottom_left")))
            .variant("kitchen_diamond", v -> v.description("Diamond Kitchen"))
            .variant("kitchen_diamond_2", v -> v.description("Diamond Kitchen"))
            .variant("kitchen_encaustic", v -> v.description("Encaustic Kitchen"))
            .variant("kitchen_frame", v -> v.description("Frame Kitchen")
                    .texture(Chisel.prefix("block/kitchen/kitchen_frame_connected")))
            .variant("kitchen_frame_connected", v -> v.description("Frame Kitchen Connected").model(ChiselModelHandlers.CONNECTED))
            .variant("kitchen_grid_encased_connected", v -> v.description("Encased Grid Kitchen Connected").model(ChiselModelHandlers.CONNECTED))
            .variant("kitchen_stripes", v -> v.description("Stripes Kitchen").model(ChiselModelHandlers.CONNECTED))
            .variant("kitchen_stripes_encased_connected", v -> v.description("Encased Stripes Kitchen Connected").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/kitchen/kitchen_stripes-ctm_cornerless")))
            .variant("kitchen_stripes_small", v -> v.description("Small Stripes Kitchen"))
            .variant("kitchen_stripes_small_encased_connected", v -> v.description("Encased Small Stripes Kitchen Connected").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/kitchen/kitchen_stripes_small"))));

    private KitchenFamily() {
    }
}
