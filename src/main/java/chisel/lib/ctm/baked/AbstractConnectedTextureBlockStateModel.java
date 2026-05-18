package chisel.lib.ctm.baked;

import chisel.core.variant.Variant;
import chisel.lib.ctm.ConnectedTextureBlockModelPart;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.DynamicBlockStateModel;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractConnectedTextureBlockStateModel<K> implements DynamicBlockStateModel {

    protected final Set<Direction> connectedFaces;
    protected final Set<Direction> unculledFaces;
    protected final boolean renderOverlayOnAllFaces;
    protected final Map<Direction, BakedQuad[]> baseQuads;
    protected final TextureAtlasSprite particle;
    protected final Variant variant;
    protected final Material.Baked particleMaterial;

    private final Map<K, ConnectedTextureBlockModelPart> parts = new ConcurrentHashMap<>();

    protected AbstractConnectedTextureBlockStateModel(Set<Direction> connectedFaces, Set<Direction> unculledFaces, boolean renderOverlayOnAllFaces, Map<Direction, BakedQuad[]> baseQuads, TextureAtlasSprite particle, Variant variant) {
        this.connectedFaces = connectedFaces;
        this.unculledFaces = unculledFaces;
        this.renderOverlayOnAllFaces = renderOverlayOnAllFaces;
        this.baseQuads = baseQuads;
        this.particle = particle;
        this.variant = variant;
        this.particleMaterial = new Material.Baked(particle, false);
    }

    @Override
    public @NonNull Object createGeometryKey(@NonNull BlockAndTintGetter level, @NonNull BlockPos pos, @NonNull BlockState state, @NonNull RandomSource random) {
        return computeCTMKey(level, pos, random);
    }

    @Override
    public void collectParts(@NonNull BlockAndTintGetter level, @NonNull BlockPos pos, @NonNull BlockState state, @NonNull RandomSource random, @NonNull List<BlockStateModelPart> parts) {
        K key = computeCTMKey(level, pos, random);
        parts.add(this.parts.computeIfAbsent(key, this::createPart));
    }

    protected abstract K computeCTMKey(BlockAndTintGetter level, BlockPos pos, RandomSource random);

    protected abstract ConnectedTextureBlockModelPart createPart(K key);

    protected boolean shouldConnectSide(BlockAndTintGetter level, BlockPos pos, Direction side) {
        return level.getBlockState(pos.relative(side)).is(variant.getBlock());
    }

    protected boolean isCornerBlockPresent(BlockAndTintGetter level, BlockPos pos, Direction side1, Direction side2) {
        return level.getBlockState(pos.relative(side1).relative(side2)).is(variant.getBlock());
    }

    @Override
    public Material.@NonNull Baked particleMaterial() {
        return particleMaterial;
    }

    @Override
    public int materialFlags() {
        return 0; // Will be computed in parts
    }
}
