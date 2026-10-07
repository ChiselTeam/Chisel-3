package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AluminumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("aluminum", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Aluminum")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("aluminum_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("aluminum_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("aluminum_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("aluminum_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("aluminum_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("aluminum_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("aluminum_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private AluminumFamily() {
    }
}
