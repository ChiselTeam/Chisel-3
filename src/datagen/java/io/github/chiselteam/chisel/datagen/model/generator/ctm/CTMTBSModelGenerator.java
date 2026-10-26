package io.github.chiselteam.chisel.datagen.model.generator.ctm;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.BlockModels;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateModelBuilder;
import net.minecraft.core.Direction;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import org.joml.Vector3f;

public class CTMTBSModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        // The braced variants share identical top/bottom connected artwork.
        return VariantTextures.ctm(variant, textures -> textures
                        .tbsTopTextures(VariantTextures.get(variant, "top"), VariantTextures.get(variant, "top-ctm_cornerless"), VariantTextures.get(variant, "top-ctm_vertical"), VariantTextures.get(variant, "top-ctm_horizontal"), VariantTextures.get(variant, "top-ctm_corner"))
                        .tbsBottomTextures(VariantTextures.get(variant, "bottom"), VariantTextures.get(variant, "top-ctm_cornerless"), VariantTextures.get(variant, "top-ctm_vertical"), VariantTextures.get(variant, "top-ctm_horizontal"), VariantTextures.get(variant, "top-ctm_corner"))
                        .tbsSideTextures(VariantTextures.get(variant, "side"), VariantTextures.get(variant, "side-ctm_cornerless"), VariantTextures.get(variant, "side-ctm_vertical"), VariantTextures.get(variant, "side-ctm_horizontal"), VariantTextures.get(variant, "side-ctm_corner")))
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.ALL, VariantTextures.get(variant))
                .put(TextureSlot.TOP, VariantTextures.get(variant, "top"))
                .put(TextureSlot.BOTTOM, VariantTextures.get(variant, "bottom"))
                .put(TextureSlot.SIDE, VariantTextures.get(variant, "side"));
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        ResourceLocation modelLocation = ChiselModelTemplates.CTM_TBS.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        blockModels.registerSimpleItemModel(getBlock(), modelLocation);
        blockModels.blockStateOutput.accept(ConnectedTextureBlockStateDefinitionGenerator.dispatch(variant.getBlock(), new ConnectedTextureBlockStateModelBuilder()
                .modelLocation(modelLocation)
                .renderOverlayOnAllFaces(true)
                .variant(variant)
                .connectedFace(Direction.UP)
                .connectedFace(Direction.DOWN)
                .connectedFace(Direction.NORTH)
                .connectedFace(Direction.SOUTH)
                .connectedFace(Direction.EAST)
                .connectedFace(Direction.WEST)
                .element(new Vector3f(0, 0, 0), new Vector3f(16, 16, 16))
        ));
    }
}
