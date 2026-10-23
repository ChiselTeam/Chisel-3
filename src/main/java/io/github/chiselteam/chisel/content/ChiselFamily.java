package io.github.chiselteam.chisel.content;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.content.definition.VariantFamilyDefinition;
import io.github.chiselteam.chisel.content.definition.VariantFamilyDefinitionBuilder;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;
import java.util.function.Supplier;

@org.jetbrains.annotations.ApiStatus.Internal
public final class ChiselFamily {
    private final VariantFamilyDefinition definition;
    private VariantFamily family;

    public ChiselFamily(VariantFamilyDefinition definition) {
        this.definition = definition;
    }

    public static ChiselFamily build(String name, Consumer<VariantFamilyDefinitionBuilder> consumer) {
        VariantFamilyDefinitionBuilder builder = new VariantFamilyDefinitionBuilder(name);
        consumer.accept(builder);
        return new ChiselFamily(builder.build());
    }

    public VariantFamilyDefinition getDefinition() {
        return definition;
    }

    public VariantFamily getFamily() {
        if (family == null)
            throw new IllegalStateException("Family has not been registered: %s".formatted(definition.name()));
        return family;
    }

    public void setFamily(VariantFamily family) {
        if (this.family != null)
            throw new IllegalStateException("Family has already been registered: %s".formatted(definition.name()));
        this.family = family;
    }

    public Supplier<Block> getVariant(String name) {
        Variant variant = getFamily().getVariant(name);
        if (variant == null) {
            throw new IllegalArgumentException("Unknown variant '%s' in family '%s'".formatted(name, definition.name()));
        }
        return variant::getBlock;
    }

}
