package chisel.core.ctm.logic;

import net.minecraft.client.resources.model.cuboid.CuboidFace;
import net.minecraft.util.RandomSource;

public enum CTMLogicR4 {
    TOP_LEFT(0, 0), TOP_RIGHT(16, 0),
    BOTTOM_LEFT(0, 16), BOTTOM_RIGHT(16, 16);

    private final int u, v;

    CTMLogicR4(int u, int v) {
        this.u = u;
        this.v = v;
    }

    public CuboidFace.UVs remapUVs(CuboidFace.UVs uvs) {
        float minU = (u + uvs.minU()) / 2.0f;
        float minV = (v + uvs.minV()) / 2.0f;
        float maxU = (u + uvs.maxU()) / 2.0f;
        float maxV = (v + uvs.maxV()) / 2.0f;
        return new CuboidFace.UVs(minU, minV, maxU, maxV);
    }

    public static CTMLogicR4 get(RandomSource random) {
        return values()[random.nextInt(4)];
    }
}
