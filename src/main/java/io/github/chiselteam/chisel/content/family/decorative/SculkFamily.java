package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SculkFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("sculk", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SCULK))
                    .blockName("Sculk"))
            .existingBlock(Blocks.SCULK)
            .variant("sculk_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sculk_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_braid", variant -> variant
                    .description("Braid"))
            .variant("sculk_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("sculk_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("sculk_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("sculk_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sculk_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("sculk_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("sculk_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("sculk_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("sculk_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("sculk_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("sculk_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("sculk_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("sculk_checker", variant -> variant
                    .description("Checker"))
            .variant("sculk_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("sculk_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_cracked", variant -> variant
                    .description("Cracked"))
            .variant("sculk_cobble", variant -> variant
                    .description("Cobble"))
            .variant("sculk_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("sculk_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_french_1", variant -> variant
                    .description("French 1"))
            .variant("sculk_french_2", variant -> variant
                    .description("French 2"))
            .variant("sculk_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sculk_layers", variant -> variant
                    .description("Layers"))
            .variant("sculk_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("sculk_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("sculk_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("sculk_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_meander_vertical-side")))
            .variant("sculk_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("sculk_panel", variant -> variant
                    .description("Panel"))
            .variant("sculk_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("sculk_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_basic-side")))
            .variant("sculk_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_basic_dent-side")))
            .variant("sculk_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_basic_plain-side")))
            .variant("sculk_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_basic_round-side")))
            .variant("sculk_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_basic_spiral-side")))
            .variant("sculk_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("sculk_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("sculk_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_ionic-side")))
            .variant("sculk_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_ionic_dent-side")))
            .variant("sculk_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_ionic_plain-side")))
            .variant("sculk_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_ionic_round-side")))
            .variant("sculk_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_ionic_spiral-side")))
            .variant("sculk_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_large_basic_triple-side")))
            .variant("sculk_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_large_ionic_triple-side")))
            .variant("sculk_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_meander-side")))
            .variant("sculk_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_meander_dent-side")))
            .variant("sculk_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_meander_plain-side")))
            .variant("sculk_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_meander_round-side")))
            .variant("sculk_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/sculk/sculk_pillar_meander_spiral-side")))
            .variant("sculk_plate", variant -> variant
                    .description("Plate"))
            .variant("sculk_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_polished", variant -> variant
                    .description("Polished"))
            .variant("sculk_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_prism", variant -> variant
                    .description("Prismatic"))
            .variant("sculk_raw", variant -> variant
                    .description("Raw"))
            .variant("sculk_road", variant -> variant
                    .description("Road"))
            .variant("sculk_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sculk_tiles", variant -> variant
                    .description("Tiles"))
            .variant("sculk_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("sculk_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("sculk_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("sculk_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("sculk_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_medallion", variant -> variant
                    .description("Medallion"))
            .variant("sculk_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_dots", variant -> variant
                    .description("Dots"))
            .variant("sculk_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_heart", variant -> variant
                    .description("Heart"))
            .variant("sculk_star", variant -> variant
                    .description("Star"))
            .variant("sculk_plating", variant -> variant
                    .description("Plating"))
            .variant("sculk_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("sculk_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_plank", variant -> variant
                    .description("Plank"))
            .variant("sculk_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_frame", variant -> variant
                    .description("Frame"))
            .variant("sculk_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("sculk_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("sculk_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("sculk_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("sculk_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("sculk_stripes", variant -> variant
                    .description("Stripes"))
            .variant("sculk_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("sculk_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("sculk_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("sculk_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("sculk_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("sculk_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("sculk_facet", variant -> variant
                    .description("Facet"))
            .variant("sculk_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("sculk_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_shiny", variant -> variant
                    .description("Shiny"))
            .variant("sculk_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_gem", variant -> variant
                    .description("Gem"))
            .variant("sculk_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("sculk_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("sculk_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("sculk_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("sculk_slab", variant -> variant
                    .description("Slab"))
            .variant("sculk_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("sculk_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("sculk_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sculk_parquet", variant -> variant
                    .description("Parquet"))
            .variant("sculk_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("sculk_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("sculk_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private SculkFamily() {
    }
}
