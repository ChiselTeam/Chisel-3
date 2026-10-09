package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ElectrumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("electrum", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Electrum")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("electrum_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("electrum_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("electrum_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("electrum_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("electrum_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("electrum_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("electrum_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private ElectrumFamily() {
    }
}
