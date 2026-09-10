package io.github.chiselteam.chisel.datagen.model;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.Variant;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.data.models.model.TextureMapping;

import static io.github.chiselteam.ctm.api.datagen.CTMTextureSlots.*;

public final class VariantTextures {

    private VariantTextures() {
    }

    public static Material get(Variant variant) {
        return new Material(Chisel.prefix(getTexturePath(variant)));
    }

    public static Material get(Variant variant, String suffix) {
        return new Material(Chisel.prefix("%s-%s".formatted(getTexturePath(variant), suffix)));
    }

    public static TextureMapping standard(Variant variant) {
        return new TextureMapping()
                .put(STANDARD_NONE, get(variant))
                .put(STANDARD_CORNERLESS, get(variant, "ctm_cornerless"))
                .put(STANDARD_VERTICAL, get(variant, "ctm_vertical"))
                .put(STANDARD_HORIZONTAL, get(variant, "ctm_horizontal"))
                .put(STANDARD_CORNER, get(variant, "ctm_corner"));
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
