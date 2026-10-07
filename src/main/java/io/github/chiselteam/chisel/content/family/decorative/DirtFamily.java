package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DirtFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("dirt", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT))
                    .blockName("Dirt"))
            .existingBlock(Blocks.DIRT)
            .variant("dirt_bricks", variant -> variant
                    .description("Dirt Bricks")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/dirt/dirt_bricks-top"))
                    .textureAlias("side", "bottom")
                    .texture("vertical_bottom", Chisel.prefix("block/dirt/dirt_bricks-vertical_both"))
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_bricks-vertical_top")))
            .variant("dirt_bricks_arranged", variant -> variant
                    .description("Dirt Bricks"))
            .variant("dirt_bricks_disarray", variant -> variant
                    .description("Dirt Bricks in Disarray"))
            .variant("dirt_bricks_large", variant -> variant
                    .description("Large Dirt Bricks"))
            .variant("dirt_chunky", variant -> variant
                    .description("Crumbling Dirt"))
            .variant("dirt_cobble", variant -> variant
                    .description("Cobble-Dirt"))
            .variant("dirt_happy", variant -> variant
                    .description("Happy Dirt"))
            .variant("dirt_horizontal", variant -> variant
                    .description("Horizontal Dirt")
                    .model(ChiselModelHandlers.CTMH)
                    .textureFromBase("bottom")
                    .textureFromBase("horizontal_both")
                    .textureFromBase("top"))
            .variant("dirt_layers", variant -> variant
                    .description("Dirt Layers"))
            .variant("dirt_netherbricks", variant -> variant
                    .description("Dirt Bricks Imitating Nether Brick Design"))
            .variant("dirt_plate", variant -> variant
                    .description("Farmland"))
            .variant("dirt_reinforced", variant -> variant
                    .description("Reinforced Dirt")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dirt/dirt_bricks-vertical_both")))
            .variant("dirt_reinforced_cobble", variant -> variant
                    .description("Reinforced Cobble-Dirt")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/dirt/dirt_cobble")))
            .variant("dirt_vert", variant -> variant
                    .description("Vertical Dirt")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("bottom", Chisel.prefix("block/dirt/dirt_vert-top"))
                    .textureAlias("side", "bottom"))
            .variant("dirt_vertical", variant -> variant
                    .description("Vertical Dirt")
                    .model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .textureAlias("side", "top")
                    .texture("top", Chisel.prefix("block/dirt/dirt_vert-top")))
            .variant("dirt_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dirt_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_braid", variant -> variant
                    .description("Braid"))
            .variant("dirt_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("dirt_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("dirt_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            // .variant("dirt_bricks_large", variant -> variant.model(ChiselModelHandlers.MULTIBLOCK_2X2).blockName("Dirt").description("Large Bricks"))
            .variant("dirt_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("dirt_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("dirt_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("dirt_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("dirt_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("dirt_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("dirt_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("dirt_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("dirt_checker", variant -> variant
                    .description("Checker"))
            .variant("dirt_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("dirt_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_cracked", variant -> variant
                    .description("Cracked"))
            // .variant("dirt_cobble", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Dirt").description("Cobble"))
            .variant("dirt_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("dirt_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_french_1", variant -> variant
                    .description("French 1"))
            .variant("dirt_french_2", variant -> variant
                    .description("French 2"))
            .variant("dirt_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            // .variant("dirt_layers", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Dirt").description("Layers"))
            .variant("dirt_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("dirt_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("dirt_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("dirt_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_meander_vertical-side")))
            .variant("dirt_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("dirt_panel", variant -> variant
                    .description("Panel"))
            .variant("dirt_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("dirt_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_basic-side")))
            .variant("dirt_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_basic_dent-side")))
            .variant("dirt_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_basic_plain-side")))
            .variant("dirt_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_basic_round-side")))
            .variant("dirt_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_basic_spiral-side")))
            .variant("dirt_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("dirt_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("dirt_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_ionic-side")))
            .variant("dirt_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_ionic_dent-side")))
            .variant("dirt_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_ionic_plain-side")))
            .variant("dirt_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_ionic_round-side")))
            .variant("dirt_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_ionic_spiral-side")))
            .variant("dirt_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_large_basic_triple-side")))
            .variant("dirt_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_large_ionic_triple-side")))
            .variant("dirt_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_meander-side")))
            .variant("dirt_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_meander_dent-side")))
            .variant("dirt_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_meander_plain-side")))
            .variant("dirt_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_meander_round-side")))
            .variant("dirt_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/dirt/dirt_pillar_meander_spiral-side")))
            // .variant("dirt_plate", variant -> variant.model(ChiselModelHandlers.CUBE_ALL).blockName("Dirt").description("Plate"))
            .variant("dirt_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_polished", variant -> variant
                    .description("Polished"))
            .variant("dirt_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_prism", variant -> variant
                    .description("Prismatic"))
            .variant("dirt_raw", variant -> variant
                    .description("Raw"))
            .variant("dirt_road", variant -> variant
                    .description("Road"))
            .variant("dirt_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dirt_tiles", variant -> variant
                    .description("Tiles"))
            .variant("dirt_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("dirt_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("dirt_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("dirt_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("dirt_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_medallion", variant -> variant
                    .description("Medallion"))
            .variant("dirt_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_dots", variant -> variant
                    .description("Dots"))
            .variant("dirt_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_heart", variant -> variant
                    .description("Heart"))
            .variant("dirt_star", variant -> variant
                    .description("Star"))
            .variant("dirt_plating", variant -> variant
                    .description("Plating"))
            .variant("dirt_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("dirt_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_plank", variant -> variant
                    .description("Plank"))
            .variant("dirt_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_frame", variant -> variant
                    .description("Frame"))
            .variant("dirt_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("dirt_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("dirt_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("dirt_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("dirt_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("dirt_stripes", variant -> variant
                    .description("Stripes"))
            .variant("dirt_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("dirt_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("dirt_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("dirt_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("dirt_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("dirt_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("dirt_facet", variant -> variant
                    .description("Facet"))
            .variant("dirt_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("dirt_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_shiny", variant -> variant
                    .description("Shiny"))
            .variant("dirt_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_gem", variant -> variant
                    .description("Gem"))
            .variant("dirt_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("dirt_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("dirt_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("dirt_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("dirt_slab", variant -> variant
                    .description("Slab"))
            .variant("dirt_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("dirt_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("dirt_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dirt_parquet", variant -> variant
                    .description("Parquet"))
            .variant("dirt_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("dirt_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("dirt_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private DirtFamily() {
    }
}
