package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

// import net.neoforged.neoforge.common.conditions.ModLoadedCondition;

public class ChiselCompatRecipes extends RecipeProvider {

    public ChiselCompatRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {

        // .save(output.withConditions(new ModLoadedCondition("ae2")));
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
            return new ChiselCompatRecipes(provider, recipeOutput);
        }

        @Override
        public @NonNull String getName() {
            return Chisel.MODID + " compat";
        }
    }
}
