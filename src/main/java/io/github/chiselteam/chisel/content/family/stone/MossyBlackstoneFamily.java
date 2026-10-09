package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MossyBlackstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("mossy_blackstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE))
                    .blockName("Mossy Blackstone"))
            .variant("mossy_blackstone_raw", variant -> variant
                    .description("Raw"))
            .variant("mossy_blackstone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_blackstone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_border_square_small", variant -> variant
                    .description("Small Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_braid", variant -> variant
                    .description("Braid"))
            .variant("mossy_blackstone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("mossy_blackstone_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("mossy_blackstone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("mossy_blackstone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_blackstone_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("mossy_blackstone_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("mossy_blackstone_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("mossy_blackstone_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("mossy_blackstone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("mossy_blackstone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("mossy_blackstone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("mossy_blackstone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("mossy_blackstone_checker", variant -> variant
                    .description("Checker"))
            .variant("mossy_blackstone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("mossy_blackstone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_cracked", variant -> variant
                    .description("Cracked"))
            .variant("mossy_blackstone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("mossy_blackstone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("mossy_blackstone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_french_1", variant -> variant
                    .description("French 1"))
            .variant("mossy_blackstone_french_2", variant -> variant
                    .description("French 2"))
            .variant("mossy_blackstone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_blackstone_layers", variant -> variant
                    .description("Layers"))
            .variant("mossy_blackstone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("mossy_blackstone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("mossy_blackstone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("mossy_blackstone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_meander_vertical-side")))
            .variant("mossy_blackstone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("mossy_blackstone_panel", variant -> variant
                    .description("Panel"))
            .variant("mossy_blackstone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_blackstone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_basic-side")))
            .variant("mossy_blackstone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_basic_dent-side")))
            .variant("mossy_blackstone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_basic_plain-side")))
            .variant("mossy_blackstone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_basic_round-side")))
            .variant("mossy_blackstone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_basic_spiral-side")))
            .variant("mossy_blackstone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_blackstone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_blackstone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_ionic-side")))
            .variant("mossy_blackstone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_ionic_dent-side")))
            .variant("mossy_blackstone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_ionic_plain-side")))
            .variant("mossy_blackstone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_ionic_round-side")))
            .variant("mossy_blackstone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_ionic_spiral-side")))
            .variant("mossy_blackstone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_large_basic_triple-side")))
            .variant("mossy_blackstone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_large_ionic_triple-side")))
            .variant("mossy_blackstone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_meander-side")))
            .variant("mossy_blackstone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_meander_dent-side")))
            .variant("mossy_blackstone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_meander_plain-side")))
            .variant("mossy_blackstone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_meander_round-side")))
            .variant("mossy_blackstone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_blackstone/mossy_blackstone_pillar_meander_spiral-side")))
            .variant("mossy_blackstone_plate", variant -> variant
                    .description("Plate"))
            .variant("mossy_blackstone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_polished", variant -> variant
                    .description("Polished"))
            .variant("mossy_blackstone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_prism", variant -> variant
                    .description("Prismatic"))
            .variant("mossy_blackstone_road", variant -> variant
                    .description("Road"))
            .variant("mossy_blackstone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_blackstone_tiles", variant -> variant
                    .description("Tiles"))
            .variant("mossy_blackstone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("mossy_blackstone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_blackstone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("mossy_blackstone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("mossy_blackstone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("mossy_blackstone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_dots", variant -> variant
                    .description("Dots"))
            .variant("mossy_blackstone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_heart", variant -> variant
                    .description("Heart"))
            .variant("mossy_blackstone_star", variant -> variant
                    .description("Star"))
            .variant("mossy_blackstone_plating", variant -> variant
                    .description("Plating"))
            .variant("mossy_blackstone_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("mossy_blackstone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_plank", variant -> variant
                    .description("Plank"))
            .variant("mossy_blackstone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_frame", variant -> variant
                    .description("Frame"))
            .variant("mossy_blackstone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("mossy_blackstone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("mossy_blackstone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("mossy_blackstone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("mossy_blackstone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("mossy_blackstone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("mossy_blackstone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("mossy_blackstone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("mossy_blackstone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("mossy_blackstone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("mossy_blackstone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("mossy_blackstone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("mossy_blackstone_facet", variant -> variant
                    .description("Facet"))
            .variant("mossy_blackstone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("mossy_blackstone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_shiny", variant -> variant
                    .description("Shiny"))
            .variant("mossy_blackstone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_gem", variant -> variant
                    .description("Gem"))
            .variant("mossy_blackstone_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("mossy_blackstone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("mossy_blackstone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("mossy_blackstone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("mossy_blackstone_slab", variant -> variant
                    .description("Slab"))
            .variant("mossy_blackstone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("mossy_blackstone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("mossy_blackstone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_blackstone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("mossy_blackstone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_blackstone_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_blackstone_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private MossyBlackstoneFamily() {
    }
}
