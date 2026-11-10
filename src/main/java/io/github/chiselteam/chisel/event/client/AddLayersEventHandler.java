package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.render.GhostAppearance;
import io.github.chiselteam.chisel.client.render.GhostRenderTypes;
import io.github.chiselteam.chisel.client.render.VIPRenderLayer;
import io.github.chiselteam.chisel.registry.ChiselItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.ClientAvatarEntity;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.player.AvatarRenderer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.util.context.ContextKey;
import net.minecraft.world.entity.Avatar;
import net.minecraft.world.entity.player.PlayerModelType;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.ItemLike;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterRenderPipelinesEvent;
import net.neoforged.neoforge.client.renderstate.AvatarRenderStateModifier;
import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import org.jspecify.annotations.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class AddLayersEventHandler {

    public static final ContextKey<ItemStackRenderState> VIP_ITEM = new ContextKey<>(Chisel.prefix("vip_item"));

    @SubscribeEvent
    public static void registerGhostPipelines(RegisterRenderPipelinesEvent event) {
        GhostRenderTypes.registerPipelines(event);
    }

    @SubscribeEvent
    public static void addLayers(EntityRenderersEvent.AddLayers event) {
        for (PlayerModelType type : event.getSkins()) {
            AvatarRenderer<AbstractClientPlayer> playerRenderer = event.getPlayerRenderer(type);
            if (playerRenderer != null) {
                playerRenderer.addLayer(new VIPRenderLayer(playerRenderer));
            }
        }
    }

    @SubscribeEvent
    public static void registerRenderStateModifiers(RegisterRenderStateModifiersEvent event) {
        Map<UUID, ItemLike> VIPS = new HashMap<>();
        // Devs
        VIPS.put(GhostAppearance.CRICKET_UUID, ChiselItems.CHISEL_OBSIDIAN);

        // Artists
        VIPS.put(GhostAppearance.CEBULARZ_UUID, ChiselItems.CHISEL_DIAMOND);
        VIPS.put(UUID.fromString("5399b615-3440-4c66-939d-ab1375952ac3"), ChiselItems.CHISEL_DIAMOND); // Drullkus
        VIPS.put(UUID.fromString("735d1fe0-0d75-4cee-86a1-bc11b62ca48a"), ChiselItems.CHISEL_DIAMOND); // RPorotos
        VIPS.put(GhostAppearance.JOSHY_UUID, ChiselItems.CHISEL_DIAMOND);

        // Gallery
        VIPS.put(UUID.fromString("ba1dd62a-00ac-4c18-bb91-1e02ed4b65d8"), ChiselItems.CHISEL_DIAMOND); // Buddy610

        // Community
        VIPS.put(UUID.fromString("d1af5f04-c4cc-486f-b187-fcb0a745bda6"), ChiselItems.CHISEL_IRON); // BeanxxBot
        VIPS.put(UUID.fromString("ba6efe89-0b84-4c5d-9f0e-b42edef10d6a"), ChiselItems.CHISEL_IRON); // NightRhyme45747
        VIPS.put(UUID.fromString("8131ab4b-4b9e-4f50-9fee-7c2e47f2e29c"), ChiselItems.CHISEL_IRON); // Splurkz


        event.registerAvatarEntityModifier(new AvatarRenderStateModifier() {
            @Override
            public <T extends Avatar & ClientAvatarEntity> void accept(@NonNull T avatar, @NonNull AvatarRenderState state) {
                state.setRenderData(GhostAppearance.GHOST, GhostAppearance.isGhost(avatar.getUUID()));

                ItemLike item = VIPS.get(avatar.getUUID());
                if(item == null) return;

                ItemStackRenderState stack = new ItemStackRenderState();
                Minecraft.getInstance().getItemModelResolver().updateForTopItem(stack, item.asItem().getDefaultInstance(), ItemDisplayContext.FIXED, null, null, 0);

                state.setRenderData(VIP_ITEM, stack);
            }
        });
    }
}
