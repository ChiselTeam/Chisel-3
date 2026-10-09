package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CobbledDeepslateFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("cobbled_deepslate", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE))
                    .blockName("Cobbled Deepslate"))
            .existingBlock(Blocks.COBBLED_DEEPSLATE)
            .existingBlock(Blocks.CHISELED_DEEPSLATE)
            .existingBlock(Blocks.POLISHED_DEEPSLATE)
            .existingBlock(Blocks.DEEPSLATE_BRICKS)
            .existingBlock(Blocks.DEEPSLATE_TILES)
            .variant("cobbled_deepslate_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("cobbled_deepslate_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("cobbled_deepslate_braid", variant -> variant
                    .description("Braid"))
            .variant("cobbled_deepslate_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_braid")))
            .variant("cobbled_deepslate_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("cobbled_deepslate_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobbled_deepslate_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("cobbled_deepslate_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("cobbled_deepslate_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_bricks_large-2x2_bottom_left")))
            .variant("cobbled_deepslate_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("cobbled_deepslate_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("cobbled_deepslate_bricks_solid", variant -> variant
                    .description("Solid Bricks")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_bricks_encased-ctm_cornerless")))
            .variant("cobbled_deepslate_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("cobbled_deepslate_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("cobbled_deepslate_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("cobbled_deepslate_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("cobbled_deepslate_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("cobbled_deepslate_checker", variant -> variant
                    .description("Checker"))
            .variant("cobbled_deepslate_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("cobbled_deepslate_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_cobble", variant -> variant
                    .description("Cobble"))
            .variant("cobbled_deepslate_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("cobbled_deepslate_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_french_1", variant -> variant
                    .description("French 1"))
            .variant("cobbled_deepslate_french_2", variant -> variant
                    .description("French 2"))
            .variant("cobbled_deepslate_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("cobbled_deepslate_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_layers_connected")))
            .variant("cobbled_deepslate_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("cobbled_deepslate_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("cobbled_deepslate_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("cobbled_deepslate_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_meander_horizontal-bottom")))
            .variant("cobbled_deepslate_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_meander_vertical-side")))
            .variant("cobbled_deepslate_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("cobbled_deepslate_panel", variant -> variant
                    .description("Panel"))
            .variant("cobbled_deepslate_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar-bottom")))
            .variant("cobbled_deepslate_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-side")))
            .variant("cobbled_deepslate_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_dent-side")))
            .variant("cobbled_deepslate_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_plain-side")))
            .variant("cobbled_deepslate_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_round-side")))
            .variant("cobbled_deepslate_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_spiral-side")))
            .variant("cobbled_deepslate_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_classic-bottom")))
            .variant("cobbled_deepslate_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_classic_large-bottom")))
            .variant("cobbled_deepslate_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_ionic-side")))
            .variant("cobbled_deepslate_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_large_basic_triple-side")))
            .variant("cobbled_deepslate_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_large_ionic_triple-side")))
            .variant("cobbled_deepslate_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_meander-side")))
            .variant("cobbled_deepslate_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobbled_deepslate_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_plate_connected")))
            .variant("cobbled_deepslate_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_polished", variant -> variant
                    .description("Polished")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_tiles_large")))
            .variant("cobbled_deepslate_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobbled_deepslate_prism", variant -> variant
                    .description("Prismatic"))
            .variant("cobbled_deepslate_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_road", variant -> variant
                    .description("Road"))
            .variant("cobbled_deepslate_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("cobbled_deepslate_tiles", variant -> variant
                    .description("Tiles"))
            .variant("cobbled_deepslate_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("cobbled_deepslate_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_twisted-bottom")))
            .variant("cobbled_deepslate_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_weaver-ctm_corner")))
            .variant("cobbled_deepslate_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("v4_top_left")
                    .texture("v4_top_right", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_zag-v4_bottom_left")))
            .variant("cobbled_deepslate_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobbled_deepslate_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("cobbled_deepslate_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_herringbone")))
            .variant("cobbled_deepslate_medallion", variant -> variant
                    .description("Medallion"))
            .variant("cobbled_deepslate_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_medallion")))
            .variant("cobbled_deepslate_dots", variant -> variant
                    .description("Dots"))
            .variant("cobbled_deepslate_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_dots")))
            .variant("cobbled_deepslate_heart", variant -> variant
                    .description("Heart"))
            .variant("cobbled_deepslate_star", variant -> variant
                    .description("Star"))
            .variant("cobbled_deepslate_plating", variant -> variant
                    .description("Plating"))
            .variant("cobbled_deepslate_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_lodestone_connected")))
            .variant("cobbled_deepslate_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("cobbled_deepslate_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_plank_connected")))
            .variant("cobbled_deepslate_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobbled_deepslate_frame", variant -> variant
                    .description("Frame"))
            .variant("cobbled_deepslate_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("cobbled_deepslate_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("cobbled_deepslate_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("cobbled_deepslate_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("cobbled_deepslate_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("cobbled_deepslate_stripes", variant -> variant
                    .description("Stripes"))
            .variant("cobbled_deepslate_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_stripes")))
            .variant("cobbled_deepslate_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("cobbled_deepslate_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("cobbled_deepslate_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("cobbled_deepslate_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("cobbled_deepslate_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("cobbled_deepslate_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("cobbled_deepslate_facet", variant -> variant
                    .description("Facet"))
            .variant("cobbled_deepslate_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("cobbled_deepslate_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_facet_small")))
            .variant("cobbled_deepslate_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_shiny_connected")))
            .variant("cobbled_deepslate_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobbled_deepslate_gem", variant -> variant
                    .description("Gem"))
            .variant("cobbled_deepslate_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_gem_1_connected")))
            .variant("cobbled_deepslate_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_gem_2_connected")))
            .variant("cobbled_deepslate_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_border_square-ctm_cornerless")))
            .variant("cobbled_deepslate_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_gem_3_connected")))
            .variant("cobbled_deepslate_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobbled_deepslate_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("cobbled_deepslate_slab", variant -> variant
                    .description("Slab"))
            .variant("cobbled_deepslate_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("cobbled_deepslate_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_scaffold")))
            .variant("cobbled_deepslate_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("cobbled_deepslate_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("cobbled_deepslate_parquet", variant -> variant
                    .description("Parquet"))
            .variant("cobbled_deepslate_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobbled_deepslate/cobbled_deepslate_parquet"))));

    private CobbledDeepslateFamily() {
    }
}
