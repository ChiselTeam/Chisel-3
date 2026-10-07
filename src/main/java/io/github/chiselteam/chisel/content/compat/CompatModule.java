package io.github.chiselteam.chisel.content.compat;

import io.github.chiselteam.chisel.content.ChiselFamily;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLEnvironment;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;

@ApiStatus.Internal
public record CompatModule(String modId, List<ChiselFamily> families) {
    public boolean isEnabled() {
        return !FMLEnvironment.isProduction() || ModList.get().isLoaded(modId);
    }
}
