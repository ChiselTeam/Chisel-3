package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BricksFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bricks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS))
                    .blockName("Bricks"))
            .existingBlock(Blocks.BRICKS)
            .variant("bricks_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("bricks_braid", variant -> variant
                    .description("Braid"))
            .variant("bricks_chaotic", variant -> variant
                    .description("Varied Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("bricks_chaotic_medium", variant -> variant
                    .description("Detailed Bricks"))
            .variant("bricks_chaotic_small", variant -> variant
                    .description("Small Bricks"))
            .variant("bricks_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_cracked", variant -> variant
                    .description("Damaged Bricks"))
            .variant("bricks_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("bricks_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("bricks_dent", variant -> variant
                    .description("Bricks with Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_encased", variant -> variant
                    .description("Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_french", variant -> variant
                    .description("Mortarless Bricks"))
            .variant("bricks_french_2", variant -> variant
                    .description("Aged Bricks"))
            .variant("bricks_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("bricks_layers", variant -> variant
                    .description("Layers"))
            .variant("bricks_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_ornate", variant -> variant
                    .description("Ornate"))
            .variant("bricks_panel", variant -> variant
                    .description("Panel"))
            .variant("bricks_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/bricks/bricks_pillar-top")))
            .variant("bricks_prism", variant -> variant
                    .description("Prism"))
            .variant("bricks_raw", variant -> variant
                    .description("Raw"))
            .variant("bricks_road", variant -> variant
                    .description("Road"))
            .variant("bricks_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("bricks_small", variant -> variant
                    .description("Small Tiles"))
            .variant("bricks_soft", variant -> variant
                    .description("Yellow Bricks"))
            .variant("bricks_solid", variant -> variant
                    .description("Solid"))
            .variant("bricks_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("bricks_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("bricks_triple", variant -> variant
                    .description("Triple"))
            .variant("bricks_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/bricks/bricks_twisted-top")))
            .variant("bricks_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private BricksFamily() {
    }
}
