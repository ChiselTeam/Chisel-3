package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LumiumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("lumium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Lumium").model(ChiselModelHandlers.CONNECTED))
            .variant("lumium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("lumium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("lumium_caution", v -> v.description("Caution Stripes"))
            .variant("lumium_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("lumium_scaffold", v -> v.description("Scaffold"))
            .variant("lumium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("lumium_zelda", v -> v.description("Zelda Lumium Block").model(ChiselModelHandlers.CUBE_ALL)));

    private LumiumFamily() {
    }
}
