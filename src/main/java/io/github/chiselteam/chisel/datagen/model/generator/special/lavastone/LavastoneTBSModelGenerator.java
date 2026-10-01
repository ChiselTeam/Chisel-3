package io.github.chiselteam.chisel.datagen.model.generator.special.lavastone;

import io.github.chiselteam.chisel.datagen.model.VariantTextures;

import io.github.chiselteam.chisel.datagen.model.generator.ctm.MultiLayerTBSModelGenerator;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;

public class LavastoneTBSModelGenerator extends MultiLayerTBSModelGenerator {
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
}
