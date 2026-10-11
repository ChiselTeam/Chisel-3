package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AluminumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("aluminum", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Aluminum").model(ChiselModelHandlers.CONNECTED))
            .variant("aluminum_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("aluminum_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("aluminum_caution", v -> v.description("Caution Stripes"))
            .variant("aluminum_crate", v -> v.description("Shipping Crate"))
            .variant("aluminum_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("aluminum_scaffold", v -> v.description("Scaffold"))
            .variant("aluminum_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private AluminumFamily() {
    }
}
