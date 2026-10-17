package io.github.chiselteam.chisel.guide.section;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.resources.Identifier;

public record ImageSection(Identifier texture, int width, int height) implements HandbookGuideSection {
    public static final MapCodec<ImageSection> CODEC = RecordCodecBuilder.mapCodec(i -> i.group(
            Identifier.CODEC.fieldOf("texture").forGetter(ImageSection::texture),
            Codec.intRange(1, 4096).fieldOf("width").forGetter(ImageSection::width),
            Codec.intRange(1, 4096).fieldOf("height").forGetter(ImageSection::height)
    ).apply(i, ImageSection::new));

    public Identifier type() {
        return Chisel.prefix("image");
    }
}
