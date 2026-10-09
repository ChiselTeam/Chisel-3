package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class WarningFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("warning", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Warning Sign")
                    .model(ChiselModelHandlers.MULTI_LAYER))
            .variant("warning_biohazard", variant -> variant
                    .description("Biohazard")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_chem", variant -> variant
                    .description("Dangerous Chemicals"))
            .variant("warning_construction", variant -> variant
                    .description("Under Construction")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_cryogenic", variant -> variant
                    .description("Cryogenic Freezing in progress")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_death", variant -> variant
                    .description("Death")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_explosion", variant -> variant
                    .description("Explosion")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_falling", variant -> variant
                    .description("Danger of Falling")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_falling_objects", variant -> variant
                    .description("Falling Objects")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_fire", variant -> variant
                    .description("Fire")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_generic", variant -> variant
                    .description("Generic Warning")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_illuminati", variant -> variant
                    .description("Illuminati")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_loud", variant -> variant
                    .description("Loud Sounds")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_no_entry", variant -> variant
                    .description("No Entry")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_oxygen", variant -> variant
                    .description("Oxygen Required")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_radiation", variant -> variant
                    .description("Radiation")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_voltage", variant -> variant
                    .description("High Voltage")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg"))));

    private WarningFamily() {
    }
}
