package io.github.chiselteam.chisel.integration;

import net.minecraft.SharedConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.neoforged.fml.ModList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InventoryAccessTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }
    @Test void worldRestrictionDeniesAccess() {
        var level = mock(Level.class);
        assertFalse(InventoryAccess.canAccess(mock(Player.class), level, BlockPos.ZERO));
        verify(level, never()).getBlockEntity(any());
    }
    @Test void lockedContainerCannotBeBypassed() {
        var level = mock(Level.class);
        var player = mock(Player.class);
        when(level.mayInteract(player, BlockPos.ZERO)).thenReturn(true);
        var container = mock(BaseContainerBlockEntity.class);
        when(level.getBlockEntity(BlockPos.ZERO)).thenReturn(container);
        assertFalse(InventoryAccess.canAccess(player, level, BlockPos.ZERO));
    }
    @Test void unsupportedFtbInstallationDeniesInventoryAccess() {
        var level = mock(Level.class);
        var player = mock(Player.class);
        when(level.mayInteract(player, BlockPos.ZERO)).thenReturn(true);
        try (var mods = mockStatic(ModList.class)) {
            var modList = mock(ModList.class);
            mods.when(ModList::get).thenReturn(modList);
            when(modList.isLoaded("ftbchunks")).thenReturn(true);
            assertFalse(InventoryAccess.canAccess(player, level, BlockPos.ZERO));
        }
    }
    @Test void doubleChestChecksBothLoadedHalvesAndTheirPermissions() {
        var level = mock(Level.class);
        var player = mock(Player.class);
        var state = Blocks.CHEST.defaultBlockState().setValue(ChestBlock.TYPE, ChestType.LEFT);
        var other = BlockPos.ZERO.relative(ChestBlock.getConnectedDirection(state));
        when(level.mayInteract(player, BlockPos.ZERO)).thenReturn(true);
        when(level.getBlockState(BlockPos.ZERO)).thenReturn(state);
        try (var mods = mockStatic(ModList.class)) {
            mods.when(ModList::get).thenReturn(mock(ModList.class));
            assertFalse(InventoryAccess.canAccess(player, level, BlockPos.ZERO));
            when(level.hasChunkAt(other)).thenReturn(true);
            assertFalse(InventoryAccess.canAccess(player, level, BlockPos.ZERO));
            when(level.mayInteract(player, other)).thenReturn(true);
            assertTrue(InventoryAccess.canAccess(player, level, BlockPos.ZERO));
        }
    }
}
