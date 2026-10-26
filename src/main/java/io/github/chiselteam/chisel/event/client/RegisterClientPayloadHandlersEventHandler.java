package io.github.chiselteam.chisel.event.client;
import io.github.chiselteam.chisel.client.gui.BuildersHandbookScreen;
import io.github.chiselteam.chisel.client.gui.palette.PaletteEditorScreen;
import io.github.chiselteam.chisel.client.gui.palette.PaletteLibraryScreen;
import io.github.chiselteam.chisel.client.moss.ClientMossData;
import io.github.chiselteam.chisel.network.*;
import net.minecraft.client.Minecraft;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.handling.IPayloadContext;
public class RegisterClientPayloadHandlersEventHandler {
    public static void handle(CustomPacketPayload payload, IPayloadContext context) {
        context.enqueueWork(() -> {
            switch (payload) {
                case MossChunkPacket p -> ClientMossData.replaceChunk(p.chunk(), p.entries());
                case MossDeltaPacket p -> ClientMossData.set(p.pos(), p.mossy(), p.texture());
                case OpenHandbookPacket p -> Minecraft.getInstance().setScreen(new BuildersHandbookScreen());
                case OpenPaletteBuilderPacket p -> Minecraft.getInstance().setScreen(new PaletteLibraryScreen());
                case HandbookGuidesPacket p -> HandbookGuidesPacket.handle(p, context);
                case PaletteSaveResultPacket p -> { if (Minecraft.getInstance().screen instanceof PaletteEditorScreen editor) editor.acceptSaveResult(p); }
                default -> throw new IllegalArgumentException("Unknown Chisel client payload: " + payload.type());
            }
        });
    }
}
