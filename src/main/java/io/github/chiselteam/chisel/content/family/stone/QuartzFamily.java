package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class QuartzFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("quartz", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK))
                    .blockName("Block of Quartz"))
            .existingBlock(Blocks.QUARTZ_BLOCK)
            .existingBlock(Blocks.CHISELED_QUARTZ_BLOCK)
            .existingBlock(Blocks.QUARTZ_BRICKS)
            .existingBlock(Blocks.QUARTZ_PILLAR)
            .variant("quartz_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("quartz_braid", variant -> variant
                    .description("Braid"))
            .variant("quartz_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("quartz_bricks_indent", variant -> variant
                    .description("Bricks Indent"))
            .variant("quartz_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("quartz_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .texture("2x2_bottom_left", Chisel.prefix("block/quartz/quartz_bricks_large-2x2_top_right"))
                    .texture("2x2_bottom_right", Chisel.prefix("block/quartz/quartz_bricks_large-2x2_top_left")))
            .variant("quartz_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("quartz_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("quartz_chaotic_medium", variant -> variant
                    .description("Quartz Bricks"))
            .variant("quartz_chaotic_small", variant -> variant
                    .description("Quartz Small Tiles"))
            .variant("quartz_checker", variant -> variant
                    .description("Checker"))
            .variant("quartz_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("quartz_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw")))
            .variant("quartz_cracked", variant -> variant
                    .description("Cracked"))
            .variant("quartz_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("quartz_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_3_column_0"))
            .variant("quartz_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw")))
            .variant("quartz_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_solid_bricks")))
            .variant("quartz_french_1", variant -> variant
                    .description("French 1"))
            .variant("quartz_french_2", variant -> variant
                    .description("French 2"))
            .variant("quartz_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw")))
            .variant("quartz_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("quartz_layers", variant -> variant
                    .description("Layers"))
            .variant("quartz_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_layers"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_layers_connected-ctm_corner"))
                    .textureAlias("ctm_cornerless", "ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_corner"))
            .variant("quartz_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("quartz_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("quartz_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("quartz_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/quartz/quartz_meander_vertical-top"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_meander_vertical-side")))
            .variant("quartz_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw")))
            .variant("quartz_ornate", variant -> variant
                    .description("Ornate"))
            .variant("quartz_panel", variant -> variant
                    .description("Panel"))
            .variant("quartz_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/quartz/quartz_pillar-top")))
            .variant("quartz_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_basic-side")))
            .variant("quartz_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_basic_dent-side")))
            .variant("quartz_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_basic_plain-side")))
            .variant("quartz_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_basic_round-side")))
            .variant("quartz_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_basic_spiral-side")))
            .variant("quartz_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("quartz_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/quartz/quartz_pillar_classic_large-top")))
            .variant("quartz_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_ionic-side")))
            .variant("quartz_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/quartz/quartz_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("quartz_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/quartz/quartz_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("quartz_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/quartz/quartz_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("quartz_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_ionic-side")))
            .variant("quartz_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top")))
            .variant("quartz_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_large_ionic_triple-side")))
            .variant("quartz_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/quartz/quartz_pillar_meander-side")))
            .variant("quartz_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/quartz/quartz_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("quartz_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/quartz/quartz_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("quartz_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/quartz/quartz_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/quartz/quartz_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("quartz_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/quartz/quartz_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/quartz/quartz_pillar_basic-top"))
                    .textureAlias("vertical_none", "side"))
            .variant("quartz_plate", variant -> variant
                    .description("Plate"))
            .variant("quartz_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_plate"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_plate_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_plate_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_plate_connected-ctm_vertical")))
            .variant("quartz_polished", variant -> variant
                    .description("Polished"))
            .variant("quartz_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("quartz_prism", variant -> variant
                    .description("Prismatic"))
            .variant("quartz_raw", variant -> variant
                    .description("Raw"))
            .variant("quartz_road", variant -> variant
                    .description("Road"))
            .variant("quartz_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("quartz_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("quartz_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("quartz_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("quartz_square_border", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw"))
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("quartz_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_tiles_large-ctm_vertical")))
            .variant("quartz_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("quartz_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("quartz_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("quartz_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/quartz/quartz_twisted-top")))
            .variant("quartz_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_weaver-ctm_corner")))
            .variant("quartz_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1"))
            .variant("quartz_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("quartz_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("quartz_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_herringbone")))
            .variant("quartz_medallion", variant -> variant
                    .description("Medallion"))
            .variant("quartz_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_medallion")))
            .variant("quartz_dots", variant -> variant
                    .description("Dots"))
            .variant("quartz_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_dots")))
            .variant("quartz_heart", variant -> variant
                    .description("Heart"))
            .variant("quartz_star", variant -> variant
                    .description("Star"))
            .variant("quartz_plating", variant -> variant
                    .description("Plating"))
            .variant("quartz_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("quartz_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_lodestone_connected-ctm_vertical")))
            .variant("quartz_plank", variant -> variant
                    .description("Plank"))
            .variant("quartz_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_plank_connected-ctm_vertical")))
            .variant("quartz_frame", variant -> variant
                    .description("Frame"))
            .variant("quartz_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("quartz_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("quartz_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("quartz_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("quartz_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("quartz_stripes", variant -> variant
                    .description("Stripes"))
            .variant("quartz_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_stripes")))
            .variant("quartz_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("quartz_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("quartz_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("quartz_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("quartz_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("quartz_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("quartz_facet", variant -> variant
                    .description("Facet"))
            .variant("quartz_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("quartz_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_facet_small")))
            .variant("quartz_shiny", variant -> variant
                    .description("Shiny"))
            .variant("quartz_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_shiny_connected-ctm_vertical")))
            .variant("quartz_gem", variant -> variant
                    .description("Gem"))
            .variant("quartz_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("quartz_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_gem_1_connected-ctm_vertical")))
            .variant("quartz_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("quartz_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_gem_2_connected-ctm_vertical")))
            .variant("quartz_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("quartz_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/quartz/quartz_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/quartz/quartz_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/quartz/quartz_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/quartz/quartz_gem_3_connected-ctm_vertical")))
            .variant("quartz_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("quartz_slab", variant -> variant
                    .description("Slab"))
            .variant("quartz_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("quartz_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_scaffold")))
            .variant("quartz_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("quartz_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("quartz_parquet", variant -> variant
                    .description("Parquet"))
            .variant("quartz_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/quartz/quartz_parquet"))));

    private QuartzFamily() {
    }
}
