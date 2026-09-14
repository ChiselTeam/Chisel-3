package io.github.chiselteam.chisel.content.definition;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ApiStatus.Internal
public record VariantFamilyDefinition(String name, List<VariantDefinition> variants,
                                      List<TorchVariantDefinition> torchVariants,
                                      Map<String, VariantTranslation> translations, TagKey<Block> tag,
                                      Map<String, Map<String, Identifier>> textures) {
    public VariantFamilyDefinition {
        variants = List.copyOf(variants);
        torchVariants = List.copyOf(torchVariants);
        translations = Map.copyOf(translations);
        textures = textures.entrySet().stream().collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> Map.copyOf(entry.getValue())));
    }
}
