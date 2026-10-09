package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SteelFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("steel", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Steel")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("steel_125", variant -> variant
                    .description("125")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("steel_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("steel_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("steel_egregious", variant -> variant
                    .description("Egregiously Bordered Block"))
            .variant("steel_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("steel_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private SteelFamily() {
    }
}
