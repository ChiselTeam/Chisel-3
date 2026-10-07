package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SilverFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("silver", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Silver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("silver_125", variant -> variant
                    .description("125")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("silver_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("silver_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("silver_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("silver_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("silver_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("silver_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private SilverFamily() {
    }
}
