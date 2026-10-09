package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CopperFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("copper", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK))
                    .blockName("Block of Copper")
                    .model(ChiselModelHandlers.CONNECTED)
                    .weathering()
                    .waxed())
            .existingBlock(Blocks.COPPER_BLOCK)
            .variant("copper_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("copper_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("copper_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("copper_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("copper_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("copper_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("copper_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private CopperFamily() {
    }
}
