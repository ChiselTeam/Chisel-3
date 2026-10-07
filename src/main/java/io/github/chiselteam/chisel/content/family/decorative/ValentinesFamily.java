package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ValentinesFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("valentines", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Valentine's Block"))
            .variant("valentines_block", variant -> variant
                    .description("Pink Chunk"))
            .variant("valentines_bricks", variant -> variant
                    .description("Valentines Bricks"))
            .variant("valentines_bumpy", variant -> variant
                    .description("Pink Dotted"))
            .variant("valentines_cobble", variant -> variant
                    .description("Pink Cobble"))
            .variant("valentines_companion", variant -> variant
                    .description("If it speaks, I wouldn't touch it"))
            .variant("valentines_empty", variant -> variant
                    .description("Pink Panel"))
            .variant("valentines_fire", variant -> variant
                    .description("There's a flame in my heart"))
            .variant("valentines_heart", variant -> variant
                    .description("Pink Heart in stone"))
            .variant("valentines_heart_gray", variant -> variant
                    .description("Heart in stone"))
            .variant("valentines_tile", variant -> variant
                    .description("Pink Tinted Heart in stone")));

    private ValentinesFamily() {
    }
}
