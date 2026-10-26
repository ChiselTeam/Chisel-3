package io.github.chiselteam.chisel.datagen.model;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.ctm.api.datagen.CTMModelBuilder;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public final class VariantTextures {

    private VariantTextures() {
    }

    public static ResourceLocation get(Variant variant) {
        return get(variant, "");
    }

    public static ResourceLocation get(Variant variant, String suffix) {
        var override = variant.getTextures().get(suffix);
        if (override != null) return override;
        var base = variant.getTextures().get("");
        if (base == null) base = Chisel.prefix(getTexturePath(variant));
        return suffix.isEmpty() ? base : base.withPath(base.getPath() + "-" + suffix);
    }

    public static TextureMapping standard(Variant variant) {
        return ctm(variant, textures -> textures.standardTextures(get(variant), get(variant, "ctm_cornerless"), get(variant, "ctm_vertical"), get(variant, "ctm_horizontal"), get(variant, "ctm_corner")));
    }

    public static TextureMapping ctm(Variant variant, Consumer<CTMModelBuilder> textures) {
        TextureMapping mapping = new TextureMapping();
        textures.accept(new CTMModelBuilder(variant.getBlock(), variant.getModelHandler().ctmKind()) {
            @Override
            public CTMModelBuilder texture(String slot, ResourceLocation texture) {
                var base = get(variant);
                String prefix = base.getPath() + "-";
                if (texture.getNamespace().equals(base.getNamespace()) && texture.getPath().startsWith(prefix)) {
                    String suffix = texture.getPath().substring(prefix.length());
                    texture = variant.getTextures().getOrDefault(suffix, texture);
                }
                mapping.putForced(TextureSlot.create(slot), texture);
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
