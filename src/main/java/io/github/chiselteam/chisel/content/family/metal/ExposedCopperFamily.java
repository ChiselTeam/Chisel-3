package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ExposedCopperFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("exposed_copper", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK.weathering().exposed())).blockName("Exposed Copper").model(ChiselModelHandlers.CONNECTED).weathering().waxed())
            .existingBlock(Blocks.COPPER_BLOCK.weathering().exposed())
            .variant("exposed_copper_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("exposed_copper_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("exposed_copper_caution", v -> v.description("Caution Stripes"))
            .variant("exposed_copper_crate", v -> v.description("Shipping Crate"))
            .variant("exposed_copper_machine", v -> v.description("Machine").model(ChiselModelHandlers.CUBE_ALL))
            .variant("exposed_copper_scaffold", v -> v.description("Scaffold"))
            .variant("exposed_copper_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS)));

    private ExposedCopperFamily() {
    }
}
