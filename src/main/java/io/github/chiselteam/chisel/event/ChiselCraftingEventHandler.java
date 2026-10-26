package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.item.ChiselItem;
import io.github.chiselteam.chisel.registry.ChiselAttachments;
import io.github.chiselteam.chisel.registry.ChiselItems;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Prediction;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = Chisel.MODID)
public final class ChiselCraftingEventHandler {
    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)
                || !(event.getCrafting().getItem() instanceof ChiselItem)
                || player.getData(ChiselAttachments.BUILDERS_HANDBOOK_GRANTED)) return;

        player.setData(ChiselAttachments.BUILDERS_HANDBOOK_GRANTED, true);
        var handbook = new ItemStack(ChiselItems.BUILDERS_HANDBOOK.get());
        if (!player.getInventory().add(handbook)) player.drop(handbook, false, Prediction.SERVER_ONLY);
    }
}
