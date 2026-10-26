package io.github.chiselteam.chisel.migration;

import com.mojang.datafixers.DSL;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import net.minecraft.SharedConstants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/** Missing legacy names resolve during normal world loading and save under their canonical IDs. */
public final class LegacyWorldMigration {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Set<String> SUPPORTED_TYPES = Set.of(
            References.CHUNK.typeName(), References.PLAYER.typeName(), References.ENTITY_CHUNK.typeName(),
            References.STRUCTURE.typeName(), References.HOTBAR.typeName(), References.WORLD_GEN_SETTINGS.typeName());
    private static volatile LegacyWorldMigration installed;

    private final LegacyMappings mappings;
    private final Predicate<String> missingSource;
    private final Set<String> warned = ConcurrentHashMap.newKeySet();
    private volatile LegacyDataFixer fixer;

    private LegacyWorldMigration(LegacyMappings mappings, Predicate<String> missingSource) {
        this.mappings = mappings;
        this.missingSource = missingSource;
    }

    public static void register(DeferredRegister<Block> blocks, DeferredRegister<Item> items) {
        LegacyMappings mappings;
        try {
            mappings = LegacyMappings.loadAll();
        } catch (IOException exception) {
            throw new UncheckedIOException("Cannot load Chisel's legacy block mappings", exception);
        }
        addAliases(mappings, blocks::addAlias);
        addAliases(mappings, items::addAlias);
        // containsKey checks actual registrations; registry get/resolve also follow aliases.
        installed = new LegacyWorldMigration(mappings, id -> {
            ResourceLocation name = ResourceLocation.tryParse(id);
            return name != null && !BuiltInRegistries.BLOCK.containsKey(name);
        });
    }

    private static void addAliases(LegacyMappings mappings, java.util.function.BiConsumer<ResourceLocation, ResourceLocation> addAlias) {
        mappings.blocks().forEach((source, target) -> {
            if (target != null) addAlias.accept(ResourceLocation.parse(source), ResourceLocation.parse(target));
        });
    }

    public static <T> Dynamic<T> afterVanilla(DSL.TypeReference type, Dynamic<T> data, int targetVersion) {
        LegacyWorldMigration migration = installed;
        if (migration == null || targetVersion != SharedConstants.getCurrentVersion().getDataVersion().getVersion()) return data;
        return migration.update(type, data);
    }

    public static CompoundTag afterChunkUpgrade(CompoundTag chunk) {
        LegacyWorldMigration migration = installed;
        if (migration == null) return chunk;
        return (CompoundTag) migration.update(References.CHUNK, new Dynamic<>(NbtOps.INSTANCE, chunk)).getValue();
    }

    private <T> Dynamic<T> update(DSL.TypeReference type, Dynamic<T> data) {
        if (!SUPPORTED_TYPES.contains(type.typeName())) return data;
        Tag nbt = data.convert(NbtOps.INSTANCE).getValue();
        if (!(nbt instanceof CompoundTag compound)) return data;
        Set<String> legacyIds = mappings.legacyIds(compound);
        boolean needsMigration = false;
        for (String id : legacyIds) {
            if (!missingSource.test(id)) continue;
            if (mappings.blocks().get(id) != null) needsMigration = true;
            else if (warned.add(id)) LOGGER.warn("No automatic Chisel equivalent is available for missing block {}", id);
        }
        if (!needsMigration) return data;

        Dynamic<Tag> input = new Dynamic<>(NbtOps.INSTANCE, compound.copy());
        Dynamic<Tag> updated;
        try {
            updated = fixer().update(type, input);
        } catch (RuntimeException exception) {
            // Modded entity/container schemas may be unknown to vanilla DFU. Registry aliases still
            // resolve their block/item references without rewriting or discarding that mod's payload.
            if (warned.add(type.typeName())) LOGGER.debug("Using Chisel registry aliases for {} data outside vanilla DFU schemas", type.typeName(), exception);
            updated = input;
        }
        if (type.typeName().equals(References.CHUNK.typeName())) prepareChunkForSave((CompoundTag) updated.getValue());
        return updated.convert(data.getOps());
    }

    private LegacyDataFixer fixer() {
        LegacyDataFixer result = fixer;
        if (result == null) {
            synchronized (this) {
                result = fixer;
                if (result == null) fixer = result = new LegacyDataFixer(mappings, missingSource);
            }
        }
        return result;
    }

    private static void prepareChunkForSave(CompoundTag chunk) {
        // ChunkSerializer.read consumes shouldSave, including when the vanilla DataVersion is current.
        chunk.putBoolean("shouldSave", true);
        chunk.remove("Heightmaps");
        chunk.putBoolean("isLightOn", false);
        for (Tag section : chunk.getList("sections", Tag.TAG_COMPOUND)) {
            ((CompoundTag) section).remove("BlockLight");
            ((CompoundTag) section).remove("SkyLight");
        }
    }
}
