package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.StringUtils;

public final class LightFamily {
    private LightFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var colorName = StringUtils.capitalize(color.getName().replace("_", " "));
        var lightName = "light_%s".formatted(color.getName());
        return ChiselFamily.build(lightName, builder -> builder
                .defaults(variant -> variant
                        .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN))
                        .blockName("%s Light".formatted(colorName))
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_regular".formatted(lightName), variant -> variant
                        .description("Regular"))
                .variant("%s_borderless".formatted(lightName), variant -> variant
                        .description("Borderless"))
                .variant("%s_diamond".formatted(lightName), variant -> variant
                        .description("Diamond"))
                .variant("%s_panel_fancy".formatted(lightName), variant -> variant
                        .description("Fancy Panel"))
                .variant("%s_bubble".formatted(lightName), variant -> variant
                        .description("Bubble"))
                .variant("%s_panel".formatted(lightName), variant -> variant
                        .description("Panel")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_panel_connected".formatted(lightName), variant -> variant
                        .description("Panel Connected"))
                .variant("%s_framed".formatted(lightName), variant -> variant
                        .description("Framed")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_framed_connected".formatted(lightName), variant -> variant
                        .description("Framed Connected"))
                .variant("%s_frame_1".formatted(lightName), variant -> variant
                        .description("Frame 1"))
                .variant("%s_frame_2".formatted(lightName), variant -> variant
                        .description("Frame 2")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_frame_3".formatted(lightName), variant -> variant
                        .description("Frame 3")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_circle".formatted(lightName), variant -> variant
                        .description("Circle"))
                .variant("%s_round".formatted(lightName), variant -> variant
                        .description("Round"))
                .variant("%s_mosaic_1".formatted(lightName), variant -> variant
                        .description("Mosaic 1"))
                .variant("%s_mosaic_2".formatted(lightName), variant -> variant
                        .description("Mosaic 2"))
                .variant("%s_rings".formatted(lightName), variant -> variant
                        .description("Rings"))
                .variant("%s_basketweave".formatted(lightName), variant -> variant
                        .description("Basketweave")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_scaffold".formatted(lightName), variant -> variant
                        .description("Scaffold"))
                .variant("%s_scaffold_left".formatted(lightName), variant -> variant
                        .description("Scaffold Left"))
                .variant("%s_scaffold_right".formatted(lightName), variant -> variant
                        .description("Scaffold Right"))
                .variant("%s_arch_panel".formatted(lightName), variant -> variant
                        .description("Arch Panel"))
                .variant("%s_arch_panel_1".formatted(lightName), variant -> variant
                        .description("Arch Panel 1"))
                .variant("%s_arch_panel_2".formatted(lightName), variant -> variant
                        .description("Arch Panel 2"))
                .variant("%s_arch_panel_3".formatted(lightName), variant -> variant
                        .description("Arch Panel 3"))
                .variant("%s_frame_thick".formatted(lightName), variant -> variant
                        .description("Thick Frame"))
                .variant("%s_frame_thick_panel".formatted(lightName), variant -> variant
                        .description("Thick Frame Panel"))
                .variant("%s_tile".formatted(lightName), variant -> variant
                        .description("Tile")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_brick".formatted(lightName), variant -> variant
                        .description("Brick"))
                .variant("%s_line_vertical".formatted(lightName), variant -> variant
                        .description("Vertical Line")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_line_horizontal".formatted(lightName), variant -> variant
                        .description("Horizontal Line")
                        .model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_line_vertical_panel".formatted(lightName), variant -> variant
                        .description("Vertical Line Panel"))
                .variant("%s_line_horizontal_panel".formatted(lightName), variant -> variant
                        .description("Horizontal Line Panel")));
    }
}
