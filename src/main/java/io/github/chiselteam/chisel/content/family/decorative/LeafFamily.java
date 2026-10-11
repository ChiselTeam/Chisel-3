package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LeafFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("leaf", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)).blockName("Leaf Block"))
            .existingBlock(Blocks.OAK_LEAVES)
            .variant("leaf_christmas_balls", v -> v.description("Christmas Balls"))
            .variant("leaf_christmas_lights", v -> v.description("Christmas Lights"))
            .variant("leaf_dead", v -> v.description("Dead Leaves"))
            .variant("leaf_fancy", v -> v.description("Fancy Leaves"))
            .variant("leaf_pink", v -> v.description("Pink Petals"))
            .variant("leaf_red", v -> v.description("Red Rose"))
            .variant("leaf_white", v -> v.description("White Rose")));

    private LeafFamily() {
    }
}
