package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DioriteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("diorite", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE))
                    .blockName("Diorite"))
            .existingBlock(Blocks.DIORITE)
            .existingBlock(Blocks.POLISHED_DIORITE)
            .variant("diorite_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("diorite_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("diorite_braid", variant -> variant
                    .description("Braid"))
            .variant("diorite_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_braid")))
            .variant("diorite_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("diorite_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("diorite_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("diorite_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/diorite/diorite_bricks_large-2x2_bottom_left")))
            .variant("diorite_small", variant -> variant
                    .description("Small Bricks"))
            .variant("diorite_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("diorite_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("diorite_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("diorite_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("diorite_chaotic", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("diorite_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("diorite_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("diorite_checker", variant -> variant
                    .description("Checker"))
            .variant("diorite_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("diorite_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            // .variant("diorite_cobble", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Diorite").description("Cobble"))
            .variant("diorite_cracked", variant -> variant
                    .description("Cracked"))
            .variant("diorite_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("diorite_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_french", variant -> variant
                    .description("French 1"))
            .variant("diorite_french_2", variant -> variant
                    .description("French 2"))
            .variant("diorite_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_border_square-ctm_cornerless")))
            .variant("diorite_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("diorite_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/diorite/diorite_layers_connected")))
            .variant("diorite_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("diorite_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("diorite_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("diorite_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/diorite/diorite_meander_horizontal-bottom")))
            .variant("diorite_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/diorite/diorite_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_meander_vertical-side")))
            .variant("diorite_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_ornate", variant -> variant
                    .description("Ornate Diorite"))
            // .variant("diorite_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Diorite").description("Small Ornate"))
            .variant("diorite_panel", variant -> variant
                    .description("Panel"))
            .variant("diorite_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/diorite/diorite_pillar-top")))
            .variant("diorite_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_basic-side")))
            .variant("diorite_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_basic_dent-side")))
            .variant("diorite_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_basic_plain-side")))
            .variant("diorite_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_basic_round-side")))
            .variant("diorite_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_basic_spiral-side")))
            .variant("diorite_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_classic-bottom")))
            .variant("diorite_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_classic_large-bottom")))
            .variant("diorite_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_ionic-side")))
            .variant("diorite_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_large_basic_triple-side")))
            .variant("diorite_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_large_ionic_triple-side")))
            .variant("diorite_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/diorite/diorite_pillar_meander-side")))
            .variant("diorite_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/diorite/diorite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/diorite/diorite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/diorite/diorite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("diorite_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/diorite/diorite_plate_connected")))
            .variant("diorite_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_border_square-ctm_cornerless")))
            .variant("diorite_polished", variant -> variant
                    .description("Polished"))
            .variant("diorite_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_prism", variant -> variant
                    .description("Prismatic Diorite"))
            .variant("diorite_raw", variant -> variant
                    .description("Raw"))
            .variant("diorite_road", variant -> variant
                    .description("Road"))
            .variant("diorite_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("diorite_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("diorite_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("diorite_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/diorite/diorite_twisted-top")))
            .variant("diorite_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("ar_variant_1")
                    .texture("v4_top_right", Chisel.prefix("block/diorite/diorite_zag-v4_bottom_left")))
            .variant("diorite_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("diorite_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_herringbone")))
            .variant("diorite_medallion", variant -> variant
                    .description("Medallion"))
            .variant("diorite_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_medallion")))
            .variant("diorite_dots", variant -> variant
                    .description("Dots"))
            .variant("diorite_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_dots")))
            .variant("diorite_heart", variant -> variant
                    .description("Heart"))
            .variant("diorite_star", variant -> variant
                    .description("Star"))
            .variant("diorite_plating", variant -> variant
                    .description("Plating"))
            .variant("diorite_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/diorite/diorite_lodestone_connected")))
            .variant("diorite_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("diorite_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/diorite/diorite_plank_connected")))
            .variant("diorite_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_frame", variant -> variant
                    .description("Frame"))
            .variant("diorite_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("diorite_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("diorite_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("diorite_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("diorite_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("diorite_stripes", variant -> variant
                    .description("Stripes"))
            .variant("diorite_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_stripes")))
            .variant("diorite_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("diorite_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("diorite_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("diorite_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("diorite_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("diorite_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("diorite_facet", variant -> variant
                    .description("Facet"))
            .variant("diorite_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("diorite_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_facet_small")))
            .variant("diorite_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/diorite/diorite_shiny_connected")))
            .variant("diorite_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_gem", variant -> variant
                    .description("Gem"))
            .variant("diorite_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/diorite/diorite_gem_1_connected")))
            .variant("diorite_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_border_square-ctm_cornerless")))
            .variant("diorite_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/diorite/diorite_gem_2_connected")))
            .variant("diorite_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_border_square-ctm_cornerless")))
            .variant("diorite_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/diorite/diorite_gem_3_connected")))
            .variant("diorite_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("diorite_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("diorite_slab", variant -> variant
                    .description("Slab"))
            .variant("diorite_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("diorite_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_scaffold")))
            .variant("diorite_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("diorite_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("diorite_parquet", variant -> variant
                    .description("Parquet"))
            .variant("diorite_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/diorite/diorite_parquet"))));

    private DioriteFamily() {
    }
}
