package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class RedstoneLampModelGenerator extends VariantModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.ALL, VariantTextures.get(variant, "on"))
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant, "on"));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        net.minecraft.data.models.blockstates.Variant off = BlockModels.plainVariant(TexturedModel.CUBE.updateTexture(map -> map.put(TextureSlot.ALL, VariantTextures.get(variant))).create(getBlock(), blockModels.modelOutput));
        net.minecraft.data.models.blockstates.Variant on = BlockModels.plainVariant(blockModels.createSuffixedVariant(getBlock(), "_on", ModelTemplates.CUBE_ALL, (ignored) -> getTextureMapping()));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(getBlock()).with(BlockModels.createBooleanModelDispatch(BlockStateProperties.LIT, on, off)));
    }
}