package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BrightGlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bright_glass", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).lightLevel(state -> 15)).blockName("Bright Glass").model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
            .variant("bright_glass", v -> v.description("Bright Glass"))
            .variant("bright_glass_panel_fancy", v -> v.description("Fancy Panel"))
            .variant("bright_glass_panel", v -> v.description("Panel"))
            .variant("bright_glass_bubble", v -> v.description("Bubble"))
            .variant("bright_glass_borderless", v -> v.description("Borderless"))
            .variant("bright_glass_frame_thick", v -> v.description("Thick Frame"))
            .variant("bright_glass_frame_thick_panel", v -> v.description("Thick Frame Panel"))
            .variant("bright_glass_tile", v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_brick", v -> v.description("Brick"))
            .variant("bright_glass_line_vertical", v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_line_vertical_panel", v -> v.description("Vertical Line Panel"))
            .variant("bright_glass_line_horizontal", v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_line_horizontal_panel", v -> v.description("Horizontal Line Panel"))
            .variant("bright_glass_arch_panel", v -> v.description("Arch Panel"))
            .variant("bright_glass_arch_panel_1", v -> v.description("Arch Panel 1"))
            .variant("bright_glass_arch_panel_2", v -> v.description("Arch Panel 2"))
            .variant("bright_glass_arch_panel_3", v -> v.description("Arch Panel 3"))
            .variant("bright_glass_scaffold", v -> v.description("Scaffold"))
            .variant("bright_glass_scaffold_left", v -> v.description("Scaffold Left"))
            .variant("bright_glass_scaffold_right", v -> v.description("Scaffold Right"))
            .variant("bright_glass_basketweave", v -> v.description("Basketweave").model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_mosaic_1", v -> v.description("Mosaic 1"))
            .variant("bright_glass_mosaic_2", v -> v.description("Mosaic 2"))
            .variant("bright_glass_round", v -> v.description("Round"))
            .variant("bright_glass_circle", v -> v.description("Circle"))
            .variant("bright_glass_rings", v -> v.description("Rings"))
            .variant("bright_glass_diamond", v -> v.description("Diamond"))
            .variant("bright_glass_frame_1", v -> v.description("Frame 1")));

    private BrightGlassFamily() {
    }
}
