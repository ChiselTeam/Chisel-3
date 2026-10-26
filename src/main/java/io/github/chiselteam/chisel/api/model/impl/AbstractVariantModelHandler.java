package io.github.chiselteam.chisel.api.model.impl;

import io.github.chiselteam.chisel.api.model.VariantModelHandler;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractVariantModelHandler implements VariantModelHandler {
    protected final String name;

    protected AbstractVariantModelHandler(String name) {
        this.name = name;
    }

    @Override
    public @NotNull String getSerializedName() {
        return name;
    }
}