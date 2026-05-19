package chisel.core.ctm.baked;

import chisel.core.ctm.CTMKind;
import chisel.core.ctm.CTMVariant;
import chisel.core.ctm.util.CTMPartBuilder;
import chisel.core.ctm.ConnectedTextureBlockModelPart;
import chisel.core.ctm.geometry.DirectionalCTMKey;
import chisel.core.ctm.logic.CTMLogicHorizontal;
import chisel.core.ctm.logic.CTMLogicVertical;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;

import java.util.*;


public class DirectionalCTMBlockStateModel extends AbstractConnectedTextureBlockStateModel<DirectionalCTMKey> {

    protected final Map<Direction, BakedQuad[]> horizontalQuads;
    protected final Map<Direction, BakedQuad[]> verticalQuads;

    public DirectionalCTMBlockStateModel(Set<Direction> connectedFaces,
                                         Set<Direction> unculledFaces,
                                         boolean renderOverlayOnAllFaces,
                                         Map<Direction, BakedQuad[]> baseQuads,
                                         Map<Direction, BakedQuad[]> horizontalQuads,
                                         Map<Direction, BakedQuad[]> verticalQuads,
                                         TextureAtlasSprite particle,
                                         CTMVariant variant) {
        super(connectedFaces, unculledFaces, renderOverlayOnAllFaces, baseQuads, particle, variant);
        this.horizontalQuads = horizontalQuads;
        this.verticalQuads = verticalQuads;
    }

    @Override
    protected DirectionalCTMKey computeCTMKey(BlockAndTintGetter level, BlockPos pos, RandomSource random) {
        int horizontal = 0;
        int vertical = 0;

        for (Direction face : Direction.values()) {
            Direction.Axis axis = face.getAxis();

            CTMLogicHorizontal horizontalLogic;
            CTMLogicVertical verticalLogic;

            if (axis == Direction.Axis.Y) {
                horizontalLogic = CTMLogicHorizontal.get(shouldConnectSide(level, pos, Direction.WEST), shouldConnectSide(level, pos, Direction.EAST));
                verticalLogic = CTMLogicVertical.get(shouldConnectSide(level, pos, Direction.NORTH), shouldConnectSide(level, pos, Direction.SOUTH));
            } else {
                Direction horizontalDir = face.getClockWise();
                horizontalLogic = CTMLogicHorizontal.get(shouldConnectSide(level, pos, horizontalDir.getOpposite()), shouldConnectSide(level, pos, horizontalDir));
                verticalLogic = CTMLogicVertical.get(shouldConnectSide(level, pos, Direction.UP), shouldConnectSide(level, pos, Direction.DOWN));
            }

            horizontal |= DirectionalCTMKey.packHorizontal(face, horizontalLogic);
            vertical |= DirectionalCTMKey.packVertical(face, verticalLogic);
        }

        return new DirectionalCTMKey(horizontal, vertical);
    }

    @Override
    protected ConnectedTextureBlockModelPart createPart(DirectionalCTMKey key) {
        return CTMPartBuilder.create(
                baseQuads,
                unculledFaces,
                particleMaterial,
                (side, faceQuads) -> {
                    if (shouldRenderDirectionalOverlay(side)) {
                        appendDirectionalQuad(key, side, faceQuads);
                    }
                }
        );
    }

    private boolean shouldRenderDirectionalOverlay(Direction side) {
        CTMKind kind = variant.kind();
        if (kind.isBookshelfLike()) {
            return side.getAxis().isHorizontal() && horizontalQuads.containsKey(side);
        } else if (kind.usesDirectionalCTM()) {
            return connectedFaces.contains(side) || renderOverlayOnAllFaces;
        }
        return false;
    }

    private void appendDirectionalQuad(DirectionalCTMKey key, Direction side, List<BakedQuad> faceQuads) {
        CTMKind kind = variant.kind();
        if (kind.isBookshelfLike() || kind.isCTMH()) {
            CTMLogicHorizontal logic = key.horizontal(side);
            CTMPartBuilder.appendIndexedQuad(horizontalQuads.get(side), logic.ordinal(), faceQuads);
        } else if (kind.isCTMV()) {
            CTMLogicVertical logic = key.vertical(side);
            CTMPartBuilder.appendIndexedQuad(verticalQuads.get(side), logic.ordinal(), faceQuads);
        }
    }
}
