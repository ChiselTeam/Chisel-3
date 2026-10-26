package io.github.chiselteam.chisel.menu;

import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import io.github.chiselteam.chisel.registry.ChiselItems;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AutoChiselContainerWrapper extends SidedInvWrapper {
    private final AutoChiselBlockEntity blockEntity;

    public AutoChiselContainerWrapper(AutoChiselBlockEntity blockEntity, @Nullable Direction side) {
        super(blockEntity, side == null ? Direction.UP : side);
        this.blockEntity = blockEntity;
    }

    private boolean automationEnabled() {
        return blockEntity.getItem(AutoChiselBlockEntity.AUTOMATION_UPGRADE_SLOT).is(ChiselItems.UPGRADE_AUTOMATION.get());
    }

    @Override
    public @NotNull ItemStack insertItem(int slot, @NotNull ItemStack stack, boolean simulate) {
        return automationEnabled() ? super.insertItem(slot, stack, simulate) : stack;
    }

    @Override
    public @NotNull ItemStack extractItem(int slot, int amount, boolean simulate) {
        return automationEnabled() ? super.extractItem(slot, amount, simulate) : ItemStack.EMPTY;
    }
}
