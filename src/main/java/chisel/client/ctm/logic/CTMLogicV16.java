package chisel.client.ctm.logic;

import net.minecraft.client.resources.model.cuboid.CuboidFace;
import net.minecraft.util.RandomSource;

public enum CTMLogicV16 {
    R0_C0(0, 0), R0_C1(16, 0), R0_C2(32, 0), R0_C3(48, 0),
    R1_C0(0, 16), R1_C1(16, 16), R1_C2(32, 16), R1_C3(48, 16),
    R2_C0(0, 32), R2_C1(16, 32), R2_C2(32, 32), R2_C3(48, 32),
    R3_C0(0, 48), R3_C1(16, 48), R3_C2(32, 48), R3_C3(48, 48);

    private final int u, v;

    CTMLogicV16(int u, int v) {
        this.u = u;
        this.v = v;
    }

    public CuboidFace.UVs remapUVs(CuboidFace.UVs uvs) {
        float minU = (u + uvs.minU()) / 4.0f;
        float minV = (v + uvs.minV()) / 4.0f;
        float maxU = (u + uvs.maxU()) / 4.0f;
        float maxV = (v + uvs.maxV()) / 4.0f;
        return new CuboidFace.UVs(minU, minV, maxU, maxV);
    }

    public static CTMLogicV16 get(RandomSource random) {
        return values()[random.nextInt(16)];
    }
}
