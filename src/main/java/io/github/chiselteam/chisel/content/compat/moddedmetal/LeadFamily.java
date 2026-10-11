package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LeadFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("lead", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Lead").model(ChiselModelHandlers.CONNECTED))
            .variant("lead_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("lead_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("lead_caution", v -> v.description("Caution Stripes"))
            .variant("lead_crate", v -> v.description("Shipping Crate"))
            .variant("lead_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("lead_scaffold", v -> v.description("Scaffold"))
            .variant("lead_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private LeadFamily() {
    }
}
