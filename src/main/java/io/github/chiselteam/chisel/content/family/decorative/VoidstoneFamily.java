package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class VoidstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("voidstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Voidstone"))
            .variant("voidstone_bevel", variant -> variant
                    .description("Beveled Voidstone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("voidstone_eye", variant -> variant
                    .description("Eye Voidstone"))
            .variant("voidstone_metal", variant -> variant
                    .description("Metal-Bordered Voidstone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("voidstone_raw", variant -> variant
                    .description("Raw Voidstone"))
            .variant("voidstone_runic", variant -> variant
                    .description("Runic Voidstone"))
            .variant("voidstone_skull", variant -> variant
                    .description("Skull Voidstone"))
            .variant("voidstone_smooth", variant -> variant
                    .description("Smooth Voidstone"))
            .variant("voidstone_tiles", variant -> variant
                    .description("Large Voidstone Tiles")));

    private VoidstoneFamily() {
    }
}
