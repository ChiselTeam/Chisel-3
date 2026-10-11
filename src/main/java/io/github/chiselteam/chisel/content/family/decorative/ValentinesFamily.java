package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ValentinesFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("valentines", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Valentine's Block"))
            .variant("valentines_block", v -> v.description("Pink Chunk"))
            .variant("valentines_bricks", v -> v.description("Valentines Bricks"))
            .variant("valentines_bumpy", v -> v.description("Pink Dotted"))
            .variant("valentines_cobble", v -> v.description("Pink Cobble"))
            .variant("valentines_companion", v -> v.description("If it speaks, I wouldn't touch it"))
            .variant("valentines_empty", v -> v.description("Pink Panel"))
            .variant("valentines_fire", v -> v.description("There's a flame in my heart"))
            .variant("valentines_heart", v -> v.description("Pink Heart in stone"))
            .variant("valentines_heart_gray", v -> v.description("Heart in stone"))
            .variant("valentines_tile", v -> v.description("Pink Tinted Heart in stone")));

    private ValentinesFamily() {
    }
}
