package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TerracottaFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("terracotta", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)).blockName("Terracotta"))
            .existingBlock(Blocks.TERRACOTTA)
            .variant("terracotta_array", v -> v.description("Array").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("terracotta_braid", v -> v.description("Braid"))
            .variant("terracotta_chaotic_bricks", v -> v.description("Chaotic Bricks").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("terracotta_chaotic_medium", v -> v.description("Chaotic Medium"))
            .variant("terracotta_chaotic_small", v -> v.description("Chaotic Small"))
            .variant("terracotta_circular", v -> v.description("Circular").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/terracotta/terracotta_dent-ctm_cornerless")))
            .variant("terracotta_cracked", v -> v.description("Cracked"))
            .variant("terracotta_cracked_bricks", v -> v.description("Cracked Bricks"))
            .variant("terracotta_cuts", v -> v.description("Cuts").model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("terracotta_dent", v -> v.description("Dent").model(ChiselModelHandlers.CONNECTED))
            .variant("terracotta_encased_bricks", v -> v.description("Encased Bricks").model(ChiselModelHandlers.CONNECTED))
            .variant("terracotta_french_1", v -> v.description("French 1"))
            .variant("terracotta_french_2", v -> v.description("French 2"))
            .variant("terracotta_jellybean", v -> v.description("Jellybean").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("terracotta_layers", v -> v.description("Layers"))
            .variant("terracotta_mosaic", v -> v.description("Mosaic").model(ChiselModelHandlers.CONNECTED))
            .variant("terracotta_ornate", v -> v.description("Ornate Terracotta"))
            .variant("terracotta_panel", v -> v.description("Panel"))
            .variant("terracotta_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/terracotta/terracotta_pillar-top")))
            .variant("terracotta_prism", v -> v.description("Prismatic Terracotta"))
            .variant("terracotta_road", v -> v.description("Road"))
            .variant("terracotta_slanted", v -> v.description("Slanted").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/terracotta/terracotta_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("terracotta_small_bricks", v -> v.description("Small Bricks"))
            .variant("terracotta_soft_bricks", v -> v.description("Soft Bricks"))
            .variant("terracotta_solid_bricks", v -> v.description("Solid Bricks"))
            .variant("terracotta_tiles_large", v -> v.description("Large Tiles").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/terracotta/terracotta_mosaic-ctm_cornerless")))
            .variant("terracotta_tiles_medium", v -> v.description("Medium Tiles"))
            .variant("terracotta_tiles_small", v -> v.description("Small Tiles"))
            .variant("terracotta_triple_bricks", v -> v.description("Triple Bricks"))
            .variant("terracotta_twisted", v -> v.description("Twisted").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/terracotta/terracotta_twisted-top")))
            .variant("terracotta_weaver", v -> v.description("Weaver").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/terracotta/terracotta_weaver-ctm_corner")))
            .variant("terracotta_zag", v -> v.description("Zag").model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private TerracottaFamily() {
    }
}
