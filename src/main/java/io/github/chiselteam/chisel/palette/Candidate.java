package io.github.chiselteam.chisel.palette;

import net.minecraft.world.item.ItemStack;

public record Candidate(ItemStack material, int weight, int sourceSlot) {
}
