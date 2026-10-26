package io.github.chiselteam.chisel.registry;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChiselStats {

    public static final DeferredRegister<ResourceLocation> STATS = DeferredRegister.create(BuiltInRegistries.CUSTOM_STAT, Chisel.MODID);

    public static final DeferredHolder<ResourceLocation, ResourceLocation> INTERACT_WITH_AUTO_CHISEL = makeStat( "interact_with_auto_chisel");
    public static final DeferredHolder<ResourceLocation, ResourceLocation> BLOCKS_CHISELED = makeStat( "blocks_chiseled");
    public static final DeferredHolder<ResourceLocation, ResourceLocation> CHISEL_GUIDE_USED = makeStat("chisel_guide_used");

    private static DeferredHolder<ResourceLocation, ResourceLocation> makeStat(String name) {
        ResourceLocation location = Chisel.prefix(name);
        return STATS.register(name, () -> location);
    }
}
