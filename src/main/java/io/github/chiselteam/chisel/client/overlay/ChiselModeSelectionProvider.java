package io.github.chiselteam.chisel.client.overlay;

import io.github.chiselteam.chisel.mode.chisel.ChiselMode;
import io.github.chiselteam.chisel.network.ChiselModeChangePacket;
import io.github.chiselteam.chisel.registry.ChiselDataComponents;
import io.github.chiselteam.chisel.registry.ChiselItemAbilities;
import io.github.chiselteam.chisel.registry.ChiselModes;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Objects;

public final class ChiselModeSelectionProvider implements SelectionProvider<ChiselMode> {
    @Override
    public boolean supports(ItemStack stack) {
        return !stack.isEmpty() && stack.canPerformAction(ChiselItemAbilities.CHISEL);
    }

    @Override
    public List<ChiselMode> choices(Player player) {
        return ChiselModes.REGISTRY.stream().toList();
    }

    @Override
    public SelectionOverlayEntry entry(ChiselMode choice) {
        return new SelectionOverlayEntry(Component.translatable("chisel.mode." + choice.registryName().getPath()), ItemStack.EMPTY);
    }

    @Override
    public int selectedIndex(Player player, ItemStack stack, List<ChiselMode> choices) {
        return choices.indexOf(stack.getOrDefault(ChiselDataComponents.CHISEL_MODE, ChiselModes.SINGLE.value()));
    }

    @Override
    public boolean isValid(Player player, ItemStack stack, List<ChiselMode> choices) {
        return supports(stack) && choices.equals(choices(player));
    }

    @Override
    public void commit(Player player, InteractionHand hand, ChiselMode choice) {
        player.getItemInHand(hand).set(ChiselDataComponents.CHISEL_MODE, choice);
        Objects.requireNonNull(Minecraft.getInstance().getConnection()).send(new ChiselModeChangePacket(hand, choice));
    }
}
