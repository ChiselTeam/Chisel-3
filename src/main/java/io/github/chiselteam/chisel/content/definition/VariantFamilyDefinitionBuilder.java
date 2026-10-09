package io.github.chiselteam.chisel.content.definition;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.api.model.VariantModelHandler;
import io.github.chiselteam.chisel.block.ChiselRotatedPillarBlock;
import io.github.chiselteam.chisel.block.ConnectedTextureBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import org.jetbrains.annotations.ApiStatus;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@ApiStatus.Internal
public final class VariantFamilyDefinitionBuilder {

    private final String name;
    private final List<VariantDefinition> variants = new ArrayList<>();
    private final List<TorchVariantDefinition> torchVariants = new ArrayList<>();
    private final Map<String, VariantTranslation> translations = new LinkedHashMap<>();
    private final Map<String, Map<String, Identifier>> textures = new LinkedHashMap<>();
    private final TagKey<Block> tag;
    private VariantBuilder defaults = new VariantBuilder();

    public VariantFamilyDefinitionBuilder(String name) {
        this.name = requireName(name, "family");
        this.tag = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("c", "chisel/%s".formatted(name)));
    }

    private static String requireName(String value, String kind) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Invalid " + kind + " name: '" + value + "'");
        return value;
    }

    /**
     * Updates shared settings for subsequent variants using a detached copy.
     */
    public VariantFamilyDefinitionBuilder defaults(Consumer<VariantBuilder> configure) {
        var settings = new VariantBuilder(defaults);
        Objects.requireNonNull(configure, "Defaults callback cannot be null").accept(settings);
        defaults = new VariantBuilder(settings);
        return this;
    }

    /**
     * Declares a generated variant using its complete registration name.
     */
    public VariantFamilyDefinitionBuilder variant(String variantName, Consumer<VariantBuilder> configure) {
        var settings = configureVariant(variantName, configure);
        if (settings.eldritch && settings.weathering)
            throw new IllegalArgumentException("Variant cannot be both eldritch and weathering: " + variantName);
        Function<Properties, ? extends Block> factory = settings.weathering ? null : settings.blockFactory != null ? settings.blockFactory
                : settings.eldritch ? ConnectedTextureBlock::new : defaultBlockFactory(variantName);
        variants.add(new VariantDefinition(variantName, null, factory, settings.requireProperties(), settings.model,
                true, true, settings.eldritch, settings.weathering));
        addSettings(variantName, settings);
        return this;
    }

    /**
     * Declares a standing/wall torch pair with scoped settings.
     */
    public VariantFamilyDefinitionBuilder torchVariant(String variantName, Consumer<VariantBuilder> configure) {
        var settings = configureVariant(variantName, configure);
        if (settings.eldritch || settings.weathering || settings.waxed)
            throw new IllegalArgumentException("Torch variant has incompatible registration settings: " + variantName);
        torchVariants.add(new TorchVariantDefinition(variantName, settings.blockFactory, settings.requireProperties(), settings.wallFactory));
        addSettings(variantName, settings);
        return this;
    }

    /**
     * Includes an existing block without applying generated-variant defaults.
     */
    public VariantFamilyDefinitionBuilder existingBlock(Block block) {
        Objects.requireNonNull(block, "Existing block cannot be null for family '" + name + "'");
        variants.add(new VariantDefinition(block.getDescriptionId(), () -> block, null, null, ChiselModelHandlers.CUBE_ALL, false, true, false, false));
        return this;
    }

    private VariantBuilder configureVariant(String variantName, Consumer<VariantBuilder> configure) {
        requireName(variantName, "variant");
        var settings = new VariantBuilder(defaults);
        Objects.requireNonNull(configure, "Variant callback cannot be null").accept(settings);
        return settings;
    }

    private void addSettings(String variantName, VariantBuilder settings) {
        if (settings.blockName != null || settings.description != null)
            addTranslation(variantName, settings.blockName, settings.description, settings.waxed);
        var resolved = settings.resolveTextures(variantName);
        if (!resolved.isEmpty() && textures.putIfAbsent(variantName, resolved) != null)
            throw new IllegalArgumentException("Duplicate textures for variant '" + variantName + "' in family '" + name + "'");
    }

    public final class VariantBuilder {
        private String blockName;
        private String description;
        private VariantModelHandler model = ChiselModelHandlers.CUBE_ALL;
        private Function<Properties, ? extends Block> blockFactory;
        private Supplier<Properties> properties;
        private Function<Properties, ? extends Block> wallFactory;
        private boolean eldritch;
        private boolean weathering;
        private boolean waxed;
        private final Map<String, Identifier> textures = new LinkedHashMap<>();
        private final Map<String, String> aliases = new LinkedHashMap<>();

        private VariantBuilder() {
        }

        private VariantBuilder(VariantBuilder source) {
            blockName = source.blockName;
            description = source.description;
            model = source.model;
            blockFactory = source.blockFactory;
            properties = source.properties;
            wallFactory = source.wallFactory;
            eldritch = source.eldritch;
            weathering = source.weathering;
            waxed = source.waxed;
            textures.putAll(source.textures);
            aliases.putAll(source.aliases);
        }

        public VariantBuilder blockName(String value) {
            blockName = Objects.requireNonNull(value, "Block name cannot be null");
            return this;
        }

        public VariantBuilder description(String value) {
            description = Objects.requireNonNull(value, "Description cannot be null");
            return this;
        }

        public VariantBuilder model(VariantModelHandler value) {
            model = Objects.requireNonNull(value, "Model handler cannot be null");
            return this;
        }

        public VariantBuilder blockFactory(Function<Properties, ? extends Block> value) {
            blockFactory = Objects.requireNonNull(value, "Block factory cannot be null");
            return this;
        }

        public VariantBuilder wallFactory(Function<Properties, ? extends Block> value) {
            wallFactory = Objects.requireNonNull(value, "Wall block factory cannot be null");
            return this;
        }

        public VariantBuilder eldritch() {
            return eldritch(true);
        }

        public VariantBuilder eldritch(boolean value) {
            eldritch = value;
            return this;
        }

        public VariantBuilder weathering() {
            return weathering(true);
        }

        public VariantBuilder weathering(boolean value) {
            weathering = value;
            return this;
        }

        public VariantBuilder waxed() {
            return waxed(true);
        }

        public VariantBuilder waxed(boolean value) {
            waxed = value;
            return this;
        }

        private Supplier<Properties> requireProperties() {
            if (properties == null)
                throw new IllegalStateException("No block properties configured for family '%s'".formatted(name));
            return properties;
        }

        public VariantBuilder properties(Properties value) {
            Objects.requireNonNull(value, "Block properties cannot be null");
            return properties(() -> value);
        }

        public VariantBuilder properties(Supplier<Properties> value) {
            properties = Objects.requireNonNull(value, "Block properties supplier cannot be null");
            return this;
        }

        public VariantBuilder texture(Identifier value) {
            return texture("", value);
        }

        public VariantBuilder texture(String suffix, Identifier value) {
            Objects.requireNonNull(suffix, "Texture suffix cannot be null");
            textures.put(suffix, Objects.requireNonNull(value, "Texture cannot be null"));
            aliases.remove(suffix);
            return this;
        }

        public VariantBuilder textureFromBase(String suffix) {
            return textureAlias(suffix, "");
        }

        /**
         * Sources without overrides resolve through the normal base-plus-suffix convention.
         */
        public VariantBuilder textureAlias(String targetSuffix, String sourceSuffix) {
            Objects.requireNonNull(targetSuffix, "Target texture suffix cannot be null");
            Objects.requireNonNull(sourceSuffix, "Source texture suffix cannot be null");
            aliases.put(targetSuffix, sourceSuffix);
            textures.remove(targetSuffix);
            return this;
        }

        private Map<String, Identifier> resolveTextures(String variantName) {
            var resolved = new LinkedHashMap<>(textures);
            aliases.keySet().forEach(suffix -> resolveTexture(suffix, variantName, resolved, new HashSet<>()));
            return resolved;
        }

        private Identifier resolveTexture(String suffix, String variantName, Map<String, Identifier> resolved, Set<String> visiting) {
            var texture = resolved.get(suffix);
            if (texture != null) return texture;
            if (!visiting.add(suffix))
                throw new IllegalArgumentException("Cyclic texture alias at suffix '%s' for variant '%s'".formatted(suffix, variantName));
            if (aliases.containsKey(suffix)) {
                texture = resolveTexture(aliases.get(suffix), variantName, resolved, visiting);
                resolved.put(suffix, texture);
            } else {
                var base = suffix.isEmpty() ? Chisel.prefix("block/%s/%s".formatted(name, variantName))
                        : resolveTexture("", variantName, resolved, visiting);
                texture = suffix.isEmpty() ? base : base.withPath(base.getPath() + "-" + suffix);
            }
            visiting.remove(suffix);
            return texture;
        }
    }

    private static Function<Properties, ? extends Block> defaultBlockFactory(String variantName) {
        return variantName.contains("pillar") ? ChiselRotatedPillarBlock::new : ConnectedTextureBlock::new;
    }

    public VariantFamilyDefinition build() {
        validateDefinitions();
        validateTranslations();
        validateTextures();
        return new VariantFamilyDefinition(name, variants, torchVariants, translations, tag, textures);
    }

    private void validateTextures() {
        var names = new HashSet<String>();
        variants.stream().filter(variant -> !variant.isExistingBlock()).forEach(variant -> names.add(variant.name()));
        torchVariants.forEach(torch -> {
            names.add(torch.name());
            names.add(torch.wallName());
        });
        for (String variant : textures.keySet()) {
            if (!names.contains(variant))
                throw new IllegalStateException("Texture references unknown generated variant '%s' in family '%s'".formatted(variant, name));
        }
    }

    private void validateTranslations() {
        var names = new HashSet<String>();
        var weatheringNames = new HashSet<String>();

        variants.forEach(variant -> {
            names.add(variant.name());
            if (variant.weathering()) weatheringNames.add(variant.name());
        });
        torchVariants.forEach(variant -> names.add(variant.name()));

        translations.keySet().stream().filter(variant -> !names.contains(variant)).forEach(variant -> {
            throw new IllegalStateException("Translation references unknown variant '%s' in family '%s'".formatted(variant, name));
        });
        translations.forEach((variant, translation) -> {
            if (translation.waxed() && !weatheringNames.contains(variant)) {
                throw new IllegalStateException("Waxed translation references non-weathering variant '%s' in family '%s'".formatted(variant, name));
            }
        });
    }

    private void addTranslation(String variant, String blockName, String description, boolean waxed) {
        variant = requireName(variant, "translation variant");
        Objects.requireNonNull(blockName, "Translation block name cannot be null for family '" + name + "'");
        Objects.requireNonNull(description, "Translation description cannot be null for family '" + name + "'");
        if (translations.putIfAbsent(variant, new VariantTranslation(blockName, description, waxed)) != null) {
            throw new IllegalArgumentException("Duplicate translation for variant '%s' in family '%s'".formatted(variant, name));
        }
    }

    private void validateDefinitions() {
        if (variants.isEmpty() && torchVariants.isEmpty()) {
            throw new IllegalStateException("Family '%s' must contain at least one variant".formatted(name));
        }
        var names = new HashSet<String>();
        variants.forEach(variant -> {
            validateVariant(variant);
            addUniqueName(names, variant.name());
        });
        torchVariants.forEach(torch -> {
            Objects.requireNonNull(torch.standingFactory(), "Standing torch factory cannot be null in family '" + name + "'");
            Objects.requireNonNull(torch.standingProperties(), "Standing torch properties cannot be null in family '" + name + "'");
            Objects.requireNonNull(torch.wallFactory(), "Wall torch factory cannot be null in family '" + name + "'");
            addUniqueName(names, torch.name());
            addUniqueName(names, torch.wallName());
        });
    }

    private void validateVariant(VariantDefinition variant) {
        requireName(variant.name(), "variant");
        Objects.requireNonNull(variant.modelType(), "Model handler cannot be null for variant '" + variant.name() + "' in family '" + name + "'");
        if (variant.isExistingBlock()) {
            if (variant.blockFactory() != null || variant.properties() != null || variant.weathering() || variant.generateModel()) {
                throw new IllegalStateException("Existing-block variant '%s' has incompatible registration data in family '%s'".formatted(variant.name(), name));
            }
            return;
        }
        Objects.requireNonNull(variant.properties(), "Block properties cannot be null for variant '" + variant.name() + "' in family '" + name + "'");
        if (!variant.weathering())
            Objects.requireNonNull(variant.blockFactory(), "Block factory cannot be null for variant '" + variant.name() + "' in family '" + name + "'");
    }

    private void addUniqueName(HashSet<String> names, String variantName) {
        variantName = requireName(variantName, "variant");
        if (!names.add(variantName))
            throw new IllegalArgumentException("Duplicate variant name '%s' in family '%s'".formatted(variantName, name));
    }
}
