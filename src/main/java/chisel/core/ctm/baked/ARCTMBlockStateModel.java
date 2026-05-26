package chisel.core.ctm.baked;

import chisel.core.ctm.CTMVariant;
import chisel.core.ctm.util.CTMPartBuilder;
import chisel.core.ctm.ConnectedTextureBlockModelPart;
import chisel.core.ctm.geometry.ARCTMKey;
import chisel.core.ctm.logic.CTMLogicAR;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ARCTMBlockStateModel extends AbstractConnectedTextureBlockStateModel<ARCTMKey> {

    protected final Map<Direction, BakedQuad[][]> connectedQuads;

    public ARCTMBlockStateModel(Set<Direction> connectedFaces, Set<Direction> unculledFaces, boolean renderOverlayOnAllFaces, Map<Direction, BakedQuad[]> baseQuads, Map<Direction, BakedQuad[][]> connectedQuads, TextureAtlasSprite particle, CTMVariant variant) {
        super(connectedFaces, unculledFaces, renderOverlayOnAllFaces, baseQuads, particle, variant);
        this.connectedQuads = connectedQuads;
    }

    @Override
    protected ARCTMKey computeCTMKey(BlockAndTintGetter level, BlockPos pos, BlockState state, RandomSource random) {
        return ARCTMKey.of(CTMLogicAR.get(pos));
    }

    @Override
    protected ConnectedTextureBlockModelPart createPart(ARCTMKey key) {
        return CTMPartBuilder.create(
                baseQuads,
                unculledFaces,
                particleMaterial,
                (side, faceQuads) -> appendConnectedQuads(key, side, faceQuads)
        );
    }

    private void appendConnectedQuads(ARCTMKey key, Direction side, List<BakedQuad> faceQuads) {
        BakedQuad[][] conn = connectedQuads.get(side);
        if (conn == null) {
            return;
        }

        int ar = key.ordinal();

        for (int i = 0; i < 4; i++) {
            BakedQuad[] cornerQuads = conn[i];
            if (cornerQuads == null) {
                continue;
            }

            BakedQuad quad = cornerQuads[ar];
            if (quad != null) {
                faceQuads.add(quad);
            }
        }
    }
}
