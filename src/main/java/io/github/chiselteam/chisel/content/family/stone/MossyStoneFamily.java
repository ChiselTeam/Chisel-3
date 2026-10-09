package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MossyStoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("mossy_stone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Mossy Stone"))
            .variant("mossy_stone_raw", variant -> variant
                    .description("Raw"))
            .existingBlock(Blocks.MOSSY_STONE_BRICKS)
            .variant("mossy_stone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_stone_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_border_square_small", variant -> variant
                    .description("Small Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_braid", variant -> variant
                    .description("Braid"))
            .variant("mossy_stone_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("mossy_stone_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("mossy_stone_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("mossy_stone_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_stone_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("mossy_stone_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("mossy_stone_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("mossy_stone_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("mossy_stone_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("mossy_stone_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("mossy_stone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("mossy_stone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("mossy_stone_checker", variant -> variant
                    .description("Checker"))
            .variant("mossy_stone_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("mossy_stone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_cracked", variant -> variant
                    .description("Cracked"))
            .variant("mossy_stone_cobble", variant -> variant
                    .description("Cobble"))
            .variant("mossy_stone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("mossy_stone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_french_1", variant -> variant
                    .description("French 1"))
            .variant("mossy_stone_french_2", variant -> variant
                    .description("French 2"))
            .variant("mossy_stone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_stone_layers", variant -> variant
                    .description("Layers"))
            .variant("mossy_stone_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("mossy_stone_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("mossy_stone_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("mossy_stone_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_meander_vertical-side")))
            .variant("mossy_stone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("mossy_stone_panel", variant -> variant
                    .description("Panel"))
            .variant("mossy_stone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_stone_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_basic-side")))
            .variant("mossy_stone_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_basic_dent-side")))
            .variant("mossy_stone_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_basic_plain-side")))
            .variant("mossy_stone_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_basic_round-side")))
            .variant("mossy_stone_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_basic_spiral-side")))
            .variant("mossy_stone_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_stone_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_stone_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_ionic-side")))
            .variant("mossy_stone_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_ionic_dent-side")))
            .variant("mossy_stone_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_ionic_plain-side")))
            .variant("mossy_stone_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_ionic_round-side")))
            .variant("mossy_stone_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_ionic_spiral-side")))
            .variant("mossy_stone_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_large_basic_triple-side")))
            .variant("mossy_stone_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_large_ionic_triple-side")))
            .variant("mossy_stone_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_meander-side")))
            .variant("mossy_stone_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_meander_dent-side")))
            .variant("mossy_stone_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_meander_plain-side")))
            .variant("mossy_stone_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_meander_round-side")))
            .variant("mossy_stone_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/mossy_stone/mossy_stone_pillar_meander_spiral-side")))
            .variant("mossy_stone_plate", variant -> variant
                    .description("Plate"))
            .variant("mossy_stone_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_polished", variant -> variant
                    .description("Polished"))
            .variant("mossy_stone_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_prism", variant -> variant
                    .description("Prismatic"))
            .variant("mossy_stone_road", variant -> variant
                    .description("Road"))
            .variant("mossy_stone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_stone_tiles", variant -> variant
                    .description("Tiles"))
            .variant("mossy_stone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("mossy_stone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("mossy_stone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("mossy_stone_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("mossy_stone_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_medallion", variant -> variant
                    .description("Medallion"))
            .variant("mossy_stone_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_dots", variant -> variant
                    .description("Dots"))
            .variant("mossy_stone_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_heart", variant -> variant
                    .description("Heart"))
            .variant("mossy_stone_star", variant -> variant
                    .description("Star"))
            .variant("mossy_stone_plating", variant -> variant
                    .description("Plating"))
            .variant("mossy_stone_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("mossy_stone_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_plank", variant -> variant
                    .description("Plank"))
            .variant("mossy_stone_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_frame", variant -> variant
                    .description("Frame"))
            .variant("mossy_stone_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("mossy_stone_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("mossy_stone_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("mossy_stone_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("mossy_stone_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("mossy_stone_stripes", variant -> variant
                    .description("Stripes"))
            .variant("mossy_stone_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("mossy_stone_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("mossy_stone_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("mossy_stone_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("mossy_stone_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("mossy_stone_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("mossy_stone_facet", variant -> variant
                    .description("Facet"))
            .variant("mossy_stone_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("mossy_stone_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_shiny", variant -> variant
                    .description("Shiny"))
            .variant("mossy_stone_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_gem", variant -> variant
                    .description("Gem"))
            .variant("mossy_stone_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("mossy_stone_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("mossy_stone_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("mossy_stone_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("mossy_stone_slab", variant -> variant
                    .description("Slab"))
            .variant("mossy_stone_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("mossy_stone_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("mossy_stone_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_stone_parquet", variant -> variant
                    .description("Parquet"))
            .variant("mossy_stone_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("mossy_stone_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_stone_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private MossyStoneFamily() {
    }
}
