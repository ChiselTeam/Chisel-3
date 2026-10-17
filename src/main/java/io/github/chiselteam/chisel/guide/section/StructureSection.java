package io.github.chiselteam.chisel.guide.section;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public record StructureSection(List<Cell> blocks) implements HandbookGuideSection {
    public StructureSection {
        blocks = List.copyOf(blocks);
    }

    public static final MapCodec<StructureSection> CODEC = Cell.CODEC.listOf(1, 512).fieldOf("blocks").xmap(StructureSection::new, StructureSection::blocks);

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
