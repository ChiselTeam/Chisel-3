package io.github.chiselteam.chisel.content.compat.allthemods;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AtmAncientStoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("atm_ancient_stone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Ancient Stone"))
            .variant("ancient_stone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_stone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw")))
            .variant("ancient_stone_braid", variant -> variant
                    .description("Braid"))
            .variant("ancient_stone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_braid")))
            .variant("ancient_stone_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("ancient_stone_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_bricks_solid")))
            .variant("ancient_stone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("ancient_stone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("ancient_stone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("ancient_stone_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("ancient_stone_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("ancient_stone_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("ancient_stone_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("ancient_stone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("ancient_stone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("ancient_stone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("ancient_stone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("ancient_stone_checker", variant -> variant
                    .description("Checker"))
            .variant("ancient_stone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("ancient_stone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw")))
            .variant("ancient_stone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("ancient_stone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("ancient_stone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw")))
            .variant("ancient_stone_french_1", variant -> variant
                    .description("French 1"))
            .variant("ancient_stone_french_2", variant -> variant
                    .description("French 2"))
            .variant("ancient_stone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw")))
            .variant("ancient_stone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("ancient_stone_layers", variant -> variant
                    .description("Layers"))
            .variant("ancient_stone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_layers"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_layers_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_layers_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_layers_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_layers_connected-ctm_vertical")))
            .variant("ancient_stone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("ancient_stone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("ancient_stone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("bottom", Chisel.prefix("block/atm_ancient_stone/ancient_stone_meander_horizontal-top")))
            .variant("ancient_stone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/atm_ancient_stone/ancient_stone_meander_vertical-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_meander_vertical-side")))
            .variant("ancient_stone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw")))
            .variant("ancient_stone_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("ancient_stone_panel", variant -> variant
                    .description("Panel"))
            .variant("ancient_stone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar-top")))
            .variant("ancient_stone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-side")))
            .variant("ancient_stone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_dent-side")))
            .variant("ancient_stone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_plain-side")))
            .variant("ancient_stone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_round-side")))
            .variant("ancient_stone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_spiral-side")))
            .variant("ancient_stone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_classic-top")))
            .variant("ancient_stone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_classic_large-top")))
            .variant("ancient_stone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_ionic-side")))
            .variant("ancient_stone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_large_basic_triple-side")))
            .variant("ancient_stone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_large_ionic_triple-side")))
            .variant("ancient_stone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_meander-side")))
            .variant("ancient_stone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/atm_ancient_stone/ancient_stone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("ancient_stone_plate", variant -> variant
                    .description("Plate"))
            .variant("ancient_stone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_plate"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_plate_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_plate_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_plate_connected-ctm_vertical")))
            .variant("ancient_stone_polished", variant -> variant
                    .description("Polished"))
            .variant("ancient_stone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_stone_prism", variant -> variant
                    .description("Prismatic"))
            .variant("ancient_stone_raw", variant -> variant
                    .description("Raw"))
            .variant("ancient_stone_road", variant -> variant
                    .description("Road"))
            .variant("ancient_stone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_stone_tiles", variant -> variant
                    .description("Tiles"))
            .variant("ancient_stone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_tiles_large-ctm_vertical")))
            .variant("ancient_stone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("ancient_stone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/atm_ancient_stone/ancient_stone_twisted-top")))
            .variant("ancient_stone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_stone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("ancient_stone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_stone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("ancient_stone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_herringbone")))
            .variant("ancient_stone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("ancient_stone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_medallion")))
            .variant("ancient_stone_dots", variant -> variant
                    .description("Dots"))
            .variant("ancient_stone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_dots")))
            .variant("ancient_stone_heart", variant -> variant
                    .description("Heart"))
            .variant("ancient_stone_star", variant -> variant
                    .description("Star"))
            .variant("ancient_stone_plating", variant -> variant
                    .description("Plating"))
            .variant("ancient_stone_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("ancient_stone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_lodestone_connected-ctm_vertical")))
            .variant("ancient_stone_plank", variant -> variant
                    .description("Plank"))
            .variant("ancient_stone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_plank_connected-ctm_vertical")))
            .variant("ancient_stone_frame", variant -> variant
                    .description("Frame"))
            .variant("ancient_stone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("ancient_stone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("ancient_stone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("ancient_stone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("ancient_stone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("ancient_stone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("ancient_stone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_stripes")))
            .variant("ancient_stone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("ancient_stone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("ancient_stone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("ancient_stone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("ancient_stone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("ancient_stone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("ancient_stone_facet", variant -> variant
                    .description("Facet"))
            .variant("ancient_stone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("ancient_stone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_facet_small")))
            .variant("ancient_stone_shiny", variant -> variant
                    .description("Shiny"))
            .variant("ancient_stone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_shiny_connected-ctm_vertical")))
            .variant("ancient_stone_gem", variant -> variant
                    .description("Gem"))
            .variant("ancient_stone_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("ancient_stone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_1_connected-ctm_vertical")))
            .variant("ancient_stone_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("ancient_stone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_raw"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_2_connected-ctm_vertical")))
            .variant("ancient_stone_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("ancient_stone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/atm_ancient_stone/ancient_stone_gem_3_connected-ctm_vertical")))
            .variant("ancient_stone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("ancient_stone_slab", variant -> variant
                    .description("Slab"))
            .variant("ancient_stone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("ancient_stone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_scaffold")))
            .variant("ancient_stone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("ancient_stone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("ancient_stone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("ancient_stone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/atm_ancient_stone/ancient_stone_parquet"))));

    private AtmAncientStoneFamily() {
    }
}
