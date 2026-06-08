package io.github.chiselteam.chisel.block.util;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.core.variant.Variant;
import io.github.chiselteam.chisel.core.variant.VariantFamily;
import io.github.chiselteam.chisel.datagen.ChiselVariants;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class ChiselFamily {

    protected ResourceKey<VariantFamily> KEY;
    protected VariantFamily family;

    public VariantFamily getFamily() {
        ChiselVariants.VARIANT_FAMILIES.putIfAbsent(family.getFamilyName(), family);
        return family;
    }

    protected VariantFamily.Builder builder(String name) {
        return new VariantFamily.Builder(name);
    }

    public ResourceKey<VariantFamily> getKey() {
        if (KEY == null) {
            KEY = ResourceKey.create(ChiselVariants.KEY, Chisel.prefix(getFamily().getFamilyName()));
        }
        return KEY;
    }

    public java.util.function.Supplier<Block> getVariant(String name) {
        return () -> family.getVariants().stream()
                .filter(v -> v.getName().equals(name))
                .findFirst()
                .map(Variant::getBlock)
                .orElseThrow(() -> new IllegalArgumentException("Variant not found: " + name));
    }

    public void addTranslations(LangHelper lang) {
    }
}
