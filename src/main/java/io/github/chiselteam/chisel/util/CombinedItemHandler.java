package io.github.chiselteam.chisel.util;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import org.jetbrains.annotations.NotNull;
/** Combines sided handlers without requiring direct slot mutation. */
public final class CombinedItemHandler implements IItemHandler {
    private final IItemHandler first, second;
    public CombinedItemHandler(IItemHandler first, IItemHandler second) { this.first=first; this.second=second; }
    private IItemHandler handler(int slot) { if (slot < 0 || slot >= getSlots()) throw new IndexOutOfBoundsException(slot); return slot < first.getSlots() ? first : second; }
    private int index(int slot) { return slot < first.getSlots() ? slot : slot-first.getSlots(); }
    @Override public int getSlots() { return first.getSlots()+second.getSlots(); }
    @Override public @NotNull ItemStack getStackInSlot(int slot) { return handler(slot).getStackInSlot(index(slot)); }
    @Override public @NotNull ItemStack insertItem(int slot, @NotNull ItemStack stack, boolean simulate) { return handler(slot).insertItem(index(slot), stack, simulate); }
    @Override public @NotNull ItemStack extractItem(int slot, int amount, boolean simulate) { return handler(slot).extractItem(index(slot), amount, simulate); }
    @Override public int getSlotLimit(int slot) { return handler(slot).getSlotLimit(index(slot)); }
    @Override public boolean isItemValid(int slot, @NotNull ItemStack stack) { return handler(slot).isItemValid(index(slot), stack); }
}
