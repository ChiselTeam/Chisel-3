package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PaperwallFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("paperwall", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL))
                    .blockName("Paperwall"))
            .variant("paperwall_boxed", variant -> variant
                    .description("Boxed Paperwall"))
            .variant("paperwall_crossed", variant -> variant
                    .description("Crossed Paperwall"))
            .variant("paperwall_door", variant -> variant
                    .description("Door Shaped Paperwall"))
            .variant("paperwall_floral", variant -> variant
                    .description("Floral Adorned Paperwall"))
            .variant("paperwall_plain", variant -> variant
                    .description("Plain Paperwall"))
            .variant("paperwall_six", variant -> variant
                    .description("Six Sectioned Paperwall"))
            .variant("paperwall_strike_horizontal", variant -> variant
                    .description("Horizontally Striped Paperwall"))
            .variant("paperwall_strike_middle", variant -> variant
                    .description("Middle Striped Paperwall"))
            .variant("paperwall_strike_vertical", variant -> variant
                    .description("Vertically Striped Paperwall")));

    private PaperwallFamily() {
    }
}
