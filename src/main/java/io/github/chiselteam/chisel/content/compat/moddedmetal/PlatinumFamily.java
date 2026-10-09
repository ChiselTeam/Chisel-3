package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PlatinumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("platinum", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Platinum")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("platinum_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("platinum_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("platinum_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("platinum_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("platinum_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("platinum_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("platinum_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private PlatinumFamily() {
    }
}
