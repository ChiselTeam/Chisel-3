package chisel.lib.ctm.logic;

import net.minecraft.client.resources.model.cuboid.CuboidFace;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;

public enum CTMLogicV4 {
    TOP_LEFT(0, 0), TOP_RIGHT(16, 0),
    BOTTOM_LEFT(0, 16), BOTTOM_RIGHT(16, 16);

    private final int u, v;

    CTMLogicV4(int u, int v) {
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

    public static CTMLogicV4 get(BlockPos pos, Direction side) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        int tx, ty;
        int xSize = 2;
        int ySize = 2;

        if (side.getAxis().isVertical()) {
            tx = x % xSize;
            ty = (side.getStepY() * z + 1) % ySize;
        } else if (side.getAxis() == Direction.Axis.Z) {
            tx = x % xSize;
            ty = -y % ySize;
        } else {
            tx = (z + 1) % xSize;
            ty = -y % ySize;
        }

        if (side == Direction.NORTH || side == Direction.EAST) {
            tx = (xSize - tx - 1) % xSize;
        }

        if (tx < 0) tx += xSize;
        if (ty < 0) ty += ySize;

        return values()[ty * xSize + tx];
    }

    @Deprecated
    public static CTMLogicV4 get(RandomSource random) {
        return values()[random.nextInt(4)];
    }
}
