package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.text.WordUtils;

public final class SteelFramedStainedGlassFamily {
    private SteelFramedStainedGlassFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var colorName = WordUtils.capitalize(color.getName().replace("_", " "));
        return ChiselFamily.build("steel_framed_stained_glass_%s".formatted(color.getName()), builder -> builder
                .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)).blockName("%s Steel Framed Stained Glass".formatted(colorName)).model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
                .variant("steel_framed_stained_glass_%s".formatted(color.getName()), v -> v.description("Glass")
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_bubble".formatted(color.getName()), v -> v.description("Bubble Glass")
                        .texture("ctm_corner", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_panel".formatted(color.getName()), v -> v.description("Glass Panel")
                        .texture("ctm_corner", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_panel_fancy".formatted(color.getName()), v -> v.description("Fancy Glass Panel")
                        .texture("ctm_corner", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_frame_thick".formatted(color.getName()), v -> v.description("Thick Frame")
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_frame_thick_panel".formatted(color.getName()), v -> v.description("Thick Frame Panel")
                        .texture(Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick_panel-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick_panel-ctm_cornerless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick_panel-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_frame_thick".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_tile".formatted(color.getName()), v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
                .variant("steel_framed_stained_glass_%s_brick".formatted(color.getName()), v -> v.description("Brick"))
                .variant("steel_framed_stained_glass_%s_line_vertical".formatted(color.getName()), v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL)
                        .texture(Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_line_vertical_panel".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_line_vertical_panel".formatted(color.getName()), v -> v.description("Vertical Line Panel"))
                .variant("steel_framed_stained_glass_%s_line_horizontal".formatted(color.getName()), v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL)
                        .texture(Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s_line_horizontal_panel".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_line_horizontal_panel".formatted(color.getName()), v -> v.description("Horizontal Line Panel"))
                .variant("steel_framed_stained_glass_%s_arch_panel".formatted(color.getName()), v -> v.description("Arch Panel"))
                .variant("steel_framed_stained_glass_%s_arch_panel_1".formatted(color.getName()), v -> v.description("Arch Panel 1"))
                .variant("steel_framed_stained_glass_%s_arch_panel_2".formatted(color.getName()), v -> v.description("Arch Panel 2"))
                .variant("steel_framed_stained_glass_%s_arch_panel_3".formatted(color.getName()), v -> v.description("Arch Panel 3"))
                .variant("steel_framed_stained_glass_%s_scaffold".formatted(color.getName()), v -> v.description("Scaffold"))
                .variant("steel_framed_stained_glass_%s_scaffold_left".formatted(color.getName()), v -> v.description("Scaffold Left"))
                .variant("steel_framed_stained_glass_%s_scaffold_right".formatted(color.getName()), v -> v.description("Scaffold Right"))
                .variant("steel_framed_stained_glass_%s_basketweave".formatted(color.getName()), v -> v.description("Basketweave").model(ChiselModelHandlers.CUBE_ALL))
                .variant("steel_framed_stained_glass_%s_mosaic_1".formatted(color.getName()), v -> v.description("Mosaic 1"))
                .variant("steel_framed_stained_glass_%s_mosaic_2".formatted(color.getName()), v -> v.description("Mosaic 2"))
                .variant("steel_framed_stained_glass_%s_round".formatted(color.getName()), v -> v.description("Round")
                        .texture("ctm_corner", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/steel_framed_stained_glass_%s/steel_framed_stained_glass_%s-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_circle".formatted(color.getName()), v -> v.description("Circle"))
                .variant("steel_framed_stained_glass_%s_rings".formatted(color.getName()), v -> v.description("Rings")
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName()))))
                .variant("steel_framed_stained_glass_%s_diamond".formatted(color.getName()), v -> v.description("Diamond"))
                .variant("steel_framed_stained_glass_%s_frame_1".formatted(color.getName()), v -> v.description("Frame 1")
                        .texture("ctm_cornerless", Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName())))));
    }
}
