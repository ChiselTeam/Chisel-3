package io.github.chiselteam.chisel.client.overlay;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public interface SelectionProvider<T> {
    boolean supports(ItemStack stack);

    List<T> choices(Player player);

    SelectionOverlayEntry entry(T choice);

    int selectedIndex(Player player, ItemStack stack, List<T> choices);

    boolean isValid(Player player, ItemStack stack, List<T> choices);

    void commit(Player player, InteractionHand hand, T choice);
}
