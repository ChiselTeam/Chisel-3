package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnOakFramedStainedGlassFamily;
import io.github.chiselteam.chisel.content.compat.dyenamics.DnSteelFramedStainedGlassFamily;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;

public class ChiselCompatRecipes extends RecipeProvider {

    public ChiselCompatRecipes(BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        super(recipes, advancements, Chisel.MODID);
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

}
