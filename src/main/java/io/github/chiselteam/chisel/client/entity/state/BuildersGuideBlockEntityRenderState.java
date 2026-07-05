package io.github.chiselteam.chisel.client.entity.state;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;

import java.util.Collections;
import java.util.List;

public class BuildersGuideBlockEntityRenderState extends BlockEntityRenderState {

    /**
     * Positions (in world coordinates) at which a ghost block should be drawn for the current
     * building mode and dimensions. Populated each frame by the renderer.
     */
    public List<BlockPos> ghostBlocks = Collections.emptyList();

    /** World-space position of the {@code BuildersGuide} block itself. */
    public BlockPos origin = BlockPos.ZERO;

    /** Ghost block color. */
    public DyeColor color = DyeColor.WHITE;
}
