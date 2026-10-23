package io.github.chiselteam.chisel.datagen.guide;

import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.section.*;
import io.github.chiselteam.chisel.guide.section.palette.PaletteEntry;
import io.github.chiselteam.chisel.guide.section.palette.PaletteRole;
import io.github.chiselteam.chisel.palette.PaletteDefinition;
import io.github.chiselteam.chisel.palette.WeightedBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.BlockState;

import java.util.*;
import java.util.function.Consumer;

public final class HandbookGuideBuilder {
    public static HandbookGuideBuilder builder(Component title, Identifier icon) {
        return new HandbookGuideBuilder(title, icon);
    }

    private final Component title;
    private final Identifier icon;
    private Component description = Component.empty();
    private final LinkedHashSet<Identifier> categories = new LinkedHashSet<>();
    private final List<HandbookGuideSection> sections = new ArrayList<>();
    private int sortOrder;

    public HandbookGuideBuilder(Component title, Identifier icon) {
        this.title = Objects.requireNonNull(title, "Guide title cannot be null");
        this.icon = Objects.requireNonNull(icon, "Guide icon cannot be null");
        if (title.getString().isBlank()) throw new IllegalArgumentException("Guide title must not be empty");
    }

    public HandbookGuideBuilder description(Component description) {
        this.description = Objects.requireNonNull(description, "Guide description cannot be null");
        return this;
    }

    public HandbookGuideBuilder category(Identifier category) {
        categories.add(Objects.requireNonNull(category, "Guide category cannot be null"));
        return this;
    }

    public HandbookGuideBuilder sortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public HandbookGuideBuilder section(HandbookGuideSection section) {
        Objects.requireNonNull(section, "Guide section cannot be null");
        sections.add(switch (section) {
            case PaletteSection palette -> new PaletteSection(palette.title(), List.copyOf(palette.entries()));
            default -> section;
        });
        return this;
    }

    public HandbookGuideBuilder text(Component text) {
        return section(new TextSection(Objects.requireNonNull(text, "Text cannot be null")));
    }

    public HandbookGuideBuilder tip(Component text) {
        return section(new TipSection(Objects.requireNonNull(text, "Tip cannot be null")));
    }

    public HandbookGuideBuilder craftingRecipe(Identifier recipe) {
        return section(new CraftingRecipeSection(Objects.requireNonNull(recipe, "Recipe cannot be null")));
    }

    public HandbookGuideBuilder image(Identifier texture, int width, int height) {
        return section(new ImageSection(Objects.requireNonNull(texture, "Texture cannot be null"), width, height));
    }

    public HandbookGuideBuilder palette(Component title, Consumer<PaletteBuilder> configure) {
        var builder = new PaletteBuilder();
        Objects.requireNonNull(configure, "Palette callback cannot be null").accept(builder);
        return section(new PaletteSection(Objects.requireNonNull(title, "Palette title cannot be null"), builder.entries));
    }

    public HandbookGuideBuilder structure(Consumer<StructureBuilder> configure) {
        var builder = new StructureBuilder();
        Objects.requireNonNull(configure, "Structure callback cannot be null").accept(builder);
        return section(new StructureSection(builder.blocks));
    }

    public HandbookGuideBuilder variantWall(ChiselFamily family) {
        var variants = Objects.requireNonNull(family, "Wall family cannot be null").getFamily().getVariants();
        if (variants.isEmpty()) throw new IllegalArgumentException("Variant wall must contain at least one block");
        int columns = (int) Math.ceil(Math.sqrt(variants.size()));
        int rows = Math.ceilDiv(variants.size(), columns);
        return structure(wall -> {
            for (int index = 0; index < variants.size(); index++) {
                wall.block(index % columns - columns / 2, rows - 1 - index / columns, 0,
                        variants.get(index).getBlock().defaultBlockState());
            }
        });
    }

    /**
     * A stable 100-block wall; default palettes totaling 100 show their exact proportions.
     */
    public HandbookGuideBuilder paletteWall(PaletteDefinition palette) {
        Objects.requireNonNull(palette, "Wall palette cannot be null");
        var entries = palette.entries().stream().filter(WeightedBlock::enabled).toList();
        int totalWeight = entries.stream().mapToInt(WeightedBlock::weight).sum();
        if (totalWeight <= 0) throw new IllegalArgumentException("Palette wall needs enabled entries with positive weights");
        var states = entries.stream().map(entry -> BuiltInRegistries.BLOCK.getOptional(entry.block())
                .orElseThrow(() -> new IllegalArgumentException("Unknown palette wall block: " + entry.block()))
                .defaultBlockState()).toList();
        var blocks = new ArrayList<BlockState>(100);
        // Evenly spaced samples preserve small accents instead of losing them to random sampling.
        for (int cell = 0; cell < 100; cell++) {
            int choice = (2 * cell + 1) * totalWeight / 200;
            for (int index = 0; index < entries.size(); index++) {
                choice -= entries.get(index).weight();
                if (choice < 0) {
                    blocks.add(states.get(index));
                    break;
                }
            }
        }
        Collections.shuffle(blocks, new Random(palette.name().hashCode()));
        return structure(wall -> {
            for (int index = 0; index < blocks.size(); index++) {
                wall.block(index % 10 - 5, 9 - index / 10, 0, blocks.get(index));
            }
        });
    }

    public HandbookGuideBuilder structure(Identifier template) {
        return section(new StructureSection(Objects.requireNonNull(template, "Structure template cannot be null")));
    }

    public HandbookGuide build() {
        if (sections.isEmpty()) throw new IllegalStateException("Guide must contain at least one section");
        sections.forEach(HandbookGuideBuilder::validateSection);
        return new HandbookGuide(title, description, icon, List.copyOf(categories), List.copyOf(sections), sortOrder);
    }

    private static void validateSection(HandbookGuideSection section) {
        switch (section) {
            case CraftingRecipeSection recipe -> Objects.requireNonNull(recipe.recipe(), "Recipe cannot be null");
            case TextSection text -> Objects.requireNonNull(text.text(), "Text cannot be null");
            case TipSection tip -> Objects.requireNonNull(tip.text(), "Tip cannot be null");
            case ImageSection image -> {
                Objects.requireNonNull(image.texture(), "Texture cannot be null");
                if (!image.texture().getPath().startsWith("textures/") || !image.texture().getPath().endsWith(".png"))
                    throw new IllegalArgumentException("Image texture must reference a textures/...png resource");
                if (image.width() < 1 || image.width() > 4096 || image.height() < 1 || image.height() > 4096)
                    throw new IllegalArgumentException("Image dimensions must be from 1-4096");
            }
            case PaletteSection palette -> {
                Objects.requireNonNull(palette.title(), "Palette title cannot be null");
                if (palette.title().getString().isBlank()) throw new IllegalArgumentException("Palette title must not be empty");
                if (palette.entries().isEmpty()) throw new IllegalArgumentException("Palette must contain at least one entry");
                for (var entry : palette.entries()) {
                    Objects.requireNonNull(entry.block(), "Palette block cannot be null");
                    Objects.requireNonNull(entry.role(), "Palette role cannot be null");
                    if (entry.weight() < 1 || entry.weight() > 100)
                        throw new IllegalArgumentException("Palette weight must be from 1-100");
                }
            }
            case StructureSection structure -> {
                if ((structure.template().isEmpty() && structure.blocks().isEmpty()) || structure.blocks().size() > StructureSection.MAX_BLOCKS)
                    throw new IllegalArgumentException("Structure must contain from 1-" + StructureSection.MAX_BLOCKS + " blocks");
                var positions = new HashSet<>();
                for (var cell : structure.blocks()) {
                    Objects.requireNonNull(cell.state(), "Structure block state cannot be null");
                    if (cell.x() < -64 || cell.x() > 64 || cell.y() < -64 || cell.y() > 64 || cell.z() < -64 || cell.z() > 64)
                        throw new IllegalArgumentException("Structure coordinates must be from -64 to 64");
                    if (!positions.add(cell.pos())) throw new IllegalArgumentException("Duplicate structure position: " + cell.pos());
                }
            }
        }
    }

    public static final class PaletteBuilder {
        private final List<PaletteEntry> entries = new ArrayList<>();

        private PaletteBuilder() {
        }

        public PaletteBuilder entry(Identifier block, PaletteRole role, int weight) {
            entries.add(new PaletteEntry(Objects.requireNonNull(block, "Palette block cannot be null"),
                    Objects.requireNonNull(role, "Palette role cannot be null"), weight));
            return this;
        }
    }

    public static final class StructureBuilder {
        private final List<StructureSection.Cell> blocks = new ArrayList<>();

        private StructureBuilder() {
        }

        public StructureBuilder block(int x, int y, int z, BlockState state) {
            blocks.add(new StructureSection.Cell(x, y, z, Objects.requireNonNull(state, "Structure block state cannot be null")));
            return this;
        }
    }
}
