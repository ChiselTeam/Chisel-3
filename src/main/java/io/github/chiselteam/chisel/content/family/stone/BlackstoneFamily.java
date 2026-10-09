package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BlackstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("blackstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE))
                    .blockName("Blackstone"))
            .existingBlock(Blocks.BLACKSTONE)
            .existingBlock(Blocks.CHISELED_POLISHED_BLACKSTONE)
            .existingBlock(Blocks.POLISHED_BLACKSTONE)
            .existingBlock(Blocks.POLISHED_BLACKSTONE_BRICKS)
            .variant("blackstone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("blackstone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless")))
            .variant("blackstone_braid", variant -> variant
                    .description("Braid"))
            .variant("blackstone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("blackstone_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("blackstone_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("blackstone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("blackstone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("blackstone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("blackstone_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("blackstone_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("blackstone_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("blackstone_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("blackstone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("blackstone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("blackstone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("blackstone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("blackstone_checker", variant -> variant
                    .description("Checker"))
            .variant("blackstone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("blackstone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless")))
            .variant("blackstone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("blackstone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("blackstone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("blackstone_french_1", variant -> variant
                    .description("French 1"))
            .variant("blackstone_french_2", variant -> variant
                    .description("French 2"))
            .variant("blackstone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless")))
            .variant("blackstone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("blackstone_layers", variant -> variant
                    .description("Layers"))
            .variant("blackstone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("blackstone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("blackstone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("blackstone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("bottom", Chisel.prefix("block/blackstone/blackstone_meander_horizontal-top")))
            .variant("blackstone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/blackstone/blackstone_meander_vertical-top")))
            .variant("blackstone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless")))
            .variant("blackstone_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("blackstone_panel", variant -> variant
                    .description("Panel"))
            .variant("blackstone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/blackstone/blackstone_pillar-top")))
            .variant("blackstone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top")))
            .variant("blackstone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top")))
            .variant("blackstone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top")))
            .variant("blackstone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top")))
            .variant("blackstone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top")))
            .variant("blackstone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/blackstone/blackstone_pillar_classic-top")))
            .variant("blackstone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/blackstone/blackstone_pillar_classic_large-top")))
            .variant("blackstone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top")))
            .variant("blackstone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_dent-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-vertical_none")))
            .variant("blackstone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-vertical_none")))
            .variant("blackstone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-vertical_none")))
            .variant("blackstone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-vertical_none")))
            .variant("blackstone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top")))
            .variant("blackstone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_large_basic_triple-vertical_both")))
            .variant("blackstone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_ionic-vertical_both")))
            .variant("blackstone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_dent-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_meander-vertical_none")))
            .variant("blackstone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_meander-vertical_none")))
            .variant("blackstone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_meander-vertical_none")))
            .variant("blackstone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/blackstone/blackstone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/blackstone/blackstone_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/blackstone/blackstone_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/blackstone/blackstone_pillar_meander-vertical_none")))
            .variant("blackstone_plate", variant -> variant
                    .description("Plate"))
            .variant("blackstone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless")))
            .variant("blackstone_polished", variant -> variant
                    .description("Polished"))
            .variant("blackstone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("blackstone_prism", variant -> variant
                    .description("Prismatic"))
            .variant("blackstone_raw", variant -> variant
                    .description("Raw"))
            .variant("blackstone_road", variant -> variant
                    .description("Road"))
            .variant("blackstone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("blackstone_tiles", variant -> variant
                    .description("Tiles"))
            .variant("blackstone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/blackstone/blackstone_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/blackstone/blackstone_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/blackstone/blackstone_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/blackstone/blackstone_tiles_large-ctm_vertical")))
            .variant("blackstone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("blackstone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/blackstone/blackstone_twisted-top")))
            .variant("blackstone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("blackstone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("blackstone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("blackstone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("blackstone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_herringbone")))
            .variant("blackstone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("blackstone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_medallion")))
            .variant("blackstone_dots", variant -> variant
                    .description("Dots"))
            .variant("blackstone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dots")))
            .variant("blackstone_heart", variant -> variant
                    .description("Heart"))
            .variant("blackstone_star", variant -> variant
                    .description("Star"))
            .variant("blackstone_plating", variant -> variant
                    .description("Plating"))
            .variant("blackstone_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("blackstone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/blackstone/blackstone_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/blackstone/blackstone_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/blackstone/blackstone_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/blackstone/blackstone_lodestone_connected-ctm_vertical")))
            .variant("blackstone_plank", variant -> variant
                    .description("Plank"))
            .variant("blackstone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/blackstone/blackstone_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/blackstone/blackstone_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/blackstone/blackstone_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/blackstone/blackstone_plank_connected-ctm_vertical")))
            .variant("blackstone_frame", variant -> variant
                    .description("Frame"))
            .variant("blackstone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("blackstone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("blackstone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("blackstone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("blackstone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("blackstone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("blackstone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_stripes")))
            .variant("blackstone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("blackstone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("blackstone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("blackstone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("blackstone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("blackstone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("blackstone_facet", variant -> variant
                    .description("Facet"))
            .variant("blackstone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("blackstone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_facet_small")))
            .variant("blackstone_shiny", variant -> variant
                    .description("Shiny"))
            .variant("blackstone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/blackstone/blackstone_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/blackstone/blackstone_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/blackstone/blackstone_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/blackstone/blackstone_shiny_connected-ctm_vertical")))
            .variant("blackstone_gem", variant -> variant
                    .description("Gem"))
            .variant("blackstone_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("blackstone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/blackstone/blackstone_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/blackstone/blackstone_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/blackstone/blackstone_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/blackstone/blackstone_gem_1_connected-ctm_vertical")))
            .variant("blackstone_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("blackstone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/blackstone/blackstone_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/blackstone/blackstone_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/blackstone/blackstone_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/blackstone/blackstone_gem_2_connected-ctm_vertical")))
            .variant("blackstone_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("blackstone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/blackstone/blackstone_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/blackstone/blackstone_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/blackstone/blackstone_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/blackstone/blackstone_gem_3_connected-ctm_vertical")))
            .variant("blackstone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("blackstone_slab", variant -> variant
                    .description("Slab"))
            .variant("blackstone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("blackstone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_scaffold")))
            .variant("blackstone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("blackstone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("blackstone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("blackstone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/blackstone/blackstone_parquet"))));

    private BlackstoneFamily() {
    }
}
