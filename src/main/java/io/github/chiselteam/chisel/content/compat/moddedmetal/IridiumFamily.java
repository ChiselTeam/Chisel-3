package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class IridiumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("iridium", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Iridium").model(ChiselModelHandlers.CONNECTED))
            .variant("iridium_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("iridium_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("iridium_caution", v -> v.description("Caution Stripes"))
            .variant("iridium_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("iridium_scaffold", v -> v.description("Scaffold"))
            .variant("iridium_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("iridium_zelda", v -> v.description("Zelda Iridium Block").model(ChiselModelHandlers.CUBE_ALL)));

    private IridiumFamily() {
    }
}
