package io.github.chiselteam.chisel.integration;

import appeng.api.config.Actionable;
import appeng.api.networking.security.IActionSource;
import appeng.api.parts.IPartHost;
import appeng.api.stacks.AEItemKey;
import appeng.api.storage.StorageHelper;
import appeng.parts.reporting.AbstractTerminalPart;
import io.github.chiselteam.chisel.item.LinkedTrowelStorage;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import javax.annotation.Nullable;

public final class AE2TrowelStorage {
    private AE2TrowelStorage() {
    }

    public static boolean isTerminal(BlockEntity entity, @Nullable Direction face) {
        return face != null && entity instanceof IPartHost host && host.getPart(face) instanceof AbstractTerminalPart;
    }

    public static @Nullable LinkedTrowelStorage resolve(BlockEntity entity, @Nullable Direction face, Player player) {
        if (face == null || !(entity instanceof IPartHost host) || !(host.getPart(face) instanceof AbstractTerminalPart terminal)) return null;
        var node = terminal.getGridNode();
        if (node == null || !node.isActive()) return null;
        var grid = node.getGrid();
        var inventory = terminal.getInventory();
        var source = IActionSource.ofPlayer(player, terminal);
        return new LinkedTrowelStorage() {
            @Override
            public ItemStack find(Item item) {
                for (var entry : inventory.getAvailableStacks()) {
                    if (entry.getKey() instanceof AEItemKey key && key.getItem() == item
                            && StorageHelper.poweredExtraction(grid.getEnergyService(), inventory, key, 1, source, Actionable.SIMULATE) == 1)
                        return key.toStack(1);
                }
                return ItemStack.EMPTY;
            }

            @Override
            public boolean extract(ItemStack stack) {
                return node.isActive() && StorageHelper.poweredExtraction(grid.getEnergyService(), inventory, AEItemKey.of(stack), 1, source) == 1;
            }

            @Override
            public void refund(ItemStack stack) {
                var returned = inventory.insert(AEItemKey.of(stack), stack.getCount(), Actionable.MODULATE, source);
                stack.shrink((int) returned);
                // A full/disconnected network must never destroy the reserved item.
                if (!stack.isEmpty() && !player.getInventory().add(stack)) player.drop(stack, false);
            }
        };
    }
}
