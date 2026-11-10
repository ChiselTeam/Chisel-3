package io.github.chiselteam.chisel.integration;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.neoforged.fml.ModList;

public final class InventoryAccess {
    // No compatible FTB Chunks API is available for this Minecraft version.
    // Fail closed if it is nevertheless installed rather than bypassing claims.
    private InventoryAccess() {
    }

    public static boolean canAccess(Player player, Level level, BlockPos pos) {
        if (!canAccessSingle(player, level, pos)) return false;
        var state = level.getBlockState(pos);
        // The item capability of a double chest includes both halves.
        if (state.getBlock() instanceof ChestBlock && state.getValue(ChestBlock.TYPE) != ChestType.SINGLE) {
            var other = pos.relative(ChestBlock.getConnectedDirection(state));
            return level.hasChunkAt(other) && canAccessSingle(player, level, other);
        }
        return true;
    }

    private static boolean canAccessSingle(Player player, Level level, BlockPos pos) {
        if (!level.mayInteract(player, pos)) return false;
        if (level.getBlockEntity(pos) instanceof BaseContainerBlockEntity container && !container.canOpen(player)) return false;
        return level.isClientSide() || !ModList.get().isLoaded("ftbchunks");
    }
}
