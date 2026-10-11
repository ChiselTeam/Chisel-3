package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ElectrumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("electrum", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Electrum").model(ChiselModelHandlers.CONNECTED))
            .variant("electrum_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("electrum_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("electrum_caution", v -> v.description("Caution Stripes"))
            .variant("electrum_crate", v -> v.description("Shipping Crate"))
            .variant("electrum_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("electrum_scaffold", v -> v.description("Scaffold"))
            .variant("electrum_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private ElectrumFamily() {
    }
}
