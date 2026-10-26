package io.github.chiselteam.chisel.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.chiselteam.chisel.event.client.AddLayersEventHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemDisplayContext;
import org.jetbrains.annotations.NotNull;

public class VIPRenderLayer extends RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {

    public VIPRenderLayer(RenderLayerParent<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> renderer) {
        super(renderer);
    }

    @Override
    public void render(@NotNull PoseStack pose, @NotNull MultiBufferSource buffers, int lightCoords, AbstractClientPlayer state, float limbSwing, float limbSwingAmount, float partialTick, float ageInTicks, float yRot, float xRot) {
        if(state.isInvisible() || state.isSpectator()) return;

        var item = AddLayersEventHandler.VIPS.get(state.getUUID());
        if(item == null) return;

        pose.pushPose();
        getParentModel().body.translateAndRotate(pose);
        pose.mulPose(Axis.XP.rotationDegrees(180.0F));
        pose.mulPose(Axis.YP.rotationDegrees(90.0F));
        boolean armor = !state.getItemBySlot(EquipmentSlot.LEGS).isEmpty();
        pose.translate(-0.125F, -0.85F, armor ? 0.2F : 0.28F);
        pose.scale(0.5F, 0.5F, 0.5F);

        Minecraft.getInstance().getItemRenderer().renderStatic(item.asItem().getDefaultInstance(), ItemDisplayContext.FIXED, lightCoords, OverlayTexture.NO_OVERLAY, pose, buffers, state.level(), 0);
        pose.popPose();
    }
}
