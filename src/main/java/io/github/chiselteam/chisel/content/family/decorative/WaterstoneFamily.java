package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class WaterstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("waterstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).noOcclusion())
                    .blockName("Waterstone")
                    .model(ChiselModelHandlers.MULTI_LAYER_WATER)
                    .texture("bg", Identifier.withDefaultNamespace("block/water_still")))
            .variant("waterstone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTI_LAYER_WATER_2X2)
                    .texture(Chisel.prefix("block/lavastone/lavastone_array"))
                    .textureFromBase("2x2_top_left"))
            .variant("waterstone_braid", variant -> variant
                    .description("Braid")
                    .texture(Chisel.prefix("block/lavastone/lavastone_braid")))
            .variant("waterstone_chaotic_bricks", variant -> variant
                    .description("Chaotic Waterstone Bricks")
                    .model(ChiselModelHandlers.MULTI_LAYER_WATER_3X3)
                    .texture(Chisel.prefix("block/lavastone/lavastone_chaotic_bricks"))
                    .textureFromBase("3x3_top_left"))
            .variant("waterstone_chaotic_medium", variant -> variant
                    .description("Waterstone Bricks")
                    .texture(Chisel.prefix("block/lavastone/lavastone_chaotic_medium")))
            .variant("waterstone_chaotic_small", variant -> variant
                    .description("Waterstone Tiles")
                    .texture(Chisel.prefix("block/lavastone/lavastone_chaotic_small")))
            .variant("waterstone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_TINTED)
                    .texture(Chisel.prefix("block/lavastone/lavastone_circular")))
            .variant("waterstone_cracked", variant -> variant
                    .description("Cracked")
                    .texture(Chisel.prefix("block/lavastone/lavastone_cracked")))
            .variant("waterstone_cracked_bricks", variant -> variant
                    .description("Cracked Bricks")
                    .texture(Chisel.prefix("block/lavastone/lavastone_cracked_bricks")))
            .variant("waterstone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTI_LAYER_WATER_4X4)
                    .texture(Chisel.prefix("block/lavastone/lavastone_cuts"))
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("waterstone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_TINTED)
                    .texture(Chisel.prefix("block/lavastone/lavastone_dent")))
            .variant("waterstone_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_TINTED)
                    .texture(Chisel.prefix("block/lavastone/lavastone_encased_bricks")))
            .variant("waterstone_french_1", variant -> variant
                    .description("French 1")
                    .texture(Chisel.prefix("block/lavastone/lavastone_french_1")))
            .variant("waterstone_french_2", variant -> variant
                    .description("French 2")
                    .texture(Chisel.prefix("block/lavastone/lavastone_french_2")))
            .variant("waterstone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTI_LAYER_WATER_2X2)
                    .texture(Chisel.prefix("block/lavastone/lavastone_jellybean"))
                    .textureFromBase("2x2_top_left"))
            .variant("waterstone_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/lavastone/lavastone_layers")))
            .variant("waterstone_mosaic", variant -> variant
                    .description("Water Creeper in Tiles")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_TINTED)
                    .texture(Chisel.prefix("block/lavastone/lavastone_mosaic")))
            .variant("waterstone_ornate", variant -> variant
                    .description("Ornate Water Panel")
                    .texture(Chisel.prefix("block/lavastone/lavastone_ornate")))
            .variant("waterstone_panel", variant -> variant
                    .description("Water Panel")
                    .texture(Chisel.prefix("block/lavastone/lavastone_panel")))
            .variant("waterstone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.MULTI_LAYER_TBS_TINTED)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/lavastone/lavastone_pillar-side"))
                    .texture("top", Chisel.prefix("block/lavastone/lavastone_pillar-top")))
            .variant("waterstone_prism", variant -> variant
                    .description("Prism")
                    .texture(Chisel.prefix("block/lavastone/lavastone_prism")))
            .variant("waterstone_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/lavastone/lavastone_raw")))
            .variant("waterstone_road", variant -> variant
                    .description("Road")
                    .texture(Chisel.prefix("block/lavastone/lavastone_road")))
            .variant("waterstone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTI_LAYER_WATER_2X2)
                    .texture(Chisel.prefix("block/lavastone/lavastone_slanted"))
                    .textureFromBase("2x2_bottom_left")
                    .textureAlias("2x2_bottom_right", "2x2_top_right")
                    .textureFromBase("2x2_top_left"))
            .variant("waterstone_small_bricks", variant -> variant
                    .description("Small Bricks")
                    .texture(Chisel.prefix("block/lavastone/lavastone_small_bricks")))
            .variant("waterstone_soft_bricks", variant -> variant
                    .description("Soft Bricks")
                    .texture(Chisel.prefix("block/lavastone/lavastone_soft_bricks")))
            .variant("waterstone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_TINTED)
                    .texture(Chisel.prefix("block/lavastone/lavastone_tiles_large"))
                    .texture("ctm_cornerless", Chisel.prefix("block/lavastone/lavastone_mosaic-ctm_cornerless")))
            .variant("waterstone_tiles_medium", variant -> variant
                    .description("Medium Tiles")
                    .texture(Chisel.prefix("block/lavastone/lavastone_tiles_medium")))
            .variant("waterstone_triple_bricks", variant -> variant
                    .description("Triple Bricks")
                    .texture(Chisel.prefix("block/lavastone/lavastone_triple_bricks")))
            .variant("waterstone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.MULTI_LAYER_TBS_TINTED)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/lavastone/lavastone_twisted-side"))
                    .texture("top", Chisel.prefix("block/lavastone/lavastone_twisted-top")))
            .variant("waterstone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_TINTED)
                    .texture(Chisel.prefix("block/lavastone/lavastone_weaver")))
            .variant("waterstone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTI_LAYER_WATER_AR)
                    .texture(Chisel.prefix("block/lavastone/lavastone_zag"))
                    .textureFromBase("ar_variant_1")));

    private WaterstoneFamily() {
    }
}
