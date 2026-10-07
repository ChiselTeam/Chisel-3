package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PackedIceFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("packed_ice", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE))
                    .blockName("Packed Ice"))
            .existingBlock(Blocks.PACKED_ICE)
            .variant("packed_ice_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("packed_ice_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_braid", variant -> variant
                    .description("Braid"))
            .variant("packed_ice_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("packed_ice_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("packed_ice_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("packed_ice_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("packed_ice_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("packed_ice_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("packed_ice_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("packed_ice_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("packed_ice_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("packed_ice_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("packed_ice_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("packed_ice_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("packed_ice_checker", variant -> variant
                    .description("Checker"))
            .variant("packed_ice_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("packed_ice_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_cracked", variant -> variant
                    .description("Cracked"))
            .variant("packed_ice_cobble", variant -> variant
                    .description("Cobble"))
            .variant("packed_ice_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("packed_ice_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_french_1", variant -> variant
                    .description("French 1"))
            .variant("packed_ice_french_2", variant -> variant
                    .description("French 2"))
            .variant("packed_ice_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("packed_ice_layers", variant -> variant
                    .description("Layers"))
            .variant("packed_ice_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("packed_ice_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("packed_ice_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("packed_ice_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_meander_vertical-side")))
            .variant("packed_ice_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("packed_ice_panel", variant -> variant
                    .description("Panel"))
            .variant("packed_ice_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("packed_ice_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_basic-side")))
            .variant("packed_ice_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_basic_dent-side")))
            .variant("packed_ice_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_basic_plain-side")))
            .variant("packed_ice_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_basic_round-side")))
            .variant("packed_ice_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_basic_spiral-side")))
            .variant("packed_ice_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("packed_ice_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("packed_ice_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_ionic-side")))
            .variant("packed_ice_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_ionic_dent-side")))
            .variant("packed_ice_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_ionic_plain-side")))
            .variant("packed_ice_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_ionic_round-side")))
            .variant("packed_ice_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_ionic_spiral-side")))
            .variant("packed_ice_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_large_basic_triple-side")))
            .variant("packed_ice_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_large_ionic_triple-side")))
            .variant("packed_ice_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_meander-side")))
            .variant("packed_ice_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_meander_dent-side")))
            .variant("packed_ice_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_meander_plain-side")))
            .variant("packed_ice_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_meander_round-side")))
            .variant("packed_ice_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/packed_ice/packed_ice_pillar_meander_spiral-side")))
            .variant("packed_ice_plate", variant -> variant
                    .description("Plate"))
            .variant("packed_ice_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_polished", variant -> variant
                    .description("Polished"))
            .variant("packed_ice_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_prism", variant -> variant
                    .description("Prismatic"))
            .variant("packed_ice_raw", variant -> variant
                    .description("Raw"))
            .variant("packed_ice_road", variant -> variant
                    .description("Road"))
            .variant("packed_ice_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("packed_ice_tiles", variant -> variant
                    .description("Tiles"))
            .variant("packed_ice_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("packed_ice_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("packed_ice_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("packed_ice_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("packed_ice_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_medallion", variant -> variant
                    .description("Medallion"))
            .variant("packed_ice_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_dots", variant -> variant
                    .description("Dots"))
            .variant("packed_ice_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_heart", variant -> variant
                    .description("Heart"))
            .variant("packed_ice_star", variant -> variant
                    .description("Star"))
            .variant("packed_ice_plating", variant -> variant
                    .description("Plating"))
            .variant("packed_ice_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("packed_ice_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_plank", variant -> variant
                    .description("Plank"))
            .variant("packed_ice_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_frame", variant -> variant
                    .description("Frame"))
            .variant("packed_ice_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("packed_ice_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("packed_ice_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("packed_ice_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("packed_ice_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("packed_ice_stripes", variant -> variant
                    .description("Stripes"))
            .variant("packed_ice_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("packed_ice_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("packed_ice_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("packed_ice_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("packed_ice_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("packed_ice_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("packed_ice_facet", variant -> variant
                    .description("Facet"))
            .variant("packed_ice_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("packed_ice_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_shiny", variant -> variant
                    .description("Shiny"))
            .variant("packed_ice_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_gem", variant -> variant
                    .description("Gem"))
            .variant("packed_ice_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("packed_ice_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("packed_ice_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("packed_ice_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("packed_ice_slab", variant -> variant
                    .description("Slab"))
            .variant("packed_ice_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("packed_ice_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("packed_ice_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("packed_ice_parquet", variant -> variant
                    .description("Parquet"))
            .variant("packed_ice_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("packed_ice_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("packed_ice_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private PackedIceFamily() {
    }
}
