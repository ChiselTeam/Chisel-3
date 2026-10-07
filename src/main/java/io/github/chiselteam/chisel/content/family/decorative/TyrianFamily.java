package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TyrianFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tyrian", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Tyrian"))
            .variant("tyrian_black", variant -> variant
                    .description("Black"))
            .variant("tyrian_black_tiles", variant -> variant
                    .description("Black Tiles"))
            .variant("tyrian_bleak", variant -> variant
                    .description("Bleak"))
            .variant("tyrian_blue", variant -> variant
                    .description("Blue"))
            .variant("tyrian_dent", variant -> variant
                    .description("Dent"))
            .variant("tyrian_diagonal", variant -> variant
                    .description("Diagonal"))
            .variant("tyrian_elaborate", variant -> variant
                    .description("Elaborate"))
            .variant("tyrian_normal", variant -> variant
                    .description("Normal"))
            .variant("tyrian_opening", variant -> variant
                    .description("Opening"))
            .variant("tyrian_platform", variant -> variant
                    .description("Platform"))
            .variant("tyrian_purple", variant -> variant
                    .description("Purple"))
            .variant("tyrian_purple_faded", variant -> variant
                    .description("Faded Purple"))
            .variant("tyrian_rusted", variant -> variant
                    .description("Rusted"))
            .variant("tyrian_seams", variant -> variant
                    .description("Seams"))
            .variant("tyrian_shiny", variant -> variant
                    .description("Shiny")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tyrian_shiny_raw", variant -> variant
                    .description("Shiny Raw"))
            .variant("tyrian_tiles", variant -> variant
                    .description("Tiles")));

    private TyrianFamily() {
    }
}
