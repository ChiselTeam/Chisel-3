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
    @WrapOperation(method = "fall", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z"))
    private static boolean chisel$carryMoss(Level level, BlockPos pos, BlockState blockState, int updateFlags, Operation<Boolean> original, @Local(ordinal = 0) FallingBlockEntity entity) {
        MossHelper.captureMovingMoss(level, pos, entity);
        return original.call(level, pos, blockState, updateFlags);
    }

    @WrapOperation(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z"))
    private boolean chisel$restoreMoss(Level level, BlockPos pos, BlockState blockState, int updateFlags, Operation<Boolean> original) {
        boolean placed = original.call(level, pos, blockState, updateFlags);
        if (placed) MossHelper.restoreMovingMoss(level, pos, (FallingBlockEntity) (Object) this);
        return placed;
    }
}
