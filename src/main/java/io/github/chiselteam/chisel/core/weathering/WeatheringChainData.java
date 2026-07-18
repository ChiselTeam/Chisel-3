package io.github.chiselteam.chisel.core.weathering;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.Identifier;

import java.util.List;

/// Datapack entry describing a single weathering chain.
/// - \`blocks\`: ordered list of block identifiers from youngest to oldest
/// - \`aging\_rate\`: chance \`[0..1]\` per random tick to advance one stage (defaults to \`0.25\`)
/// Example JSON:
/// \`\`\`json
/// {
///   "blocks": [
///     "yourmod:stone\_clean",
///     "yourmod:stone\_worn",
///     "yourmod:stone\_weathered"
///   ],
///   "aging\_rate": 0.25
/// }
/// \`\`\`
public record WeatheringChainData(List<Identifier> blocks, float agingRate) {

    /// Codec for serializing/deserializing \`WeatheringChainData\` from datapack JSON.
    /// Fields:
    /// - \`blocks\` (array of \`string\`): block ids in order from youngest to oldest
    /// - \`aging\_rate\` (number, optional): chance per random tick; defaults to \`0.25\`
    public static final Codec<WeatheringChainData> CODEC = RecordCodecBuilder.create(i -> i.group(
            Identifier.CODEC.listOf().fieldOf("blocks").forGetter(WeatheringChainData::blocks),
            Codec.FLOAT.optionalFieldOf("aging_rate", 0.25f).forGetter(WeatheringChainData::agingRate)
    ).apply(i, WeatheringChainData::new));
}
