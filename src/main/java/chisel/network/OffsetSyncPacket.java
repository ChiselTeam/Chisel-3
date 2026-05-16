package chisel.network;

import chisel.Chisel;
import chisel.events.client.OffsetToolClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.level.ChunkPos;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jspecify.annotations.NonNull;

public record OffsetSyncPacket(ChunkPos chunkPos, BlockPos offset) implements CustomPacketPayload {

    public static final Type<OffsetSyncPacket> TYPE = new Type<>(Chisel.prefix("offset_sync"));

    public static final StreamCodec<FriendlyByteBuf, OffsetSyncPacket> STREAM_CODEC = new StreamCodec<>() {
        @Override
        public @NonNull OffsetSyncPacket decode(@NonNull FriendlyByteBuf buf) {
            return new OffsetSyncPacket(new ChunkPos(buf.readInt(), buf.readInt()), buf.readBlockPos());
        }

        @Override
        public void encode(@NonNull FriendlyByteBuf buf, @NonNull OffsetSyncPacket packet) {
            buf.writeInt(packet.chunkPos.x());
            buf.writeInt(packet.chunkPos.z());
            buf.writeBlockPos(packet.offset);
        }
    };

    @Override
    public @NonNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(final OffsetSyncPacket payload, final IPayloadContext context) {
        context.enqueueWork(() -> {
            OffsetToolClientHandler.setOffset(payload.chunkPos(), payload.offset());
            Minecraft mc = Minecraft.getInstance();
            ClientLevel level = mc.level;
            if (level != null) {
                int cx = payload.chunkPos().x();
                int cz = payload.chunkPos().z();
                int minSection = level.getMinSectionY();
                int maxSection = level.getMaxSectionY();
                for (int sy = minSection; sy <= maxSection; sy++) {
                    mc.levelRenderer.setSectionDirty(cx, sy, cz);
                }
            }
        });
    }
}
