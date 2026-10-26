package io.github.chiselteam.chisel.datagen.providers;

import io.github.chiselteam.chisel.guide.HandbookGuide;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public abstract class HandbookGuideProvider implements DataProvider {
    private final PackOutput.PathProvider paths;
    private final CompletableFuture<HolderLookup.Provider> registries;

    protected HandbookGuideProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        paths = output.createPathProvider(PackOutput.Target.DATA_PACK, "chisel/handbook_guides");
        this.registries = registries;
    }

    protected abstract void buildGuides(BiConsumer<ResourceLocation, HandbookGuide> output);

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        return registries.thenCompose(lookup -> {
            Map<ResourceLocation, HandbookGuide> guides = new LinkedHashMap<>();
            buildGuides((id, guide) -> {
                if (guides.putIfAbsent(id, guide) != null)
                    throw new IllegalStateException("Duplicate handbook guide: " + id);
            });
            return CompletableFuture.allOf(guides.entrySet().stream()
                    .map(entry -> DataProvider.saveStable(cache, lookup, HandbookGuide.CODEC, entry.getValue(), paths.json(entry.getKey())))
                    .toArray(CompletableFuture[]::new));
        });
    }

    @Override
    public @NotNull String getName() {
        return "Handbook Guides";
    }
}
