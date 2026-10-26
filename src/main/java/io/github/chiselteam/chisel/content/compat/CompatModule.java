package io.github.chiselteam.chisel.content.compat;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLEnvironment;
import org.jetbrains.annotations.ApiStatus;

import java.util.Collection;
import java.util.List;

@ApiStatus.Internal
public record CompatModule(String modId, List<ChiselFamily> families) {
    public CompatModule(String modId, Collection<List<ChiselFamily>> familyGroups) {
        this(modId, familyGroups.stream().flatMap(List::stream).toList());
    }

    public boolean isEnabled() {
        return !FMLEnvironment.production || ModList.get().isLoaded(modId);
    }
}
