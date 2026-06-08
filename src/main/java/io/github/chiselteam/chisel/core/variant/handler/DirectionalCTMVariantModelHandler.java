package io.github.chiselteam.chisel.core.variant.handler;

import io.github.chiselteam.chisel.core.variant.VariantModel;
import io.github.chiselteam.ctm.api.strategy.CTMKind;

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

