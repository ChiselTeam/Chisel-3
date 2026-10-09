package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CConcreteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("c_concrete", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE))
                    .blockName("Concrete"))
            .variant("concrete_raw", variant -> variant
                    .description("Concrete"))
            .variant("concrete_asphalt", variant -> variant
                    .description("Asphalt"))
            .variant("concrete_block", variant -> variant
                    .description("Concrete Block")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("concrete_block_weathered", variant -> variant
                    .description("Weathered Concrete Block"))
            .variant("concrete_blocks", variant -> variant
                    .description("Small Concrete Blocks"))
            .variant("concrete_blocks_weathered", variant -> variant
                    .description("Small Weathered Blocks"))
            .variant("concrete_raw_weathered", variant -> variant
                    .description("Weathered Concrete")));

    private CConcreteFamily() {
    }
}
