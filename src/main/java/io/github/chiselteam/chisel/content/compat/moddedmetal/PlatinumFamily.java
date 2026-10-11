package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PlatinumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("platinum", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Platinum").model(ChiselModelHandlers.CONNECTED))
            .variant("platinum_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("platinum_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("platinum_caution", v -> v.description("Caution Stripes"))
            .variant("platinum_crate", v -> v.description("Shipping Crate"))
            .variant("platinum_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("platinum_scaffold", v -> v.description("Scaffold"))
            .variant("platinum_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private PlatinumFamily() {
    }
}
