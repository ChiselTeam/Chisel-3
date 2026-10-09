package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateModelBuilder;
import io.github.chiselteam.ctm.api.strategy.CTMKind;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

public class IceModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        CTMKind kind = variant.getModelHandler().ctmKind();
        TextureMapping mapping = kind == CTMKind.STANDARD ? VariantTextures.standard(variant) : VariantTextures.ctm(variant, textures -> {
            switch (kind) {
                case MULTIBLOCK_2X2 -> textures.multiblock2x2Textures(VariantTextures.get(variant, "2x2").sprite());
                case MULTIBLOCK_3X3 -> textures.multiblock3x3Textures(VariantTextures.get(variant, "3x3").sprite());
                case MULTIBLOCK_4X4 -> textures.multiblock4x4Textures(VariantTextures.get(variant, "4x4").sprite());
                case AR -> textures.arTextures(VariantTextures.get(variant, "ar_variant").sprite());
                default -> throw new IllegalStateException("Unsupported ice CTM kind: " + kind);
            }
        });
        return mapping.put(TextureSlot.PARTICLE, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        super.generate(variant, blockModels);
        ModelTemplate template = switch (variant.getModelHandler().ctmKind()) {
            case STANDARD -> ChiselModelTemplates.CTM_OVERLAY_ONLY;
            case MULTIBLOCK_2X2, AR -> ChiselModelTemplates.ICE_CTM_2X2;
            case MULTIBLOCK_3X3 -> ChiselModelTemplates.ICE_CTM_3X3;
            case MULTIBLOCK_4X4 -> ChiselModelTemplates.ICE_CTM_4X4;
            case null -> throw new NullPointerException("Invalid ice CTM kind");
            default ->
                    throw new IllegalStateException("Unsupported ice CTM kind: " + variant.getModelHandler().ctmKind());
        };

        Identifier modelLocation = template.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        Identifier itemModelLocation = ModelTemplates.CUBE_ALL.create(
                ModelLocationUtils.getModelLocation(getBlock().asItem()),
                new TextureMapping().put(TextureSlot.ALL, VariantTextures.get(variant)),
                blockModels.modelOutput
        );
        blockModels.registerSimpleItemModel(getBlock(), itemModelLocation);
        ConnectedTextureBlockStateModelBuilder builder = new ConnectedTextureBlockStateModelBuilder()
                .modelLocation(modelLocation)
                .variant(variant)
                .element(new Vector3f(0, 0, 0), new Vector3f(16, 16, 16));
        for (Direction direction : Direction.values()) {
            builder.connectedFace(direction);
        }
        blockModels.blockStateOutput.accept(ConnectedTextureBlockStateDefinitionGenerator.dispatch(getBlock(), builder));
    }
}
