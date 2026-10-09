package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ShingleFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("shingles", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Shingles")
                    .model(ChiselModelHandlers.V4))
            .variant("shingles_1", variant -> variant
                    .description("Red Diagonal")
                    .textureFromBase("v4_top_left"))
            .variant("shingles_2", variant -> variant
                    .description("Red Tiny Squares")
                    .textureFromBase("v4_top_left"))
            .variant("shingles_3", variant -> variant
                    .description("Red Big Squares")
                    .textureFromBase("v4_top_left"))
            .variant("shingles_4", variant -> variant
                    .description("Black Diagonal")
                    .textureFromBase("v4_top_left"))
            .variant("shingles_5", variant -> variant
                    .description("Black Tiny Squares")
                    .textureFromBase("v4_top_left"))
            .variant("shingles_6", variant -> variant
                    .description("Black Big Squares")
                    .textureFromBase("v4_top_left")));

    private ShingleFamily() {
    }
}
