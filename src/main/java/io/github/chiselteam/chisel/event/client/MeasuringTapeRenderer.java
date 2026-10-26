package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.item.MeasuringTapeItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.util.context.ContextKey;
import net.minecraft.world.phys.shapes.Shapes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ExtractLevelRenderStateEvent;
import net.neoforged.neoforge.client.event.SubmitCustomGeometryEvent;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class MeasuringTapeRenderer {
    private static final ContextKey<List<Marker>> MARKERS = new ContextKey<>(Chisel.prefix("measuring_tape_markers"));

    @SubscribeEvent
    public static void extract(ExtractLevelRenderStateEvent event) {
        var player = Minecraft.getInstance().player;
        List<Marker> markers = new ArrayList<>();
        if (player != null && player.getMainHandItem().getItem() instanceof MeasuringTapeItem) {
            var tape = player.getMainHandItem();
            MeasuringTapeItem.getFirstPosition(tape).ifPresent(pos -> markers.add(new Marker(pos.immutable(), 0xFFFF0000)));
            MeasuringTapeItem.getSecondPosition(tape).ifPresent(pos -> markers.add(new Marker(pos.immutable(), 0xFFFFFFFF)));
            MeasuringTapeItem.getMiddlePosition(tape).ifPresent(pos -> markers.add(new Marker(pos.immutable(), 0xFF00FFFF)));
        }
        event.getRenderState().setRenderData(MARKERS, List.copyOf(markers));
    }

    @SubscribeEvent
    public static void render(SubmitCustomGeometryEvent event) {
        var markers = event.getLevelRenderState().getRenderData(MARKERS);
        if (markers == null) return;
        var camera = event.getLevelRenderState().cameraRenderState.pos;
        var pose = event.getPoseStack();
        for (var marker : markers) {
            var pos = marker.pos();
            pose.pushPose();
            pose.translate(pos.getX() - camera.x, pos.getY() - camera.y, pos.getZ() - camera.z);
            event.getSubmitNodeCollector().submitShapeOutline(pose, Shapes.block(), RenderTypes.lines(), marker.color(), 3.0F, true);
            pose.popPose();
        }
    }

    private record Marker(BlockPos pos, int color) {
    }
}
