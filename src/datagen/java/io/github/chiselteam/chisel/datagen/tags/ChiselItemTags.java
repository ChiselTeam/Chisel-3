package io.github.chiselteam.chisel.datagen.tags;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.content.ChiselFamilies;
import io.github.chiselteam.chisel.registry.ChiselItems;
import io.github.chiselteam.chisel.registry.ChiselTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ChiselItemTags extends IntrinsicHolderTagsProvider<Item> {
    public ChiselItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, net.minecraft.core.registries.Registries.ITEM, lookupProvider, item -> item.builtInRegistryHolder().key(), Chisel.MODID, null);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        addToTag(Tags.Items.STORAGE_BLOCKS, ChiselFamilies.COAL.getFamily());
        addToTag(Tags.Items.STORAGE_BLOCKS, ChiselFamilies.CHARCOAL.getFamily());
        addToTag(Tags.Items.STORAGE_BLOCKS, ChiselFamilies.COAL_COKE.getFamily());
        addToTag(ItemTags.create(Chisel.prefix("marble")), ChiselFamilies.MARBLE.getFamily());
        addToTag(ItemTags.create(Chisel.prefix("limestone")), ChiselFamilies.LIMESTONE.getFamily());

        tag(ChiselTags.CHISEL)
                .add(ChiselItems.CHISEL_IRON.asItem())
                .add(ChiselItems.CHISEL_DIAMOND.asItem())
                .add(ChiselItems.CHISEL_OBSIDIAN.asItem());
    }

    private void addToTag(TagKey<Item> tag, VariantFamily family) {
        family.getVariants().forEach(variant -> {
            if (variant.shouldGenerateModel()) tag(tag).add(variant.getBlock().asItem());
        });
        family.getHiddenVariants().forEach(variant -> {
            if (variant.shouldGenerateModel()) tag(tag).add(variant.getBlock().asItem());
        });
    }
}
