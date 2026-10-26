package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.overlay.OutlineEdge;
import io.github.chiselteam.chisel.item.TrowelItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.GlobalPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class TrowelInventoryRenderer {
    @SubscribeEvent
    public static void render(RenderLevelStageEvent event) {
        if (event.getStage() != RenderLevelStageEvent.Stage.AFTER_TRANSLUCENT_BLOCKS) return;
        var minecraft = Minecraft.getInstance();
        var player = minecraft.player;
        if (player == null || minecraft.level == null) return;

        var main = linkedInventory(player.getMainHandItem());
        var off = linkedInventory(player.getOffhandItem());
        if (main != null) renderOutline(event, main);
        if (off != null && !off.equals(main)) renderOutline(event, off);
    }

    private static GlobalPos linkedInventory(ItemStack stack) {
        return stack.getItem() instanceof TrowelItem ? TrowelItem.getLinkedInventory(stack) : null;
    }

    private static void renderOutline(RenderLevelStageEvent event, GlobalPos link) {
        var minecraft = Minecraft.getInstance();
        var level = minecraft.level;
        var camera = minecraft.getEntityRenderDispatcher().camera;
        if (level == null || camera == null || !level.dimension().equals(link.dimension()) || !level.hasChunkAt(link.pos())) return;

        var pos = link.pos();
        var state = level.getBlockState(pos);
        if (state.isAir()) return;
        var shape = state.getShape(level, pos, CollisionContext.of(minecraft.player));
        var cameraPos = camera.getPosition();
        var pose = event.getPoseStack();
        pose.pushPose();
        pose.translate(pos.getX() - cameraPos.x, pos.getY() - cameraPos.y, pos.getZ() - cameraPos.z);

        pose.translate(-0.002, -0.002, -0.002);
        pose.scale(1.004F, 1.004F, 1.004F);
        var matrix = pose.last().pose();
        var consumer = minecraft.renderBuffers().bufferSource().getBuffer(RenderType.lines());
        shape.forAllEdges((x1, y1, z1, x2, y2, z2) -> {
            var edge = OutlineEdge.create((float) x1, (float) y1, (float) z1, (float) x2, (float) y2, (float) z2);
            consumer.addVertex(matrix, edge.x1(), edge.y1(), edge.z1())
                    .setColor(0, 255, 255, 255).setNormal(edge.normalX(), edge.normalY(), edge.normalZ());
            consumer.addVertex(matrix, edge.x2(), edge.y2(), edge.z2())
                    .setColor(0, 255, 255, 255).setNormal(edge.normalX(), edge.normalY(), edge.normalZ());
        });
        pose.popPose();
    }
}
