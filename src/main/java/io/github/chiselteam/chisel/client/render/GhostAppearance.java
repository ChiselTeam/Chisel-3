package io.github.chiselteam.chisel.client.render;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.util.context.ContextKey;

import java.util.UUID;

public final class GhostAppearance {
    public static final UUID CRICKET_UUID = UUID.fromString("a7529984-8cb2-4fb9-b799-97980f770101");
    public static final UUID JOSHY_UUID = UUID.fromString("d0798f41-4563-4005-a08f-2b85a41bddae");
    public static final UUID CEBULARZ_UUID = UUID.fromString("e350ef68-2feb-4127-b0ce-611e5304685a");

    public static final float OPACITY = 0.75F;
    public static final ContextKey<Boolean> GHOST = new ContextKey<>(Chisel.prefix("ghost"));

    private GhostAppearance() {
    }

    public static boolean isGhost(UUID uuid) {
        return CRICKET_UUID.equals(uuid) || CEBULARZ_UUID.equals(uuid) || JOSHY_UUID.equals(uuid);
    }

    public static boolean appliesTo(Object state) {
        return state instanceof AvatarRenderState avatar && !avatar.isSpectator && Boolean.TRUE.equals(avatar.getRenderData(GHOST));
    }

    public static int fade(int color) {
        return (Math.round((color >>> 24) * OPACITY) << 24) | (color & 0x00FFFFFF);
    }
}
