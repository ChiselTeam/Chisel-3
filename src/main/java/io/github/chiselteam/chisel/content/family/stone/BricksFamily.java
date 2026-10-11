package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BricksFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bricks", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)).blockName("Bricks"))
            .existingBlock(Blocks.BRICKS)
            .variant("bricks_array", v -> v.description("Array").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("bricks_braid", v -> v.description("Braid"))
            .variant("bricks_chaotic", v -> v.description("Chaotic").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("bricks_chaotic_medium", v -> v.description("Chaotic Medium"))
            .variant("bricks_chaotic_small", v -> v.description("Chaotic Small"))
            .variant("bricks_circular", v -> v.description("Circular").model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_cracked", v -> v.description("Cracked Bricks"))
            .variant("bricks_cracked_bricks", v -> v.description("Cracked Bricks"))
            .variant("bricks_cuts", v -> v.description("Cuts").model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("bricks_dent", v -> v.description("Dented Bricks").model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_encased", v -> v.description("Encased").model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_french", v -> v.description("French 1"))
            .variant("bricks_french_2", v -> v.description("French 2"))
            .variant("bricks_jellybean", v -> v.description("Jellybean").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("bricks_layers", v -> v.description("Layers"))
            .variant("bricks_mosaic", v -> v.description("Mosaic").model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_ornate", v -> v.description("Ornate"))
            .variant("bricks_panel", v -> v.description("Panel"))
            .variant("bricks_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/bricks/bricks_pillar-top")))
            .variant("bricks_prism", v -> v.description("Prism"))
            .variant("bricks_raw", v -> v.description("Raw"))
            .variant("bricks_road", v -> v.description("Road"))
            .variant("bricks_slanted", v -> v.description("Slanted").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("bricks_small", v -> v.description("Small Tiles"))
            .variant("bricks_soft", v -> v.description("Yellow Bricks"))
            .variant("bricks_solid", v -> v.description("Solid"))
            .variant("bricks_tiles_large", v -> v.description("Large Tiles").model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_tiles_medium", v -> v.description("Medium Tiles"))
            .variant("bricks_tiles_small", v -> v.description("Small Tiles"))
            .variant("bricks_triple", v -> v.description("Triple"))
            .variant("bricks_twisted", v -> v.description("Twisted").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/bricks/bricks_twisted-top")))
            .variant("bricks_weaver", v -> v.description("Weaver").model(ChiselModelHandlers.CONNECTED))
            .variant("bricks_zag", v -> v.description("Zag").model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private BricksFamily() {
    }
}
