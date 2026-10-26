package io.github.chiselteam.chisel.datagen.model.generator.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.datagen.model.*;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateDefinitionGenerator;
import io.github.chiselteam.chisel.datagen.model.blockstate.ConnectedTextureBlockStateModelBuilder;
import net.minecraft.core.Direction;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import org.joml.Vector3f;

public class BookshelfModelGenerator extends VariantModelGenerator {
    private final String[] woods = {"_dark_oak", "_mangrove", "_spruce", "_jungle", "_acacia", "_cherry", "_bamboo", "_crimson", "_warped", "_birch", "_oak"};

    @Override
    public TextureMapping getTextureMapping() {
        return VariantTextures.ctm(variant, textures -> textures.horizontalTextures(
                        getMaterial("horizontal_none"), getMaterial("horizontal_both"),
                        getMaterial("horizontal_left"), getMaterial("horizontal_right")))
                .put(TextureSlot.PARTICLE, getBlockMaterial())
                .put(TextureSlot.TOP, getBlockMaterial())
                .put(TextureSlot.BOTTOM, getBlockMaterial())
                .put(TextureSlot.SIDE, getMaterial(""))
                .put(TextureSlot.LAYER0, getBlockMaterial())
                .put(TextureSlot.LAYER1, getBlockMaterial())
                .put(ChiselTextureSlots.CTM_BASE, getBlockMaterial());
    }

    @Override
    public void generate(Variant variant, BlockModels blockModels) {
        super.generate(variant, blockModels);
        ResourceLocation modelLocation = ChiselModelTemplates.CTM_HORIZONTAL_MULTI_PASS.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        blockModels.registerSimpleItemModel(getBlock(), modelLocation);
        blockModels.blockStateOutput.accept(ConnectedTextureBlockStateDefinitionGenerator.dispatch(variant.getBlock(), new ConnectedTextureBlockStateModelBuilder()
                .modelLocation(modelLocation)
                .renderOverlayOnAllFaces(false)
                .variant(variant)
                .connectedFace(Direction.NORTH)
                .connectedFace(Direction.SOUTH)
                .connectedFace(Direction.EAST)
                .connectedFace(Direction.WEST)
                .element(new Vector3f(0, 0, 0), new Vector3f(16, 16, 16))
        ));
    }

    private ResourceLocation getBlockMaterial() {
        String path = variant.getName();
        for(String wood : woods) {
            if(path.contains(wood)) {
                return ResourceLocation.withDefaultNamespace("block/%s_planks".formatted(wood.substring(1)));
            }
        }

        return ResourceLocation.withDefaultNamespace("missingno");
    }

    private ResourceLocation getMaterial(String suffix) {
        var texture = variant.getTextures().get(suffix);
        if (texture == null) {
            String path = cleanId(VariantTextures.getTexturePath(variant));
            texture = Chisel.prefix(suffix.isEmpty() ? path : path + "-" + suffix);
        }
        return texture;
    }

    private String cleanId(String path) {
        String ret = path;
        for(String wood : woods) {
            ret = ret.replace(wood, "");
        }
        return ret;
    }
}
