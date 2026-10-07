package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LiminalFamily {
        public static final ChiselFamily FAMILY = ChiselFamily.build("liminal", builder -> builder
                .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)).blockName("Liminal Block"))
                .variant("liminal_wall_1", v -> v.description("Liminal Wall 1"))
                .variant("liminal_wall_1_trim", v -> v.description("Liminal Wall 1 Trim").model(ChiselModelHandlers.CONNECTED))
                .variant("liminal_wall_2", v -> v.description("Liminal Wall 2"))
                .variant("liminal_wall_3", v -> v.description("Liminal Wall 3"))
                .variant("liminal_carpet_1", v -> v.description("Liminal Carpet 1"))
                .variant("liminal_carpet_2", v -> v.description("Liminal Carpet 2").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED))
                .variant("liminal_carpet_3", v -> v.description("Liminal Carpet 3"))
                .variant("liminal_carpet_4", v -> v.description("Liminal Carpet 4").model(ChiselModelHandlers.V16))
                .variant("liminal_carpet_5", v -> v.description("Liminal Carpet 5").model(ChiselModelHandlers.V16))
                .variant("liminal_ceiling_1", v -> v.description("Liminal Ceiling 1"))
                .variant("liminal_ceiling_2", v -> v.description("Liminal Ceiling 2"))
                .variant("liminal_tiles_1", v -> v.description("Liminal Tiles 1"))
                .variant("liminal_tiles_2", v -> v.description("Liminal Tiles 2").model(ChiselModelHandlers.R4))
                );
        private LiminalFamily() {
        }
}