package io.github.chiselteam.chisel.datagen.providers;

import io.github.chiselteam.chisel.datagen.ChiselBlockLootTables;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class ChiselLootTableProvider extends LootTableProvider {
    public ChiselLootTableProvider() {
        super(Set.of(), List.of(
                new SubProviderEntry(ChiselBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}
