package io.github.chiselteam.chisel.content.compat.thaumaturge;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TTTallowFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tt_tallow", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)).blockName("Tallow"))
            .variant("tallow_block", v -> v.description("Block").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tt_tallow/tallow_smooth")))
            .variant("tallow_faces", v -> v.description("Pareidolia"))
            .variant("tallow_smooth", v -> v.description("Smooth")));

    private TTTallowFamily() {
    }
}
