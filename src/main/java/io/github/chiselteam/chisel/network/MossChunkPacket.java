package io.github.chiselteam.chisel.network;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.projectile.MossEntry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.level.ChunkPos;
import org.jspecify.annotations.NonNull;

import java.util.List;

public record MossChunkPacket(ChunkPos chunk, List<MossEntry> entries) implements CustomPacketPayload {
    public static final Type<MossChunkPacket> TYPE = new Type<>(Chisel.prefix("moss_chunk"));
    public static final StreamCodec<FriendlyByteBuf, MossChunkPacket> STREAM_CODEC = StreamCodec.composite(
            ChunkPos.STREAM_CODEC, MossChunkPacket::chunk,
            MossEntry.STREAM_CODEC.apply(ByteBufCodecs.list()), MossChunkPacket::entries,
            MossChunkPacket::new);

    @Override
    public @NonNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
