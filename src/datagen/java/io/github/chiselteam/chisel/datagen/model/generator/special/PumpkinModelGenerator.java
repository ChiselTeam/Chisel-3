package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.ROTATION_HORIZONTAL_FACING;
import static io.github.chiselteam.chisel.datagen.model.BlockModels.plainVariant;

public class PumpkinModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.FRONT, VariantTextures.get(variant))
                .put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/pumpkin_side"))
                .put(TextureSlot.END, ResourceLocation.withDefaultNamespace("block/pumpkin_top"));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        net.minecraft.data.models.blockstates.Variant model = plainVariant(ModelTemplates.CUBE_ORIENTABLE.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(getBlock(), model).with(ROTATION_HORIZONTAL_FACING));
    }
}
