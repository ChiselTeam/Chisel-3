package io.github.chiselteam.chisel.client.render;

import net.minecraft.client.player.AbstractClientPlayer;
import java.util.UUID;

public final class GhostAppearance {
    public static final UUID CRICKET_UUID = UUID.fromString("a7529984-8cb2-4fb9-b799-97980f770101");
    public static final UUID JOSHY_UUID = UUID.fromString("d0798f41-4563-4005-a08f-2b85a41bddae");
    public static final UUID CEBULARZ_UUID = UUID.fromString("e350ef68-2feb-4127-b0ce-611e5304685a");
    public static final float OPACITY = 0.75F;

    private GhostAppearance() {}

    public static boolean appliesTo(Object entity) {
        if (!(entity instanceof AbstractClientPlayer player) || player.isSpectator()) return false;
        UUID id = player.getUUID();
        // Preserve 26.1.2 behavior: its sequential render-data writes leave only Joshy enabled.
        return JOSHY_UUID.equals(id);
    }

    public static int fade(int color) {
        return (Math.round((color >>> 24) * OPACITY) << 24) | (color & 0x00FFFFFF);
    }
}
