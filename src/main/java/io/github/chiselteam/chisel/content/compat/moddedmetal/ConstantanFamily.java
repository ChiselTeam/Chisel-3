package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ConstantanFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("constantan", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Constantan").model(ChiselModelHandlers.CONNECTED))
            .variant("constantan_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("constantan_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("constantan_caution", v -> v.description("Caution Stripes"))
            .variant("constantan_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("constantan_scaffold", v -> v.description("Scaffold"))
            .variant("constantan_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("constantan_zelda", v -> v.description("Zelda Constantan Block").model(ChiselModelHandlers.CUBE_ALL)));

    private ConstantanFamily() {
    }
}
