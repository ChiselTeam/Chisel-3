package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MarbleFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("marble", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Marble"))
            .variant("marble_raw", variant -> variant
                    .description("Raw"))
            .variant("marble_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("marble_braid", variant -> variant
                    .description("Braid"))
            .variant("marble_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("marble_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("marble_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("marble_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/marble/marble_dent-ctm_cornerless")))
            .variant("marble_cracked", variant -> variant
                    .description("Cracked"))
            .variant("marble_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("marble_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("marble_dent", variant -> variant
                    .description("Marble with Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("marble_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("marble_french_1", variant -> variant
                    .description("French 1"))
            .variant("marble_french_2", variant -> variant
                    .description("French 2"))
            .variant("marble_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("marble_layers", variant -> variant
                    .description("Layers"))
            .variant("marble_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("marble_ornate", variant -> variant
                    .description("Ornate Marble Panel"))
            .variant("marble_panel", variant -> variant
                    .description("Marble Panel"))
            .variant("marble_pillar", variant -> variant
                    .description("Marble Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/marble/marble_pillar-top")))
            .variant("marble_pillar_carved", variant -> variant
                    .description("Carved Marble Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/marble/marble_pillar_carved-top")))
            .variant("marble_pillar_convex", variant -> variant
                    .description("Convex Marble Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_carved-top"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_convex-side")))
            .variant("marble_pillar_greek_decor", variant -> variant
                    .description("Greek Marble Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_greek_decor-side")))
            .variant("marble_pillar_greek_greek", variant -> variant
                    .description("Greek Marble Pillar with Greek Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/marble/marble_pillar_wide_greek-side"))
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_both", Chisel.prefix("block/marble/marble_pillar_greek_decor-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("marble_pillar_greek_plain", variant -> variant
                    .description("Greek Marble Pillar with Plain Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_both", Chisel.prefix("block/marble/marble_pillar_greek_decor-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_greek_plain-side")))
            .variant("marble_pillar_normal", variant -> variant
                    .description("Original Marble Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_carved-top"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_normal-side")))
            .variant("marble_pillar_normal2", variant -> variant
                    .description("Greek Marble Pillar with Ornate Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_carved-top"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_normal2-side")))
            .variant("marble_pillar_ornamental", variant -> variant
                    .description("Ornamental Marble Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top")))
            .variant("marble_pillar_plain_decor", variant -> variant
                    .description("Plain Marble Pillar with Greek Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_plain_decor-side")))
            .variant("marble_pillar_plain_greek", variant -> variant
                    .description("Plain Marble Pillar with Greek Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/marble/marble_pillar_wide_greek-side"))
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_both", Chisel.prefix("block/marble/marble_pillar_plain_decor-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("marble_pillar_plain_plain", variant -> variant
                    .description("Plain Marble Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_both", Chisel.prefix("block/marble/marble_pillar_plain_decor-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_plain_plain-side")))
            .variant("marble_pillar_rough", variant -> variant
                    .description("Rough Marble Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_rough-side")))
            .variant("marble_pillar_simple", variant -> variant
                    .description("Simplistic Marble Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/marble/marble_pillar_simple-top"))
                    .texture("vertical_both", Chisel.prefix("block/marble/marble_pillar_simple-side"))
                    .textureAlias("vertical_bottom", "vertical_both")
                    .textureAlias("vertical_none", "vertical_both")
                    .textureAlias("vertical_top", "vertical_both"))
            .variant("marble_pillar_wide_decor", variant -> variant
                    .description("Wide Marble Pillar with Greek Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_wide_decor-side")))
            .variant("marble_pillar_wide_greek", variant -> variant
                    .description("Wide Marble Pillar with Greek Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_both", Chisel.prefix("block/marble/marble_pillar_wide_decor-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_wide_greek-side")))
            .variant("marble_pillar_wide_plain", variant -> variant
                    .description("Wide Marble Pillar with Plain Capstone")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/marble/marble_pillar_rough-top"))
                    .texture("vertical_both", Chisel.prefix("block/marble/marble_pillar_wide_decor-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/marble/marble_pillar_wide_plain-side")))
            .variant("marble_prism", variant -> variant
                    .description("Prism"))
            .variant("marble_road", variant -> variant
                    .description("Road"))
            .variant("marble_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/marble/marble_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("marble_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("marble_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("marble_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("marble_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/marble/marble_mosaic-ctm_cornerless")))
            .variant("marble_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("marble_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("marble_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("marble_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/marble/marble_twisted-top")))
            .variant("marble_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/marble/marble_weaver-ctm_corner")))
            .variant("marble_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private MarbleFamily() {
    }
}
