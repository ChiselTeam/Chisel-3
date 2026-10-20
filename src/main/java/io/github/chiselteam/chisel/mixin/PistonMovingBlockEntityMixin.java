package io.github.chiselteam.chisel.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.github.chiselteam.chisel.projectile.MossHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.piston.PistonMovingBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PistonMovingBlockEntity.class)
abstract class PistonMovingBlockEntityMixin {
    @WrapOperation(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z"))
    private static boolean chisel$restoreMossAfterTick(Level level, BlockPos pos, BlockState blockState, int updateFlags, Operation<Boolean> original, Level tickLevel, BlockPos tickPos, BlockState tickState, PistonMovingBlockEntity moving) {
        boolean placed = original.call(level, pos, blockState, updateFlags);
        if (placed) MossHelper.restoreMovingMoss(level, pos, moving);
        return placed;
    }

    @WrapOperation(method = "finalTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z"))
    private boolean chisel$restoreMossAfterFinalTick(Level level, BlockPos pos, BlockState state, int flags, Operation<Boolean> original) {
        boolean placed = original.call(level, pos, state, flags);
        if (placed) MossHelper.restoreMovingMoss(level, pos, (PistonMovingBlockEntity) (Object) this);
        return placed;
    }
}
