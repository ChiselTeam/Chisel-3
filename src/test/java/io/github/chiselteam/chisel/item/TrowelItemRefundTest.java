package io.github.chiselteam.chisel.item;

import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrowelItemRefundTest {
    @BeforeAll
    static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }

    @Test
    void returnsReservedItemToOriginalSlotExactlyOnce() throws Exception {
        var inventory = new ItemStackHandler(2);
        inventory.setStackInSlot(0, new ItemStack(Items.STONE, 3));
        var reserved = inventory.extractItem(0, 1, false);
        refund(inventory, 0, reserved);
        assertEquals(3, inventory.getStackInSlot(0).getCount());
        assertTrue(inventory.getStackInSlot(1).isEmpty());
    }

    @Test
    void returnsToAnotherSlotWhenOriginalSlotChangesDuringPlacement() throws Exception {
        var inventory = new ItemStackHandler(2);
        inventory.setStackInSlot(0, new ItemStack(Items.STONE));
        var reserved = inventory.extractItem(0, 1, false);
        inventory.setStackInSlot(0, new ItemStack(Items.DIRT, 64));
        refund(inventory, 0, reserved);
        assertTrue(inventory.getStackInSlot(0).is(Items.DIRT));
        assertEquals(64, inventory.getStackInSlot(0).getCount());
        assertTrue(inventory.getStackInSlot(1).is(Items.STONE));
        assertEquals(1, inventory.getStackInSlot(1).getCount());
    }

    @Test
    void consumedMaterialIsNotRefunded() throws Exception {
        var inventory = new ItemStackHandler(1);
        inventory.setStackInSlot(0, new ItemStack(Items.STONE, 3));
        var reserved = inventory.extractItem(0, 1, false);
        reserved.shrink(1);
        refund(inventory, 0, reserved);
        assertEquals(2, inventory.getStackInSlot(0).getCount());
    }

    private static void refund(IItemHandler inventory, int slot, ItemStack material) throws Exception {
        var method = TrowelItem.class.getDeclaredMethod("refundMaterial", IItemHandler.class, int.class,
                ItemStack.class, Player.class);
        method.setAccessible(true);
        // These cases must be satisfied by the source and never need the player/drop fallback.
        method.invoke(null, inventory, slot, material, null);
    }
}