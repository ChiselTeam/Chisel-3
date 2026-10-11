package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BronzeFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bronze", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Bronze").model(ChiselModelHandlers.CONNECTED))
            .variant("bronze_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("bronze_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("bronze_caution", v -> v.description("Caution Stripes"))
            .variant("bronze_crate", v -> v.description("Shipping Crate"))
            .variant("bronze_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("bronze_scaffold", v -> v.description("Scaffold"))
            .variant("bronze_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private BronzeFamily() {
    }
}
