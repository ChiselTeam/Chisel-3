package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class OsmiumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("osmium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Osmium").model(ChiselModelHandlers.CONNECTED))
            .variant("osmium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("osmium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("osmium_caution", v -> v.description("Caution Stripes"))
            .variant("osmium_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("osmium_scaffold", v -> v.description("Scaffold"))
            .variant("osmium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("osmium_zelda", v -> v.description("Zelda Osmium Block").model(ChiselModelHandlers.CUBE_ALL)));

    private OsmiumFamily() {
    }
}
