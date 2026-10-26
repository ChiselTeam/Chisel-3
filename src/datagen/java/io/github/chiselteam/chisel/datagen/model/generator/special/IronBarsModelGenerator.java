package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;

public class IronBarsModelGenerator extends VariantModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping()).put(io.github.chiselteam.chisel.datagen.model.ChiselTextureSlots.BARS, VariantTextures.get(variant)).put(TextureSlot.EDGE, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        blockModels.createBars(
                variant.getBlock(),
                ChiselModelTemplates.BARS_POST_ENDS.create(variant.getBlock(), getTextureMapping(), blockModels.modelOutput),
                ChiselModelTemplates.BARS_POST.create(variant.getBlock(), getTextureMapping(), blockModels.modelOutput),
                ChiselModelTemplates.BARS_CAP.create(variant.getBlock(), getTextureMapping(), blockModels.modelOutput),
                ChiselModelTemplates.BARS_CAP_ALT.create(variant.getBlock(), getTextureMapping(), blockModels.modelOutput),
                ChiselModelTemplates.BARS_POST_SIDE.create(variant.getBlock(), getTextureMapping(), blockModels.modelOutput),
                ChiselModelTemplates.BARS_POST_SIDE_ALT.create(variant.getBlock(), getTextureMapping(), blockModels.modelOutput)
        );

        blockModels.registerSimpleItemModel(variant.getBlock(), net.minecraft.data.models.model.ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(variant.getBlock().asItem()), TextureMapping.layer0(VariantTextures.get(variant)), blockModels.modelOutput));
    }
}
