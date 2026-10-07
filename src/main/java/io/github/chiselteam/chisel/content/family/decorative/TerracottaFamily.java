package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TerracottaFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("terracotta", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))
                    .blockName("Terracotta"))
            .existingBlock(Blocks.TERRACOTTA)
            .variant("terracotta_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("terracotta_braid", variant -> variant
                    .description("Braid"))
            .variant("terracotta_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("terracotta_chaotic_medium", variant -> variant
                    .description("Terracotta Bricks"))
            .variant("terracotta_chaotic_small", variant -> variant
                    .description("Terracotta Small Tiles"))
            .variant("terracotta_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/terracotta/terracotta_dent-ctm_cornerless")))
            .variant("terracotta_cracked", variant -> variant
                    .description("Cracked"))
            .variant("terracotta_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("terracotta_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("terracotta_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("terracotta_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("terracotta_french_1", variant -> variant
                    .description("French 1"))
            .variant("terracotta_french_2", variant -> variant
                    .description("French 2"))
            .variant("terracotta_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("terracotta_layers", variant -> variant
                    .description("Layers"))
            .variant("terracotta_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("terracotta_ornate", variant -> variant
                    .description("Ornate Terracotta"))
            .variant("terracotta_panel", variant -> variant
                    .description("Panel"))
            .variant("terracotta_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/terracotta/terracotta_pillar-top")))
            .variant("terracotta_prism", variant -> variant
                    .description("Prismatic Terracotta"))
            .variant("terracotta_road", variant -> variant
                    .description("Road"))
            .variant("terracotta_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/terracotta/terracotta_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("terracotta_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("terracotta_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("terracotta_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("terracotta_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/terracotta/terracotta_mosaic-ctm_cornerless")))
            .variant("terracotta_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("terracotta_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("terracotta_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("terracotta_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/terracotta/terracotta_twisted-top")))
            .variant("terracotta_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/terracotta/terracotta_weaver-ctm_corner")))
            .variant("terracotta_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private TerracottaFamily() {
    }
}
