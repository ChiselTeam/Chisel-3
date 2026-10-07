package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class UraniumFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("uranium", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Uranium")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("uranium_125", variant -> variant
                    .description("125")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("uranium_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("uranium_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("uranium_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("uranium_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("uranium_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("uranium_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("uranium_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private UraniumFamily() {
    }
}
