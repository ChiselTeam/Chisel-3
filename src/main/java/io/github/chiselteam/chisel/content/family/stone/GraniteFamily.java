package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GraniteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("granite", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE))
                    .blockName("Granite"))
            .existingBlock(Blocks.GRANITE)
            .existingBlock(Blocks.POLISHED_GRANITE)
            .variant("granite_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("granite_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_raw")))
            .variant("granite_braid", variant -> variant
                    .description("Braid"))
            .variant("granite_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("granite_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("granite_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("granite_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("granite_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("granite_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("granite_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("granite_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("granite_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("granite_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("granite_chaotic_medium", variant -> variant
                    .description("Granite Bricks"))
            .variant("granite_chaotic_small", variant -> variant
                    .description("Granite Small Tiles"))
            .variant("granite_checker", variant -> variant
                    .description("Checker"))
            .variant("granite_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("granite_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_dent-ctm_cornerless")))
            // .variant("granite_cobble", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Granite").description("Cobble"))
            .variant("granite_cracked", variant -> variant
                    .description("Cracked"))
            .variant("granite_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("granite_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_french_1", variant -> variant
                    .description("French 1"))
            .variant("granite_french_2", variant -> variant
                    .description("French 2"))
            .variant("granite_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_raw")))
            .variant("granite_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("granite_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/granite/granite_layers_connected")))
            .variant("granite_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("granite_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("granite_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/granite/granite_meander_horizontal-bottom")))
            .variant("granite_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_meander_vertical-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_meander_vertical-bottom")))
            .variant("granite_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_raw")))
            .variant("granite_ornate", variant -> variant
                    .description("Ornate Granite"))
            // .variant("granite_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Granite").description("Small Ornate"))
            .variant("granite_panel", variant -> variant
                    .description("Panel"))
            .variant("granite_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/granite/granite_pillar-top")))
            .variant("granite_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_basic-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom")))
            .variant("granite_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_basic_dent-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom")))
            .variant("granite_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_basic_plain-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom")))
            .variant("granite_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_basic_round-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom")))
            .variant("granite_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_basic_spiral-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom")))
            .variant("granite_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_classic-bottom")))
            .variant("granite_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_classic_large-bottom")))
            .variant("granite_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_ionic-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom")))
            .variant("granite_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_large_basic_triple-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom")))
            .variant("granite_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_large_ionic_triple-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_large_basic_triple-vertical_both")))
            .variant("granite_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/granite/granite_pillar_meander-side"))
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_ionic-vertical_both")))
            .variant("granite_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/granite/granite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/granite/granite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/granite/granite_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("granite_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/granite/granite_plate_connected")))
            .variant("granite_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_raw")))
            .variant("granite_polished", variant -> variant
                    .description("Polished"))
            .variant("granite_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_prism", variant -> variant
                    .description("Prismatic Granite"))
            .variant("granite_raw", variant -> variant
                    .description("Raw"))
            .variant("granite_road", variant -> variant
                    .description("Road"))
            .variant("granite_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/granite/granite_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("granite_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("granite_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_raw")))
            .variant("granite_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("granite_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/granite/granite_twisted-top")))
            .variant("granite_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_weaver-ctm_corner")))
            .variant("granite_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("ar_variant_1"))
            .variant("granite_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("granite_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_medallion", variant -> variant
                    .description("Medallion"))
            .variant("granite_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_dots", variant -> variant
                    .description("Dots"))
            .variant("granite_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_heart", variant -> variant
                    .description("Heart"))
            .variant("granite_star", variant -> variant
                    .description("Star"))
            .variant("granite_plating", variant -> variant
                    .description("Plating"))
            .variant("granite_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/granite/granite_lodestone_connected")))
            .variant("granite_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/granite/granite_plank_connected")))
            .variant("granite_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_frame", variant -> variant
                    .description("Frame"))
            .variant("granite_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("granite_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("granite_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("granite_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("granite_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("granite_stripes", variant -> variant
                    .description("Stripes"))
            .variant("granite_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("granite_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("granite_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("granite_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("granite_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("granite_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("granite_facet", variant -> variant
                    .description("Facet"))
            .variant("granite_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("granite_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/granite/granite_shiny_connected")))
            .variant("granite_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_gem", variant -> variant
                    .description("Gem"))
            .variant("granite_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/granite/granite_gem_1_connected")))
            .variant("granite_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_raw")))
            .variant("granite_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/granite/granite_gem_2_connected")))
            .variant("granite_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/granite/granite_raw")))
            .variant("granite_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/granite/granite_gem_3_connected")))
            .variant("granite_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("granite_slab", variant -> variant
                    .description("Slab"))
            .variant("granite_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("granite_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("granite_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("granite_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("granite_parquet", variant -> variant
                    .description("Parquet"))
            .variant("granite_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)));

    private GraniteFamily() {
    }
}
