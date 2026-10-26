package io.github.chiselteam.chisel.datagen.model.generator;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.plainVariant;

public class CubeAllModelGenerator extends VariantModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return TextureMapping.cube(getBlock());
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        TexturedModel texturedModel = TexturedModel.CUBE.updateTexture(
                map -> map.put(TextureSlot.ALL, VariantTextures.get(variant))
        ).get(getBlock());
        ResourceLocation modelLocation = texturedModel.create(getBlock(), blockModels.modelOutput);
        if (variant.isEldritch()) {
            blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(getBlock(), BlockModels.eldritch(modelLocation, blockModels.modelOutput)));
        } else {
            blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(getBlock(), plainVariant(modelLocation)));
        }
    }
}
