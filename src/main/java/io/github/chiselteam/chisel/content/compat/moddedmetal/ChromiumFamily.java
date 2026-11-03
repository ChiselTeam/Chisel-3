package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ChromiumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("chromium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Chromium").model(ChiselModelHandlers.CONNECTED))
            .variant("chromium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("chromium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("chromium_caution", v -> v.description("Caution Stripes"))
            .variant("chromium_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("chromium_scaffold", v -> v.description("Scaffold"))
            .variant("chromium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("chromium_zelda", v -> v.description("Zelda Chromium Block").model(ChiselModelHandlers.CUBE_ALL)));

    private ChromiumFamily() {
    }
}
