package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AmethystFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("amethyst", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK))
                    .blockName("Block of Amethyst"))
            .existingBlock(Blocks.AMETHYST_BLOCK)
            .variant("amethyst_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("amethyst_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_braid", variant -> variant
                    .description("Braid"))
            .variant("amethyst_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("amethyst_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("amethyst_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("amethyst_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("amethyst_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("amethyst_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("amethyst_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("amethyst_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("amethyst_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("amethyst_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("amethyst_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("amethyst_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("amethyst_checker", variant -> variant
                    .description("Checker"))
            .variant("amethyst_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("amethyst_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_cracked", variant -> variant
                    .description("Cracked"))
            .variant("amethyst_cobble", variant -> variant
                    .description("Cobble"))
            .variant("amethyst_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("amethyst_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_french_1", variant -> variant
                    .description("French 1"))
            .variant("amethyst_french_2", variant -> variant
                    .description("French 2"))
            .variant("amethyst_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("amethyst_layers", variant -> variant
                    .description("Layers"))
            .variant("amethyst_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("amethyst_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("amethyst_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("amethyst_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_meander_vertical-side")))
            .variant("amethyst_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("amethyst_panel", variant -> variant
                    .description("Panel"))
            .variant("amethyst_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("amethyst_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_basic-side")))
            .variant("amethyst_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_basic_dent-side")))
            .variant("amethyst_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_basic_plain-side")))
            .variant("amethyst_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_basic_round-side")))
            .variant("amethyst_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_basic_spiral-side")))
            .variant("amethyst_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("amethyst_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("amethyst_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_ionic-side")))
            .variant("amethyst_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_ionic_dent-side")))
            .variant("amethyst_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_ionic_plain-side")))
            .variant("amethyst_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_ionic_round-side")))
            .variant("amethyst_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_ionic_spiral-side")))
            .variant("amethyst_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_large_basic_triple-side")))
            .variant("amethyst_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_large_ionic_triple-side")))
            .variant("amethyst_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_meander-side")))
            .variant("amethyst_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_meander_dent-side")))
            .variant("amethyst_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_meander_plain-side")))
            .variant("amethyst_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_meander_round-side")))
            .variant("amethyst_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/amethyst/amethyst_pillar_meander_spiral-side")))
            .variant("amethyst_plate", variant -> variant
                    .description("Plate"))
            .variant("amethyst_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_polished", variant -> variant
                    .description("Polished"))
            .variant("amethyst_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_prism", variant -> variant
                    .description("Prismatic"))
            .variant("amethyst_raw", variant -> variant
                    .description("Raw"))
            .variant("amethyst_road", variant -> variant
                    .description("Road"))
            .variant("amethyst_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("amethyst_tiles", variant -> variant
                    .description("Tiles"))
            .variant("amethyst_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("amethyst_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("amethyst_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("amethyst_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("amethyst_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_medallion", variant -> variant
                    .description("Medallion"))
            .variant("amethyst_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_dots", variant -> variant
                    .description("Dots"))
            .variant("amethyst_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_heart", variant -> variant
                    .description("Heart"))
            .variant("amethyst_star", variant -> variant
                    .description("Star"))
            .variant("amethyst_plating", variant -> variant
                    .description("Plating"))
            .variant("amethyst_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("amethyst_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_plank", variant -> variant
                    .description("Plank"))
            .variant("amethyst_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_frame", variant -> variant
                    .description("Frame"))
            .variant("amethyst_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("amethyst_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("amethyst_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("amethyst_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("amethyst_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("amethyst_stripes", variant -> variant
                    .description("Stripes"))
            .variant("amethyst_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("amethyst_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("amethyst_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("amethyst_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("amethyst_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("amethyst_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("amethyst_facet", variant -> variant
                    .description("Facet"))
            .variant("amethyst_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("amethyst_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_shiny", variant -> variant
                    .description("Shiny"))
            .variant("amethyst_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_gem", variant -> variant
                    .description("Gem"))
            .variant("amethyst_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("amethyst_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("amethyst_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("amethyst_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("amethyst_slab", variant -> variant
                    .description("Slab"))
            .variant("amethyst_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("amethyst_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("amethyst_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("amethyst_parquet", variant -> variant
                    .description("Parquet"))
            .variant("amethyst_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("amethyst_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("amethyst_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private AmethystFamily() {
    }
}
