package chisel.core.variant.handler;

import chisel.core.variant.VariantModel;
import chisel.core.ctm.CTMKind;

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
