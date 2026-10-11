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
import mezz.jei.api.recipe.category.AbstractRecipeCategory;
import mezz.jei.api.recipe.types.IRecipeType;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.NonNull;

public class ChiselRecipeCategory extends AbstractRecipeCategory<ChiselRecipe> {
    public static final IRecipeType<ChiselRecipe> TYPE = IRecipeType.create(Chisel.prefix("carving"), ChiselRecipe.class);

    public ChiselRecipeCategory(IGuiHelper guiHelper) {
        var chisel = new ItemStack(ChiselItems.CHISEL_IRON.get());
        super(
                TYPE,
                ChiselItems.CHISEL_IRON.get().getName(chisel),
                guiHelper.createDrawableItemStack(chisel),
                160,
                100
        );
    }

    @Override
    public void createRecipeExtras(@NonNull IRecipeExtrasBuilder builder, @NonNull ChiselRecipe recipe, @NonNull IFocusGroup focuses) {
        var variants = recipe.family().getAllVariants();
        if (variants.isEmpty() || variants.size() <= 2) return;

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
    public void setRecipe(@NonNull IRecipeLayoutBuilder builder, @NonNull ChiselRecipe recipe, @NonNull IFocusGroup focuses) {
        var family = recipe.family();
        var variants = family.getAllVariants();

        var inputs = builder.addInvisibleIngredients(RecipeIngredientRole.INPUT);
        variants.forEach(variant -> inputs.add(variant.getBlock()));
        variants.forEach(variant -> builder.addOutputSlot().add(variant.getBlock()));
    }
}
