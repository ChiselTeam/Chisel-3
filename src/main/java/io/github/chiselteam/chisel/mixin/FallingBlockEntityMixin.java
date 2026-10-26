package io.github.chiselteam.chisel.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import io.github.chiselteam.chisel.projectile.MossHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FallingBlockEntity.class)
abstract class FallingBlockEntityMixin {
    @WrapOperation(method = "fall", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;setBlockAndUpdate(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z"))
    private static boolean chisel$carryMoss(Level level, BlockPos pos, BlockState blockState, Operation<Boolean> original, @Local(name = "entity") FallingBlockEntity entity) {
        MossHelper.captureMovingMoss(level, pos, entity);
        return original.call(level, pos, blockState);
    }

    @WrapOperation(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;setBlockAndUpdate(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z"))
    private boolean chisel$restoreMoss(Level level, BlockPos pos, BlockState blockState, Operation<Boolean> original) {
        boolean placed = original.call(level, pos, blockState);
        if (placed) MossHelper.restoreMovingMoss(level, pos, (FallingBlockEntity) (Object) this);
        return placed;
    }
}
