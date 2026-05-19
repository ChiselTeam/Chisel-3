package chisel.lib.ctm;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;

/**
 * The shape of a connected-texture variant — i.e. which CTM algorithm a baked/unbaked
 * model should use. This enum is intentionally library-local: it enumerates the shapes
 * the {@code chisel.lib.ctm} package knows how to render, with no dependency on the
 * Chisel mod's variant/model-handler system.
 */
public enum CTMKind implements StringRepresentable {

    /** 5-bit standard connected texture (the original CTM). */
    STANDARD("standard"),
    /** Top/bottom/side standard CTM. */
    TBS("tbs"),
    /** "Anti-repeat": 2x2 random rotation overlay. */
    AR("ar"),

    /** Bookshelf-like: horizontal directional overlay on horizontal faces only, with slight inset. */
    BOOKSHELF("bookshelf"),
    /** Horizontal directional CTM. */
    CTMH("ctmh"),
    /** Vertical directional CTM. */
    CTMV("ctmv"),

    /** Fixed multiblock 2x2 tiling. */
    MULTIBLOCK_2X2("multiblock_2x2", 2),
    /** Fixed multiblock 3x3 tiling. */
    MULTIBLOCK_3X3("multiblock_3x3", 3),
    /** Fixed multiblock 4x4 tiling. */
    MULTIBLOCK_4X4("multiblock_4x4", 4),

    /** Deterministic 2x2 multiblock that follows the configured offset provider. */
    V4("v4", 2),
    /** Deterministic 3x3 multiblock that follows the configured offset provider. */
    V9("v9", 3),
    /** Deterministic 4x4 multiblock that follows the configured offset provider. */
    V16("v16", 4),

    /** Random per-position 2x2 multiblock. */
    R4("r4", 2),
    /** Random per-position 3x3 multiblock. */
    R9("r9", 3),
    /** Random per-position 4x4 multiblock. */
    R16("r16", 4);

    public static final Codec<CTMKind> CODEC = StringRepresentable.fromEnum(CTMKind::values);

    private final String name;
    private final int multiblockSize;

    CTMKind(String name) {
        this(name, 0);
    }

    CTMKind(String name, int multiblockSize) {
        this.name = name;
        this.multiblockSize = multiblockSize;
    }

    @Override
    public String getSerializedName() {
        return name;
    }

    public boolean isStandard() {
        return this == STANDARD;
    }

    public boolean isTBS() {
        return this == TBS;
    }

    public boolean isAR() {
        return this == AR;
    }

    public boolean isBookshelfLike() {
        return this == BOOKSHELF;
    }

    public boolean isCTMH() {
        return this == CTMH;
    }

    public boolean isCTMV() {
        return this == CTMV;
    }

    public boolean isV4() {
        return this == V4;
    }

    public boolean isV9() {
        return this == V9;
    }

    public boolean isV16() {
        return this == V16;
    }

    public boolean isR4() {
        return this == R4;
    }

    public boolean isR9() {
        return this == R9;
    }

    public boolean isR16() {
        return this == R16;
    }

    public boolean usesDirectionalCTM() {
        return this == BOOKSHELF || this == CTMH || this == CTMV;
    }

    public boolean usesMultiblockCTM() {
        return multiblockSize > 0;
    }

    public boolean usesRandomTexture() {
        return this == R4 || this == R9 || this == R16;
    }

    /** Side length of the multiblock tiling (2, 3 or 4), or 0 for non-multiblock kinds. */
    public int multiblockSize() {
        return multiblockSize;
    }
}
