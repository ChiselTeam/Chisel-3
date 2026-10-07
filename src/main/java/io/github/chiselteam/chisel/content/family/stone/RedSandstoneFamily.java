package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RedSandstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("red_sandstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Red Sandstone"))
            .existingBlock(Blocks.RED_SANDSTONE)
            .existingBlock(Blocks.CHISELED_RED_SANDSTONE)
            .existingBlock(Blocks.SMOOTH_RED_SANDSTONE)
            .existingBlock(Blocks.CUT_RED_SANDSTONE)
            .variant("red_sandstone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("red_sandstone_braid", variant -> variant
                    .description("Braid"))
            .variant("red_sandstone_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("red_sandstone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("red_sandstone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("red_sandstone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("red_sandstone_cracked", variant -> variant
                    .description("Cracked"))
            .variant("red_sandstone_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("red_sandstone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("red_sandstone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("red_sandstone_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("red_sandstone_french_1", variant -> variant
                    .description("French 1"))
            .variant("red_sandstone_french_2", variant -> variant
                    .description("French 2"))
            .variant("red_sandstone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("red_sandstone_layers", variant -> variant
                    .description("Layers"))
            .variant("red_sandstone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("red_sandstone_ornate", variant -> variant
                    .description("Ornate Red Sandstone"))
            .variant("red_sandstone_panel", variant -> variant
                    .description("Panel"))
            .variant("red_sandstone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/red_sandstone/red_sandstone_pillar-top")))
            .variant("red_sandstone_prism", variant -> variant
                    .description("Prismatic Red Sandstone"))
            .variant("red_sandstone_road", variant -> variant
                    .description("Road"))
            .variant("red_sandstone_scribbles_0", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_1", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_2", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_3", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_4", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_5", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_6", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_7", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_8", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_9", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_10", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_11", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_12", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_13", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_14", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_scribbles_15", variant -> variant
                    .description("Scribbles")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/red_sandstone/red_sandstone_scribbles_0-top")))
            .variant("red_sandstone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("red_sandstone_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("red_sandstone_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("red_sandstone_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("red_sandstone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("red_sandstone_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("red_sandstone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("red_sandstone_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("red_sandstone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/red_sandstone/red_sandstone_twisted-top")))
            .variant("red_sandstone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("red_sandstone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private RedSandstoneFamily() {
    }
}
