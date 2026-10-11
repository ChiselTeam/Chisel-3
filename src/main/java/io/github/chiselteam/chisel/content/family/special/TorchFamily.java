package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.block.NoParticleTorchBlock;
import io.github.chiselteam.chisel.block.NoParticleWallTorchBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TorchFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("torch", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)).blockName("Torch").blockFactory(NoParticleTorchBlock::new).wallFactory(NoParticleWallTorchBlock::new))
            .existingBlock(Blocks.TORCH).torchVariant("torch_1", v -> v.description("Wax Candle")).torchVariant("torch_2", v -> v.description("Tall Wax Candle")).torchVariant("torch_3", v -> v.description("White Lamp")).torchVariant("torch_4", v -> v.description("Embroidered White Lamp")).torchVariant("torch_5", v -> v.description("Small Black Lamp")).torchVariant("torch_6", v -> v.description("Tall Black Lamp")).torchVariant("torch_7", v -> v.description("Red Lamp")).torchVariant("torch_8", v -> v.description("Embroidered Red Lamp")).torchVariant("torch_9", v -> v.description("Light Bulb")).torchVariant("torch_10", v -> v.description("Clear Light Bulb")));

    private TorchFamily() {
    }
}
