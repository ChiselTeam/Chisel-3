package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BronzeFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bronze", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Bronze")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bronze_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("bronze_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("bronze_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("bronze_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("bronze_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("bronze_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("bronze_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private BronzeFamily() {
    }
}
