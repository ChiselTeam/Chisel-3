package io.github.chiselteam.chisel.content.compat.moddedmetal;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class CoalCokeFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("coal_coke", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Coal Coke"))
            .variant("coal_coke_array", v -> v.description("Array").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("coal_coke_braid", v -> v.description("Braid"))
            .variant("coal_coke_chaotic_bricks", v -> v.description("Chaotic Bricks").model(ChiselModelHandlers.MULTIBLOCK_3X3)
                    .textureFromBase("3x3_top_left"))
            .variant("coal_coke_chaotic_medium", v -> v.description("Chaotic Medium"))
            .variant("coal_coke_chaotic_small", v -> v.description("Chaotic Small"))
            .variant("coal_coke_circular", v -> v.description("Circular").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal_coke/coal_coke_dent-ctm_cornerless")))
            .variant("coal_coke_cracked", v -> v.description("Cracked"))
            .variant("coal_coke_cracked_bricks", v -> v.description("Cracked Bricks"))
            .variant("coal_coke_cuts", v -> v.description("Cuts").model(ChiselModelHandlers.MULTIBLOCK_4X4)
                    .textureFromBase("4x4_row_0_column_0"))
            .variant("coal_coke_dent", v -> v.description("Dent").model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_encased_bricks", v -> v.description("Encased Bricks").model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_french_1", v -> v.description("French 1"))
            .variant("coal_coke_french_2", v -> v.description("French 2"))
            .variant("coal_coke_jellybean", v -> v.description("Jellybean").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("coal_coke_layers", v -> v.description("Layers"))
            .variant("coal_coke_mosaic", v -> v.description("Mosaic").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/coal_coke/coal_coke_raw")))
            .variant("coal_coke_ornate", v -> v.description("Ornate Coal Coke"))
            .variant("coal_coke_panel", v -> v.description("Panel"))
            .variant("coal_coke_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/coal_coke/coal_coke_pillar-top")))
            .variant("coal_coke_prism", v -> v.description("Prismatic Coal Coke"))
            .variant("coal_coke_raw", v -> v.description("Raw"))
            .variant("coal_coke_road", v -> v.description("Road"))
            .variant("coal_coke_slanted", v -> v.description("Slanted").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/coal_coke/coal_coke_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("coal_coke_small_bricks", v -> v.description("Small Bricks"))
            .variant("coal_coke_soft_bricks", v -> v.description("Soft Bricks"))
            .variant("coal_coke_solid_bricks", v -> v.description("Solid Bricks"))
            .variant("coal_coke_tiles_large", v -> v.description("Large Tiles").model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_tiles_medium", v -> v.description("Medium Tiles"))
            .variant("coal_coke_tiles_small", v -> v.description("Small Tiles"))
            .variant("coal_coke_triple_bricks", v -> v.description("Triple Bricks"))
            .variant("coal_coke_twisted", v -> v.description("Twisted").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/coal_coke/coal_coke_twisted-top")))
            .variant("coal_coke_weaver", v -> v.description("Weaver").model(ChiselModelHandlers.CONNECTED))
            .variant("coal_coke_zag", v -> v.description("Zag").model(ChiselModelHandlers.AR)
                    .textureFromBase("ar_variant_1")));

    private CoalCokeFamily() {
    }
}
