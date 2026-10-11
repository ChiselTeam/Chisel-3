package io.github.chiselteam.chisel.content.family.metal;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class DiamondFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("diamond", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)).blockName("Block of Diamond"))
            .existingBlock(Blocks.DIAMOND_BLOCK)
            .variant("diamond_bismuth", v -> v.description("Bismuth Diamond Block"))
            .variant("diamond_cells", v -> v.description("Diamond Cells"))
            .variant("diamond_crushed", v -> v.description("Crushed Diamond"))
            .variant("diamond_embossed", v -> v.description("Embossed Diamond Block").model(ChiselModelHandlers.TBS))
            .variant("diamond_obsidian", v -> v.description("Diamonds in Obsidian"))
            .variant("diamond_obsidian_purple", v -> v.description("Diamonds in Purple Obsidian"))
            .variant("diamond_ornate", v -> v.description("Diamond Block with Ornate Layer"))
            .variant("diamond_panel", v -> v.description("Diamond Block with Panel").model(ChiselModelHandlers.TBS))
            .variant("diamond_simple", v -> v.description("Simple Diamond Block").model(ChiselModelHandlers.TBS))
            .variant("diamond_small_blocks", v -> v.description("Small Diamond Blocks"))
            .variant("diamond_small_blocks_ornate", v -> v.description("Small Ornate Diamond Blocks"))
            .variant("diamond_zelda", v -> v.description("Zelda Diamond Block")));

    private DiamondFamily() {
    }
}
