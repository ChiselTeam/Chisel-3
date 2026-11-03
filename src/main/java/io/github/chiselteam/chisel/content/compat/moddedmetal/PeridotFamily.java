package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PeridotFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("peridot", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Peridot").model(ChiselModelHandlers.CONNECTED))
            .variant("peridot_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("peridot_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("peridot_caution", v -> v.description("Caution Stripes"))
            .variant("peridot_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("peridot_scaffold", v -> v.description("Scaffold"))
            .variant("peridot_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("peridot_zelda", v -> v.description("Zelda Peridot Block").model(ChiselModelHandlers.CUBE_ALL)));

    private PeridotFamily() {
    }
}
