package io.github.chiselteam.chisel.datagen.migration;

import com.google.gson.*;

import javax.imageio.ImageIO;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.*;
import java.security.*;
import java.util.*;
import java.util.zip.ZipFile;

/** Reads reference assets without loading the other mods (both claim the chisel mod ID). */
public final class LegacyMigrationGenerator {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
    private static final List<String> COLORS = List.of("white orange magenta light_blue yellow lime pink gray light_gray cyan purple blue brown green red black".split(" "));
    private static final Map<String, String> SUFFIXES = new HashMap<>();
    static {
        alias("small_bricks", "bricks_small"); alias("soft_bricks", "bricks_soft");
        alias("solid_bricks", "bricks_solid"); alias("triple_bricks", "bricks_triple");
        alias("cracked_bricks", "bricks_cracked"); alias("encased_bricks", "bricks_encased");
        alias("chaotic_bricks", "chaotic"); alias("ornate", "ornate_small");
        alias("twist", "twisted"); alias("slant", "slanted"); alias("circularct", "circular");
        alias("large_tile", "tiles_large"); alias("layer", "layers"); alias("cut", "cuts");
        alias("french", "french_1"); alias("largeingot", "ingots_large"); alias("smallingot", "ingots_small");
        alias("large_ingot", "ingots_large"); alias("small_ingot", "ingots_small");
        alias("spaceblack", "space_black"); alias("iceiceice", "ice");
        alias("reinforcedcobbledirt", "reinforced_cobble"); alias("reinforcedcobble", "reinforced_cobble");
        alias("reinforceddirt", "reinforced"); alias("noborder", "borderless");
        alias("ironfencemodern", "fence"); alias("thickgrid", "grid_thick"); alias("thingrid", "grid_thin");
        alias("thick", "grid_thick"); alias("thin", "grid_thin"); alias("ornatesteel", "ornate");
        alias("ornatesteel_old", "ornate_old"); alias("steelframe", "steel");
        alias("chinese2", "chinese_2"); alias("japanese2", "japanese_2");
        alias("novice_necromancer", "necromancer_apprentice"); alias("redtomes", "tomes");
        alias("braced_planks", "braced"); alias("crude_horizontal_planks", "crude_horizontal");
        alias("crude_vertical_planks", "crude_vertical"); alias("encased_large_planks", "encased_large");
        alias("encased_planks", "encased"); alias("large_planks", "large");
        alias("vertical_planks", "vertical"); alias("shipping_crate", "shipping");
        alias("noentry", "no_entry"); alias("underconstruction", "under_construction");
        alias("acid", "chem"); alias("sound", "loud"); alias("underconstruction", "construction");
    }

    private static void alias(String from, String to) { SUFFIXES.put(from, to); }

    private interface Assets { byte[] read(String path) throws IOException; }

    public static void main(String[] args) throws Exception {
        Path root = Path.of(args.length > 0 ? args[0] : ".").toAbsolutePath();
        Path mods = args.length > 1 ? Path.of(args[1]) : root.resolve("run/mods");
        Path generated = root.resolve("src/generated/resources/assets/chisel");
        Set<String> targets = new TreeSet<>();
        try (var files = Files.list(generated.resolve("blockstates"))) {
            files.filter(p -> p.toString().endsWith(".json")).forEach(p -> targets.add(p.getFileName().toString().replace(".json", "")));
        }
        Assets ours = path -> {
            Path file = root.resolve("src/generated/resources").resolve(path);
            if (!Files.exists(file)) file = root.resolve("src/main/resources").resolve(path);
            return Files.exists(file) ? Files.readAllBytes(file) : null;
        };
        Map<String, List<String>> fingerprints = new HashMap<>();
        for (String target : targets) {
            String fingerprint = fingerprint(ours, "chisel:block/" + target);
            if (fingerprint != null) fingerprints.computeIfAbsent(fingerprint, k -> new ArrayList<>()).add(target);
        }
        Map<String, String> sources = new LinkedHashMap<>();
        sources.put("modern", "chisel-1.21.1-NeoForge-1.4.1.jar");
        sources.put("reborn", "chisel-neoforge-2.0.1+mc1.21.1.jar");
        Path output = root.resolve("src/generated/resources/data/chisel/migration");
        Files.createDirectories(output);
        for (var source : sources.entrySet()) {
            Path jar = mods.resolve(source.getValue());
            JsonObject mappings = new JsonObject();
            try (ZipFile zip = new ZipFile(jar.toFile())) {
                Assets assets = path -> {
                    var entry = zip.getEntry(path);
                    if (entry == null) return null;
                    try (var stream = zip.getInputStream(entry)) { return stream.readAllBytes(); }
                };
                for (var entry : zip.stream().filter(e -> e.getName().matches("assets/[^/]+/blockstates/.+\\.json")).sorted(Comparator.comparing(e -> e.getName())).toList()) {
                    String[] parts = entry.getName().split("/", 4);
                    String path = parts[3].replace(".json", "");
                    String target = candidates(source.getKey(), path).stream().filter(targets::contains).findFirst().orElse(null);
                    if (target == null && !path.contains("auto_chisel")) {
                        JsonObject state = json(assets, entry.getName());
                        String model = firstModel(state);
                        String fingerprint = model == null ? null : fingerprint(assets, model);
                        List<String> matches = fingerprint == null ? List.of() : fingerprints.getOrDefault(fingerprint, List.of());
                        // A shared flat tile is insufficient evidence to select among different variants.
                        if (matches.size() == 1) target = matches.getFirst();
                    }
                    if (target == null) mappings.add(parts[1] + ":" + path, JsonNull.INSTANCE);
                    else mappings.addProperty(parts[1] + ":" + path, "chisel:" + target);
                }
            }
            JsonObject profile = new JsonObject();
            profile.addProperty("sourceJar", source.getValue());
            profile.addProperty("sha256", HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(jar))));
            profile.add("blocks", mappings);
            JsonObject properties = new JsonObject();
            for (var value : mappings.asMap().values()) {
                if (value.isJsonNull()) continue;
                String target = value.getAsString();
                JsonObject state = json(ours, assetPath(target, "blockstates", ".json"));
                JsonObject allowed = new JsonObject();
                if (state.has("variants")) for (String variant : state.getAsJsonObject("variants").keySet()) {
                    for (String pair : variant.split(",")) {
                        String[] split = pair.split("=");
                        if (split.length == 2) {
                            if (!allowed.has(split[0])) allowed.add(split[0], new JsonArray());
                            JsonArray values = allowed.getAsJsonArray(split[0]);
                            for (String item : split[1].split("\\|")) if (!values.contains(new JsonPrimitive(item))) values.add(item);
                        }
                    }
                }
                if (state.has("multipart")) {
                    // Pane and iron-bar connection properties do not select a single model variant.
                    for (String key : List.of("north", "south", "east", "west", "waterlogged")) {
                        JsonArray values = new JsonArray(); values.add("false"); values.add("true"); allowed.add(key, values);
                    }
                }
                properties.add(target, allowed);
            }
            profile.add("properties", properties);
            Files.writeString(output.resolve(source.getKey() + ".json"), GSON.toJson(profile) + "\n");
            System.out.printf("%s: %d/%d mapped%n", source.getKey(), mappings.asMap().values().stream().filter(v -> !v.isJsonNull()).count(), mappings.size());
        }
    }

    private static List<String> candidates(String profile, String path) {
        if (path.contains("auto_chisel")) return List.of();
        String[] parts = path.split("/");
        if (parts.length < 2) return List.of(path);
        String family = profile.equals("modern") ? parts[0] : parts[parts.length - 1];
        String suffix = profile.equals("modern") ? parts[parts.length - 1] : parts[0];
        if (profile.equals("reborn")) {
            family = family.replaceFirst("_block$", "");
            for (String color : COLORS) if (family.equals(color + "_concrete")) family = "concrete_" + color;
        }
        if (family.startsWith("planks_")) family = family.substring(7) + "_planks";
        if (family.startsWith("glass_stained_")) family = "stained_glass_" + family.substring(14);
        if (family.startsWith("glassdyed_")) family = "stained_glass_" + family.substring(10);
        if (family.startsWith("glasspanedyed_")) family = "stained_glass_pane_" + family.substring(14);
        if (family.equals("woolen_clay") && COLORS.contains(suffix)) return List.of("woolen_clay_" + COLORS.indexOf(suffix));
        if (family.startsWith("hexplating_") && suffix.equals("hexbase")) return List.of("hex_plating_" + COLORS.indexOf(family.substring(11)));
        if (family.equals("sandstone_scribbles")) family = "sandstone";
        if (family.equals("sandstonered_scribbles")) family = "red_sandstone";
        if (family.equals("templemossy")) family = "mossy_temple";
        if (family.equals("stone_bricks")) family = "stone";
        if (family.equals("icepillar")) family = "ice_pillar";
        if (family.equals("marblepillar")) family = "marble_pillar";
        if (family.equals("ironpane")) {
            family = "iron_bars";
            suffix = switch (suffix) {
                case "barbedwire" -> "barbed_wire";
                case "classicnew" -> "classic_new";
                case "ornatesteel" -> "ornate_steel";
                case "thickgrid" -> "thick_grid";
                case "thingrid" -> "thin_grid";
                default -> suffix;
            };
        }
        if (family.equals("cloud") && suffix.equals("cloud")) suffix = "normal";
        if (Set.of("cobblestone", "mossy_cobblestone", "diorite").contains(family)) suffix = switch (suffix) {
            case "small_bricks" -> "small";
            case "soft_bricks" -> "soft";
            case "solid_bricks" -> "solid";
            case "triple_bricks" -> "triple";
            case "encased_bricks" -> "encased";
            case "french_1" -> "french";
            default -> suffix;
        };
        if (family.equals("paper")) family = "paperwall";
        if (family.equals("metals_copper")) family = "copper";
        if (family.equals("leaves")) family = "leaf";
        if (family.equals("jackolantern")) family = "jack_o_lantern";
        if ((family.equals("pumpkin") || family.equals("jack_o_lantern")) && suffix.startsWith("face_")) suffix = suffix.substring(5);
        suffix = suffix.replaceFirst("^(terrain_|a1_)", "");
        if (suffix.startsWith(family + "_")) suffix = suffix.substring(family.length() + 1);
        if (family.equals("glass")) suffix = suffix.replaceFirst("^glass_?", "").replaceFirst("^window_?", "");
        List<String> result = new ArrayList<>(List.of(family + "_" + suffix, family + "_" + SUFFIXES.getOrDefault(suffix, suffix)));
        return result;
    }

    private static JsonObject json(Assets assets, String path) throws IOException {
        byte[] bytes = assets.read(path);
        return bytes == null ? null : JsonParser.parseString(new String(bytes, java.nio.charset.StandardCharsets.UTF_8)).getAsJsonObject();
    }

    private static String firstModel(JsonElement value) {
        if (value == null) return null;
        if (value.isJsonObject()) {
            if (value.getAsJsonObject().has("model")) return value.getAsJsonObject().get("model").getAsString();
            for (var child : value.getAsJsonObject().asMap().values()) { String model = firstModel(child); if (model != null) return model; }
        } else if (value.isJsonArray()) for (var child : value.getAsJsonArray()) { String model = firstModel(child); if (model != null) return model; }
        return null;
    }

    private static String fingerprint(Assets assets, String model) throws IOException, NoSuchAlgorithmException {
        JsonObject object = json(assets, assetPath(model, "models", ".json"));
        if (object == null) return null;
        if (object.has("model_location")) return fingerprint(assets, object.get("model_location").getAsString());
        if (!object.has("parent") || !object.get("parent").getAsString().startsWith("minecraft:block/cube")) return null;
        if (!object.has("textures")) return null;
        JsonObject textures = object.getAsJsonObject("textures");
        // A shared side tile does not establish equivalence for a column or layered block.
        if (textures.has("bg") || textures.has("overlay")) return null;
        var digest = MessageDigest.getInstance("SHA-256");
        Map<String, byte[]> decoded = new HashMap<>();
        for (String face : List.of("north", "south", "east", "west", "top", "bottom")) {
            String key = textures.has(face) ? face
                    : face.equals("north") && textures.has("front") ? "front"
                    : face.equals("south") && textures.has("back") ? "back"
                    : Set.of("top", "bottom").contains(face) && textures.has("end") ? "end"
                    : textures.has("all") ? "all" : textures.has("side") ? "side" : null;
            if (key == null) return null;
            String texture = textures.get(key).getAsString();
            for (int i = 0; texture.startsWith("#") && i < 16; i++) {
                if (!textures.has(texture.substring(1))) return null;
                texture = textures.get(texture.substring(1)).getAsString();
            }
            if (texture.startsWith("#")) return null;
            if (decoded.containsKey(texture)) { digest.update(decoded.get(texture)); continue; }
            byte[] bytes = assets.read(assetPath(texture, "textures", ".png"));
            if (bytes == null) return null;
            var image = ImageIO.read(new ByteArrayInputStream(bytes));
            if (image == null) return null;
            var faceDigest = MessageDigest.getInstance("SHA-256");
            faceDigest.update(ByteBuffer.allocate(8).putInt(image.getWidth()).putInt(image.getHeight()).array());
            for (int pixel : image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth())) {
                // Invisible RGB varies between PNG encoders.
                faceDigest.update(ByteBuffer.allocate(4).putInt((pixel >>> 24) == 0 ? 0 : pixel).array());
            }
            byte[] signature = faceDigest.digest(); decoded.put(texture, signature); digest.update(signature);
        }
        return HexFormat.of().formatHex(digest.digest());
    }

    private static String assetPath(String id, String directory, String extension) {
        String[] parts = id.split(":", 2);
        return "assets/" + parts[0] + "/" + directory + "/" + parts[1] + extension;
    }
}
