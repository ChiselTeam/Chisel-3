package chisel.client.model.special;

import chisel.core.variant.Variant;
import chisel.core.variant.VariantModel;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class RedstoneLampModel extends VariantModel {
    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.ALL, variant.getMaterial("on"))
                .put(TextureSlot.PARTICLE, variant.getMaterial("on"));
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        super.generate(variant, blockModels);
        MultiVariant off = BlockModelGenerators.plainVariant(TexturedModel.CUBE.updateTexture(map -> map.put(TextureSlot.ALL, variant.getMaterial())).create(getBlock(), blockModels.modelOutput));
        MultiVariant on = BlockModelGenerators.plainVariant(blockModels.createSuffixedVariant(getBlock(), "_on", ModelTemplates.CUBE_ALL, (_) -> getTextureMapping()));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(getBlock()).with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, on, off)));
    }
}