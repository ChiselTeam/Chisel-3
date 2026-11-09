package io.github.chiselteam.chisel.menu.slot;

import net.minecraft.world.Container;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UpgradeSlotTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }

    @Test void onlyAcceptsItsAssignedUpgrade() {
        var upgrade = mock(Item.class);
        var slot = new UpgradeSlot(mock(Container.class), 0, 0, 0, 1, () -> upgrade);
        var matching = mock(ItemStack.class);
        when(matching.is(upgrade)).thenReturn(true);
        assertTrue(slot.mayPlace(matching));
        assertFalse(slot.mayPlace(mock(ItemStack.class)));
    }

    @Test void preservesSingleUpgradeAndStackableSpeedCaps() {
        var container = mock(Container.class);
        var upgrade = mock(Item.class);
        assertEquals(1, new UpgradeSlot(container, 0, 0, 0, 1, () -> upgrade).getMaxStackSize());
        assertEquals(64, new UpgradeSlot(container, 0, 0, 0, 64, () -> upgrade).getMaxStackSize());
    }
}
