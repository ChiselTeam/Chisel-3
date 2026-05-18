package chisel.core.variant.handler;

import chisel.core.variant.Variant;
import chisel.core.variant.VariantModel;
import chisel.lib.ctm.unbaked.AbstractUnbakedConnectedTextureBlockStateModel;
import chisel.lib.ctm.unbaked.MultiblockUnbakedCTMModel;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

import java.util.Set;

public class MultiblockCTMVariantModelHandler extends AbstractVariantModelHandler {
    private final boolean random;
    private final int size;
    private final boolean water;

    public MultiblockCTMVariantModelHandler(String name, VariantModel model, boolean random, int size, boolean water) {
        super(name, model);
        this.random = random;
        this.size = size;
        this.water = water;
    }

    @Override
    public boolean isConnectedTexture() {
        return true;
    }

    @Override
    public boolean usesMultiblockCTM() {
        return true;
    }

    @Override
    public boolean usesRandomTexture() {
        return random;
    }

    @Override
    public int multiblockSize() {
        return size;
    }

    @Override
    public boolean isWaterstone() {
        return water;
    }

    @Override
    public AbstractUnbakedConnectedTextureBlockStateModel createUnbakedModel(Identifier modelLocation, Pair<Vector3f, Vector3f> element, Set<Direction> connectedFaces, boolean renderOverlayOnAllFaces, Variant variant, int baseTintIndex, int baseEmissivity, int tintIndex, int emissivity) {
        return new MultiblockUnbakedCTMModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
    }
}