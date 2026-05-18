package chisel.core.variant.handler;

import chisel.core.variant.Variant;
import chisel.core.variant.VariantModel;
import chisel.lib.ctm.unbaked.AbstractUnbakedConnectedTextureBlockStateModel;
import chisel.lib.ctm.unbaked.TBSUnbakedCTMModel;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

import java.util.Set;

public class TBSCTMVariantModelHandler extends AbstractVariantModelHandler {
    public TBSCTMVariantModelHandler(String name, VariantModel model) {
        super(name, model);
    }

    @Override
    public boolean isConnectedTexture() {
        return true;
    }

    @Override
    public AbstractUnbakedConnectedTextureBlockStateModel createUnbakedModel(Identifier modelLocation, Pair<Vector3f, Vector3f> element, Set<Direction> connectedFaces, boolean renderOverlayOnAllFaces, Variant variant, int baseTintIndex, int baseEmissivity, int tintIndex, int emissivity) {
        return new TBSUnbakedCTMModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
    }
}