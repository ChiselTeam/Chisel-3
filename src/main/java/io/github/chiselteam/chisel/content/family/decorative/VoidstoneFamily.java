package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class VoidstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("voidstone", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Voidstone"))
            .variant("voidstone_bevel", v -> v.description("Beveled Voidstone").model(ChiselModelHandlers.CONNECTED))
            .variant("voidstone_eye", v -> v.description("Eye Voidstone"))
            .variant("voidstone_metal", v -> v.description("Metal-Bordered Voidstone").model(ChiselModelHandlers.CONNECTED))
            .variant("voidstone_raw", v -> v.description("Raw Voidstone"))
            .variant("voidstone_runic", v -> v.description("Runic Voidstone"))
            .variant("voidstone_skull", v -> v.description("Skull Voidstone"))
            .variant("voidstone_smooth", v -> v.description("Smooth Voidstone"))
            .variant("voidstone_tiles", v -> v.description("Large Voidstone Tiles")));

    private VoidstoneFamily() {
    }
}
