package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ModelHelpers;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import net.minecraft.data.models.blockstates.MultiPartGenerator;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static io.github.chiselteam.chisel.datagen.model.BlockModels.*;
import static io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates.*;

public class GlassPaneModelGenerator extends VariantModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping()).put(TextureSlot.PANE, VariantTextures.get(variant)).put(TextureSlot.EDGE, VariantTextures.get(variant, "top"));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);

        net.minecraft.data.models.blockstates.Variant post = plainVariant(ModelTemplates.STAINED_GLASS_PANE_POST.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        net.minecraft.data.models.blockstates.Variant side = plainVariant(GLASS_PANE_SIDE.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        net.minecraft.data.models.blockstates.Variant sideAlt = plainVariant(GLASS_PANE_SIDE_ALT.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        net.minecraft.data.models.blockstates.Variant noSide = plainVariant(ModelTemplates.STAINED_GLASS_PANE_NOSIDE.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        net.minecraft.data.models.blockstates.Variant noSideAlt = plainVariant(ModelTemplates.STAINED_GLASS_PANE_NOSIDE_ALT.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        net.minecraft.data.models.blockstates.Variant end = plainVariant(GLASS_PANE_END.create(getBlock(), getTextureMapping(), blockModels.modelOutput));
        net.minecraft.data.models.blockstates.Variant endAlt = plainVariant(GLASS_PANE_END_ALT.create(getBlock(), getTextureMapping(), blockModels.modelOutput));

        blockModels.registerSimpleItemModel(getBlock().asItem(), ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(getBlock().asItem()), TextureMapping.layer0(VariantTextures.get(variant)), blockModels.modelOutput));

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(getBlock())
                        .with(post)
                        .with(condition().term(BlockStateProperties.NORTH, true), side)
                        .with(condition().term(BlockStateProperties.EAST, true), rotate(side, net.minecraft.data.models.blockstates.VariantProperties.Rotation.R90))
                        .with(condition().term(BlockStateProperties.SOUTH, true), sideAlt)
                        .with(condition().term(BlockStateProperties.WEST, true), rotate(sideAlt, net.minecraft.data.models.blockstates.VariantProperties.Rotation.R90))
                        .with(ModelHelpers.centerCondition(BlockStateProperties.NORTH, BlockStateProperties.SOUTH, BlockStateProperties.EAST, BlockStateProperties.WEST), noSide)
                        .with(ModelHelpers.centerCondition(BlockStateProperties.EAST, BlockStateProperties.WEST, BlockStateProperties.NORTH, BlockStateProperties.SOUTH), noSideAlt)
                        .with(ModelHelpers.centerCondition(BlockStateProperties.SOUTH, BlockStateProperties.NORTH, BlockStateProperties.EAST, BlockStateProperties.WEST), rotate(noSideAlt, net.minecraft.data.models.blockstates.VariantProperties.Rotation.R90))
                        .with(ModelHelpers.centerCondition(BlockStateProperties.WEST, BlockStateProperties.EAST, BlockStateProperties.NORTH, BlockStateProperties.SOUTH), rotate(noSide, net.minecraft.data.models.blockstates.VariantProperties.Rotation.R270))
                        .with(ModelHelpers.endCondition(BlockStateProperties.NORTH, BlockStateProperties.SOUTH, BlockStateProperties.EAST, BlockStateProperties.WEST), end)
                        .with(ModelHelpers.endCondition(BlockStateProperties.EAST, BlockStateProperties.WEST, BlockStateProperties.NORTH, BlockStateProperties.SOUTH), endAlt)
                        .with(ModelHelpers.endCondition(BlockStateProperties.SOUTH, BlockStateProperties.NORTH, BlockStateProperties.EAST, BlockStateProperties.WEST), rotate(endAlt, net.minecraft.data.models.blockstates.VariantProperties.Rotation.R90))
                        .with(ModelHelpers.endCondition(BlockStateProperties.WEST, BlockStateProperties.EAST, BlockStateProperties.NORTH, BlockStateProperties.SOUTH), rotate(end, net.minecraft.data.models.blockstates.VariantProperties.Rotation.R270))
        );
    }
}
