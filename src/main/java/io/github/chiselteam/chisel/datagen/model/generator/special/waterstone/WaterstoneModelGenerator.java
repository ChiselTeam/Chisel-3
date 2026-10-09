package io.github.chiselteam.chisel.datagen.model.generator.special.waterstone;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.client.color.item.Constant;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

import static net.minecraft.client.data.models.BlockModelGenerators.createSimpleBlock;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class WaterstoneModelGenerator extends VariantModelGenerator {
    public static void registerItemModel(BlockModelGenerators blockModels, Block block, Identifier model) {
        blockModels.registerSimpleTintedItemModel(block, model, new Constant(0x3F76E4));
    }

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.LAYER0, VariantTextures.get(variant, "bg"))
                .put(TextureSlot.LAYER1, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        super.generate(variant, blockModels);
        Identifier modelLocation = ChiselModelTemplates.CUBE_MULTI_PASS_TINTED.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        registerItemModel(blockModels, getBlock(), modelLocation);
        MultiVariant model = plainVariant(modelLocation);
        blockModels.blockStateOutput.accept(createSimpleBlock(getBlock(), model));
    }
}
