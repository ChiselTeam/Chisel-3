package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SoulSoilFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("soul_soil", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SOIL))
                    .blockName("Soul Soil"))
            .existingBlock(Blocks.SOUL_SOIL)
            .variant("soul_soil_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("soul_soil_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_border_square_small", variant -> variant
                    .description("Small Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_braid", variant -> variant
                    .description("Braid"))
            .variant("soul_soil_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("soul_soil_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("soul_soil_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("soul_soil_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("soul_soil_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("soul_soil_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("soul_soil_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("soul_soil_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("soul_soil_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("soul_soil_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("soul_soil_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("soul_soil_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("soul_soil_checker", variant -> variant
                    .description("Checker"))
            .variant("soul_soil_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("soul_soil_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_cracked", variant -> variant
                    .description("Cracked"))
            .variant("soul_soil_cobble", variant -> variant
                    .description("Cobble"))
            .variant("soul_soil_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("soul_soil_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_french_1", variant -> variant
                    .description("French 1"))
            .variant("soul_soil_french_2", variant -> variant
                    .description("French 2"))
            .variant("soul_soil_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("soul_soil_layers", variant -> variant
                    .description("Layers"))
            .variant("soul_soil_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("soul_soil_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("soul_soil_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("soul_soil_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_meander_vertical-side")))
            .variant("soul_soil_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("soul_soil_panel", variant -> variant
                    .description("Panel"))
            .variant("soul_soil_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("soul_soil_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_basic-side")))
            .variant("soul_soil_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_basic_dent-side")))
            .variant("soul_soil_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_basic_plain-side")))
            .variant("soul_soil_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_basic_round-side")))
            .variant("soul_soil_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_basic_spiral-side")))
            .variant("soul_soil_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("soul_soil_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("soul_soil_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_ionic-side")))
            .variant("soul_soil_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_ionic_dent-side")))
            .variant("soul_soil_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_ionic_plain-side")))
            .variant("soul_soil_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_ionic_round-side")))
            .variant("soul_soil_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_ionic_spiral-side")))
            .variant("soul_soil_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_large_basic_triple-side")))
            .variant("soul_soil_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_large_ionic_triple-side")))
            .variant("soul_soil_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_meander-side")))
            .variant("soul_soil_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_meander_dent-side")))
            .variant("soul_soil_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_meander_plain-side")))
            .variant("soul_soil_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_meander_round-side")))
            .variant("soul_soil_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/soul_soil/soul_soil_pillar_meander_spiral-side")))
            .variant("soul_soil_plate", variant -> variant
                    .description("Plate"))
            .variant("soul_soil_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_polished", variant -> variant
                    .description("Polished"))
            .variant("soul_soil_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_prism", variant -> variant
                    .description("Prismatic"))
            .variant("soul_soil_raw", variant -> variant
                    .description("Raw"))
            .variant("soul_soil_road", variant -> variant
                    .description("Road"))
            .variant("soul_soil_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("soul_soil_tiles", variant -> variant
                    .description("Tiles"))
            .variant("soul_soil_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("soul_soil_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("soul_soil_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("soul_soil_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("soul_soil_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_medallion", variant -> variant
                    .description("Medallion"))
            .variant("soul_soil_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_dots", variant -> variant
                    .description("Dots"))
            .variant("soul_soil_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_heart", variant -> variant
                    .description("Heart"))
            .variant("soul_soil_star", variant -> variant
                    .description("Star"))
            .variant("soul_soil_plating", variant -> variant
                    .description("Plating"))
            .variant("soul_soil_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("soul_soil_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_plank", variant -> variant
                    .description("Plank"))
            .variant("soul_soil_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_frame", variant -> variant
                    .description("Frame"))
            .variant("soul_soil_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("soul_soil_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("soul_soil_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("soul_soil_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("soul_soil_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("soul_soil_stripes", variant -> variant
                    .description("Stripes"))
            .variant("soul_soil_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("soul_soil_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("soul_soil_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("soul_soil_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("soul_soil_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("soul_soil_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("soul_soil_facet", variant -> variant
                    .description("Facet"))
            .variant("soul_soil_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("soul_soil_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_shiny", variant -> variant
                    .description("Shiny"))
            .variant("soul_soil_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_gem", variant -> variant
                    .description("Gem"))
            .variant("soul_soil_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("soul_soil_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("soul_soil_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("soul_soil_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("soul_soil_slab", variant -> variant
                    .description("Slab"))
            .variant("soul_soil_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("soul_soil_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("soul_soil_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("soul_soil_parquet", variant -> variant
                    .description("Parquet"))
            .variant("soul_soil_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("soul_soil_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("soul_soil_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private SoulSoilFamily() {
    }
}
