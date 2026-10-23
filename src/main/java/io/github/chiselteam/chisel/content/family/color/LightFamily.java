package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.text.WordUtils;

public final class LightFamily {
    private LightFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var colorName = WordUtils.capitalize(color.getName().replace("_", " "));
        var lightName = "light_%s".formatted(color.getName());
        return ChiselFamily.build(lightName, builder -> builder
                .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN)).blockName("%s Light".formatted(colorName)).model(ChiselModelHandlers.CONNECTED))
                .variant("%s_regular".formatted(lightName), v -> v.description("Regular")
                        .texture("ctm_corner", Chisel.prefix("block/light_%s/light_%s_round-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        }))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_round-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_round-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_borderless".formatted(lightName), v -> v.description("Borderless")
                        .texture("ctm_corner", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        }))
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        }))
                        .texture("ctm_horizontal", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        }))
                        .texture("ctm_vertical", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        })))
                .variant("%s_diamond".formatted(lightName), v -> v.description("Diamond"))
                .variant("%s_panel_fancy".formatted(lightName), v -> v.description("Fancy Panel")
                        .texture("ctm_corner", Chisel.prefix("block/light_%s/light_%s_frame_thick-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        }))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_frame_thick-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_frame_thick-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_bubble".formatted(lightName), v -> v.description("Bubble")
                        .texture("ctm_corner", Chisel.prefix("block/light_%s/light_%s_round-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        }))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_round-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_round-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_panel".formatted(lightName), v -> v.description("Panel").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_panel_connected".formatted(lightName), v -> v.description("Panel Connected"))
                .variant("%s_framed".formatted(lightName), v -> v.description("Framed").model(ChiselModelHandlers.CUBE_ALL)
                        .texture(Chisel.prefix("block/light_%s/light_%s_framed_connected".formatted(color.getName(), color.getName()))))
                .variant("%s_framed_connected".formatted(lightName), v -> v.description("Framed Connected")
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        })))
                .variant("%s_frame_1".formatted(lightName), v -> v.description("Frame 1")
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        })))
                .variant("%s_frame_2".formatted(lightName), v -> v.description("Frame 2").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_frame_3".formatted(lightName), v -> v.description("Frame 3").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_circle".formatted(lightName), v -> v.description("Circle"))
                .variant("%s_round".formatted(lightName), v -> v.description("Round")
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        })))
                .variant("%s_mosaic_1".formatted(lightName), v -> v.description("Mosaic 1"))
                .variant("%s_mosaic_2".formatted(lightName), v -> v.description("Mosaic 2")
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_mosaic_2-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_mosaic_2-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_mosaic_2".formatted(color.getName(), color.getName()))))
                .variant("%s_rings".formatted(lightName), v -> v.description("Rings")
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        })))
                .variant("%s_basketweave".formatted(lightName), v -> v.description("Basketweave").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_scaffold".formatted(lightName), v -> v.description("Scaffold"))
                .variant("%s_scaffold_left".formatted(lightName), v -> v.description("Scaffold Left"))
                .variant("%s_scaffold_right".formatted(lightName), v -> v.description("Scaffold Right"))
                .variant("%s_arch_panel".formatted(lightName), v -> v.description("Arch Panel")
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_arch_panel-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_arch_panel-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_arch_panel".formatted(color.getName(), color.getName()))))
                .variant("%s_arch_panel_1".formatted(lightName), v -> v.description("Arch Panel 1")
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_arch_panel_1".formatted(color.getName(), color.getName()))))
                .variant("%s_arch_panel_2".formatted(lightName), v -> v.description("Arch Panel 2")
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_arch_panel_2-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_arch_panel_2-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_arch_panel_2".formatted(color.getName(), color.getName()))))
                .variant("%s_arch_panel_3".formatted(lightName), v -> v.description("Arch Panel 3")
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_arch_panel_3-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_arch_panel_3-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_arch_panel_3".formatted(color.getName(), color.getName()))))
                .variant("%s_frame_thick".formatted(lightName), v -> v.description("Thick Frame")
                        .texture("ctm_cornerless", Chisel.prefix(switch (color) {
                            case WHITE -> "block/antiblock/antiblock_white";
                            default -> "block/light_%s/light_%s_rings-ctm_cornerless".formatted(color.getName(), color.getName());
                        })))
                .variant("%s_frame_thick_panel".formatted(lightName), v -> v.description("Thick Frame Panel")
                        .texture(Chisel.prefix("block/light_%s/light_%s_frame_thick".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/light_%s/light_%s_frame_thick-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_frame_thick-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_frame_thick-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_frame_thick".formatted(color.getName(), color.getName()))))
                .variant("%s_tile".formatted(lightName), v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
                .variant("%s_brick".formatted(lightName), v -> v.description("Brick")
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_brick-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_brick".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_brick-ctm_corner".formatted(color.getName(), color.getName()))))
                .variant("%s_line_vertical".formatted(lightName), v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL)
                        .texture(Chisel.prefix("block/light_%s/light_%s_line_vertical_panel".formatted(color.getName(), color.getName()))))
                .variant("%s_line_horizontal".formatted(lightName), v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL)
                        .texture(Chisel.prefix("block/light_%s/light_%s_line_horizontal_panel".formatted(color.getName(), color.getName()))))
                .variant("%s_line_vertical_panel".formatted(lightName), v -> v.description("Vertical Line Panel")
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_line_vertical_panel-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_line_vertical_panel-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_line_vertical_panel".formatted(color.getName(), color.getName()))))
                .variant("%s_line_horizontal_panel".formatted(lightName), v -> v.description("Horizontal Line Panel")
                        .texture("ctm_cornerless", Chisel.prefix("block/light_%s/light_%s_line_horizontal_panel-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/light_%s/light_%s_line_horizontal_panel".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/light_%s/light_%s_line_horizontal_panel-ctm_corner".formatted(color.getName(), color.getName())))));
    }
}
