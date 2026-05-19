package chisel.network;

import chisel.Chisel;
import chisel.core.mode.ChiselMode;
import chisel.inventory.menu.ChiselMenu;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record ChiselModePacket(ChiselMode mode) implements CustomPacketPayload {

    public static final Type<ChiselModePacket> TYPE = new Type<>(Chisel.prefix("mode"));

    public static final StreamCodec<FriendlyByteBuf, ChiselModePacket> STREAM_CODEC = ChiselMode.STREAM_CODEC.map(
            ChiselModePacket::new, ChiselModePacket::mode
    ).cast();

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(final ChiselModePacket payload, final IPayloadContext context) {
        context.enqueueWork(() -> {
            if (context.player().containerMenu instanceof ChiselMenu menu) {
                menu.setMode(payload.mode());
            }
        });
    }
}
