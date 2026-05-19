package chisel.events;

import chisel.Chisel;
import chisel.events.client.OffsetToolClientHandler;
import chisel.core.ctm.MultiblockOffsetProvider;
import chisel.core.ctm.unbaked.UnbakedEldritchBlockStateModel;
import chisel.core.ctm.unbaked.UnbakedConnectedTextureBlockStateModel;
import chisel.datagen.model.ConnectedTextureBlockModelDefinition;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.ChunkPos;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterBlockStateModels;

@EventBusSubscriber(modid = Chisel.MODID)
public class RegisterModelLoadersEventHandler {

    public static final Identifier CTM_MODEL_ID = Chisel.prefix("connected_texture_model");
    public static final Identifier ELDRITCH_MODEL_ID = Chisel.prefix("eldritch_model");

    static {
        // Bridge the CTM library's offset hook to Chisel's offset tool.
        MultiblockOffsetProvider.set(pos ->
                pos.offset(OffsetToolClientHandler.getOffset(new ChunkPos(pos.getX() >> 4, pos.getZ() >> 4))));
    }

    @SubscribeEvent
    public static void registerModelLoaders(RegisterBlockStateModels event) {
        event.registerModel(CTM_MODEL_ID, UnbakedConnectedTextureBlockStateModel.CODEC);
        event.registerModel(ELDRITCH_MODEL_ID, UnbakedEldritchBlockStateModel.CODEC);
        event.registerDefinition(ConnectedTextureBlockModelDefinition.ID, ConnectedTextureBlockModelDefinition.CODEC);
    }
}
