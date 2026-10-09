package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BrightGlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bright_glass", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).lightLevel(state -> 15))
                    .blockName("Bright Glass")
                    .model(ChiselModelHandlers.GLASS)
                    .blockFactory(ChiselTransparentBlock::new))
            .variant("bright_glass", variant -> variant
                    .description("Bright Glass"))
            .variant("bright_glass_panel_fancy", variant -> variant
                    .description("Fancy Panel"))
            .variant("bright_glass_panel", variant -> variant
                    .description("Panel"))
            .variant("bright_glass_bubble", variant -> variant
                    .description("Bubble"))
            .variant("bright_glass_borderless", variant -> variant
                    .description("Borderless"))
            .variant("bright_glass_frame_thick", variant -> variant
                    .description("Thick Frame"))
            .variant("bright_glass_frame_thick_panel", variant -> variant
                    .description("Thick Frame Panel"))
            .variant("bright_glass_tile", variant -> variant
                    .description("Tile")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_brick", variant -> variant
                    .description("Brick"))
            .variant("bright_glass_line_vertical", variant -> variant
                    .description("Vertical Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_line_vertical_panel", variant -> variant
                    .description("Vertical Line Panel"))
            .variant("bright_glass_line_horizontal", variant -> variant
                    .description("Horizontal Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_line_horizontal_panel", variant -> variant
                    .description("Horizontal Line Panel"))
            .variant("bright_glass_arch_panel", variant -> variant
                    .description("Arch Panel"))
            .variant("bright_glass_arch_panel_1", variant -> variant
                    .description("Arch Panel 1"))
            .variant("bright_glass_arch_panel_2", variant -> variant
                    .description("Arch Panel 2"))
            .variant("bright_glass_arch_panel_3", variant -> variant
                    .description("Arch Panel 3"))
            .variant("bright_glass_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("bright_glass_scaffold_left", variant -> variant
                    .description("Scaffold Left"))
            .variant("bright_glass_scaffold_right", variant -> variant
                    .description("Scaffold Right"))
            .variant("bright_glass_basketweave", variant -> variant
                    .description("Basketweave")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("bright_glass_mosaic_1", variant -> variant
                    .description("Mosaic 1"))
            .variant("bright_glass_mosaic_2", variant -> variant
                    .description("Mosaic 2"))
            .variant("bright_glass_round", variant -> variant
                    .description("Round"))
            .variant("bright_glass_circle", variant -> variant
                    .description("Circle"))
            .variant("bright_glass_rings", variant -> variant
                    .description("Rings"))
            .variant("bright_glass_diamond", variant -> variant
                    .description("Diamond"))
            .variant("bright_glass_frame_1", variant -> variant
                    .description("Frame 1")));

    private BrightGlassFamily() {
    }
}
