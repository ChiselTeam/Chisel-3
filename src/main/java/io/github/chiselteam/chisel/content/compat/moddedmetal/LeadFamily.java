package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LeadFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("lead", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Lead")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("lead_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("lead_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("lead_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("lead_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("lead_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("lead_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("lead_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private LeadFamily() {
    }
}
