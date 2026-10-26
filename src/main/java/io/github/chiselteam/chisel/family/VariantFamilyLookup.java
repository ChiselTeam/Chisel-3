package io.github.chiselteam.chisel.family;

import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.registry.ChiselVariantFamilies;
import net.minecraft.core.RegistryAccess;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.ApiStatus;

import java.util.*;

@ApiStatus.Internal
public final class VariantFamilyLookup {
    private static final Map<RegistryAccess, Map<Block, Optional<VariantFamily>>> FAMILY_CACHE = new WeakHashMap<>();

    private VariantFamilyLookup() {
    }

    public static synchronized Optional<VariantFamily> getFamily(Block block, RegistryAccess registryAccess) {
        if (block == null) return Optional.empty();
        Map<Block, Optional<VariantFamily>> families = FAMILY_CACHE.computeIfAbsent(registryAccess, ignored -> new IdentityHashMap<>());

        return families.computeIfAbsent(block, key -> getFamilies(registryAccess).stream()
                .filter(family -> family.isBlockInFamily(key)).findFirst());
    }

    public static synchronized void clearCache() {
        FAMILY_CACHE.clear();
    }

    public static VariantFamily getFamilyForBlock(Block block, RegistryAccess registryAccess) {
        return getFamily(block, registryAccess).orElse(null);
    }

    public static Collection<VariantFamily> getFamilies(RegistryAccess registryAccess) {
        LinkedHashSet<VariantFamily> families = new LinkedHashSet<>();
        if (registryAccess != null)
            registryAccess.registry(ChiselVariantFamilies.KEY).ifPresent(registry -> registry.forEach(families::add));
        families.addAll(ChiselVariantFamilies.getVariantFamilies());
        families.addAll(AddonFamilyRegistry.getFamilies());
        return List.copyOf(families);
    }
}
