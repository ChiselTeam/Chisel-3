package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GraphiteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("graphite", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Graphite").model(ChiselModelHandlers.CONNECTED))
            .variant("graphite_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("graphite_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("graphite_caution", v -> v.description("Caution Stripes"))
            .variant("graphite_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("graphite_scaffold", v -> v.description("Scaffold"))
            .variant("graphite_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("graphite_zelda", v -> v.description("Zelda Graphite Block").model(ChiselModelHandlers.CUBE_ALL)));

    private GraphiteFamily() {
    }
}
