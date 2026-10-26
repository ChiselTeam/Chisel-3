package io.github.chiselteam.chisel.mixin;

import io.github.chiselteam.chisel.projectile.MossHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LevelChunk.class)
abstract class LevelChunkMixin {
    @Shadow
    @Final
    private Level level;

    @Inject(method = "setBlockState", at = @At("RETURN"))
    private void chisel$removeMossOnReplacement(BlockPos pos, BlockState state, boolean moving, CallbackInfoReturnable<BlockState> cir) {
        MossHelper.onBlockChanged(level, pos, cir.getReturnValue(), state);
    }
}
