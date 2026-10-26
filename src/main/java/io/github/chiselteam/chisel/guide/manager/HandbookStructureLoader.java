package io.github.chiselteam.chisel.guide.manager;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.section.StructureSection;
import net.minecraft.commands.arguments.blocks.BlockStateParser;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.NbtAccounter;
import net.minecraft.nbt.NbtIo;
import net.minecraft.resources.FileToIdConverter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public final class HandbookStructureLoader {
    private final ResourceManager resources;
    private final Map<ResourceLocation, List<StructureSection.Cell>> cache = new HashMap<>();

    public HandbookStructureLoader(ResourceManager resources) {
        this.resources = resources;
    }

    public HandbookGuide resolve(HandbookGuide guide) {
        var sections = guide.sections().stream().map(section -> {
            if (section instanceof StructureSection structure && structure.template().isPresent()) {
                var id = structure.template().get();
                return new StructureSection(Optional.of(id), cache.computeIfAbsent(id, this::load));
            }
            return section;
        }).toList();
        return new HandbookGuide(guide.title(), guide.description(), guide.icon(), guide.categories(), sections, guide.sortOrder());
    }

    private List<StructureSection.Cell> load(ResourceLocation id) {
        var resource = resources.getResource(FileToIdConverter.json("structure").idToFile(id).withPath(path -> path.substring(0, path.length() - 5) + ".nbt"))
                .orElseThrow(() -> new IllegalArgumentException("Missing structure template: " + id));
        var template = new StructureTemplate();
        try (var stream = resource.open()) {
            template.load(BuiltInRegistries.BLOCK.asLookup(), NbtIo.readCompressed(stream, NbtAccounter.unlimitedHeap()));
        } catch (java.io.IOException error) {
            throw new IllegalArgumentException("Invalid structure template: " + id, error);
        }
        return blocks(template);
    }

    static List<StructureSection.Cell> blocks(StructureTemplate template) {
        var result = new ArrayList<StructureSection.Cell>();

        var settings = new StructurePlaceSettings() {
            @Override
            public StructureTemplate.@NotNull Palette getRandomPalette(List<StructureTemplate.Palette> palettes, BlockPos pos) {
                return palettes.getFirst();
            }
        };
        for (var block : BuiltInRegistries.BLOCK) {
            if (block.defaultBlockState().isAir() || block == Blocks.STRUCTURE_VOID || block == Blocks.STRUCTURE_BLOCK) continue;
            for (var info : template.filterBlocks(BlockPos.ZERO, settings, block)) {
                var state = info.state();
                if (state.is(Blocks.JIGSAW) && info.nbt() != null) {
                    var finalState = (info.nbt().contains("final_state") ? info.nbt().getString("final_state") : "minecraft:air");
                    try {
                        // Match vanilla's JigsawReplacementProcessor without placing blocks in a level.
                        state = BlockStateParser.parseForBlock(BuiltInRegistries.BLOCK.asLookup(), finalState, true).blockState();
                    } catch (CommandSyntaxException error) {
                        HandbookValidator.LOGGER.warn("Skipping invalid jigsaw final state '{}' at {}: {}", finalState, info.pos(), error.getMessage());
                        continue;
                    }
                }
                if (state.isAir() || state.is(Blocks.STRUCTURE_VOID) || state.is(Blocks.STRUCTURE_BLOCK)) continue;
                var pos = info.pos();
                if (pos.getX() < -64 || pos.getX() > 64 || pos.getY() < -64 || pos.getY() > 64 || pos.getZ() < -64 || pos.getZ() > 64)
                    throw new IllegalArgumentException("Handbook structure coordinates must be from -64 to 64");
                result.add(new StructureSection.Cell(pos.getX(), pos.getY(), pos.getZ(), state));
                if (result.size() > StructureSection.MAX_BLOCKS)
                    throw new IllegalArgumentException("Handbook structures support at most " + StructureSection.MAX_BLOCKS + " visible blocks");
            }
        }
        if (result.isEmpty()) throw new IllegalArgumentException("Handbook structure has no visible blocks");
        return List.copyOf(result);
    }
}
