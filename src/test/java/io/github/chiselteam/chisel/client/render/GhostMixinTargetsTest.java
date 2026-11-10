package io.github.chiselteam.chisel.client.render;

import org.junit.jupiter.api.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GhostMixinTargetsTest {
    @Test void playerMixinMatchesCurrentMinecraftBytecode() throws Exception {
        verifyTargets("GhostPlayerRendererMixin", "net/minecraft/client/renderer/entity/LivingEntityRenderer");
    }
    @Test void equipmentMixinMatchesAllThreeArmorSubmissions() throws Exception {
        verifyTargets("GhostEquipmentRendererMixin", "net/minecraft/client/renderer/entity/layers/EquipmentLayerRenderer");
    }
    private static ClassNode readClass(String name) throws IOException {
        try (var input = GhostMixinTargetsTest.class.getClassLoader().getResourceAsStream(name + ".class")) {
            assertNotNull(input, name);
            var node = new ClassNode();
            new ClassReader(input).accept(node, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
            return node;
        }
    }
    private static Object value(AnnotationNode annotation, String key) {
        if (annotation.values != null) for (int i = 0; i < annotation.values.size(); i += 2) {
            if (key.equals(annotation.values.get(i))) return annotation.values.get(i + 1);
        }
        return null;
    }
    private static void verifyTargets(String mixin, String vanilla) throws Exception {
        var target = readClass(vanilla);
        var source = readClass("io/github/chiselteam/chisel/mixin/client/" + mixin);
        int checked = 0;
        for (var method : source.methods) {
            var annotations = new ArrayList<AnnotationNode>();
            if (method.visibleAnnotations != null) annotations.addAll(method.visibleAnnotations);
            if (method.invisibleAnnotations != null) annotations.addAll(method.invisibleAnnotations);
            for (var annotation : annotations) {
                if (!annotation.desc.endsWith("/ModifyArgs;") && !annotation.desc.endsWith("/WrapOperation;")) continue;
                @SuppressWarnings("unchecked") var selectors = (List<String>) value(annotation, "method");
                Object atValue = value(annotation, "at");
                var at = atValue instanceof List<?> list ? (AnnotationNode) list.getFirst() : (AnnotationNode) atValue;
                String invocation = (String) value(at, "target");
                int ownerEnd = invocation.indexOf(';');
                int descriptorStart = invocation.indexOf('(', ownerEnd);
                String owner = invocation.substring(1, ownerEnd);
                String name = invocation.substring(ownerEnd + 1, descriptorStart);
                String descriptor = invocation.substring(descriptorStart);
                int found = 0;
                for (var candidate : target.methods) {
                    boolean selected = selectors.stream().anyMatch(selector -> selector.endsWith("*")
                            ? candidate.name.startsWith(selector.substring(0, selector.length() - 1))
                            : selector.equals(candidate.name + candidate.desc) || selector.equals(candidate.name));
                    if (!selected) continue;
                    for (var instruction : candidate.instructions) {
                        if (instruction instanceof MethodInsnNode call && call.owner.equals(owner)
                                && call.name.equals(name) && call.desc.equals(descriptor)) found++;
                    }
                }
                Object requirement = value(annotation, "require");
                int minimum = requirement instanceof Integer count ? count : 1;
                assertTrue(found >= minimum, mixin + "." + method.name + " requires " + minimum + " targets but found " + found);
                checked++;
            }
        }
        assertTrue(checked > 0, "No injection targets checked for " + mixin);
    }
}
