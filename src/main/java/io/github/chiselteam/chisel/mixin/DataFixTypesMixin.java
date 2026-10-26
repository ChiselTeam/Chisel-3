package io.github.chiselteam.chisel.mixin;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import io.github.chiselteam.chisel.migration.LegacyWorldMigration;
import net.minecraft.util.datafix.DataFixTypes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DataFixTypes.class)
abstract class DataFixTypesMixin {
    @Shadow @Final private DSL.TypeReference type;

    @Inject(method = "update(Lcom/mojang/datafixers/DataFixer;Lcom/mojang/serialization/Dynamic;II)Lcom/mojang/serialization/Dynamic;", at = @At("RETURN"), cancellable = true)
    private <T> void chisel$migrateLegacyIds(DataFixer fixer, Dynamic<T> data, int fromVersion, int toVersion, CallbackInfoReturnable<Dynamic<T>> cir) {
        cir.setReturnValue(LegacyWorldMigration.afterVanilla(type, cir.getReturnValue(), toVersion));
    }
}
