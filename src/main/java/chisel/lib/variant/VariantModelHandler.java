package chisel.lib.variant;

import chisel.lib.ctm.CTMKind;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.util.StringRepresentable;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public interface VariantModelHandler extends StringRepresentable {
    void generate(Variant variant, BlockModelGenerators blockModels);

    @Override
    @NonNull String getSerializedName();

    default boolean isConnectedTexture() {
        return false;
    }

    default boolean isWaterstone() {
        return false;
    }

    default boolean isWallTorch() {
        return false;
    }

    /**
     * Side length of the multiblock tiling for multiblock-CTM handlers (2/3/4), or 0 otherwise.
     * Used outside the lib by Chisel for variant-finding / loot-table logic.
     */
    default int multiblockSize() {
        return 0;
    }

    /**
     * Whether this handler is one of the random-tile multiblock CTM variants (R4/R9/R16).
     */
    default boolean usesRandomTexture() {
        return false;
    }

    /**
     * The CTM shape this handler maps to, or {@code null} if this handler is not a
     * connected-texture handler.
     */
    default @Nullable CTMKind ctmKind() {
        return null;
    }

    /**
     * Whether the CTM-library multiblock overlay should be nudged outward (used by the
     * waterstone-style overlays).
     */
    default boolean ctmWaterOffset() {
        return false;
    }

    default String name() {
        return getSerializedName();
    }
}
