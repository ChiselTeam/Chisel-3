package io.github.chiselteam.chisel.client.entity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import io.github.chiselteam.chisel.client.entity.state.AutoChiselBlockEntityRenderState;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
public class AutoChiselBlockEntityRenderer implements BlockEntityRenderer<AutoChiselBlockEntity> {
    private final ItemRenderer itemRenderer;
    private static final int LIGHT_COORDS = 15728850;
    public AutoChiselBlockEntityRenderer(BlockEntityRendererProvider.Context context) { itemRenderer = context.getItemRenderer(); }
    @Override
    public void render(AutoChiselBlockEntity entity, float partialTick, PoseStack pose, MultiBufferSource buffers, int light, int overlay) {
        var state = new AutoChiselBlockEntityRenderState();
        state.level = entity.getLevel();
        state.block = entity.getItem(AutoChiselBlockEntity.TEMPLATE_SLOT);
        state.chisel = entity.getItem(AutoChiselBlockEntity.CHISEL_SLOT);
        int[] slots = {AutoChiselBlockEntity.STACK_UPGRADE_SLOT, AutoChiselBlockEntity.AUTOMATION_UPGRADE_SLOT, AutoChiselBlockEntity.REVERSION_UPGRADE_SLOT, AutoChiselBlockEntity.SPEED_UPGRADE_SLOT};
        for (int i = 0; i < slots.length; i++) state.upgrades[i] = entity.getItem(slots[i]);
        submitBlock(pose, buffers, state);
        submitChisel(pose, buffers, state);
        submitUpgrades(pose, buffers, state);
    }
    private void renderItem(ItemStack stack, PoseStack pose, MultiBufferSource buffers, Level level) {
        itemRenderer.renderStatic(stack, ItemDisplayContext.FIXED, LIGHT_COORDS, OverlayTexture.NO_OVERLAY, pose, buffers, level, 0);
    }
    private void submitBlock(PoseStack pose, net.minecraft.client.renderer.MultiBufferSource buffers, AutoChiselBlockEntityRenderState state) {
        pose.pushPose();
        pose.scale(0.75F, 0.75F, 0.75F);
        pose.translate(0.65, 1.0, 0.65);
        renderItem(state.block, pose, buffers, state.level);
        pose.popPose();
    }

    private void submitUpgrades(PoseStack pose, net.minecraft.client.renderer.MultiBufferSource buffers, AutoChiselBlockEntityRenderState state) {
        for (int c = 0; c < state.upgrades.length; c++) {
            pose.pushPose();
            pose.translate(0.05F, 0.67F, 0.2F + (c * 0.2F));
            pose.rotateAround(Axis.YP.rotationDegrees(90), 0, 1, 0);
            pose.scale(0.1F, 0.1F, 0.1F);
            renderItem(state.upgrades[c], pose, buffers, state.level);
            pose.popPose();
        }
    }

    private void submitChisel(PoseStack pose, net.minecraft.client.renderer.MultiBufferSource buffers, AutoChiselBlockEntityRenderState state) {
        pose.pushPose();
        pose.translate(0.5F, 0.625F, 0.5F);
        pose.rotateAround(Axis.XP.rotationDegrees(90), 1, 0, 0);
        pose.rotateAround(Axis.ZP.rotationDegrees(180), 0, 0, 1);
        renderItem(state.chisel, pose, buffers, state.level);
        pose.popPose();
    }
}
