package io.github.chiselteam.chisel.datagen.model.generator.special.lavastone;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.ChiselTextureSlots;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateModelBuilder;
import io.github.chiselteam.chisel.datagen.model.generator.ctm.ARModelGenerator;
import net.minecraft.core.Direction;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import org.joml.Vector3f;

public class LavastoneARModelGenerator extends ARModelGenerator {
    @Override
    public TextureMapping getTextureMapping() {
        return VariantTextures.ctm(variant, textures -> textures.arTextures(VariantTextures.get(variant, "ar_variant")))
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.ALL, VariantTextures.get(variant))
                .putForced(ChiselTextureSlots.CTM_BASE, VariantTextures.get(variant, "bg"))
                .put(TextureSlot.LAYER0, VariantTextures.get(variant, "bg"))
                .put(TextureSlot.LAYER1, VariantTextures.get(variant));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        this.variant = variant;
        this.blockModels = blockModels;
        
        ResourceLocation modelLocation = ChiselModelTemplates.CTM_MULTIBLOCK_2x2_LAVA.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        blockModels.registerSimpleItemModel(getBlock(), modelLocation);
        blockModels.blockStateOutput.accept(ConnectedTextureBlockStateDefinitionGenerator.dispatch(variant.getBlock(), new ConnectedTextureBlockStateModelBuilder()
                .modelLocation(modelLocation)
                .renderOverlayOnAllFaces(true)
                .variant(variant)
                .baseTintIndex(-1)
                .baseEmissivity(15)
                .emissivity(0)
                .connectedFace(Direction.NORTH)
                .connectedFace(Direction.SOUTH)
                .connectedFace(Direction.EAST)
                .connectedFace(Direction.WEST)
                .connectedFace(Direction.UP)
                .connectedFace(Direction.DOWN)
                .element(new Vector3f(0, 0, 0), new Vector3f(16, 16, 16))
        ));
    }
}
