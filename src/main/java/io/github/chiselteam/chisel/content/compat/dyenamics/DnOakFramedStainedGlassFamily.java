package io.github.chiselteam.chisel.content.compat.dyenamics;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import org.apache.commons.lang3.text.WordUtils;

import java.util.List;

public final class DnOakFramedStainedGlassFamily {
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

    private DnOakFramedStainedGlassFamily() {
    }

    public static ChiselFamily create(String color, MapColor mapColor, int lightLevel) {
        var colorName = WordUtils.capitalize(color.replace("_", " "));
        var glassName = "dn_oak_framed_stained_glass_%s".formatted(color);
        return ChiselFamily.build(glassName, builder -> builder
                .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)
                        .mapColor(mapColor).lightLevel(state -> lightLevel))
                        .blockName("%s Oak Framed Stained Glass".formatted(colorName)).model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
                .variant(glassName, v -> v.description("Glass")
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color))))
                .variant("%s_bubble".formatted(glassName), v -> v.description("Bubble Glass")
                        .texture("ctm_corner", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_corner".formatted(color, color)))
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color)))
                        .texture("ctm_horizontal", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_horizontal".formatted(color, color)))
                        .texture("ctm_vertical", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_vertical".formatted(color, color))))
                .variant("%s_panel".formatted(glassName), v -> v.description("Glass Panel")
                        .texture("ctm_corner", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_corner".formatted(color, color)))
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color)))
                        .texture("ctm_horizontal", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_horizontal".formatted(color, color)))
                        .texture("ctm_vertical", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_vertical".formatted(color, color))))
                .variant("%s_panel_fancy".formatted(glassName), v -> v.description("Fancy Glass Panel")
                        .texture("ctm_corner", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick-ctm_corner".formatted(color, color)))
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color)))
                        .texture("ctm_horizontal", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick-ctm_horizontal".formatted(color, color)))
                        .texture("ctm_vertical", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick-ctm_vertical".formatted(color, color))))
                .variant("%s_frame_thick".formatted(glassName), v -> v.description("Thick Frame")
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color))))
                .variant("%s_frame_thick_panel".formatted(glassName), v -> v.description("Thick Frame Panel")
                        .texture(Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick".formatted(color, color)))
                        .texture("ctm_corner", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick_panel-ctm_corner".formatted(color, color)))
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick_panel-ctm_cornerless".formatted(color, color)))
                        .texture("ctm_horizontal", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick_panel-ctm_horizontal".formatted(color, color)))
                        .texture("ctm_vertical", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_frame_thick".formatted(color, color))))
                .variant("%s_tile".formatted(glassName), v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_brick".formatted(glassName), v -> v.description("Brick"))
                .variant("%s_line_vertical".formatted(glassName), v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL)
                        .texture(Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_line_vertical_panel".formatted(color, color))))
                .variant("%s_line_vertical_panel".formatted(glassName), v -> v.description("Vertical Line Panel"))
                .variant("%s_line_horizontal".formatted(glassName), v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL)
                        .texture(Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s_line_horizontal_panel".formatted(color, color))))
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
                .variant("%s_round".formatted(glassName), v -> v.description("Round")
                        .texture("ctm_corner", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_corner".formatted(color, color)))
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color)))
                        .texture("ctm_horizontal", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_horizontal".formatted(color, color)))
                        .texture("ctm_vertical", Chisel.prefix("block/dn_oak_framed_stained_glass_%s/dn_oak_framed_stained_glass_%s-ctm_vertical".formatted(color, color))))
                .variant("%s_circle".formatted(glassName), v -> v.description("Circle"))
                .variant("%s_rings".formatted(glassName), v -> v.description("Rings")
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color))))
                .variant("%s_diamond".formatted(glassName), v -> v.description("Diamond"))
                .variant("%s_frame_1".formatted(glassName), v -> v.description("Frame 1")
                        .texture("ctm_cornerless", Chisel.prefix("block/dn_stained_glass_%s/dn_stained_glass_%s_borderless".formatted(color, color)))));
    }
}
