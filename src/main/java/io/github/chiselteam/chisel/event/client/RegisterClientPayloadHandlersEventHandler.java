package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.gui.BuildersHandbookScreen;
import io.github.chiselteam.chisel.client.gui.palette.PaletteEditorScreen;
import io.github.chiselteam.chisel.client.gui.palette.PaletteLibraryScreen;
import io.github.chiselteam.chisel.client.moss.ClientMossData;
import io.github.chiselteam.chisel.network.*;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.network.event.RegisterClientPayloadHandlersEvent;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class RegisterClientPayloadHandlersEventHandler {

    @SubscribeEvent
    public static void registerClientPayloadHandlers(RegisterClientPayloadHandlersEvent event) {
        event.register(MossChunkPacket.TYPE, (packet, context) -> context.enqueueWork(() ->
                ClientMossData.replaceChunk(packet.chunk(), packet.entries())));
        event.register(MossDeltaPacket.TYPE, (packet, context) -> context.enqueueWork(() ->
                ClientMossData.set(packet.pos(), packet.mossy(), packet.texture())));
        event.register(OpenHandbookPacket.TYPE, (packet, context) -> context.enqueueWork(() ->
                Minecraft.getInstance().setScreen(new BuildersHandbookScreen())));
        event.register(HandbookGuidesPacket.TYPE, HandbookGuidesPacket::handle);
        event.register(OpenPaletteBuilderPacket.TYPE, (packet, context) -> context.enqueueWork(() ->
                Minecraft.getInstance().setScreen(new PaletteLibraryScreen())));
        event.register(PaletteSaveResultPacket.TYPE, (packet, context) -> context.enqueueWork(() -> {
            if (Minecraft.getInstance().screen instanceof PaletteEditorScreen editor) editor.acceptSaveResult(packet);
        }));
    }
}
