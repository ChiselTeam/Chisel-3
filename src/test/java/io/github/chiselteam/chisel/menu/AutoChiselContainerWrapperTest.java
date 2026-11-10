package io.github.chiselteam.chisel.menu;

import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import net.minecraft.SharedConstants;
import net.minecraft.core.Direction;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.transfer.item.ItemResource;
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

    private ItemResource snowballs() {
        var stack = mock(ItemStack.class);
        when(stack.getMaxStackSize()).thenReturn(16);
        var resource = mock(ItemResource.class);
        when(resource.toStack()).thenReturn(stack);
        return resource;
    }

    @Test void topAndNullSideExposeSingleItemChiselSlot() {
        var machine = machine();
        assertEquals(1, new AutoChiselContainerWrapper(machine, Direction.UP).getCapacityAsLong(0, snowballs()));
        assertEquals(1, new AutoChiselContainerWrapper(machine, null).getCapacityAsLong(0, snowballs()));
    }

    @Test void sideAndOutputSlotsRespectActualInventoryStackLimit() {
        var machine = machine();
        assertEquals(16, new AutoChiselContainerWrapper(machine, Direction.NORTH).getCapacityAsLong(0, snowballs()));
        assertEquals(16, new AutoChiselContainerWrapper(machine, Direction.DOWN).getCapacityAsLong(0, snowballs()));
    }

    @Test void outOfRangeCapabilitySlotsHaveZeroCapacity() {
        var machine = machine();
        var top = new AutoChiselContainerWrapper(machine, Direction.UP);
        assertEquals(0, top.getCapacityAsLong(-1, ItemResource.EMPTY));
        assertEquals(0, top.getCapacityAsLong(1, ItemResource.EMPTY));
        assertEquals(0, new AutoChiselContainerWrapper(machine, Direction.DOWN).getCapacityAsLong(12, ItemResource.EMPTY));
    }
}
