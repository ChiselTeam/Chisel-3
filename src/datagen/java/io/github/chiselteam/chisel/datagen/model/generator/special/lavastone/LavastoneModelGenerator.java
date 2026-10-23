package io.github.chiselteam.chisel.datagen.model.generator.special.lavastone;

import io.github.chiselteam.chisel.datagen.model.VariantTextures;

import io.github.chiselteam.chisel.datagen.model.generator.MultiLayerModelGenerator;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;

public class LavastoneModelGenerator extends MultiLayerModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.LAYER0, VariantTextures.get(variant, "bg"))
                .put(TextureSlot.LAYER1, VariantTextures.get(variant));
    }
}
