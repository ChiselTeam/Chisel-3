package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BoneBlockFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("bone_block", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK))
                    .blockName("Bone Block"))
            .existingBlock(Blocks.BONE_BLOCK)
            .variant("bone_block_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("bone_block_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_border_square_small", variant -> variant
                    .description("Small Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_braid", variant -> variant
                    .description("Braid"))
            .variant("bone_block_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("bone_block_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("bone_block_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("bone_block_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("bone_block_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("bone_block_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("bone_block_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("bone_block_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("bone_block_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("bone_block_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("bone_block_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("bone_block_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("bone_block_checker", variant -> variant
                    .description("Checker"))
            .variant("bone_block_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("bone_block_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_cracked", variant -> variant
                    .description("Cracked"))
            .variant("bone_block_cobble", variant -> variant
                    .description("Cobble"))
            .variant("bone_block_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("bone_block_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_french_1", variant -> variant
                    .description("French 1"))
            .variant("bone_block_french_2", variant -> variant
                    .description("French 2"))
            .variant("bone_block_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("bone_block_layers", variant -> variant
                    .description("Layers"))
            .variant("bone_block_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("bone_block_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("bone_block_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("bone_block_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_meander_vertical-side")))
            .variant("bone_block_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("bone_block_panel", variant -> variant
                    .description("Panel"))
            .variant("bone_block_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("bone_block_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_basic-side")))
            .variant("bone_block_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_basic_dent-side")))
            .variant("bone_block_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_basic_plain-side")))
            .variant("bone_block_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_basic_round-side")))
            .variant("bone_block_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_basic_spiral-side")))
            .variant("bone_block_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("bone_block_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("bone_block_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_ionic-side")))
            .variant("bone_block_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_ionic_dent-side")))
            .variant("bone_block_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_ionic_plain-side")))
            .variant("bone_block_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_ionic_round-side")))
            .variant("bone_block_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_ionic_spiral-side")))
            .variant("bone_block_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_large_basic_triple-side")))
            .variant("bone_block_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_large_ionic_triple-side")))
            .variant("bone_block_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_meander-side")))
            .variant("bone_block_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_meander_dent-side")))
            .variant("bone_block_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_meander_plain-side")))
            .variant("bone_block_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_meander_round-side")))
            .variant("bone_block_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/bone_block/bone_block_pillar_meander_spiral-side")))
            .variant("bone_block_plate", variant -> variant
                    .description("Plate"))
            .variant("bone_block_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_polished", variant -> variant
                    .description("Polished"))
            .variant("bone_block_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_prism", variant -> variant
                    .description("Prismatic"))
            .variant("bone_block_raw", variant -> variant
                    .description("Raw"))
            .variant("bone_block_road", variant -> variant
                    .description("Road"))
            .variant("bone_block_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("bone_block_tiles", variant -> variant
                    .description("Tiles"))
            .variant("bone_block_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("bone_block_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("bone_block_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("bone_block_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("bone_block_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_medallion", variant -> variant
                    .description("Medallion"))
            .variant("bone_block_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_dots", variant -> variant
                    .description("Dots"))
            .variant("bone_block_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_heart", variant -> variant
                    .description("Heart"))
            .variant("bone_block_star", variant -> variant
                    .description("Star"))
            .variant("bone_block_plating", variant -> variant
                    .description("Plating"))
            .variant("bone_block_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("bone_block_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_plank", variant -> variant
                    .description("Plank"))
            .variant("bone_block_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_frame", variant -> variant
                    .description("Frame"))
            .variant("bone_block_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("bone_block_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("bone_block_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("bone_block_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("bone_block_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("bone_block_stripes", variant -> variant
                    .description("Stripes"))
            .variant("bone_block_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("bone_block_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("bone_block_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("bone_block_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("bone_block_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("bone_block_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("bone_block_facet", variant -> variant
                    .description("Facet"))
            .variant("bone_block_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("bone_block_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_shiny", variant -> variant
                    .description("Shiny"))
            .variant("bone_block_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_gem", variant -> variant
                    .description("Gem"))
            .variant("bone_block_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("bone_block_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("bone_block_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("bone_block_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("bone_block_slab", variant -> variant
                    .description("Slab"))
            .variant("bone_block_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("bone_block_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("bone_block_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("bone_block_parquet", variant -> variant
                    .description("Parquet"))
            .variant("bone_block_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("bone_block_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("bone_block_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private BoneBlockFamily() {
    }
}
