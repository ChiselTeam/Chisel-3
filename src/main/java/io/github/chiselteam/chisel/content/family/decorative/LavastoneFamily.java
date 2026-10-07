package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LavastoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("lavastone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Lavastone")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA)
                    .texture("bg", Identifier.withDefaultNamespace("block/lava_still")))
            .variant("lavastone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("lavastone_braid", variant -> variant
                    .description("Braid"))
            .variant("lavastone_chaotic_bricks", variant -> variant
                    .description("Chaotic Lavastone Bricks")
                    .model(ChiselModelHandlers.LAVA_3x3)
                    .textureFromBase("3x3_top_left"))
            .variant("lavastone_chaotic_medium", variant -> variant
                    .description("Lavastone Bricks"))
            .variant("lavastone_chaotic_small", variant -> variant
                    .description("Lavastone Tiles"))
            .variant("lavastone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_cracked", variant -> variant
                    .description("Cracked"))
            .variant("lavastone_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("lavastone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.LAVA_4x4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("lavastone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_french_1", variant -> variant
                    .description("French 1"))
            .variant("lavastone_french_2", variant -> variant
                    .description("French 2"))
            .variant("lavastone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("lavastone_layers", variant -> variant
                    .description("Layers"))
            .variant("lavastone_mosaic", variant -> variant
                    .description("Lava Creeper in Tiles")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_ornate", variant -> variant
                    .description("Ornate Lava Panel"))
            .variant("lavastone_panel", variant -> variant
                    .description("Lava Panel"))
            .variant("lavastone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/lavastone/lavastone_pillar-top")))
            .variant("lavastone_prism", variant -> variant
                    .description("Prism"))
            .variant("lavastone_raw", variant -> variant
                    .description("Black Lavastone"))
            .variant("lavastone_road", variant -> variant
                    .description("Road"))
            .variant("lavastone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/lavastone/lavastone_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("lavastone_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("lavastone_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("lavastone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)
                    .texture("ctm_cornerless", Chisel.prefix("block/lavastone/lavastone_mosaic-ctm_cornerless")))
            .variant("lavastone_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("lavastone_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("lavastone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/lavastone/lavastone_twisted-top")))
            .variant("lavastone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTI_LAYER_LAVA_AR)
                    .textureFromBase("ar_variant_1")));

    private LavastoneFamily() {
    }
}
