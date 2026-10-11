package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PaperwallFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("paperwall", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)).blockName("Paperwall"))
            .variant("paperwall_boxed", v -> v.description("Boxed Paperwall"))
            .variant("paperwall_crossed", v -> v.description("Crossed Paperwall"))
            .variant("paperwall_door", v -> v.description("Door Shaped Paperwall"))
            .variant("paperwall_floral", v -> v.description("Floral Adorned Paperwall"))
            .variant("paperwall_plain", v -> v.description("Plain Paperwall"))
            .variant("paperwall_six", v -> v.description("Six Sectioned Paperwall"))
            .variant("paperwall_strike_horizontal", v -> v.description("Horizontally Striped Paperwall"))
            .variant("paperwall_strike_middle", v -> v.description("Middle Striped Paperwall"))
            .variant("paperwall_strike_vertical", v -> v.description("Vertically Striped Paperwall")));

    private PaperwallFamily() {
    }
}
