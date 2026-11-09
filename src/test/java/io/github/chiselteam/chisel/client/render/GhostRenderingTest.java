package io.github.chiselteam.chisel.client.render;

import com.google.gson.JsonParser;
import net.minecraft.SharedConstants;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.server.Bootstrap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GhostRenderingTest {
    @BeforeAll static void bootstrap() {
        SharedConstants.tryDetectVersion();
        Bootstrap.bootStrap();
    }

    @Test void fadesOnlyAlphaAndKeepsExistingTransparency() {
        assertEquals(0xBF123456, GhostAppearance.fade(0xFF123456));
        assertEquals(0x60123456, GhostAppearance.fade(0x80123456));
        assertEquals(0x00123456, GhostAppearance.fade(0x00123456));
    }

    @Test void preservesSourceJoshyOnlyMembershipAndSpectatorExclusion() {
        AbstractClientPlayer player = mock(AbstractClientPlayer.class);
        when(player.getUUID()).thenReturn(GhostAppearance.JOSHY_UUID);
        assertTrue(GhostAppearance.appliesTo(player));
        when(player.isSpectator()).thenReturn(true);
        assertFalse(GhostAppearance.appliesTo(player));
        when(player.isSpectator()).thenReturn(false);
        for (UUID id : new UUID[] {GhostAppearance.CRICKET_UUID, GhostAppearance.CEBULARZ_UUID, new UUID(0, 0)}) {
            when(player.getUUID()).thenReturn(id);
            assertFalse(GhostAppearance.appliesTo(player));
        }
        assertFalse(GhostAppearance.appliesTo(null));
        assertFalse(GhostAppearance.appliesTo(new Object()));
    }

    @Test void everyGhostInjectionMatches1211TargetBytecode() throws IOException {
        // Read actual runtime artifacts without loading client-only classes in the server-sided JUnit launcher.
        // This verifies target descriptors and invocation sites, not runtime Mixin application or rendering.
        int injections = verifyInjectionSites("GhostPlayerRendererMixin",
                "net/minecraft/client/renderer/entity/LivingEntityRenderer");
        injections += verifyInjectionSites("GhostEquipmentRendererMixin",
                "net/minecraft/client/renderer/entity/layers/HumanoidArmorLayer");
        assertEquals(8, injections, "Every ghost injection must be covered by this compatibility check");
    }

    private static int verifyInjectionSites(String mixinName, String targetName) throws IOException {
        ClassNode mixin = classBytes("io/github/chiselteam/chisel/mixin/client/" + mixinName);
        ClassNode target = classBytes(targetName);
        int checked = 0;
        for (MethodNode handler : mixin.methods) {
            if (handler.visibleAnnotations == null) continue;
            for (AnnotationNode annotation : handler.visibleAnnotations) {
                Object methodSelectors = annotationValue(annotation, "method");
                if (methodSelectors == null) continue;
                assertInstanceOf(List.class, methodSelectors, handler.name);
                for (Object selectorObject : (List<?>) methodSelectors) {
                    String selector = (String) selectorObject;
                    int descriptorStart = selector.indexOf('(');
                    String name = descriptorStart < 0 ? selector : selector.substring(0, descriptorStart);
                    String descriptor = descriptorStart < 0 ? null : selector.substring(descriptorStart);
                    List<MethodNode> methods = target.methods.stream()
                            .filter(method -> method.name.equals(name) && (descriptor == null || method.desc.equals(descriptor)))
                            .toList();
                    assertFalse(methods.isEmpty(), mixinName + "." + handler.name + " missing target " + selector);
                    Object at = annotationValue(annotation, "at");
                    if (at instanceof List<?> locations) {
                        for (Object location : locations) verifyInvocation(methods, (AnnotationNode) location, handler.name);
                    } else if (at instanceof AnnotationNode location) {
                        verifyInvocation(methods, location, handler.name);
                    }
                }
                checked++;
            }
        }
        return checked;
    }

    private static void verifyInvocation(List<MethodNode> methods, AnnotationNode at, String handler) {
        if (!"INVOKE".equals(annotationValue(at, "value"))) return;
        String target = (String) annotationValue(at, "target");
        assertNotNull(target, handler);
        int ownerEnd = target.indexOf(';');
        int descriptorStart = target.indexOf('(', ownerEnd);
        String owner = target.substring(1, ownerEnd);
        String name = target.substring(ownerEnd + 1, descriptorStart);
        String descriptor = target.substring(descriptorStart);
        int matches = 0;
        for (MethodNode method : methods) {
            for (var instruction : method.instructions) {
                if (instruction instanceof MethodInsnNode call && call.owner.equals(owner)
                        && call.name.equals(name) && call.desc.equals(descriptor)) matches++;
            }
        }
        assertTrue(matches >= 1, handler + " missing required invocation " + target);
    }

    private static Object annotationValue(AnnotationNode annotation, String name) {
        if (annotation.values == null) return null;
        for (int index = 0; index < annotation.values.size(); index += 2) {
            if (name.equals(annotation.values.get(index))) return annotation.values.get(index + 1);
        }
        return null;
    }

    private static ClassNode classBytes(String name) throws IOException {
        try (var input = GhostRenderingTest.class.getClassLoader().getResourceAsStream(name + ".class")) {
            assertNotNull(input, name);
            ClassNode node = new ClassNode();
            new ClassReader(input).accept(node, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
            return node;
        }
    }

    @Test void glintShaderUses1211VertexInterfaceAndFixedImports() throws IOException {
        var shader = JsonParser.parseString(resource("assets/chisel/shaders/core/ghost_glint.json")).getAsJsonObject();
        assertEquals("rendertype_armor_entity_glint", shader.get("vertex").getAsString());
        assertEquals("chisel:ghost_glint", shader.get("fragment").getAsString());
        String fragment = resource("assets/chisel/shaders/core/ghost_glint.fsh");
        assertTrue(fragment.startsWith("#version 150"));
        assertTrue(fragment.contains("#moj_import <fog.glsl>"));
        assertTrue(fragment.contains("in float vertexDistance;"));
        assertTrue(fragment.contains("linear_fog_fade(vertexDistance, FogStart, FogEnd)"));
        assertTrue(fragment.contains("sqrt(" + GhostAppearance.OPACITY + ")"));
        assertFalse(fragment.contains("dynamictransforms.glsl"));
    }

    private static String resource(String path) throws IOException {
        try (var input = GhostRenderingTest.class.getClassLoader().getResourceAsStream(path)) {
            assertNotNull(input, path);
            return new String(input.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
