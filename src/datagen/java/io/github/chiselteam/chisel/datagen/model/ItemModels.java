package io.github.chiselteam.chisel.datagen.model;

import com.google.gson.JsonElement;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public final class ItemModels {
    private final BiConsumer<ResourceLocation,Supplier<JsonElement>> output;
    public ItemModels(BiConsumer<ResourceLocation,Supplier<JsonElement>> output) { this.output=output; }
    public void generateFlatItem(Item item, ModelTemplate template) {
        template.create(ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(TextureMapping.getItemTexture(item)), output);
    }
}
