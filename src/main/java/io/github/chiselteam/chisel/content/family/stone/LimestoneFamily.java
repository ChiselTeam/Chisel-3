package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LimestoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("limestone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Limestone"))
            .variant("limestone_raw", variant -> variant
                    .description("Raw"))
            .variant("limestone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("limestone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("limestone_braid", variant -> variant
                    .description("Braid"))
            .variant("limestone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("limestone_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("limestone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("limestone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/limestone/limestone_bricks_large-2x2_bottom_left")))
            .variant("limestone_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("limestone_soft_bricks", variant -> variant
                    .description("Limestone with Light Panel"))
            .variant("limestone_solid_bricks", variant -> variant
                    .description("Limestone with Dark Panel"))
            .variant("limestone_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("limestone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("limestone_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("limestone_chaotic_medium", variant -> variant
                    .description("Small Limestone Bricks"))
            .variant("limestone_chaotic_small", variant -> variant
                    .description("Small Limestone Tiles"))
            .variant("limestone_checker", variant -> variant
                    .description("Checker"))
            .variant("limestone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("limestone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("limestone_cracked", variant -> variant
                    .description("Damaged Limestone Tiles"))
            .variant("limestone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("limestone_dent", variant -> variant
                    .description("Limestone with Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_french_1", variant -> variant
                    .description("French Limestone Tiles"))
            .variant("limestone_french_2", variant -> variant
                    .description("French Limestone Tiles"))
            .variant("limestone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_border_square-ctm_cornerless")))
            .variant("limestone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("limestone_layers", variant -> variant
                    .description("Layers"))
            .variant("limestone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("limestone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("limestone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("limestone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/limestone/limestone_meander_horizontal-bottom")))
            .variant("limestone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/limestone/limestone_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_meander_vertical-side")))
            .variant("limestone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_ornate", variant -> variant
                    .description("Limestone with Ornate Panel"))
            // .variant("limestone_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Limestone").description("Small Ornate"))
            .variant("limestone_panel", variant -> variant
                    .description("Limestone with Panel"))
            .variant("limestone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/limestone/limestone_pillar-top")))
            .variant("limestone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_basic-side")))
            .variant("limestone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_basic_dent-side")))
            .variant("limestone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_basic_plain-side")))
            .variant("limestone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_basic_round-side")))
            .variant("limestone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_basic_spiral-side")))
            .variant("limestone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_classic-bottom")))
            .variant("limestone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_classic_large-bottom")))
            .variant("limestone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_ionic-side")))
            .variant("limestone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_large_basic_triple-side")))
            .variant("limestone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_large_ionic_triple-side")))
            .variant("limestone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/limestone/limestone_pillar_meander-side")))
            .variant("limestone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/limestone/limestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/limestone/limestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/limestone/limestone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("limestone_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/limestone/limestone_plate_connected")))
            .variant("limestone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_border_square-ctm_cornerless")))
            .variant("limestone_polished", variant -> variant
                    .description("Polished")
                    .texture(Chisel.prefix("block/limestone/limestone_tiles_large")))
            .variant("limestone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_prism", variant -> variant
                    .description("Prism"))
            .variant("limestone_road", variant -> variant
                    .description("Road"))
            .variant("limestone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("limestone_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("limestone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("limestone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/limestone/limestone_twisted-top")))
            .variant("limestone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("ar_variant_1")
                    .texture("v4_top_right", Chisel.prefix("block/limestone/limestone_zag-v4_bottom_left")))
            .variant("limestone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("limestone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_herringbone")))
            .variant("limestone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("limestone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_medallion")))
            .variant("limestone_dots", variant -> variant
                    .description("Dots"))
            .variant("limestone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_dots")))
            .variant("limestone_heart", variant -> variant
                    .description("Heart"))
            .variant("limestone_star", variant -> variant
                    .description("Star"))
            .variant("limestone_plating", variant -> variant
                    .description("Plating"))
            .variant("limestone_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/limestone/limestone_lodestone_connected")))
            .variant("limestone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("limestone_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/limestone/limestone_plank_connected")))
            .variant("limestone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_frame", variant -> variant
                    .description("Frame"))
            .variant("limestone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("limestone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("limestone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("limestone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("limestone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("limestone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("limestone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_stripes")))
            .variant("limestone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("limestone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("limestone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("limestone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("limestone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("limestone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("limestone_facet", variant -> variant
                    .description("Facet"))
            .variant("limestone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("limestone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_facet_small")))
            .variant("limestone_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/limestone/limestone_shiny_connected")))
            .variant("limestone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_gem", variant -> variant
                    .description("Gem"))
            .variant("limestone_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/limestone/limestone_gem_1_connected")))
            .variant("limestone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_border_square-ctm_cornerless")))
            .variant("limestone_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/limestone/limestone_gem_2_connected")))
            .variant("limestone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_border_square-ctm_cornerless")))
            .variant("limestone_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/limestone/limestone_gem_3_connected")))
            .variant("limestone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("limestone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("limestone_slab", variant -> variant
                    .description("Slab"))
            .variant("limestone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("limestone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_scaffold")))
            .variant("limestone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("limestone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("limestone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("limestone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/limestone/limestone_parquet"))));

    private LimestoneFamily() {
    }
}
