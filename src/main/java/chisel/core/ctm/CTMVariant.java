package chisel.core.ctm;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public interface CTMVariant {

    Codec<CTMVariant> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            BuiltInRegistries.BLOCK.byNameCodec().fieldOf("block").forGetter(CTMVariant::targetBlock),
            CTMKind.CODEC.fieldOf("kind").forGetter(CTMVariant::kind),
            Codec.BOOL.optionalFieldOf("water_offset", false).forGetter(CTMVariant::waterOffset)
    ).apply(instance, CTMVariant::of));

    Block targetBlock();

    CTMKind kind();

    default boolean waterOffset() {
        return false;
    }

    static CTMVariant of(Block targetBlock, CTMKind kind) {
        return of(targetBlock, kind, false);
    }

    static CTMVariant of(Block targetBlock, CTMKind kind, boolean waterOffset) {
        return new Record(targetBlock, kind, waterOffset);
    }

    record Record(Block targetBlock, CTMKind kind, boolean waterOffset) implements CTMVariant {
    }
}
