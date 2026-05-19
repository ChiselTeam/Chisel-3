package chisel.lib.variant.handler;

import chisel.lib.variant.VariantModel;
import chisel.lib.ctm.CTMKind;

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
