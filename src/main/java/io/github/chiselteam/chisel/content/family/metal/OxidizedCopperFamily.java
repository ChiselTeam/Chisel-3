package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class OxidizedCopperFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("oxidized_copper", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER))
                    .blockName("Oxidized Copper")
                    .model(ChiselModelHandlers.CONNECTED)
                    .weathering()
                    .waxed())
            .existingBlock(Blocks.OXIDIZED_COPPER)
            .variant("oxidized_copper_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("oxidized_copper_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oxidized_copper_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("oxidized_copper_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("oxidized_copper_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oxidized_copper_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("oxidized_copper_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private OxidizedCopperFamily() {
    }
}
