package io.github.chiselteam.chisel.core.building;

import com.mojang.serialization.Codec;
import io.github.chiselteam.chisel.registry.ChiselBuildingModes;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ChiselBuildingMode {

    protected List<BlockPos> positions;

    public static final Codec<ChiselBuildingMode> CODEC = Identifier.CODEC.xmap(
            id -> ChiselBuildingModes.REGISTRY.getOptional(id).orElseGet(() -> new ChiselBuildingMode(id)),
            ChiselBuildingMode::getRegistryName
    );

    public static final StreamCodec<ByteBuf, ChiselBuildingMode> STREAM_CODEC = Identifier.STREAM_CODEC.map(
            id -> ChiselBuildingModes.REGISTRY.getOptional(id).orElseGet(() -> new ChiselBuildingMode(id)),
            ChiselBuildingMode::getRegistryName
    );

    private final Identifier registryName;

    public ChiselBuildingMode(Identifier registryName) {
        this.registryName = registryName;
        positions = new ArrayList<>();
    }

    public Component getDescription() {
        return Component.translatable("chisel.building_mode." + registryName.toString());
    }

    /**
     * Returns the ghost-block positions for this mode, centred around {@code origin} (which is
     * normally the {@code BuildersGuide} block position). Subclasses implement {@link #generate}
     * using a local box {@code [0, width) x [0, height) x [0, length)}; this method translates
     * that box so it is centred on {@code origin} before delegating.
     */
    public final List<BlockPos> getGhostBlocks(BlockPos origin, int length, int width, int height) {
        // Local +x -> world +X, local +y -> world +Y, local +z -> world -Z (see BuildingShapes).
        // To centre the local box on origin, shift the origin passed to generate by the negative
        // half-extents in each corresponding world axis.
        BlockPos centered = new BlockPos(
                origin.getX() - (width  - 1) / 2,
                origin.getY() - (height - 1) / 2,
                origin.getZ() + (length - 1) / 2
        );
        return generate(centered, length, width, height);
    }

    /**
     * Produces the ghost-block positions for this mode, treating {@code origin} as the corner
     * of a local {@code [0, width) x [0, height) x [0, length)} bounding box (via
     * {@link io.github.chiselteam.chisel.util.BuildingShapes#local}). Centering is handled by
     * {@link #getGhostBlocks}; implementations must not apply their own centering.
     */
    protected List<BlockPos> generate(BlockPos origin, int length, int width, int height) {
        return Collections.singletonList(origin);
    }

    protected void addBlock(int x, int y, int z) {
        addBlock(new BlockPos(x, y, z));
    }

    protected void addBlock(BlockPos pos) {
        positions.add(pos);
    }

    public Identifier getRegistryName() {
        return registryName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        ChiselBuildingMode that = (ChiselBuildingMode) obj;
        return registryName.equals(that.registryName);
    }

    @Override
    public String toString() {
        return registryName.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryName);
    }
}
