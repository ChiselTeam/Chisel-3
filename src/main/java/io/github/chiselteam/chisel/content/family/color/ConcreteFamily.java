package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.text.WordUtils;

public final class ConcreteFamily {
    private ConcreteFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var colorName = WordUtils.capitalize(color.getName().replace("_", " "));
        var concreteName = "concrete_%s".formatted(color.getName());
        var baseName = "%s Concrete".formatted(colorName);
        return ChiselFamily.build(concreteName, builder -> builder
                .defaults(variant -> variant
                        .properties(BlockBehaviour.Properties.ofFullCopy(getVanillaConcrete(color)))
                        .blockName(baseName))
                .existingBlock(getVanillaConcrete(color))
                .variant("%s_array".formatted(concreteName), variant -> variant
                        .description("Array")
                        .model(ChiselModelHandlers.MULTIBLOCK_2X2))
                .variant("%s_border_square".formatted(concreteName), variant -> variant
                        .description("Square Border")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_dent-ctm_cornerless".formatted(color.getName(), color.getName()))))
                .variant("%s_braid".formatted(concreteName), variant -> variant
                        .description("Braid"))
                .variant("%s_braid_encased".formatted(concreteName), variant -> variant
                        .description("Encased Braid")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_bricks_cracked".formatted(concreteName), variant -> variant
                        .description("Cracked Bricks"))
                .variant("%s_bricks_encased".formatted(concreteName), variant -> variant
                        .description("Encased Bricks")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_bricks_indent".formatted(concreteName), variant -> variant
                        .description("Indent Bricks"))
                .variant("%s_bricks_inlayed".formatted(concreteName), variant -> variant
                        .description("Inlayed Bricks"))
                .variant("%s_bricks_large".formatted(concreteName), variant -> variant
                        .description("Large Bricks")
                        .model(ChiselModelHandlers.MULTIBLOCK_2X2))
                .variant("%s_bricks_small".formatted(concreteName), variant -> variant
                        .description("Small Bricks"))
                .variant("%s_bricks_soft".formatted(concreteName), variant -> variant
                        .description("Soft Bricks"))
                .variant("%s_bricks_solid".formatted(concreteName), variant -> variant
                        .description("Solid Bricks"))
                .variant("%s_bricks_triple".formatted(concreteName), variant -> variant
                        .description("Triple Bricks"))
                .variant("%s_bricks_vertical".formatted(concreteName), variant -> variant
                        .description("Vertical Bricks"))
                .variant("%s_chaotic".formatted(concreteName), variant -> variant
                        .description("Chaotic")
                        .model(ChiselModelHandlers.MULTIBLOCK_3X3))
                .variant("%s_chaotic_medium".formatted(concreteName), variant -> variant
                        .description("Chaotic Medium"))
                .variant("%s_chaotic_small".formatted(concreteName), variant -> variant
                        .description("Chaotic Small"))
                .variant("%s_checker".formatted(concreteName), variant -> variant
                        .description("Checker"))
                .variant("%s_checker_small".formatted(concreteName), variant -> variant
                        .description("Small Checker"))
                .variant("%s_circular".formatted(concreteName), variant -> variant
                        .description("Circular")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_dent-ctm_cornerless".formatted(color.getName(), color.getName()))))
                .variant("%s_cobble".formatted(concreteName), variant -> variant
                        .description("Cobble"))
                .variant("%s_cuts".formatted(concreteName), variant -> variant
                        .description("Cuts")
                        .model(ChiselModelHandlers.MULTIBLOCK_4X4))
                .variant("%s_dent".formatted(concreteName), variant -> variant
                        .description("Dent")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_french_1".formatted(concreteName), variant -> variant
                        .description("French 1"))
                .variant("%s_french_2".formatted(concreteName), variant -> variant
                        .description("French 2"))
                .variant("%s_indent".formatted(concreteName), variant -> variant
                        .description("Indent")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_dent-ctm_cornerless".formatted(color.getName(), color.getName()))))
                .variant("%s_jellybean".formatted(concreteName), variant -> variant
                        .description("Jellybean")
                        .model(ChiselModelHandlers.MULTIBLOCK_2X2))
                .variant("%s_layers".formatted(concreteName), variant -> variant
                        .description("Layers"))
                .variant("%s_layers_connected".formatted(concreteName), variant -> variant
                        .description("Layers Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_layers_connected-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_layers_connected".formatted(color.getName(), color.getName())))
                        .textureAlias("ctm_vertical", "ctm_cornerless"))
                .variant("%s_line_horizontal".formatted(concreteName), variant -> variant
                        .description("Horizontal Line"))
                .variant("%s_line_vertical".formatted(concreteName), variant -> variant
                        .description("Vertical Line"))
                .variant("%s_meander_horizontal".formatted(concreteName), variant -> variant
                        .description("Horizontal Meander")
                        .model(ChiselModelHandlers.CTMH)
                        .texture("bottom", Chisel.prefix("block/concrete_%s/concrete_%s_meander_horizontal-top".formatted(color.getName(), color.getName()))))
                .variant("%s_meander_vertical".formatted(concreteName), variant -> variant
                        .description("Vertical Meander")
                        .model(ChiselModelHandlers.CTMV)
                        .texture("bottom", Chisel.prefix("block/concrete_%s/concrete_%s_meander_vertical-top".formatted(color.getName(), color.getName()))))
                .variant("%s_mosaic".formatted(concreteName), variant -> variant
                        .description("Mosaic")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_dent-ctm_cornerless".formatted(color.getName(), color.getName()))))
                .variant("%s_ornate_small".formatted(concreteName), variant -> variant
                        .description("Small Ornate"))
                .variant("%s_panel".formatted(concreteName), variant -> variant
                        .description("Panel"))
                .variant("%s_pillar".formatted(concreteName), variant -> variant
                        .description("Pillar")
                        .model(ChiselModelHandlers.TBS)
                        .texture("bottom", Chisel.prefix("block/concrete_%s/concrete_%s_pillar-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_basic".formatted(concreteName), variant -> variant
                        .description("Basic Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .texture("bottom", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_basic_dent".formatted(concreteName), variant -> variant
                        .description("Basic Dent Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_basic_plain".formatted(concreteName), variant -> variant
                        .description("Basic Plain Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_basic_round".formatted(concreteName), variant -> variant
                        .description("Basic Round Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_basic_spiral".formatted(concreteName), variant -> variant
                        .description("Basic Spiral Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_classic".formatted(concreteName), variant -> variant
                        .description("Classic Pillar")
                        .model(ChiselModelHandlers.TBS)
                        .texture("bottom", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_classic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_classic_large".formatted(concreteName), variant -> variant
                        .description("Large Classic Pillar")
                        .model(ChiselModelHandlers.TBS)
                        .texture("bottom", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_classic_large-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_ionic".formatted(concreteName), variant -> variant
                        .description("Ionic Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_ionic_dent".formatted(concreteName), variant -> variant
                        .description("Ionic Dent Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_dent-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_ionic_plain".formatted(concreteName), variant -> variant
                        .description("Ionic Plain Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_plain-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_ionic_round".formatted(concreteName), variant -> variant
                        .description("Ionic Round Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_round-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_ionic_spiral".formatted(concreteName), variant -> variant
                        .description("Ionic Spiral Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_spiral-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_large_basic_triple".formatted(concreteName), variant -> variant
                        .description("Large Basic Triple Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_large_ionic_triple".formatted(concreteName), variant -> variant
                        .description("Large Ionic Triple Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_large_basic_triple-vertical_both".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_meander".formatted(concreteName), variant -> variant
                        .description("Meander Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_ionic-vertical_both".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_meander_dent".formatted(concreteName), variant -> variant
                        .description("Meander Dent Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_dent-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_meander_plain".formatted(concreteName), variant -> variant
                        .description("Meander Plain Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_plain-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_meander_round".formatted(concreteName), variant -> variant
                        .description("Meander Round Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_round-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_pillar_meander_spiral".formatted(concreteName), variant -> variant
                        .description("Meander Spiral Pillar")
                        .model(ChiselModelHandlers.CTMV)
                        .textureAlias("bottom", "top")
                        .texture("side", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-side".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic-top".formatted(color.getName(), color.getName())))
                        .texture("vertical_both", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_basic_spiral-vertical_both".formatted(color.getName(), color.getName())))
                        .texture("vertical_none", Chisel.prefix("block/concrete_%s/concrete_%s_pillar_meander-vertical_none".formatted(color.getName(), color.getName()))))
                .variant("%s_plate".formatted(concreteName), variant -> variant
                        .description("Plate"))
                .variant("%s_plate_connected".formatted(concreteName), variant -> variant
                        .description("Plate Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_gem_1_connected-ctm_cornerless".formatted(color.getName(), color.getName()))))
                .variant("%s_polished".formatted(concreteName), variant -> variant
                        .description("Polished"))
                .variant("%s_polished_encased".formatted(concreteName), variant -> variant
                        .description("Polished Encased")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_prism".formatted(concreteName), variant -> variant
                        .description("Prismatic"))
                .variant("%s_raw".formatted(concreteName), variant -> variant
                        .description("Raw"))
                .variant("%s_road".formatted(concreteName), variant -> variant
                        .description("Road"))
                .variant("%s_slanted".formatted(concreteName), variant -> variant
                        .description("Slanted")
                        .model(ChiselModelHandlers.MULTIBLOCK_2X2))
                .variant("%s_tiles".formatted(concreteName), variant -> variant
                        .description("Tiles"))
                .variant("%s_tiles_large".formatted(concreteName), variant -> variant
                        .description("Large Tiles")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture(Chisel.prefix("block/concrete_%s/concrete_%s_polished".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/concrete_%s/concrete_%s_tiles_large-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_dent-ctm_cornerless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_tiles_large-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/concrete_%s/concrete_%s_tiles_large-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_tiles_small".formatted(concreteName), variant -> variant
                        .description("Small Tiles"))
                .variant("%s_twisted".formatted(concreteName), variant -> variant
                        .description("Twisted")
                        .model(ChiselModelHandlers.TBS)
                        .texture("bottom", Chisel.prefix("block/concrete_%s/concrete_%s_twisted-top".formatted(color.getName(), color.getName()))))
                .variant("%s_weaver".formatted(concreteName), variant -> variant
                        .description("Weaver")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_zag".formatted(concreteName), variant -> variant
                        .description("Zag")
                        .model(ChiselModelHandlers.MULTIBLOCK_2X2))
                .variant("%s_crate".formatted(concreteName), variant -> variant
                        .description("Crate")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_herringbone".formatted(concreteName), variant -> variant
                        .description("Herringbone"))
                .variant("%s_herringbone_encased".formatted(concreteName), variant -> variant
                        .description("Encased Herringbone")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_herringbone".formatted(color.getName(), color.getName()))))
                .variant("%s_medallion".formatted(concreteName), variant -> variant
                        .description("Medallion"))
                .variant("%s_medallion_encased".formatted(concreteName), variant -> variant
                        .description("Encased Medallion")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_medallion".formatted(color.getName(), color.getName()))))
                .variant("%s_dots".formatted(concreteName), variant -> variant
                        .description("Dots"))
                .variant("%s_dots_encased".formatted(concreteName), variant -> variant
                        .description("Encased Dots")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_dots".formatted(color.getName(), color.getName()))))
                .variant("%s_heart".formatted(concreteName), variant -> variant
                        .description("Heart"))
                .variant("%s_star".formatted(concreteName), variant -> variant
                        .description("Star"))
                .variant("%s_plating".formatted(concreteName), variant -> variant
                        .description("Plating"))
                .variant("%s_lodestone".formatted(concreteName), variant -> variant
                        .description("Lodestone"))
                .variant("%s_lodestone_connected".formatted(concreteName), variant -> variant
                        .description("Lodestone Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture(Chisel.prefix("block/concrete_%s/concrete_%s_lodestone".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/concrete_%s/concrete_%s_lodestone_connected-ctm_corner".formatted(color.getName(), color.getName())))
                        .textureFromBase("ctm_cornerless")
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_lodestone_connected-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/concrete_%s/concrete_%s_lodestone_connected-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_plank".formatted(concreteName), variant -> variant
                        .description("Plank"))
                .variant("%s_plank_connected".formatted(concreteName), variant -> variant
                        .description("Plank Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture(Chisel.prefix("block/concrete_%s/concrete_%s_plank".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/concrete_%s/concrete_%s_plank_connected-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_plank_connected-ctm_cornerless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_plank_connected-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/concrete_%s/concrete_%s_plank_connected-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_frame".formatted(concreteName), variant -> variant
                        .description("Frame"))
                .variant("%s_panel_1".formatted(concreteName), variant -> variant
                        .description("Panel 1"))
                .variant("%s_panel_2".formatted(concreteName), variant -> variant
                        .description("Panel 2"))
                .variant("%s_panel_3".formatted(concreteName), variant -> variant
                        .description("Panel 3"))
                .variant("%s_skull_creeper".formatted(concreteName), variant -> variant
                        .description("Creeper Skull"))
                .variant("%s_skull_skeleton".formatted(concreteName), variant -> variant
                        .description("Skeleton Skull"))
                .variant("%s_stripes".formatted(concreteName), variant -> variant
                        .description("Stripes"))
                .variant("%s_stripes_encased".formatted(concreteName), variant -> variant
                        .description("Encased Stripes")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_stripes".formatted(color.getName(), color.getName()))))
                .variant("%s_chisel_1".formatted(concreteName), variant -> variant
                        .description("Chisel 1"))
                .variant("%s_chisel_2".formatted(concreteName), variant -> variant
                        .description("Chisel 2"))
                .variant("%s_chisel_3".formatted(concreteName), variant -> variant
                        .description("Chisel 3"))
                .variant("%s_chisel_4".formatted(concreteName), variant -> variant
                        .description("Chisel 4"))
                .variant("%s_chisel_5".formatted(concreteName), variant -> variant
                        .description("Chisel 5"))
                .variant("%s_chisel_6".formatted(concreteName), variant -> variant
                        .description("Chisel 6"))
                .variant("%s_facet".formatted(concreteName), variant -> variant
                        .description("Facet"))
                .variant("%s_facet_small".formatted(concreteName), variant -> variant
                        .description("Small Facet"))
                .variant("%s_facet_small_encased".formatted(concreteName), variant -> variant
                        .description("Encased Small Facet")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_facet_small".formatted(color.getName(), color.getName()))))
                .variant("%s_shiny".formatted(concreteName), variant -> variant
                        .description("Shiny"))
                .variant("%s_shiny_connected".formatted(concreteName), variant -> variant
                        .description("Shiny Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture(Chisel.prefix("block/concrete_%s/concrete_%s_shiny".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/concrete_%s/concrete_%s_shiny_connected-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_shiny_connected-ctm_cornerless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_shiny_connected-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/concrete_%s/concrete_%s_shiny_connected-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_gem".formatted(concreteName), variant -> variant
                        .description("Gem"))
                .variant("%s_gem_1".formatted(concreteName), variant -> variant
                        .description("Gem 1"))
                .variant("%s_gem_1_connected".formatted(concreteName), variant -> variant
                        .description("Gem 1 Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture(Chisel.prefix("block/concrete_%s/concrete_%s_gem_1".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/concrete_%s/concrete_%s_gem_1_connected-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_gem_1_connected-ctm_cornerless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_gem_1_connected-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/concrete_%s/concrete_%s_gem_1_connected-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_gem_2".formatted(concreteName), variant -> variant
                        .description("Gem 2"))
                .variant("%s_gem_2_connected".formatted(concreteName), variant -> variant
                        .description("Gem 2 Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture(Chisel.prefix("block/concrete_%s/concrete_%s_gem_2".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/concrete_%s/concrete_%s_gem_2_connected-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_gem_1_connected-ctm_cornerless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_gem_2_connected-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/concrete_%s/concrete_%s_gem_2_connected-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_gem_3".formatted(concreteName), variant -> variant
                        .description("Gem 3"))
                .variant("%s_gem_3_connected".formatted(concreteName), variant -> variant
                        .description("Gem 3 Connected")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture(Chisel.prefix("block/concrete_%s/concrete_%s_gem_3".formatted(color.getName(), color.getName())))
                        .texture("ctm_corner", Chisel.prefix("block/concrete_%s/concrete_%s_gem_3_connected-ctm_corner".formatted(color.getName(), color.getName())))
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_gem_3_connected-ctm_cornerless".formatted(color.getName(), color.getName())))
                        .texture("ctm_horizontal", Chisel.prefix("block/concrete_%s/concrete_%s_gem_3_connected-ctm_horizontal".formatted(color.getName(), color.getName())))
                        .texture("ctm_vertical", Chisel.prefix("block/concrete_%s/concrete_%s_gem_3_connected-ctm_vertical".formatted(color.getName(), color.getName()))))
                .variant("%s_bricks_square".formatted(concreteName), variant -> variant
                        .description("Square Bricks"))
                .variant("%s_slab".formatted(concreteName), variant -> variant
                        .description("Slab"))
                .variant("%s_scaffold".formatted(concreteName), variant -> variant
                        .description("Scaffold"))
                .variant("%s_scaffold_encased".formatted(concreteName), variant -> variant
                        .description("Encased Scaffold")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_scaffold".formatted(color.getName(), color.getName()))))
                .variant("%s_tiles_inlayed".formatted(concreteName), variant -> variant
                        .description("Inlayed Tiles"))
                .variant("%s_waves".formatted(concreteName), variant -> variant
                        .description("Waves")
                        .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                        .texture("2x2_top_left", Chisel.prefix("block/concrete_%s/concrete_%s_waves".formatted(color.getName(), color.getName()))))
                .variant("%s_parquet".formatted(concreteName), variant -> variant
                        .description("Parquet"))
                .variant("%s_parquet_encased".formatted(concreteName), variant -> variant
                        .description("Encased Parquet")
                        .model(ChiselModelHandlers.CONNECTED)
                        .texture("ctm_cornerless", Chisel.prefix("block/concrete_%s/concrete_%s_parquet".formatted(color.getName(), color.getName()))))
                .variant("%s_plumbing_encased".formatted(concreteName), variant -> variant
                        .description("Encased Plumbing")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_diamond_plating_encased".formatted(concreteName), variant -> variant
                        .description("Encased Diamond Plating")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_mesh_encased".formatted(concreteName), variant -> variant
                        .description("Encased Mesh")
                        .model(ChiselModelHandlers.CONNECTED))
                .variant("%s_caution_encased".formatted(concreteName), variant -> variant
                        .description("Encased Caution")
                        .model(ChiselModelHandlers.CONNECTED)));
    }

    private static Block getVanillaConcrete(DyeColor color) {
        return switch (color) {
            case BLACK -> Blocks.BLACK_CONCRETE;
            case BLUE -> Blocks.BLUE_CONCRETE;
            case BROWN -> Blocks.BROWN_CONCRETE;
            case CYAN -> Blocks.CYAN_CONCRETE;
            case GRAY -> Blocks.GRAY_CONCRETE;
            case GREEN -> Blocks.GREEN_CONCRETE;
            case LIGHT_BLUE -> Blocks.LIGHT_BLUE_CONCRETE;
            case LIGHT_GRAY -> Blocks.LIGHT_GRAY_CONCRETE;
            case LIME -> Blocks.LIME_CONCRETE;
            case MAGENTA -> Blocks.MAGENTA_CONCRETE;
            case ORANGE -> Blocks.ORANGE_CONCRETE;
            case PINK -> Blocks.PINK_CONCRETE;
            case PURPLE -> Blocks.PURPLE_CONCRETE;
            case RED -> Blocks.RED_CONCRETE;
            case WHITE -> Blocks.WHITE_CONCRETE;
            case YELLOW -> Blocks.YELLOW_CONCRETE;
        };
    }
}
