package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LeafFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("leaf", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))
                    .blockName("Leaf Block"))
            .existingBlock(Blocks.OAK_LEAVES)
            .variant("leaf_christmas_balls", variant -> variant
                    .description("Christmas Balls"))
            .variant("leaf_christmas_lights", variant -> variant
                    .description("Christmas Lights"))
            .variant("leaf_dead", variant -> variant
                    .description("Dead Leaves"))
            .variant("leaf_fancy", variant -> variant
                    .description("Fancy Leaves"))
            .variant("leaf_pink", variant -> variant
                    .description("Pink Petals"))
            .variant("leaf_red", variant -> variant
                    .description("Red Rose"))
            .variant("leaf_white", variant -> variant
                    .description("White Rose")));

    private LeafFamily() {
    }
}
