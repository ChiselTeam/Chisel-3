package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CobaltFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("cobalt", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Cobalt").model(ChiselModelHandlers.CONNECTED))
            .variant("cobalt_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("cobalt_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("cobalt_caution", v -> v.description("Caution Stripes"))
            .variant("cobalt_crate", v -> v.description("Shipping Crate"))
            .variant("cobalt_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("cobalt_scaffold", v -> v.description("Scaffold"))
            .variant("cobalt_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private CobaltFamily() {
    }
}
