package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GlowstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("glowstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE))
                    .blockName("Glowstone"))
            .existingBlock(Blocks.GLOWSTONE)
            .variant("glowstone_array", variant -> variant
                    .description("Array")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("glowstone_bismuth", variant -> variant
                    .description("Bismuth"))
            .variant("glowstone_braid", variant -> variant
                    .description("Braid"))
            .variant("glowstone_chaotic_medium", variant -> variant
                    .description("Chaotic Medium"))
            .variant("glowstone_chaotic_small", variant -> variant
                    .description("Chaotic Small"))
            .variant("glowstone_circular", variant -> variant
                    .description("Circular"))
            .variant("glowstone_cracked", variant -> variant
                    .description("Cracked"))
            .variant("glowstone_cracked_bricks", variant -> variant
                    .description("Cracked Bricks"))
            .variant("glowstone_dent", variant -> variant
                    .description("Dent")
                    .model(ChiselModelHandlers.CONNECTED_NO_AO))
            .variant("glowstone_encased_bricks", variant -> variant
                    .description("Encased Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("glowstone_french_1", variant -> variant
                    .description("French 1"))
            .variant("glowstone_french_2", variant -> variant
                    .description("French 2"))
            .variant("glowstone_jellybean", variant -> variant
                    .description("Jellybean")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("glowstone_layers", variant -> variant
                    .description("Layers"))
            .variant("glowstone_mosaic", variant -> variant
                    .description("Mosaic")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("glowstone_neon", variant -> variant
                    .description("Neon"))
            .variant("glowstone_neon_panel", variant -> variant
                    .description("Neon Panel"))
            .variant("glowstone_ornate", variant -> variant
                    .description("Ornate"))
            .variant("glowstone_panel", variant -> variant
                    .description("Panel"))
            .variant("glowstone_pillar", variant -> variant
                    .description("Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/glowstone/glowstone_pillar-top")))
            .variant("glowstone_prism", variant -> variant
                    .description("Prism"))
            .variant("glowstone_road", variant -> variant
                    .description("Road"))
            .variant("glowstone_slanted", variant -> variant
                    .description("Slanted")
                    .model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/glowstone/glowstone_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("glowstone_small_bricks", variant -> variant
                    .description("Small Bricks"))
            .variant("glowstone_tiles_large", variant -> variant
                    .description("Large Tiles")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/glowstone/glowstone_mosaic-ctm_cornerless")))
            .variant("glowstone_tiles_large_bismuth", variant -> variant
                    .description("Large Bismuth Tiles"))
            .variant("glowstone_tiles_medium", variant -> variant
                    .description("Medium Tiles"))
            .variant("glowstone_tiles_medium_bismuth", variant -> variant
                    .description("Medium Bismuth Tiles"))
            .variant("glowstone_triple_bricks", variant -> variant
                    .description("Triple Bricks"))
            .variant("glowstone_twisted", variant -> variant
                    .description("Twisted")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/glowstone/glowstone_twisted-top"))));

    private GlowstoneFamily() {
    }
}
