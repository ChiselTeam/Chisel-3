package chisel.core.variant.handler;

import chisel.core.variant.VariantModel;
import chisel.core.ctm.CTMKind;

public class DirectionalCTMVariantModelHandler extends AbstractVariantModelHandler {
    private final boolean bookshelf;

    public DirectionalCTMVariantModelHandler(String name, VariantModel model, boolean bookshelf) {
        super(name, model);
        this.bookshelf = bookshelf;
    }

    @Override
    public boolean isConnectedTexture() {
        return true;
    }

    @Override
    public CTMKind ctmKind() {
        if (bookshelf) {
            return CTMKind.BOOKSHELF;
        }
        return switch (name) {
            case "ctmh" -> CTMKind.CTMH;
            case "ctmv" -> CTMKind.CTMV;
            default -> CTMKind.BOOKSHELF;
        };
    }
}
