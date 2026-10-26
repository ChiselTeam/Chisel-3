package io.github.chiselteam.chisel.menu.slot;

import io.github.chiselteam.chisel.menu.ChiselSelectionInventory;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class SelectionSlot extends Slot {

    public SelectionSlot(ChiselSelectionInventory selectionInventory, int slot, int x, int y) {
        super(selectionInventory, slot, x, y);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        return false;
    }

    @Override
    public boolean mayPickup(net.minecraft.world.entity.player.@NotNull Player player) {
        return false;
    }

    @Override
    public boolean isFake() {
        return true;
    }
}
