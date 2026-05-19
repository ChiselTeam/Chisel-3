package chisel.events;

import chisel.Chisel;
import chisel.projectile.BallOMossData;
import chisel.projectile.SmashingRockData;
import chisel.core.mode.ChiselMode;
import chisel.core.variant.VariantFamily;
import chisel.datagen.registry.ChiselBallOMossRegistry;
import chisel.datagen.registry.ChiselSmashingRockRegistry;
import chisel.datagen.ChiselVariants;
import chisel.registry.ChiselModes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DataPackRegistryEvent;

@EventBusSubscriber(modid = Chisel.MODID)
public class DatapackRegistryEventHandler {

    @SubscribeEvent
    public static void registerRegistries(DataPackRegistryEvent.NewRegistry event) {
        event.dataPackRegistry(ChiselVariants.KEY, VariantFamily.CODEC, VariantFamily.CODEC);
        event.dataPackRegistry(ChiselSmashingRockRegistry.KEY, SmashingRockData.CODEC, SmashingRockData.CODEC);
        event.dataPackRegistry(ChiselBallOMossRegistry.KEY, BallOMossData.CODEC, BallOMossData.CODEC);
    }
}
