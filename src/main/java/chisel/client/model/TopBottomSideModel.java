package chisel.client.model;

import chisel.datagen.model.EldritchBlockStateModelBuilder;
import chisel.lib.variant.Variant;
import chisel.lib.variant.VariantModel;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

import static net.minecraft.client.data.models.BlockModelGenerators.createSimpleBlock;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class TopBottomSideModel extends VariantModel {

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.TOP, variant.getMaterial("top"))
                .put(TextureSlot.BOTTOM, variant.getMaterial("bottom"))
                .put(TextureSlot.SIDE, variant.getMaterial("side"));
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        super.generate(variant, blockModels);
        Identifier modelLocation = ModelTemplates.CUBE_BOTTOM_TOP_INNER_FACES.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        if (variant.isEldritch()) {
            MultiVariant inner = plainVariant(modelLocation);
            EldritchBlockStateModelBuilder builder = new EldritchBlockStateModelBuilder().inner(inner.toUnbaked());
            blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(getBlock(), MultiVariant.of(builder)));
        } else {
            blockModels.blockStateOutput.accept(createSimpleBlock(getBlock(), plainVariant(modelLocation)));
        }
    }
}
