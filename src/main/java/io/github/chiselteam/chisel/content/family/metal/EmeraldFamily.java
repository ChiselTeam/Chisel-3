package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class EmeraldFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("emerald", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)).blockName("Block of Emerald"))
            .existingBlock(Blocks.EMERALD_BLOCK)
            .variant("emerald_bismuth", v -> v.description("Emerald Bismuth"))
            .variant("emerald_blocks_small", v -> v.description("Small Emerald Blocks"))
            .variant("emerald_blocks_small_ornate", v -> v.description("Small Ornate Emerald Blocks"))
            .variant("emerald_cell", v -> v.description("Emerald Cell"))
            .variant("emerald_chunk", v -> v.description("Emerald Chunk"))
            .variant("emerald_circle", v -> v.description("Circle"))
            .variant("emerald_masonry", v -> v.description("Masonry"))
            .variant("emerald_ornate", v -> v.description("Ornate Emerald Block"))
            .variant("emerald_ornate_layer", v -> v.description("Emerald with Ornate Layer"))
            .variant("emerald_panel", v -> v.description("Emerald Panel"))
            .variant("emerald_panel_classic", v -> v.description("Classic emerald Panel"))
            .variant("emerald_prismatic", v -> v.description("Prismatic"))
            .variant("emerald_smooth", v -> v.description("Smooth Emerald"))
            .variant("emerald_zelda", v -> v.description("Zelda Emerald Block")));

    private EmeraldFamily() {
    }
}
