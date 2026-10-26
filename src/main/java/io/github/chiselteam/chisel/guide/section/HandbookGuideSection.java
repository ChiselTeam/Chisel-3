package io.github.chiselteam.chisel.guide.section;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.resources.ResourceLocation;

public sealed interface HandbookGuideSection permits TextSection, TipSection, PaletteSection, ImageSection, StructureSection, CraftingRecipeSection {
    Codec<HandbookGuideSection> CODEC = ResourceLocation.CODEC.dispatch("type", HandbookGuideSection::type, HandbookGuideSection::codecFor);

    private static MapCodec<? extends HandbookGuideSection> codecFor(ResourceLocation type) {
        if (type.equals(Chisel.prefix("text"))) return TextSection.CODEC;
        if (type.equals(Chisel.prefix("tip"))) return TipSection.CODEC;
        if (type.equals(Chisel.prefix("palette"))) return PaletteSection.CODEC;
        if (type.equals(Chisel.prefix("image"))) return ImageSection.CODEC;
        if (type.equals(Chisel.prefix("structure"))) return StructureSection.CODEC;

        if (type.equals(Chisel.prefix("crafting_recipe"))) return CraftingRecipeSection.CODEC;

        throw new IllegalArgumentException("Unknown handbook section type: " + type);
    }

    ResourceLocation type();
}
