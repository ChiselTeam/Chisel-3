package io.github.chiselteam.chisel.integration.jei;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.registry.ChiselItems;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.placement.HorizontalAlignment;
import mezz.jei.api.gui.placement.VerticalAlignment;
import mezz.jei.api.gui.widgets.IRecipeExtrasBuilder;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.AbstractRecipeCategory;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ChiselRecipeCategory extends AbstractRecipeCategory<ChiselRecipe> {
    public static final RecipeType<ChiselRecipe> TYPE = new RecipeType<>(Chisel.prefix("carving"), ChiselRecipe.class);

    public ChiselRecipeCategory(IGuiHelper guiHelper) {
        super(
                TYPE,
                ChiselItems.CHISEL_IRON.get().getName(new ItemStack(ChiselItems.CHISEL_IRON.get())),
                guiHelper.createDrawableItemStack(new ItemStack(ChiselItems.CHISEL_IRON.get())),
                160,
                100
        );
    }

    @Override
    public void createRecipeExtras(@NotNull IRecipeExtrasBuilder builder, @NotNull ChiselRecipe recipe, @NotNull IFocusGroup focuses) {
        var variants = recipe.family().getAllVariants();
        if (variants.isEmpty() || variants.size() < 2) return;

        builder.addText(variants.getFirst().getBlock().getName(), getWidth() - 20, 20)
                .setPosition(0, -5)
                .setColor(0xFF505050)
                .setLineSpacing(0)
                .setTextAlignment(VerticalAlignment.CENTER)
                .setTextAlignment(HorizontalAlignment.CENTER);

        var outputSlots = builder.getRecipeSlots().getSlots(RecipeIngredientRole.OUTPUT);
        var widget = builder.addScrollGridWidget(outputSlots, 7, 5);
        widget.setPosition(0, 0, getWidth(), getHeight(), HorizontalAlignment.CENTER, VerticalAlignment.BOTTOM);
    }

    @Override
    public void setRecipe(@NotNull IRecipeLayoutBuilder builder, @NotNull ChiselRecipe recipe, @NotNull IFocusGroup focuses) {
        var family = recipe.family();
        var variants = family.getAllVariants();

        var inputs = builder.addInvisibleIngredients(RecipeIngredientRole.INPUT);
        variants.forEach(variant -> inputs.addItemLike(variant.getBlock()));
        variants.forEach(variant -> builder.addOutputSlot().addItemLike(variant.getBlock()));
    }
}
