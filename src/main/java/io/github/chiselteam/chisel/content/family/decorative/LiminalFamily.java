package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LiminalFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("liminal", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS))
                    .blockName("Liminal Block"))
            .variant("liminal_wall_1", variant -> variant
                    .description("Liminal Wall 1"))
            .variant("liminal_wall_2", variant -> variant
                    .description("Liminal Wall 2"))
            .variant("liminal_wall_3", variant -> variant
                    .description("Liminal Wall 3"))
            .variant("liminal_carpet_1", variant -> variant
                    .description("Liminal Carpet 1"))
            .variant("liminal_carpet_2", variant -> variant
                    .description("Liminal Carpet 2")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED))
            .variant("liminal_carpet_3", variant -> variant
                    .description("Liminal Carpet 3"))
            .variant("liminal_carpet_4", variant -> variant
                    .description("Liminal Carpet 4")
                    .model(ChiselModelHandlers.V16))
            .variant("liminal_carpet_5", variant -> variant
                    .description("Liminal Carpet 5")
                    .model(ChiselModelHandlers.V16))
            .variant("liminal_ceiling_1", variant -> variant
                    .description("Liminal Ceiling 1"))
            .variant("liminal_ceiling_2", variant -> variant
                    .description("Liminal Ceiling 2"))
            .variant("liminal_tiles_1", variant -> variant
                    .description("Liminal Tiles 1")));

    private LiminalFamily() {
    }
}
