package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class WarningFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("warning", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Warning Sign").model(ChiselModelHandlers.MULTI_LAYER))
            .variant("warning_biohazard", v -> v.description("Biohazard")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_chem", v -> v.description("Dangerous Chemicals"))
            .variant("warning_construction", v -> v.description("Under Construction")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_cryogenic", v -> v.description("Cryogenic Freezing in progress")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_death", v -> v.description("Death")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_explosion", v -> v.description("Explosion")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_falling", v -> v.description("Danger of Falling")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_falling_objects", v -> v.description("Falling Objects")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_fire", v -> v.description("Fire")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_generic", v -> v.description("Generic Warning")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_illuminati", v -> v.description("Illuminati")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_loud", v -> v.description("Loud Sounds")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_no_entry", v -> v.description("No Entry")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_oxygen", v -> v.description("Oxygen Required")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_radiation", v -> v.description("Radiation")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg")))
            .variant("warning_voltage", v -> v.description("High Voltage")
                    .texture("bg", Chisel.prefix("block/warning/warning_chem-bg"))));

    private WarningFamily() {
    }
}
