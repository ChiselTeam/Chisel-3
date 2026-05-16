package chisel.world.data;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.Map;

public class OffsetSavedData extends SavedData {

    private final Map<ChunkPos, BlockPos> chunkOffsets = new HashMap<>();

    public OffsetSavedData() {
    }

    public static OffsetSavedData load(ValueInput input, HolderLookup.Provider lookupProvider) {
        OffsetSavedData data = new OffsetSavedData();
        int size = input.getIntOr("size", 0);
        for (int i = 0; i < size; i++) {
            int cx = input.getIntOr("cx" + i, 0);
            int cz = input.getIntOr("cz" + i, 0);
            short offsetData = (short) input.getIntOr("offset" + i, 0);
            BlockPos offset = new BlockPos((offsetData >> 8) & 0xF, (offsetData >> 4) & 0xF, offsetData & 0xF);
            data.chunkOffsets.put(new ChunkPos(cx, cz), offset);
        }
        return data;
    }

    @Override
    public void saveAdditional(@NonNull ValueOutput output, HolderLookup.@NonNull Provider lookupProvider) {
        output.putInt("size", chunkOffsets.size());
        int i = 0;
        for (Map.Entry<ChunkPos, BlockPos> entry : chunkOffsets.entrySet()) {
            output.putInt("cx" + i, entry.getKey().x());
            output.putInt("cz" + i, entry.getKey().z());
            BlockPos offset = entry.getValue();
            output.putInt("offset" + i, (short) ((offset.getX() & 0xF) << 8 | (offset.getY() & 0xF) << 4 | (offset.getZ() & 0xF)));
            i++;
        }
    }

    public BlockPos getOffset(ChunkPos pos) {
        return chunkOffsets.getOrDefault(pos, BlockPos.ZERO);
    }

    public void setOffset(ChunkPos pos, BlockPos offset) {
        chunkOffsets.put(pos, offset);
        setDirty();
    }

    public static OffsetSavedData get(ServerLevel level) {
        return level.getDataStorage().computeIfAbsent(new SavedData.Factory<>(OffsetSavedData::new, OffsetSavedData::load), "chisel_offsets");
    }

    public Map<ChunkPos, BlockPos> getChunkOffsets() {
        return chunkOffsets;
    }
}
