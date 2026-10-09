package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class InvarFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("invar", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Invar")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("invar_bad_greggy", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv"))
            .variant("invar_bolted", variant -> variant
                    .description("Fancy Bolted Plating")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("invar_caution", variant -> variant
                    .description("Caution Stripes"))
            .variant("invar_crate", variant -> variant
                    .description("Shipping Crate"))
            .variant("invar_machine", variant -> variant
                    .description("Machine")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("invar_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("invar_thermal", variant -> variant
                    .description("Thermal")
                    .model(ChiselModelHandlers.TBS)));

    private InvarFamily() {
    }
}
