package io.github.chiselteam.chisel.content.compat.dyenamics;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.commons.lang3.text.WordUtils;

import java.util.List;

public final class DnSteelFramedStainedGlassFamily {
    public static final List<ChiselFamily> FAMILY = List.of(
            create("maroon", MapColor.COLOR_RED, 0),
            create("persimmon", MapColor.TERRACOTTA_ORANGE, 0),
            create("amber", MapColor.TERRACOTTA_ORANGE, 0),
            create("honey", MapColor.TERRACOTTA_YELLOW, 0),
            create("peach", MapColor.SAND, 0),
            create("fluorescent", MapColor.SAND, 15),
            create("conifer", MapColor.TERRACOTTA_LIGHT_GREEN, 0),
            create("spring_green", MapColor.TERRACOTTA_LIGHT_GREEN, 0),
            create("mint", MapColor.COLOR_GREEN, 0),
            create("aquamarine", MapColor.TERRACOTTA_CYAN, 0),
            create("icy_blue", MapColor.TERRACOTTA_BLUE, 0),
            create("cherenkov", MapColor.COLOR_LIGHT_BLUE, 8),
            create("navy", MapColor.TERRACOTTA_BLUE, 0),
            create("ultramarine", MapColor.COLOR_BLUE, 0),
            create("lavender", MapColor.COLOR_PURPLE, 0),
            create("wine", MapColor.COLOR_PURPLE, 0),
            create("bubblegum", MapColor.COLOR_PINK, 0),
            create("rose", MapColor.TERRACOTTA_RED, 0)
    );

    private DnSteelFramedStainedGlassFamily() {
    }

    public static ChiselFamily create(String color, MapColor mapColor, int lightLevel) {
        var colorName = WordUtils.capitalize(color.replace("_", " "));
        var glassName = "dn_steel_framed_stained_glass_%s".formatted(color);
        return ChiselFamily.build(glassName, builder -> builder
                .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)
                        .mapColor(mapColor).lightLevel(state -> lightLevel))
                        .blockName("%s Steel Framed Stained Glass".formatted(colorName)).model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
                .variant(glassName, v -> v.description("Glass"))
                .variant("%s_bubble".formatted(glassName), v -> v.description("Bubble Glass"))
                .variant("%s_panel".formatted(glassName), v -> v.description("Glass Panel"))
                .variant("%s_panel_fancy".formatted(glassName), v -> v.description("Fancy Glass Panel"))
                .variant("%s_frame_thick".formatted(glassName), v -> v.description("Thick Frame"))
                .variant("%s_frame_thick_panel".formatted(glassName), v -> v.description("Thick Frame Panel"))
                .variant("%s_tile".formatted(glassName), v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_brick".formatted(glassName), v -> v.description("Brick"))
                .variant("%s_line_vertical".formatted(glassName), v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_line_vertical_panel".formatted(glassName), v -> v.description("Vertical Line Panel"))
                .variant("%s_line_horizontal".formatted(glassName), v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_line_horizontal_panel".formatted(glassName), v -> v.description("Horizontal Line Panel"))
                .variant("%s_arch_panel".formatted(glassName), v -> v.description("Arch Panel"))
                .variant("%s_arch_panel_1".formatted(glassName), v -> v.description("Arch Panel 1"))
                .variant("%s_arch_panel_2".formatted(glassName), v -> v.description("Arch Panel 2"))
                .variant("%s_arch_panel_3".formatted(glassName), v -> v.description("Arch Panel 3"))
                .variant("%s_scaffold".formatted(glassName), v -> v.description("Scaffold"))
                .variant("%s_scaffold_left".formatted(glassName), v -> v.description("Scaffold Left"))
                .variant("%s_scaffold_right".formatted(glassName), v -> v.description("Scaffold Right"))
                .variant("%s_basketweave".formatted(glassName), v -> v.description("Basketweave").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_mosaic_1".formatted(glassName), v -> v.description("Mosaic 1"))
                .variant("%s_mosaic_2".formatted(glassName), v -> v.description("Mosaic 2"))
                .variant("%s_round".formatted(glassName), v -> v.description("Round"))
                .variant("%s_circle".formatted(glassName), v -> v.description("Circle"))
                .variant("%s_rings".formatted(glassName), v -> v.description("Rings"))
                .variant("%s_diamond".formatted(glassName), v -> v.description("Diamond"))
                .variant("%s_frame_1".formatted(glassName), v -> v.description("Frame 1")));
    }
}
