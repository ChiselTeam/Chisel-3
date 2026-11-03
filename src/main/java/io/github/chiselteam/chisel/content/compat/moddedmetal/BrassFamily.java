package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BrassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("brass", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Brass").model(ChiselModelHandlers.CONNECTED))
            .variant("brass_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("brass_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("brass_caution", v -> v.description("Caution Stripes"))
            .variant("brass_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("brass_scaffold", v -> v.description("Scaffold"))
            .variant("brass_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("brass_zelda", v -> v.description("Zelda Brass Block").model(ChiselModelHandlers.CUBE_ALL)));

    private BrassFamily() {
    }
}
