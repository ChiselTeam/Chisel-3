package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;

public class RoadLineModelGenerator extends VariantModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.TEXTURE, VariantTextures.get(variant))
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        var model = ChiselModelTemplates.ROAD_LINES.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        blockModels.blockStateOutput.accept(net.minecraft.data.models.blockstates.MultiVariantGenerator.multiVariant(getBlock(), BlockModels.plainVariant(model)).with(BlockModels.ROTATION_HORIZONTAL_FACING));
    }
}
