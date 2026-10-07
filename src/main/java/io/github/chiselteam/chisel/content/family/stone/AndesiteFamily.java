package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AndesiteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("andesite", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE))
                    .blockName("Andesite"))
            .existingBlock(Blocks.ANDESITE)
            .existingBlock(Blocks.POLISHED_ANDESITE)
            .variant("andesite_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("andesite_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("andesite_braid", variant -> variant
                    .description("Braid"))
            .variant("andesite_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_braid")))
            .variant("andesite_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("andesite_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("andesite_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("andesite_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/andesite/andesite_bricks_large-2x2_bottom_left")))
            .variant("andesite_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("andesite_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("andesite_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("andesite_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("andesite_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("andesite_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("andesite_chaotic_medium", variant -> variant
                    .description("Andesite Bricks"))
            .variant("andesite_chaotic_small", variant -> variant
                    .description("Andesite Small Tiles"))
            .variant("andesite_checker", variant -> variant
                    .description("Checker"))
            .variant("andesite_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("andesite_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_dent-ctm_cornerless")))
            // .variant("andesite_cobble", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Andesite").description("Cobble"))
            .variant("andesite_cracked", variant -> variant
                    .description("Cracked"))
            .variant("andesite_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("andesite_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_french_1", variant -> variant
                    .description("French 1"))
            .variant("andesite_french_2", variant -> variant
                    .description("French 2"))
            .variant("andesite_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_border_square-ctm_cornerless")))
            .variant("andesite_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("andesite_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/andesite/andesite_layers_connected")))
            .variant("andesite_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("andesite_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("andesite_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("andesite_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/andesite/andesite_meander_horizontal-bottom")))
            .variant("andesite_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/andesite/andesite_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_meander_vertical-side")))
            .variant("andesite_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_ornate", variant -> variant
                    .description("Ornate Andesite"))
            // .variant("andesite_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Andesite").description("Small Ornate"))
            .variant("andesite_panel", variant -> variant
                    .description("Panel"))
            .variant("andesite_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/andesite/andesite_pillar-top")))
            .variant("andesite_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_basic-side")))
            .variant("andesite_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_basic_dent-side")))
            .variant("andesite_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_basic_plain-side")))
            .variant("andesite_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_basic_round-side")))
            .variant("andesite_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_basic_spiral-side")))
            .variant("andesite_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_classic-bottom")))
            .variant("andesite_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_classic_large-bottom")))
            .variant("andesite_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_ionic-side")))
            .variant("andesite_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_large_basic_triple-side")))
            .variant("andesite_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_large_ionic_triple-side")))
            .variant("andesite_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/andesite/andesite_pillar_meander-side")))
            .variant("andesite_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/andesite/andesite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/andesite/andesite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/andesite/andesite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("andesite_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/andesite/andesite_plate_connected")))
            .variant("andesite_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_border_square-ctm_cornerless")))
            .variant("andesite_polished", variant -> variant
                    .description("Polished")
                    .texture(Chisel.prefix("block/andesite/andesite_tiles_large")))
            .variant("andesite_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_prism", variant -> variant
                    .description("Prismatic Andesite"))
            .variant("andesite_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/andesite/andesite_border_square-ctm_cornerless")))
            .variant("andesite_road", variant -> variant
                    .description("Road"))
            .variant("andesite_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/andesite/andesite_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("andesite_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("andesite_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_mosaic-ctm_cornerless")))
            .variant("andesite_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("andesite_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/andesite/andesite_twisted-top")))
            .variant("andesite_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_weaver-ctm_corner")))
            .variant("andesite_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("ar_variant_1")
                    .texture("v4_top_right", Chisel.prefix("block/andesite/andesite_zag-v4_bottom_left")))
            .variant("andesite_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("andesite_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_herringbone")))
            .variant("andesite_medallion", variant -> variant
                    .description("Medallion"))
            .variant("andesite_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_medallion")))
            .variant("andesite_dots", variant -> variant
                    .description("Dots"))
            .variant("andesite_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_dots")))
            .variant("andesite_heart", variant -> variant
                    .description("Heart"))
            .variant("andesite_star", variant -> variant
                    .description("Star"))
            .variant("andesite_plating", variant -> variant
                    .description("Plating"))
            .variant("andesite_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/andesite/andesite_lodestone_connected")))
            .variant("andesite_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("andesite_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/andesite/andesite_plank_connected")))
            .variant("andesite_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_frame", variant -> variant
                    .description("Frame"))
            .variant("andesite_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("andesite_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("andesite_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("andesite_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("andesite_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("andesite_stripes", variant -> variant
                    .description("Stripes"))
            .variant("andesite_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_stripes")))
            .variant("andesite_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("andesite_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("andesite_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("andesite_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("andesite_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("andesite_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("andesite_facet", variant -> variant
                    .description("Facet"))
            .variant("andesite_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("andesite_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_facet_small")))
            .variant("andesite_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/andesite/andesite_shiny_connected")))
            .variant("andesite_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_gem", variant -> variant
                    .description("Gem"))
            .variant("andesite_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/andesite/andesite_gem_1_connected")))
            .variant("andesite_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_border_square-ctm_cornerless")))
            .variant("andesite_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/andesite/andesite_gem_2_connected")))
            .variant("andesite_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_border_square-ctm_cornerless")))
            .variant("andesite_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/andesite/andesite_gem_3_connected")))
            .variant("andesite_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("andesite_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("andesite_slab", variant -> variant
                    .description("Slab"))
            .variant("andesite_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("andesite_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_scaffold")))
            .variant("andesite_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("andesite_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("andesite_parquet", variant -> variant
                    .description("Parquet"))
            .variant("andesite_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/andesite/andesite_parquet"))));

    private AndesiteFamily() {
    }
}
