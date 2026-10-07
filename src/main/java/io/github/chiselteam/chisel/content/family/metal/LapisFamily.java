package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class LapisFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("lapis", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK))
                    .blockName("Block of Lapis Lazuli"))
            .existingBlock(Blocks.LAPIS_BLOCK)
            .variant("lapis_chunky", variant -> variant
                    .description("Chunky Lapis Block"))
            .variant("lapis_dark", variant -> variant
                    .description("Dark Lapis Block"))
            .variant("lapis_masonry", variant -> variant
                    .description("Masonry"))
            .variant("lapis_ornate", variant -> variant
                    .description("Ornate Lapis Block"))
            .variant("lapis_ornate_layer", variant -> variant
                    .description("Lapis with Ornate Layer"))
            .variant("lapis_panel", variant -> variant
                    .description("Lapis Panel"))
            .variant("lapis_smooth", variant -> variant
                    .description("Smooth Lapis"))
            .variant("lapis_tile", variant -> variant
                    .description("Lapis Tile"))
            .variant("lapis_zelda", variant -> variant
                    .description("Zelda Lapis Block")));

    private LapisFamily() {
    }
}
