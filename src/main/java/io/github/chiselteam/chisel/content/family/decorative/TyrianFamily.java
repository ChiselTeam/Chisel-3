package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TyrianFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tyrian", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Tyrian"))
            .variant("tyrian_black", v -> v.description("Black"))
            .variant("tyrian_black_tiles", v -> v.description("Black Tiles"))
            .variant("tyrian_bleak", v -> v.description("Bleak"))
            .variant("tyrian_blue", v -> v.description("Blue"))
            .variant("tyrian_dent", v -> v.description("Dent"))
            .variant("tyrian_diagonal", v -> v.description("Diagonal"))
            .variant("tyrian_elaborate", v -> v.description("Elaborate"))
            .variant("tyrian_normal", v -> v.description("Normal"))
            .variant("tyrian_opening", v -> v.description("Opening"))
            .variant("tyrian_platform", v -> v.description("Platform"))
            .variant("tyrian_purple", v -> v.description("Purple"))
            .variant("tyrian_purple_faded", v -> v.description("Faded Purple"))
            .variant("tyrian_rusted", v -> v.description("Rusted"))
            .variant("tyrian_seams", v -> v.description("Seams"))
            .variant("tyrian_shiny", v -> v.description("Shiny").model(ChiselModelHandlers.CONNECTED))
            .variant("tyrian_shiny_raw", v -> v.description("Shiny Raw"))
            .variant("tyrian_tiles", v -> v.description("Tiles")));

    private TyrianFamily() {
    }
}
