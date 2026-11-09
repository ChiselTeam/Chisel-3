package io.github.chiselteam.chisel.mixin.client;

import com.llamalad7.mixinextras.sugar.Local;
import io.github.chiselteam.chisel.client.render.GhostAppearance;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(LivingEntityRenderer.class)
abstract class GhostPlayerRendererMixin {
    @SuppressWarnings("unchecked")
    @Inject(method = "getRenderType", at = @At("HEAD"), cancellable = true)
    private void chisel$ghostSkinType(LivingEntity entity, boolean visible, boolean translucent, boolean glowing,
                                     CallbackInfoReturnable<RenderType> cir) {
        // Leave invisibility, friendly-invisible rendering and glowing outlines to vanilla.
        if (visible && !entity.isInvisible() && GhostAppearance.appliesTo(entity)) {
            cir.setReturnValue(RenderType.entityTranslucent(((LivingEntityRenderer<LivingEntity, ?>) (Object) this).getTextureLocation(entity)));
        }
    }

    @ModifyArgs(method = "render(Lnet/minecraft/world/entity/LivingEntity;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/EntityModel;renderToBuffer(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V"))
    private void chisel$ghostSkinColor(Args args, @Local(argsOnly = true) LivingEntity entity) {
        if (!entity.isInvisible() && GhostAppearance.appliesTo(entity)) {
            args.set(4, GhostAppearance.fade(args.get(4)));
        }
    }
}
