package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DripstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("dripstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK))
                    .blockName("Dripstone Block"))
            .existingBlock(Blocks.DRIPSTONE_BLOCK)
            .variant("dripstone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dripstone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_border_square-ctm_vertical")))
            .variant("dripstone_braid", variant -> variant
                    .description("Braid"))
            .variant("dripstone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dripstone_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("dripstone_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dripstone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("dripstone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("dripstone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .texture("2x2_bottom_left", Chisel.prefix("block/dripstone/dripstone_bricks_large-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("dripstone_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("dripstone_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("dripstone_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("dripstone_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("dripstone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("dripstone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("dripstone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("dripstone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("dripstone_checker", variant -> variant
                    .description("Checker"))
            .variant("dripstone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("dripstone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless")))
            .variant("dripstone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("dripstone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("dripstone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dripstone_french_1", variant -> variant
                    .description("French 1"))
            .variant("dripstone_french_2", variant -> variant
                    .description("French 2"))
            .variant("dripstone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless")))
            .variant("dripstone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("dripstone_layers", variant -> variant
                    .description("Layers"))
            .variant("dripstone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dripstone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("dripstone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("dripstone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("bottom", Chisel.prefix("block/dripstone/dripstone_meander_horizontal-top")))
            .variant("dripstone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/dripstone/dripstone_meander_vertical-top")))
            .variant("dripstone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless")))
            .variant("dripstone_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("dripstone_panel", variant -> variant
                    .description("Panel"))
            .variant("dripstone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/dripstone/dripstone_pillar-top")))
            .variant("dripstone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_basic-side")))
            .variant("dripstone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_basic_dent-side")))
            .variant("dripstone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_basic_plain-side")))
            .variant("dripstone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_basic_round-side")))
            .variant("dripstone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_basic_spiral-side")))
            .variant("dripstone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/dripstone/dripstone_pillar_classic-top")))
            .variant("dripstone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/dripstone/dripstone_pillar_classic_large-top")))
            .variant("dripstone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_ionic-side")))
            .variant("dripstone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top")))
            .variant("dripstone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_large_ionic_triple-side")))
            .variant("dripstone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/dripstone/dripstone_pillar_meander-side")))
            .variant("dripstone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/dripstone/dripstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/dripstone/dripstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/dripstone/dripstone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("dripstone_plate", variant -> variant
                    .description("Plate"))
            .variant("dripstone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless")))
            .variant("dripstone_polished", variant -> variant
                    .description("Polished"))
            .variant("dripstone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dripstone_prism", variant -> variant
                    .description("Prismatic"))
            .variant("dripstone_raw", variant -> variant
                    .description("Raw"))
            .variant("dripstone_road", variant -> variant
                    .description("Road"))
            .variant("dripstone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dripstone_tiles", variant -> variant
                    .description("Tiles"))
            .variant("dripstone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/dripstone/dripstone_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/dripstone/dripstone_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/dripstone/dripstone_tiles_large-ctm_vertical")))
            .variant("dripstone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("dripstone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/dripstone/dripstone_twisted-top")))
            .variant("dripstone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dripstone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .texture("2x2_bottom_left", Chisel.prefix("block/dripstone/dripstone_zag-2x2_top_right")))
            .variant("dripstone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dripstone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("dripstone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_herringbone")))
            .variant("dripstone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("dripstone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_medallion")))
            .variant("dripstone_dots", variant -> variant
                    .description("Dots"))
            .variant("dripstone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dots")))
            .variant("dripstone_heart", variant -> variant
                    .description("Heart"))
            .variant("dripstone_star", variant -> variant
                    .description("Star"))
            .variant("dripstone_plating", variant -> variant
                    .description("Plating"))
            .variant("dripstone_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("dripstone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/dripstone/dripstone_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/dripstone/dripstone_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/dripstone/dripstone_lodestone_connected-ctm_vertical")))
            .variant("dripstone_plank", variant -> variant
                    .description("Plank"))
            .variant("dripstone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/dripstone/dripstone_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/dripstone/dripstone_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/dripstone/dripstone_plank_connected-ctm_vertical")))
            .variant("dripstone_frame", variant -> variant
                    .description("Frame"))
            .variant("dripstone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("dripstone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("dripstone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("dripstone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("dripstone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("dripstone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("dripstone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_stripes")))
            .variant("dripstone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("dripstone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("dripstone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("dripstone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("dripstone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("dripstone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("dripstone_facet", variant -> variant
                    .description("Facet"))
            .variant("dripstone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("dripstone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_facet_small")))
            .variant("dripstone_shiny", variant -> variant
                    .description("Shiny"))
            .variant("dripstone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/dripstone/dripstone_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/dripstone/dripstone_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/dripstone/dripstone_shiny_connected-ctm_vertical")))
            .variant("dripstone_gem", variant -> variant
                    .description("Gem"))
            .variant("dripstone_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("dripstone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/dripstone/dripstone_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/dripstone/dripstone_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/dripstone/dripstone_gem_1_connected-ctm_vertical")))
            .variant("dripstone_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("dripstone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/dripstone/dripstone_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/dripstone/dripstone_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/dripstone/dripstone_gem_2_connected-ctm_vertical")))
            .variant("dripstone_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("dripstone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/dripstone/dripstone_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/dripstone/dripstone_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/dripstone/dripstone_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/dripstone/dripstone_gem_3_connected-ctm_vertical")))
            .variant("dripstone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("dripstone_slab", variant -> variant
                    .description("Slab"))
            .variant("dripstone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("dripstone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_scaffold")))
            .variant("dripstone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("dripstone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("dripstone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("dripstone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dripstone/dripstone_parquet"))));

    private DripstoneFamily() {
    }
}
