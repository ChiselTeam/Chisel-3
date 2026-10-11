package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LapisFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("lapis", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)).blockName("Block of Lapis Lazuli"))
            .existingBlock(Blocks.LAPIS_BLOCK)
            .variant("lapis_chunky", v -> v.description("Chunky Lapis Block"))
            .variant("lapis_dark", v -> v.description("Dark Lapis Block"))
            .variant("lapis_masonry", v -> v.description("Masonry"))
            .variant("lapis_ornate", v -> v.description("Ornate Lapis Block"))
            .variant("lapis_ornate_layer", v -> v.description("Lapis with Ornate Layer"))
            .variant("lapis_panel", v -> v.description("Lapis Panel"))
            .variant("lapis_smooth", v -> v.description("Smooth Lapis"))
            .variant("lapis_tile", v -> v.description("Lapis Tile"))
            .variant("lapis_zelda", v -> v.description("Zelda Lapis Block")));

    private LapisFamily() {
    }
}
