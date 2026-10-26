package io.github.chiselteam.chisel.datagen.model.generator.special.waterstone;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.createSimpleBlock;
import static io.github.chiselteam.chisel.datagen.model.BlockModels.plainVariant;

public class WaterstoneModelGenerator extends VariantModelGenerator {
    public static void registerItemModel(BlockModels blockModels, Block block, ResourceLocation model) {
        blockModels.registerSimpleItemModel(block, model);
    }

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.LAYER0, VariantTextures.get(variant, "bg"))
                .put(TextureSlot.LAYER1, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        ResourceLocation modelLocation = ChiselModelTemplates.CUBE_MULTI_PASS_TINTED.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        registerItemModel(blockModels, getBlock(), modelLocation);
        net.minecraft.data.models.blockstates.Variant model = plainVariant(modelLocation);
        blockModels.blockStateOutput.accept(createSimpleBlock(getBlock(), model));
    }
}
