package io.github.chiselteam.chisel.guide.section;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.display.RecipeDisplay;

import java.util.Optional;

public record CraftingRecipeSection(Identifier recipe, Optional<RecipeDisplay> display) implements HandbookGuideSection {
    public static final MapCodec<CraftingRecipeSection> CODEC = RecordCodecBuilder.mapCodec(i -> i.group(
            Identifier.CODEC.fieldOf("recipe").forGetter(CraftingRecipeSection::recipe),
            RecipeDisplay.CODEC.optionalFieldOf("display").forGetter(CraftingRecipeSection::display)
    ).apply(i, CraftingRecipeSection::new));

    public CraftingRecipeSection(Identifier recipe) {
        this(recipe, Optional.empty());
    }

    @Override
    public Identifier type() {
        return Chisel.prefix("crafting_recipe");
    }
}
