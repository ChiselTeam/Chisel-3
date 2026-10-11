package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class EnergizedVoidstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("energized_voidstone", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Energized Voidstone").model(ChiselModelHandlers.MULTI_LAYER))
            .variant("energized_voidstone_bevel", v -> v.description("Beveled Voidstone").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)
                    .texture("bg", Chisel.prefix("block/energized_voidstone/energized_voidstone_eye-bg"))
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless")))
            .variant("energized_voidstone_eye", v -> v.description("Eye Energized Voidstone"))
            .variant("energized_voidstone_metal", v -> v.description("Metal-Bordered Energized Voidstone").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)
                    .texture("bg", Chisel.prefix("block/energized_voidstone/energized_voidstone_eye-bg"))
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless")))
            .variant("energized_voidstone_raw", v -> v.description("Raw Energized Voidstone")
                    .texture("bg", Chisel.prefix("block/energized_voidstone/energized_voidstone_eye-bg")))
            .variant("energized_voidstone_runic", v -> v.description("Runic Energized Voidstone")
                    .texture("bg", Chisel.prefix("block/energized_voidstone/energized_voidstone_eye-bg")))
            .variant("energized_voidstone_skull", v -> v.description("Skull Energized Voidstone")
                    .texture("bg", Chisel.prefix("block/energized_voidstone/energized_voidstone_eye-bg")))
            .variant("energized_voidstone_smooth", v -> v.description("Smooth Energized Voidstone")
                    .texture("bg", Chisel.prefix("block/energized_voidstone/energized_voidstone_eye-bg")))
            .variant("energized_voidstone_tiles", v -> v.description("Large Energized Voidstone Tiles")
                    .texture("bg", Chisel.prefix("block/energized_voidstone/energized_voidstone_eye-bg"))));

    private EnergizedVoidstoneFamily() {
    }
}
