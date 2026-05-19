package chisel.core.ctm.geometry;

import chisel.core.ctm.logic.CTMLogicHorizontal;
import chisel.core.ctm.logic.CTMLogicVertical;
import net.minecraft.core.Direction;

public record DirectionalCTMKey(int horizontal, int vertical) implements CTMGeometryKey {
    private static final int BITS_PER_FACE = 3;
    private static final int FACE_MASK = 0b111;

    private static final CTMLogicHorizontal[] HORIZONTAL_VALUES = CTMLogicHorizontal.values();
    private static final CTMLogicVertical[] VERTICAL_VALUES = CTMLogicVertical.values();

    public CTMLogicHorizontal horizontal(Direction face) {
        int ordinal = unpack(horizontal, face);
        return HORIZONTAL_VALUES[ordinal];
    }

    public CTMLogicVertical vertical(Direction face) {
        int ordinal = unpack(vertical, face);
        return VERTICAL_VALUES[ordinal];
    }

    public static int packHorizontal(Direction face, CTMLogicHorizontal logic) {
        return logic.ordinal() << shift(face);
    }

    public static int packVertical(Direction face, CTMLogicVertical logic) {
        return logic.ordinal() << shift(face);
    }

    private static int unpack(int packed, Direction face) {
        return (packed >>> shift(face)) & FACE_MASK;
    }

    private static int shift(Direction face) {
        return face.get3DDataValue() * BITS_PER_FACE;
    }
}
