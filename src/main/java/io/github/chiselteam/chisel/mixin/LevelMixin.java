package io.github.chiselteam.chisel.mixin;

import io.github.chiselteam.chisel.projectile.MossHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Level.class)
abstract class LevelMixin {
    @Inject(method = "markAndNotifyBlock", at = @At("HEAD"))
    private void chisel$removeMossOnCommit(BlockPos pos, @Nullable LevelChunk chunk, BlockState oldState, BlockState blockState, int updateFlags, int updateLimit, CallbackInfo ci) {
        Level level = (Level) (Object) this;
        if (level.getBlockState(pos) == blockState) MossHelper.onBlockChanged(level, pos, oldState, blockState);
    }
}
