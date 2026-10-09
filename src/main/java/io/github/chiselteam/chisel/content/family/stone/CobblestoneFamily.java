package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CobblestoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("cobblestone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))
                    .blockName("Cobblestone"))
            .existingBlock(Blocks.COBBLESTONE)
            .variant("cobblestone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("cobblestone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner")
                    .textureFromBase("ctm_horizontal")
                    .textureFromBase("ctm_vertical"))
            .variant("cobblestone_braid", variant -> variant
                    .description("Braid"))
            .variant("cobblestone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("cobblestone_encased", variant -> variant
                    .description("Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("cobblestone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("cobblestone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_right")
                    .textureFromBase("2x2_top_left")
                    .texture("2x2_top_right", Chisel.prefix("block/cobblestone/cobblestone_bricks_large-2x2_bottom_left")))
            .variant("cobblestone_small", variant -> variant
                    .description("Small Cobblestone Tiles"))
            .variant("cobblestone_soft", variant -> variant
                    .description("Cobblestone with Light Panel"))
            .variant("cobblestone_solid", variant -> variant
                    .description("Cobblestone with Dark Panel"))
            .variant("cobblestone_triple", variant -> variant
                    .description("Triple"))
            .variant("cobblestone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("cobblestone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("cobblestone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("cobblestone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("cobblestone_checker", variant -> variant
                    .description("Checker"))
            .variant("cobblestone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("cobblestone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("cobblestone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("cobblestone_dent", variant -> variant
                    .description("Cobblestone with Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_emboss", variant -> variant
                    .description("Emboss")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_french", variant -> variant
                    .description("French Cobblestone Tiles"))
            .variant("cobblestone_french_2", variant -> variant
                    .description("French Cobblestone Tiles"))
            .variant("cobblestone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("cobblestone_layers", variant -> variant
                    .description("Layers"))
            .variant("cobblestone_marker", variant -> variant
                    .description("Marker"))
            .variant("cobblestone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_layers_connected-ctm_corner"))
                    .textureFromBase("ctm_horizontal")
                    .textureAlias("ctm_vertical", "ctm_cornerless"))
            .variant("cobblestone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("cobblestone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("cobblestone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_meander_horizontal-bottom")))
            .variant("cobblestone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_meander_vertical-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_meander_vertical-side")))
            .variant("cobblestone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_ornate", variant -> variant
                    .description("Ornate"))
            // .variant("cobblestone_ornate_small", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Cobblestone").description("Small Ornate"))
            .variant("cobblestone_panel", variant -> variant
                    .description("Cobblestone with Panel"))
            .variant("cobblestone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/cobblestone/cobblestone_pillar-top")))
            .variant("cobblestone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-side")))
            .variant("cobblestone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_dent-side")))
            .variant("cobblestone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_plain-side")))
            .variant("cobblestone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_round-side")))
            .variant("cobblestone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_spiral-side")))
            .variant("cobblestone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_classic-bottom")))
            .variant("cobblestone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_classic_large-bottom")))
            .variant("cobblestone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_ionic-side")))
            .variant("cobblestone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_large_basic_triple-side")))
            .variant("cobblestone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_large_basic_triple-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_large_ionic_triple-side")))
            .variant("cobblestone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_ionic-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/cobblestone/cobblestone_pillar_meander-side")))
            .variant("cobblestone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_dent-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_plain-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_round-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/cobblestone/cobblestone_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/cobblestone/cobblestone_pillar_basic_spiral-vertical_both"))
                    .textureAlias("vertical_none", "side"))
            .variant("cobblestone_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/cobblestone/cobblestone_plate_connected")))
            .variant("cobblestone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_border_square-ctm_cornerless")))
            .variant("cobblestone_polished", variant -> variant
                    .description("Polished"))
            .variant("cobblestone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_prism", variant -> variant
                    .description("Prism"))
            .variant("cobblestone_raw", variant -> variant
                    .description("Raw"))
            .variant("cobblestone_road", variant -> variant
                    .description("Road"))
            .variant("cobblestone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("cobblestone_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("cobblestone_tiles_large", variant -> variant
                    .description("Large Cobblestone Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("cobblestone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/cobblestone/cobblestone_twisted-top")))
            .variant("cobblestone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4)
                    .textureFromBase("ar_variant_1")
                    .texture("v4_top_right", Chisel.prefix("block/cobblestone/cobblestone_zag-v4_bottom_left")))
            .variant("cobblestone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("cobblestone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_herringbone")))
            .variant("cobblestone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("cobblestone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_medallion")))
            .variant("cobblestone_dots", variant -> variant
                    .description("Dots"))
            .variant("cobblestone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_dots")))
            .variant("cobblestone_heart", variant -> variant
                    .description("Heart"))
            .variant("cobblestone_star", variant -> variant
                    .description("Star"))
            .variant("cobblestone_plating", variant -> variant
                    .description("Plating"))
            .variant("cobblestone_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/cobblestone/cobblestone_lodestone_connected")))
            .variant("cobblestone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("cobblestone_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/cobblestone/cobblestone_plank_connected")))
            .variant("cobblestone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_frame", variant -> variant
                    .description("Frame"))
            .variant("cobblestone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("cobblestone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("cobblestone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("cobblestone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("cobblestone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("cobblestone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("cobblestone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_stripes")))
            .variant("cobblestone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("cobblestone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("cobblestone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("cobblestone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("cobblestone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("cobblestone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("cobblestone_facet", variant -> variant
                    .description("Facet"))
            .variant("cobblestone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("cobblestone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_facet_small")))
            .variant("cobblestone_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/cobblestone/cobblestone_shiny_connected")))
            .variant("cobblestone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_gem", variant -> variant
                    .description("Gem"))
            .variant("cobblestone_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/cobblestone/cobblestone_gem_1_connected")))
            .variant("cobblestone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_border_square-ctm_cornerless")))
            .variant("cobblestone_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/cobblestone/cobblestone_gem_2_connected")))
            .variant("cobblestone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_border_square-ctm_cornerless")))
            .variant("cobblestone_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/cobblestone/cobblestone_gem_3_connected")))
            .variant("cobblestone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("cobblestone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("cobblestone_slab", variant -> variant
                    .description("Slab"))
            .variant("cobblestone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("cobblestone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_scaffold")))
            .variant("cobblestone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("cobblestone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("cobblestone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("cobblestone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/cobblestone/cobblestone_parquet"))));

    private CobblestoneFamily() {
    }
}
