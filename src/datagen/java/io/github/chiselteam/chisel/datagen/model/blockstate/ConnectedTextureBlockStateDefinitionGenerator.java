package io.github.chiselteam.chisel.datagen.model.blockstate;

import com.google.gson.JsonElement;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.ctm.api.datagen.CTMBlockStateGenerator;
import net.minecraft.data.models.blockstates.BlockStateGenerator;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public final class ConnectedTextureBlockStateDefinitionGenerator implements BlockStateGenerator {
    private final Block block;
    private final CTMBlockStateGenerator ctm;
    private ConnectedTextureBlockStateDefinitionGenerator(Block block, ConnectedTextureBlockStateModelBuilder builder) {
        this.block=block; this.ctm=CTMBlockStateGenerator.of(block,builder.toCTMBuilder());
    }
    public static ConnectedTextureBlockStateDefinitionGenerator dispatch(Block block, ConnectedTextureBlockStateModelBuilder builder) { return new ConnectedTextureBlockStateDefinitionGenerator(block,builder); }
    public void saveModel(BiConsumer<ResourceLocation,Supplier<JsonElement>> output) { ctm.saveModel(output); }
    @Override public Block getBlock() { return block; }
    @Override public JsonElement get() {
        var generator = MultiVariantGenerator.multiVariant(block, BlockModels.plainVariant(ctm.modelLocation()));
        if (block instanceof RotatedPillarBlock) generator.with(BlockModels.createRotatedPillar());
        return generator.get();
    }
}
