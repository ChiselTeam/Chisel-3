package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselPoweredBlock;
import io.github.chiselteam.chisel.block.ChiselPoweredPillarBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RedstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("redstone", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockName("Block of Redstone"))
            .existingBlock(Blocks.REDSTONE_BLOCK)
            .variant("redstone_bricks", v -> v.description("Redstone Bricks").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_bricks_chaotic", v -> v.description("Chaotic Redstone Bricks").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_bricks_small", v -> v.description("Small Redstone Bricks").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_chiseled", v -> v.description("Chiseled Redstone").model(ChiselModelHandlers.TBS).blockFactory(ChiselPoweredBlock::new)
                    .texture("bottom", Chisel.prefix("block/redstone/redstone_chiseled-top")))
            .variant("redstone_chunk", v -> v.description("Chunk").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_circuit", v -> v.description("Redstone Circuit").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_circuit_supaplex", v -> v.description("Redstone Supaplex Circuit").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_ere", v -> v.description("Ere").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_greek", v -> v.description("Redstone Greek Decoration").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new)
                    .texture(Chisel.prefix("block/redstone/redstone_ere")))
            .variant("redstone_large", v -> v.description("Large Redstone Block").model(ChiselModelHandlers.CONNECTED).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_pillar", v -> v.description("Redstone Pillar").model(ChiselModelHandlers.TBS).blockFactory(ChiselPoweredPillarBlock::new)
                    .texture("bottom", Chisel.prefix("block/redstone/redstone_pillar-top")))
            .variant("redstone_skulls", v -> v.description("Redstone Skulls").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_small", v -> v.description("Small Redstone Block").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_smooth", v -> v.description("Smooth Redstone").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_solid", v -> v.description("Solid").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_tiles", v -> v.description("Redstone Tiles").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_tiles_ornate", v -> v.description("Ornate Redstone Tiles").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_zelda", v -> v.description("Redstone Zelda Block").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)).blockFactory(ChiselPoweredBlock::new)));

    private RedstoneFamily() {
    }
}
