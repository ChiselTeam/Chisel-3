package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class NetherbrickFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("nether_brick", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS))
                    .blockName("Nether Bricks"))
            .existingBlock(Blocks.NETHER_BRICKS)
            .existingBlock(Blocks.CRACKED_NETHER_BRICKS)
            .existingBlock(Blocks.CHISELED_NETHER_BRICKS)
            .variant("nether_brick_blue", variant -> variant
                    .blockName("Nether Brick")
                    .description("Blue Nether Brick"))
            .variant("nether_brick_blue_lava", variant -> variant
                    .blockName("Nether Brick")
                    .description("Blue Nether Brick with Lava"))
            .variant("nether_brick_brown", variant -> variant
                    .blockName("Nether Brick")
                    .description("Brown Nether Brick"))
            .variant("nether_brick_guts", variant -> variant
                    .blockName("Nether Brick")
                    .description("Nether Brick made of Guts"))
            .variant("nether_brick_guts_dark", variant -> variant
                    .blockName("Nether Brick")
                    .description("Dark Nether Brick made of Guts"))
            .variant("nether_brick_guts_small", variant -> variant
                    .blockName("Nether Brick")
                    .description("Small Nether Brick made of Guts"))
            .variant("nether_brick_meat", variant -> variant
                    .blockName("Nether Brick")
                    .description("Nether Brick made of Meat"))
            .variant("nether_brick_meat_red", variant -> variant
                    .blockName("Nether Brick")
                    .description("Red Nether Brick made of Meat"))
            .variant("nether_brick_meat_small", variant -> variant
                    .blockName("Nether Brick")
                    .description("Small Nether Brick made of Meat"))
            .variant("nether_brick_meat_small_red", variant -> variant
                    .blockName("Nether Brick")
                    .description("Small Red Nether Brick made of Meat"))
            .variant("nether_brick_obsidian", variant -> variant
                    .blockName("Nether Brick")
                    .description("Obsidian Nether Brick"))
            .variant("nether_brick_red", variant -> variant
                    .blockName("Nether Brick")
                    .description("Red Nether Brick"))
            .variant("nether_brick_red_small", variant -> variant
                    .blockName("Nether Brick")
                    .description("Small Red Nether Brick"))
            .variant("nether_brick_spattered", variant -> variant
                    .blockName("Nether Brick")
                    .description("Spattered Nether Brick"))
            .variant("nether_brick_stone", variant -> variant
                    .blockName("Nether Brick")
                    .description("Stone Nether Brick"))
            .variant("nether_bricks_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("nether_bricks_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_braid", variant -> variant
                    .description("Braid"))
            .variant("nether_bricks_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_braid")))
            .variant("nether_bricks_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("nether_bricks_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("nether_bricks_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("nether_bricks_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("nether_bricks_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("nether_bricks_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("nether_bricks_bricks_solid", variant -> variant
                    .description("Solid Bricks")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_bricks_encased-ctm_cornerless")))
            .variant("nether_bricks_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("nether_bricks_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("nether_bricks_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("nether_bricks_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("nether_bricks_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("nether_bricks_checker", variant -> variant
                    .description("Checker"))
            .variant("nether_bricks_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("nether_bricks_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_cracked", variant -> variant
                    .description("Cracked"))
            .variant("nether_bricks_cobble", variant -> variant
                    .description("Cobble"))
            .variant("nether_bricks_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("nether_bricks_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_french_1", variant -> variant
                    .description("French 1"))
            .variant("nether_bricks_french_2", variant -> variant
                    .description("French 2"))
            .variant("nether_bricks_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("nether_bricks_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_layers_connected")))
            .variant("nether_bricks_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("nether_bricks_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("nether_bricks_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_meander_horizontal-bottom")))
            .variant("nether_bricks_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_meander_vertical-side")))
            .variant("nether_bricks_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("nether_bricks_panel", variant -> variant
                    .description("Panel"))
            .variant("nether_bricks_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar-bottom")))
            .variant("nether_bricks_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-side")))
            .variant("nether_bricks_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_dent-side")))
            .variant("nether_bricks_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_plain-side")))
            .variant("nether_bricks_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_round-side")))
            .variant("nether_bricks_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_spiral-side")))
            .variant("nether_bricks_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_classic-bottom")))
            .variant("nether_bricks_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_classic_large-bottom")))
            .variant("nether_bricks_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_ionic-side")))
            .variant("nether_bricks_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_large_basic_triple-side")))
            .variant("nether_bricks_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_large_ionic_triple-side")))
            .variant("nether_bricks_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/nether_brick/nether_bricks_pillar_meander-side")))
            .variant("nether_bricks_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/nether_brick/nether_bricks_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/nether_brick/nether_bricks_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("nether_bricks_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_plate_connected")))
            .variant("nether_bricks_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_polished", variant -> variant
                    .description("Polished")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_tiles_large")))
            .variant("nether_bricks_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_prism", variant -> variant
                    .description("Prismatic"))
            .variant("nether_bricks_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_road", variant -> variant
                    .description("Road"))
            .variant("nether_bricks_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("nether_bricks_tiles", variant -> variant
                    .description("Tiles"))
            .variant("nether_bricks_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("nether_bricks_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/nether_brick/nether_bricks_twisted-bottom")))
            .variant("nether_bricks_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("v4_top_left"))
            .variant("nether_bricks_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("nether_bricks_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_herringbone")))
            .variant("nether_bricks_medallion", variant -> variant
                    .description("Medallion"))
            .variant("nether_bricks_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_medallion")))
            .variant("nether_bricks_dots", variant -> variant
                    .description("Dots"))
            .variant("nether_bricks_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_dots")))
            .variant("nether_bricks_heart", variant -> variant
                    .description("Heart"))
            .variant("nether_bricks_star", variant -> variant
                    .description("Star"))
            .variant("nether_bricks_plating", variant -> variant
                    .description("Plating"))
            .variant("nether_bricks_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_lodestone_connected")))
            .variant("nether_bricks_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("nether_bricks_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_plank_connected")))
            .variant("nether_bricks_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_frame", variant -> variant
                    .description("Frame"))
            .variant("nether_bricks_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("nether_bricks_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("nether_bricks_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("nether_bricks_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("nether_bricks_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("nether_bricks_stripes", variant -> variant
                    .description("Stripes"))
            .variant("nether_bricks_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_stripes")))
            .variant("nether_bricks_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("nether_bricks_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("nether_bricks_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("nether_bricks_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("nether_bricks_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("nether_bricks_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("nether_bricks_facet", variant -> variant
                    .description("Facet"))
            .variant("nether_bricks_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("nether_bricks_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_facet_small")))
            .variant("nether_bricks_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_shiny_connected")))
            .variant("nether_bricks_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_gem", variant -> variant
                    .description("Gem"))
            .variant("nether_bricks_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_gem_1_connected")))
            .variant("nether_bricks_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_gem_2_connected")))
            .variant("nether_bricks_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_border_square-ctm_cornerless")))
            .variant("nether_bricks_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/nether_brick/nether_bricks_gem_3_connected")))
            .variant("nether_bricks_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("nether_bricks_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("nether_bricks_slab", variant -> variant
                    .description("Slab"))
            .variant("nether_bricks_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("nether_bricks_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_scaffold")))
            .variant("nether_bricks_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("nether_bricks_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("nether_bricks_parquet", variant -> variant
                    .description("Parquet"))
            .variant("nether_bricks_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/nether_brick/nether_bricks_parquet"))));

    private NetherbrickFamily() {
    }
}
