package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CharcoalFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("charcoal", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Charcoal"))
            .variant("charcoal_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("charcoal_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("charcoal_braid", variant -> variant
                    .description("Braid"))
            .variant("charcoal_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_braid")))
            .variant("charcoal_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("charcoal_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("charcoal_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("charcoal_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/charcoal/charcoal_bricks_large-2x2_bottom_left")))
            .variant("charcoal_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("charcoal_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("charcoal_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("charcoal_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("charcoal_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("charcoal_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("charcoal_chaotic_medium", variant -> variant
                    .description("Charcoal Bricks"))
            .variant("charcoal_chaotic_small", variant -> variant
                    .description("Charcoal Small Tiles"))
            .variant("charcoal_checker", variant -> variant
                    .description("Checker"))
            .variant("charcoal_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("charcoal_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_cracked", variant -> variant
                    .description("Cracked"))
            .variant("charcoal_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("charcoal_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_french_1", variant -> variant
                    .description("French 1"))
            .variant("charcoal_french_2", variant -> variant
                    .description("French 2"))
            .variant("charcoal_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_border_square-ctm_cornerless")))
            .variant("charcoal_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("charcoal_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/charcoal/charcoal_layers_connected")))
            .variant("charcoal_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("charcoal_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("charcoal_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("charcoal_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_meander_horizontal-bottom")))
            .variant("charcoal_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_meander_vertical-side")))
            .variant("charcoal_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_ornate", variant -> variant
                    .description("Ornate Charcoal"))
            .variant("charcoal_panel", variant -> variant
                    .description("Panel"))
            .variant("charcoal_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/charcoal/charcoal_pillar-top")))
            .variant("charcoal_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_basic-side")))
            .variant("charcoal_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_basic_dent-side")))
            .variant("charcoal_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_basic_plain-side")))
            .variant("charcoal_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_basic_round-side")))
            .variant("charcoal_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_basic_spiral-side")))
            .variant("charcoal_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_classic-bottom")))
            .variant("charcoal_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_classic_large-bottom")))
            .variant("charcoal_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_ionic-side")))
            .variant("charcoal_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_large_basic_triple-side")))
            .variant("charcoal_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_large_ionic_triple-side")))
            .variant("charcoal_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/charcoal/charcoal_pillar_meander-side")))
            .variant("charcoal_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/charcoal/charcoal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/charcoal/charcoal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/charcoal/charcoal_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("charcoal_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/charcoal/charcoal_plate_connected")))
            .variant("charcoal_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_border_square-ctm_cornerless")))
            .variant("charcoal_polished", variant -> variant
                    .description("Polished"))
            .variant("charcoal_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_prism", variant -> variant
                    .description("Prismatic Charcoal"))
            .variant("charcoal_raw", variant -> variant
                    .description("Raw"))
            .variant("charcoal_road", variant -> variant
                    .description("Road"))
            .variant("charcoal_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("charcoal_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("charcoal_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("charcoal_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/charcoal/charcoal_twisted-top")))
            .variant("charcoal_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .texture("v4_top_right", Chisel.prefix("block/charcoal/charcoal_zag-v4_bottom_left")))
            .variant("charcoal_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("charcoal_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_herringbone")))
            .variant("charcoal_medallion", variant -> variant
                    .description("Medallion"))
            .variant("charcoal_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_medallion")))
            .variant("charcoal_dots", variant -> variant
                    .description("Dots"))
            .variant("charcoal_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_dots")))
            .variant("charcoal_heart", variant -> variant
                    .description("Heart"))
            .variant("charcoal_star", variant -> variant
                    .description("Star"))
            .variant("charcoal_plating", variant -> variant
                    .description("Plating"))
            .variant("charcoal_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/charcoal/charcoal_lodestone_connected")))
            .variant("charcoal_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("charcoal_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/charcoal/charcoal_plank_connected")))
            .variant("charcoal_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_frame", variant -> variant
                    .description("Frame"))
            .variant("charcoal_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("charcoal_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("charcoal_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("charcoal_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("charcoal_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("charcoal_stripes", variant -> variant
                    .description("Stripes"))
            .variant("charcoal_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_stripes")))
            .variant("charcoal_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("charcoal_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("charcoal_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("charcoal_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("charcoal_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("charcoal_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("charcoal_facet", variant -> variant
                    .description("Facet"))
            .variant("charcoal_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("charcoal_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_facet_small")))
            .variant("charcoal_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/charcoal/charcoal_shiny_connected")))
            .variant("charcoal_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_gem", variant -> variant
                    .description("Gem"))
            .variant("charcoal_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/charcoal/charcoal_gem_1_connected")))
            .variant("charcoal_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_border_square-ctm_cornerless")))
            .variant("charcoal_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/charcoal/charcoal_gem_2_connected")))
            .variant("charcoal_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_border_square-ctm_cornerless")))
            .variant("charcoal_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/charcoal/charcoal_gem_3_connected")))
            .variant("charcoal_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("charcoal_slab", variant -> variant
                    .description("Slab"))
            .variant("charcoal_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("charcoal_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_scaffold")))
            .variant("charcoal_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("charcoal_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("charcoal_parquet", variant -> variant
                    .description("Parquet"))
            .variant("charcoal_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/charcoal/charcoal_parquet")))
            .variant("charcoal_border_square_small", variant -> variant
                    .description("Small Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_cobble", variant -> variant
                    .description("Cobble"))
            .variant("charcoal_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("charcoal_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("charcoal_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private CharcoalFamily() {
    }
}
