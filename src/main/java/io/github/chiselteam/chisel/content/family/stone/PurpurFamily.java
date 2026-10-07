package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PurpurFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("purpur", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Purpur"))
            .existingBlock(Blocks.PURPUR_BLOCK)
            .existingBlock(Blocks.PURPUR_PILLAR)
            .variant("purpur_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("purpur_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_braid", variant -> variant
                    .description("Braid"))
            .variant("purpur_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("purpur_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("purpur_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("purpur_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("purpur_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("purpur_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("purpur_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("purpur_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("purpur_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("purpur_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("purpur_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("purpur_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("purpur_checker", variant -> variant
                    .description("Checker"))
            .variant("purpur_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("purpur_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_dent-ctm_cornerless")))
            .variant("purpur_cobble", variant -> variant
                    .description("Cobble"))
            .variant("purpur_cracked", variant -> variant
                    .description("Cracked"))
            .variant("purpur_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("purpur_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_french_1", variant -> variant
                    .description("French 1"))
            .variant("purpur_french_2", variant -> variant
                    .description("French 2"))
            .variant("purpur_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_border_square-ctm_cornerless")))
            .variant("purpur_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("purpur_layers", variant -> variant
                    .description("Layers"))
            .variant("purpur_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("purpur_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("purpur_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/purpur/purpur_meander_horizontal-bottom")))
            .variant("purpur_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/purpur/purpur_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_meander_vertical-side")))
            .variant("purpur_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_ornate", variant -> variant
                    .description("Ornate Purpur"))
            //.variant("purpur_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Purpur").description("Small Ornate"))
            .variant("purpur_panel", variant -> variant
                    .description("Panel"))
            .variant("purpur_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/purpur/purpur_pillar-top")))
            .variant("purpur_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_basic-side")))
            .variant("purpur_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_basic_dent-side")))
            .variant("purpur_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_basic_plain-side")))
            .variant("purpur_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_basic_round-side")))
            .variant("purpur_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_basic_spiral-side")))
            .variant("purpur_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_classic-bottom")))
            .variant("purpur_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_classic_large-bottom")))
            .variant("purpur_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_ionic-side")))
            .variant("purpur_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_large_basic_triple-side")))
            .variant("purpur_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_large_ionic_triple-side")))
            .variant("purpur_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/purpur/purpur_pillar_meander-side")))
            .variant("purpur_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/purpur/purpur_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/purpur/purpur_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/purpur/purpur_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("purpur_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/purpur/purpur_plate_connected")))
            .variant("purpur_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_border_square-ctm_cornerless")))
            .variant("purpur_polished", variant -> variant
                    .description("Polished"))
            .variant("purpur_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_prism", variant -> variant
                    .description("Prismatic Purpur"))
            .variant("purpur_raw", variant -> variant
                    .description("Raw")
                    .texture(Chisel.prefix("block/purpur/purpur_mosaic-ctm_cornerless")))
            .variant("purpur_road", variant -> variant
                    .description("Road"))
            .variant("purpur_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/purpur/purpur_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("purpur_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("purpur_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_mosaic-ctm_cornerless")))
            .variant("purpur_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("purpur_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/purpur/purpur_twisted-top")))
            .variant("purpur_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_weaver-ctm_corner")))
            .variant("purpur_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("ar_variant_1"))
            .variant("purpur_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("purpur_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_herringbone")))
            .variant("purpur_medallion", variant -> variant
                    .description("Medallion"))
            .variant("purpur_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_medallion")))
            .variant("purpur_dots", variant -> variant
                    .description("Dots"))
            .variant("purpur_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_dots")))
            .variant("purpur_heart", variant -> variant
                    .description("Heart"))
            .variant("purpur_star", variant -> variant
                    .description("Star"))
            .variant("purpur_plating", variant -> variant
                    .description("Plating"))
            .variant("purpur_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/purpur/purpur_lodestone_connected")))
            .variant("purpur_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("purpur_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/purpur/purpur_plank_connected")))
            .variant("purpur_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_frame", variant -> variant
                    .description("Frame"))
            .variant("purpur_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("purpur_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("purpur_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("purpur_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("purpur_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("purpur_stripes", variant -> variant
                    .description("Stripes"))
            .variant("purpur_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_stripes")))
            .variant("purpur_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("purpur_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("purpur_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("purpur_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("purpur_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("purpur_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("purpur_facet", variant -> variant
                    .description("Facet"))
            .variant("purpur_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("purpur_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_facet_small")))
            .variant("purpur_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/purpur/purpur_shiny_connected")))
            .variant("purpur_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_gem", variant -> variant
                    .description("Gem"))
            .variant("purpur_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/purpur/purpur_gem_1_connected")))
            .variant("purpur_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_border_square-ctm_cornerless")))
            .variant("purpur_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/purpur/purpur_gem_2_connected")))
            .variant("purpur_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_border_square-ctm_cornerless")))
            .variant("purpur_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/purpur/purpur_gem_3_connected")))
            .variant("purpur_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("purpur_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("purpur_slab", variant -> variant
                    .description("Slab"))
            .variant("purpur_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("purpur_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_scaffold")))
            .variant("purpur_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("purpur_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("purpur_parquet", variant -> variant
                    .description("Parquet"))
            .variant("purpur_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/purpur/purpur_parquet"))));

    private PurpurFamily() {
    }
}
