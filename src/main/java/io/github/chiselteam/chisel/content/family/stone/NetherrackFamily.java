package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class NetherrackFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("netherrack", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK))
                    .blockName("Netherrack"))
            .existingBlock(Blocks.NETHERRACK)
            .variant("netherrack_blood", variant -> variant
                    .description("Netherrack with Blood"))
            .variant("netherrack_blood_dark", variant -> variant
                    .description("Darker Netherrack with Blood"))
            .variant("netherrack_blood_gravel", variant -> variant
                    .description("Nethergravel with Blood"))
            .variant("netherrack_blue", variant -> variant
                    .description("Blue Netherrack"))
            .variant("netherrack_blue_shale", variant -> variant
                    .description("Shale Blue Netherrack"))
            .variant("netherrack_classic", variant -> variant
                    .description("Classic Netherrack"))
            .variant("netherrack_guts", variant -> variant
                    .description("Netherrack made of Guts"))
            .variant("netherrack_guts_dark", variant -> variant
                    .description("Dark Netherrack made of Guts"))
            .variant("netherrack_lava", variant -> variant
                    .description("Netherrack with Flowing Lava"))
            .variant("netherrack_meat", variant -> variant
                    .description("Netherrack made of Meat"))
            .variant("netherrack_meat_red", variant -> variant
                    .description("Red Netherrack made of Meat"))
            .variant("netherrack_meat_small", variant -> variant
                    .description("Netherrack made of Smaller Meat Chunks"))
            .variant("netherrack_red", variant -> variant
                    .description("Dark Red Netherrack"))
            .variant("netherrack_spattered", variant -> variant
                    .description("Spattered Netherrack"))
            .variant("netherrack_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("netherrack_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("netherrack_braid", variant -> variant
                    .description("Braid"))
            .variant("netherrack_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_braid")))
            .variant("netherrack_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("netherrack_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherrack_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("netherrack_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("netherrack_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/netherrack/netherrack_bricks_large-2x2_bottom_left")))
            .variant("netherrack_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("netherrack_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("netherrack_bricks_solid", variant -> variant
                    .description("Solid Bricks")
                    .texture(Chisel.prefix("block/netherrack/netherrack_bricks_encased-ctm_cornerless")))
            .variant("netherrack_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("netherrack_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("netherrack_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("netherrack_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("netherrack_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("netherrack_checker", variant -> variant
                    .description("Checker"))
            .variant("netherrack_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("netherrack_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_cracked", variant -> variant
                    .description("Cracked"))
            .variant("netherrack_cobble", variant -> variant
                    .description("Cobble"))
            .variant("netherrack_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("netherrack_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_french_1", variant -> variant
                    .description("French 1"))
            .variant("netherrack_french_2", variant -> variant
                    .description("French 2"))
            .variant("netherrack_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("netherrack_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/netherrack/netherrack_layers_connected")))
            .variant("netherrack_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("netherrack_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("netherrack_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("netherrack_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_meander_horizontal-bottom")))
            .variant("netherrack_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_meander_vertical-side")))
            .variant("netherrack_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("netherrack_panel", variant -> variant
                    .description("Panel"))
            .variant("netherrack_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar-bottom")))
            .variant("netherrack_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_basic-side")))
            .variant("netherrack_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_basic_dent-side")))
            .variant("netherrack_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_basic_plain-side")))
            .variant("netherrack_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_basic_round-side")))
            .variant("netherrack_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_basic_spiral-side")))
            .variant("netherrack_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_classic-bottom")))
            .variant("netherrack_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_classic_large-bottom")))
            .variant("netherrack_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_ionic-side")))
            .variant("netherrack_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_large_basic_triple-side")))
            .variant("netherrack_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_large_ionic_triple-side")))
            .variant("netherrack_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherrack/netherrack_pillar_meander-side")))
            .variant("netherrack_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherrack/netherrack_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherrack/netherrack_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("netherrack_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/netherrack/netherrack_plate_connected")))
            .variant("netherrack_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_polished", variant -> variant
                    .description("Polished")
                    .texture(Chisel.prefix("block/netherrack/netherrack_tiles_large")))
            .variant("netherrack_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherrack_prism", variant -> variant
                    .description("Prismatic"))
            .variant("netherrack_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_road", variant -> variant
                    .description("Road"))
            .variant("netherrack_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left"))
            .variant("netherrack_tiles", variant -> variant
                    .description("Tiles"))
            .variant("netherrack_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("netherrack_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherrack/netherrack_twisted-bottom")))
            .variant("netherrack_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_weaver-ctm_corner")))
            .variant("netherrack_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("v4_top_left")
                    .texture("v4_top_right", Chisel.prefix("block/netherrack/netherrack_zag-v4_bottom_left")))
            .variant("netherrack_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherrack_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("netherrack_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_herringbone")))
            .variant("netherrack_medallion", variant -> variant
                    .description("Medallion"))
            .variant("netherrack_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_medallion")))
            .variant("netherrack_dots", variant -> variant
                    .description("Dots"))
            .variant("netherrack_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_dots")))
            .variant("netherrack_heart", variant -> variant
                    .description("Heart"))
            .variant("netherrack_star", variant -> variant
                    .description("Star"))
            .variant("netherrack_plating", variant -> variant
                    .description("Plating"))
            .variant("netherrack_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/netherrack/netherrack_lodestone_connected")))
            .variant("netherrack_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("netherrack_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/netherrack/netherrack_plank_connected")))
            .variant("netherrack_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherrack_frame", variant -> variant
                    .description("Frame"))
            .variant("netherrack_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("netherrack_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("netherrack_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("netherrack_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("netherrack_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("netherrack_stripes", variant -> variant
                    .description("Stripes"))
            .variant("netherrack_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_stripes")))
            .variant("netherrack_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("netherrack_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("netherrack_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("netherrack_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("netherrack_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("netherrack_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("netherrack_facet", variant -> variant
                    .description("Facet"))
            .variant("netherrack_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("netherrack_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_facet_small")))
            .variant("netherrack_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/netherrack/netherrack_shiny_connected")))
            .variant("netherrack_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherrack_gem", variant -> variant
                    .description("Gem"))
            .variant("netherrack_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/netherrack/netherrack_gem_1_connected")))
            .variant("netherrack_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/netherrack/netherrack_gem_2_connected")))
            .variant("netherrack_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_border_square-ctm_cornerless")))
            .variant("netherrack_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/netherrack/netherrack_gem_3_connected")))
            .variant("netherrack_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherrack_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("netherrack_slab", variant -> variant
                    .description("Slab"))
            .variant("netherrack_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("netherrack_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_scaffold")))
            .variant("netherrack_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("netherrack_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("netherrack_parquet", variant -> variant
                    .description("Parquet"))
            .variant("netherrack_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherrack/netherrack_parquet"))));

    private NetherrackFamily() {
    }
}
