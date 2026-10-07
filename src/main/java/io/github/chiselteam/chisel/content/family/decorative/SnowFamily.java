package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SnowFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("snow", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK))
                    .blockName("Snow Block"))
            .existingBlock(Blocks.SNOW_BLOCK)
            .variant("snow_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("snow_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_braid", variant -> variant
                    .description("Braid"))
            .variant("snow_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("snow_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("snow_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("snow_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("snow_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("snow_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("snow_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("snow_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("snow_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("snow_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("snow_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("snow_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("snow_checker", variant -> variant
                    .description("Checker"))
            .variant("snow_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("snow_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_cracked", variant -> variant
                    .description("Cracked"))
            .variant("snow_cobble", variant -> variant
                    .description("Cobble"))
            .variant("snow_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("snow_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_french_1", variant -> variant
                    .description("French 1"))
            .variant("snow_french_2", variant -> variant
                    .description("French 2"))
            .variant("snow_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("snow_layers", variant -> variant
                    .description("Layers"))
            .variant("snow_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("snow_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("snow_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("snow_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_meander_vertical-side")))
            .variant("snow_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("snow_panel", variant -> variant
                    .description("Panel"))
            .variant("snow_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("snow_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_basic-side")))
            .variant("snow_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_basic_dent-side")))
            .variant("snow_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_basic_plain-side")))
            .variant("snow_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_basic_round-side")))
            .variant("snow_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_basic_spiral-side")))
            .variant("snow_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("snow_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("snow_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_ionic-side")))
            .variant("snow_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_ionic_dent-side")))
            .variant("snow_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_ionic_plain-side")))
            .variant("snow_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_ionic_round-side")))
            .variant("snow_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_ionic_spiral-side")))
            .variant("snow_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_large_basic_triple-side")))
            .variant("snow_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_large_ionic_triple-side")))
            .variant("snow_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_meander-side")))
            .variant("snow_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_meander_dent-side")))
            .variant("snow_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_meander_plain-side")))
            .variant("snow_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_meander_round-side")))
            .variant("snow_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/snow/snow_pillar_meander_spiral-side")))
            .variant("snow_plate", variant -> variant
                    .description("Plate"))
            .variant("snow_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_polished", variant -> variant
                    .description("Polished"))
            .variant("snow_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_prism", variant -> variant
                    .description("Prismatic"))
            .variant("snow_raw", variant -> variant
                    .description("Raw"))
            .variant("snow_road", variant -> variant
                    .description("Road"))
            .variant("snow_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("snow_tiles", variant -> variant
                    .description("Tiles"))
            .variant("snow_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("snow_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("snow_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("snow_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("snow_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_medallion", variant -> variant
                    .description("Medallion"))
            .variant("snow_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_dots", variant -> variant
                    .description("Dots"))
            .variant("snow_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_heart", variant -> variant
                    .description("Heart"))
            .variant("snow_star", variant -> variant
                    .description("Star"))
            .variant("snow_plating", variant -> variant
                    .description("Plating"))
            .variant("snow_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("snow_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_plank", variant -> variant
                    .description("Plank"))
            .variant("snow_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_frame", variant -> variant
                    .description("Frame"))
            .variant("snow_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("snow_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("snow_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("snow_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("snow_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("snow_stripes", variant -> variant
                    .description("Stripes"))
            .variant("snow_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("snow_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("snow_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("snow_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("snow_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("snow_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("snow_facet", variant -> variant
                    .description("Facet"))
            .variant("snow_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("snow_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_shiny", variant -> variant
                    .description("Shiny"))
            .variant("snow_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_gem", variant -> variant
                    .description("Gem"))
            .variant("snow_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("snow_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("snow_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("snow_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("snow_slab", variant -> variant
                    .description("Slab"))
            .variant("snow_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("snow_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("snow_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("snow_parquet", variant -> variant
                    .description("Parquet"))
            .variant("snow_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("snow_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("snow_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private SnowFamily() {
    }
}
