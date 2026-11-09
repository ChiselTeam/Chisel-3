package io.github.chiselteam.chisel.mixin.client;

import io.github.chiselteam.chisel.client.render.GhostAppearance;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(LivingEntityRenderer.class)
abstract class GhostPlayerRendererMixin {
    @Shadow
    public abstract Identifier getTextureLocation(LivingEntityRenderState state);

    @ModifyArgs(method = "submit*", at = @At(value = "INVOKE", target =
            "Lnet/minecraft/client/renderer/SubmitNodeCollector;submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IIILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V"))
    private void chisel$ghostSkin(Args args) {
        LivingEntityRenderState state = args.get(1);
        // Preserve vanilla invisibility, friendly-invisible rendering and outlines.
        if (GhostAppearance.appliesTo(state) && !state.isInvisible) {
            args.set(3, RenderTypes.entityTranslucent(getTextureLocation(state)));
            args.set(6, GhostAppearance.fade(args.get(6)));
        }
    }
}
