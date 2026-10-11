package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class InvarFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("invar", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Invar").model(ChiselModelHandlers.CONNECTED))
            .variant("invar_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("invar_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("invar_caution", v -> v.description("Caution Stripes"))
            .variant("invar_crate", v -> v.description("Shipping Crate"))
            .variant("invar_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("invar_scaffold", v -> v.description("Scaffold"))
            .variant("invar_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private InvarFamily() {
    }
}
