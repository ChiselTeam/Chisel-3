package io.github.chiselteam.chisel.datagen.model;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.registry.ChiselBlocks;
import io.github.chiselteam.chisel.registry.ChiselItems;
import io.github.chiselteam.chisel.registry.ChiselVariantFamilies;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class ChiselModelProvider implements net.minecraft.data.DataProvider {

    private final PackOutput output;

    public ChiselModelProvider(PackOutput output) {
        this.output = output;
    }

    protected void registerModels(@NotNull BlockModels blockModels, @NotNull ItemModels itemModels) {
        ChiselVariantModelGenerators.registerAll();

        Set<String> processedFamilies = new HashSet<>();
        ChiselVariantFamilies.getRootFamilies().forEach(family -> registerFamilyModels(family, blockModels, processedFamilies));

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(ChiselBlocks.AUTO_CHISEL.get(), BlockModels.plainVariant(Chisel.prefix("block/auto_chisel"))));
        blockModels.registerSimpleItemModel(ChiselBlocks.AUTO_CHISEL.get(), Chisel.prefix("block/auto_chisel"));

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.multiVariant(
                        ChiselBlocks.BUILDERS_GUIDE.get(),
                        BlockModels.plainVariant(
                                ModelTemplates.CUBE_BOTTOM_TOP.create(
                                        ChiselBlocks.BUILDERS_GUIDE.get(),
                                        new TextureMapping()
                                                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(ChiselBlocks.BUILDERS_GUIDE.get(), "_top"))
                                                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(ChiselBlocks.BUILDERS_GUIDE.get(), "_top"))
                                                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(ChiselBlocks.BUILDERS_GUIDE.get(), "_bottom"))
                                                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(ChiselBlocks.BUILDERS_GUIDE.get(), "_side")),
                                        blockModels.modelOutput
                                )
                        )
                )
        );
        blockModels.registerSimpleItemModel(ChiselBlocks.BUILDERS_GUIDE.get(), Chisel.prefix("block/builders_guide"));

        itemModels.generateFlatItem(ChiselItems.CHISEL_IRON.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ChiselItems.CHISEL_DIAMOND.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ChiselItems.CHISEL_OBSIDIAN.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ChiselItems.OFFSET_TOOL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ChiselItems.UPGRADE_STACK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.UPGRADE_SPEED.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.UPGRADE_REVERSION.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.UPGRADE_AUTOMATION.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.BALL_O_MOSS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.CLOUD_IN_A_BOTTLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.SMASHING_ROCK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.MEASURING_TAPE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.BUILDERS_HANDBOOK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.PALETTE_BUILDER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ChiselItems.TROWEL.get(), ModelTemplates.FLAT_ITEM);
    }

    private void registerFamilyModels(VariantFamily family, BlockModels blockModels, Set<String> processedFamilies) {
        if (!processedFamilies.add(family.getFamilyName())) return;

        family.getVariants().stream().filter(Variant::shouldGenerateModel).forEach(variant -> ChiselVariantModelGenerators.generate(variant, blockModels));
        family.getHiddenVariants().stream().filter(Variant::shouldGenerateModel).forEach(variant -> ChiselVariantModelGenerators.generate(variant, blockModels));

        if (family.getWaxedFamily() != null)
            registerFamilyModels(family.getWaxedFamily(), blockModels, processedFamilies);
    }

    @Override
    public java.util.concurrent.CompletableFuture<?> run(net.minecraft.data.CachedOutput cache) {
        var states = new java.util.LinkedHashMap<Block, net.minecraft.data.models.blockstates.BlockStateGenerator>();
        var models = new java.util.LinkedHashMap<net.minecraft.resources.ResourceLocation, java.util.function.Supplier<com.google.gson.JsonElement>>();
        var generator = new BlockModels(state -> { if (states.put(state.getBlock(),state) != null) throw new IllegalStateException("Duplicate blockstate: " + state.getBlock()); },
                (id,model) -> { if (models.put(id,model) != null) throw new IllegalStateException("Duplicate model: " + id); });
        registerModels(generator, new ItemModels(generator.modelOutput));
        for (var entry : ChiselBlocks.BLOCKS.getEntries()) {
            var block = entry.get();
            if (!states.containsKey(block)) throw new IllegalStateException("Missing blockstate: " + entry.getId());
            var item = block.asItem();
            if (item == net.minecraft.world.item.Items.AIR) continue;
            var id = net.minecraft.data.models.model.ModelLocationUtils.getModelLocation(item);
            models.putIfAbsent(id, () -> { var json=new com.google.gson.JsonObject(); json.addProperty("parent", net.minecraft.data.models.model.ModelLocationUtils.getModelLocation(block).toString());return json; });
        }
        var statePaths = output.createPathProvider(PackOutput.Target.RESOURCE_PACK,"blockstates");
        var modelPaths = output.createPathProvider(PackOutput.Target.RESOURCE_PACK,"models");
        var futures = new java.util.ArrayList<java.util.concurrent.CompletableFuture<?>>();
        states.forEach((block,state) -> futures.add(net.minecraft.data.DataProvider.saveStable(cache,state.get(),statePaths.json(block.builtInRegistryHolder().key().location()))));
        models.forEach((id,model) -> futures.add(net.minecraft.data.DataProvider.saveStable(cache,model.get(),modelPaths.json(id))));
        return java.util.concurrent.CompletableFuture.allOf(futures.toArray(java.util.concurrent.CompletableFuture[]::new));
    }
    @Override public String getName() { return "Chisel model definitions"; }
}
