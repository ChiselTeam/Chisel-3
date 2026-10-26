package io.github.chiselteam.chisel.datagen.model;

import io.github.chiselteam.chisel.api.family.Variant;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;

public abstract class VariantModelGenerator {
    public BlockModels blockModels;
    public Variant variant;

    public abstract TextureMapping getTextureMapping();

    public void generate(Variant variant, BlockModels blockModels) {
        this.variant = variant;
        this.blockModels = blockModels;
    }

    protected Block getBlock() {
        return variant.getBlock();
    }

    protected void generateSimpleBlockState(net.minecraft.data.models.blockstates.Variant model) {
        if (getBlock() instanceof RotatedPillarBlock) {
            blockModels.blockStateOutput.accept(BlockModels.createAxisAlignedPillarBlock(getBlock(), model));
        } else {
            blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(getBlock(), model));
        }
    }
}
