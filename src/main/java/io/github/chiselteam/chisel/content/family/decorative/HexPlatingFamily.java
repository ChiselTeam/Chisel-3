package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class HexPlatingFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("hex_plating", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Hex Plating").model(ChiselModelHandlers.MULTI_LAYER))
            .variant("hex_plating_0", v -> v.description("White"))
            .variant("hex_plating_1", v -> v.description("Orange")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_1-bg")))
            .variant("hex_plating_2", v -> v.description("Magenta")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_2-bg")))
            .variant("hex_plating_3", v -> v.description("Light Blue")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_3-bg")))
            .variant("hex_plating_4", v -> v.description("Yellow")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_4-bg")))
            .variant("hex_plating_5", v -> v.description("Lime")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_5-bg")))
            .variant("hex_plating_6", v -> v.description("Pink")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_6-bg")))
            .variant("hex_plating_7", v -> v.description("Gray")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_7-bg")))
            .variant("hex_plating_8", v -> v.description("Light Gray")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_8-bg")))
            .variant("hex_plating_9", v -> v.description("Cyan")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_9-bg")))
            .variant("hex_plating_10", v -> v.description("Purple")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_10-bg")))
            .variant("hex_plating_11", v -> v.description("Blue")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_11-bg")))
            .variant("hex_plating_12", v -> v.description("Brown")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_12-bg")))
            .variant("hex_plating_13", v -> v.description("Green")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_13-bg")))
            .variant("hex_plating_14", v -> v.description("Red")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_14-bg")))
            .variant("hex_plating_15", v -> v.description("Black")
                    .texture(Chisel.prefix("block/hex_plating/hex_plating_0"))
                    .texture("bg", Chisel.prefix("block/hex_plating/hex_plating_15-bg"))));

    private HexPlatingFamily() {
    }
}
