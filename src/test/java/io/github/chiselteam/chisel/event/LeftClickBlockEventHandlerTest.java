package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.family.VariantFamilyLookup;
import io.github.chiselteam.chisel.registry.ChiselItemAbilities;
import net.minecraft.SharedConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.RegistryAccess;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class LeftClickBlockEventHandlerTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }
    @Test void clientChiselClickCancelsMiningWithoutChangingWorld() {
        verifyClientClick(true);
    }
    @Test void clientCanStillMineBlocksWithoutAChiselFamily() {
        verifyClientClick(false);
    }
    private void verifyClientClick(boolean chiselable) {
        var event = mock(PlayerInteractEvent.LeftClickBlock.class);
        var level = mock(Level.class);
        var player = mock(Player.class);
        var stack = mock(ItemStack.class);
        var state = mock(BlockState.class);
        var block = mock(Block.class);
        var registries = mock(RegistryAccess.class);
        when(event.getLevel()).thenReturn(level);
        when(event.getPos()).thenReturn(BlockPos.ZERO);
        when(event.getEntity()).thenReturn(player);
        when(event.getItemStack()).thenReturn(stack);
        when(stack.canPerformAction(ChiselItemAbilities.CHISEL)).thenReturn(true);
        when(level.isClientSide()).thenReturn(true);
        when(level.getBlockState(BlockPos.ZERO)).thenReturn(state);
        when(level.registryAccess()).thenReturn(registries);
        when(state.getBlock()).thenReturn(block);
        try (var families = mockStatic(VariantFamilyLookup.class)) {
            families.when(() -> VariantFamilyLookup.getFamilyForBlock(block, registries))
                    .thenReturn(chiselable ? mock(VariantFamily.class) : null);
            LeftClickBlockEventHandler.onHitBlock(event);
        }
        verify(event, chiselable ? times(1) : never()).setCanceled(true);
        verify(level, never()).setBlockAndUpdate(any(), any());
        verifyNoInteractions(player);
    }
}
