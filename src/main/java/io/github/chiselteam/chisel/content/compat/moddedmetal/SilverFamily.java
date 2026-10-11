package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SilverFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("silver", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Silver").model(ChiselModelHandlers.CONNECTED))
            .variant("silver_125", v -> v.description("125").model(ChiselModelHandlers.CUBE_ALL))
            .variant("silver_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("silver_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("silver_caution", v -> v.description("Caution Stripes"))
            .variant("silver_crate", v -> v.description("Shipping Crate"))
            .variant("silver_scaffold", v -> v.description("Scaffold"))
            .variant("silver_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private SilverFamily() {
    }
}
