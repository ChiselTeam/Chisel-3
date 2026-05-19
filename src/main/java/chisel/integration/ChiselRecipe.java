package chisel.integration;

import chisel.lib.variant.VariantFamily;
import net.minecraft.core.HolderLookup;

public record ChiselRecipe(VariantFamily family, HolderLookup.Provider registries) {
}
