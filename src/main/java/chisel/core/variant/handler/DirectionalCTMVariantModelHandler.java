package chisel.core.variant.handler;

import chisel.core.variant.Variant;
import chisel.core.variant.VariantModel;
import chisel.lib.ctm.unbaked.AbstractUnbakedConnectedTextureBlockStateModel;
import chisel.lib.ctm.unbaked.DirectionalUnbakedCTMModel;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

import java.util.Set;

public class DirectionalCTMVariantModelHandler extends AbstractVariantModelHandler {
    private final boolean bookshelf;

    public DirectionalCTMVariantModelHandler(String name, VariantModel model, boolean bookshelf) {
        super(name, model);
        this.bookshelf = bookshelf;
    }

    @Override
    public boolean isConnectedTexture() {
        return true;
    }

    @Override
    public boolean usesDirectionalCTM() {
        return true;
    }

    @Override
    public boolean isBookshelfLike() {
        return bookshelf;
    }

    @Override
    public boolean isCTMH() {
        return name.equals("ctmh");
    }

    @Override
    public boolean isCTMV() {
        return name.equals("ctmv");
    }

    @Override
    public AbstractUnbakedConnectedTextureBlockStateModel createUnbakedModel(Identifier modelLocation, Pair<Vector3f, Vector3f> element, Set<Direction> connectedFaces, boolean renderOverlayOnAllFaces, Variant variant, int baseTintIndex, int baseEmissivity, int tintIndex, int emissivity) {
        return new DirectionalUnbakedCTMModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
    }
}