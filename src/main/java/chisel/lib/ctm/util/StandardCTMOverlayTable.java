package chisel.lib.ctm.util;

import chisel.lib.ctm.logic.CTMLogic;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.Direction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class StandardCTMOverlayTable {

    private static final int LOGIC_COUNT = CTMLogic.values().length;
    private static final int PATTERN_COUNT = LOGIC_COUNT * LOGIC_COUNT * LOGIC_COUNT * LOGIC_COUNT;

    private final List<BakedQuad>[][] overlays;

    @SuppressWarnings("unchecked")
    public StandardCTMOverlayTable(Map<Direction, BakedQuad[][]> connectedQuads) {
        this.overlays = new List[Direction.values().length][PATTERN_COUNT];

        for(Direction face : Direction.values()) {
            BakedQuad[][] faceQuads = connectedQuads.get(face);

            for(int pattern = 0; pattern < PATTERN_COUNT; pattern++) {
                overlays[face.get3DDataValue()][pattern] = buildPattern(faceQuads, pattern);
            }
        }
    }

    public List<BakedQuad> get(Direction face, int pattern) {
        return overlays[face.get3DDataValue()][pattern];
    }

    private static List<BakedQuad> buildPattern(BakedQuad[][] faceQuads, int pattern) {
        if(faceQuads == null) return List.of();

        List<BakedQuad> result = new ArrayList<>(4);
        int remaining = pattern;

        for(int corner = 0; corner < 4; corner++) {
            int logic = remaining % LOGIC_COUNT;
            remaining /= LOGIC_COUNT;

            if(corner >= faceQuads.length || faceQuads[corner] == null) continue;

            BakedQuad[] cornerQuads = faceQuads[corner];
            if(logic >= cornerQuads.length) continue;

            BakedQuad quad = cornerQuads[logic];
            if(quad != null) result.add(quad);
        }

        if(result.isEmpty()) return List.of();
        return Collections.unmodifiableList(result);
    }

    static {
        //noinspection ConstantValue
        if (CTMLogic.NONE.ordinal() != 0) {
            throw new IllegalStateException("CTMLogic.NONE must have ordinal 0 for standard CTM pattern lookup");
        }
    }
}
