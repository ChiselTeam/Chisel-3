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
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockName("Block of Redstone"))
            .existingBlock(Blocks.REDSTONE_BLOCK)
            .variant("redstone_bricks", variant -> variant
                    .description("Redstone Bricks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_bricks_chaotic", variant -> variant
                    .description("Chaotic Redstone Bricks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_bricks_small", variant -> variant
                    .description("Small Redstone Bricks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_chiseled", variant -> variant
                    .description("Chiseled Redstone")
                    .model(ChiselModelHandlers.TBS)
                    .blockFactory(ChiselPoweredBlock::new)
                    .texture("bottom", Chisel.prefix("block/redstone/redstone_chiseled-top")))
            .variant("redstone_chunk", variant -> variant
                    .description("Chunk")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_circuit", variant -> variant
                    .description("Redstone Circuit")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_circuit_supaplex", variant -> variant
                    .description("Redstone Supaplex Circuit")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_ere", variant -> variant
                    .description("Ere")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_greek", variant -> variant
                    .description("Redstone Greek Decoration")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new)
                    .texture(Chisel.prefix("block/redstone/redstone_ere")))
            .variant("redstone_large", variant -> variant
                    .description("Large Redstone Block")
                    .model(ChiselModelHandlers.CONNECTED)
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_pillar", variant -> variant
                    .description("Redstone Pillar")
                    .model(ChiselModelHandlers.TBS)
                    .blockFactory(ChiselPoweredPillarBlock::new)
                    .texture("bottom", Chisel.prefix("block/redstone/redstone_pillar-top")))
            .variant("redstone_skulls", variant -> variant
                    .description("Redstone Skulls")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_small", variant -> variant
                    .description("Small Redstone Block")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_smooth", variant -> variant
                    .description("Smooth Redstone")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_solid", variant -> variant
                    .description("Solid")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_tiles", variant -> variant
                    .description("Redstone Tiles")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_tiles_ornate", variant -> variant
                    .description("Ornate Redstone Tiles")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new))
            .variant("redstone_zelda", variant -> variant
                    .description("Redstone Zelda Block")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK))
                    .blockFactory(ChiselPoweredBlock::new)));

    private RedstoneFamily() {
    }
}
