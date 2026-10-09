package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DiamondFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("diamond", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK))
                    .blockName("Block of Diamond"))
            .existingBlock(Blocks.DIAMOND_BLOCK)
            .variant("diamond_bismuth", variant -> variant
                    .description("Bismuth Diamond Block"))
            .variant("diamond_cells", variant -> variant
                    .description("Diamond Cells"))
            .variant("diamond_crushed", variant -> variant
                    .description("Crushed Diamond"))
            .variant("diamond_embossed", variant -> variant
                    .description("Embossed Diamond Block")
                    .model(ChiselModelHandlers.TBS))
            .variant("diamond_obsidian", variant -> variant
                    .description("Diamonds in Obsidian"))
            .variant("diamond_obsidian_purple", variant -> variant
                    .description("Diamonds in Purple Obsidian"))
            .variant("diamond_ornate", variant -> variant
                    .description("Diamond Block with Ornate Layer"))
            .variant("diamond_panel", variant -> variant
                    .description("Diamond Block with Panel")
                    .model(ChiselModelHandlers.TBS))
            .variant("diamond_simple", variant -> variant
                    .description("Simple Diamond Block")
                    .model(ChiselModelHandlers.TBS))
            .variant("diamond_small_blocks", variant -> variant
                    .description("Small Diamond Blocks"))
            .variant("diamond_small_blocks_ornate", variant -> variant
                    .description("Small Ornate Diamond Blocks"))
            .variant("diamond_zelda", variant -> variant
                    .description("Zelda Diamond Block")));

    private DiamondFamily() {
    }
}
