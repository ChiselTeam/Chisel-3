package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.family.VariantFamilyLookup;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.TagsUpdatedEvent;

@EventBusSubscriber(modid = Chisel.MODID)
public class TagsUpdatedEventHandler {

    @SubscribeEvent
    public static void tagsUpdated(TagsUpdatedEvent event) {
        VariantFamilyLookup.clearCache();
    }
}
