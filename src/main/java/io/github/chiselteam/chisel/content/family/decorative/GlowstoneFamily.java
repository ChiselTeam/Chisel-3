package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GlowstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("glowstone", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE)).blockName("Glowstone"))
            .existingBlock(Blocks.GLOWSTONE)
            .variant("glowstone_array", v -> v.description("Array").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("glowstone_bismuth", v -> v.description("Bismuth"))
            .variant("glowstone_braid", v -> v.description("Braid"))
            .variant("glowstone_chaotic_medium", v -> v.description("Chaotic Medium"))
            .variant("glowstone_chaotic_small", v -> v.description("Chaotic Small"))
            .variant("glowstone_circular", v -> v.description("Circular"))
            .variant("glowstone_cracked", v -> v.description("Cracked"))
            .variant("glowstone_cracked_bricks", v -> v.description("Cracked Bricks"))
            .variant("glowstone_dent", v -> v.description("Dent").model(ChiselModelHandlers.CONNECTED_NO_AO))
            .variant("glowstone_encased_bricks", v -> v.description("Encased Bricks").model(ChiselModelHandlers.CONNECTED))
            .variant("glowstone_french_1", v -> v.description("French 1"))
            .variant("glowstone_french_2", v -> v.description("French 2"))
            .variant("glowstone_jellybean", v -> v.description("Jellybean").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_top_left"))
            .variant("glowstone_layers", v -> v.description("Layers"))
            .variant("glowstone_mosaic", v -> v.description("Mosaic").model(ChiselModelHandlers.CONNECTED))
            .variant("glowstone_neon", v -> v.description("Neon"))
            .variant("glowstone_neon_panel", v -> v.description("Neon Panel"))
            .variant("glowstone_ornate", v -> v.description("Ornate"))
            .variant("glowstone_panel", v -> v.description("Panel"))
            .variant("glowstone_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/glowstone/glowstone_pillar-top")))
            .variant("glowstone_prism", v -> v.description("Prism"))
            .variant("glowstone_road", v -> v.description("Road"))
            .variant("glowstone_slanted", v -> v.description("Slanted").model(ChiselModelHandlers.MULTIBLOCK_2X2)
                    .textureFromBase("2x2_bottom_left")
                    .texture("2x2_bottom_right", Chisel.prefix("block/glowstone/glowstone_slanted-2x2_top_right"))
                    .textureFromBase("2x2_top_left"))
            .variant("glowstone_small_bricks", v -> v.description("Small Bricks"))
            .variant("glowstone_tiles_large", v -> v.description("Large Tiles").model(ChiselModelHandlers.CONNECTED)
                    .texture("ctm_cornerless", Chisel.prefix("block/glowstone/glowstone_mosaic-ctm_cornerless")))
            .variant("glowstone_tiles_large_bismuth", v -> v.description("Large Bismuth Tiles"))
            .variant("glowstone_tiles_medium", v -> v.description("Medium Tiles"))
            .variant("glowstone_tiles_medium_bismuth", v -> v.description("Medium Bismuth Tiles"))
            .variant("glowstone_triple_bricks", v -> v.description("Triple Bricks"))
            .variant("glowstone_twisted", v -> v.description("Twisted").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/glowstone/glowstone_twisted-top"))));

    private GlowstoneFamily() {
    }
}
