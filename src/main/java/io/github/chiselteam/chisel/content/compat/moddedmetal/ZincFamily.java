package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ZincFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("zinc", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Zinc").model(ChiselModelHandlers.CONNECTED))
            .variant("zinc_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("zinc_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("zinc_caution", v -> v.description("Caution Stripes"))
            .variant("zinc_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("zinc_scaffold", v -> v.description("Scaffold"))
            .variant("zinc_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("zinc_zelda", v -> v.description("Zelda Zinc Block").model(ChiselModelHandlers.CUBE_ALL)));

    private ZincFamily() {
    }
}
