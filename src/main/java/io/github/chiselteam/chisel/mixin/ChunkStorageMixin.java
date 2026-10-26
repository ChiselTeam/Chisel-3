package io.github.chiselteam.chisel.mixin;

import com.mojang.serialization.MapCodec;
import io.github.chiselteam.chisel.migration.LegacyWorldMigration;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.chunk.storage.ChunkStorage;
import net.minecraft.world.level.storage.DimensionDataStorage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;
import java.util.function.Supplier;

@Mixin(ChunkStorage.class)
abstract class ChunkStorageMixin {
    @Inject(method = "upgradeChunkTag", at = @At("RETURN"), cancellable = true)
    private void chisel$migrateCurrentVersionChunks(ResourceKey<Level> dimension, Supplier<DimensionDataStorage> storage,
            CompoundTag data, Optional<ResourceKey<MapCodec<? extends ChunkGenerator>>> generator,
            CallbackInfoReturnable<CompoundTag> cir) {
        // ChunkStorage skips DataFixTypes altogether when the vanilla DataVersion already matches.
        cir.setReturnValue(LegacyWorldMigration.afterChunkUpgrade(cir.getReturnValue()));
    }
}
