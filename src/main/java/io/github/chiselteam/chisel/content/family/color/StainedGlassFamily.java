package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.StringUtils;

public final class StainedGlassFamily {
    private StainedGlassFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var colorName = StringUtils.capitalize(color.getName().replace("_", " "));
        return ChiselFamily.build("stained_glass_%s".formatted(color.getName()), builder -> builder
                .defaults(variant -> variant
                        .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                        .blockName("%s Stained Glass".formatted(colorName))
                        .model(ChiselModelHandlers.GLASS)
                        .blockFactory(ChiselTransparentBlock::new))
                .existingBlock(getVanillaStainedGlass(color))
                .variant("stained_glass_%s_borderless".formatted(color.getName()), variant -> variant
                        .description("Borderless Glass")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("stained_glass_%s_bubble".formatted(color.getName()), variant -> variant
                        .description("Bubble Glass"))
                .variant("stained_glass_%s_panel".formatted(color.getName()), variant -> variant
                        .description("Glass Panel"))
                .variant("stained_glass_%s_panel_fancy".formatted(color.getName()), variant -> variant
                        .description("Fancy Glass Panel"))
                .variant("stained_glass_%s_frame_thick".formatted(color.getName()), variant -> variant
                        .description("Thick Frame"))
                .variant("stained_glass_%s_frame_thick_panel".formatted(color.getName()), variant -> variant
                        .description("Thick Frame Panel"))
                .variant("stained_glass_%s_tile".formatted(color.getName()), variant -> variant
                        .description("Tile")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("stained_glass_%s_brick".formatted(color.getName()), variant -> variant
                        .description("Brick"))
                .variant("stained_glass_%s_line_vertical".formatted(color.getName()), variant -> variant
                        .description("Vertical Line")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("stained_glass_%s_line_vertical_panel".formatted(color.getName()), variant -> variant
                        .description("Vertical Line Panel"))
                .variant("stained_glass_%s_line_horizontal".formatted(color.getName()), variant -> variant
                        .description("Horizontal Line")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("stained_glass_%s_line_horizontal_panel".formatted(color.getName()), variant -> variant
                        .description("Horizontal Line Panel"))
                .variant("stained_glass_%s_arch_panel".formatted(color.getName()), variant -> variant
                        .description("Arch Panel"))
                .variant("stained_glass_%s_arch_panel_1".formatted(color.getName()), variant -> variant
                        .description("Arch Panel 1"))
                .variant("stained_glass_%s_arch_panel_2".formatted(color.getName()), variant -> variant
                        .description("Arch Panel 2"))
                .variant("stained_glass_%s_arch_panel_3".formatted(color.getName()), variant -> variant
                        .description("Arch Panel 3"))
                .variant("stained_glass_%s_scaffold".formatted(color.getName()), variant -> variant
                        .description("Scaffold"))
                .variant("stained_glass_%s_scaffold_left".formatted(color.getName()), variant -> variant
                        .description("Scaffold Left"))
                .variant("stained_glass_%s_scaffold_right".formatted(color.getName()), variant -> variant
                        .description("Scaffold Right"))
                .variant("stained_glass_%s_basketweave".formatted(color.getName()), variant -> variant
                        .description("Basketweave")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("stained_glass_%s_mosaic_1".formatted(color.getName()), variant -> variant
                        .description("Mosaic 1"))
                .variant("stained_glass_%s_mosaic_2".formatted(color.getName()), variant -> variant
                        .description("Mosaic 2"))
                .variant("stained_glass_%s_round".formatted(color.getName()), variant -> variant
                        .description("Round"))
                .variant("stained_glass_%s_circle".formatted(color.getName()), variant -> variant
                        .description("Circle"))
                .variant("stained_glass_%s_rings".formatted(color.getName()), variant -> variant
                        .description("Rings"))
                .variant("stained_glass_%s_diamond".formatted(color.getName()), variant -> variant
                        .description("Diamond"))
                .variant("stained_glass_%s_frame_1".formatted(color.getName()), variant -> variant
                        .description("Frame 1")));
    }

    private static Block getVanillaStainedGlass(DyeColor color) {
        return switch (color) {
            case WHITE -> Blocks.WHITE_STAINED_GLASS;
            case ORANGE -> Blocks.ORANGE_STAINED_GLASS;
            case MAGENTA -> Blocks.MAGENTA_STAINED_GLASS;
            case LIGHT_BLUE -> Blocks.LIGHT_BLUE_STAINED_GLASS;
            case YELLOW -> Blocks.YELLOW_STAINED_GLASS;
            case LIME -> Blocks.LIME_STAINED_GLASS;
            case PINK -> Blocks.PINK_STAINED_GLASS;
            case GRAY -> Blocks.GRAY_STAINED_GLASS;
            case LIGHT_GRAY -> Blocks.LIGHT_GRAY_STAINED_GLASS;
            case CYAN -> Blocks.CYAN_STAINED_GLASS;
            case PURPLE -> Blocks.PURPLE_STAINED_GLASS;
            case BLUE -> Blocks.BLUE_STAINED_GLASS;
            case BROWN -> Blocks.BROWN_STAINED_GLASS;
            case GREEN -> Blocks.GREEN_STAINED_GLASS;
            case RED -> Blocks.RED_STAINED_GLASS;
            case BLACK -> Blocks.BLACK_STAINED_GLASS;
        };
    }
}
