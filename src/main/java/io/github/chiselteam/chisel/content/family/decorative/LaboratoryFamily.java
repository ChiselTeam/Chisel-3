package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LaboratoryFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("laboratory", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Laboratory Block"))
            .variant("laboratory_checkerboard", v -> v.description("Checkerboard Floor"))
            .variant("laboratory_floor", v -> v.description("Laboratory Floor"))
            .variant("laboratory_floor_dark", v -> v.description("Laboratory Dark Floor"))
            .variant("laboratory_wall_vent", v -> v.description("Enamelled Wall Vents").model(ChiselModelHandlers.CTMH))
            .variant("laboratory_console_information", v -> v.description("Information Console").model(ChiselModelHandlers.CTMH)
                    .textureAlias("bottom", "top")
                    .textureFromBase("horizontal_none")
                    .texture("top", Chisel.prefix("block/laboratory/laboratory_wall_vent-top")))
            .variant("laboratory_console_information_animated", v -> v.description("Information Console Animated").model(ChiselModelHandlers.CTMH)
                    .textureAlias("bottom", "top")
                    .textureFromBase("horizontal_none")
                    .texture("top", Chisel.prefix("block/laboratory/laboratory_wall_vent-top")))
            .variant("laboratory_console_left", v -> v.description("Direction Console (Left)").model(ChiselModelHandlers.CTMH)
                    .textureAlias("bottom", "top")
                    .textureFromBase("horizontal_none")
                    .texture("top", Chisel.prefix("block/laboratory/laboratory_wall_vent-top")))
            .variant("laboratory_console_left_animated", v -> v.description("Direction Console Animated (Left)").model(ChiselModelHandlers.CTMH)
                    .textureAlias("bottom", "top")
                    .textureFromBase("horizontal_none")
                    .texture("top", Chisel.prefix("block/laboratory/laboratory_wall_vent-top")))
            .variant("laboratory_console_right", v -> v.description("Direction Console (Right)").model(ChiselModelHandlers.CTMH)
                    .textureAlias("bottom", "top")
                    .textureFromBase("horizontal_none")
                    .texture("top", Chisel.prefix("block/laboratory/laboratory_wall_vent-top")))
            .variant("laboratory_console_right_animated", v -> v.description("Direction Console Animated (Right)").model(ChiselModelHandlers.CTMH)
                    .textureAlias("bottom", "top")
                    .textureFromBase("horizontal_none")
                    .texture("top", Chisel.prefix("block/laboratory/laboratory_wall_vent-top")))
            .variant("laboratory_panel_clear", v -> v.description("Clear Panel")
                    .texture(Chisel.prefix("block/laboratory/laboratory_clearscreen")))
            .variant("laboratory_clearscreen", v -> v.description("Clear Panel Connected").model(ChiselModelHandlers.CONNECTED))
            .variant("laboratory_panel_fuzzy", v -> v.description("Fuzzy Panel Connected").model(ChiselModelHandlers.CONNECTED))
            .variant("laboratory_panel_dotted", v -> v.description("Dotted Panel")
                    .texture(Chisel.prefix("block/laboratory/laboratory_panel_dotted_connected")))
            .variant("laboratory_panel_dotted_connected", v -> v.description("Dotted Panel Connected").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/laboratory/laboratory_panel_dotted_connected-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("laboratory_panel_wall", v -> v.description("Wall Panel")
                    .texture(Chisel.prefix("block/laboratory/laboratory_panel_wall_connected")))
            .variant("laboratory_panel_wall_connected", v -> v.description("Wall Panel Connected").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/laboratory/laboratory_panel_wall_connected-ctm_corner"))
                    .textureAlias("ctm_horizontal", "ctm_cornerless")
                    .textureFromBase("ctm_vertical"))
            .variant("laboratory_tiles_enamelled_large", v -> v.description("Large Enamelled Tile").model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/laboratory/laboratory_tiles_large")))
            .variant("laboratory_wall", v -> v.description("Enamelled Wall"))
            .variant("laboratory_tiles_large", v -> v.description("Large Tiles"))
            .variant("laboratory_tiles_enamelled_small", v -> v.description("Small Enamelled Tiles")
                    .texture(Chisel.prefix("block/laboratory/laboratory_tiles_small")))
            .variant("laboratory_tiles_small", v -> v.description("Small Tiles"))
            .variant("laboratory_wall_rounded", v -> v.description("Enamelled Roundel Wall").model(ChiselModelHandlers.CONNECTED))
            .variant("laboratory_tiles_steel_large", v -> v.description("Large Steel Tile").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/laboratory/laboratory_tiles_steel_large-top")))
            .variant("laboratory_tiles_steel_small", v -> v.description("Small Steel Tiles").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/laboratory/laboratory_tiles_steel_small-top"))));

    private LaboratoryFamily() {
    }
}
