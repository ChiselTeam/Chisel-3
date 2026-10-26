package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.overlay.*;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public final class SelectionHandler {
    private static final List<SelectionProvider<?>> PROVIDERS = List.of(new ChiselModeSelectionProvider(), new PaletteSelectionProvider());
    private static @Nullable Session<?> session;
    private static boolean waitingForRelease;

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        var minecraft = Minecraft.getInstance();
        var player = minecraft.player;
        boolean keyDown = ChiselKeyMappings.MODE_SELECT.isDown();
        if (!keyDown) waitingForRelease = false;
        if (player == null || minecraft.screen != null) {
            cancel(keyDown);
            return;
        }
        if (session != null) {
            if (!session.isValid(player)) {
                cancel(keyDown);
            } else if (!keyDown) {
                session.commit(player);
                session = null;
            }
            return;
        }
        if (!keyDown || waitingForRelease) return;
        for (var hand : InteractionHand.values()) {
            var stack = player.getItemInHand(hand);
            for (var provider : PROVIDERS) {
                if (!provider.supports(stack)) continue;
                begin(provider, player, hand, stack);
                return;
            }
        }
    }

    private static <T> void begin(SelectionProvider<T> provider, Player player, InteractionHand hand, ItemStack stack) {
        var choices = List.copyOf(provider.choices(player));
        if (!choices.isEmpty()) session = new Session<>(provider, player, hand, stack, choices);
    }

    @SubscribeEvent
    public static void onMouseScroll(InputEvent.MouseScrollingEvent event) {
        if (session == null || event.getScrollDeltaY() == 0) return;
        var minecraft = Minecraft.getInstance();
        if (minecraft.player == null || minecraft.screen != null || !session.isValid(minecraft.player) || !ChiselKeyMappings.MODE_SELECT.isDown()) return;
        session.scroll(event.getScrollDeltaY() > 0 ? -1 : 1);
        event.setCanceled(true);
    }

    private static void cancel(boolean keyDown) {
        session = null;
        waitingForRelease = keyDown;
    }

    public static @Nullable SelectionOverlayState getOverlayState() {
        var minecraft = Minecraft.getInstance();
        if (session == null || minecraft.player == null || minecraft.screen != null || !session.isValid(minecraft.player)) return null;
        return session.overlayState();
    }

    private static final class Session<T> {
        private static final long ANIMATION_DURATION = 120_000_000L;
        private final SelectionProvider<T> provider;
        private final Player owner;
        private final InteractionHand hand;
        private final ItemStack tool;
        private final List<T> choices;
        private final List<SelectionOverlayEntry> entries;
        private final int originalIndex;
        private int selectedIndex;
        private long animationStart;
        private int animationDirection;

        private Session(SelectionProvider<T> provider, Player player, InteractionHand hand, ItemStack tool, List<T> choices) {
            this.provider = provider;
            this.owner = player;
            this.hand = hand;
            this.tool = tool;
            this.choices = choices;
            this.entries = choices.stream().map(provider::entry).toList();
            this.originalIndex = Math.clamp(provider.selectedIndex(player, tool, choices), 0, choices.size() - 1);
            this.selectedIndex = originalIndex;
        }

        private boolean isValid(Player player) {
            return player == owner && player.getItemInHand(hand) == tool && provider.isValid(player, tool, choices);
        }

        private void scroll(int direction) {
            if (choices.size() == 1) return;
            selectedIndex = Math.floorMod(selectedIndex + direction, choices.size());
            animationDirection = direction;
            animationStart = System.nanoTime();
        }

        private void commit(Player player) {
            if (selectedIndex != originalIndex) provider.commit(player, hand, choices.get(selectedIndex));
        }

        private SelectionOverlayState overlayState() {
            float progress = animationStart == 0 ? 1.0F : Math.clamp((float) (System.nanoTime() - animationStart) / ANIMATION_DURATION, 0.0F, 1.0F);
            return new SelectionOverlayState(entries, selectedIndex, progress, animationDirection);
        }
    }
}
