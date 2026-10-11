package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class NickelFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("nickel", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Nickel").model(ChiselModelHandlers.CONNECTED))
            .variant("nickel_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("nickel_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("nickel_caution", v -> v.description("Caution Stripes"))
            .variant("nickel_crate", v -> v.description("Shipping Crate").model(ChiselModelHandlers.CUBE_ALL))
            .variant("nickel_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("nickel_scaffold", v -> v.description("Scaffold"))
            .variant("nickel_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private NickelFamily() {
    }
}
