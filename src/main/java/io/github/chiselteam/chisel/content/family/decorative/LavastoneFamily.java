package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LavastoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("lavastone", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Lavastone").model(ChiselModelHandlers.MULTI_LAYER_LAVA)
                    .texture("bg", Identifier.withDefaultNamespace("block/lava_still")))
            .variant("lavastone_array", v -> v.description("Array").model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("lavastone_braid", v -> v.description("Braid"))
            .variant("lavastone_chaotic_bricks", v -> v.description("Chaotic Lavastone Bricks").model(ChiselModelHandlers.LAVA_3x3)
                    .textureFromBase("3x3_top_left"))
            .variant("lavastone_chaotic_medium", v -> v.description("Chaotic Medium"))
            .variant("lavastone_chaotic_small", v -> v.description("Chaotic Small"))
            .variant("lavastone_circular", v -> v.description("Circular").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_cracked", v -> v.description("Cracked"))
            .variant("lavastone_cracked_bricks", v -> v.description("Cracked Bricks"))
            .variant("lavastone_cuts", v -> v.description("Cuts").model(ChiselModelHandlers.LAVA_4x4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("lavastone_dent", v -> v.description("Dent").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_encased_bricks", v -> v.description("Encased Bricks").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_french_1", v -> v.description("French 1"))
            .variant("lavastone_french_2", v -> v.description("French 2"))
            .variant("lavastone_jellybean", v -> v.description("Jellybean").model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_top_left"))
            .variant("lavastone_layers", v -> v.description("Layers"))
            .variant("lavastone_mosaic", v -> v.description("Mosaic").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_ornate", v -> v.description("Ornate Lava Panel"))
            .variant("lavastone_panel", v -> v.description("Lava Panel"))
            .variant("lavastone_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/lavastone/lavastone_pillar-top")))
            .variant("lavastone_prism", v -> v.description("Prism"))
            .variant("lavastone_raw", v -> v.description("Raw"))
            .variant("lavastone_road", v -> v.description("Road"))
            .variant("lavastone_slanted", v -> v.description("Slanted").model(ChiselModelHandlers.LAVA_2x2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/lavastone/lavastone_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("lavastone_small_bricks", v -> v.description("Small Bricks"))
            .variant("lavastone_soft_bricks", v -> v.description("Soft Bricks"))
            .variant("lavastone_tiles_large", v -> v.description("Large Tiles").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW)
                    .texture("ctm_cornerless", Chisel.prefix("block/lavastone/lavastone_mosaic-ctm_cornerless")))
            .variant("lavastone_tiles_medium", v -> v.description("Medium Tiles"))
            .variant("lavastone_triple_bricks", v -> v.description("Triple Bricks"))
            .variant("lavastone_twisted", v -> v.description("Twisted").model(ChiselModelHandlers.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                    .texture("bottom", Chisel.prefix("block/lavastone/lavastone_twisted-top")))
            .variant("lavastone_weaver", v -> v.description("Weaver").model(ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW))
            .variant("lavastone_zag", v -> v.description("Zag").model(ChiselModelHandlers.MULTI_LAYER_LAVA_AR)
                    .textureFromBase("ar_variant_1")));

    private LavastoneFamily() {
    }
}
