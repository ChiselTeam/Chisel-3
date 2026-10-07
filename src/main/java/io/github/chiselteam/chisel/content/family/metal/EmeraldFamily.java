package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class EmeraldFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("emerald", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK))
                    .blockName("Block of Emerald"))
            .existingBlock(Blocks.EMERALD_BLOCK)
            .variant("emerald_bismuth", variant -> variant
                    .description("Emerald Bismuth"))
            .variant("emerald_blocks_small", variant -> variant
                    .description("Small Emerald Blocks"))
            .variant("emerald_blocks_small_ornate", variant -> variant
                    .description("Small Ornate Emerald Blocks"))
            .variant("emerald_cell", variant -> variant
                    .description("Emerald Cell"))
            .variant("emerald_chunk", variant -> variant
                    .description("Emerald Chunk"))
            .variant("emerald_circle", variant -> variant
                    .description("Circle"))
            .variant("emerald_masonry", variant -> variant
                    .description("Masonry"))
            .variant("emerald_ornate", variant -> variant
                    .description("Ornate Emerald Block"))
            .variant("emerald_ornate_layer", variant -> variant
                    .description("Emerald with Ornate Layer"))
            .variant("emerald_panel", variant -> variant
                    .description("Emerald Panel"))
            .variant("emerald_panel_classic", variant -> variant
                    .description("Classic emerald Panel"))
            .variant("emerald_prismatic", variant -> variant
                    .description("Prismatic"))
            .variant("emerald_smooth", variant -> variant
                    .description("Smooth Emerald"))
            .variant("emerald_zelda", variant -> variant
                    .description("Zelda Emerald Block")));

    private EmeraldFamily() {
    }
}
