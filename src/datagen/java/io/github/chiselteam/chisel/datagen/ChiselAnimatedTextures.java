package io.github.chiselteam.chisel.datagen;

import com.google.common.hash.Hashing;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.github.chiselteam.chisel.content.ChiselFamilies;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.server.packs.PackType;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

public final class ChiselAnimatedTextures implements DataProvider {
    private static final String[] TILES = {
            "top_left", "top_center", "top_right",
            "center_left", "center", "center_right",
            "bottom_left", "bottom_center", "bottom_right"
    };
    private final PackOutput output;
    private final ExistingFileHelper existing;

    public ChiselAnimatedTextures(PackOutput output, ExistingFileHelper existing) {
        this.output = output;
        this.existing = existing;
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        for (var family : ChiselFamilies.getFamilies()) {
            for (var variant : family.getFamily().getVariants()) {
                var atlas = variant.getTextures().get("overlay_3x3");
                if (atlas == null) continue;
                try {
                    BufferedImage source;
                    try (var stream = existing.getResource(atlas, PackType.CLIENT_RESOURCES, ".png", "textures").open()) {
                        source = ImageIO.read(stream);
                    }
                    if (source == null || source.getWidth() % 3 != 0 || source.getHeight() % source.getWidth() != 0)
                        throw new IOException("Expected a vertical strip of square 3x3 atlas frames: " + atlas);

                    JsonObject metadata;
                    try (var stream = existing.getResource(atlas, PackType.CLIENT_RESOURCES, ".png.mcmeta", "textures").open();
                         var reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
                        metadata = JsonParser.parseReader(reader).getAsJsonObject();
                    }
                    int frameSize = source.getWidth();
                    int tileSize = frameSize / 3;
                    int frames = source.getHeight() / frameSize;
                    metadata.getAsJsonObject("animation").addProperty("width", tileSize);
                    metadata.getAsJsonObject("animation").addProperty("height", tileSize);
                    byte[] metadataBytes = metadata.toString().getBytes(StandardCharsets.UTF_8);

                    for (int tile = 0; tile < TILES.length; tile++) {
                        var image = new BufferedImage(tileSize, tileSize * frames, BufferedImage.TYPE_INT_ARGB);
                        for (int frame = 0; frame < frames; frame++) {
                            int[] pixels = source.getRGB((tile % 3) * tileSize,
                                    frame * frameSize + (tile / 3) * tileSize,
                                    tileSize, tileSize, null, 0, tileSize);
                            image.setRGB(0, frame * tileSize, tileSize, tileSize, pixels, 0, tileSize);
                        }
                        var bytes = new ByteArrayOutputStream();
                        ImageIO.write(image, "PNG", bytes);
                        var path = output.getOutputFolder(PackOutput.Target.RESOURCE_PACK)
                                .resolve(atlas.getNamespace()).resolve("textures")
                                .resolve(atlas.getPath() + "-v9_" + TILES[tile] + ".png");
                        byte[] png = bytes.toByteArray();
                        cache.writeIfNeeded(path, png, Hashing.sha1().hashBytes(png));
                        cache.writeIfNeeded(path.resolveSibling(path.getFileName() + ".mcmeta"),
                                metadataBytes, Hashing.sha1().hashBytes(metadataBytes));
                    }
                } catch (IOException error) {
                    throw new UncheckedIOException("Could not split animated atlas " + atlas, error);
                }
            }
        }
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public @NotNull String getName() {
        return "Chisel animated CTM textures";
    }
}
