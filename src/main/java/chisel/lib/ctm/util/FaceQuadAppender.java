package chisel.lib.ctm.util;

import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.Direction;

import java.util.List;

@FunctionalInterface
public interface FaceQuadAppender {
    void append(Direction side, List<BakedQuad> faceQuads);
}
