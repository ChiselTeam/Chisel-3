package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.palette.DefaultPalettes;
import io.github.chiselteam.chisel.palette.PlayerPaletteManager;
import io.github.chiselteam.chisel.palette.PlayerPalettes;
import io.github.chiselteam.chisel.registry.ChiselAttachments;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = Chisel.MODID)
public final class DefaultPalettesEventHandler {
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player) || player.getData(ChiselAttachments.DEFAULT_PALETTES_GRANTED)) return;

        var current = PlayerPaletteManager.get(player);
        var updated = current;
        for (var palette : DefaultPalettes.create()) {
            if (updated.palettes().size() >= PlayerPalettes.MAX_PALETTES) break;
            updated = updated.add(palette);
        }
        if (!updated.equals(current)) player.setData(ChiselAttachments.PALETTES, updated);
        player.setData(ChiselAttachments.DEFAULT_PALETTES_GRANTED, true);
    }
}
