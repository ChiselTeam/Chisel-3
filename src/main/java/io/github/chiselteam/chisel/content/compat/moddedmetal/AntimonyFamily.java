package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AntimonyFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("antimony", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Antimony").model(ChiselModelHandlers.CONNECTED))
            .variant("antimony_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("antimony_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("antimony_caution", v -> v.description("Caution Stripes"))
            .variant("antimony_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("antimony_scaffold", v -> v.description("Scaffold"))
            .variant("antimony_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("antimony_zelda", v -> v.description("Zelda Antimony Block").model(ChiselModelHandlers.CUBE_ALL)));

    private AntimonyFamily() {
    }
}
