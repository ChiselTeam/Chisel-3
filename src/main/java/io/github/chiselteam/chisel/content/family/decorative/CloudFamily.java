package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CloudFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("cloud", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).noOcclusion())
                    .blockName("Cloud"))
            .variant("cloud_grid", variant -> variant
                    .description("Gridded Cloud Bricks"))
            .variant("cloud_large", variant -> variant
                    .description("Large Cloud Bricks"))
            .variant("cloud_normal", variant -> variant
                    .description("Cloud Block"))
            .variant("cloud_small", variant -> variant
                    .description("Small Cloud Bricks"))
            .variant("cloud_vertical", variant -> variant
                    .description("Small Vertical Cloud Bricks")));

    private CloudFamily() {
    }
}
