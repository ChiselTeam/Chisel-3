package chisel.core.ctm.util;

import chisel.core.ctm.ConnectedTextureBlockModelPart;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;

import java.util.*;

public final class CTMPartBuilder {

    private CTMPartBuilder() {}

    public static ConnectedTextureBlockModelPart create(Map<Direction, BakedQuad[]> bakedQuads, Set<Direction> unculledFaces, Material.Baked particleMaterial, FaceQuadAppender appender) {
        Map<Direction, List<BakedQuad>> quadsMap = new EnumMap<>(Direction.class);
        List<BakedQuad> unculled = new ArrayList<>();
        int flags = 0;

        for(Direction face : Direction.values()) {
            List<BakedQuad> faceQuads = new ArrayList<>(8);
            appendBaseQuads(bakedQuads.get(face), faceQuads);
            appender.append(face, faceQuads);

            for(BakedQuad quad : faceQuads) {
                flags |= quad.materialInfo().flags();
            }

            List<BakedQuad> immutableQuads = Collections.unmodifiableList(faceQuads);
            quadsMap.put(face, immutableQuads);

            if(unculledFaces.contains(face)) {
                unculled.addAll(faceQuads);
            }
        }

        return new ConnectedTextureBlockModelPart(quadsMap, List.copyOf(unculled), flags, particleMaterial);
    }

    public static void appendIndexedQuad(BakedQuad[] quads, int index, List<BakedQuad> faceQuads) {
        if (quads == null || index < 0 || index >= quads.length) {
            return;
        }

        BakedQuad quad = quads[index];
        if (quad != null) {
            faceQuads.add(quad);
        }
    }

    private static void appendBaseQuads(BakedQuad[] base, List<BakedQuad> faceQuads) {
        if(base == null) return;

        for(BakedQuad quad : base) {
            if(quad != null) faceQuads.add(quad);
        }
    }
}
