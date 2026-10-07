package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class HexPlatingFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("hex_plating", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Hex Plating")
                    .model(ChiselModelHandlers.MULTI_LAYER))
            .variant("hex_plating_0", variant -> variant
                    .description("White"))
            .variant("hex_plating_1", variant -> variant
                    .description("Orange")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_1-bg")))
            .variant("hex_plating_2", variant -> variant
                    .description("Magenta")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_2-bg")))
            .variant("hex_plating_3", variant -> variant
                    .description("Light Blue")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_3-bg")))
            .variant("hex_plating_4", variant -> variant
                    .description("Yellow")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_4-bg")))
            .variant("hex_plating_5", variant -> variant
                    .description("Lime")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_5-bg")))
            .variant("hex_plating_6", variant -> variant
                    .description("Pink")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_6-bg")))
            .variant("hex_plating_7", variant -> variant
                    .description("Gray")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_7-bg")))
            .variant("hex_plating_8", variant -> variant
                    .description("Light Gray")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_8-bg")))
            .variant("hex_plating_9", variant -> variant
                    .description("Cyan")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_9-bg")))
            .variant("hex_plating_10", variant -> variant
                    .description("Purple")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_10-bg")))
            .variant("hex_plating_11", variant -> variant
                    .description("Blue")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_11-bg")))
            .variant("hex_plating_12", variant -> variant
                    .description("Brown")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_12-bg")))
            .variant("hex_plating_13", variant -> variant
                    .description("Green")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_13-bg")))
            .variant("hex_plating_14", variant -> variant
                    .description("Red")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_14-bg")))
            .variant("hex_plating_15", variant -> variant
                    .description("Black")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_15-bg"))));

    private HexPlatingFamily() {
    }
}
