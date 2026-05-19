package chisel.lib.ctm.baked;

import chisel.lib.ctm.util.EldritchQuadTransformer;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.DynamicBlockStateModel;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A {@link DynamicBlockStateModel} decorator that wraps another {@link BlockStateModel}
 * and applies the {@link EldritchQuadTransformer} to every quad it produces.
 *
 * <p>Because the eldritch effect depends on the world block position, each unique
 * {@link BlockPos} produces a distinct set of transformed parts. We keep a bounded
 * LRU cache of recently-seen positions so that repeated chunk re-renders are cheap.
 */
public class EldritchBlockStateModel implements DynamicBlockStateModel {

    /** Hard upper bound on the position cache; oldest entries are evicted on overflow. */
    private static final int MAX_CACHE_ENTRIES = 4096;

    private final BlockStateModel delegate;

    /** Position -> transformed parts. Bounded LRU; access-order so {@code get} renews freshness. */
    private final Map<Long, List<BlockStateModelPart>> cache = Collections.synchronizedMap(
            new LinkedHashMap<>(64, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<Long, List<BlockStateModelPart>> eldest) {
                    return size() > MAX_CACHE_ENTRIES;
                }
            }
    );

    public EldritchBlockStateModel(BlockStateModel delegate) {
        this.delegate = delegate;
    }

    @Override
    public @NonNull Object createGeometryKey(@NonNull BlockAndTintGetter level, @NonNull BlockPos pos, @NonNull BlockState state, @NonNull RandomSource random) {
        // The geometry varies per-position (UVs depend on the position seed), so use the
        // packed long position as the key. We also fold in the delegate's geometry key
        // (if any) so that stacking with e.g. a CTM model still differentiates connectivity.
        Object delegateKey = computeDelegateGeometryKey(level, pos, state, random);
        return new EldritchGeometryKey(pos.asLong(), delegateKey);
    }

    private Object computeDelegateGeometryKey(BlockAndTintGetter level, BlockPos pos, BlockState state, RandomSource random) {
        if (delegate instanceof DynamicBlockStateModel dyn) {
            return dyn.createGeometryKey(level, pos, state, random);
        }
        return delegate; // a static model -- its geometry never changes apart from the random
    }

    @Override
    public void collectParts(@NonNull BlockAndTintGetter level, @NonNull BlockPos pos, @NonNull BlockState state, @NonNull RandomSource random, @NonNull List<BlockStateModelPart> parts) {
        List<BlockStateModelPart> cached = cache.get(pos.asLong());
        if (cached != null) {
            parts.addAll(cached);
            return;
        }

        // Collect the delegate's parts using the position-aware path when available.
        List<BlockStateModelPart> delegateParts = new ArrayList<>();
        if (delegate instanceof DynamicBlockStateModel dyn) {
            dyn.collectParts(level, pos, state, random, delegateParts);
        } else {
            delegate.collectParts(random, delegateParts);
        }

        List<BlockStateModelPart> transformed = new ArrayList<>(delegateParts.size());
        for (BlockStateModelPart part : delegateParts) {
            transformed.add(transformPart(part, pos));
        }

        List<BlockStateModelPart> immutable = List.copyOf(transformed);
        cache.put(pos.asLong(), immutable);
        parts.addAll(immutable);
    }

    @Override
    public void collectParts(@NonNull RandomSource random, @NonNull List<BlockStateModelPart> parts) {
        // Fallback (item / no-position contexts): transform around BlockPos.ZERO.
        List<BlockStateModelPart> delegateParts = new ArrayList<>();
        delegate.collectParts(random, delegateParts);
        for (BlockStateModelPart part : delegateParts) {
            parts.add(transformPart(part, BlockPos.ZERO));
        }
    }

    @Override
    public Material.@NonNull Baked particleMaterial() {
        return delegate.particleMaterial();
    }

    @Override
    public int materialFlags() {
        return delegate.materialFlags();
    }

    private static BlockStateModelPart transformPart(BlockStateModelPart part, BlockPos pos) {
        Map<Direction, List<BakedQuad>> newSided = new EnumMap<>(Direction.class);
        for (Direction face : Direction.values()) {
            List<BakedQuad> faceQuads = part.getQuads(face);
            if (faceQuads != null && !faceQuads.isEmpty()) {
                newSided.put(face, List.copyOf(EldritchQuadTransformer.transform(faceQuads, pos)));
            } else {
                newSided.put(face, List.of());
            }
        }
        List<BakedQuad> unculled = part.getQuads(null);
        List<BakedQuad> newUnculled = (unculled == null || unculled.isEmpty())
                ? List.of()
                : List.copyOf(EldritchQuadTransformer.transform(unculled, pos));
        return new TransformedPart(newSided, newUnculled, part);
    }

    /** Snapshot view of a {@link BlockStateModelPart} with new quads but inherited material flags / particle. */
    private record TransformedPart(
            Map<Direction, List<BakedQuad>> sidedQuads,
            List<BakedQuad> unculledQuads,
            BlockStateModelPart source
    ) implements BlockStateModelPart {

        @Override
        public @NonNull List<BakedQuad> getQuads(@Nullable Direction side) {
            return side == null ? unculledQuads : sidedQuads.get(side);
        }

        @Override
        public int materialFlags() {
            return source.materialFlags();
        }

        @Override
        public Material.@NonNull Baked particleMaterial() {
            return source.particleMaterial();
        }

        @Override
        public boolean useAmbientOcclusion() {
            return source.useAmbientOcclusion();
        }
    }

    /** Compound key combining block position and the delegate's own geometry key. */
    private record EldritchGeometryKey(long pos, Object delegateKey) {}
}
