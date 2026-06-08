package io.github.chiselteam.chisel.core.variant.handler;

import io.github.chiselteam.chisel.core.variant.VariantModel;
import io.github.chiselteam.ctm.api.strategy.CTMKind;

public class TBSCTMVariantModelHandler extends AbstractVariantModelHandler {
    public TBSCTMVariantModelHandler(String name, VariantModel model) {
        super(name, model);
    }

    @Override
    public boolean isConnectedTexture() {
        return true;
    }

    @Override
    public CTMKind ctmKind() {
        return CTMKind.TBS;
    }
}

