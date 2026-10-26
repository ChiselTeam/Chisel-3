package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateModelBuilder;
import net.minecraft.core.Direction;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import org.joml.Vector3f;

public class GlassModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        return VariantTextures.standard(variant)
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        ResourceLocation modelLocation = ChiselModelTemplates.CTM_OVERLAY_ONLY.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        ResourceLocation itemModelLocation = ModelTemplates.CUBE_ALL.create(
                ModelLocationUtils.getModelLocation(getBlock().asItem()),
                new TextureMapping().put(TextureSlot.ALL, VariantTextures.get(variant)),
                blockModels.modelOutput
        );
        blockModels.registerSimpleItemModel(getBlock(), itemModelLocation);
        blockModels.blockStateOutput.accept(ConnectedTextureBlockStateDefinitionGenerator.dispatch(getBlock(),
                new ConnectedTextureBlockStateModelBuilder()
                        .modelLocation(modelLocation)
                        .variant(variant)
                        .connectedFace(Direction.UP)
                        .connectedFace(Direction.DOWN)
                        .connectedFace(Direction.NORTH)
                        .connectedFace(Direction.WEST)
                        .connectedFace(Direction.EAST)
                        .connectedFace(Direction.SOUTH)
                        .element(new Vector3f(0, 0, 0), new Vector3f(16, 16, 16))));
    }
}
