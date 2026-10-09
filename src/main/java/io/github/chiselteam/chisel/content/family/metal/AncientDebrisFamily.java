package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class AncientDebrisFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("ancient_debris", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS))
                    .blockName("Ancient Debris"))
            .existingBlock(Blocks.ANCIENT_DEBRIS)
            .variant("ancient_debris_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_debris_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_braid", variant -> variant
                    .description("Braid"))
            .variant("ancient_debris_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("ancient_debris_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("ancient_debris_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("ancient_debris_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_debris_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("ancient_debris_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("ancient_debris_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("ancient_debris_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("ancient_debris_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("ancient_debris_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("ancient_debris_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("ancient_debris_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("ancient_debris_checker", variant -> variant
                    .description("Checker"))
            .variant("ancient_debris_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("ancient_debris_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_cracked", variant -> variant
                    .description("Cracked"))
            .variant("ancient_debris_cobble", variant -> variant
                    .description("Cobble"))
            .variant("ancient_debris_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("ancient_debris_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_french_1", variant -> variant
                    .description("French 1"))
            .variant("ancient_debris_french_2", variant -> variant
                    .description("French 2"))
            .variant("ancient_debris_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_debris_layers", variant -> variant
                    .description("Layers"))
            .variant("ancient_debris_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("ancient_debris_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("ancient_debris_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("ancient_debris_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_meander_vertical-side")))
            .variant("ancient_debris_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("ancient_debris_panel", variant -> variant
                    .description("Panel"))
            .variant("ancient_debris_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("ancient_debris_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_basic-side")))
            .variant("ancient_debris_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_basic_dent-side")))
            .variant("ancient_debris_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_basic_plain-side")))
            .variant("ancient_debris_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_basic_round-side")))
            .variant("ancient_debris_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_basic_spiral-side")))
            .variant("ancient_debris_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("ancient_debris_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("ancient_debris_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_ionic-side")))
            .variant("ancient_debris_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_ionic_dent-side")))
            .variant("ancient_debris_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_ionic_plain-side")))
            .variant("ancient_debris_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_ionic_round-side")))
            .variant("ancient_debris_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_ionic_spiral-side")))
            .variant("ancient_debris_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_large_basic_triple-side")))
            .variant("ancient_debris_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_large_ionic_triple-side")))
            .variant("ancient_debris_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_meander-side")))
            .variant("ancient_debris_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_meander_dent-side")))
            .variant("ancient_debris_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_meander_plain-side")))
            .variant("ancient_debris_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_meander_round-side")))
            .variant("ancient_debris_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ancient_debris/ancient_debris_pillar_meander_spiral-side")))
            .variant("ancient_debris_plate", variant -> variant
                    .description("Plate"))
            .variant("ancient_debris_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_polished", variant -> variant
                    .description("Polished"))
            .variant("ancient_debris_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_prism", variant -> variant
                    .description("Prismatic"))
            .variant("ancient_debris_raw", variant -> variant
                    .description("Raw"))
            .variant("ancient_debris_road", variant -> variant
                    .description("Road"))
            .variant("ancient_debris_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_debris_tiles", variant -> variant
                    .description("Tiles"))
            .variant("ancient_debris_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("ancient_debris_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("ancient_debris_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("ancient_debris_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("ancient_debris_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_medallion", variant -> variant
                    .description("Medallion"))
            .variant("ancient_debris_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_dots", variant -> variant
                    .description("Dots"))
            .variant("ancient_debris_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_heart", variant -> variant
                    .description("Heart"))
            .variant("ancient_debris_star", variant -> variant
                    .description("Star"))
            .variant("ancient_debris_plating", variant -> variant
                    .description("Plating"))
            .variant("ancient_debris_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("ancient_debris_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_plank", variant -> variant
                    .description("Plank"))
            .variant("ancient_debris_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_frame", variant -> variant
                    .description("Frame"))
            .variant("ancient_debris_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("ancient_debris_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("ancient_debris_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("ancient_debris_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("ancient_debris_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("ancient_debris_stripes", variant -> variant
                    .description("Stripes"))
            .variant("ancient_debris_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("ancient_debris_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("ancient_debris_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("ancient_debris_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("ancient_debris_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("ancient_debris_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("ancient_debris_facet", variant -> variant
                    .description("Facet"))
            .variant("ancient_debris_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("ancient_debris_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_shiny", variant -> variant
                    .description("Shiny"))
            .variant("ancient_debris_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_gem", variant -> variant
                    .description("Gem"))
            .variant("ancient_debris_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("ancient_debris_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("ancient_debris_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("ancient_debris_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("ancient_debris_slab", variant -> variant
                    .description("Slab"))
            .variant("ancient_debris_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("ancient_debris_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("ancient_debris_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_debris_parquet", variant -> variant
                    .description("Parquet"))
            .variant("ancient_debris_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ancient_debris_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("ancient_debris_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private AncientDebrisFamily() {
    }
}
