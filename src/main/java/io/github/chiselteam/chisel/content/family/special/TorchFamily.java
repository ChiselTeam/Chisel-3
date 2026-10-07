package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.block.NoParticleTorchBlock;
import io.github.chiselteam.chisel.block.NoParticleWallTorchBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TorchFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("torch", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH))
                    .blockName("Torch")
                    .blockFactory(NoParticleTorchBlock::new)
                    .wallFactory(NoParticleWallTorchBlock::new))
            .existingBlock(Blocks.TORCH)
            .torchVariant("torch_1", variant -> variant
                    .description("Wax Candle"))
            .torchVariant("torch_2", variant -> variant
                    .description("Tall Wax Candle"))
            .torchVariant("torch_3", variant -> variant
                    .description("White Lamp"))
            .torchVariant("torch_4", variant -> variant
                    .description("Embroidered White Lamp"))
            .torchVariant("torch_5", variant -> variant
                    .description("Small Black Lamp"))
            .torchVariant("torch_6", variant -> variant
                    .description("Tall Black Lamp"))
            .torchVariant("torch_7", variant -> variant
                    .description("Red Lamp"))
            .torchVariant("torch_8", variant -> variant
                    .description("Embroidered Red Lamp"))
            .torchVariant("torch_9", variant -> variant
                    .description("Light Bulb"))
            .torchVariant("torch_10", variant -> variant
                    .description("Clear Light Bulb")));

    private TorchFamily() {
    }
}
