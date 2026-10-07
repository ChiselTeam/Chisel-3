package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class IceFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("ice", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.ICE))
                    .blockName("Ice"))
            .existingBlock(Blocks.ICE)
            .variant("ice_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ice_border_square", variant -> variant
                    .description("Square Border")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_braid", variant -> variant
                    .description("Braid"))
            .variant("ice_braid_encased", variant -> variant
                    .description("Encased Braid")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_bricks_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("ice_bricks_encased", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_bricks_indent", variant -> variant
                    .description("Indent Bricks"))
            .variant("ice_bricks_inlayed", variant -> variant
                    .description("Inlayed Bricks"))
            .variant("ice_bricks_large", variant -> variant
                    .description("Large Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ice_bricks_small", variant -> variant
                    .description("Small Bricks"))
            .variant("ice_bricks_soft", variant -> variant
                    .description("Soft Bricks"))
            .variant("ice_bricks_solid", variant -> variant
                    .description("Solid Bricks"))
            .variant("ice_bricks_triple", variant -> variant
                    .description("Triple Bricks"))
            .variant("ice_bricks_vertical", variant -> variant
                    .description("Vertical Bricks"))
            .variant("ice_chaotic", variant -> variant
                    .description("Chaotic")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3))
            .variant("ice_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("ice_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("ice_checker", variant -> variant
                    .description("Checker"))
            .variant("ice_checker_small", variant -> variant
                    .description("Small Checker"))
            .variant("ice_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_cracked", variant -> variant
                    .description("Cracked"))
            .variant("ice_cobble", variant -> variant
                    .description("Cobble"))
            .variant("ice_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4))
            .variant("ice_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_french_1", variant -> variant
                    .description("French 1"))
            .variant("ice_french_2", variant -> variant
                    .description("French 2"))
            .variant("ice_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ice_layers", variant -> variant
                    .description("Layers"))
            .variant("ice_layers_connected", variant -> variant
                    .description("Layers Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_line_horizontal", variant -> variant
                    .description("Horizontal Line"))
            .variant("ice_line_vertical", variant -> variant
                    .description("Vertical Line"))
            .variant("ice_meander_horizontal", variant -> variant
                    .description("Horizontal Meander")
                    .model(ChiselModelHandlers.CTMH))
            .variant("ice_meander_vertical", variant -> variant
                    .description("Vertical Meander")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_meander_vertical-side")))
            .variant("ice_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_ornate_small", variant -> variant
                    .description("Small Ornate"))
            .variant("ice_panel", variant -> variant
                    .description("Panel"))
            .variant("ice_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("ice_pillar_basic", variant -> variant
                    .description("Basic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_basic-side")))
            .variant("ice_pillar_basic_dent", variant -> variant
                    .description("Basic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_basic_dent-side")))
            .variant("ice_pillar_basic_plain", variant -> variant
                    .description("Basic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_basic_plain-side")))
            .variant("ice_pillar_basic_round", variant -> variant
                    .description("Basic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_basic_round-side")))
            .variant("ice_pillar_basic_spiral", variant -> variant
                    .description("Basic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_basic_spiral-side")))
            .variant("ice_pillar_classic", variant -> variant
                    .description("Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("ice_pillar_classic_large", variant -> variant
                    .description("Large Classic Pillar")
                    .model(ChiselModelHandlers.TBS))
            .variant("ice_pillar_ionic", variant -> variant
                    .description("Ionic Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_ionic-side")))
            .variant("ice_pillar_ionic_dent", variant -> variant
                    .description("Ionic Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_ionic_dent-side")))
            .variant("ice_pillar_ionic_plain", variant -> variant
                    .description("Ionic Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_ionic_plain-side")))
            .variant("ice_pillar_ionic_round", variant -> variant
                    .description("Ionic Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_ionic_round-side")))
            .variant("ice_pillar_ionic_spiral", variant -> variant
                    .description("Ionic Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_ionic_spiral-side")))
            .variant("ice_pillar_large_basic_triple", variant -> variant
                    .description("Large Basic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_large_basic_triple-side")))
            .variant("ice_pillar_large_ionic_triple", variant -> variant
                    .description("Large Ionic Triple Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_large_ionic_triple-side")))
            .variant("ice_pillar_meander", variant -> variant
                    .description("Meander Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_meander-side")))
            .variant("ice_pillar_meander_dent", variant -> variant
                    .description("Meander Dent Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_meander_dent-side")))
            .variant("ice_pillar_meander_plain", variant -> variant
                    .description("Meander Plain Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_meander_plain-side")))
            .variant("ice_pillar_meander_round", variant -> variant
                    .description("Meander Round Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_meander_round-side")))
            .variant("ice_pillar_meander_spiral", variant -> variant
                    .description("Meander Spiral Pillar")
                    .model(ChiselModelHandlers.CTMV)
                    .texture("vertical_none", Chisel.prefix("block/ice/ice_pillar_meander_spiral-side")))
            .variant("ice_plate", variant -> variant
                    .description("Plate"))
            .variant("ice_plate_connected", variant -> variant
                    .description("Plate Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_polished", variant -> variant
                    .description("Polished"))
            .variant("ice_polished_encased", variant -> variant
                    .description("Polished Encased")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_prism", variant -> variant
                    .description("Prismatic"))
            .variant("ice_raw", variant -> variant
                    .description("Raw"))
            .variant("ice_road", variant -> variant
                    .description("Road"))
            .variant("ice_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ice_tiles", variant -> variant
                    .description("Tiles"))
            .variant("ice_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("ice_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS))
            .variant("ice_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.V4))
            .variant("ice_crate", variant -> variant
                    .description("Crate")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_herringbone", variant -> variant
                    .description("Herringbone"))
            .variant("ice_herringbone_encased", variant -> variant
                    .description("Encased Herringbone")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_medallion", variant -> variant
                    .description("Medallion"))
            .variant("ice_medallion_encased", variant -> variant
                    .description("Encased Medallion")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_dots", variant -> variant
                    .description("Dots"))
            .variant("ice_dots_encased", variant -> variant
                    .description("Encased Dots")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_heart", variant -> variant
                    .description("Heart"))
            .variant("ice_star", variant -> variant
                    .description("Star"))
            .variant("ice_plating", variant -> variant
                    .description("Plating"))
            .variant("ice_lodestone", variant -> variant
                    .description("Lodestone"))
            .variant("ice_lodestone_connected", variant -> variant
                    .description("Lodestone Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_plank", variant -> variant
                    .description("Plank"))
            .variant("ice_plank_connected", variant -> variant
                    .description("Plank Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_frame", variant -> variant
                    .description("Frame"))
            .variant("ice_panel_1", variant -> variant
                    .description("Panel 1"))
            .variant("ice_panel_2", variant -> variant
                    .description("Panel 2"))
            .variant("ice_panel_3", variant -> variant
                    .description("Panel 3"))
            .variant("ice_skull_creeper", variant -> variant
                    .description("Creeper Skull"))
            .variant("ice_skull_skeleton", variant -> variant
                    .description("Skeleton Skull"))
            .variant("ice_stripes", variant -> variant
                    .description("Stripes"))
            .variant("ice_stripes_encased", variant -> variant
                    .description("Encased Stripes")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_chisel_1", variant -> variant
                    .description("Chisel 1"))
            .variant("ice_chisel_2", variant -> variant
                    .description("Chisel 2"))
            .variant("ice_chisel_3", variant -> variant
                    .description("Chisel 3"))
            .variant("ice_chisel_4", variant -> variant
                    .description("Chisel 4"))
            .variant("ice_chisel_5", variant -> variant
                    .description("Chisel 5"))
            .variant("ice_chisel_6", variant -> variant
                    .description("Chisel 6"))
            .variant("ice_facet", variant -> variant
                    .description("Facet"))
            .variant("ice_facet_small", variant -> variant
                    .description("Small Facet"))
            .variant("ice_facet_small_encased", variant -> variant
                    .description("Encased Small Facet")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_shiny", variant -> variant
                    .description("Shiny"))
            .variant("ice_shiny_connected", variant -> variant
                    .description("Shiny Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_gem", variant -> variant
                    .description("Gem"))
            .variant("ice_gem_1", variant -> variant
                    .description("Gem 1"))
            .variant("ice_gem_1_connected", variant -> variant
                    .description("Gem 1 Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_gem_2", variant -> variant
                    .description("Gem 2"))
            .variant("ice_gem_2_connected", variant -> variant
                    .description("Gem 2 Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_gem_3", variant -> variant
                    .description("Gem 3"))
            .variant("ice_gem_3_connected", variant -> variant
                    .description("Gem 3 Connected")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_bricks_square", variant -> variant
                    .description("Square Bricks"))
            .variant("ice_slab", variant -> variant
                    .description("Slab"))
            .variant("ice_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("ice_scaffold_encased", variant -> variant
                    .description("Encased Scaffold")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_tiles_inlayed", variant -> variant
                    .description("Inlayed Tiles"))
            .variant("ice_waves", variant -> variant
                    .description("Waves")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ice_parquet", variant -> variant
                    .description("Parquet"))
            .variant("ice_parquet_encased", variant -> variant
                    .description("Encased Parquet")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_bricks_large_rough", variant -> variant
                    .description("Large Rough Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2))
            .variant("ice_tiles_small_encased", variant -> variant
                    .description("Encased Small Tiles")
                    .model(ChiselModelHandlers.ICE))
            .variant("ice_bricks_round", variant -> variant
                    .description("Round Bricks")));

    private IceFamily() {
    }
}
