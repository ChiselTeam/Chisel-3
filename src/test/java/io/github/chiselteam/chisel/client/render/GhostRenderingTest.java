package io.github.chiselteam.chisel.client.render;

import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

class GhostRenderingTest {
    @Test void allThreeSupportedPlayersReceiveGhostAppearance() {
        assertTrue(GhostAppearance.isGhost(GhostAppearance.CRICKET_UUID));
        assertTrue(GhostAppearance.isGhost(GhostAppearance.CEBULARZ_UUID));
        assertTrue(GhostAppearance.isGhost(GhostAppearance.JOSHY_UUID));
        assertFalse(GhostAppearance.isGhost(new UUID(0, 0)));
        assertFalse(GhostAppearance.isGhost(null));
    }
    @Test void spectatorsAndUnmarkedStatesAreNotGhosts() {
        var state = new AvatarRenderState();
        assertFalse(GhostAppearance.appliesTo(state));
        state.setRenderData(GhostAppearance.GHOST, true);
        assertTrue(GhostAppearance.appliesTo(state));
        state.isSpectator = true;
        assertFalse(GhostAppearance.appliesTo(state));
        assertFalse(GhostAppearance.appliesTo(new Object()));
    }
    @Test void fadePreservesColorAndScalesExistingAlpha() {
        assertEquals(0xBF123456, GhostAppearance.fade(0xFF123456));
        assertEquals(0x60123456, GhostAppearance.fade(0x80123456));
        assertEquals(0x00123456, GhostAppearance.fade(0x00123456));
    }
    @Test void ghostSkinAndEquipmentShareTheSafeOrderedModelPass() {
        var texture = net.minecraft.resources.Identifier.withDefaultNamespace("textures/entity/equipment/humanoid/iron.png");
        assertTrue(GhostRenderTypes.skin(texture).forceSolidModelPhase());
        assertTrue(GhostRenderTypes.armor(texture, false).forceSolidModelPhase());
        assertTrue(GhostRenderTypes.armor(texture, true).forceSolidModelPhase());
        assertTrue(GhostRenderTypes.armorTrim(texture, false).forceSolidModelPhase());
        assertTrue(GhostRenderTypes.armorTrim(texture, true).forceSolidModelPhase());
        assertTrue(GhostRenderTypes.ARMOR_GLINT.forceSolidModelPhase());
    }
}
