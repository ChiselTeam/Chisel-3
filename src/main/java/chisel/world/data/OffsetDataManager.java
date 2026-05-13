package chisel.world.data;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;

import java.util.HashMap;
import java.util.Map;

public class OffsetDataManager {

    private static final Map<ChunkPos, BlockPos> chunkOffsets = new HashMap<>();

    public static BlockPos getOffset(ChunkPos pos) {
        return chunkOffsets.getOrDefault(pos, BlockPos.ZERO);
    }

    public static void setOffset(ChunkPos pos, BlockPos offset) {
        chunkOffsets.put(pos, offset);
    }
}
