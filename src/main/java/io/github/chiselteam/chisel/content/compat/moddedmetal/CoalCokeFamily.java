package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CoalCokeFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("coal_coke", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Coal Coke"))
            .variant("coal_coke_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("coal_coke_braid", variant -> variant
                    .description("Braid"))
            .variant("coal_coke_chaotic_bricks", variant -> variant
                    .description("Chaotic Bricks")
                    .model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("coal_coke_chaotic_medium", variant -> variant
                    .description("Coal Coke Bricks"))
            .variant("coal_coke_chaotic_small", variant -> variant
                    .description("Coal Coke Small Tiles"))
            .variant("coal_coke_circular", variant -> variant
                    .description("Circular")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal_coke/coal_coke_dent-ctm_cornerless")))
            .variant("coal_coke_cracked", variant -> variant
                    .description("Cracked"))
            .variant("coal_coke_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("coal_coke_cuts", variant -> variant
                    .description("Cuts")
                    .model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("coal_coke_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_french_1", variant -> variant
                    .description("French 1"))
            .variant("coal_coke_french_2", variant -> variant
                    .description("French 2"))
            .variant("coal_coke_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("coal_coke_layers", variant -> variant
                    .description("Layers"))
            .variant("coal_coke_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal_coke/coal_coke_raw")))
            .variant("coal_coke_ornate", variant -> variant
                    .description("Ornate Coal Coke"))
            .variant("coal_coke_panel", variant -> variant
                    .description("Panel"))
            .variant("coal_coke_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/coal_coke/coal_coke_pillar-top")))
            .variant("coal_coke_prism", variant -> variant
                    .description("Prismatic Coal Coke"))
            .variant("coal_coke_raw", variant -> variant
                    .description("Raw"))
            .variant("coal_coke_road", variant -> variant
                    .description("Road"))
            .variant("coal_coke_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/coal_coke/coal_coke_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("coal_coke_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("coal_coke_soft_bricks", variant -> variant
                    .description("Soft Bricks"))
            .variant("coal_coke_solid_bricks", variant -> variant
                    .description("Solid Bricks"))
            .variant("coal_coke_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("coal_coke_tiles_small", variant -> variant
                    .description("Small Tiles"))
            .variant("coal_coke_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("coal_coke_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/coal_coke/coal_coke_twisted-top")))
            .variant("coal_coke_weaver", variant -> variant
                    .description("Weaver")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_zag", variant -> variant
                    .description("Zag")
                    .model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private CoalCokeFamily() {
    }
}
