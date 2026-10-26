package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.createSimpleBlock;
import static io.github.chiselteam.chisel.datagen.model.BlockModels.plainVariant;

public class CarpetModelGenerator extends VariantModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping()).put(TextureSlot.WOOL, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        net.minecraft.data.models.blockstates.Variant model = plainVariant(ModelTemplates.CARPET.create(variant.getBlock(), getTextureMapping(), blockModels.modelOutput));
        blockModels.blockStateOutput.accept(createSimpleBlock(variant.getBlock(), model));
    }
}
