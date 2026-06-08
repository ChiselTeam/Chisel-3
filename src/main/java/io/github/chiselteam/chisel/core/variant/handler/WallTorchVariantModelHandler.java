package io.github.chiselteam.chisel.core.variant.handler;

import io.github.chiselteam.chisel.core.variant.VariantModel;

public class WallTorchVariantModelHandler extends AbstractVariantModelHandler {
    public WallTorchVariantModelHandler(String name, VariantModel model) {
        super(name, model);
    }

    @Override
    public boolean isWallTorch() {
        return true;
    }
}