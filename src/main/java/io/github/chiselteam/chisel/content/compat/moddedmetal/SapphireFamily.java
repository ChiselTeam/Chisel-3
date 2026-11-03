package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SapphireFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("sapphire", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Sapphire").model(ChiselModelHandlers.CONNECTED))
            .variant("sapphire_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("sapphire_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("sapphire_caution", v -> v.description("Caution Stripes"))
            .variant("sapphire_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("sapphire_scaffold", v -> v.description("Scaffold"))
            .variant("sapphire_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("sapphire_zelda", v -> v.description("Zelda Sapphire Block").model(ChiselModelHandlers.CUBE_ALL)));

    private SapphireFamily() {
    }
}
