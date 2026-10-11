package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class OakFramedGlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("oak_framed_glass", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)).blockName("Oak Framed Glass").model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
            .variant("oak_framed_glass", v -> v.description("Oak Framed Glass"))
            .variant("oak_framed_glass_panel_fancy", v -> v.description("Fancy Panel"))
            .variant("oak_framed_glass_panel", v -> v.description("Panel"))
            .variant("oak_framed_glass_bubble", v -> v.description("Bubble"))
            .variant("oak_framed_glass_frame_thick", v -> v.description("Thick Frame"))
            .variant("oak_framed_glass_frame_thick_panel", v -> v.description("Thick Frame Panel"))
            .variant("oak_framed_glass_tile", v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_brick", v -> v.description("Brick"))
            .variant("oak_framed_glass_line_vertical", v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_line_vertical_panel", v -> v.description("Vertical Line Panel"))
            .variant("oak_framed_glass_line_horizontal", v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL))
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
            .variant("oak_framed_glass_round", v -> v.description("Round"))
            .variant("oak_framed_glass_circle", v -> v.description("Circle"))
            .variant("oak_framed_glass_rings", v -> v.description("Rings"))
            .variant("oak_framed_glass_diamond", v -> v.description("Diamond"))
            .variant("oak_framed_glass_frame_1", v -> v.description("Frame 1")));

    private OakFramedGlassFamily() {
    }
}
