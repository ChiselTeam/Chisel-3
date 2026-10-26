package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.content.ChiselFamilies;
import net.minecraft.client.renderer.BiomeColors;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = Chisel.MODID)
public class RegisterColorsEventHandler {

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        ChiselFamilies.WATERSTONE.getFamily().getVariants().forEach(variant -> event.register((state, getter, pos, tint) -> getter != null && pos != null ? BiomeColors.getAverageWaterColor(getter, pos) : 0x3F76E4, variant.getBlock()));
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        ChiselFamilies.WATERSTONE.getFamily().getVariants().forEach(variant ->
                event.register((stack, tint) -> tint == 0 ? 0x3F76E4 : -1, variant.getBlock().asItem()));
    }
}
