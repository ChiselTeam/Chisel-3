package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PlutoniumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("plutonium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Plutonium").model(ChiselModelHandlers.CONNECTED))
            .variant("plutonium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("plutonium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("plutonium_caution", v -> v.description("Caution Stripes"))
            .variant("plutonium_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("plutonium_scaffold", v -> v.description("Scaffold"))
            .variant("plutonium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("plutonium_zelda", v -> v.description("Zelda Plutonium Block").model(ChiselModelHandlers.CUBE_ALL)));

    private PlutoniumFamily() {
    }
}
