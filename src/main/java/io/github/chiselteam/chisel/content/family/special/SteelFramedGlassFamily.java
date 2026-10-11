package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SteelFramedGlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("steel_framed_glass", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)).blockName("Steel Framed Glass").model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
            .variant("steel_framed_glass", v -> v.description("Steel Framed Glass"))
            .variant("steel_framed_glass_panel_fancy", v -> v.description("Fancy Panel"))
            .variant("steel_framed_glass_panel", v -> v.description("Panel"))
            .variant("steel_framed_glass_bubble", v -> v.description("Bubble"))
            .variant("steel_framed_glass_frame_thick", v -> v.description("Thick Frame"))
            .variant("steel_framed_glass_frame_thick_panel", v -> v.description("Thick Frame Panel"))
            .variant("steel_framed_glass_tile", v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_brick", v -> v.description("Brick"))
            .variant("steel_framed_glass_line_vertical", v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_line_vertical_panel", v -> v.description("Vertical Line Panel"))
            .variant("steel_framed_glass_line_horizontal", v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_line_horizontal_panel", v -> v.description("Horizontal Line Panel"))
            .variant("steel_framed_glass_arch_panel", v -> v.description("Arch Panel"))
            .variant("steel_framed_glass_arch_panel_1", v -> v.description("Arch Panel 1"))
            .variant("steel_framed_glass_arch_panel_2", v -> v.description("Arch Panel 2"))
            .variant("steel_framed_glass_arch_panel_3", v -> v.description("Arch Panel 3"))
            .variant("steel_framed_glass_scaffold", v -> v.description("Scaffold"))
            .variant("steel_framed_glass_scaffold_left", v -> v.description("Scaffold Left"))
            .variant("steel_framed_glass_scaffold_right", v -> v.description("Scaffold Right"))
            .variant("steel_framed_glass_basketweave", v -> v.description("Basketweave").model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_mosaic_1", v -> v.description("Mosaic 1"))
            .variant("steel_framed_glass_mosaic_2", v -> v.description("Mosaic 2"))
            .variant("steel_framed_glass_round", v -> v.description("Round"))
            .variant("steel_framed_glass_circle", v -> v.description("Circle"))
            .variant("steel_framed_glass_rings", v -> v.description("Rings"))
            .variant("steel_framed_glass_diamond", v -> v.description("Diamond"))
            .variant("steel_framed_glass_frame_1", v -> v.description("Frame 1")));

    private SteelFramedGlassFamily() {
    }
}
