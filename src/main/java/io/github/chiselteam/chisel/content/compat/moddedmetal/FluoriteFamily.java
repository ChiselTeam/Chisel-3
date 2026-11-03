package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class FluoriteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("fluorite", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Fluorite").model(ChiselModelHandlers.CONNECTED))
            .variant("fluorite_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("fluorite_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("fluorite_caution", v -> v.description("Caution Stripes"))
            .variant("fluorite_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("fluorite_scaffold", v -> v.description("Scaffold"))
            .variant("fluorite_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("fluorite_zelda", v -> v.description("Zelda Fluorite Block").model(ChiselModelHandlers.CUBE_ALL)));

    private FluoriteFamily() {
    }
}
