package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class NetheriteFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("netherite", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK))
                    .blockName("Block of Netherite"))
            .existingBlock(Blocks.NETHERITE_BLOCK)
            .variant("netherite_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("netherite_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_braid", variant -> variant
                    .description("Braid"))
            .variant("netherite_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("netherite_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("netherite_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("netherite_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("netherite_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("netherite_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("netherite_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("netherite_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("netherite_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("netherite_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("netherite_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("netherite_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("netherite_checker", variant -> variant
                    .description("Checker"))
            .variant("netherite_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("netherite_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_cracked", variant -> variant
                    .description("Cracked"))
            .variant("netherite_cobble", variant -> variant
                    .description("Cobble"))
            .variant("netherite_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("netherite_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_french_1", variant -> variant
                    .description("French 1"))
            .variant("netherite_french_2", variant -> variant
                    .description("French 2"))
            .variant("netherite_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("netherite_layers", variant -> variant
                    .description("Layers")
                    .texture(Chisel.prefix("block/netherite/netherite_layers_connected")))
            .variant("netherite_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("netherite_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("netherite_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH)
                    .texture("top", Chisel.prefix("block/netherite/netherite_meander_horizontal-bottom")))
            .variant("netherite_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/netherite/netherite_meander_vertical-bottom")))
            .variant("netherite_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("netherite_panel", variant -> variant
                    .description("Panel"))
            .variant("netherite_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar-bottom")))
            .variant("netherite_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom")))
            .variant("netherite_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom")))
            .variant("netherite_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom")))
            .variant("netherite_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom")))
            .variant("netherite_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom")))
            .variant("netherite_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_classic-bottom")))
            .variant("netherite_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_classic_large-bottom")))
            .variant("netherite_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom")))
            .variant("netherite_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_dent-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_ionic-vertical_none")))
            .variant("netherite_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_ionic-vertical_none")))
            .variant("netherite_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_ionic-vertical_none")))
            .variant("netherite_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_ionic-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_ionic-vertical_none")))
            .variant("netherite_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom")))
            .variant("netherite_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_large_basic_triple-vertical_both")))
            .variant("netherite_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_ionic-vertical_both")))
            .variant("netherite_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_dent-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_meander-vertical_none")))
            .variant("netherite_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_plain-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_meander-vertical_none")))
            .variant("netherite_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_round-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_meander-vertical_none")))
            .variant("netherite_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("side", Chisel.prefix("block/netherite/netherite_pillar_meander-side"))
                    .texture("top", Chisel.prefix("block/netherite/netherite_pillar_basic-bottom"))
                    .texture("vertical_both", Chisel.prefix("block/netherite/netherite_pillar_basic_spiral-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/netherite/netherite_pillar_meander-vertical_none")))
            .variant("netherite_plate", variant -> variant
                    .description("Plate")
                    .texture(Chisel.prefix("block/netherite/netherite_plate_connected")))
            .variant("netherite_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_polished", variant -> variant
                    .description("Polished")
                    .texture(Chisel.prefix("block/netherite/netherite_tiles_large")))
            .variant("netherite_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_prism", variant -> variant
                    .description("Prismatic"))
            .variant("netherite_raw", variant -> variant
                    .description("Raw"))
            .variant("netherite_road", variant -> variant
                    .description("Road"))
            .variant("netherite_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("netherite_tiles", variant -> variant
                    .description("Tiles"))
            .variant("netherite_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("netherite_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/netherite/netherite_twisted-bottom")))
            .variant("netherite_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("netherite_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("netherite_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_medallion", variant -> variant
                    .description("Medallion"))
            .variant("netherite_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_dots", variant -> variant
                    .description("Dots"))
            .variant("netherite_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_heart", variant -> variant
                    .description("Heart"))
            .variant("netherite_star", variant -> variant
                    .description("Star"))
            .variant("netherite_plating", variant -> variant
                    .description("Plating"))
            .variant("netherite_lodestone", variant -> variant
                    .description("Lodestone")
                    .texture(Chisel.prefix("block/netherite/netherite_lodestone_connected")))
            .variant("netherite_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_plank", variant -> variant
                    .description("Plank")
                    .texture(Chisel.prefix("block/netherite/netherite_plank_connected")))
            .variant("netherite_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_frame", variant -> variant
                    .description("Frame"))
            .variant("netherite_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("netherite_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("netherite_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("netherite_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("netherite_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("netherite_stripes", variant -> variant
                    .description("Stripes"))
            .variant("netherite_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("netherite_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("netherite_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("netherite_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("netherite_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("netherite_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("netherite_facet", variant -> variant
                    .description("Facet"))
            .variant("netherite_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("netherite_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_shiny", variant -> variant
                    .description("Shiny")
                    .texture(Chisel.prefix("block/netherite/netherite_shiny_connected")))
            .variant("netherite_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_gem", variant -> variant
                    .description("Gem"))
            .variant("netherite_gem_1", variant -> variant
                    .description("Gem 1")
                    .texture(Chisel.prefix("block/netherite/netherite_gem_1_connected")))
            .variant("netherite_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_gem_2", variant -> variant
                    .description("Gem 2")
                    .texture(Chisel.prefix("block/netherite/netherite_gem_2_connected")))
            .variant("netherite_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/netherite/netherite_border_square-ctm_cornerless")))
            .variant("netherite_gem_3", variant -> variant
                    .description("Gem 3")
                    .texture(Chisel.prefix("block/netherite/netherite_gem_3_connected")))
            .variant("netherite_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("netherite_slab", variant -> variant
                    .description("Slab"))
            .variant("netherite_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("netherite_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("netherite_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("netherite_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("netherite_parquet", variant -> variant
                    .description("Parquet"))
            .variant("netherite_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED)));

    private NetheriteFamily() {
    }
}
