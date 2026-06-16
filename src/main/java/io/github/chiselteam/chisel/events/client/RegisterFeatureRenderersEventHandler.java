package io.github.chiselteam.chisel.events.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.feature.OffsetToolOverlayFeatureRenderer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterFeatureRenderersEvent;

@EventBusSubscriber(modid = Chisel.MODID)
public class RegisterFeatureRenderersEventHandler {

    @SubscribeEvent
    public static void registerFeatureRenderers(RegisterFeatureRenderersEvent event) {
        event.register(OffsetToolOverlayFeatureRenderer.TYPE, new OffsetToolOverlayFeatureRenderer());
    }
}
