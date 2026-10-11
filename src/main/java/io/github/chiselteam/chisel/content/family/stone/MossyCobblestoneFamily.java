package io.github.chiselteam.chisel.content.family.stone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MossyCobblestoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("mossy_cobblestone", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_COBBLESTONE)).blockName("Mossy Cobblestone"))
            .existingBlock(Blocks.MOSSY_COBBLESTONE)
            .variant("mossy_cobblestone_array", v -> v.description("Array").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("mossy_cobblestone_braid", v -> v.description("Braid"))
            .variant("mossy_cobblestone_chaotic", v -> v.description("Huge Mossy Cobblestone Tiles").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("mossy_cobblestone_chaotic_medium", v -> v.description("Chaotic Medium"))
            .variant("mossy_cobblestone_chaotic_small", v -> v.description("Chaotic Small"))
            .variant("mossy_cobblestone_circular", v -> v.description("Circular").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_cracked", v -> v.description("Cracked Bricks"))
            .variant("mossy_cobblestone_cracked_bricks", v -> v.description("Cracked Bricks"))
            .variant("mossy_cobblestone_cuts", v -> v.description("Cuts").model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("mossy_cobblestone_dent", v -> v.description("Mossy Cobblestone with Dent").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_emboss", v -> v.description("Emboss").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_encased", v -> v.description("Encased").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_french", v -> v.description("French Mossy Cobblestone Tiles"))
            .variant("mossy_cobblestone_french_2", v -> v.description("French Mossy Cobblestone Tiles"))
            .variant("mossy_cobblestone_indent", v -> v.description("Indent").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_jellybean", v -> v.description("Jellybean").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("mossy_cobblestone_layers", v -> v.description("Layers"))
            .variant("mossy_cobblestone_marker", v -> v.description("Marker"))
            .variant("mossy_cobblestone_mosaic", v -> v.description("Mosaic").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_ornate", v -> v.description("Ornate"))
            .variant("mossy_cobblestone_panel", v -> v.description("Mossy Cobblestone with Panel"))
            .variant("mossy_cobblestone_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/mossy_cobblestone/mossy_cobblestone_pillar-top")))
            .variant("mossy_cobblestone_prism", v -> v.description("Prism"))
            .variant("mossy_cobblestone_raw", v -> v.description("Raw"))
            .variant("mossy_cobblestone_road", v -> v.description("Road"))
            .variant("mossy_cobblestone_slanted", v -> v.description("Slanted").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("mossy_cobblestone_small", v -> v.description("Small Mossy Cobblestone Tiles"))
            .variant("mossy_cobblestone_soft", v -> v.description("Mossy Cobblestone with Light Panel"))
            .variant("mossy_cobblestone_solid", v -> v.description("Mossy Cobblestone with Dark Panel"))
            .variant("mossy_cobblestone_tiles_large", v -> v.description("Large Mossy Cobblestone Tiles").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_tiles_medium", v -> v.description("Medium Tiles"))
            .variant("mossy_cobblestone_tiles_small", v -> v.description("Small Tiles"))
            .variant("mossy_cobblestone_triple", v -> v.description("Triple"))
            .variant("mossy_cobblestone_twisted", v -> v.description("Twisted").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/mossy_cobblestone/mossy_cobblestone_twisted-top")))
            .variant("mossy_cobblestone_weaver", v -> v.description("Weaver").model(ChiselModelHandlers.CONNECTED))
            .variant("mossy_cobblestone_zag", v -> v.description("Zag").model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private MossyCobblestoneFamily() {
    }
}
