package io.github.chiselteam.chisel.client.model.ctm;

import io.github.chiselteam.chisel.client.ChiselModelTemplates;
import io.github.chiselteam.chisel.client.ChiselTextureSlots;
import io.github.chiselteam.chisel.datagen.model.ConnectedTextureBlockStateModelBuilder;
import io.github.chiselteam.chisel.core.variant.Variant;
import io.github.chiselteam.chisel.core.variant.VariantModel;
import io.github.chiselteam.chisel.datagen.model.ConnectedTextureBlockStateDefinitionGenerator;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

public class R16Model extends VariantModel {

    @Override
    public TextureMapping getTextureMapping() {
        return (new TextureMapping())
                .put(TextureSlot.PARTICLE, variant.getMaterial())
                .put(TextureSlot.ALL, variant.getMaterial())
                .put(ChiselTextureSlots.CTM_OVERLAY_4X4, variant.getMaterial("r16"));
    }

    @Override
    public void generate(Variant variant, BlockModelGenerators blockModels) {
        super.generate(variant, blockModels);
        Identifier modelLocation = ChiselModelTemplates.CTM_MULTIBLOCK_4x4.create(getBlock(), getTextureMapping(), blockModels.modelOutput);
        blockModels.registerSimpleItemModel(getBlock(), modelLocation);
        blockModels.blockStateOutput.accept(ConnectedTextureBlockStateDefinitionGenerator.dispatch(variant.getBlock(), new ConnectedTextureBlockStateModelBuilder()
                .modelLocation(modelLocation)
                .renderOverlayOnAllFaces(true)
                .variant(variant)
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
