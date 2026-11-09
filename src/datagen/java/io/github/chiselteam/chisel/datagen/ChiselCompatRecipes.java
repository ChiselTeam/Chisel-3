package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.content.ChiselFamilies;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnOakFramedStainedGlassFamily;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnSteelFramedStainedGlassFamily;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;

import java.util.concurrent.CompletableFuture;

public class ChiselCompatRecipes extends RecipeProvider {

    private RecipeOutput output;
    public ChiselCompatRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        this.output=output;

        shaped(RecipeCategory.MISC, new ItemStack(ChiselFamilies.ROSE_QUARTZ.getVariant("rose_quartz_raw").get().asItem(), 8))
                .pattern("QQQ")
                .pattern("QDQ")
                .pattern("QQQ")
                .define('Q', Blocks.QUARTZ_BLOCK)
                .define('D', Tags.Items.DYES_RED)
                .unlockedBy("has_quartz_block", has(Blocks.QUARTZ_BLOCK))
                .save(output.withConditions(new ModLoadedCondition("create")));

        for (var family : DnOakFramedStainedGlassFamily.FAMILY) {
            var color = family.getFamily().getFamilyName().substring("dn_oak_framed_stained_glass_".length());
            var glass = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "glass/" + color));
            shaped(RecipeCategory.MISC, new ItemStack(family.getFamily().getVariants().getFirst().getBlock().asItem(), 8))
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
            var glass = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "glass/" + color));
            shaped(RecipeCategory.MISC, new ItemStack(family.getFamily().getVariants().getFirst().getBlock().asItem(), 8))
                    .pattern("GGG")
                    .pattern("GIG")
                    .pattern("GGG")
                    .define('I', Tags.Items.INGOTS_IRON)
                    .define('G', glass)
                    .unlockedBy("has_" + color + "_stained_glass", has(glass))
                    .save(output.withConditions(new ModLoadedCondition("dyenamics")));
        }
    }

    private static net.minecraft.data.recipes.ShapedRecipeBuilder shaped(RecipeCategory category, ItemStack stack) { return net.minecraft.data.recipes.ShapedRecipeBuilder.shaped(category,stack); }
    private static net.minecraft.data.recipes.ShapedRecipeBuilder shaped(RecipeCategory category, net.minecraft.world.level.ItemLike item) { return net.minecraft.data.recipes.ShapedRecipeBuilder.shaped(category,item); }
    private static net.minecraft.data.recipes.ShapelessRecipeBuilder shapeless(RecipeCategory category, ItemStack stack) { return net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless(category,stack); }
}
