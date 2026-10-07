package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SandstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("sandstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE))
                    .blockName("Sandstone")
                    .model(ChiselModelHandlers.TBS))
            .existingBlock(Blocks.SANDSTONE)
            .existingBlock(Blocks.CHISELED_SANDSTONE)
            .existingBlock(Blocks.SMOOTH_SANDSTONE)
            .existingBlock(Blocks.CUT_SANDSTONE)
            .variant("sandstone_base", variant -> variant
                    .description("Stacked Sandstone Tiles")
                    .texture("bottom", Chisel.prefix("block/sandstone/sandstone_base-top")))
            .variant("sandstone_block", variant -> variant
                    .description("Sandstone Block")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("sandstone_blocks", variant -> variant
                    .description("Small Sandstone Blocks")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("sandstone_brick_flat", variant -> variant
                    .description("Flat Brick"))
            .variant("sandstone_capstone", variant -> variant
                    .description("Sandstone Pillar Capstone")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_base-top")))
            .variant("sandstone_cobble_solid", variant -> variant
                    .description("Sandcobble")
                    .texture("bottom", Chisel.prefix("block/sandstone/sandstone_cobble_solid-top"))
                    .textureAlias("side", "bottom"))
            .variant("sandstone_column", variant -> variant
                    .description("Sandstone Pillar")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_base-top")))
            .variant("sandstone_creeper", variant -> variant
                    .description("Sandstone Creeper")
                    .texture("bottom", Chisel.prefix("block/sandstone/sandstone_creeper-top"))
                    .textureAlias("side", "bottom"))
            .variant("sandstone_faded", variant -> variant
                    .description("Faded Sandstone")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_horizontal_tiles", variant -> variant
                    .description("Horizontal Tiles")
                    .texture("bottom", Chisel.prefix("block/sandstone/sandstone_horizontal_tiles-top")))
            .variant("sandstone_mosaic", variant -> variant
                    .description("Sandstone Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_0", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_1", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_2", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_3", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_4", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_5", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_6", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_7", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_8", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_9", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_10", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_11", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_12", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_13", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_14", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_scribbles_15", variant -> variant
                    .description("Sandstone Scribbles")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_small", variant -> variant
                    .description("Small Sandstone Pillar")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_base-top")))
            .variant("sandstone_smooth", variant -> variant
                    .description("Smooth")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("sandstone_smooth_base", variant -> variant
                    .description("Smooth Sandstone Pillar Base")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_smooth_cap", variant -> variant
                    .description("Smooth Sandstone Pillar Capstone")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth")))
            .variant("sandstone_smooth_flat", variant -> variant
                    .description("Smooth & Flat Sandstone")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_brick_flat-top")))
            .variant("sandstone_smooth_glyph", variant -> variant
                    .description("Sandstone Glyphs")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_brick_flat-top")))
            .variant("sandstone_smooth_small", variant -> variant
                    .description("Small Smooth Sandstone Pillar")
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/sandstone/sandstone_smooth"))));

    private SandstoneFamily() {
    }
}
