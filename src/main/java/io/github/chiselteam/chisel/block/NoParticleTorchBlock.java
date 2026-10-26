package io.github.chiselteam.chisel.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.BaseTorchBlock;
import org.jetbrains.annotations.NotNull;

public class NoParticleTorchBlock extends BaseTorchBlock {

    public static final MapCodec<NoParticleTorchBlock> CODEC = simpleCodec(NoParticleTorchBlock::new);

    public NoParticleTorchBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends BaseTorchBlock> codec() {
        return CODEC;
    }
}
