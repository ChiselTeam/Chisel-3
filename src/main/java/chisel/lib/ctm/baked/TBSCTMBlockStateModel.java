package chisel.lib.ctm.baked;

import chisel.lib.ctm.CTMVariant;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.Direction;

import java.util.Map;
import java.util.Set;


public class TBSCTMBlockStateModel extends StandardCTMBlockStateModel {

    public TBSCTMBlockStateModel(
            Set<Direction> connectedFaces,
            Set<Direction> unculledFaces,
            boolean renderOverlayOnAllFaces,
            Map<Direction, BakedQuad[]> baseQuads,
            Map<Direction, BakedQuad[][]> connectedQuads,
            TextureAtlasSprite particle,
            CTMVariant variant
    ) {
        super(
                connectedFaces,
                unculledFaces,
                renderOverlayOnAllFaces,
                baseQuads,
                connectedQuads,
                particle,
                variant
        );
    }
}