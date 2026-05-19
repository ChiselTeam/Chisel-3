package chisel.lib.variant.handler;

import chisel.lib.variant.VariantModel;

public class WallTorchVariantModelHandler extends AbstractVariantModelHandler {
    public WallTorchVariantModelHandler(String name, VariantModel model) {
        super(name, model);
    }

    @Override
    public boolean isWallTorch() {
        return true;
    }
}