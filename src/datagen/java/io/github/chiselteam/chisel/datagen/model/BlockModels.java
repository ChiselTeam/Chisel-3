package io.github.chiselteam.chisel.datagen.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import io.github.chiselteam.ctm.api.datagen.CTMBlockStateGenerator;
import io.github.chiselteam.ctm.client.model.CTMModelVariant;
import io.github.chiselteam.ctm.client.model.CTMReferencedModel;
import io.github.chiselteam.ctm.client.unbaked.UnbakedEldritchBlockStateModel;
import net.minecraft.core.Direction;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.minecraft.data.models.blockstates.VariantProperties.*;

/** 1.21.1 model output shared by the Chisel variant generators. */
public final class BlockModels {
    public final Consumer<BlockStateGenerator> blockStateOutput;
    public final BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput;
    public BlockModels(Consumer<BlockStateGenerator> states, BiConsumer<ResourceLocation, Supplier<JsonElement>> models) {
        modelOutput = models;
        blockStateOutput = generator -> {
            if (generator instanceof CTMBlockStateGenerator ctm) ctm.saveModel(models);
            if (generator instanceof io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator ctm) ctm.saveModel(models);
            states.accept(generator);
        };
    }
    public static Variant plainVariant(ResourceLocation model) { return Variant.variant().with(MODEL, model); }
    public static Variant rotate(Variant model, Rotation rotation) { return Variant.merge(model, Variant.variant().with(Y_ROT, rotation)); }
    public static Condition.TerminalCondition condition() { return Condition.condition(); }
    public static PropertyDispatch createRotatedPillar() {
        return PropertyDispatch.property(BlockStateProperties.AXIS)
                .select(Direction.Axis.Y, Variant.variant())
                .select(Direction.Axis.Z, Variant.variant().with(X_ROT, Rotation.R90))
                .select(Direction.Axis.X, Variant.variant().with(X_ROT, Rotation.R90).with(Y_ROT, Rotation.R90));
    }
    public static final PropertyDispatch ROTATION_HORIZONTAL_FACING = PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING)
            .select(Direction.NORTH, Variant.variant()).select(Direction.EAST, Variant.variant().with(Y_ROT, Rotation.R90))
            .select(Direction.SOUTH, Variant.variant().with(Y_ROT, Rotation.R180)).select(Direction.WEST, Variant.variant().with(Y_ROT, Rotation.R270));
    public static final PropertyDispatch ROTATION_TORCH = PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING)
            .select(Direction.EAST, Variant.variant()).select(Direction.SOUTH, Variant.variant().with(Y_ROT, Rotation.R90))
            .select(Direction.WEST, Variant.variant().with(Y_ROT, Rotation.R180)).select(Direction.NORTH, Variant.variant().with(Y_ROT, Rotation.R270));
    public static PropertyDispatch createBooleanModelDispatch(BooleanProperty property, Variant on, Variant off) {
        return PropertyDispatch.property(property).select(true, on).select(false, off);
    }
    public static MultiVariantGenerator createSimpleBlock(Block block, Variant model) { return MultiVariantGenerator.multiVariant(block, model); }
    public static BlockStateGenerator createAxisAlignedPillarBlock(Block block, Variant model) { return createSimpleBlock(block, model).with(createRotatedPillar()); }
    public void registerSimpleItemModel(Block block, ResourceLocation model) { registerSimpleItemModel(block.asItem(), model); }
    public void registerSimpleItemModel(Item item, ResourceLocation model) {
        if (ModelLocationUtils.getModelLocation(item).equals(model)) return;
        modelOutput.accept(ModelLocationUtils.getModelLocation(item), () -> { var json=new JsonObject();json.addProperty("parent",model.toString());return json; });
    }
    public ResourceLocation createSuffixedVariant(Block block, String suffix, ModelTemplate template, Function<Block, TextureMapping> texture) {
        return template.createWithSuffix(block, suffix, texture.apply(block), modelOutput);
    }
    public void createAxisAlignedPillarBlock(Block block, TexturedModel.Provider provider) { blockStateOutput.accept(createAxisAlignedPillarBlock(block, plainVariant(provider.create(block, modelOutput)))); }
    public void createBars(Block block, ResourceLocation ends, ResourceLocation post, ResourceLocation cap, ResourceLocation capAlt, ResourceLocation side, ResourceLocation sideAlt) {
        blockStateOutput.accept(MultiPartGenerator.multiPart(block).with(plainVariant(ends))
                .with(condition().term(BlockStateProperties.NORTH,false).term(BlockStateProperties.EAST,false).term(BlockStateProperties.SOUTH,false).term(BlockStateProperties.WEST,false), plainVariant(post))
                .with(condition().term(BlockStateProperties.NORTH,true),plainVariant(side))
                .with(condition().term(BlockStateProperties.EAST,true),rotate(plainVariant(side),Rotation.R90))
                .with(condition().term(BlockStateProperties.SOUTH,true),plainVariant(sideAlt))
                .with(condition().term(BlockStateProperties.WEST,true),rotate(plainVariant(sideAlt),Rotation.R90))
                .with(ModelHelpers.endCondition(BlockStateProperties.NORTH,BlockStateProperties.SOUTH,BlockStateProperties.EAST,BlockStateProperties.WEST),plainVariant(cap))
                .with(ModelHelpers.endCondition(BlockStateProperties.SOUTH,BlockStateProperties.NORTH,BlockStateProperties.EAST,BlockStateProperties.WEST),plainVariant(capAlt))
                .with(ModelHelpers.endCondition(BlockStateProperties.EAST,BlockStateProperties.WEST,BlockStateProperties.NORTH,BlockStateProperties.SOUTH),rotate(plainVariant(cap),Rotation.R90))
                .with(ModelHelpers.endCondition(BlockStateProperties.WEST,BlockStateProperties.EAST,BlockStateProperties.NORTH,BlockStateProperties.SOUTH),rotate(plainVariant(capAlt),Rotation.R90)));
    }
    public static Variant eldritch(ResourceLocation model, BiConsumer<ResourceLocation, Supplier<JsonElement>> output) {
        var id = model.withPath(path -> path + "_eldritch");
        var inner = new CTMReferencedModel(model, CTMModelVariant.SimpleModelState.DEFAULT);
        var json = UnbakedEldritchBlockStateModel.CODEC.codec().encodeStart(JsonOps.INSTANCE, new UnbakedEldritchBlockStateModel(inner)).getOrThrow().getAsJsonObject();
        json.addProperty("loader", "ctm:eldritch_model"); output.accept(id, () -> json);
        return plainVariant(id);
    }
}
