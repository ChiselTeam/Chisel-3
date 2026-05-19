package chisel.lib.ctm;

import net.minecraft.core.BlockPos;

/// Strategy used by multiblock CTM models to translate a world position into the
/// "logical" position used to compute the multiblock tile index.
///
/// The library default is [#NONE] (identity). Consumers (e.g. the Chisel
/// mod's offset tool) may install a different provider via [#set(MultiblockOffsetProvider)]
/// to apply a per-chunk offset.
public interface MultiblockOffsetProvider {

    MultiblockOffsetProvider NONE = pos -> pos;

    BlockPos offsetFor(BlockPos pos);

    static MultiblockOffsetProvider get() {
        return Holder.INSTANCE;
    }

    static void set(MultiblockOffsetProvider provider) {
        Holder.INSTANCE = provider == null ? NONE : provider;
    }

    final class Holder {
        private Holder() {}
        private static MultiblockOffsetProvider INSTANCE = NONE;
    }
}
