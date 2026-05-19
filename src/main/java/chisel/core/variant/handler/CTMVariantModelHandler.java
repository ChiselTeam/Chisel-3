package chisel.core.variant.handler;

import chisel.core.variant.VariantModel;
import chisel.core.ctm.CTMKind;

public class CTMVariantModelHandler extends AbstractVariantModelHandler {
    public CTMVariantModelHandler(String name, VariantModel model) {
        super(name, model);
    }

    @Override
    public boolean isConnectedTexture() {
        return true;
    }

    @Override
    public CTMKind ctmKind() {
        return CTMKind.STANDARD;
    }
}
