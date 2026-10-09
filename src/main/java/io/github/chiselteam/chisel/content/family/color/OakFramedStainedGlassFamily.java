package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.text.WordUtils;

public final class OakFramedStainedGlassFamily {
    private OakFramedStainedGlassFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var colorName = WordUtils.capitalize(color.getName().replace("_", " "));
        return ChiselFamily.build("oak_framed_stained_glass_%s".formatted(color.getName()), builder -> builder
                .defaults(variant -> variant
                        .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                        .blockName("%s Oak Framed Stained Glass".formatted(colorName))
                        .model(ChiselModelHandlers.GLASS)
                        .blockFactory(ChiselTransparentBlock::new))
                .variant("oak_framed_stained_glass_%s".formatted(color.getName()), variant -> variant
                        .description("Glass"))
                .variant("oak_framed_stained_glass_%s_bubble".formatted(color.getName()), variant -> variant
                        .description("Bubble Glass"))
                .variant("oak_framed_stained_glass_%s_panel".formatted(color.getName()), variant -> variant
                        .description("Glass Panel"))
                .variant("oak_framed_stained_glass_%s_panel_fancy".formatted(color.getName()), variant -> variant
                        .description("Fancy Glass Panel"))
                .variant("oak_framed_stained_glass_%s_frame_thick".formatted(color.getName()), variant -> variant
                        .description("Thick Frame"))
                .variant("oak_framed_stained_glass_%s_frame_thick_panel".formatted(color.getName()), variant -> variant
                        .description("Thick Frame Panel"))
                .variant("oak_framed_stained_glass_%s_tile".formatted(color.getName()), variant -> variant
                        .description("Tile")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("oak_framed_stained_glass_%s_brick".formatted(color.getName()), variant -> variant
                        .description("Brick"))
                .variant("oak_framed_stained_glass_%s_line_vertical".formatted(color.getName()), variant -> variant
                        .description("Vertical Line")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("oak_framed_stained_glass_%s_line_vertical_panel".formatted(color.getName()), variant -> variant
                        .description("Vertical Line Panel"))
                .variant("oak_framed_stained_glass_%s_line_horizontal".formatted(color.getName()), variant -> variant
                        .description("Horizontal Line")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("oak_framed_stained_glass_%s_line_horizontal_panel".formatted(color.getName()), variant -> variant
                        .description("Horizontal Line Panel"))
                .variant("oak_framed_stained_glass_%s_arch_panel".formatted(color.getName()), variant -> variant
                        .description("Arch Panel"))
                .variant("oak_framed_stained_glass_%s_arch_panel_1".formatted(color.getName()), variant -> variant
                        .description("Arch Panel 1"))
                .variant("oak_framed_stained_glass_%s_arch_panel_2".formatted(color.getName()), variant -> variant
                        .description("Arch Panel 2"))
                .variant("oak_framed_stained_glass_%s_arch_panel_3".formatted(color.getName()), variant -> variant
                        .description("Arch Panel 3"))
                .variant("oak_framed_stained_glass_%s_scaffold".formatted(color.getName()), variant -> variant
                        .description("Scaffold"))
                .variant("oak_framed_stained_glass_%s_scaffold_left".formatted(color.getName()), variant -> variant
                        .description("Scaffold Left"))
                .variant("oak_framed_stained_glass_%s_scaffold_right".formatted(color.getName()), variant -> variant
                        .description("Scaffold Right"))
                .variant("oak_framed_stained_glass_%s_basketweave".formatted(color.getName()), variant -> variant
                        .description("Basketweave")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("oak_framed_stained_glass_%s_mosaic_1".formatted(color.getName()), variant -> variant
                        .description("Mosaic 1"))
                .variant("oak_framed_stained_glass_%s_mosaic_2".formatted(color.getName()), variant -> variant
                        .description("Mosaic 2"))
                .variant("oak_framed_stained_glass_%s_round".formatted(color.getName()), variant -> variant
                        .description("Round"))
                .variant("oak_framed_stained_glass_%s_circle".formatted(color.getName()), variant -> variant
                        .description("Circle"))
                .variant("oak_framed_stained_glass_%s_rings".formatted(color.getName()), variant -> variant
                        .description("Rings"))
                .variant("oak_framed_stained_glass_%s_diamond".formatted(color.getName()), variant -> variant
                        .description("Diamond"))
                .variant("oak_framed_stained_glass_%s_frame_1".formatted(color.getName()), variant -> variant
                        .description("Frame 1")));
    }
}
