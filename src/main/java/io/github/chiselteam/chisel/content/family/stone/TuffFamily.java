package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TuffFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("tuff", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF))
                    .blockName("Tuff"))
            .existingBlock(Blocks.TUFF)
            .existingBlock(Blocks.CHISELED_TUFF)
            .existingBlock(Blocks.POLISHED_TUFF)
            .existingBlock(Blocks.TUFF_BRICKS)
            .existingBlock(Blocks.CHISELED_TUFF_BRICKS)
            .variant("tuff_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("tuff_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless")))
            .variant("tuff_braid", variant -> variant
                    .description("Braid"))
            .variant("tuff_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tuff_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("tuff_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tuff_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("tuff_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("tuff_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("tuff_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("tuff_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("tuff_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("tuff_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("tuff_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("tuff_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("tuff_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("tuff_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("tuff_checker", variant -> variant
                    .description("Checker"))
            .variant("tuff_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("tuff_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless")))
            .variant("tuff_cobble", variant -> variant
                    .description("Cobble"))
            .variant("tuff_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("tuff_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tuff_french_1", variant -> variant
                    .description("French 1"))
            .variant("tuff_french_2", variant -> variant
                    .description("French 2"))
            .variant("tuff_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless")))
            .variant("tuff_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("tuff_layers", variant -> variant
                    .description("Layers"))
            .variant("tuff_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tuff_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("tuff_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("tuff_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("bottom", Chisel.prefix("block/tuff/tuff_meander_horizontal-top")))
            .variant("tuff_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/tuff/tuff_meander_vertical-top")))
            .variant("tuff_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless")))
            .variant("tuff_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("tuff_panel", variant -> variant
                    .description("Panel"))
            .variant("tuff_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/tuff/tuff_pillar-top")))
            .variant("tuff_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_basic-side")))
            .variant("tuff_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_basic_dent-side")))
            .variant("tuff_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_basic_plain-side")))
            .variant("tuff_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_basic_round-side")))
            .variant("tuff_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_basic_spiral-side")))
            .variant("tuff_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/tuff/tuff_pillar_classic-top")))
            .variant("tuff_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/tuff/tuff_pillar_classic_large-top")))
            .variant("tuff_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_ionic-side")))
            .variant("tuff_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top")))
            .variant("tuff_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_large_ionic_triple-side")))
            .variant("tuff_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/tuff/tuff_pillar_meander-side")))
            .variant("tuff_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/tuff/tuff_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/tuff/tuff_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/tuff/tuff_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("tuff_plate", variant -> variant
                    .description("Plate"))
            .variant("tuff_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless")))
            .variant("tuff_polished", variant -> variant
                    .description("Polished"))
            .variant("tuff_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tuff_prism", variant -> variant
                    .description("Prismatic"))
            .variant("tuff_raw", variant -> variant
                    .description("Raw"))
            .variant("tuff_road", variant -> variant
                    .description("Road"))
            .variant("tuff_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("tuff_tiles", variant -> variant
                    .description("Tiles"))
            .variant("tuff_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/tuff/tuff_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/tuff/tuff_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/tuff/tuff_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/tuff/tuff_tiles_large-ctm_vertical")))
            .variant("tuff_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("tuff_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/tuff/tuff_twisted-top")))
            .variant("tuff_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tuff_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("tuff_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("tuff_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("tuff_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_herringbone")))
            .variant("tuff_medallion", variant -> variant
                    .description("Medallion"))
            .variant("tuff_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_medallion")))
            .variant("tuff_dots", variant -> variant
                    .description("Dots"))
            .variant("tuff_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dots")))
            .variant("tuff_heart", variant -> variant
                    .description("Heart"))
            .variant("tuff_star", variant -> variant
                    .description("Star"))
            .variant("tuff_plating", variant -> variant
                    .description("Plating"))
            .variant("tuff_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("tuff_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/tuff/tuff_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/tuff/tuff_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/tuff/tuff_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/tuff/tuff_lodestone_connected-ctm_vertical")))
            .variant("tuff_plank", variant -> variant
                    .description("Plank"))
            .variant("tuff_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/tuff/tuff_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/tuff/tuff_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/tuff/tuff_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/tuff/tuff_plank_connected-ctm_vertical")))
            .variant("tuff_frame", variant -> variant
                    .description("Frame"))
            .variant("tuff_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("tuff_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("tuff_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("tuff_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("tuff_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("tuff_stripes", variant -> variant
                    .description("Stripes"))
            .variant("tuff_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_stripes")))
            .variant("tuff_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("tuff_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("tuff_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("tuff_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("tuff_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("tuff_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("tuff_facet", variant -> variant
                    .description("Facet"))
            .variant("tuff_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("tuff_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_facet_small")))
            .variant("tuff_shiny", variant -> variant
                    .description("Shiny"))
            .variant("tuff_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/tuff/tuff_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/tuff/tuff_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/tuff/tuff_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/tuff/tuff_shiny_connected-ctm_vertical")))
            .variant("tuff_gem", variant -> variant
                    .description("Gem"))
            .variant("tuff_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("tuff_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/tuff/tuff_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/tuff/tuff_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/tuff/tuff_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/tuff/tuff_gem_1_connected-ctm_vertical")))
            .variant("tuff_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("tuff_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/tuff/tuff_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/tuff/tuff_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/tuff/tuff_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/tuff/tuff_gem_2_connected-ctm_vertical")))
            .variant("tuff_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("tuff_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/tuff/tuff_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/tuff/tuff_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/tuff/tuff_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/tuff/tuff_gem_3_connected-ctm_vertical")))
            .variant("tuff_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("tuff_slab", variant -> variant
                    .description("Slab"))
            .variant("tuff_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("tuff_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_scaffold")))
            .variant("tuff_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("tuff_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("tuff_parquet", variant -> variant
                    .description("Parquet"))
            .variant("tuff_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/tuff/tuff_parquet"))));

    private TuffFamily() {
    }
}
