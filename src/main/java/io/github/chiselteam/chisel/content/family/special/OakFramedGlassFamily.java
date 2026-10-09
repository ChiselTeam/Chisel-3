package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class OakFramedGlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("oak_framed_glass", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                    .blockName("Oak Framed Glass")
                    .model(ChiselModelHandlers.GLASS)
                    .blockFactory(ChiselTransparentBlock::new))
            .variant("oak_framed_glass", variant -> variant
                    .description("Oak Framed Glass"))
            .variant("oak_framed_glass_panel_fancy", variant -> variant
                    .description("Fancy Panel"))
            .variant("oak_framed_glass_panel", variant -> variant
                    .description("Panel"))
            .variant("oak_framed_glass_bubble", variant -> variant
                    .description("Bubble"))
            .variant("oak_framed_glass_frame_thick", variant -> variant
                    .description("Thick Frame"))
            .variant("oak_framed_glass_frame_thick_panel", variant -> variant
                    .description("Thick Frame Panel"))
            .variant("oak_framed_glass_tile", variant -> variant
                    .description("Tile")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_brick", variant -> variant
                    .description("Brick"))
            .variant("oak_framed_glass_line_vertical", variant -> variant
                    .description("Vertical Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_line_vertical_panel", variant -> variant
                    .description("Vertical Line Panel"))
            .variant("oak_framed_glass_line_horizontal", variant -> variant
                    .description("Horizontal Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_line_horizontal_panel", variant -> variant
                    .description("Horizontal Line Panel"))
            .variant("oak_framed_glass_arch_panel", variant -> variant
                    .description("Arch Panel"))
            .variant("oak_framed_glass_arch_panel_1", variant -> variant
                    .description("Arch Panel 1"))
            .variant("oak_framed_glass_arch_panel_2", variant -> variant
                    .description("Arch Panel 2"))
            .variant("oak_framed_glass_arch_panel_3", variant -> variant
                    .description("Arch Panel 3"))
            .variant("oak_framed_glass_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("oak_framed_glass_scaffold_left", variant -> variant
                    .description("Scaffold Left"))
            .variant("oak_framed_glass_scaffold_right", variant -> variant
                    .description("Scaffold Right"))
            .variant("oak_framed_glass_basketweave", variant -> variant
                    .description("Basketweave")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("oak_framed_glass_mosaic_1", variant -> variant
                    .description("Mosaic 1"))
            .variant("oak_framed_glass_mosaic_2", variant -> variant
                    .description("Mosaic 2"))
            .variant("oak_framed_glass_round", variant -> variant
                    .description("Round"))
            .variant("oak_framed_glass_circle", variant -> variant
                    .description("Circle"))
            .variant("oak_framed_glass_rings", variant -> variant
                    .description("Rings"))
            .variant("oak_framed_glass_diamond", variant -> variant
                    .description("Diamond"))
            .variant("oak_framed_glass_frame_1", variant -> variant
                    .description("Frame 1")));

    private OakFramedGlassFamily() {
    }
}
