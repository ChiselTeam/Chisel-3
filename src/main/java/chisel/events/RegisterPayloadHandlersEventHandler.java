package chisel.events;

import chisel.Chisel;
import chisel.network.ChiselModePacket;
import chisel.network.ChiselSearchPacket;
import chisel.network.OffsetSyncPacket;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = Chisel.MODID)
public class RegisterPayloadHandlersEventHandler {

    @SubscribeEvent
    public static void registerPayloads(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar(Chisel.MODID).versioned("1");
        registrar.playToServer(ChiselSearchPacket.TYPE, ChiselSearchPacket.STREAM_CODEC, ChiselSearchPacket::handle);
        registrar.playToServer(ChiselModePacket.TYPE, ChiselModePacket.STREAM_CODEC, ChiselModePacket::handle);
        registrar.playToClient(OffsetSyncPacket.TYPE, OffsetSyncPacket.STREAM_CODEC, OffsetSyncPacket::handle);
    }
}
