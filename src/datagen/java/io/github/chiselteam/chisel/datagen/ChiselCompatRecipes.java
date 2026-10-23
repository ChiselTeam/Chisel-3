package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnOakFramedStainedGlassFamily;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnSteelFramedStainedGlassFamily;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ChiselCompatRecipes extends RecipeProvider {

    public ChiselCompatRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {

        for (var family : DnOakFramedStainedGlassFamily.FAMILY) {
            var color = family.getFamily().getFamilyName().substring("dn_oak_framed_stained_glass_".length());
            var glass = ItemTags.create(Identifier.fromNamespaceAndPath("c", "glass/" + color));
            shaped(RecipeCategory.MISC, new ItemStackTemplate(family.getFamily().getVariants().getFirst().getBlock().asItem(), 8))
                    .pattern("GGG")
                    .pattern("GIG")
                    .pattern("GGG")
                    .define('I', Items.OAK_PLANKS)
                    .define('G', glass)
                    .unlockedBy("has_" + color + "_stained_glass", has(glass))
                    .save(output.withConditions(new ModLoadedCondition("dyenamics")));
        }

        for (var family : DnSteelFramedStainedGlassFamily.FAMILY) {
            var color = family.getFamily().getFamilyName().substring("dn_steel_framed_stained_glass_".length());
            var glass = ItemTags.create(Identifier.fromNamespaceAndPath("c", "glass/" + color));
            shaped(RecipeCategory.MISC, new ItemStackTemplate(family.getFamily().getVariants().getFirst().getBlock().asItem(), 8))
                    .pattern("GGG")
                    .pattern("GIG")
                    .pattern("GGG")
                    .define('I', Tags.Items.INGOTS_IRON)
                    .define('G', glass)
                    .unlockedBy("has_" + color + "_stained_glass", has(glass))
                    .save(output.withConditions(new ModLoadedCondition("dyenamics")));
        }
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
