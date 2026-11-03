package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TitaniumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("titanium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Titanium").model(ChiselModelHandlers.CONNECTED))
            .variant("titanium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("titanium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("titanium_caution", v -> v.description("Caution Stripes"))
            .variant("titanium_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("titanium_scaffold", v -> v.description("Scaffold"))
            .variant("titanium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("titanium_zelda", v -> v.description("Zelda Titanium Block").model(ChiselModelHandlers.CUBE_ALL)));

    private TitaniumFamily() {
    }
}
