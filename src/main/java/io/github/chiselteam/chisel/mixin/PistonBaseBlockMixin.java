package io.github.chiselteam.chisel.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.github.chiselteam.chisel.projectile.MossHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.piston.PistonBaseBlock;
import net.minecraft.world.level.block.piston.PistonMovingBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PistonBaseBlock.class)
abstract class PistonBaseBlockMixin {
    @WrapOperation(method = "moveBlocks", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V"))
    private void chisel$carryMoss(Level level, BlockEntity blockEntity, Operation<Void> original) {
        if (blockEntity instanceof PistonMovingBlockEntity moving && !moving.isSourcePiston()) {
            MossHelper.captureMovingMoss(level, moving.getBlockPos().relative(moving.getMovementDirection().getOpposite()), moving);
        }
        original.call(level, blockEntity);
    }
}
