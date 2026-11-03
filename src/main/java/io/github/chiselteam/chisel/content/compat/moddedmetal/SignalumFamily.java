package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SignalumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("signalum", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Signalum").model(ChiselModelHandlers.CONNECTED))
            .variant("signalum_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("signalum_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("signalum_caution", v -> v.description("Caution Stripes"))
            .variant("signalum_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("signalum_scaffold", v -> v.description("Scaffold"))
            .variant("signalum_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("signalum_zelda", v -> v.description("Zelda Signalum Block").model(ChiselModelHandlers.CUBE_ALL)));

    private SignalumFamily() {
    }
}
