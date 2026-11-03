package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class EnderiumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("enderium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Enderium").model(ChiselModelHandlers.CONNECTED))
            .variant("enderium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("enderium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("enderium_caution", v -> v.description("Caution Stripes"))
            .variant("enderium_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("enderium_scaffold", v -> v.description("Scaffold"))
            .variant("enderium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("enderium_zelda", v -> v.description("Zelda Enderium Block").model(ChiselModelHandlers.CUBE_ALL)));

    private EnderiumFamily() {
    }
}
