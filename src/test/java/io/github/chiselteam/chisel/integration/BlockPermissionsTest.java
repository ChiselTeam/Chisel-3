package io.github.chiselteam.chisel.integration;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Abilities;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.fml.ModList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BlockPermissionsTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }

    private final BlockPos pos = new BlockPos(4, 64, 9);
    private Level level;
    private Player player;
    private ItemStack stack;
    private Abilities abilities;

    @BeforeEach void setup() {
        level = mock(Level.class);
        player = mock(Player.class);
        stack = mock(ItemStack.class);
        abilities = new Abilities();
        abilities.mayBuild = true;
        when(player.getAbilities()).thenReturn(abilities);
        when(level.hasChunkAt(pos)).thenReturn(true);
        when(level.mayInteract(player, pos)).thenReturn(true);
        when(player.mayUseItemAt(pos, Direction.UP, stack)).thenReturn(true);
    }

    private boolean canEdit() {
        return BlockPermissions.canEdit(player, level, pos, InteractionHand.MAIN_HAND, stack);
    }

    @Test void rejectsMissingPlayerWithoutConsultingWorld() {
        assertFalse(BlockPermissions.canEdit(null, level, pos, InteractionHand.MAIN_HAND, stack));
        verifyNoInteractions(level);
    }

    @Test void rejectsSpectators() {
        when(player.isSpectator()).thenReturn(true);
        assertFalse(canEdit());
        verifyNoInteractions(level);
    }

    @Test void rejectsPlayersWhoCannotBuild() {
        abilities.mayBuild = false;
        assertFalse(canEdit());
        verifyNoInteractions(level);
    }

    @Test void rejectsUnloadedPositionsBeforeInteractionChecks() {
        when(level.hasChunkAt(pos)).thenReturn(false);
        assertFalse(canEdit());
        verify(level, never()).mayInteract(any(), any());
    }

    @Test void respectsWorldInteractionRestrictions() {
        when(level.mayInteract(player, pos)).thenReturn(false);
        assertFalse(canEdit());
    }

    @Test void respectsItemUseRestrictions() {
        when(player.mayUseItemAt(pos, Direction.UP, stack)).thenReturn(false);
        assertFalse(canEdit());
    }

    @Test void allowsVanillaAuthorizedPlayerWhenFtbChunksIsAbsent() {
        try (var mods = mockStatic(ModList.class)) {
            var modList = mock(ModList.class);
            mods.when(ModList::get).thenReturn(modList);
            assertTrue(canEdit());
            verify(modList).isLoaded("ftbchunks");
        }
    }

    @Test void rejectsNonServerPlayersWhenFtbChunksIsPresent() {
        try (var mods = mockStatic(ModList.class)) {
            var modList = mock(ModList.class);
            mods.when(ModList::get).thenReturn(modList);
            when(modList.isLoaded("ftbchunks")).thenReturn(true);
            assertFalse(canEdit());
        }
    }

    @Test void unsupportedFtbInstallationDeniesServerPlayerAndOwnerlessProjectile() {
        var serverPlayer = mock(ServerPlayer.class);
        when(serverPlayer.getAbilities()).thenReturn(abilities);
        when(level.mayInteract(serverPlayer, pos)).thenReturn(true);
        when(serverPlayer.mayUseItemAt(pos, Direction.UP, stack)).thenReturn(true);
        try (var mods = mockStatic(ModList.class)) {
            var modList = mock(ModList.class);
            mods.when(ModList::get).thenReturn(modList);
            when(modList.isLoaded("ftbchunks")).thenReturn(true);
            assertFalse(BlockPermissions.canEdit(serverPlayer, level, pos, InteractionHand.OFF_HAND, stack));
            assertFalse(BlockPermissions.canProjectileEdit(null, level, pos, stack));
        }
    }

    @Test void ownerlessProjectilesWorkWithoutFtbAndPlayerOwnersUsePermissions() {
        try (var mods = mockStatic(ModList.class)) {
            mods.when(ModList::get).thenReturn(mock(ModList.class));
            assertTrue(BlockPermissions.canProjectileEdit(null, level, pos, stack));
            when(player.isSpectator()).thenReturn(true);
            assertFalse(BlockPermissions.canProjectileEdit(player, level, pos, stack));
        }
    }
}
