package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class UraniumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("uranium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Uranium").model(ChiselModelHandlers.CONNECTED))
            .variant("uranium_125", v -> v.description("125").model(ChiselModelHandlers.CUBE_ALL))
            .variant("uranium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("uranium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("uranium_caution", v -> v.description("Caution Stripes"))
            .variant("uranium_crate", v -> v.description("Shipping Crate"))
            .variant("uranium_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("uranium_scaffold", v -> v.description("Scaffold"))
            .variant("uranium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private UraniumFamily() {
    }
}
