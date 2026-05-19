package chisel.core.ctm.logic;

import net.minecraft.client.resources.model.cuboid.CuboidFace;
import net.minecraft.util.RandomSource;

public enum CTMLogicR9 {
    TOP_LEFT(0, 0), TOP_CENTER(16, 0), TOP_RIGHT(32, 0),
    CENTER_LEFT(0, 16), CENTER_CENTER(16, 16), CENTER_RIGHT(32, 16),
    BOTTOM_LEFT(0, 32), BOTTOM_CENTER(16, 32), BOTTOM_RIGHT(32, 32);

    private final int u, v;

    CTMLogicR9(int u, int v) {
        this.u = u;
        this.v = v;
    }

    public CuboidFace.UVs remapUVs(CuboidFace.UVs uvs) {
        float minU = (u + uvs.minU()) / 3.0f;
        float minV = (v + uvs.minV()) / 3.0f;
        float maxU = (u + uvs.maxU()) / 3.0f;
        float maxV = (v + uvs.maxV()) / 3.0f;
        return new CuboidFace.UVs(minU, minV, maxU, maxV);
    }

    public static CTMLogicR9 get(RandomSource random) {
        return values()[random.nextInt(9)];
    }
}
