package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.guide.manager.*;
import io.github.chiselteam.chisel.network.HandbookGuidesPacket;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.event.OnDatapackSyncEvent;
import net.neoforged.neoforge.network.PacketDistributor;

@EventBusSubscriber(modid = Chisel.MODID)
public class AddReloadListenerEventHandler {

    @SubscribeEvent
    public static void addServerReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new HandbookReloadListener());
        event.addListener(new HandbookCategoryReloadListener());
        event.addListener(new HandbookReferenceReloadListener());    }

    @SubscribeEvent
    public static void onDatapackSync(OnDatapackSyncEvent event) {
        var guidesPacket = new HandbookGuidesPacket(HandbookRecipeResolver.resolve(ServerHandbookManager.getGuides(), event.getPlayerList().getServer().getRecipeManager()), ServerHandbookManager.getCategories());

        event.getRelevantPlayers().forEach(player -> PacketDistributor.sendToPlayer(player, guidesPacket));
    }
}
