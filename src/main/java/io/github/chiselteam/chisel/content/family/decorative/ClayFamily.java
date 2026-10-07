package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class ClayFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("clay", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY))
                    .blockName("Clay"))
            .existingBlock(Blocks.CLAY)
            .variant("woolen_clay_0", variant -> variant
                    .blockName("Woolen Clay")
                    .description("White Woolen Clay"))
            .variant("woolen_clay_1", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Orange Woolen Clay"))
            .variant("woolen_clay_2", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Magenta Woolen Clay"))
            .variant("woolen_clay_3", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Light Blue Woolen Clay"))
            .variant("woolen_clay_4", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Yellow Woolen Clay"))
            .variant("woolen_clay_5", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Lime Woolen Clay"))
            .variant("woolen_clay_6", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Pink Woolen Clay"))
            .variant("woolen_clay_7", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Grey Woolen Clay"))
            .variant("woolen_clay_8", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Light Grey Woolen Clay"))
            .variant("woolen_clay_9", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Cyan Woolen Clay"))
            .variant("woolen_clay_10", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Purple Woolen Clay"))
            .variant("woolen_clay_11", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Blue Woolen Clay"))
            .variant("woolen_clay_12", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Brown Woolen Clay"))
            .variant("woolen_clay_13", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Green Woolen Clay"))
            .variant("woolen_clay_14", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Red Woolen Clay"))
            .variant("woolen_clay_15", variant -> variant
                    .blockName("Woolen Clay")
                    .description("Black Woolen Clay"))
            .variant("clay_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("clay_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_border_square_small", variant -> variant
                    .description("Small Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_braid", variant -> variant
                    .description("Braid"))
            .variant("clay_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("clay_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("clay_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("clay_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("clay_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("clay_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("clay_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("clay_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("clay_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("clay_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("clay_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("clay_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("clay_checker", variant -> variant
                    .description("Checker"))
            .variant("clay_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("clay_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_cracked", variant -> variant
                    .description("Cracked"))
            .variant("clay_cobble", variant -> variant
                    .description("Cobble"))
            .variant("clay_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("clay_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_french_1", variant -> variant
                    .description("French 1"))
            .variant("clay_french_2", variant -> variant
                    .description("French 2"))
            .variant("clay_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("clay_layers", variant -> variant
                    .description("Layers"))
            .variant("clay_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("clay_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("clay_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("clay_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_meander_vertical-side")))
            .variant("clay_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("clay_panel", variant -> variant
                    .description("Panel"))
            .variant("clay_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("clay_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_basic-side")))
            .variant("clay_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_basic_dent-side")))
            .variant("clay_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_basic_plain-side")))
            .variant("clay_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_basic_round-side")))
            .variant("clay_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_basic_spiral-side")))
            .variant("clay_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("clay_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("clay_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_ionic-side")))
            .variant("clay_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_ionic_dent-side")))
            .variant("clay_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_ionic_plain-side")))
            .variant("clay_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_ionic_round-side")))
            .variant("clay_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_ionic_spiral-side")))
            .variant("clay_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_large_basic_triple-side")))
            .variant("clay_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_large_ionic_triple-side")))
            .variant("clay_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_meander-side")))
            .variant("clay_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_meander_dent-side")))
            .variant("clay_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_meander_plain-side")))
            .variant("clay_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_meander_round-side")))
            .variant("clay_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/clay/clay_pillar_meander_spiral-side")))
            .variant("clay_plate", variant -> variant
                    .description("Plate"))
            .variant("clay_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_polished", variant -> variant
                    .description("Polished"))
            .variant("clay_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_prism", variant -> variant
                    .description("Prismatic"))
            .variant("clay_raw", variant -> variant
                    .description("Raw"))
            .variant("clay_road", variant -> variant
                    .description("Road"))
            .variant("clay_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("clay_tiles", variant -> variant
                    .description("Tiles"))
            .variant("clay_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("clay_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("clay_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("clay_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("clay_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_medallion", variant -> variant
                    .description("Medallion"))
            .variant("clay_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_dots", variant -> variant
                    .description("Dots"))
            .variant("clay_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_heart", variant -> variant
                    .description("Heart"))
            .variant("clay_star", variant -> variant
                    .description("Star"))
            .variant("clay_plating", variant -> variant
                    .description("Plating"))
            .variant("clay_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("clay_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_plank", variant -> variant
                    .description("Plank"))
            .variant("clay_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_frame", variant -> variant
                    .description("Frame"))
            .variant("clay_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("clay_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("clay_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("clay_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("clay_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("clay_stripes", variant -> variant
                    .description("Stripes"))
            .variant("clay_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("clay_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("clay_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("clay_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("clay_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("clay_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("clay_facet", variant -> variant
                    .description("Facet"))
            .variant("clay_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("clay_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_shiny", variant -> variant
                    .description("Shiny"))
            .variant("clay_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_gem", variant -> variant
                    .description("Gem"))
            .variant("clay_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("clay_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("clay_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("clay_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("clay_slab", variant -> variant
                    .description("Slab"))
            .variant("clay_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("clay_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("clay_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("clay_parquet", variant -> variant
                    .description("Parquet"))
            .variant("clay_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("clay_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("clay_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private ClayFamily() {
    }
}
