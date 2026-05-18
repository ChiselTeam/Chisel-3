package chisel.core.variant;

import chisel.lib.ctm.unbaked.AbstractUnbakedConnectedTextureBlockStateModel;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.util.StringRepresentable;
import org.joml.Vector3f;
import org.jspecify.annotations.NonNull;

import java.util.Set;

public interface VariantModelHandler extends StringRepresentable {
    void generate(Variant variant, BlockModelGenerators blockModels);

    @Override
    @NonNull String getSerializedName();

    default Identifier id() {
        return Identifier.fromNamespaceAndPath("chisel", getSerializedName());
    }

    default boolean isConnectedTexture() {
        return false;
    }

    default boolean usesDirectionalCTM() {
        return false;
    }

    default boolean usesMultiblockCTM() {
        return false;
    }

    default boolean usesRandomTexture() {
        return false;
    }

    default boolean isBookshelfLike() {
        return false;
    }

    default int multiblockSize() {
        return 0;
    }

    default boolean isWaterstone() {
        return false;
    }

    default boolean isWallTorch() {
        return false;
    }

    default boolean isCTMH() {
        return false;
    }

    default boolean isCTMV() {
        return false;
    }

    default boolean isV4() {
        return name().equals("v4");
    }

    default boolean isV9() {
        return name().equals("v9");
    }

    default boolean isV16() {
        return name().equals("v16");
    }

    default boolean isR4() {
        return name().equals("r4");
    }

    default boolean isR9() {
        return name().equals("r9");
    }

    default boolean isR16() {
        return name().equals("r16");
    }

    default String name() {
        return getSerializedName();
    }

    default AbstractUnbakedConnectedTextureBlockStateModel createUnbakedModel(Identifier modelLocation, Pair<Vector3f, Vector3f> element, Set<Direction> connectedFaces, boolean renderOverlayOnAllFaces, Variant variant, int baseTintIndex, int baseEmissivity, int tintIndex, int emissivity) {
        throw new UnsupportedOperationException("Model handler " + getSerializedName() + " does not support CTM unbaked models");
    }
}
