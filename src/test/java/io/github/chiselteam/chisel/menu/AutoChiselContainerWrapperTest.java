package io.github.chiselteam.chisel.menu;

import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import net.minecraft.SharedConstants;
import net.minecraft.core.Direction;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class AutoChiselContainerWrapperTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }

    private AutoChiselBlockEntity machine() {
        var machine = mock(AutoChiselBlockEntity.class, CALLS_REAL_METHODS);
        doReturn(ItemStack.EMPTY).when(machine).getItem(anyInt());
        return machine;
    }

    @Test void topAndNullSideExposeSingleItemChiselSlot() {
        var machine = machine();
        assertEquals(1, new AutoChiselContainerWrapper(machine, Direction.UP).getSlotLimit(0));
        assertEquals(1, new AutoChiselContainerWrapper(machine, null).getSlotLimit(0));
    }

    @Test void sideAndOutputSlotsRespectActualInventoryStackLimit() {
        var machine = machine();
        var snowballs = new ItemStack(Items.SNOWBALL);
        doReturn(snowballs).when(machine).getItem(0);
        doReturn(snowballs).when(machine).getItem(14);
        assertEquals(16, new AutoChiselContainerWrapper(machine, Direction.NORTH).getSlotLimit(0));
        assertEquals(16, new AutoChiselContainerWrapper(machine, Direction.DOWN).getSlotLimit(0));
    }

    @Test void outOfRangeCapabilitySlotsHaveZeroCapacity() {
        var machine = machine();
        var top = new AutoChiselContainerWrapper(machine, Direction.UP);
        assertEquals(0, top.getSlotLimit(-1));
        assertEquals(0, top.getSlotLimit(1));
        assertEquals(0, new AutoChiselContainerWrapper(machine, Direction.DOWN).getSlotLimit(12));
    }
}
