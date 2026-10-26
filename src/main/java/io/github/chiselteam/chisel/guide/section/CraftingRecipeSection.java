package io.github.chiselteam.chisel.guide.section;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;

import java.util.Optional;

public record CraftingRecipeSection(ResourceLocation recipe, Optional<Recipe<?>> display) implements HandbookGuideSection {
    public static final MapCodec<CraftingRecipeSection> CODEC = RecordCodecBuilder.mapCodec(i -> i.group(
            ResourceLocation.CODEC.fieldOf("recipe").forGetter(CraftingRecipeSection::recipe),
            Recipe.CODEC.optionalFieldOf("display").forGetter(CraftingRecipeSection::display)
    ).apply(i, CraftingRecipeSection::new));

    public CraftingRecipeSection(ResourceLocation recipe) {
        this(recipe, Optional.empty());
    }

    @Override
    public ResourceLocation type() {
        return Chisel.prefix("crafting_recipe");
    }
}
