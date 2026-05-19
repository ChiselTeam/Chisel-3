package chisel.core.ctm.unbaked;

import chisel.core.ctm.baked.EldritchBlockStateModel;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.client.resources.model.ModelBaker;
import net.minecraft.client.resources.model.ResolvableModel;
import net.neoforged.neoforge.client.model.block.CustomUnbakedBlockStateModel;
import org.jspecify.annotations.NonNull;

/**
 * JSON-level wrapper that takes any inner {@link BlockStateModel.Unbaked} and produces
 * an {@link EldritchBlockStateModel} at bake time. The inner model can be any model
 * supported by the vanilla / NeoForge codec — a plain single variant, a weighted set,
 * or another {@link CustomUnbakedBlockStateModel} (e.g. the chisel CTM model).
 *
 * <p>Example JSON:
 * <pre>
 * {
 *   "type": "chisel:eldritch_model",
 *   "model": {
 *     "model": "chisel:block/temple_bricks"
 *   }
 * }
 * </pre>
 */
public class UnbakedEldritchBlockStateModel implements CustomUnbakedBlockStateModel {

    private final BlockStateModel.Unbaked inner;

    public UnbakedEldritchBlockStateModel(BlockStateModel.Unbaked inner) {
        this.inner = inner;
    }

    public static final MapCodec<UnbakedEldritchBlockStateModel> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                    BlockStateModel.Unbaked.CODEC.fieldOf("model").forGetter(m -> m.inner)
            ).apply(instance, UnbakedEldritchBlockStateModel::new)
    );

    @Override
    public void resolveDependencies(ResolvableModel.Resolver resolver) {
        inner.resolveDependencies(resolver);
    }

    @Override
    public @NonNull BlockStateModel bake(@NonNull ModelBaker baker) {
        return new EldritchBlockStateModel(inner.bake(baker));
    }

    @Override
    public @NonNull MapCodec<? extends CustomUnbakedBlockStateModel> codec() {
        return CODEC;
    }

    public BlockStateModel.Unbaked inner() {
        return inner;
    }
}
