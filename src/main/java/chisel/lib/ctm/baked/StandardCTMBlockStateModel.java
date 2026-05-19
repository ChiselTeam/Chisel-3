package chisel.lib.ctm.baked;

import chisel.lib.ctm.CTMVariant;
import chisel.lib.ctm.util.CTMPartBuilder;
import chisel.lib.ctm.ConnectedTextureBlockModelPart;
import chisel.lib.ctm.geometry.StandardCTMKey;
import chisel.lib.ctm.logic.CTMLogic;
import chisel.lib.ctm.util.StandardCTMOverlayTable;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StandardCTMBlockStateModel extends AbstractConnectedTextureBlockStateModel<StandardCTMKey> {

    protected final Map<Direction, BakedQuad[][]> connectedQuads;
    protected final StandardCTMOverlayTable overlayTable;

    public StandardCTMBlockStateModel(Set<Direction> connectedFaces, Set<Direction> unculledFaces, boolean renderOverlayOnAllFaces, Map<Direction, BakedQuad[]> baseQuads, Map<Direction, BakedQuad[][]> connectedQuads, TextureAtlasSprite particle, CTMVariant variant) {
        super(connectedFaces, unculledFaces, renderOverlayOnAllFaces, baseQuads, particle, variant);
        this.connectedQuads = connectedQuads;
        this.overlayTable = new StandardCTMOverlayTable(connectedQuads);
    }

    @Override
    protected StandardCTMKey computeCTMKey(BlockAndTintGetter level, BlockPos pos, RandomSource random) {
        return new StandardCTMKey(
                computeFace(level, pos, Direction.DOWN),
                computeFace(level, pos, Direction.UP),
                computeFace(level, pos, Direction.NORTH),
                computeFace(level, pos, Direction.SOUTH),
                computeFace(level, pos, Direction.EAST),
                computeFace(level, pos, Direction.WEST)
        );
    }

    @Override
    protected ConnectedTextureBlockModelPart createPart(StandardCTMKey key) {
        return CTMPartBuilder.create(
                baseQuads,
                unculledFaces,
                particleMaterial,
                (side, faceQuads) -> {
                    if (connectedFaces.contains(side) || renderOverlayOnAllFaces) {
                        appendConnectedQuads(key, side, faceQuads);
                    }
                }
        );
    }

    private int computeFace(BlockAndTintGetter level, BlockPos pos, Direction face) {
        Direction[] planeDirections = CTMLogic.AXIS_PLANE_DIRECTIONS[face.getAxis().ordinal()];
        int packed = 0;

        for(int c = 0; c < 4; c++) {
            Direction s1 = planeDirections[c];
            Direction s2 = planeDirections[(c + 1) % 4];

            boolean horizontal = shouldConnectSide(level, pos, s1);
            boolean vertical = shouldConnectSide(level, pos, s2);
            boolean corner = horizontal && vertical && isCornerBlockPresent(level, pos, s1, s2);

            CTMLogic logic = (c % 2 == 0) ? CTMLogic.of(horizontal, vertical, corner) : CTMLogic.of(vertical, horizontal, corner);
            packed |= logic.ordinal() << (c * 3);
        }

        return packed;
    }

    protected void appendConnectedQuads(StandardCTMKey key, Direction side, List<BakedQuad> faceQuads) {
        int pattern = connectedFaces.contains(side) ? key.patternIndex(side) : 0;
        faceQuads.addAll(overlayTable.get(side, pattern));
    }
}
