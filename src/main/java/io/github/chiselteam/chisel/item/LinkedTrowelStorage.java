package io.github.chiselteam.chisel.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public interface LinkedTrowelStorage {
    ItemStack find(Item item);

    boolean extract(ItemStack stack);

    void refund(ItemStack stack);
}
