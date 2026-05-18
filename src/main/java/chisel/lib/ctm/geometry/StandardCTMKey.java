package chisel.lib.ctm.geometry;

import chisel.lib.ctm.logic.CTMLogic;
import net.minecraft.core.Direction;

public record StandardCTMKey(int down, int up, int north, int south, int west, int east) implements CTMGeometryKey {
    private static final int BITS_PER_CORNER = 3;
    private static final int CORNER_MASK = 0b111;

    private static final int LOGIC_COUNT = CTMLogic.values().length;
    private static final CTMLogic[] VALUES = CTMLogic.values();

    public CTMLogic get(Direction face, int corner) {
        int ordinal = cornerOrdinal(face, corner);
        return VALUES[ordinal];
    }

    public int cornerOrdinal(Direction face, int corner) {
        return (packedFace(face) >>> (corner * BITS_PER_CORNER)) & CORNER_MASK;
    }

    public int packedFace(Direction face) {
        return switch (face) {
            case DOWN -> down;
            case UP -> up;
            case NORTH -> north;
            case SOUTH -> south;
            case WEST -> west;
            case EAST -> east;
        };
    }

    public int patternIndex(Direction face) {
        int packed = packedFace(face);

        int c0 = (packed) & CORNER_MASK;
        int c1 = (packed >>> 3) & CORNER_MASK;
        int c2 = (packed >>> 6) & CORNER_MASK;
        int c3 = (packed >>> 9) & CORNER_MASK;

        return c0
                + c1 * LOGIC_COUNT
                + c2 * LOGIC_COUNT * LOGIC_COUNT
                + c3 * LOGIC_COUNT * LOGIC_COUNT * LOGIC_COUNT;
    }
}
