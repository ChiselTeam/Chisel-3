package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MagmaFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("magma", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Magma")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA)
                    .texture("bg", Identifier.withDefaultNamespace("block/lava_still")))
            .existingBlock(Blocks.MAGMA_BLOCK)
            .variant("magma_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("magma_braid", variant -> variant
                    .description("Braid"))
            .variant("magma_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.LAVA_3x3)
                    .textureFromBase("3x3_top_left"))
            .variant("magma_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("magma_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("magma_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)
                    .texture("ctm_cornerless", Chisel.prefix("block/magma/magma_dent-ctm_cornerless")))
            .variant("magma_cracked", variant -> variant
                    .description("Cracked"))
            .variant("magma_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("magma_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.LAVA_4x4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("magma_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_french_1", variant -> variant
                    .description("French 1"))
            .variant("magma_french_2", variant -> variant
                    .description("French 2"))
            .variant("magma_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("magma_layers", variant -> variant
                    .description("Layers"))
            .variant("magma_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_ornate", variant -> variant
                    .description("Ornate Magma"))
            .variant("magma_panel", variant -> variant
                    .description("Panel"))
            .variant("magma_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/magma/magma_pillar-top")))
            .variant("magma_prism", variant -> variant
                    .description("Prismatic Magma"))
            .variant("magma_raw", variant -> variant
                    .description("Raw"))
            .variant("magma_road", variant -> variant
                    .description("Road"))
            .variant("magma_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("magma_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("magma_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("magma_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("magma_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("magma_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("magma_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("magma_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/magma/magma_twisted-top")))
            .variant("magma_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA_AR)
                    .textureFromBase("ar_variant_1")));

    private MagmaFamily() {
    }
}
