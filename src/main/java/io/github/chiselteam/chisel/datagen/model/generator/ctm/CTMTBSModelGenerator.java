package io.github.chiselteam.chisel.datagen.model.generator.ctm;

import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.ChiselModelTemplates;
import io.github.chiselteam.chisel.datagen.model.VariantModelGenerator;
import io.github.chiselteam.chisel.datagen.model.VariantTextures;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateModelBuilder;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

public class CTMTBSModelGenerator extends VariantModelGenerator {

    @Override
    public TextureMapping getTextureMapping() {
        // The braced variants share identical top/bottom connected artwork.
        return VariantTextures.ctm(variant, textures -> textures
                        .tbsTopTextures(VariantTextures.get(variant, "top").sprite(), VariantTextures.get(variant, "top-ctm_cornerless").sprite(), VariantTextures.get(variant, "top-ctm_vertical").sprite(), VariantTextures.get(variant, "top-ctm_horizontal").sprite(), VariantTextures.get(variant, "top-ctm_corner").sprite())
                        .tbsBottomTextures(VariantTextures.get(variant, "bottom").sprite(), VariantTextures.get(variant, "top-ctm_cornerless").sprite(), VariantTextures.get(variant, "top-ctm_vertical").sprite(), VariantTextures.get(variant, "top-ctm_horizontal").sprite(), VariantTextures.get(variant, "top-ctm_corner").sprite())
                        .tbsSideTextures(VariantTextures.get(variant, "side").sprite(), VariantTextures.get(variant, "side-ctm_cornerless").sprite(), VariantTextures.get(variant, "side-ctm_vertical").sprite(), VariantTextures.get(variant, "side-ctm_horizontal").sprite(), VariantTextures.get(variant, "side-ctm_corner").sprite()))
                .put(TextureSlot.PARTICLE, VariantTextures.get(variant))
                .put(TextureSlot.ALL, VariantTextures.get(variant))
                .put(TextureSlot.TOP, VariantTextures.get(variant, "top"))
                .put(TextureSlot.BOTTOM, VariantTextures.get(variant, "bottom"))
                .put(TextureSlot.SIDE, VariantTextures.get(variant, "side"));
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        super.generate(variant, blockModels);
        Identifier modelLocation = ChiselModelTemplates.CTM_TBS.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
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
