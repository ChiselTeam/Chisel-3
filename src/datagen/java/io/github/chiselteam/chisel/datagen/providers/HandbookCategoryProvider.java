package io.github.chiselteam.chisel.datagen.providers;

import io.github.chiselteam.chisel.guide.HandbookCategory;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

/**
 * Writes code-authored categories to the datapack directory used by the handbook loader.
 */
public abstract class HandbookCategoryProvider implements DataProvider {
    private final PackOutput.PathProvider paths;
    private final CompletableFuture<HolderLookup.Provider> registries;

    protected HandbookCategoryProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        paths = output.createPathProvider(PackOutput.Target.DATA_PACK, "chisel/handbook_categories");
        this.registries = registries;
    }

    protected abstract void buildCategories(BiConsumer<Identifier, HandbookCategory> output);

    @Override
    public @NonNull CompletableFuture<?> run(@NonNull CachedOutput cache) {
        return registries.thenCompose(lookup -> {
            Map<Identifier, HandbookCategory> categories = new LinkedHashMap<>();
            buildCategories((id, category) -> {
                if (categories.putIfAbsent(id, category) != null)
                    throw new IllegalStateException("Duplicate handbook category: " + id);
            });
            return CompletableFuture.allOf(categories.entrySet().stream()
                    .map(entry -> DataProvider.saveStable(cache, lookup, HandbookCategory.CODEC, entry.getValue(), paths.json(entry.getKey())))
                    .toArray(CompletableFuture[]::new));
        });
    }

    @Override
    public @NonNull String getName() {
        return "Handbook Categories";
    }
}

