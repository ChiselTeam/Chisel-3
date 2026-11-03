package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SaltFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("salt", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Salt").model(ChiselModelHandlers.CONNECTED))
            .variant("salt_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("salt_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("salt_caution", v -> v.description("Caution Stripes"))
            .variant("salt_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("salt_scaffold", v -> v.description("Scaffold"))
            .variant("salt_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("salt_zelda", v -> v.description("Zelda Salt Block").model(ChiselModelHandlers.CUBE_ALL)));

    private SaltFamily() {
    }
}
