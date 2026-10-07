package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class StoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("stone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Stone"))
            .existingBlock(Blocks.STONE)
            .existingBlock(Blocks.STONE_BRICKS)
            .existingBlock(Blocks.CHISELED_STONE_BRICKS)
            .variant("stone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("stone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("stone_braid", variant -> variant
                    .description("Braid"))
            .variant("stone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_braid")))
            .variant("stone_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("stone_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_large_bricks")))
            .variant("stone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("stone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("stone_large_bricks", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .texture("2x2_top_left", Chisel.prefix("block/stone/stone_large_bricks-2x2_bottom_right"))
                    .texture("2x2_top_right", Chisel.prefix("block/stone/stone_large_bricks-2x2_bottom_left")))
            .variant("stone_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("stone_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("stone_bricks_solid", variant -> variant
                    .description("Solid Bricks")
                    .texture(Chisel.prefix("block/stone/stone_large_bricks")))
            .variant("stone_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("stone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("stone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("stone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("stone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("stone_checker", variant -> variant
                    .description("Checker"))
            .variant("stone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("stone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_cracked", variant -> variant
                    .description("Cracked"))
            .variant("stone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("stone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("stone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_french_1", variant -> variant
                    .description("French 1"))
            .variant("stone_french_2", variant -> variant
                    .description("French 2"))
            .variant("stone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("stone_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/stone/stone_layers_connected")))
            .variant("stone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("stone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("stone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("stone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/stone/stone_meander_horizontal-bottom")))
            .variant("stone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/stone/stone_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_meander_vertical-side")))
            .variant("stone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("stone_panel", variant -> variant
                    .description("Panel"))
            .variant("stone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/stone/stone_pillar-bottom")))
            .variant("stone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_basic-side")))
            .variant("stone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_basic_dent-side")))
            .variant("stone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_basic_plain-side")))
            .variant("stone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_basic_round-side")))
            .variant("stone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_basic_spiral-side")))
            .variant("stone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_classic-bottom")))
            .variant("stone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_classic_large-bottom")))
            .variant("stone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_ionic-side")))
            .variant("stone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_large_basic_triple-side")))
            .variant("stone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_large_ionic_triple-side")))
            .variant("stone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/stone/stone_pillar_meander-side")))
            .variant("stone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/stone/stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/stone/stone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/stone/stone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("stone_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/stone/stone_plate_connected")))
            .variant("stone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_polished", variant -> variant
                    .description("Polished")
                    .texture(Chisel.prefix("block/stone/stone_tiles_large")))
            .variant("stone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("stone_prism", variant -> variant
                    .description("Prismatic"))
            .variant("stone_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_road", variant -> variant
                    .description("Road"))
            .variant("stone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("stone_tiles", variant -> variant
                    .description("Tiles"))
            .variant("stone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("stone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/stone/stone_twisted-bottom")))
            .variant("stone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_weaver-ctm_corner")))
            .variant("stone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("v4_top_left")
                    .texture("v4_top_right", Chisel.prefix("block/stone/stone_zag-v4_bottom_left")))
            .variant("stone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("stone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("stone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_herringbone")))
            .variant("stone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("stone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_medallion")))
            .variant("stone_dots", variant -> variant
                    .description("Dots"))
            .variant("stone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_dots")))
            .variant("stone_heart", variant -> variant
                    .description("Heart"))
            .variant("stone_star", variant -> variant
                    .description("Star"))
            .variant("stone_plating", variant -> variant
                    .description("Plating"))
            .variant("stone_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/stone/stone_lodestone_connected")))
            .variant("stone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("stone_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/stone/stone_plank_connected")))
            .variant("stone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("stone_frame", variant -> variant
                    .description("Frame"))
            .variant("stone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("stone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("stone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("stone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("stone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("stone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("stone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_stripes")))
            .variant("stone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("stone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("stone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("stone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("stone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("stone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("stone_facet", variant -> variant
                    .description("Facet"))
            .variant("stone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("stone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_facet_small")))
            .variant("stone_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/stone/stone_shiny_connected")))
            .variant("stone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("stone_gem", variant -> variant
                    .description("Gem"))
            .variant("stone_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/stone/stone_gem_1_connected")))
            .variant("stone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/stone/stone_gem_2_connected")))
            .variant("stone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_border_square-ctm_cornerless")))
            .variant("stone_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/stone/stone_gem_3_connected")))
            .variant("stone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("stone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("stone_slab", variant -> variant
                    .description("Slab"))
            .variant("stone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("stone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_scaffold")))
            .variant("stone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("stone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("stone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("stone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_parquet")))
            .variant("stone_bricks_chaotic_small", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Chaotic Small"))
            .variant("stone_bricks_disordered", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Disordered Stone Bricks"))
            .variant("stone_bricks_disordered_panel", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Disordered Stone Panels")
                    .texture(Chisel.prefix("block/stone/stone_bricks_panel_hard")))
            .variant("stone_bricks_disordered_small", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Small Disordered Stone Bricks"))
            .variant("stone_bricks_fancy", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Stone Bricks in a Fancy Arrangement"))
            .variant("stone_bricks_felsic", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Felsic Masonry"))
            .variant("stone_bricks_large", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Large Bricks"))
            .variant("stone_bricks_mason_bricks_felsic", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Felsic Masonry")
                    .texture(Chisel.prefix("block/stone/stone_bricks_felsic")))
            .variant("stone_bricks_mason_bricks_felsic_2", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Felsic Masonry"))
            .variant("stone_bricks_mason_bricks_mafic", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Mafic Masonry"))
            .variant("stone_bricks_mason_bricks_mixed", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Mixed Masonry")
                    .texture(Chisel.prefix("block/stone/stone_bricks_small")))
            .variant("stone_bricks_mason_bricks_mixed_2", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Mixed Masonry"))
            .variant("stone_bricks_mason_bricks_plain", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Neutral Masonry"))
            .variant("stone_bricks_masonry_felsic", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Felsic Masonry"))
            .variant("stone_bricks_masonry_mafic", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Mafic Masonry"))
            .variant("stone_bricks_masonry_mixed", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Mixed Masonry"))
            .variant("stone_bricks_masonry_plain", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Modern Neutral Masonry"))
            .variant("stone_bricks_ornate", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Ornate Stone Brick Tiles"))
            .variant("stone_bricks_ornate_large", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Large Ornate Stone Brick Tiles"))
            .variant("stone_bricks_panel_hard", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Stone Panel")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_bricks_smooth")))
            .variant("stone_bricks_panel_ornate", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Ornate Stone Panel"))
            .variant("stone_bricks_panel_sunken", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Sunken Stone Panel")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/stone/stone_bricks_smooth")))
            .variant("stone_bricks_poison", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Poison Stone Brick"))
            .variant("stone_bricks_rough", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Rough Bricks"))
            .variant("stone_bricks_small", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Small Stone Bricks"))
            .variant("stone_bricks_smooth", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Smooth"))
            .variant("stone_bricks_wide", variant -> variant
                    .blockName("Stone Bricks")
                    .description("Wide Stone Bricks")));

    private StoneFamily() {
    }
}
