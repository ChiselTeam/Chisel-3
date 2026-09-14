package io.github.chiselteam.chisel.datagen.model;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.ctm.api.datagen.CTMModelBuilder;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;

import java.util.function.Consumer;

public final class VariantTextures {

    private VariantTextures() {
    }

    public static Material get(Variant variant) {
        return get(variant, "");
    }

    public static Material get(Variant variant, String suffix) {
        var override = variant.getTextures().get(suffix);
        if (override != null) return new Material(override);
        var base = variant.getTextures().get("");
        if (base == null) base = Chisel.prefix(getTexturePath(variant));
        return new Material(suffix.isEmpty() ? base : base.withPath(base.getPath() + "-" + suffix));
    }

    public static TextureMapping standard(Variant variant) {
        return ctm(variant, textures -> textures.standardTextures(get(variant).sprite(), get(variant, "ctm_cornerless").sprite(), get(variant, "ctm_vertical").sprite(), get(variant, "ctm_horizontal").sprite(), get(variant, "ctm_corner").sprite()));
    }

    public static TextureMapping ctm(Variant variant, Consumer<CTMModelBuilder> textures) {
        TextureMapping mapping = new TextureMapping();
        textures.accept(new CTMModelBuilder(variant.getBlock(), variant.getModelHandler().ctmKind()) {
            @Override
            public CTMModelBuilder texture(String slot, Identifier texture) {
                // CTM expands atlas bases into tile names after get() has resolved the base.
                // Apply exact tile overrides to those expanded names as well.
                var base = get(variant).sprite();
                String prefix = base.getPath() + "-";
                if (texture.getNamespace().equals(base.getNamespace()) && texture.getPath().startsWith(prefix)) {
                    texture = variant.getTextures().getOrDefault(texture.getPath().substring(prefix.length()), texture);
                }
                mapping.putForced(TextureSlot.create(slot), new Material(texture));
                return this;
            }
        });
        return mapping;
    }

    public static String getTexturePath(Variant variant) {
        var familyName = variant.getFamily().getFamilyName();
        var variantName = variant.getName();

        if (variantName.startsWith("waxed_")) {
            familyName = familyName.substring(6);
            variantName = variantName.substring(6);
        }

        return "block/%s/%s".formatted(familyName, variantName);
    }
}
