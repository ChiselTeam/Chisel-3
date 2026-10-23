package io.github.chiselteam.chisel.datagen.registry;

import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.registry.ChiselVariantFamilies;
import net.minecraft.data.worldgen.BootstrapContext;

public final class ChiselVariantFamilyRegistry {
    private ChiselVariantFamilyRegistry() {
    }

    public static void bootstrap(BootstrapContext<VariantFamily> context) {
        ChiselVariantFamilies.getVariantFamilies().forEach(family -> context.register(ChiselVariantFamilies.getKey(family), family));
    }
}
