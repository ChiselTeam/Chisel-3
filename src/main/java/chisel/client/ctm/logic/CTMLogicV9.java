package chisel.client.ctm.logic;

import net.minecraft.client.resources.model.cuboid.CuboidFace;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;

public enum CTMLogicV9 {
    TOP_LEFT(0, 0), TOP_CENTER(16, 0), TOP_RIGHT(32, 0),
    CENTER_LEFT(0, 16), CENTER_CENTER(16, 16), CENTER_RIGHT(32, 16),
    BOTTOM_LEFT(0, 32), BOTTOM_CENTER(16, 32), BOTTOM_RIGHT(32, 32);

    private final int u, v;

    CTMLogicV9(int u, int v) {
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

    public static CTMLogicV9 get(BlockPos pos, Direction side) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        int tx, ty;
        int xSize = 3;
        int ySize = 3;

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
    public static CTMLogicV9 get(RandomSource random) {
        return values()[random.nextInt(9)];
    }
}
