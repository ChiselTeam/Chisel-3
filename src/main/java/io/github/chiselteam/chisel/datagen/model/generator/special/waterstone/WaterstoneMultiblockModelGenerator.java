package io.github.chiselteam.chisel.datagen.model.generator.special.waterstone;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateModelBuilder;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

public class WaterstoneMultiblockModelGenerator extends VariantModelGenerator {

    private final int size;

    public WaterstoneMultiblockModelGenerator(int size) {
        this.size = size;
    }

    @Override
    public TextureMapping getTextureMapping() {
        return VariantTextures.ctm(variant, textures -> {
                    Identifier base = VariantTextures.get(variant, size + "x" + size).sprite();
                    switch (size) {
                        case 2 -> textures.multiblock2x2Textures(base);
                        case 3 -> textures.multiblock3x3Textures(base);
                        case 4 -> textures.multiblock4x4Textures(base);
                        default -> throw new IllegalStateException("Unsupported multiblock size: " + size);
                    }
                })
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.ALL, VariantTextures.get(variant))
                .put(TextureSlot.LAYER0, new Material(Chisel.prefix("block/%s/water_still".formatted(variant.getFamily().getFamilyName()))))
                .put(TextureSlot.LAYER1, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        super.generate(variant, blockModels);
        ModelTemplate template = size == 2 ? ChiselModelTemplates.CTM_MULTIBLOCK_2x2_WATER : (size == 3 ? ChiselModelTemplates.CTM_MULTIBLOCK_3x3_WATER : ChiselModelTemplates.CTM_MULTIBLOCK_4x4_WATER);
        Identifier modelLocation = template.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        blockModels.registerSimpleItemModel(getBlock(), modelLocation);
        blockModels.blockStateOutput.accept(ConnectedTextureBlockStateDefinitionGenerator.dispatch(variant.getBlock(), new ConnectedTextureBlockStateModelBuilder()
                .modelLocation(modelLocation)
                .renderOverlayOnAllFaces(true)
                .variant(variant)
                .baseTintIndex(0)
                .connectedFace(Direction.UP)
                .connectedFace(Direction.DOWN)
                .connectedFace(Direction.NORTH)
                .connectedFace(Direction.WEST)
                .connectedFace(Direction.EAST)
                .connectedFace(Direction.SOUTH)
                .element(new Vector3f(0, 0, 0), new Vector3f(16, 16, 16))
        ));
    }
}
