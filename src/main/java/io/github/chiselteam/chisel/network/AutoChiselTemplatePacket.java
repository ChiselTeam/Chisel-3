package io.github.chiselteam.chisel.network;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.menu.AutoChiselMenu;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jetbrains.annotations.NotNull;

public record AutoChiselTemplatePacket(ResourceLocation blockId) implements CustomPacketPayload {

    public static final Type<AutoChiselTemplatePacket> TYPE = new Type<>(Chisel.prefix("auto_chisel_template"));
    public static final StreamCodec<FriendlyByteBuf, AutoChiselTemplatePacket> STREAM_CODEC = StreamCodec.composite(
            ResourceLocation.STREAM_CODEC, AutoChiselTemplatePacket::blockId,
            AutoChiselTemplatePacket::new
    );

    public static void handle(AutoChiselTemplatePacket payload, IPayloadContext context) {
        context.enqueueWork(() -> {
            if (context.player().containerMenu instanceof AutoChiselMenu menu) {
                menu.selectTemplateVariant(context.player(), payload.blockId());
            }
        });
    }

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
