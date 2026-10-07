package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DeepslateFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("deepslate", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE))
                    .blockName("Deepslate"))
            .existingBlock(Blocks.DEEPSLATE)
            .variant("deepslate_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("deepslate_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("deepslate_braid", variant -> variant
                    .description("Braid"))
            .variant("deepslate_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("deepslate_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("deepslate_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("deepslate_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/deepslate/deepslate_bricks_large-2x2_bottom_left")))
            .variant("deepslate_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("deepslate_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("deepslate_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("deepslate_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("deepslate_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("deepslate_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("deepslate_chaotic_medium", variant -> variant
                    .description("Deepslate Bricks"))
            .variant("deepslate_chaotic_small", variant -> variant
                    .description("Deepslate Small Tiles"))
            .variant("deepslate_checker", variant -> variant
                    .description("Checker"))
            .variant("deepslate_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("deepslate_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            // .variant("deepslate_cobble", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Deepslate").description("Cobble"))
            .variant("deepslate_cracked", variant -> variant
                    .description("Cracked"))
            .variant("deepslate_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("deepslate_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_french_1", variant -> variant
                    .description("French 1"))
            .variant("deepslate_french_2", variant -> variant
                    .description("French 2"))
            .variant("deepslate_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_border_square-ctm_cornerless")))
            .variant("deepslate_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("deepslate_layers", variant -> variant
                    .description("Layers"))
            .variant("deepslate_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("deepslate_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("deepslate_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("deepslate_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_meander_horizontal-bottom")))
            .variant("deepslate_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_meander_vertical-side")))
            .variant("deepslate_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_ornate", variant -> variant
                    .description("Ornate Deepslate"))
            // .variant("deepslate_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Deepslate").description("Small Ornate"))
            .variant("deepslate_panel", variant -> variant
                    .description("Panel"))
            .variant("deepslate_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("deepslate_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_basic-side")))
            .variant("deepslate_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_basic_dent-side")))
            .variant("deepslate_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_basic_plain-side")))
            .variant("deepslate_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_basic_round-side")))
            .variant("deepslate_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_basic_spiral-side")))
            .variant("deepslate_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_classic-bottom")))
            .variant("deepslate_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_classic_large-bottom")))
            .variant("deepslate_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_ionic-side")))
            .variant("deepslate_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_large_basic_triple-side")))
            .variant("deepslate_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_large_ionic_triple-side")))
            .variant("deepslate_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/deepslate/deepslate_pillar_meander-side")))
            .variant("deepslate_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/deepslate/deepslate_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/deepslate/deepslate_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/deepslate/deepslate_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("deepslate_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/deepslate/deepslate_plate_connected")))
            .variant("deepslate_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_border_square-ctm_cornerless")))
            .variant("deepslate_polished", variant -> variant
                    .description("Polished"))
            .variant("deepslate_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_prism", variant -> variant
                    .description("Prismatic Deepslate"))
            .variant("deepslate_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/deepslate/deepslate_border_square-ctm_cornerless")))
            .variant("deepslate_road", variant -> variant
                    .description("Road"))
            .variant("deepslate_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .texture("2x2_bottom_left", Chisel.prefix("block/deepslate/deepslate_slanted-2x2_top_left"))
                    .texture("2x2_bottom_right", Chisel.prefix("block/deepslate/deepslate_slanted-2x2_top_right")))
            .variant("deepslate_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("deepslate_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("deepslate_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/deepslate/deepslate_twisted-top")))
            .variant("deepslate_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_weaver-ctm_corner")))
            .variant("deepslate_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .texture("v4_top_right", Chisel.prefix("block/deepslate/deepslate_zag-v4_bottom_left")))
            .variant("deepslate_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("deepslate_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_herringbone")))
            .variant("deepslate_medallion", variant -> variant
                    .description("Medallion"))
            .variant("deepslate_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_medallion")))
            .variant("deepslate_dots", variant -> variant
                    .description("Dots"))
            .variant("deepslate_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_dots")))
            .variant("deepslate_heart", variant -> variant
                    .description("Heart"))
            .variant("deepslate_star", variant -> variant
                    .description("Star"))
            .variant("deepslate_plating", variant -> variant
                    .description("Plating"))
            .variant("deepslate_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/deepslate/deepslate_lodestone_connected")))
            .variant("deepslate_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("deepslate_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/deepslate/deepslate_plank_connected")))
            .variant("deepslate_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_frame", variant -> variant
                    .description("Frame"))
            .variant("deepslate_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("deepslate_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("deepslate_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("deepslate_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("deepslate_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("deepslate_stripes", variant -> variant
                    .description("Stripes"))
            .variant("deepslate_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_stripes")))
            .variant("deepslate_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("deepslate_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("deepslate_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("deepslate_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("deepslate_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("deepslate_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("deepslate_facet", variant -> variant
                    .description("Facet"))
            .variant("deepslate_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("deepslate_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_facet_small")))
            .variant("deepslate_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/deepslate/deepslate_shiny_connected")))
            .variant("deepslate_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_gem", variant -> variant
                    .description("Gem"))
            .variant("deepslate_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/deepslate/deepslate_gem_1_connected")))
            .variant("deepslate_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_border_square-ctm_cornerless")))
            .variant("deepslate_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/deepslate/deepslate_gem_2_connected")))
            .variant("deepslate_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_border_square-ctm_cornerless")))
            .variant("deepslate_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/deepslate/deepslate_gem_3_connected")))
            .variant("deepslate_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("deepslate_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("deepslate_slab", variant -> variant
                    .description("Slab"))
            .variant("deepslate_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("deepslate_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_scaffold")))
            .variant("deepslate_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("deepslate_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("deepslate_parquet", variant -> variant
                    .description("Parquet"))
            .variant("deepslate_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/deepslate/deepslate_parquet"))));

    private DeepslateFamily() {
    }
}
