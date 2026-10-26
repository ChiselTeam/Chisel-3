package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.datagen.guide.HandbookCategoryBuilder;
import io.github.chiselteam.chisel.datagen.providers.HandbookCategoryProvider;
import io.github.chiselteam.chisel.guide.HandbookCategory;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public final class ChiselHandbookCategories extends HandbookCategoryProvider {
    private BiConsumer<ResourceLocation, HandbookCategory> output;

    public ChiselHandbookCategories(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildCategories(BiConsumer<ResourceLocation, HandbookCategory> output) {
        this.output = output;
        addCategory("getting_started",
                HandbookCategoryBuilder.builder(Component.translatable("chisel.handbook.category.getting_started.title"), ResourceLocation.withDefaultNamespace("crafting_table"))
                        .description(Component.translatable("chisel.handbook.category.getting_started.description"))
                        .sortOrder(0)
                        .build());

        addCategory("palettes",
                HandbookCategoryBuilder.builder(Component.translatable("chisel.handbook.category.palettes.title"), ResourceLocation.withDefaultNamespace("stone_bricks"))
                        .description(Component.translatable("chisel.handbook.category.palettes.description"))
                        .sortOrder(10)
                        .build());

        addCategory("items",
                HandbookCategoryBuilder.builder(Component.translatable("chisel.handbook.category.items.title"), Chisel.prefix("chisel_iron"))
                        .description(Component.translatable("chisel.handbook.category.items.description"))
                        .sortOrder(20)
                        .build());

        addCategory("blocks",
                HandbookCategoryBuilder.builder(Component.translatable("chisel.handbook.category.blocks.title"), Chisel.prefix("marble_raw"))
                        .description(Component.translatable("chisel.handbook.category.blocks.description"))
                        .sortOrder(30)
                        .build());
    }

    private void addCategory(String name, HandbookCategory category) {
        output.accept(Chisel.prefix(name), category);
    }
}
