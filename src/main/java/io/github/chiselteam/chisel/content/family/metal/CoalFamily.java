package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CoalFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("coal", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Coal Block"))
            .existingBlock(Blocks.COAL_BLOCK)
            .variant("coal_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("coal_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("coal_braid", variant -> variant
                    .description("Braid"))
            .variant("coal_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_braid")))
            .variant("coal_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("coal_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("coal_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("coal_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/coal/coal_bricks_large-2x2_bottom_left")))
            .variant("coal_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("coal_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("coal_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("coal_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("coal_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("coal_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("coal_chaotic_medium", variant -> variant
                    .description("Coal Bricks"))
            .variant("coal_chaotic_small", variant -> variant
                    .description("Coal Small Tiles"))
            .variant("coal_checker", variant -> variant
                    .description("Checker"))
            .variant("coal_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("coal_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_cracked", variant -> variant
                    .description("Cracked"))
            .variant("coal_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("coal_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_french_1", variant -> variant
                    .description("French 1"))
            .variant("coal_french_2", variant -> variant
                    .description("French 2"))
            .variant("coal_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_border_square-ctm_cornerless")))
            .variant("coal_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("coal_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/coal/coal_layers_connected")))
            .variant("coal_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("coal_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("coal_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("coal_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/coal/coal_meander_horizontal-bottom")))
            .variant("coal_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/coal/coal_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_meander_vertical-side")))
            .variant("coal_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_ornate", variant -> variant
                    .description("Ornate Coal"))
            .variant("coal_panel", variant -> variant
                    .description("Panel"))
            .variant("coal_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/coal/coal_pillar-top")))
            .variant("coal_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_basic-side")))
            .variant("coal_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_basic_dent-side")))
            .variant("coal_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_basic_plain-side")))
            .variant("coal_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_basic_round-side")))
            .variant("coal_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_basic_spiral-side")))
            .variant("coal_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_classic-bottom")))
            .variant("coal_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_classic_large-bottom")))
            .variant("coal_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_ionic-side")))
            .variant("coal_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_large_basic_triple-side")))
            .variant("coal_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_large_ionic_triple-side")))
            .variant("coal_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/coal/coal_pillar_meander-side")))
            .variant("coal_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/coal/coal_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/coal/coal_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/coal/coal_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("coal_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/coal/coal_plate_connected")))
            .variant("coal_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_border_square-ctm_cornerless")))
            .variant("coal_polished", variant -> variant
                    .description("Polished"))
            .variant("coal_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_prism", variant -> variant
                    .description("Prismatic Coal"))
            .variant("coal_raw", variant -> variant
                    .description("Raw"))
            .variant("coal_road", variant -> variant
                    .description("Road"))
            .variant("coal_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .textureFromBase("2x2_top_left"))
            .variant("coal_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("coal_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("coal_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/coal/coal_twisted-top")))
            .variant("coal_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .texture("v4_top_right", Chisel.prefix("block/coal/coal_zag-v4_bottom_left")))
            .variant("coal_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("coal_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_herringbone")))
            .variant("coal_medallion", variant -> variant
                    .description("Medallion"))
            .variant("coal_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_medallion")))
            .variant("coal_dots", variant -> variant
                    .description("Dots"))
            .variant("coal_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_dots")))
            .variant("coal_heart", variant -> variant
                    .description("Heart"))
            .variant("coal_star", variant -> variant
                    .description("Star"))
            .variant("coal_plating", variant -> variant
                    .description("Plating"))
            .variant("coal_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/coal/coal_lodestone_connected")))
            .variant("coal_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("coal_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/coal/coal_plank_connected")))
            .variant("coal_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_frame", variant -> variant
                    .description("Frame"))
            .variant("coal_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("coal_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("coal_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("coal_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("coal_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("coal_stripes", variant -> variant
                    .description("Stripes"))
            .variant("coal_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_stripes")))
            .variant("coal_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("coal_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("coal_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("coal_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("coal_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("coal_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("coal_facet", variant -> variant
                    .description("Facet"))
            .variant("coal_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("coal_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_facet_small")))
            .variant("coal_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/coal/coal_shiny_connected")))
            .variant("coal_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_gem", variant -> variant
                    .description("Gem"))
            .variant("coal_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/coal/coal_gem_1_connected")))
            .variant("coal_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_border_square-ctm_cornerless")))
            .variant("coal_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/coal/coal_gem_2_connected")))
            .variant("coal_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_border_square-ctm_cornerless")))
            .variant("coal_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/coal/coal_gem_3_connected")))
            .variant("coal_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("coal_slab", variant -> variant
                    .description("Slab"))
            .variant("coal_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("coal_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_scaffold")))
            .variant("coal_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("coal_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("coal_parquet", variant -> variant
                    .description("Parquet"))
            .variant("coal_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal/coal_parquet")))
            .variant("coal_border_square_small", variant -> variant
                    .description("Small Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_cobble", variant -> variant
                    .description("Cobble"))
            .variant("coal_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("coal_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private CoalFamily() {
    }
}
