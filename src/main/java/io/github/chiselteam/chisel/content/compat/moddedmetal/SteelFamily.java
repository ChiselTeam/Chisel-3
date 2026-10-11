package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SteelFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("steel", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Steel").model(ChiselModelHandlers.CONNECTED))
            .variant("steel_125", v -> v.description("125").model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("steel_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_caution", v -> v.description("Caution Stripes"))
            .variant("steel_crate", v -> v.description("Shipping Crate"))
            .variant("steel_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("steel_scaffold", v -> v.description("Scaffold"))
            .variant("steel_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private SteelFamily() {
    }
}
