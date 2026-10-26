package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MagmaFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("magma", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Magma").model(ChiselModelHandlers.MULTI_LAYER_LAVA)
                    .texture("bg", ResourceLocation.withDefaultNamespace("block/lava_still")))
            .existingBlock(Blocks.MAGMA_BLOCK)
            .variant("magma_array", v -> v.description("Array").model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("magma_braid", v -> v.description("Braid"))
            .variant("magma_chaotic_bricks", v -> v.description("Chaotic Bricks").model(ChiselModelHandlers.LAVA_3x3)
                    .textureFromBase("3x3_top_left"))
            .variant("magma_chaotic_medium", v -> v.description("Chaotic Medium"))
            .variant("magma_chaotic_small", v -> v.description("Chaotic Small"))
            .variant("magma_circular", v -> v.description("Circular").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)
                    .texture("ctm_cornerless", Chisel.prefix("block/magma/magma_dent-ctm_cornerless")))
            .variant("magma_cracked", v -> v.description("Cracked"))
            .variant("magma_cracked_bricks", v -> v.description("Cracked Bricks"))
            .variant("magma_cuts", v -> v.description("Cuts").model(ChiselModelHandlers.LAVA_4x4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("magma_dent", v -> v.description("Dent").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_encased_bricks", v -> v.description("Encased Bricks").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_french_1", v -> v.description("French 1"))
            .variant("magma_french_2", v -> v.description("French 2"))
            .variant("magma_jellybean", v -> v.description("Jellybean").model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("magma_layers", v -> v.description("Layers"))
            .variant("magma_mosaic", v -> v.description("Mosaic").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_ornate", v -> v.description("Ornate Magma"))
            .variant("magma_panel", v -> v.description("Panel"))
            .variant("magma_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/magma/magma_pillar-top")))
            .variant("magma_prism", v -> v.description("Prismatic Magma"))
            .variant("magma_raw", v -> v.description("Raw"))
            .variant("magma_road", v -> v.description("Road"))
            .variant("magma_slanted", v -> v.description("Slanted").model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("magma_small_bricks", v -> v.description("Small Bricks"))
            .variant("magma_soft_bricks", v -> v.description("Soft Bricks"))
            .variant("magma_solid_bricks", v -> v.description("Solid Bricks"))
            .variant("magma_tiles_large", v -> v.description("Large Tiles").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_tiles_medium", v -> v.description("Medium Tiles"))
            .variant("magma_tiles_small", v -> v.description("Small Tiles"))
            .variant("magma_triple_bricks", v -> v.description("Triple Bricks"))
            .variant("magma_twisted", v -> v.description("Twisted").model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/magma/magma_twisted-top")))
            .variant("magma_weaver", v -> v.description("Weaver").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("magma_zag", v -> v.description("Zag").model(ChiselModelHandlers.MULTI_LAYER_LAVA_AR)
                    .textureFromBase("ar_variant_1")));

    private MagmaFamily() {
    }
}
