package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SteelFramedGlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("steel_framed_glass", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                    .blockName("Steel Framed Glass")
                    .model(ChiselModelHandlers.GLASS)
                    .blockFactory(ChiselTransparentBlock::new))
            .variant("steel_framed_glass", variant -> variant
                    .description("Steel Framed Glass"))
            .variant("steel_framed_glass_panel_fancy", variant -> variant
                    .description("Fancy Panel"))
            .variant("steel_framed_glass_panel", variant -> variant
                    .description("Panel"))
            .variant("steel_framed_glass_bubble", variant -> variant
                    .description("Bubble"))
            .variant("steel_framed_glass_frame_thick", variant -> variant
                    .description("Thick Frame"))
            .variant("steel_framed_glass_frame_thick_panel", variant -> variant
                    .description("Thick Frame Panel"))
            .variant("steel_framed_glass_tile", variant -> variant
                    .description("Tile")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_brick", variant -> variant
                    .description("Brick"))
            .variant("steel_framed_glass_line_vertical", variant -> variant
                    .description("Vertical Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_line_vertical_panel", variant -> variant
                    .description("Vertical Line Panel"))
            .variant("steel_framed_glass_line_horizontal", variant -> variant
                    .description("Horizontal Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_line_horizontal_panel", variant -> variant
                    .description("Horizontal Line Panel"))
            .variant("steel_framed_glass_arch_panel", variant -> variant
                    .description("Arch Panel"))
            .variant("steel_framed_glass_arch_panel_1", variant -> variant
                    .description("Arch Panel 1"))
            .variant("steel_framed_glass_arch_panel_2", variant -> variant
                    .description("Arch Panel 2"))
            .variant("steel_framed_glass_arch_panel_3", variant -> variant
                    .description("Arch Panel 3"))
            .variant("steel_framed_glass_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("steel_framed_glass_scaffold_left", variant -> variant
                    .description("Scaffold Left"))
            .variant("steel_framed_glass_scaffold_right", variant -> variant
                    .description("Scaffold Right"))
            .variant("steel_framed_glass_basketweave", variant -> variant
                    .description("Basketweave")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("steel_framed_glass_mosaic_1", variant -> variant
                    .description("Mosaic 1"))
            .variant("steel_framed_glass_mosaic_2", variant -> variant
                    .description("Mosaic 2"))
            .variant("steel_framed_glass_round", variant -> variant
                    .description("Round"))
            .variant("steel_framed_glass_circle", variant -> variant
                    .description("Circle"))
            .variant("steel_framed_glass_rings", variant -> variant
                    .description("Rings"))
            .variant("steel_framed_glass_diamond", variant -> variant
                    .description("Diamond"))
            .variant("steel_framed_glass_frame_1", variant -> variant
                    .description("Frame 1")));

    private SteelFramedGlassFamily() {
    }
}
