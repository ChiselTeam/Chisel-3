package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class WeatheredCopperFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("weathered_copper", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER)).blockName("Weathered Copper").model(ChiselModelHandlers.CONNECTED).weathering().waxed())
            .existingBlock(Blocks.WEATHERED_COPPER)
            .variant("weathered_copper_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("weathered_copper_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("weathered_copper_caution", v -> v.description("Caution Stripes"))
            .variant("weathered_copper_crate", v -> v.description("Shipping Crate"))
            .variant("weathered_copper_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("weathered_copper_scaffold", v -> v.description("Scaffold"))
            .variant("weathered_copper_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private WeatheredCopperFamily() {
    }
}
