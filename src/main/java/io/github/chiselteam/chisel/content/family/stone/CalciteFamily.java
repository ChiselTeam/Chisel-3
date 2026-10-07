package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CalciteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("calcite", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE))
                    .blockName("Calcite"))
            .existingBlock(Blocks.CALCITE)
            .variant("calcite_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("calcite_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless")))
            .variant("calcite_braid", variant -> variant
                    .description("Braid"))
            .variant("calcite_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("calcite_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("calcite_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("calcite_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("calcite_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("calcite_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("calcite_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("calcite_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("calcite_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("calcite_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("calcite_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("calcite_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("calcite_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("calcite_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("calcite_checker", variant -> variant
                    .description("Checker"))
            .variant("calcite_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("calcite_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless")))
            .variant("calcite_cobble", variant -> variant
                    .description("Cobble"))
            .variant("calcite_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("calcite_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("calcite_french_1", variant -> variant
                    .description("French 1"))
            .variant("calcite_french_2", variant -> variant
                    .description("French 2"))
            .variant("calcite_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless")))
            .variant("calcite_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("calcite_layers", variant -> variant
                    .description("Layers"))
            .variant("calcite_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("calcite_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("calcite_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("calcite_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("bottom", Chisel.prefix("block/calcite/calcite_meander_horizontal-top")))
            .variant("calcite_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/calcite/calcite_meander_vertical-top"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_meander_vertical-side")))
            .variant("calcite_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless")))
            .variant("calcite_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("calcite_panel", variant -> variant
                    .description("Panel"))
            .variant("calcite_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/calcite/calcite_pillar-top")))
            .variant("calcite_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_basic-side")))
            .variant("calcite_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_basic_dent-side")))
            .variant("calcite_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_basic_plain-side")))
            .variant("calcite_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_basic_round-side")))
            .variant("calcite_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_basic_spiral-side")))
            .variant("calcite_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/calcite/calcite_pillar_classic-top")))
            .variant("calcite_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/calcite/calcite_pillar_classic_large-top")))
            .variant("calcite_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_ionic-side")))
            .variant("calcite_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top")))
            .variant("calcite_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_large_ionic_triple-side")))
            .variant("calcite_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/calcite/calcite_pillar_meander-side")))
            .variant("calcite_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/calcite/calcite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/calcite/calcite_pillar_basic-top"))
                    .texture("vertical_both", Chisel.prefix("block/calcite/calcite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("calcite_plate", variant -> variant
                    .description("Plate"))
            .variant("calcite_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless")))
            .variant("calcite_polished", variant -> variant
                    .description("Polished"))
            .variant("calcite_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("calcite_prism", variant -> variant
                    .description("Prismatic"))
            .variant("calcite_raw", variant -> variant
                    .description("Raw"))
            .variant("calcite_road", variant -> variant
                    .description("Road"))
            .variant("calcite_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("calcite_tiles", variant -> variant
                    .description("Tiles"))
            .variant("calcite_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/calcite/calcite_polished"))
                    .texture("ctm_corner", Chisel.prefix("block/calcite/calcite_tiles_large-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/calcite/calcite_tiles_large-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/calcite/calcite_tiles_large-ctm_vertical")))
            .variant("calcite_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("calcite_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/calcite/calcite_twisted-top")))
            .variant("calcite_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("calcite_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("calcite_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("calcite_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("calcite_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_herringbone")))
            .variant("calcite_medallion", variant -> variant
                    .description("Medallion"))
            .variant("calcite_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_medallion")))
            .variant("calcite_dots", variant -> variant
                    .description("Dots"))
            .variant("calcite_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dots")))
            .variant("calcite_heart", variant -> variant
                    .description("Heart"))
            .variant("calcite_star", variant -> variant
                    .description("Star"))
            .variant("calcite_plating", variant -> variant
                    .description("Plating"))
            .variant("calcite_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("calcite_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/calcite/calcite_lodestone"))
                    .texture("ctm_corner", Chisel.prefix("block/calcite/calcite_lodestone_connected-ctm_corner"))
                    .textureFromBase("ctm_cornerless")
                    .texture("ctm_horizontal", Chisel.prefix("block/calcite/calcite_lodestone_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/calcite/calcite_lodestone_connected-ctm_vertical")))
            .variant("calcite_plank", variant -> variant
                    .description("Plank"))
            .variant("calcite_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/calcite/calcite_plank"))
                    .texture("ctm_corner", Chisel.prefix("block/calcite/calcite_plank_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_plank_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/calcite/calcite_plank_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/calcite/calcite_plank_connected-ctm_vertical")))
            .variant("calcite_frame", variant -> variant
                    .description("Frame"))
            .variant("calcite_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("calcite_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("calcite_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("calcite_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("calcite_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("calcite_stripes", variant -> variant
                    .description("Stripes"))
            .variant("calcite_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_stripes")))
            .variant("calcite_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("calcite_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("calcite_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("calcite_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("calcite_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("calcite_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("calcite_facet", variant -> variant
                    .description("Facet"))
            .variant("calcite_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("calcite_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_facet_small")))
            .variant("calcite_shiny", variant -> variant
                    .description("Shiny"))
            .variant("calcite_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/calcite/calcite_shiny"))
                    .texture("ctm_corner", Chisel.prefix("block/calcite/calcite_shiny_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_shiny_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/calcite/calcite_shiny_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/calcite/calcite_shiny_connected-ctm_vertical")))
            .variant("calcite_gem", variant -> variant
                    .description("Gem"))
            .variant("calcite_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("calcite_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/calcite/calcite_gem_1"))
                    .texture("ctm_corner", Chisel.prefix("block/calcite/calcite_gem_1_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/calcite/calcite_gem_1_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/calcite/calcite_gem_1_connected-ctm_vertical")))
            .variant("calcite_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("calcite_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/calcite/calcite_gem_2"))
                    .texture("ctm_corner", Chisel.prefix("block/calcite/calcite_gem_2_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_dent-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/calcite/calcite_gem_2_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/calcite/calcite_gem_2_connected-ctm_vertical")))
            .variant("calcite_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("calcite_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/calcite/calcite_gem_3"))
                    .texture("ctm_corner", Chisel.prefix("block/calcite/calcite_gem_3_connected-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_gem_3_connected-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/calcite/calcite_gem_3_connected-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/calcite/calcite_gem_3_connected-ctm_vertical")))
            .variant("calcite_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("calcite_slab", variant -> variant
                    .description("Slab"))
            .variant("calcite_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("calcite_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_scaffold")))
            .variant("calcite_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("calcite_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("calcite_parquet", variant -> variant
                    .description("Parquet"))
            .variant("calcite_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/calcite/calcite_parquet"))));

    private CalciteFamily() {
    }
}
