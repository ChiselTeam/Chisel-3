package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.createSimpleBlock;
import static io.github.chiselteam.chisel.datagen.model.BlockModels.plainVariant;

public class MossyTBSModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.TOP, VariantTextures.get(variant, "top"))
                .put(TextureSlot.BOTTOM, VariantTextures.get(variant, "bottom"))
                .put(TextureSlot.SIDE, VariantTextures.get(variant, "side"))
                .put(TextureSlot.LAYER1, VariantTextures.get(variant, "side"))
                .put(TextureSlot.LAYER0, Chisel.prefix("block/mossy_cobblestone/mossy"));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        net.minecraft.data.models.blockstates.Variant model = plainVariant(ChiselModelTemplates.CUBE_MULTI_PASS_TOP_BOTTOM_SIDE_NO_GLOW.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        blockModels.blockStateOutput.accept(createSimpleBlock(getBlock(), model));
    }
}
