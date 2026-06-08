package io.github.chiselteam.chisel.core.variant.handler;

import io.github.chiselteam.chisel.core.variant.VariantModel;
import io.github.chiselteam.ctm.api.strategy.CTMKind;

public class CTMVariantModelHandler extends AbstractVariantModelHandler {
    private final boolean fluidOffset;

    public CTMVariantModelHandler(String name, VariantModel model) {
        this(name, model, false);
    }

    public CTMVariantModelHandler(String name, VariantModel model, boolean fluidOffset) {
        super(name, model);
        this.fluidOffset = fluidOffset;
    }

    @Override
    public boolean isConnectedTexture() {
        return true;
    }

    @Override
    public boolean ctmFluidOffset() {
        return fluidOffset;
    }

    @Override
    public CTMKind ctmKind() {
        return CTMKind.STANDARD;
    }
}

