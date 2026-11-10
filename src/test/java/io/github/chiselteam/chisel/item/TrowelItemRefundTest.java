package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.palette.Candidate;
import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TrowelItemRefundTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }

    @Test void rejectedPlacementRefundsExactlyOneReservedItem() throws Exception {
        var source = mock(LinkedTrowelStorage.class);
        when(source.extract(any())).thenReturn(true);
        var context = mock(UseOnContext.class); // Missing player rejects placement.
        assertEquals(InteractionResult.FAIL, place(source, context));
        var reserved = org.mockito.ArgumentCaptor.forClass(ItemStack.class);
        verify(source).extract(reserved.capture());
        verify(source).refund(same(reserved.getValue()));
        assertTrue(reserved.getValue().is(Items.STONE));
        assertEquals(1, reserved.getValue().getCount());
        verifyNoMoreInteractions(source);
    }

    @Test void failedExtractionDoesNotPlaceOrRefundUnreservedMaterial() throws Exception {
        var source = mock(LinkedTrowelStorage.class);
        var context = mock(UseOnContext.class);
        when(context.getPlayer()).thenReturn(mock(Player.class));
        assertEquals(InteractionResult.FAIL, place(source, context));
        verify(source).extract(any());
        verify(source, never()).refund(any());
        verify(context, never()).getLevel();
    }

    @Test void placementExceptionStillRefundsReservedMaterial() {
        var source = mock(LinkedTrowelStorage.class);
        when(source.extract(any())).thenReturn(true);
        var context = mock(UseOnContext.class);
        when(context.getPlayer()).thenThrow(new IllegalStateException("interrupted placement"));
        var exception = assertThrows(InvocationTargetException.class, () -> place(source, context));
        assertInstanceOf(IllegalStateException.class, exception.getCause());
        verify(source).refund(argThat(stack -> stack.is(Items.STONE) && stack.getCount() == 1));
    }

    private static InteractionResult place(LinkedTrowelStorage source, UseOnContext context) throws Exception {
        var trowel = mock(TrowelItem.class, CALLS_REAL_METHODS);
        var method = TrowelItem.class.getDeclaredMethod("placeFromNetwork", Candidate.class,
                LinkedTrowelStorage.class, UseOnContext.class);
        method.setAccessible(true);
        var candidate = mock(ItemStack.class);
        var reserved = mock(ItemStack.class);
        when(candidate.copyWithCount(1)).thenReturn(reserved);
        when(reserved.getCount()).thenReturn(1);
        when(reserved.is(Items.STONE)).thenReturn(true);
        return (InteractionResult) method.invoke(trowel, new Candidate(candidate, 1, -1), source, context);
    }
}
