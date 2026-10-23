package io.github.chiselteam.chisel.guide.section;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.Optional;

public record StructureSection(Optional<Identifier> template, List<Cell> blocks) implements HandbookGuideSection {
    /**
     * A full structure block selection (48 blocks on each axis).
     */
    public static final int MAX_BLOCKS = 48 * 48 * 48;

    public StructureSection {
        blocks = List.copyOf(blocks);
    }

    public StructureSection(List<Cell> blocks) {
        this(Optional.empty(), blocks);
    }

    public StructureSection(Identifier template) {
        this(Optional.of(template), List.of());
    }

    // Resolved blocks travel with the template reference to clients, which cannot read server datapacks.
    public static final MapCodec<StructureSection> CODEC = RecordCodecBuilder.mapCodec(i -> i.group(
            Identifier.CODEC.optionalFieldOf("template").forGetter(StructureSection::template),
            Cell.CODEC.listOf(0, MAX_BLOCKS).optionalFieldOf("blocks", List.of()).forGetter(StructureSection::blocks)
    ).apply(i, StructureSection::new));

    public Identifier type() {
        return Chisel.prefix("structure");
    }

    public record Cell(int x, int y, int z, BlockState state) {
        public static final Codec<Cell> CODEC = RecordCodecBuilder.create(i -> i.group(
                Codec.intRange(-64, 64).fieldOf("x").forGetter(Cell::x),
                Codec.intRange(-64, 64).fieldOf("y").forGetter(Cell::y),
                Codec.intRange(-64, 64).fieldOf("z").forGetter(Cell::z),
                BlockState.CODEC.fieldOf("state").forGetter(Cell::state)
        ).apply(i, Cell::new));

        public BlockPos pos() {
            return new BlockPos(x, y, z);
        }
    }
}
