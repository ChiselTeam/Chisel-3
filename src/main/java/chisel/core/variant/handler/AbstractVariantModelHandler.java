package chisel.core.variant.handler;

import chisel.core.variant.Variant;
import chisel.core.variant.VariantModel;
import chisel.core.variant.VariantModelHandler;
import net.minecraft.client.data.models.BlockModelGenerators;
import org.jspecify.annotations.NonNull;

public abstract class AbstractVariantModelHandler implements VariantModelHandler {
    protected final String name;
    protected final VariantModel model;

    protected AbstractVariantModelHandler(String name, VariantModel model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        model.generate(variant, blockModels);
    }

    @Override
    public @NonNull String getSerializedName() {
        return name;
    }
}