package io.github.chiselteam.chisel.block.entity;

import io.github.chiselteam.chisel.mode.building.ChiselBuildingMode;
import io.github.chiselteam.chisel.registry.ChiselBlockEntities;
import io.github.chiselteam.chisel.registry.ChiselBuildingModes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BuildersGuideBlockEntity extends BlockEntity {

    private static final int MIN_DIM = 1;
    private static final int MAX_DIM = 64;
    private int length = 8;
    private int width  = 8;
    private int height = 8;

    private List<BlockPos> positions = List.of();
    private ChiselBuildingMode cachedMode;
    private BlockPos cachedOrigin;
    private int cachedLength;
    private int cachedWidth;
    private int cachedHeight;

    private DyeColor color = DyeColor.WHITE;

    @NotNull
    private ChiselBuildingMode buildingMode = defaultMode();

    public BuildersGuideBlockEntity(BlockPos pos, BlockState state) {
        super(ChiselBlockEntities.BUILDERS_GUIDE.get(), pos, state);
    }

    @Override
    protected void loadAdditional(@NotNull CompoundTag input, HolderLookup.Provider registries) {
        super.loadAdditional(input, registries);
        length = clamp((input.contains("length") ? input.getInt("length") : 8));
        width  = clamp((input.contains("width") ? input.getInt("width") : 8));
        height = clamp((input.contains("height") ? input.getInt("height") : 8));

        var modeId = input.getString("mode");
        if (!modeId.isEmpty()) {
            var id = ResourceLocation.tryParse(modeId);
            if (id != null) {
                ChiselBuildingModes.REGISTRY.getOptional(id).ifPresent(m -> this.buildingMode = m);
            }
        }
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag output, HolderLookup.Provider registries) {
        super.saveAdditional(output, registries);
        output.putInt("length", length);
        output.putInt("width",  width);
        output.putInt("height", height);
        output.putString("mode", buildingMode.getRegistryName().toString());
    }

    public void increaseLength() { setLength(length + 1); }
    public void increaseWidth()  { setWidth (width  + 1); }
    public void increaseHeight() { setHeight(height + 1); }
    public void decreaseLength() { setLength(length - 1); }
    public void decreaseWidth()  { setWidth (width  - 1); }
    public void decreaseHeight() { setHeight(height - 1); }

    public int getLength() { return length; }
    public int getWidth()  { return width;  }
    public int getHeight() { return height; }

    public void setLength(int value) { this.length = clamp(value); markDirty(); }
    public void setWidth (int value) { this.width  = clamp(value); markDirty(); }
    public void setHeight(int value) { this.height = clamp(value); markDirty(); }

    public DyeColor getColor() { return color; }
    public void setColor(DyeColor value) { this.color = value; markDirty(); }

    public @NotNull ChiselBuildingMode getBuildingMode() {
        return buildingMode;
    }

    public void setBuildingMode(@NotNull ChiselBuildingMode mode) {
        this.buildingMode = mode;
        markDirty();
    }

    public void cycleBuildingMode() {
        List<ChiselBuildingMode> modes = ChiselBuildingModes.REGISTRY.stream().toList();
        if (modes.isEmpty()) return;
        int idx = modes.indexOf(buildingMode);
        int next = (idx < 0) ? 0 : (idx + 1) % modes.size();
        setBuildingMode(modes.get(next));
    }

    public List<BlockPos> getGhostBlocks() {
        var origin = getBlockPos();
        if (cachedMode != buildingMode || !origin.equals(cachedOrigin) || cachedLength != length || cachedWidth != width || cachedHeight != height) {
            positions = buildingMode.getGhostBlocks(origin, length, width, height);
            cachedMode = buildingMode;
            cachedOrigin = origin;
            cachedLength = length;
            cachedWidth = width;
            cachedHeight = height;
        }

        if (level == null) return positions;
        return positions.stream().filter(level::isEmptyBlock).toList();
    }

    public void placeBlock(Block block) {
        if (level == null || level.isClientSide) return;
        var remaining = getGhostBlocks();
        if (!remaining.isEmpty()) level.setBlockAndUpdate(remaining.getFirst(), block.defaultBlockState());
    }

    private static int clamp(int value) {
        return Math.clamp(value, MIN_DIM, MAX_DIM);
    }

    private void markDirty() {
        setChanged();
        if (level != null && !level.isClientSide)
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
    }

    private static @NotNull ChiselBuildingMode defaultMode() {
        return ChiselBuildingModes.REGISTRY.stream()
                .findFirst()
                .orElseGet(() -> new ChiselBuildingMode(ResourceLocation.fromNamespaceAndPath("chisel", "empty")));
    }
}
