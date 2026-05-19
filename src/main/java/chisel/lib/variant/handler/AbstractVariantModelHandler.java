package chisel.lib.variant.handler;

import chisel.lib.variant.Variant;
import chisel.lib.variant.VariantModel;
import chisel.lib.variant.VariantModelHandler;
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