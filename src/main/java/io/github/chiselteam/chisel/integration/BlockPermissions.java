package io.github.chiselteam.chisel.integration;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.fml.ModList;
import org.jspecify.annotations.Nullable;

public final class BlockPermissions {
    // No compatible FTB Chunks API is available for this Minecraft version.
    // Fail closed if it is nevertheless installed rather than bypassing claims.
    private BlockPermissions() {
    }

    public static boolean canProjectileEdit(@Nullable Entity owner, Level level, BlockPos pos, ItemStack stack) {
        if (owner instanceof Player player) return canEdit(player, level, pos, InteractionHand.MAIN_HAND, stack);

        return !level.isClientSide() && level.hasChunkAt(pos)
                && !ModList.get().isLoaded("ftbchunks");
    }

    public static boolean canEdit(@Nullable Player player, Level level, BlockPos pos, InteractionHand hand, ItemStack stack) {
        if (player == null || player.isSpectator() || !player.getAbilities().mayBuild
                || !level.hasChunkAt(pos) || !level.mayInteract(player, pos)
                || !player.mayUseItemAt(pos, Direction.UP, stack)) return false;
        return level.isClientSide() || !ModList.get().isLoaded("ftbchunks");
    }
}
