package chisel.core.ctm.unbaked;

import chisel.core.ctm.CTMKind;
import chisel.core.ctm.CTMVariant;
import chisel.core.ctm.baked.EldritchBlockStateModel;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.client.resources.model.ModelBaker;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.client.model.block.CustomUnbakedBlockStateModel;
import org.joml.Vector3f;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.Set;

public class UnbakedConnectedTextureBlockStateModel extends AbstractUnbakedConnectedTextureBlockStateModel {

    public UnbakedConnectedTextureBlockStateModel(Identifier modelLocation, Pair<Vector3f, Vector3f> element, Set<Direction> connectedFaces, boolean renderOverlayOnAllFaces, CTMVariant variant, int baseTintIndex, int baseEmissivity, int tintIndex, int emissivity, boolean eldritch) {
        super(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity, eldritch);
    }

    public UnbakedConnectedTextureBlockStateModel(Identifier modelLocation, Pair<Vector3f, Vector3f> element, Set<Direction> connectedFaces, boolean renderOverlayOnAllFaces, CTMVariant variant, int baseTintIndex, int baseEmissivity, int tintIndex, int emissivity) {
        this(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity, false);
    }

    private static final Codec<Vector3f> VECTOR3F_CODEC = Codec.FLOAT.listOf().comapFlatMap(
            list -> list.size() == 3 ? DataResult.success(new Vector3f(list.getFirst(), list.get(1), list.get(2))) : DataResult.error(() -> "Vector3f must have 3 components"),
            vec -> List.of(vec.x(), vec.y(), vec.z())
    );

    private static final MapCodec<Pair<Vector3f, Vector3f>> ELEMENT_CODEC = RecordCodecBuilder.mapCodec(j -> j.group(
            VECTOR3F_CODEC.fieldOf("min").forGetter(Pair::getFirst),
            VECTOR3F_CODEC.fieldOf("max").forGetter(Pair::getSecond)
    ).apply(j, Pair::of));

    public static final MapCodec<UnbakedConnectedTextureBlockStateModel> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                    Identifier.CODEC.fieldOf("model_location").forGetter(m -> m.modelLocation),
                    ELEMENT_CODEC.fieldOf("element").forGetter(m -> m.element),
                    Direction.CODEC.listOf().fieldOf("connected_faces").forGetter(m -> m.connectedFaces.stream().toList().stream().sorted().toList()),
                    Codec.BOOL.optionalFieldOf("render_overlay_on_all_faces", false).forGetter(m -> m.renderOverlayOnAllFaces),
                    CTMVariant.CODEC.fieldOf("variant").forGetter(m -> m.variant),
                    Codec.INT.optionalFieldOf("base_tint_index", -1).forGetter(m -> m.baseTintIndex),
                    Codec.INT.optionalFieldOf("base_emissivity", 0).forGetter(m -> m.baseEmissivity),
                    Codec.INT.optionalFieldOf("tint_index", -1).forGetter(m -> m.tintIndex),
                    Codec.INT.optionalFieldOf("emissivity", 0).forGetter(m -> m.emissivity),
                    Codec.BOOL.optionalFieldOf("eldritch", false).forGetter(m -> m.eldritch)
            ).apply(instance, (Identifier modelLocation, Pair<Vector3f, Vector3f> element, List<Direction> connectedFaces, Boolean renderOverlayOnAllFaces, CTMVariant variant, Integer baseTintIndex, Integer baseEmissivity, Integer tintIndex, Integer emissivity, Boolean eldritch) ->
                    new UnbakedConnectedTextureBlockStateModel(modelLocation, element, Set.copyOf(connectedFaces), renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity, eldritch))
    );

    @Override
    public @NonNull MapCodec<? extends CustomUnbakedBlockStateModel> codec() {
        return CODEC;
    }

    @Override
    public @NonNull BlockStateModel bake(@NonNull ModelBaker baker) {
        BlockStateModel baked = forKind(variant.kind()).bake(baker);
        return eldritch ? new EldritchBlockStateModel(baked) : baked;
    }

    private AbstractUnbakedConnectedTextureBlockStateModel forKind(CTMKind kind) {
        return switch (kind) {
            case STANDARD -> new StandardUnbakedCTMModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
            case TBS -> new TBSUnbakedCTMModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
            case AR -> new ARUnbakedModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
            case BOOKSHELF, CTMH, CTMV -> new DirectionalUnbakedCTMModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
            case MULTIBLOCK_2X2, MULTIBLOCK_3X3, MULTIBLOCK_4X4,
                 V4, V9, V16,
                 R4, R9, R16 -> new MultiblockUnbakedCTMModel(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
        };
    }
}
