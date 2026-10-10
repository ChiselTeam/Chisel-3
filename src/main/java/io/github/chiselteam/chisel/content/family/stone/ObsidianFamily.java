package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public final class ObsidianFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("obsidian", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN).pushReaction(PushReaction.BLOCK))
                    .blockName("Obsidian"))
            .existingBlock(Blocks.OBSIDIAN)
            .variant("obsidian_blocks", variant -> variant
                    .description("Obsidian Blocks"))
            .variant("obsidian_chiseled", variant -> variant
                    .description("Chiseled Obsidian")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/obsidian/obsidian_chiseled-top")))
            .variant("obsidian_crate", variant -> variant
                    .description("Small Obsidian Blocks inside an Oak Wood Crate")
                    .model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/obsidian/obsidian_tiles")))
            .variant("obsidian_crate_unboxed", variant -> variant
                    .description("Unboxed Crate")
                    .texture(Chisel.prefix("block/obsidian/obsidian_tiles")))
            .variant("obsidian_crystal", variant -> variant
                    .description("Obsidian Crystal"))
            .variant("obsidian_greek", variant -> variant
                    .description("Light Obsidian Blocks with Greek Decor")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/obsidian/obsidian_greek-top")))
            .variant("obsidian_organic_chunks", variant -> variant
                    .description("Organic-Looking Obsidian Chunks"))
            .variant("obsidian_organic_growth", variant -> variant
                    .description("Organic-Looking Obsidian Growth"))
            .variant("obsidian_panel", variant -> variant
                    .description("Obsidian Panel"))
            .variant("obsidian_panel_bright", variant -> variant
                    .description("Bright Obsidian Panel"))
            .variant("obsidian_panel_map", variant -> variant
                    .description("Obsidian Panel with Map"))
            .variant("obsidian_panel_region", variant -> variant
                    .description("Obsidian Panel with Region Map"))
            .variant("obsidian_panel_shiny", variant -> variant
                    .description("Shiny Obsidian Panel"))
            .variant("obsidian_pillar", variant -> variant
                    .description("Large Obsidian Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/obsidian/obsidian_pillar-top")))
            .variant("obsidian_pillar_quartz", variant -> variant
                    .description("Obsidian Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/obsidian/obsidian_pillar_quartz-top")))
            .variant("obsidian_tiles", variant -> variant
                    .description("Obsidian Tiles"))
            .variant("obsidian_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("obsidian_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_braid", variant -> variant
                    .description("Braid"))
            .variant("obsidian_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("obsidian_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("obsidian_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("obsidian_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("obsidian_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("obsidian_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("obsidian_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("obsidian_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("obsidian_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("obsidian_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("obsidian_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("obsidian_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("obsidian_checker", variant -> variant
                    .description("Checker"))
            .variant("obsidian_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("obsidian_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_cracked", variant -> variant
                    .description("Cracked"))
            .variant("obsidian_cobble", variant -> variant
                    .description("Cobble"))
            .variant("obsidian_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("obsidian_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_french_1", variant -> variant
                    .description("French 1"))
            .variant("obsidian_french_2", variant -> variant
                    .description("French 2"))
            .variant("obsidian_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("obsidian_layers", variant -> variant
                    .description("Layers"))
            .variant("obsidian_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("obsidian_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("obsidian_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("obsidian_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_meander_vertical-side")))
            .variant("obsidian_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_ornate_small", variant -> variant
                    .description("Small Ornate"))
            // .variant("obsidian_panel", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Obsidian").description("Panel"))
            // .variant("obsidian_pillar", variant -> variant.model(ChiselModelHandlers.TBS).blockName("Obsidian").description("Pillar"))
            .variant("obsidian_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_basic-side")))
            .variant("obsidian_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_basic_dent-side")))
            .variant("obsidian_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_basic_plain-side")))
            .variant("obsidian_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_basic_round-side")))
            .variant("obsidian_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_basic_spiral-side")))
            .variant("obsidian_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("obsidian_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("obsidian_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_ionic-side")))
            .variant("obsidian_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_ionic_dent-side")))
            .variant("obsidian_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_ionic_plain-side")))
            .variant("obsidian_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_ionic_round-side")))
            .variant("obsidian_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_ionic_spiral-side")))
            .variant("obsidian_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_large_basic_triple-side")))
            .variant("obsidian_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_large_ionic_triple-side")))
            .variant("obsidian_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_meander-side")))
            .variant("obsidian_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_meander_dent-side")))
            .variant("obsidian_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_meander_plain-side")))
            .variant("obsidian_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_meander_round-side")))
            .variant("obsidian_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/obsidian/obsidian_pillar_meander_spiral-side")))
            .variant("obsidian_plate", variant -> variant
                    .description("Plate"))
            .variant("obsidian_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_polished", variant -> variant
                    .description("Polished"))
            .variant("obsidian_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_prism", variant -> variant
                    .description("Prismatic"))
            .variant("obsidian_raw", variant -> variant
                    .description("Raw"))
            .variant("obsidian_road", variant -> variant
                    .description("Road"))
            .variant("obsidian_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            // .variant("obsidian_tiles", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Obsidian").description("Tiles"))
            .variant("obsidian_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("obsidian_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("obsidian_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            // .variant("obsidian_crate", variant -> variant.model(ChiselModelHandlers.CONNECTED).blockName("Obsidian").description("Crate"))
            .variant("obsidian_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("obsidian_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_medallion", variant -> variant
                    .description("Medallion"))
            .variant("obsidian_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_dots", variant -> variant
                    .description("Dots"))
            .variant("obsidian_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_heart", variant -> variant
                    .description("Heart"))
            .variant("obsidian_star", variant -> variant
                    .description("Star"))
            .variant("obsidian_plating", variant -> variant
                    .description("Plating"))
            .variant("obsidian_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("obsidian_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_plank", variant -> variant
                    .description("Plank"))
            .variant("obsidian_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_frame", variant -> variant
                    .description("Frame"))
            .variant("obsidian_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("obsidian_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("obsidian_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("obsidian_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("obsidian_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("obsidian_stripes", variant -> variant
                    .description("Stripes"))
            .variant("obsidian_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("obsidian_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("obsidian_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("obsidian_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("obsidian_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("obsidian_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("obsidian_facet", variant -> variant
                    .description("Facet"))
            .variant("obsidian_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("obsidian_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_shiny", variant -> variant
                    .description("Shiny"))
            .variant("obsidian_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_gem", variant -> variant
                    .description("Gem"))
            .variant("obsidian_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("obsidian_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("obsidian_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("obsidian_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("obsidian_slab", variant -> variant
                    .description("Slab"))
            .variant("obsidian_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("obsidian_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("obsidian_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("obsidian_parquet", variant -> variant
                    .description("Parquet"))
            .variant("obsidian_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("obsidian_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("obsidian_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private ObsidianFamily() {
    }
}
