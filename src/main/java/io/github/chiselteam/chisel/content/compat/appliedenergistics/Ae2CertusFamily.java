package io.github.chiselteam.chisel.content.compat.appliedenergistics;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class Ae2CertusFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("ae2_certus", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Certus Quartz"))
            .variant("certus_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("certus_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw"))
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("certus_braid", variant -> variant
                    .description("Braid"))
            .variant("certus_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("certus_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("certus_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_bricks_solid")))
            .variant("certus_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("certus_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("certus_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .texture("2x2_bottom_left", Chisel.prefix("block/ae2_certus/certus_bricks_large-2x2_top_right"))
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left"))
            .variant("certus_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("certus_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("certus_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("certus_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("certus_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("certus_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("certus_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("certus_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("certus_checker", variant -> variant
                    .description("Checker"))
            .variant("certus_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("certus_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw")))
            .variant("certus_cobble", variant -> variant
                    .description("Cobble"))
            .variant("certus_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("certus_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw")))
            .variant("certus_french_1", variant -> variant
                    .description("French 1"))
            .variant("certus_french_2", variant -> variant
                    .description("French 2"))
            .variant("certus_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw")))
            .variant("certus_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("certus_layers", variant -> variant
                    .description("Layers"))
            .variant("certus_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("certus_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("certus_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("certus_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("bottom", Chisel.prefix("block/ae2_certus/certus_meander_horizontal-top")))
            .variant("certus_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/ae2_certus/certus_meander_vertical-top"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_meander_vertical-side")))
            .variant("certus_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw")))
            .variant("certus_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("certus_panel", variant -> variant
                    .description("Panel"))
            .variant("certus_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_certus/certus_pillar-top")))
            .variant("certus_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_basic-side")))
            .variant("certus_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_basic_dent-side")))
            .variant("certus_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_basic_plain-side")))
            .variant("certus_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_basic_round-side")))
            .variant("certus_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_basic_spiral-side")))
            .variant("certus_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_certus/certus_pillar_classic-top")))
            .variant("certus_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_certus/certus_pillar_classic_large-top")))
            .variant("certus_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_ionic-side")))
            .variant("certus_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top")))
            .variant("certus_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_large_ionic_triple-side")))
            .variant("certus_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_certus/certus_pillar_meander-side")))
            .variant("certus_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_certus/certus_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_certus/certus_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_certus/certus_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("certus_plate", variant -> variant
                    .description("Plate"))
            .variant("certus_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_plate"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_plate_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_plate_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_plate_connected-ctm_vertical")))
            .variant("certus_polished", variant -> variant
                    .description("Polished"))
            .variant("certus_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("certus_prism", variant -> variant
                    .description("Prismatic"))
            .variant("certus_raw", variant -> variant
                    .description("Raw"))
            .variant("certus_road", variant -> variant
                    .description("Road"))
            .variant("certus_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("certus_tiles", variant -> variant
                    .description("Tiles"))
            .variant("certus_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_tiles_large-ctm_vertical")))
            .variant("certus_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("certus_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_certus/certus_twisted-top")))
            .variant("certus_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_weaver-ctm_corner")))
            .variant("certus_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .texture("2x2_bottom_left", Chisel.prefix("block/ae2_certus/certus_zag-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("certus_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("certus_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("certus_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_herringbone")))
            .variant("certus_medallion", variant -> variant
                    .description("Medallion"))
            .variant("certus_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_medallion")))
            .variant("certus_dots", variant -> variant
                    .description("Dots"))
            .variant("certus_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_dots")))
            .variant("certus_heart", variant -> variant
                    .description("Heart"))
            .variant("certus_star", variant -> variant
                    .description("Star"))
            .variant("certus_plating", variant -> variant
                    .description("Plating"))
            .variant("certus_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("certus_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_lodestone_connected-ctm_vertical")))
            .variant("certus_plank", variant -> variant
                    .description("Plank"))
            .variant("certus_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_plank_connected-ctm_vertical")))
            .variant("certus_frame", variant -> variant
                    .description("Frame"))
            .variant("certus_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("certus_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("certus_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("certus_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("certus_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("certus_stripes", variant -> variant
                    .description("Stripes"))
            .variant("certus_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_stripes")))
            .variant("certus_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("certus_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("certus_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("certus_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("certus_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("certus_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("certus_facet", variant -> variant
                    .description("Facet"))
            .variant("certus_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("certus_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_facet_small")))
            .variant("certus_shiny", variant -> variant
                    .description("Shiny"))
            .variant("certus_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_shiny_connected-ctm_vertical")))
            .variant("certus_gem", variant -> variant
                    .description("Gem"))
            .variant("certus_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("certus_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_gem_1_connected-ctm_vertical")))
            .variant("certus_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("certus_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_gem_2_connected-ctm_vertical")))
            .variant("certus_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("certus_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_certus/certus_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_certus/certus_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_certus/certus_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_certus/certus_gem_3_connected-ctm_vertical")))
            .variant("certus_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("certus_slab", variant -> variant
                    .description("Slab"))
            .variant("certus_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("certus_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_scaffold")))
            .variant("certus_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("certus_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("certus_parquet", variant -> variant
                    .description("Parquet"))
            .variant("certus_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_certus/certus_parquet"))));

    private Ae2CertusFamily() {
    }
}
