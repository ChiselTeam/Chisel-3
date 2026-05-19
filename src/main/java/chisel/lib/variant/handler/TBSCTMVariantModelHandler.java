package chisel.lib.variant.handler;

import chisel.lib.variant.VariantModel;
import chisel.lib.ctm.CTMKind;

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
