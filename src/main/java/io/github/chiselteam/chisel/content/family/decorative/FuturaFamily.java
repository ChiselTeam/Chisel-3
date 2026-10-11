package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class FuturaFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("futura", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Futura Block").model(ChiselModelHandlers.MULTI_LAYER))
            .variant("futura_controller", v -> v.description("Applied Labyrinthic Neon Lines"))
            .variant("futura_controller_purple", v -> v.description("Applied Labyrinthic Neon Lines")
                    .texture(Chisel.prefix("block/futura/futura_controller"))
                    .texture("bg", Chisel.prefix("block/futura/futura_controller_purple-bg")))
            .variant("futura_rainbow", v -> v.description("Poptart Rainbow Screen"))
            //.variant("futura_rainbow_connected", variant -> variant.model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)) joshy - will do this when orange fixed
            //.variant("futura_rainbow_orange", variant -> variant.model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("futura_screen_cyan", v -> v.description("Glowing Screen with Cyan Borders").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("futura_screen_gray", v -> v.description("Glowing Screen with Metallic Borders").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)
                    .texture("bg", Chisel.prefix("block/futura/futura_screen_cyan-bg"))
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless")))
            .variant("futura_matrix", v -> v.description("Matrix").model(ChiselModelHandlers.CUBE_ALL))
            .variant("futura_matrix_purple", v -> v.description("Matrix Purple").model(ChiselModelHandlers.CUBE_ALL)));

    private FuturaFamily() {
    }
}
