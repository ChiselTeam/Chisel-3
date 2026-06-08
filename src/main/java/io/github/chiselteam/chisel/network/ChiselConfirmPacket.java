package io.github.chiselteam.chisel.network;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.inventory.menu.ChiselMenu;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jspecify.annotations.NonNull;

public record ChiselConfirmPacket(int selectionIndex) implements CustomPacketPayload {

    public static final Type<ChiselConfirmPacket> TYPE = new Type<>(Chisel.prefix("confirm"));

    public static final StreamCodec<FriendlyByteBuf, ChiselConfirmPacket> STREAM_CODEC = ByteBufCodecs.VAR_INT.map(
            ChiselConfirmPacket::new, ChiselConfirmPacket::selectionIndex
    ).cast();

    @Override
    public @NonNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(final ChiselConfirmPacket payload, final IPayloadContext context) {
        context.enqueueWork(() -> {
            if (context.player().containerMenu instanceof ChiselMenu menu) {
                menu.confirmChisel(context.player(), payload.selectionIndex());
            }
        });
    }
}
