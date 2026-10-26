package io.github.chiselteam.chisel.datagen.model.generator.ctm;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import io.github.chiselteam.chisel.datagen.model.generator.special.waterstone.WaterstoneModelGenerator;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.plainVariant;

public class MultiLayerTBSTintedModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant, "side"))
                .put(TextureSlot.TOP, VariantTextures.get(variant, "top"))
                .put(TextureSlot.BOTTOM, VariantTextures.get(variant, "bottom"))
                .put(TextureSlot.SIDE, VariantTextures.get(variant, "side"))
                .put(TextureSlot.LAYER1, VariantTextures.get(variant, "side"))
                .put(TextureSlot.LAYER0, VariantTextures.get(variant, "bg"));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        ResourceLocation modelLocation = ChiselModelTemplates.CUBE_MULTI_PASS_TOP_BOTTOM_SIDE_TINTED.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        WaterstoneModelGenerator.registerItemModel(blockModels, getBlock(), modelLocation);
        net.minecraft.data.models.blockstates.Variant model = plainVariant(modelLocation);
        generateSimpleBlockState(model);
    }
}
