package chisel.core.ctm.geometry;

import chisel.core.ctm.logic.*;
import net.minecraft.core.Direction;

public record MultiblockCTMKey(int mb2x2, int mb3x3, int mb4x4, int v4, int v9, int v16, int r4, int r9, int r16) implements CTMGeometryKey {
    private static final int BITS_PER_FACE = 5;
    private static final int FACE_MASK = 0b11111;

    private static final CTMLogic2x2[] MB2_VALUES = CTMLogic2x2.values();
    private static final CTMLogic3x3[] MB3_VALUES = CTMLogic3x3.values();
    private static final CTMLogic4x4[] MB4_VALUES = CTMLogic4x4.values();

    private static final CTMLogicV4[] V4_VALUES = CTMLogicV4.values();
    private static final CTMLogicV9[] V9_VALUES = CTMLogicV9.values();
    private static final CTMLogicV16[] V16_VALUES = CTMLogicV16.values();

    private static final CTMLogicR4[] R4_VALUES = CTMLogicR4.values();
    private static final CTMLogicR9[] R9_VALUES = CTMLogicR9.values();
    private static final CTMLogicR16[] R16_VALUES = CTMLogicR16.values();

    public CTMLogic2x2 mb2x2(Direction face) {
        return MB2_VALUES[unpack(mb2x2, face)];
    }

    public CTMLogic3x3 mb3x3(Direction face) {
        return MB3_VALUES[unpack(mb3x3, face)];
    }

    public CTMLogic4x4 mb4x4(Direction face) {
        return MB4_VALUES[unpack(mb4x4, face)];
    }

    public CTMLogicV4 v4(Direction face) {
        return V4_VALUES[unpack(v4, face)];
    }

    public CTMLogicV9 v9(Direction face) {
        return V9_VALUES[unpack(v9, face)];
    }

    public CTMLogicV16 v16(Direction face) {
        return V16_VALUES[unpack(v16, face)];
    }

    public CTMLogicR4 r4(Direction face) {
        return R4_VALUES[unpack(r4, face)];
    }

    public CTMLogicR9 r9(Direction face) {
        return R9_VALUES[unpack(r9, face)];
    }

    public CTMLogicR16 r16(Direction face) {
        return R16_VALUES[unpack(r16, face)];
    }

    public static int pack(Direction face, Enum<?> logic) {
        return logic.ordinal() << shift(face);
    }

    private static int unpack(int packed, Direction face) {
        return (packed >>> shift(face)) & FACE_MASK;
    }

    private static int shift(Direction face) {
        return face.get3DDataValue() * BITS_PER_FACE;
    }
}