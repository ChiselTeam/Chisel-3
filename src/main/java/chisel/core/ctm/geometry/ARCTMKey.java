package chisel.core.ctm.geometry;

import chisel.core.ctm.logic.CTMLogicAR;

public record ARCTMKey(int ar) implements CTMGeometryKey {
    private static final CTMLogicAR[] VALUES = CTMLogicAR.values();

    public CTMLogicAR logic() {
        return VALUES[ar];
    }

    public int ordinal() {
        return ar;
    }

    public static ARCTMKey of(CTMLogicAR logic) {
        return new ARCTMKey(logic.ordinal());
    }
}
