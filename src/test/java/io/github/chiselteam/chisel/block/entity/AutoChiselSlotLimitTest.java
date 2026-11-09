package io.github.chiselteam.chisel.block.entity;

import net.minecraft.world.item.ItemStack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class AutoChiselSlotLimitTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }

    @Test void toolTemplateAndNonSpeedUpgradesHaveSingleItemLimits() {
        var machine = mock(AutoChiselBlockEntity.class, CALLS_REAL_METHODS);
        var stack = mock(ItemStack.class);
        for (int slot : new int[] {AutoChiselBlockEntity.CHISEL_SLOT, AutoChiselBlockEntity.TEMPLATE_SLOT,
                AutoChiselBlockEntity.STACK_UPGRADE_SLOT, AutoChiselBlockEntity.AUTOMATION_UPGRADE_SLOT,
                AutoChiselBlockEntity.REVERSION_UPGRADE_SLOT}) {
            assertEquals(1, machine.getSlotLimit(slot, stack), "slot " + slot);
        }
    }

    @Test void speedUpgradeAndOrdinarySlotsRespectStackSpecificLimits() {
        var machine = mock(AutoChiselBlockEntity.class, CALLS_REAL_METHODS);
        var stack = mock(ItemStack.class);
        doReturn(16).when(machine).getMaxStackSize(stack);
        for (int slot : new int[] {0, 14, AutoChiselBlockEntity.SPEED_UPGRADE_SLOT}) {
            assertEquals(16, machine.getSlotLimit(slot, stack), "slot " + slot);
        }
    }

    @Test void emptySpeedUpgradeSlotOffersContainerCapacity() {
        var machine = mock(AutoChiselBlockEntity.class, CALLS_REAL_METHODS);
        var stack = mock(ItemStack.class);
        when(stack.isEmpty()).thenReturn(true);
        assertEquals(64, machine.getSlotLimit(AutoChiselBlockEntity.SPEED_UPGRADE_SLOT, stack));
    }
}
