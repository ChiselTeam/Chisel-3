package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CobaltFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("cobalt", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Cobalt")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobalt_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("cobalt_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("cobalt_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("cobalt_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("cobalt_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("cobalt_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("cobalt_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private CobaltFamily() {
    }
}
