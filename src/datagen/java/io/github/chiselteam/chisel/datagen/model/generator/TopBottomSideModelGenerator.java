package io.github.chiselteam.chisel.datagen.model.generator;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.plainVariant;

public class TopBottomSideModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.TOP, VariantTextures.get(variant, "top"))
                .put(TextureSlot.BOTTOM, VariantTextures.get(variant, "bottom"))
                .put(TextureSlot.SIDE, VariantTextures.get(variant, "side"));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        ResourceLocation modelLocation = ModelTemplates.CUBE_BOTTOM_TOP.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        net.minecraft.data.models.blockstates.Variant model = plainVariant(modelLocation);
        if (variant.isEldritch()) {
            model = BlockModels.eldritch(modelLocation, blockModels.modelOutput);
        }

        generateSimpleBlockState(model);
    }
}
