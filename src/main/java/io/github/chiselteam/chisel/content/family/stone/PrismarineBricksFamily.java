package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PrismarineBricksFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("prismarine_bricks", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS))
                    .blockName("Prismarine Bricks"))
            .existingBlock(Blocks.PRISMARINE_BRICKS)
            .variant("prismarine_bricks_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("prismarine_bricks_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_braid", variant -> variant
                    .description("Braid"))
            .variant("prismarine_bricks_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("prismarine_bricks_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("prismarine_bricks_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("prismarine_bricks_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("prismarine_bricks_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("prismarine_bricks_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("prismarine_bricks_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("prismarine_bricks_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("prismarine_bricks_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("prismarine_bricks_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("prismarine_bricks_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("prismarine_bricks_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("prismarine_bricks_checker", variant -> variant
                    .description("Checker"))
            .variant("prismarine_bricks_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("prismarine_bricks_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_cracked", variant -> variant
                    .description("Cracked"))
            .variant("prismarine_bricks_cobble", variant -> variant
                    .description("Cobble"))
            .variant("prismarine_bricks_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("prismarine_bricks_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_french_1", variant -> variant
                    .description("French 1"))
            .variant("prismarine_bricks_french_2", variant -> variant
                    .description("French 2"))
            .variant("prismarine_bricks_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("prismarine_bricks_layers", variant -> variant
                    .description("Layers"))
            .variant("prismarine_bricks_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("prismarine_bricks_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("prismarine_bricks_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("prismarine_bricks_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_meander_vertical-side")))
            .variant("prismarine_bricks_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("prismarine_bricks_panel", variant -> variant
                    .description("Panel"))
            .variant("prismarine_bricks_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("prismarine_bricks_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_basic-side")))
            .variant("prismarine_bricks_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_basic_dent-side")))
            .variant("prismarine_bricks_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_basic_plain-side")))
            .variant("prismarine_bricks_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_basic_round-side")))
            .variant("prismarine_bricks_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_basic_spiral-side")))
            .variant("prismarine_bricks_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("prismarine_bricks_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("prismarine_bricks_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_ionic-side")))
            .variant("prismarine_bricks_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_ionic_dent-side")))
            .variant("prismarine_bricks_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_ionic_plain-side")))
            .variant("prismarine_bricks_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_ionic_round-side")))
            .variant("prismarine_bricks_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_ionic_spiral-side")))
            .variant("prismarine_bricks_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_large_basic_triple-side")))
            .variant("prismarine_bricks_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_large_ionic_triple-side")))
            .variant("prismarine_bricks_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_meander-side")))
            .variant("prismarine_bricks_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_meander_dent-side")))
            .variant("prismarine_bricks_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_meander_plain-side")))
            .variant("prismarine_bricks_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_meander_round-side")))
            .variant("prismarine_bricks_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/prismarine_bricks/prismarine_bricks_pillar_meander_spiral-side")))
            .variant("prismarine_bricks_plate", variant -> variant
                    .description("Plate"))
            .variant("prismarine_bricks_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_polished", variant -> variant
                    .description("Polished"))
            .variant("prismarine_bricks_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_prism", variant -> variant
                    .description("Prismatic"))
            .variant("prismarine_bricks_raw", variant -> variant
                    .description("Raw"))
            .variant("prismarine_bricks_road", variant -> variant
                    .description("Road"))
            .variant("prismarine_bricks_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("prismarine_bricks_tiles", variant -> variant
                    .description("Tiles"))
            .variant("prismarine_bricks_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("prismarine_bricks_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("prismarine_bricks_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("prismarine_bricks_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("prismarine_bricks_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_medallion", variant -> variant
                    .description("Medallion"))
            .variant("prismarine_bricks_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_dots", variant -> variant
                    .description("Dots"))
            .variant("prismarine_bricks_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_heart", variant -> variant
                    .description("Heart"))
            .variant("prismarine_bricks_star", variant -> variant
                    .description("Star"))
            .variant("prismarine_bricks_plating", variant -> variant
                    .description("Plating"))
            .variant("prismarine_bricks_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("prismarine_bricks_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_plank", variant -> variant
                    .description("Plank"))
            .variant("prismarine_bricks_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_frame", variant -> variant
                    .description("Frame"))
            .variant("prismarine_bricks_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("prismarine_bricks_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("prismarine_bricks_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("prismarine_bricks_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("prismarine_bricks_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("prismarine_bricks_stripes", variant -> variant
                    .description("Stripes"))
            .variant("prismarine_bricks_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("prismarine_bricks_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("prismarine_bricks_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("prismarine_bricks_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("prismarine_bricks_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("prismarine_bricks_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("prismarine_bricks_facet", variant -> variant
                    .description("Facet"))
            .variant("prismarine_bricks_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("prismarine_bricks_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_shiny", variant -> variant
                    .description("Shiny"))
            .variant("prismarine_bricks_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_gem", variant -> variant
                    .description("Gem"))
            .variant("prismarine_bricks_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("prismarine_bricks_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("prismarine_bricks_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("prismarine_bricks_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("prismarine_bricks_slab", variant -> variant
                    .description("Slab"))
            .variant("prismarine_bricks_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("prismarine_bricks_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("prismarine_bricks_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("prismarine_bricks_parquet", variant -> variant
                    .description("Parquet"))
            .variant("prismarine_bricks_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("prismarine_bricks_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("prismarine_bricks_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private PrismarineBricksFamily() {
    }
}
