package io.github.chiselteam.chisel.client.gui.handbook;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public final class HandbookBookmark {
    private static Path path() {
        return Minecraft.getInstance().gameDirectory.toPath().resolve("config/chisel-handbook-bookmark.properties");
    }

    public static Properties load() {
        return load(path());
    }

    static Properties load(Path file) {
        var values = new Properties();
        if (!Files.isRegularFile(file)) return values;
        try (var input = Files.newInputStream(file)) {
            values.load(input);
        } catch (IOException | IllegalArgumentException error) {
            values.clear();
            LoggerFactory.getLogger(HandbookBookmark.class).warn("Could not read handbook bookmark", error);
        }
        return values;
    }

    public static boolean save(Identifier guide, int spread) {
        return save(path(), guide, spread);
    }

    static boolean save(Path file, Identifier guide, int spread) {
        var values = new Properties();
        values.setProperty("guide", guide.toString());
        values.setProperty("spread", Integer.toString(spread));
        try {
            Files.createDirectories(file.getParent());
            try (var output = Files.newOutputStream(file)) {
                values.store(output, "Chisel handbook reading bookmark");
            }
            return true;
        } catch (IOException error) {
            LoggerFactory.getLogger(HandbookBookmark.class).warn("Could not save handbook bookmark", error);
            return false;
        }
    }
}
