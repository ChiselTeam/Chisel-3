package io.github.chiselteam.chisel.projectile;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class SmashingRockData {

    public static final Codec<SmashingRockData> CODEC = RecordCodecBuilder.create(i -> i.group(
            Codec.either(ResourceLocation.CODEC, TagKey.codec(Registries.BLOCK)).fieldOf("input").forGetter(SmashingRockData::getInput),
            ResourceLocation.CODEC.fieldOf("smashed_block").forGetter(SmashingRockData::getSmashedBlock)
    ).apply(i, SmashingRockData::new));

    private final TagKey<Block> BASE_TAG;
    private final ResourceLocation BASE_BLOCK;
    private final ResourceLocation SMASHED_BLOCK;

    public SmashingRockData(TagKey<Block> baseTag, ResourceLocation smashed) {
        this(Either.right(baseTag), smashed);
    }

    public SmashingRockData(ResourceLocation baseBlock, ResourceLocation smashed) {
        this(Either.left(baseBlock), smashed);
    }

    public SmashingRockData(Either<ResourceLocation, TagKey<Block>> either, ResourceLocation smashed) {
        if(either.right().isPresent()) {
            BASE_TAG = either.right().get();
            BASE_BLOCK = null;
        } else {
            BASE_TAG = null;
            //noinspection OptionalGetWithoutIsPresent it must be present
            BASE_BLOCK = either.left().get();
        }

        SMASHED_BLOCK = smashed;
    }

    public Either<ResourceLocation, TagKey<Block>> getInput() {
        if(BASE_TAG != null) return Either.right(BASE_TAG);
        return Either.left(BASE_BLOCK);
    }

    public ResourceLocation getSmashedBlock() {
        return SMASHED_BLOCK;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SmashingRockData data = (SmashingRockData) obj;
        return BASE_TAG.equals(data.BASE_TAG) && BASE_BLOCK.equals(data.BASE_BLOCK) && SMASHED_BLOCK.equals(data.SMASHED_BLOCK);
    }
}
