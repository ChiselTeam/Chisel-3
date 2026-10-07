package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DarkPrismarineFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("dark_prismarine", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE))
                    .blockName("Dark Prismarine"))
            .existingBlock(Blocks.DARK_PRISMARINE)
            .variant("dark_prismarine_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dark_prismarine_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_braid", variant -> variant
                    .description("Braid"))
            .variant("dark_prismarine_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("dark_prismarine_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("dark_prismarine_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("dark_prismarine_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dark_prismarine_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("dark_prismarine_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("dark_prismarine_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("dark_prismarine_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("dark_prismarine_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("dark_prismarine_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("dark_prismarine_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("dark_prismarine_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("dark_prismarine_checker", variant -> variant
                    .description("Checker"))
            .variant("dark_prismarine_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("dark_prismarine_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_cracked", variant -> variant
                    .description("Cracked"))
            .variant("dark_prismarine_cobble", variant -> variant
                    .description("Cobble"))
            .variant("dark_prismarine_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("dark_prismarine_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_french_1", variant -> variant
                    .description("French 1"))
            .variant("dark_prismarine_french_2", variant -> variant
                    .description("French 2"))
            .variant("dark_prismarine_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dark_prismarine_layers", variant -> variant
                    .description("Layers"))
            .variant("dark_prismarine_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("dark_prismarine_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("dark_prismarine_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("dark_prismarine_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_meander_vertical-side")))
            .variant("dark_prismarine_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("dark_prismarine_panel", variant -> variant
                    .description("Panel"))
            .variant("dark_prismarine_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("dark_prismarine_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_basic-side")))
            .variant("dark_prismarine_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_basic_dent-side")))
            .variant("dark_prismarine_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_basic_plain-side")))
            .variant("dark_prismarine_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_basic_round-side")))
            .variant("dark_prismarine_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_basic_spiral-side")))
            .variant("dark_prismarine_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("dark_prismarine_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("dark_prismarine_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_ionic-side")))
            .variant("dark_prismarine_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_ionic_dent-side")))
            .variant("dark_prismarine_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_ionic_plain-side")))
            .variant("dark_prismarine_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_ionic_round-side")))
            .variant("dark_prismarine_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_ionic_spiral-side")))
            .variant("dark_prismarine_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_large_basic_triple-side")))
            .variant("dark_prismarine_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_large_ionic_triple-side")))
            .variant("dark_prismarine_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_meander-side")))
            .variant("dark_prismarine_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_meander_dent-side")))
            .variant("dark_prismarine_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_meander_plain-side")))
            .variant("dark_prismarine_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_meander_round-side")))
            .variant("dark_prismarine_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dark_prismarine/dark_prismarine_pillar_meander_spiral-side")))
            .variant("dark_prismarine_plate", variant -> variant
                    .description("Plate"))
            .variant("dark_prismarine_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_polished", variant -> variant
                    .description("Polished"))
            .variant("dark_prismarine_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_prism", variant -> variant
                    .description("Prismatic"))
            .variant("dark_prismarine_raw", variant -> variant
                    .description("Raw"))
            .variant("dark_prismarine_road", variant -> variant
                    .description("Road"))
            .variant("dark_prismarine_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dark_prismarine_tiles", variant -> variant
                    .description("Tiles"))
            .variant("dark_prismarine_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("dark_prismarine_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("dark_prismarine_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("dark_prismarine_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("dark_prismarine_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_medallion", variant -> variant
                    .description("Medallion"))
            .variant("dark_prismarine_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_dots", variant -> variant
                    .description("Dots"))
            .variant("dark_prismarine_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_heart", variant -> variant
                    .description("Heart"))
            .variant("dark_prismarine_star", variant -> variant
                    .description("Star"))
            .variant("dark_prismarine_plating", variant -> variant
                    .description("Plating"))
            .variant("dark_prismarine_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("dark_prismarine_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_plank", variant -> variant
                    .description("Plank"))
            .variant("dark_prismarine_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_frame", variant -> variant
                    .description("Frame"))
            .variant("dark_prismarine_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("dark_prismarine_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("dark_prismarine_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("dark_prismarine_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("dark_prismarine_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("dark_prismarine_stripes", variant -> variant
                    .description("Stripes"))
            .variant("dark_prismarine_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("dark_prismarine_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("dark_prismarine_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("dark_prismarine_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("dark_prismarine_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("dark_prismarine_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("dark_prismarine_facet", variant -> variant
                    .description("Facet"))
            .variant("dark_prismarine_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("dark_prismarine_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_shiny", variant -> variant
                    .description("Shiny"))
            .variant("dark_prismarine_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_gem", variant -> variant
                    .description("Gem"))
            .variant("dark_prismarine_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("dark_prismarine_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("dark_prismarine_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("dark_prismarine_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("dark_prismarine_slab", variant -> variant
                    .description("Slab"))
            .variant("dark_prismarine_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("dark_prismarine_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("dark_prismarine_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dark_prismarine_parquet", variant -> variant
                    .description("Parquet"))
            .variant("dark_prismarine_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dark_prismarine_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dark_prismarine_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private DarkPrismarineFamily() {
    }
}
