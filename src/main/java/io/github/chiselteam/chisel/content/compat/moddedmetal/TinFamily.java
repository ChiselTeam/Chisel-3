package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TinFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tin", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Tin").model(ChiselModelHandlers.CONNECTED))
            .variant("tin_125", v -> v.description("125").model(ChiselModelHandlers.CUBE_ALL))
            .variant("tin_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("tin_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("tin_caution", v -> v.description("Caution Stripes"))
            .variant("tin_crate", v -> v.description("Shipping Crate"))
            .variant("tin_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("tin_scaffold", v -> v.description("Scaffold"))
            .variant("tin_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private TinFamily() {
    }
}
