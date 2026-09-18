package io.github.chiselteam.chisel.content.definition;

import com.google.gson.JsonParser;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.ApiStatus;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@ApiStatus.Internal
public final class FamilyTextureOverrides {
    private FamilyTextureOverrides() {
    }

    public static void apply(String family, VariantFamilyDefinitionBuilder builder) {
        String resource = "/assets/chisel/texture_overrides/" + family + ".json";
        try (var stream = FamilyTextureOverrides.class.getResourceAsStream(resource)) {
            if (stream == null) return;
            try (var reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
                JsonParser.parseReader(reader).getAsJsonObject().entrySet().forEach(variant ->
                        variant.getValue().getAsJsonObject().entrySet().forEach(texture ->
                                builder.texture(variant.getKey(), texture.getKey(), Identifier.parse(texture.getValue().getAsString()))));
            }
        } catch (IOException | RuntimeException exception) {
            throw new IllegalStateException("Cannot load family texture overrides from " + resource, exception);
        }
    }
}
