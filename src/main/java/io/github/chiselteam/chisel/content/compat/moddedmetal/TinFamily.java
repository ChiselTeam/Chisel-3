package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TinFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tin", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Tin")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tin_125", variant -> variant
                    .description("125")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("tin_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("tin_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("tin_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("tin_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("tin_egregious", variant -> variant
                    .description("Egregiously Bordered Block"))
            .variant("tin_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("tin_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private TinFamily() {
    }
}
