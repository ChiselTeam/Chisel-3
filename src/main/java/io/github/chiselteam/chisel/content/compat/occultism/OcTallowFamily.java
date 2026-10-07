package io.github.chiselteam.chisel.content.compat.occultism;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class OcTallowFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("oc_tallow", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL))
                    .blockName("Tallow"))
            .variant("tallow_block", variant -> variant
                    .description("Block")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/oc_tallow/tallow_smooth")))
            .variant("tallow_faces", variant -> variant
                    .description("Pareidolia"))
            .variant("tallow_smooth", variant -> variant
                    .description("Smooth")));

    private OcTallowFamily() {
    }
}
