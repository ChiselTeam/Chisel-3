package io.github.chiselteam.chisel.registry;

import com.mojang.serialization.Codec;
import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.palette.PlayerPalettes;
import io.github.chiselteam.chisel.projectile.MossData;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public final class ChiselAttachments {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENTS = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, Chisel.MODID);
    public static final DeferredHolder<AttachmentType<?>, AttachmentType<MossData>> MOSS;

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Integer>> MOVING_MOSS = ATTACHMENTS.register("moving_moss",
            () -> AttachmentType.builder(() -> 0).serialize(Codec.intRange(0, 10).fieldOf("texture").codec()).build());

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<PlayerPalettes>> PALETTES = ATTACHMENTS.register("player_palettes",
            () -> AttachmentType.builder(() -> PlayerPalettes.EMPTY).serialize(PlayerPalettes.CODEC.codec()).copyOnDeath()
                    .sync((holder, recipient) -> holder == recipient, PlayerPalettes.STREAM_CODEC).build());

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Boolean>> DEFAULT_PALETTES_GRANTED = ATTACHMENTS.register("default_palettes_granted",
            () -> AttachmentType.builder(() -> false).serialize(Codec.BOOL.fieldOf("granted").codec()).copyOnDeath().build());

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Boolean>> BUILDERS_HANDBOOK_GRANTED = ATTACHMENTS.register("builders_handbook_granted",
            () -> AttachmentType.builder(() -> false).serialize(Codec.BOOL.fieldOf("granted").codec()).copyOnDeath().build());

    static {
        MOSS = ATTACHMENTS.register("moss", () -> AttachmentType.builder(MossData::new).serialize(MossData.CODEC.codec()).build());
    }

    private ChiselAttachments() {
    }
}
