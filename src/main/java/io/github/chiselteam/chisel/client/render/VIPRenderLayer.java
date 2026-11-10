package io.github.chiselteam.chisel.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.chiselteam.chisel.event.client.AddLayersEventHandler;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import org.jspecify.annotations.NonNull;

public class VIPRenderLayer extends RenderLayer<AvatarRenderState, PlayerModel> {

    public VIPRenderLayer(RenderLayerParent<AvatarRenderState, PlayerModel> renderer) {
        super(renderer);
    }

    @Override
    public void submit(@NonNull PoseStack pose, @NonNull SubmitNodeCollector submit, int lightCoords, @NonNull AvatarRenderState state, float yRot, float xRot) {
        if(state.isInvisible || state.isSpectator) return;

        ItemStackRenderState item = state.getRenderData(AddLayersEventHandler.VIP_ITEM);
        if(item == null) return;

        pose.pushPose();
        getParentModel().body.translateAndRotate(pose);

        pose.translate(0.0F, 11.0F / 16.0F, 0.0F);
        pose.mulPose(Axis.XP.rotation(-getParentModel().body.xRot));

        boolean armor = !state.legsEquipment.isEmpty();
        pose.translate((armor ? 5.25F : 4.5F) / 16.0F, 2.0F / 16.0F, 0.75F / 16.0F);
        pose.mulPose(Axis.YP.rotationDegrees(90.0F));

        pose.mulPose(Axis.ZP.rotationDegrees(-35.0F));
        pose.scale(0.5F, 0.5F, 0.5F);

        item.submit(pose, submit, lightCoords, OverlayTexture.NO_OVERLAY, 0);
        pose.popPose();
    }
}
