package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RawIronFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("raw_iron", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK))
                    .blockName("Block of Raw Iron"))
            .existingBlock(Blocks.RAW_IRON_BLOCK)
            .variant("raw_iron_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("raw_iron_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_braid", variant -> variant
                    .description("Braid"))
            .variant("raw_iron_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("raw_iron_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("raw_iron_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("raw_iron_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("raw_iron_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("raw_iron_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("raw_iron_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("raw_iron_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("raw_iron_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("raw_iron_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("raw_iron_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("raw_iron_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("raw_iron_checker", variant -> variant
                    .description("Checker"))
            .variant("raw_iron_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("raw_iron_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_cracked", variant -> variant
                    .description("Cracked"))
            .variant("raw_iron_cobble", variant -> variant
                    .description("Cobble"))
            .variant("raw_iron_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("raw_iron_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_french_1", variant -> variant
                    .description("French 1"))
            .variant("raw_iron_french_2", variant -> variant
                    .description("French 2"))
            .variant("raw_iron_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("raw_iron_layers", variant -> variant
                    .description("Layers"))
            .variant("raw_iron_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("raw_iron_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("raw_iron_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("raw_iron_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_meander_vertical-side")))
            .variant("raw_iron_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("raw_iron_panel", variant -> variant
                    .description("Panel"))
            .variant("raw_iron_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("raw_iron_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_basic-side")))
            .variant("raw_iron_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_basic_dent-side")))
            .variant("raw_iron_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_basic_plain-side")))
            .variant("raw_iron_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_basic_round-side")))
            .variant("raw_iron_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_basic_spiral-side")))
            .variant("raw_iron_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("raw_iron_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("raw_iron_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_ionic-side")))
            .variant("raw_iron_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_ionic_dent-side")))
            .variant("raw_iron_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_ionic_plain-side")))
            .variant("raw_iron_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_ionic_round-side")))
            .variant("raw_iron_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_ionic_spiral-side")))
            .variant("raw_iron_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_large_basic_triple-side")))
            .variant("raw_iron_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_large_ionic_triple-side")))
            .variant("raw_iron_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_meander-side")))
            .variant("raw_iron_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_meander_dent-side")))
            .variant("raw_iron_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_meander_plain-side")))
            .variant("raw_iron_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_meander_round-side")))
            .variant("raw_iron_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/raw_iron/raw_iron_pillar_meander_spiral-side")))
            .variant("raw_iron_plate", variant -> variant
                    .description("Plate"))
            .variant("raw_iron_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_polished", variant -> variant
                    .description("Polished"))
            .variant("raw_iron_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_prism", variant -> variant
                    .description("Prismatic"))
            .variant("raw_iron_raw", variant -> variant
                    .description("Raw"))
            .variant("raw_iron_road", variant -> variant
                    .description("Road"))
            .variant("raw_iron_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("raw_iron_tiles", variant -> variant
                    .description("Tiles"))
            .variant("raw_iron_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("raw_iron_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("raw_iron_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("raw_iron_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("raw_iron_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_medallion", variant -> variant
                    .description("Medallion"))
            .variant("raw_iron_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_dots", variant -> variant
                    .description("Dots"))
            .variant("raw_iron_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_heart", variant -> variant
                    .description("Heart"))
            .variant("raw_iron_star", variant -> variant
                    .description("Star"))
            .variant("raw_iron_plating", variant -> variant
                    .description("Plating"))
            .variant("raw_iron_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("raw_iron_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_plank", variant -> variant
                    .description("Plank"))
            .variant("raw_iron_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_frame", variant -> variant
                    .description("Frame"))
            .variant("raw_iron_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("raw_iron_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("raw_iron_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("raw_iron_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("raw_iron_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("raw_iron_stripes", variant -> variant
                    .description("Stripes"))
            .variant("raw_iron_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("raw_iron_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("raw_iron_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("raw_iron_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("raw_iron_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("raw_iron_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("raw_iron_facet", variant -> variant
                    .description("Facet"))
            .variant("raw_iron_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("raw_iron_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_shiny", variant -> variant
                    .description("Shiny"))
            .variant("raw_iron_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_gem", variant -> variant
                    .description("Gem"))
            .variant("raw_iron_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("raw_iron_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("raw_iron_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("raw_iron_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("raw_iron_slab", variant -> variant
                    .description("Slab"))
            .variant("raw_iron_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("raw_iron_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("raw_iron_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("raw_iron_parquet", variant -> variant
                    .description("Parquet"))
            .variant("raw_iron_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("raw_iron_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("raw_iron_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private RawIronFamily() {
    }
}
