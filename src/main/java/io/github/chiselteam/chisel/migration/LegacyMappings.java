package io.github.chiselteam.chisel.migration;

import com.google.gson.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import net.minecraft.nbt.*;

/** Explicit reference-jar inventory; null targets mean that no equivalent has been established. */
public record LegacyMappings(Map<String, String> blocks, Map<String, Map<String, Set<String>>> properties) {
    public static LegacyMappings loadAll() throws IOException {
        return load("modern").with(load("reborn"));
    }

    public static LegacyMappings load(String profile) throws IOException {
        if (!Set.of("modern", "reborn").contains(profile)) throw new IllegalArgumentException("Unknown source profile: " + profile);
        String resource = "/data/chisel/migration/" + profile + ".json";
        try (InputStream stream = LegacyMappings.class.getResourceAsStream(resource)) {
            if (stream == null) throw new IOException("Missing migration table " + resource);
            JsonObject root = JsonParser.parseReader(new InputStreamReader(stream, StandardCharsets.UTF_8)).getAsJsonObject();
            Map<String, String> blocks = new TreeMap<>();
            root.getAsJsonObject("blocks").asMap().forEach((key, value) -> blocks.put(key, value.isJsonNull() ? null : value.getAsString()));
            Map<String, Map<String, Set<String>>> properties = new TreeMap<>();
            root.getAsJsonObject("properties").asMap().forEach((id, value) -> {
                Map<String, Set<String>> allowed = new TreeMap<>();
                value.getAsJsonObject().asMap().forEach((key, values) -> {
                    Set<String> strings = new TreeSet<>(); values.getAsJsonArray().forEach(v -> strings.add(v.getAsString())); allowed.put(key, Set.copyOf(strings));
                });
                properties.put(id, Map.copyOf(allowed));
            });
            return new LegacyMappings(Collections.unmodifiableMap(blocks), Map.copyOf(properties));
        }
    }

    public LegacyMappings with(LegacyMappings other) {
        Map<String, String> combined = new TreeMap<>(blocks);
        other.blocks.forEach((id, target) -> {
            if (combined.containsKey(id) && !Objects.equals(combined.get(id), target)) throw new IllegalArgumentException("Conflicting source profiles for " + id);
            combined.put(id, target);
        });
        Map<String, Map<String, Set<String>>> schemas = new TreeMap<>(properties); schemas.putAll(other.properties);
        return new LegacyMappings(Collections.unmodifiableMap(combined), Map.copyOf(schemas));
    }

    public Set<String> legacyIds(Tag value) {
        Set<String> result = new TreeSet<>();
        boolean chisel = blocks.keySet().stream().anyMatch(k -> k.startsWith("chisel:"));
        findLegacyIds(value, result, chisel);
        return result;
    }

    private void findLegacyIds(Tag value, Set<String> result, boolean chisel) {
        if (value instanceof StringTag string) {
            String id = string.getAsString();
            int properties = id.indexOf('['), nbt = id.indexOf('{');
            int end = properties < 0 ? id.length() : properties;
            if (nbt >= 0) end = Math.min(end, nbt);
            String bare = id.substring(0, end);
            if (blocks.containsKey(bare) || chisel && bare.startsWith("chisel:") && bare.contains("/")) result.add(bare);
        } else if (value instanceof CompoundTag compound) {
            for (String key : compound.getAllKeys()) findLegacyIds(compound.get(key), result, chisel);
        } else if (value instanceof ListTag list) {
            for (Tag child : list) findLegacyIds(child, result, chisel);
        }
    }
}
