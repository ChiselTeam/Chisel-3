package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CryingObsidianFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("crying_obsidian", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.CRYING_OBSIDIAN))
                    .blockName("Crying Obsidian"))
            .existingBlock(Blocks.CRYING_OBSIDIAN)
            .variant("crying_obsidian_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("crying_obsidian_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_braid", variant -> variant
                    .description("Braid"))
            .variant("crying_obsidian_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("crying_obsidian_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("crying_obsidian_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("crying_obsidian_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("crying_obsidian_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("crying_obsidian_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("crying_obsidian_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("crying_obsidian_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("crying_obsidian_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("crying_obsidian_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("crying_obsidian_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("crying_obsidian_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("crying_obsidian_checker", variant -> variant
                    .description("Checker"))
            .variant("crying_obsidian_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("crying_obsidian_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_cracked", variant -> variant
                    .description("Cracked"))
            .variant("crying_obsidian_cobble", variant -> variant
                    .description("Cobble"))
            .variant("crying_obsidian_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("crying_obsidian_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_french_1", variant -> variant
                    .description("French 1"))
            .variant("crying_obsidian_french_2", variant -> variant
                    .description("French 2"))
            .variant("crying_obsidian_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("crying_obsidian_layers", variant -> variant
                    .description("Layers"))
            .variant("crying_obsidian_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("crying_obsidian_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("crying_obsidian_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("crying_obsidian_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_meander_vertical-side")))
            .variant("crying_obsidian_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("crying_obsidian_panel", variant -> variant
                    .description("Panel"))
            .variant("crying_obsidian_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("crying_obsidian_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_basic-side")))
            .variant("crying_obsidian_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_basic_dent-side")))
            .variant("crying_obsidian_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_basic_plain-side")))
            .variant("crying_obsidian_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_basic_round-side")))
            .variant("crying_obsidian_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_basic_spiral-side")))
            .variant("crying_obsidian_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("crying_obsidian_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("crying_obsidian_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_ionic-side")))
            .variant("crying_obsidian_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_ionic_dent-side")))
            .variant("crying_obsidian_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_ionic_plain-side")))
            .variant("crying_obsidian_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_ionic_round-side")))
            .variant("crying_obsidian_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_ionic_spiral-side")))
            .variant("crying_obsidian_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_large_basic_triple-side")))
            .variant("crying_obsidian_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_large_ionic_triple-side")))
            .variant("crying_obsidian_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_meander-side")))
            .variant("crying_obsidian_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_meander_dent-side")))
            .variant("crying_obsidian_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_meander_plain-side")))
            .variant("crying_obsidian_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_meander_round-side")))
            .variant("crying_obsidian_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/crying_obsidian/crying_obsidian_pillar_meander_spiral-side")))
            .variant("crying_obsidian_plate", variant -> variant
                    .description("Plate"))
            .variant("crying_obsidian_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_polished", variant -> variant
                    .description("Polished"))
            .variant("crying_obsidian_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_prism", variant -> variant
                    .description("Prismatic"))
            .variant("crying_obsidian_raw", variant -> variant
                    .description("Raw"))
            .variant("crying_obsidian_road", variant -> variant
                    .description("Road"))
            .variant("crying_obsidian_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("crying_obsidian_tiles", variant -> variant
                    .description("Tiles"))
            .variant("crying_obsidian_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("crying_obsidian_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("crying_obsidian_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("crying_obsidian_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("crying_obsidian_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_medallion", variant -> variant
                    .description("Medallion"))
            .variant("crying_obsidian_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_dots", variant -> variant
                    .description("Dots"))
            .variant("crying_obsidian_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_heart", variant -> variant
                    .description("Heart"))
            .variant("crying_obsidian_star", variant -> variant
                    .description("Star"))
            .variant("crying_obsidian_plating", variant -> variant
                    .description("Plating"))
            .variant("crying_obsidian_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("crying_obsidian_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_plank", variant -> variant
                    .description("Plank"))
            .variant("crying_obsidian_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_frame", variant -> variant
                    .description("Frame"))
            .variant("crying_obsidian_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("crying_obsidian_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("crying_obsidian_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("crying_obsidian_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("crying_obsidian_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("crying_obsidian_stripes", variant -> variant
                    .description("Stripes"))
            .variant("crying_obsidian_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("crying_obsidian_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("crying_obsidian_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("crying_obsidian_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("crying_obsidian_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("crying_obsidian_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("crying_obsidian_facet", variant -> variant
                    .description("Facet"))
            .variant("crying_obsidian_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("crying_obsidian_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_shiny", variant -> variant
                    .description("Shiny"))
            .variant("crying_obsidian_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_gem", variant -> variant
                    .description("Gem"))
            .variant("crying_obsidian_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("crying_obsidian_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("crying_obsidian_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("crying_obsidian_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("crying_obsidian_slab", variant -> variant
                    .description("Slab"))
            .variant("crying_obsidian_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("crying_obsidian_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("crying_obsidian_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("crying_obsidian_parquet", variant -> variant
                    .description("Parquet"))
            .variant("crying_obsidian_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("crying_obsidian_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("crying_obsidian_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private CryingObsidianFamily() {
    }
}
