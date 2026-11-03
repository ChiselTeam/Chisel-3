package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RubyFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("ruby", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Ruby").model(ChiselModelHandlers.CONNECTED))
            .variant("ruby_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("ruby_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("ruby_caution", v -> v.description("Caution Stripes"))
            .variant("ruby_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("ruby_scaffold", v -> v.description("Scaffold"))
            .variant("ruby_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("ruby_zelda", v -> v.description("Zelda Ruby Block").model(ChiselModelHandlers.CUBE_ALL)));

    private RubyFamily() {
    }
}
