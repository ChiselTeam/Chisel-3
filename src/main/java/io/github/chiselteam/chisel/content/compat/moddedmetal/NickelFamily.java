package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class NickelFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("nickel", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Nickel")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nickel_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("nickel_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("nickel_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("nickel_crate", variant -> variant
                    .description("Shipping Crate")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("nickel_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("nickel_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("nickel_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private NickelFamily() {
    }
}
