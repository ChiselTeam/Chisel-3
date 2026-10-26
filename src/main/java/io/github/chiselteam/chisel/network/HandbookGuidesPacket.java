package io.github.chiselteam.chisel.network;

import com.mojang.serialization.Codec;
import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.guide.HandbookCategory;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.manager.ClientHandbookManager;
import net.minecraft.nbt.NbtAccounter;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public record HandbookGuidesPacket(Map<ResourceLocation, HandbookGuide> guides, Map<ResourceLocation, HandbookCategory> categories) implements CustomPacketPayload {
    public static final Type<HandbookGuidesPacket> TYPE = new Type<>(Chisel.prefix("handbook_guides"));

    private static final Codec<Map<ResourceLocation, HandbookGuide>> GUIDE_MAP_CODEC = Codec.unboundedMap(ResourceLocation.CODEC, HandbookGuide.CODEC);
    public static final long MAX_GUIDE_NBT_BYTES = 128L * 1024 * 1024;
    public static final StreamCodec<RegistryFriendlyByteBuf, Map<ResourceLocation, HandbookGuide>> GUIDES_STREAM_CODEC = ByteBufCodecs.fromCodecWithRegistries(GUIDE_MAP_CODEC, () -> NbtAccounter.create(MAX_GUIDE_NBT_BYTES));

    private static final Codec<Map<ResourceLocation, HandbookCategory>> CATEGORY_MAP_CODEC = Codec.unboundedMap(ResourceLocation.CODEC, HandbookCategory.CODEC);
    public static final StreamCodec<RegistryFriendlyByteBuf, Map<ResourceLocation, HandbookCategory>> CATEGORIES_STREAM_CODEC = ByteBufCodecs.fromCodecWithRegistries(CATEGORY_MAP_CODEC);

    public static final StreamCodec<RegistryFriendlyByteBuf, HandbookGuidesPacket> STREAM_CODEC = StreamCodec.composite(GUIDES_STREAM_CODEC, HandbookGuidesPacket::guides, CATEGORIES_STREAM_CODEC, HandbookGuidesPacket::categories, HandbookGuidesPacket::new);

    public HandbookGuidesPacket {
        guides = Map.copyOf(guides);
        categories = Map.copyOf(categories);
    }

    public static void handle(HandbookGuidesPacket packet, IPayloadContext context) {
        ClientHandbookManager.replace(packet.guides(), packet.categories());
    }

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
