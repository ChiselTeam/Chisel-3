package io.github.chiselteam.chisel.registry;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.projectile.SmashingRockData;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public final class ChiselSmashingRockRegistry {
    public static final ResourceKey<Registry<SmashingRockData>> KEY = ResourceKey.createRegistryKey(Chisel.prefix("smashing_rock"));

    private ChiselSmashingRockRegistry() {
    }
}
