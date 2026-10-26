package io.github.chiselteam.chisel.client.gui.palette;

import com.mojang.logging.LogUtils;
import io.github.chiselteam.chisel.client.gui.preview.PreviewGetter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.MissingTextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.joml.Vector3f;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public final class PaletteColorIndex {
    private final Map<TextureKey, PaletteColorProfile> textures = new HashMap<>();
    private final Map<Block, PaletteColorProfile> blocks = new IdentityHashMap<>();
    private Object modelSet;
    private int cursor;

    public boolean update(List<Block> catalog, boolean analyze) {
        Object current = Minecraft.getInstance().getModelManager().getBlockModelShaper();
        boolean changed = current != modelSet;
        if (changed) {
            modelSet = current;
            textures.clear();
            blocks.clear();
            cursor = 0;
        }
        if (!analyze) return changed;
        long deadline = System.nanoTime() + 3_000_000;
        int count = 0;
        while (cursor < catalog.size() && count++ < 64 && System.nanoTime() < deadline) {
            Block block = catalog.get(cursor++);
            try {
                blocks.put(block, analyze(block.defaultBlockState()));
            } catch (RuntimeException error) {
                blocks.put(block, new PaletteColorProfile());
                LogUtils.getLogger().warn("Could not inspect palette colors for {}", BuiltInRegistries.BLOCK.getKey(block), error);
            }
            changed = true;
        }
        return changed;
    }

    public boolean complete(List<Block> catalog) {
        return cursor == catalog.size();
    }

    public double score(Block block, PaletteColor color) {
        var profile = blocks.get(block);
        return profile == null ? 0 : profile.share(color);
    }

    private PaletteColorProfile analyze(BlockState state) {
        var minecraft = Minecraft.getInstance();
        var model = minecraft.getModelManager().getBlockModelShaper().getBlockModel(state);
        var getter = new PreviewGetter(state, new int[][]{{0, 0, 0}});
        var result = new PaletteColorProfile();
        var data = model.getModelData(getter, BlockPos.ZERO, state, net.neoforged.neoforge.client.model.data.ModelData.EMPTY);
        var random = RandomSource.create(42);
        for (var layer : model.getRenderTypes(state, random, data)) {
            for (var direction : Direction.values())
                for (var quad : model.getQuads(state, direction, random, data, layer)) addQuad(result, quad, state, getter);
            for (var quad : model.getQuads(state, null, random, data, layer)) addQuad(result, quad, state, getter);
        }
        if (result.isEmpty()) result.add(texture(model.getParticleIcon(data), -1), 1);
        return result;
    }

    private void addQuad(PaletteColorProfile result, BakedQuad quad, BlockState state, PreviewGetter getter) {
        int tint = quad.isTinted() ? Minecraft.getInstance().getBlockColors().getColor(state, getter, BlockPos.ZERO, quad.getTintIndex()) : -1;
        var edge1 = new Vector3f(position(quad, 1)).sub(position(quad, 0));
        var edge2 = new Vector3f(position(quad, 2)).sub(position(quad, 0));
        var edge3 = new Vector3f(position(quad, 3)).sub(position(quad, 0));
        double area = new Vector3f(edge1).cross(edge2).length() / 2.0 + new Vector3f(edge2).cross(edge3).length() / 2.0;
        result.add(texture(quad.getSprite(), tint), area);
    }

    private PaletteColorProfile texture(TextureAtlasSprite sprite, int tint) {
        return textures.computeIfAbsent(new TextureKey(sprite, tint), key -> {
            var result = new PaletteColorProfile();
            var contents = sprite.contents();
            if (contents.name().equals(MissingTextureAtlasSprite.getLocation())) return result;
            int samplesX = Math.min(16, contents.width()), samplesY = Math.min(16, contents.height());
            var frames = contents.getUniqueFrames().toArray();
            int frameCount = frames.length > 1 ? Math.min(4, frames.length) : 1;
            for (int f = 0; f < frameCount; f++) {
                int frame = frames.length > 1 ? frames[f * frames.length / frameCount] : 0;
                for (int y = 0; y < samplesY; y++)
                    for (int x = 0; x < samplesX; x++) {
                        int pixel = sprite.getPixelRGBA(frame, (2 * x + 1) * contents.width() / (2 * samplesX), (2 * y + 1) * contents.height() / (2 * samplesY));
                        int argb = (pixel & 0xFF00FF00) | ((pixel & 0xFF) << 16) | ((pixel >>> 16) & 0xFF);
                        result.addPixel(argb, tint);
                    }
            }
            return result;
        });
    }

    private static Vector3f position(BakedQuad quad, int vertex) {
        var data = quad.getVertices(); int i = vertex * 8;
        return new Vector3f(Float.intBitsToFloat(data[i]), Float.intBitsToFloat(data[i+1]), Float.intBitsToFloat(data[i+2]));
    }

    private record TextureKey(TextureAtlasSprite sprite, int tint) {
    }
}
