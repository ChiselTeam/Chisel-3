package io.github.chiselteam.chisel.integration;

import dev.ftb.mods.ftbchunks.api.FTBChunksAPI;
import dev.ftb.mods.ftbchunks.api.FTBChunksProperties;
import dev.ftb.mods.ftbchunks.api.Protection;
import dev.ftb.mods.ftblibrary.math.ChunkDimPos;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;

final class FTBChunksAccess {
    private FTBChunksAccess() {
    }

    static boolean isUnclaimed(Level level, BlockPos pos) {
        var api = FTBChunksAPI.api();
        return api.isManagerLoaded() && api.getManager().getChunk(new ChunkDimPos(level, pos)) == null;
    }

    static boolean canEdit(ServerPlayer player, Level level, BlockPos pos, InteractionHand hand) {
        var api = FTBChunksAPI.api();
        if (!api.isManagerLoaded()) return false;
        if (player.level() == level)
            return !api.getManager().shouldPreventInteraction(player, hand, pos, Protection.EDIT_BLOCK, null);
        var manager = api.getManager();
        if (manager.getBypassProtection(player.getUUID())) return true;
        var chunk = manager.getChunk(new ChunkDimPos(level, pos));
        return chunk == null || chunk.getTeamData().canPlayerUse(player, FTBChunksProperties.BLOCK_EDIT_MODE);
    }

    static boolean canAccess(ServerPlayer player, Level sourceLevel, BlockPos pos) {
        return canAccess(player, sourceLevel, pos, FTBChunksAPI.api());
    }

    static boolean canAccess(ServerPlayer player, Level sourceLevel, BlockPos pos, FTBChunksAPI.API api) {
        if (!api.isManagerLoaded()) return false;
        var manager = api.getManager();
        if (manager.getBypassProtection(player.getUUID())) return true;

        var chunk = manager.getChunk(new ChunkDimPos(sourceLevel, pos));
        return chunk == null || chunk.getTeamData().canPlayerUse(player, FTBChunksProperties.BLOCK_INTERACT_MODE);
    }
}
