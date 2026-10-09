package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MossyCobblestoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("mossy_cobblestone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE))
                    .blockName("Mossy Cobblestone"))
            .existingBlock(Blocks.MOSSY_COBBLESTONE)
            .variant("mossy_cobblestone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("mossy_cobblestone_braid", variant -> variant
                    .description("Braid"))
            .variant("mossy_cobblestone_chaotic", variant -> variant
                    .description("Huge Mossy Cobblestone Tiles")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("mossy_cobblestone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("mossy_cobblestone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("mossy_cobblestone_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_cracked", variant -> variant
                    .description("Cracked Bricks"))
            .variant("mossy_cobblestone_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("mossy_cobblestone_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("mossy_cobblestone_dent", variant -> variant
                    .description("Mossy Cobblestone with Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_emboss", variant -> variant
                    .description("Emboss")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_encased", variant -> variant
                    .description("Encased")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_french", variant -> variant
                    .description("French Mossy Cobblestone Tiles"))
            .variant("mossy_cobblestone_french_2", variant -> variant
                    .description("French Mossy Cobblestone Tiles"))
            .variant("mossy_cobblestone_indent", variant -> variant
                    .description("Indent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("mossy_cobblestone_layers", variant -> variant
                    .description("Layers"))
            .variant("mossy_cobblestone_marker", variant -> variant
                    .description("Marker"))
            .variant("mossy_cobblestone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_ornate", variant -> variant
                    .description("Ornate"))
            .variant("mossy_cobblestone_panel", variant -> variant
                    .description("Mossy Cobblestone with Panel"))
            .variant("mossy_cobblestone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/mossy_cobblestone/mossy_cobblestone_pillar-top")))
            .variant("mossy_cobblestone_prism", variant -> variant
                    .description("Prism"))
            .variant("mossy_cobblestone_raw", variant -> variant
                    .description("Raw"))
            .variant("mossy_cobblestone_road", variant -> variant
                    .description("Road"))
            .variant("mossy_cobblestone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("mossy_cobblestone_small", variant -> variant
                    .description("Small Mossy Cobblestone Tiles"))
            .variant("mossy_cobblestone_soft", variant -> variant
                    .description("Mossy Cobblestone with Light Panel"))
            .variant("mossy_cobblestone_solid", variant -> variant
                    .description("Mossy Cobblestone with Dark Panel"))
            .variant("mossy_cobblestone_tiles_large", variant -> variant
                    .description("Large Mossy Cobblestone Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("mossy_cobblestone_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("mossy_cobblestone_triple", variant -> variant
                    .description("Triple"))
            .variant("mossy_cobblestone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/mossy_cobblestone/mossy_cobblestone_twisted-top")))
            .variant("mossy_cobblestone_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private MossyCobblestoneFamily() {
    }
}
