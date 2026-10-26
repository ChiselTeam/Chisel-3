package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CConcreteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("c_concrete", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white())).blockName("Concrete"))
            .variant("concrete_raw", v -> v.description("Concrete"))
            .variant("concrete_asphalt", v -> v.description("Asphalt"))
            .variant("concrete_block", v -> v.description("Concrete Block").model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("concrete_block_weathered", v -> v.description("Weathered Concrete Block"))
            .variant("concrete_blocks", v -> v.description("Small Concrete Blocks"))
            .variant("concrete_blocks_weathered", v -> v.description("Small Weathered Blocks"))
            .variant("concrete_raw_weathered", v -> v.description("Weathered Concrete")));

    private CConcreteFamily() {
    }
}
