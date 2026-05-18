package chisel.lib.ctm.util;

import chisel.lib.ctm.geometry.MultiblockCTMKey;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.Direction;

import java.util.List;

@FunctionalInterface
public interface MultiblockQuadSelector {
    void append(MultiblockCTMKey key, Direction side, List<BakedQuad> faceQuads);
}
