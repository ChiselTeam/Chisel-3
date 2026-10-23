package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class OakFramedGlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("oak_framed_glass", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)).blockName("Oak Framed Glass").model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
            .variant("oak_framed_glass", v -> v.description("Oak Framed Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless")))
            .variant("oak_framed_glass_panel_fancy", v -> v.description("Fancy Panel")
                    .texture("ctm_corner", Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick-ctm_vertical")))
            .variant("oak_framed_glass_panel", v -> v.description("Panel")
                    .texture("ctm_corner", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_vertical")))
            .variant("oak_framed_glass_bubble", v -> v.description("Bubble")
                    .texture("ctm_corner", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_vertical")))
            .variant("oak_framed_glass_frame_thick", v -> v.description("Thick Frame")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless")))
            .variant("oak_framed_glass_frame_thick_panel", v -> v.description("Thick Frame Panel")
                    .texture(Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick"))
                    .texture("ctm_corner", Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick_panel-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick_panel-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick_panel-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/oak_framed_glass/oak_framed_glass_frame_thick")))
            .variant("oak_framed_glass_tile", v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_brick", v -> v.description("Brick"))
            .variant("oak_framed_glass_line_vertical", v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL)
                    .texture(Chisel.prefix("block/oak_framed_glass/oak_framed_glass_line_vertical_panel")))
            .variant("oak_framed_glass_line_vertical_panel", v -> v.description("Vertical Line Panel"))
            .variant("oak_framed_glass_line_horizontal", v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL)
                    .texture(Chisel.prefix("block/oak_framed_glass/oak_framed_glass_line_horizontal_panel")))
            .variant("oak_framed_glass_line_horizontal_panel", v -> v.description("Horizontal Line Panel"))
            .variant("oak_framed_glass_arch_panel", v -> v.description("Arch Panel"))
            .variant("oak_framed_glass_arch_panel_1", v -> v.description("Arch Panel 1"))
            .variant("oak_framed_glass_arch_panel_2", v -> v.description("Arch Panel 2"))
            .variant("oak_framed_glass_arch_panel_3", v -> v.description("Arch Panel 3"))
            .variant("oak_framed_glass_scaffold", v -> v.description("Scaffold"))
            .variant("oak_framed_glass_scaffold_left", v -> v.description("Scaffold Left"))
            .variant("oak_framed_glass_scaffold_right", v -> v.description("Scaffold Right"))
            .variant("oak_framed_glass_basketweave", v -> v.description("Basketweave").model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_mosaic_1", v -> v.description("Mosaic 1"))
            .variant("oak_framed_glass_mosaic_2", v -> v.description("Mosaic 2"))
            .variant("oak_framed_glass_round", v -> v.description("Round")
                    .texture("ctm_corner", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/oak_framed_glass/oak_framed_glass-ctm_vertical")))
            .variant("oak_framed_glass_circle", v -> v.description("Circle"))
            .variant("oak_framed_glass_rings", v -> v.description("Rings")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless")))
            .variant("oak_framed_glass_diamond", v -> v.description("Diamond"))
            .variant("oak_framed_glass_frame_1", v -> v.description("Frame 1")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_rings-ctm_cornerless"))));

    private OakFramedGlassFamily() {
    }
}
