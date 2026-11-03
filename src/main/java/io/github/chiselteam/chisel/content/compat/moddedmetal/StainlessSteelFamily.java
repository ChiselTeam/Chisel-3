package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class StainlessSteelFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("stainless_steel", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Stainless Steel").model(ChiselModelHandlers.CONNECTED))
            .variant("stainless_steel_bad_greggy", v -> v.description("An Old Relic from the land of Oneteufyv"))
            .variant("stainless_steel_bolted", v -> v.description("Fancy Bolted Plating").model(ChiselModelHandlers.CUBE_ALL))
            .variant("stainless_steel_caution", v -> v.description("Caution Stripes"))
            .variant("stainless_steel_egregious", v -> v.description("Egregiously Bordered Block"))
            .variant("stainless_steel_scaffold", v -> v.description("Scaffold"))
            .variant("stainless_steel_thermal", v -> v.description("Thermal").model(ChiselModelHandlers.TBS))
            .variant("stainless_steel_zelda", v -> v.description("Zelda Stainless Steel Block").model(ChiselModelHandlers.CUBE_ALL)));

    private StainlessSteelFamily() {
    }
}
