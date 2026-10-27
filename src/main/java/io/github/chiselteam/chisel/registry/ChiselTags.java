package io.github.chiselteam.chisel.registry;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class ChiselTags {
    public static final TagKey<Block> WOOD = TagKey.create(Registries.BLOCK, Chisel.prefix("wood"));
    public static final TagKey<Block> CANT_BE_MOSSED = TagKey.create(Registries.BLOCK, Chisel.prefix("cant_be_mossed"));
    public static final TagKey<Item> CHISEL = TagKey.create(Registries.ITEM, Chisel.prefix("chisel"));

    private ChiselTags() {
    }
}
