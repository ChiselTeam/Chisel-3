package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BasaltFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("basalt", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Basalt"))
            .existingBlock(Blocks.BASALT)
            .existingBlock(Blocks.SMOOTH_BASALT)
            .existingBlock(Blocks.POLISHED_BASALT)
            .variant("basalt_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("basalt_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("basalt_braid", variant -> variant
                    .description("Braid"))
            .variant("basalt_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("basalt_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("basalt_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("basalt_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/basalt/basalt_bricks_large-2x2_bottom_left")))
            .variant("basalt_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("basalt_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("basalt_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("basalt_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("basalt_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("basalt_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("basalt_chaotic_medium", variant -> variant
                    .description("Basalt Bricks"))
            .variant("basalt_chaotic_small", variant -> variant
                    .description("Basalt Small Tiles"))
            .variant("basalt_checker", variant -> variant
                    .description("Checker"))
            .variant("basalt_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("basalt_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_dent-ctm_cornerless")))
            // .variant("basalt_cobble", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Basalt").description("Cobble"))
            .variant("basalt_cracked", variant -> variant
                    .description("Cracked"))
            .variant("basalt_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("basalt_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_french_1", variant -> variant
                    .description("French 1"))
            .variant("basalt_french_2", variant -> variant
                    .description("French 2"))
            .variant("basalt_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_border_square-ctm_cornerless")))
            .variant("basalt_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("basalt_layers", variant -> variant
                    .description("Layers"))
            .variant("basalt_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("basalt_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("basalt_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("basalt_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/basalt/basalt_meander_horizontal-bottom")))
            .variant("basalt_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/basalt/basalt_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_meander_vertical-side")))
            .variant("basalt_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_ornate", variant -> variant
                    .description("Ornate Basalt"))
            // .variant("basalt_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Basalt").description("Small Ornate"))
            .variant("basalt_panel", variant -> variant
                    .description("Panel"))
            .variant("basalt_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/basalt/basalt_pillar-top")))
            .variant("basalt_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_basic-side"))
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .textureAlias("vertical_bottom", "vertical_none"))
            .variant("basalt_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_basic_dent-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .textureAlias("vertical_bottom", "vertical_none"))
            .variant("basalt_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_basic_plain-side")))
            .variant("basalt_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_basic_round-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom")))
            .variant("basalt_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_basic_spiral-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .textureAlias("vertical_bottom", "vertical_none"))
            .variant("basalt_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_classic-bottom")))
            .variant("basalt_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_classic_large-bottom")))
            .variant("basalt_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_ionic-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .textureAlias("vertical_bottom", "vertical_none"))
            .variant("basalt_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_dent-vertical_both"))
                    .texture("vertical_bottom", Chisel.prefix("block/basalt/basalt_pillar_ionic_dent-side"))
                    .textureAlias("vertical_none", "vertical_bottom"))
            .variant("basalt_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_ionic_plain-side")))
            .variant("basalt_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_ionic_round-side")))
            .variant("basalt_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/basalt/basalt_pillar_ionic_plain-side"))
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_bottom", "side")
                    .textureAlias("vertical_none", "side"))
            .variant("basalt_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_large_basic_triple-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom")))
            .variant("basalt_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_large_ionic_triple-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_large_basic_triple-vertical_both")))
            .variant("basalt_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_meander_dent-side")))
            .variant("basalt_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_dent-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_meander_dent-side")))
            .variant("basalt_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_meander_dent-side")))
            .variant("basalt_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_meander_dent-side")))
            .variant("basalt_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/basalt/basalt_pillar_meander_plain-side"))
                    .texture("top", Chisel.prefix("block/basalt/basalt_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/basalt/basalt_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/basalt/basalt_pillar_meander_dent-side")))
            .variant("basalt_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/basalt/basalt_plate_connected")))
            .variant("basalt_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_border_square-ctm_cornerless")))
            .variant("basalt_polished", variant -> variant
                    .description("Polished"))
            .variant("basalt_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_prism", variant -> variant
                    .description("Prismatic Basalt"))
            .variant("basalt_raw", variant -> variant
                    .description("Raw"))
            .variant("basalt_road", variant -> variant
                    .description("Road"))
            .variant("basalt_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/basalt/basalt_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("basalt_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("basalt_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_mosaic-ctm_cornerless")))
            .variant("basalt_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("basalt_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/basalt/basalt_twisted-top")))
            .variant("basalt_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_weaver-ctm_corner")))
            .variant("basalt_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("ar_variant_1")
                    .texture("v4_top_right", Chisel.prefix("block/basalt/basalt_zag-v4_bottom_left")))
            .variant("basalt_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("basalt_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_herringbone")))
            .variant("basalt_medallion", variant -> variant
                    .description("Medallion"))
            .variant("basalt_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_medallion")))
            .variant("basalt_dots", variant -> variant
                    .description("Dots"))
            .variant("basalt_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_dots")))
            .variant("basalt_heart", variant -> variant
                    .description("Heart"))
            .variant("basalt_star", variant -> variant
                    .description("Star"))
            .variant("basalt_plating", variant -> variant
                    .description("Plating"))
            .variant("basalt_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/basalt/basalt_lodestone_connected")))
            .variant("basalt_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("basalt_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/basalt/basalt_plank_connected")))
            .variant("basalt_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_frame", variant -> variant
                    .description("Frame"))
            .variant("basalt_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("basalt_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("basalt_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("basalt_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("basalt_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("basalt_stripes", variant -> variant
                    .description("Stripes"))
            .variant("basalt_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_stripes")))
            .variant("basalt_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("basalt_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("basalt_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("basalt_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("basalt_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("basalt_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("basalt_facet", variant -> variant
                    .description("Facet"))
            .variant("basalt_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("basalt_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_facet_small")))
            .variant("basalt_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/basalt/basalt_shiny_connected")))
            .variant("basalt_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_gem", variant -> variant
                    .description("Gem"))
            .variant("basalt_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/basalt/basalt_gem_1_connected")))
            .variant("basalt_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_border_square-ctm_cornerless")))
            .variant("basalt_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/basalt/basalt_gem_2_connected")))
            .variant("basalt_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_border_square-ctm_cornerless")))
            .variant("basalt_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/basalt/basalt_gem_3_connected")))
            .variant("basalt_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("basalt_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("basalt_slab", variant -> variant
                    .description("Slab"))
            .variant("basalt_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("basalt_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_scaffold")))
            .variant("basalt_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("basalt_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("basalt_parquet", variant -> variant
                    .description("Parquet"))
            .variant("basalt_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/basalt/basalt_parquet"))));

    private BasaltFamily() {
    }
}
