package io.github.chiselteam.chisel.projectile;

import io.github.chiselteam.chisel.network.MossDeltaPacket;
import io.github.chiselteam.chisel.registry.ChiselAttachments;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.attachment.IAttachmentHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import org.jspecify.annotations.Nullable;

public final class MossHelper {
    private MossHelper() {
    }

    public static boolean canSupportMoss(BlockState state) {
        return state.getRenderShape() == RenderShape.MODEL && Block.isShapeFullBlock(state.getOcclusionShape());
    }

    public static void onBlockChanged(Level level, BlockPos pos, @Nullable BlockState previous, BlockState current) {
        if (!(level instanceof ServerLevel serverLevel) || previous == null
                || level.captureBlockSnapshots || level.restoringBlockSnapshots
                || !level.hasData(ChiselAttachments.MOSS)) return;

        var moss = level.getData(ChiselAttachments.MOSS);
        if (moss.removeIfReplaced(pos, previous, current)) syncRemoval(serverLevel, pos, moss);
    }

    public static boolean remove(ServerLevel level, BlockPos pos) {
        if (!level.hasData(ChiselAttachments.MOSS)) return false;
        var moss = level.getData(ChiselAttachments.MOSS);
        if (!moss.remove(pos)) return false;
        syncRemoval(level, pos, moss);
        return true;
    }

    public static void add(Level level, BlockPos pos, int texture) {
        if (!(level instanceof ServerLevel serverLevel) || texture == 0
                || !canSupportMoss(level.getBlockState(pos))) return;
        var moss = level.getData(ChiselAttachments.MOSS);
        if (!moss.add(pos, texture)) return;
        level.setData(ChiselAttachments.MOSS, moss);
        PacketDistributor.sendToPlayersTrackingChunk(serverLevel, new ChunkPos(pos.getX() >> 4, pos.getZ() >> 4), new MossDeltaPacket(pos, true, texture));
    }

    public static void captureMovingMoss(Level level, BlockPos source, IAttachmentHolder movingBlock) {
        if (!(level instanceof ServerLevel serverLevel) || !level.hasData(ChiselAttachments.MOSS)) return;
        int texture = level.getData(ChiselAttachments.MOSS).texture(source);
        if (texture == 0) return;
        movingBlock.setData(ChiselAttachments.MOVING_MOSS, texture);
        remove(serverLevel, source);
    }

    public static void restoreMovingMoss(Level level, BlockPos destination, IAttachmentHolder movingBlock) {
        if (!(level instanceof ServerLevel) || !movingBlock.hasData(ChiselAttachments.MOVING_MOSS)) return;
        int texture = movingBlock.getData(ChiselAttachments.MOVING_MOSS);
        movingBlock.removeData(ChiselAttachments.MOVING_MOSS);
        add(level, destination, texture);
    }

    private static void syncRemoval(ServerLevel level, BlockPos pos, MossData moss) {
        level.setData(ChiselAttachments.MOSS, moss);
        PacketDistributor.sendToPlayersTrackingChunk(level, new ChunkPos(pos.getX() >> 4, pos.getZ() >> 4), new MossDeltaPacket(pos, false, 0));
    }
}
