package io.github.chiselteam.chisel.integration.jei;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.ChiselAPI;
import io.github.chiselteam.chisel.client.gui.AutoChiselScreen;
import io.github.chiselteam.chisel.content.compat.CompatFamilies;
import io.github.chiselteam.chisel.registry.ChiselItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Collectors;

@JeiPlugin
public class JEICompatibility implements IModPlugin {
    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return Chisel.prefix("jei_plugin");
    }

    @Override
    public void registerCategories(@NotNull IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ChiselRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(@NotNull IRecipeRegistration registration) {
        var hiddenFamilyNames = CompatFamilies.hiddenFamilies().stream()
                .map(family -> family.getDefinition().name())
                .collect(Collectors.toSet());

        registration.addRecipes(ChiselRecipeCategory.TYPE, ChiselAPI.getFamilies(Minecraft.getInstance().level.registryAccess()).stream()
                .filter(family -> !hiddenFamilyNames.contains(family.getFamilyName()))
                .filter(family -> !family.getAllVariants().isEmpty())
                .filter(family -> family.getAllVariants().size() > 1)
                .map(family -> new ChiselRecipe(family, Minecraft.getInstance().level.registryAccess()))
                .collect(Collectors.toList()));
    }

    @Override
    public void onRuntimeAvailable(@NotNull IJeiRuntime runtime) {
        var hiddenItems = CompatFamilies.hiddenFamilies().stream()
                .flatMap(family -> family.getFamily().getVariants().stream())
                .map(variant -> variant.getBlock().asItem())
                .distinct()
                .map(ItemStack::new)
                .filter(stack -> !stack.isEmpty())
                .toList();
        if (!hiddenItems.isEmpty()) {
            runtime.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK, hiddenItems);
        }
    }

    @Override
    public void registerRecipeCatalysts(@NotNull IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ChiselItems.CHISEL_IRON.get()), ChiselRecipeCategory.TYPE);
        registration.addRecipeCatalyst(new ItemStack(ChiselItems.CHISEL_DIAMOND.get()), ChiselRecipeCategory.TYPE);
        registration.addRecipeCatalyst(new ItemStack(ChiselItems.CHISEL_OBSIDIAN.get()), ChiselRecipeCategory.TYPE);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addGenericGuiContainerHandler(AutoChiselScreen.class, new AutoChiselPickerBounds());
    }
}
