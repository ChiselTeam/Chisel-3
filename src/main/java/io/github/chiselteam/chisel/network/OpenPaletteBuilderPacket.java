package io.github.chiselteam.chisel.network;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import org.jetbrains.annotations.NotNull;

public record OpenPaletteBuilderPacket() implements CustomPacketPayload {
    public static final OpenPaletteBuilderPacket INSTANCE = new OpenPaletteBuilderPacket();
    public static final Type<OpenPaletteBuilderPacket> TYPE = new Type<>(Chisel.prefix("open_palette_builder"));
    public static final StreamCodec<FriendlyByteBuf, OpenPaletteBuilderPacket> STREAM_CODEC = StreamCodec.unit(INSTANCE);

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
