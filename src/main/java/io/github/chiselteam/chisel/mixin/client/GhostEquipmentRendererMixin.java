package io.github.chiselteam.chisel.mixin.client;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.chiselteam.chisel.client.render.GhostAppearance;
import io.github.chiselteam.chisel.client.render.GhostRenderTypes;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(HumanoidArmorLayer.class)
abstract class GhostEquipmentRendererMixin {
    @Unique private boolean chisel$ghost;

    // Scope the context to NeoForge's armor-piece method, retaining custom armor model and tint hooks.
    @WrapMethod(method = "renderArmorPiece(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;ILnet/minecraft/client/model/HumanoidModel;FFFFFF)V")
    private void chisel$withGhost(PoseStack pose, MultiBufferSource buffers, LivingEntity entity,
                                  EquipmentSlot slot, int light, HumanoidModel<?> model, float swing,
                                  float amount, float partialTick, float age, float yaw, float pitch, Operation<Void> original) {
        boolean previous = chisel$ghost;
        chisel$ghost = GhostAppearance.appliesTo(entity);
        try {
            original.call(pose, buffers, entity, slot, light, model, swing, amount, partialTick, age, yaw, pitch);
        } finally {
            chisel$ghost = previous;
        }
    }

    @WrapOperation(method = "renderModel(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/client/model/Model;ILnet/minecraft/resources/ResourceLocation;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderType;armorCutoutNoCull(Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/client/renderer/RenderType;"))
    private RenderType chisel$ghostArmor(ResourceLocation texture, Operation<RenderType> original) {
        return chisel$ghost ? GhostRenderTypes.armorTranslucent(texture) : original.call(texture);
    }

    @ModifyArgs(method = "renderModel(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/client/model/Model;ILnet/minecraft/resources/ResourceLocation;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/Model;renderToBuffer(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V"))
    private void chisel$ghostArmorColor(Args args) {
        if (chisel$ghost) args.set(4, GhostAppearance.fade(args.get(4)));
    }

    @WrapOperation(method = "renderTrim(Lnet/minecraft/core/Holder;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/item/armortrim/ArmorTrim;Lnet/minecraft/client/model/Model;Z)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Sheets;armorTrimsSheet(Z)Lnet/minecraft/client/renderer/RenderType;"))
    private RenderType chisel$ghostTrim(boolean decal, Operation<RenderType> original) {
        return chisel$ghost ? GhostRenderTypes.armorTrim(decal) : original.call(decal);
    }

    @WrapOperation(method = "renderTrim(Lnet/minecraft/core/Holder;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/item/armortrim/ArmorTrim;Lnet/minecraft/client/model/Model;Z)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/Model;renderToBuffer(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;II)V"))
    private void chisel$ghostTrimColor(Model model, PoseStack pose, VertexConsumer consumer, int light, int overlay, Operation<Void> original) {
        if (chisel$ghost) model.renderToBuffer(pose, consumer, light, overlay, GhostAppearance.fade(-1));
        else original.call(model, pose, consumer, light, overlay);
    }

    @WrapOperation(method = "renderGlint(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/client/model/Model;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderType;armorEntityGlint()Lnet/minecraft/client/renderer/RenderType;"))
    private RenderType chisel$ghostGlint(Operation<RenderType> original) {
        return chisel$ghost ? GhostRenderTypes.ARMOR_GLINT : original.call();
    }
}
