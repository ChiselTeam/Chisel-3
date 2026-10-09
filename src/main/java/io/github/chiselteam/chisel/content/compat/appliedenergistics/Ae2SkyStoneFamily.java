package io.github.chiselteam.chisel.content.compat.appliedenergistics;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class Ae2SkyStoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("ae2_sky_stone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Sky Stone"))
            .variant("sky_stone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sky_stone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless")))
            .variant("sky_stone_braid", variant -> variant
                    .description("Braid"))
            .variant("sky_stone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sky_stone_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("sky_stone_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sky_stone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("sky_stone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("sky_stone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sky_stone_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("sky_stone_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("sky_stone_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("sky_stone_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("sky_stone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("sky_stone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("sky_stone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("sky_stone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("sky_stone_checker", variant -> variant
                    .description("Checker"))
            .variant("sky_stone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("sky_stone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless")))
            .variant("sky_stone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("sky_stone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("sky_stone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sky_stone_french_1", variant -> variant
                    .description("French 1"))
            .variant("sky_stone_french_2", variant -> variant
                    .description("French 2"))
            .variant("sky_stone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless")))
            .variant("sky_stone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sky_stone_layers", variant -> variant
                    .description("Layers"))
            .variant("sky_stone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sky_stone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("sky_stone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("sky_stone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("bottom", Chisel.prefix("block/ae2_sky_stone/sky_stone_meander_horizontal-top")))
            .variant("sky_stone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/ae2_sky_stone/sky_stone_meander_vertical-top")))
            .variant("sky_stone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless")))
            .variant("sky_stone_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("sky_stone_panel", variant -> variant
                    .description("Panel"))
            .variant("sky_stone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar-top")))
            .variant("sky_stone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top")))
            .variant("sky_stone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top")))
            .variant("sky_stone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top")))
            .variant("sky_stone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top")))
            .variant("sky_stone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top")))
            .variant("sky_stone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_classic-top")))
            .variant("sky_stone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_classic_large-top")))
            .variant("sky_stone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top")))
            .variant("sky_stone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_dent-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-vertical_none")))
            .variant("sky_stone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-vertical_none")))
            .variant("sky_stone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-vertical_none")))
            .variant("sky_stone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-vertical_none")))
            .variant("sky_stone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top")))
            .variant("sky_stone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_large_basic_triple-vertical_both")))
            .variant("sky_stone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_ionic-vertical_both")))
            .variant("sky_stone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_dent-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-vertical_none")))
            .variant("sky_stone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-vertical_none")))
            .variant("sky_stone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-vertical_none")))
            .variant("sky_stone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/ae2_sky_stone/sky_stone_pillar_meander-vertical_none")))
            .variant("sky_stone_plate", variant -> variant
                    .description("Plate"))
            .variant("sky_stone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless")))
            .variant("sky_stone_polished", variant -> variant
                    .description("Polished"))
            .variant("sky_stone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sky_stone_prism", variant -> variant
                    .description("Prismatic"))
            .variant("sky_stone_raw", variant -> variant
                    .description("Raw"))
            .variant("sky_stone_road", variant -> variant
                    .description("Road"))
            .variant("sky_stone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sky_stone_tiles", variant -> variant
                    .description("Tiles"))
            .variant("sky_stone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_sky_stone/sky_stone_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_sky_stone/sky_stone_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_sky_stone/sky_stone_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_sky_stone/sky_stone_tiles_large-ctm_vertical")))
            .variant("sky_stone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("sky_stone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/ae2_sky_stone/sky_stone_twisted-top")))
            .variant("sky_stone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sky_stone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sky_stone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sky_stone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("sky_stone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_herringbone")))
            .variant("sky_stone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("sky_stone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_medallion")))
            .variant("sky_stone_dots", variant -> variant
                    .description("Dots"))
            .variant("sky_stone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dots")))
            .variant("sky_stone_heart", variant -> variant
                    .description("Heart"))
            .variant("sky_stone_star", variant -> variant
                    .description("Star"))
            .variant("sky_stone_plating", variant -> variant
                    .description("Plating"))
            .variant("sky_stone_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("sky_stone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_sky_stone/sky_stone_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_sky_stone/sky_stone_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_sky_stone/sky_stone_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_sky_stone/sky_stone_lodestone_connected-ctm_vertical")))
            .variant("sky_stone_plank", variant -> variant
                    .description("Plank"))
            .variant("sky_stone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_sky_stone/sky_stone_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_sky_stone/sky_stone_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_sky_stone/sky_stone_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_sky_stone/sky_stone_plank_connected-ctm_vertical")))
            .variant("sky_stone_frame", variant -> variant
                    .description("Frame"))
            .variant("sky_stone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("sky_stone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("sky_stone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("sky_stone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("sky_stone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("sky_stone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("sky_stone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_stripes")))
            .variant("sky_stone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("sky_stone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("sky_stone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("sky_stone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("sky_stone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("sky_stone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("sky_stone_facet", variant -> variant
                    .description("Facet"))
            .variant("sky_stone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("sky_stone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_facet_small")))
            .variant("sky_stone_shiny", variant -> variant
                    .description("Shiny"))
            .variant("sky_stone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_sky_stone/sky_stone_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_sky_stone/sky_stone_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_sky_stone/sky_stone_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_sky_stone/sky_stone_shiny_connected-ctm_vertical")))
            .variant("sky_stone_gem", variant -> variant
                    .description("Gem"))
            .variant("sky_stone_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("sky_stone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_1_connected-ctm_vertical")))
            .variant("sky_stone_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("sky_stone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_2_connected-ctm_vertical")))
            .variant("sky_stone_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("sky_stone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/ae2_sky_stone/sky_stone_gem_3_connected-ctm_vertical")))
            .variant("sky_stone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("sky_stone_slab", variant -> variant
                    .description("Slab"))
            .variant("sky_stone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("sky_stone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_scaffold")))
            .variant("sky_stone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("sky_stone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("sky_stone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("sky_stone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/ae2_sky_stone/sky_stone_parquet"))));

    private Ae2SkyStoneFamily() {
    }
}
