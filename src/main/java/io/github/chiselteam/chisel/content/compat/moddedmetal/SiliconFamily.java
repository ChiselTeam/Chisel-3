package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SiliconFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("silicon", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Silicon").model(ChiselModelHandlers.CONNECTED))
            .variant("silicon_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("silicon_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("silicon_caution", v -> v.description("Caution Stripes"))
            .variant("silicon_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("silicon_scaffold", v -> v.description("Scaffold"))
            .variant("silicon_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("silicon_zelda", v -> v.description("Zelda Silicon Block").model(ChiselModelHandlers.CUBE_ALL)));

    private SiliconFamily() {
    }
}
