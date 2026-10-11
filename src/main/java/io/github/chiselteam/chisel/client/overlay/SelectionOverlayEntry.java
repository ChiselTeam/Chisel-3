package io.github.chiselteam.chisel.client.overlay;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public record SelectionOverlayEntry(Component label, ItemStack icon) {
    public SelectionOverlayEntry {
        icon = icon.copy();
    }
}
