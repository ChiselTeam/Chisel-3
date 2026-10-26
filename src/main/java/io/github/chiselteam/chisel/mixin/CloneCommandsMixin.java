package io.github.chiselteam.chisel.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import io.github.chiselteam.chisel.projectile.MossHelper;
import io.github.chiselteam.chisel.registry.ChiselAttachments;
import net.minecraft.core.BlockPos;
import net.minecraft.server.commands.CloneCommands;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.HashMap;
import java.util.Map;

@Mixin(CloneCommands.class)
abstract class CloneCommandsMixin {
    @WrapOperation(method = "clone", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z", ordinal = 0))
    private static boolean chisel$captureMovedMoss(ServerLevel level, BlockPos pos, BlockState state, int flags, Operation<Boolean> original, @Local(ordinal = 4) BlockPos offset, @Share("movedMoss") LocalRef<Map<BlockPos, Integer>> movedMoss) {
        if (level.hasData(ChiselAttachments.MOSS)) {
            int texture = level.getData(ChiselAttachments.MOSS).texture(pos);
            if (texture != 0) {
                if (movedMoss.get() == null) movedMoss.set(new HashMap<>());
                movedMoss.get().put(pos.offset(offset), texture);
            }
        }
        return original.call(level, pos, state, flags);
    }

    @WrapOperation(method = "clone", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z", ordinal = 3))
    private static boolean chisel$restoreMovedMoss(ServerLevel level, BlockPos pos, BlockState state, int flags, Operation<Boolean> original, @Share("movedMoss") LocalRef<Map<BlockPos, Integer>> movedMoss) {
        boolean placed = original.call(level, pos, state, flags);
        if (placed && movedMoss.get() != null) {
            Integer texture = movedMoss.get().remove(pos);
            if (texture != null) MossHelper.add(level, pos, texture);
        }
        return placed;
    }
}
