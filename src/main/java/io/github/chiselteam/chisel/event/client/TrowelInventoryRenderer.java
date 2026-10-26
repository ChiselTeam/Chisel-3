package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.item.TrowelItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.util.context.ContextKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ExtractLevelRenderStateEvent;
import net.neoforged.neoforge.client.event.SubmitCustomGeometryEvent;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class TrowelInventoryRenderer {
    private static final ContextKey<List<Outline>> OUTLINES = new ContextKey<>(Chisel.prefix("trowel_inventory_outlines"));

    @SubscribeEvent
    public static void extract(ExtractLevelRenderStateEvent event) {
        var player = Minecraft.getInstance().player;
        List<Outline> outlines = new ArrayList<>();
        if (player != null) {
            var main = linkedInventory(player.getMainHandItem());
            var off = linkedInventory(player.getOffhandItem());
            if (main != null) extractOutline(event, player, main, outlines);
            if (off != null && !off.equals(main)) extractOutline(event, player, off, outlines);
        }
        event.getRenderState().setRenderData(OUTLINES, List.copyOf(outlines));
    }

    private static GlobalPos linkedInventory(ItemStack stack) {
        return stack.getItem() instanceof TrowelItem ? TrowelItem.getLinkedInventory(stack) : null;
    }

    private static void extractOutline(ExtractLevelRenderStateEvent event, LocalPlayer player, GlobalPos link, List<Outline> outlines) {
        var level = event.getLevel();
        if (!level.dimension().equals(link.dimension()) || !level.hasChunkAt(link.pos())) return;
        var state = level.getBlockState(link.pos());
        if (!state.isAir()) outlines.add(new Outline(link.pos().immutable(), state.getShape(level, link.pos(), CollisionContext.of(player))));
    }

    @SubscribeEvent
    public static void render(SubmitCustomGeometryEvent event) {
        var outlines = event.getLevelRenderState().getRenderData(OUTLINES);
        if (outlines == null) return;
        var camera = event.getLevelRenderState().cameraRenderState.pos;
        var pose = event.getPoseStack();
        for (var outline : outlines) {
            var pos = outline.pos();
            pose.pushPose();
            pose.translate(pos.getX() - camera.x - 0.002, pos.getY() - camera.y - 0.002, pos.getZ() - camera.z - 0.002);
            pose.scale(1.004F, 1.004F, 1.004F);
            event.getSubmitNodeCollector().submitShapeOutline(pose, outline.shape(), RenderTypes.lines(), 0xFF00FFFF, 3.0F, true);
            pose.popPose();
        }
    }

    private record Outline(BlockPos pos, VoxelShape shape) {
    }
}
