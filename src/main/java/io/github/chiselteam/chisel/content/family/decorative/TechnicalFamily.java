package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TechnicalFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("technical", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Technical Block")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("technical_125", variant -> variant
                    .description("125")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("technical_cables", variant -> variant
                    .description("Cables"))
            .variant("technical_engineering", variant -> variant
                    .description("Engineering"))
            .variant("technical_engineering_1", variant -> variant
                    .description("Engineering"))
            .variant("technical_engineering_2", variant -> variant
                    .description("Engineering"))
            .variant("technical_engineering_3", variant -> variant
                    .description("Engineering"))
            .variant("technical_engineering_prototype", variant -> variant
                    .description("Engineering Prototype"))
            .variant("technical_exhaust", variant -> variant
                    .description("Exhaust"))
            .variant("technical_fan_fast", variant -> variant
                    .description("Fan (Fast)")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/technical/technical_fan_fast-top")))
            .variant("technical_fan_fast_transparent", variant -> variant
                    .description("Transparent Fast Fan")
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion())
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/technical/technical_fan_fast-top")))
            .variant("technical_fan_reverse_fast", variant -> variant
                    .description("Fan Reversed (Fast)")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/technical/technical_fan_fast-top"))
                    .textureAlias("bottom", "top"))
            .variant("technical_fan_malfunction", variant -> variant
                    .description("Fan (Malfunctioning)")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/technical/technical_fan_fast-top")))
            .variant("technical_fan_malfunction_slow", variant -> variant
                    .description("Slow Malfunctioning Fan")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/technical/technical_fan_fast-top")))
            .variant("technical_fan_massive", variant -> variant
                    .description("Massive Fan")
                    .model(ChiselModelHandlers.V9)
                    .textureFromBase("overlay_3x3"))
            .variant("technical_fan_still", variant -> variant
                    .description("Fan (Off)")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/technical/technical_fan_fast-top")))
            .variant("technical_fan_still_transparent", variant -> variant
                    .description("Transparent Still Fan")
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion())
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/technical/technical_fan_fast-top")))
            .variant("technical_gears", variant -> variant
                    .description("Gears and Flywheels")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("technical_grate", variant -> variant
                    .description("Grate"))
            .variant("technical_grate_rusty", variant -> variant
                    .description("Rusty Grate"))
            .variant("technical_hex_plating", variant -> variant
                    .description("Hex Plating")
                    .model(ChiselModelHandlers.V9))
            .variant("technical_insulation", variant -> variant
                    .description("Insulation"))
            .variant("technical_makeshift_panels", variant -> variant
                    .description("Makeshift Panels")
                    .model(ChiselModelHandlers.V9))
            .variant("technical_megacell", variant -> variant
                    .description("Megacell")
                    .model(ChiselModelHandlers.TBS))
            .variant("technical_old", variant -> variant
                    .description("An Old Relic from the land of Oneteufyv")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("technical_oldtimeyserveranim", variant -> variant
                    .description("Old-Timey Server")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("technical_panel_caution", variant -> variant
                    .description("Panels with Caution Tape")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("technical_piping", variant -> variant
                    .description("Piping")
                    .model(ChiselModelHandlers.R9)
                    .texture("r9_bottom_center", Chisel.prefix("block/technical/technical_piping-r9_center_left"))
                    .textureFromBase("r9_bottom_left")
                    .texture("r9_bottom_right", Chisel.prefix("block/technical/technical_piping-r9_center"))
                    .texture("r9_center_right", Chisel.prefix("block/technical/technical_piping-r9_top_left"))
                    .textureFromBase("r9_top_center"))
            .variant("technical_rusty", variant -> variant
                    .description("Rusty")
                    .model(ChiselModelHandlers.R9)
                    .textureFromBase("r9_top_left"))
            .variant("technical_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("technical_scaffold_large", variant -> variant
                    .description("Large Scaffold"))
            .variant("technical_scaffold_large_1", variant -> variant
                    .description("Large Scaffold"))
            .variant("technical_scaffold_large_2", variant -> variant
                    .description("Large Scaffold"))
            .variant("technical_scaffold_large_3", variant -> variant
                    .description("Large Scaffold"))
            .variant("technical_scaffold_transparent", variant -> variant
                    .description("Transparent Scaffold")
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()))
            .variant("technical_spinning_stuff", variant -> variant
                    .description("Spinning Stuff")
                    .texture(Chisel.prefix("block/technical/technical_gears"))
                    .texture("ctm_corner", Chisel.prefix("block/technical/technical_spinning_stuff-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/technical/technical_spinning_stuff-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/technical/technical_spinning_stuff-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/technical/technical_spinning_stuff-ctm_vertical")))
            .variant("technical_sturdy", variant -> variant
                    .description("Sturdy"))
            .variant("technical_under_large", variant -> variant
                    .description("Under-Pipe (Large Pipe)"))
            .variant("technical_under_small", variant -> variant
                    .description("Under-Pipe (Small Pipes)"))
            .variant("technical_vents", variant -> variant
                    .description("Vents"))
            .variant("technical_vents_glowing", variant -> variant
                    .description("Glowing Vents"))
            .variant("technical_wall_pads", variant -> variant
                    .description("Wall Pads"))
            .variant("technical_weathered_green_panels", variant -> variant
                    .description("Weathered Green Panels")
                    .model(ChiselModelHandlers.R4)
                    .textureFromBase("r4_top_left"))
            .variant("technical_weathered_orange_panels", variant -> variant
                    .description("Weathered Orange Panels")
                    .model(ChiselModelHandlers.R4)
                    .textureFromBase("r4_top_left"))
            .variant("technical_wires", variant -> variant
                    .description("Wires")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private TechnicalFamily() {
    }
}
