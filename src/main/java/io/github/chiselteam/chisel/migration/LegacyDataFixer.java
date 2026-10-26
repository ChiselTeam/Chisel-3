package io.github.chiselteam.chisel.migration;

import com.mojang.datafixers.*;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.SharedConstants;
import net.minecraft.util.datafix.DataFixers;
import net.minecraft.util.datafix.fixes.*;
import net.minecraft.util.datafix.schemas.NamespacedSchema;

import java.util.*;
import java.util.function.Predicate;

/** Mod migrations have their own version range: vanilla DataVersion must never be falsified. */
public final class LegacyDataFixer {
    public static final int VERSION = 1;
    private final LegacyMappings mappings;
    private final DataFixer fixer;
    private final Predicate<String> missingSource;

    public LegacyDataFixer(LegacyMappings mappings, Predicate<String> missingSource) {
        this.mappings = mappings;
        this.missingSource = missingSource;
        Schema vanilla = DataFixers.getDataFixer().getSchema(DataFixUtils.makeKey(SharedConstants.getCurrentVersion().getDataVersion().getVersion()));
        DataFixerBuilder builder = new DataFixerBuilder(VERSION);
        // Reuse Minecraft's complete, current schemas for chunks, players, entities and components.
        builder.addSchema(0, (key, parent) -> new NamespacedSchema(key, vanilla));
        Schema schema = builder.addSchema(VERSION, NamespacedSchema::new);
        builder.addFixer(new StatePropertiesFix(schema));
        builder.addFixer(BlockRenameFix.create(schema, "Chisel legacy block IDs", this::rename));
        builder.addFixer(ItemRenameFix.create(schema, "Chisel legacy block item IDs", this::rename));
        fixer = builder.build().fixer();
    }

    private String rename(String id) {
        return Optional.ofNullable(target(id)).orElse(id);
    }

    private String target(String id) {
        String target = mappings.blocks().get(id);
        return target != null && missingSource.test(id) ? target : null;
    }

    public <T> Dynamic<T> update(DSL.TypeReference type, Dynamic<T> input) {
        // DataFixerUpper.update permits partial reads. Conversion must reject malformed input.
        fixer.getSchema(DataFixUtils.makeKey(0)).getTypeRaw(type).readTyped(input).getOrThrow();
        return fixer.update(type, input, 0, VERSION);
    }

    private final class StatePropertiesFix extends DataFix {
        StatePropertiesFix(Schema schema) { super(schema, false); }

        @Override
        protected TypeRewriteRule makeRule() {
            TypeRewriteRule states = fixTypeEverywhereTyped("Chisel legacy block properties", getInputSchema().getType(References.BLOCK_STATE),
                    typed -> typed.update(DSL.remainderFinder(), this::updateState));
            var idFinder = DSL.fieldFinder("id", DSL.named(References.ITEM_NAME.typeName(), NamespacedSchema.namespacedString()));
            TypeRewriteRule items = fixTypeEverywhereTyped("Chisel legacy block item properties", getInputSchema().getType(References.ITEM_STACK), typed -> {
                String source = typed.getOptional(idFinder).map(pair -> pair.getSecond()).orElse("");
                String target = target(source);
                if (target == null) return typed;
                Dynamic<?> data = typed.write().getOrThrow();
                if (data.get("components").get("minecraft:block_state").result().isEmpty()) return typed;
                Dynamic<?> updated = data.update("components", components -> components.update("minecraft:block_state", properties -> filterProperties(properties, target)));
                return typed.getType().readTyped(updated).getOrThrow().getFirst();
            });
            return TypeRewriteRule.seq(states, items);
        }

        private Dynamic<?> updateState(Dynamic<?> state) {
            String source = state.get("Name").asString("");
            String target = target(source);
            if (target == null) return state;
            return state.update("Properties", properties -> filterProperties(properties, target));
        }

        private Dynamic<?> filterProperties(Dynamic<?> properties, String target) {
            Map<String, Set<String>> allowed = mappings.properties().getOrDefault(target, Map.of());
            Dynamic<?> result = properties;
            for (var entry : properties.getMapValues().result().orElse(Map.of()).entrySet()) {
                String key = entry.getKey().asString("");
                if (!allowed.getOrDefault(key, Set.of()).contains(entry.getValue().asString(""))) result = result.remove(key);
            }
            return result;
        }
    }
}
