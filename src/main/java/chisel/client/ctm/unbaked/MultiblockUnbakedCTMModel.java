package chisel.client.ctm.unbaked;

import chisel.client.ctm.AbstractUnbakedConnectedTextureBlockStateModel;
import chisel.client.ctm.baked.MultiblockCTMBlockStateModel;
import chisel.client.ctm.UnbakedConnectedTextureBlockStateModel;
import chisel.client.ctm.logic.CTMLogic;
import chisel.client.ctm.logic.CTMLogicV4;
import chisel.client.ctm.logic.CTMLogicV9;
import chisel.client.ctm.logic.CTMLogicV16;
import chisel.core.variant.Variant;
import chisel.core.variant.VariantModelType;
import com.mojang.datafixers.util.Pair;
import com.mojang.math.Quadrant;
import com.mojang.math.Transformation;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.client.renderer.block.dispatch.ModelState;
import net.minecraft.client.renderer.block.dispatch.Variant.SimpleModelState;
import net.minecraft.client.resources.model.ModelBaker;
import net.minecraft.client.resources.model.ResolvedModel;
import net.minecraft.client.resources.model.cuboid.CuboidFace;
import net.minecraft.client.resources.model.cuboid.FaceBakery;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.resources.model.sprite.TextureSlots;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.client.model.NeoForgeModelProperties;
import net.neoforged.neoforge.client.model.UnbakedElementsHelper;
import net.neoforged.neoforge.client.model.block.CustomUnbakedBlockStateModel;
import org.joml.Vector3f;
import org.jspecify.annotations.NonNull;

import java.util.*;

public class MultiblockUnbakedCTMModel extends AbstractUnbakedConnectedTextureBlockStateModel {

    public MultiblockUnbakedCTMModel(Identifier modelLocation, Pair<Vector3f, Vector3f> element, Set<Direction> connectedFaces, boolean renderOverlayOnAllFaces, Variant variant, int baseTintIndex, int baseEmissivity, int tintIndex, int emissivity) {
        super(modelLocation, element, connectedFaces, renderOverlayOnAllFaces, variant, baseTintIndex, baseEmissivity, tintIndex, emissivity);
    }

    @Override
    public @NonNull MapCodec<? extends CustomUnbakedBlockStateModel> codec() {
        return UnbakedConnectedTextureBlockStateModel.CODEC;
    }

    @Override
    public @NonNull BlockStateModel bake(@NonNull ModelBaker baker) {
        ResolvedModel model = baker.getModel(modelLocation);
        ModelState state = SimpleModelState.DEFAULT.asModelState();
        Transformation rootTransform = model.getTopAdditionalProperties().getOrDefault(NeoForgeModelProperties.TRANSFORM, Transformation.IDENTITY);
        if (!rootTransform.isIdentity()) {
            state = UnbakedElementsHelper.composeRootTransformIntoModelState(state, rootTransform);
        }

        TextureSlots textureSlots = model.getTopTextureSlots();
        Material baseMaterial = textureSlots.getMaterial("base_texture");
        Material overlayMaterial = textureSlots.getMaterial("overlay_texture");
        Material particleMaterial = textureSlots.getMaterial("particle");
        Material overlay2x2Material = textureSlots.getMaterial("overlay_2x2");
        Material overlay3x3Material = textureSlots.getMaterial("overlay_3x3");
        Material overlay4x4Material = textureSlots.getMaterial("overlay_4x4");
        Material overlayV4Material = textureSlots.getMaterial("overlay_v4");
        Material overlayV9Material = textureSlots.getMaterial("overlay_v9");
        Material overlayV16Material = textureSlots.getMaterial("overlay_v16");
        Material overlayR4Material = textureSlots.getMaterial("overlay_r4");
        Material overlayR9Material = textureSlots.getMaterial("overlay_r9");
        Material overlayR16Material = textureSlots.getMaterial("overlay_r16");

        Material layer0Material = textureSlots.getMaterial("layer0");
        Material layer1Material = textureSlots.getMaterial("layer1");

        Material.Baked bakedBase = (baseMaterial != null ? baker.materials().get(baseMaterial, model) : (layer0Material != null ? baker.materials().get(layer0Material, model) : null));
        Material.Baked bakedOverlay = overlayMaterial != null ? baker.materials().get(overlayMaterial, model) : null;
        Material.Baked bakedParticle = particleMaterial != null ? baker.materials().get(particleMaterial, model) : (bakedBase != null ? bakedBase : bakedOverlay);
        Material.Baked bakedOverlay2x2 = overlay2x2Material != null ? baker.materials().get(overlay2x2Material, model) : (layer1Material != null && variant.getModelType() == VariantModelType.MULTI_LAYER_WATER_2X2 ? baker.materials().get(layer1Material, model) : null);
        Material.Baked bakedOverlay3x3 = overlay3x3Material != null ? baker.materials().get(overlay3x3Material, model) : (layer1Material != null && variant.getModelType() == VariantModelType.MULTI_LAYER_WATER_3X3 ? baker.materials().get(layer1Material, model) : null);
        Material.Baked bakedOverlay4x4 = overlay4x4Material != null ? baker.materials().get(overlay4x4Material, model) : (layer1Material != null && variant.getModelType() == VariantModelType.MULTI_LAYER_WATER_4X4 ? baker.materials().get(layer1Material, model) : null);
        Material.Baked bakedOverlayV4 = overlayV4Material != null ? baker.materials().get(overlayV4Material, model) : (bakedOverlay2x2 != null ? bakedOverlay2x2 : (layer1Material != null && variant.getModelType() == VariantModelType.V4 ? baker.materials().get(layer1Material, model) : null));
        Material.Baked bakedOverlayV9 = overlayV9Material != null ? baker.materials().get(overlayV9Material, model) : (bakedOverlay3x3 != null ? bakedOverlay3x3 : (layer1Material != null && variant.getModelType() == VariantModelType.V9 ? baker.materials().get(layer1Material, model) : null));
        Material.Baked bakedOverlayV16 = overlayV16Material != null ? baker.materials().get(overlayV16Material, model) : (bakedOverlay4x4 != null ? bakedOverlay4x4 : (layer1Material != null && variant.getModelType() == VariantModelType.V16 ? baker.materials().get(layer1Material, model) : null));
        Material.Baked bakedOverlayR4 = overlayR4Material != null ? baker.materials().get(overlayR4Material, model) : (bakedOverlay2x2 != null ? bakedOverlay2x2 : (layer1Material != null && variant.getModelType() == VariantModelType.R4 ? baker.materials().get(layer1Material, model) : null));
        Material.Baked bakedOverlayR9 = overlayR9Material != null ? baker.materials().get(overlayR9Material, model) : (bakedOverlay3x3 != null ? bakedOverlay3x3 : (layer1Material != null && variant.getModelType() == VariantModelType.R9 ? baker.materials().get(layer1Material, model) : null));
        Material.Baked bakedOverlayR16 = overlayR16Material != null ? baker.materials().get(overlayR16Material, model) : (bakedOverlay4x4 != null ? bakedOverlay4x4 : (layer1Material != null && variant.getModelType() == VariantModelType.R16 ? baker.materials().get(layer1Material, model) : null));

        Map<Direction, BakedQuad[]> baseQuads = new EnumMap<>(Direction.class);
        Map<Direction, BakedQuad[]> multiblock2x2Quads = new EnumMap<>(Direction.class);
        Map<Direction, BakedQuad[]> multiblock3x3Quads = new EnumMap<>(Direction.class);
        Map<Direction, BakedQuad[]> multiblock4x4Quads = new EnumMap<>(Direction.class);
        Set<Direction> unculledFaces = new HashSet<>();

        Vector3f from = element.getFirst();
        Vector3f to = element.getSecond();
        int center = 8;

        for (Direction face : Direction.values()) {
            Direction cull = getCullface(face, from, to);
            Direction[] planeDirections = CTMLogic.AXIS_PLANE_DIRECTIONS[face.getAxis().ordinal()];

            List<BakedQuad> baseQuadList = new ArrayList<>();
            for (int c = 0; c < 4; c++) {
                Vec3i corner = face.getUnitVec3i().offset(planeDirections[c].getUnitVec3i()).offset(planeDirections[(c + 1) % 4].getUnitVec3i()).offset(1, 1, 1).multiply(8);
                Vector3f qFrom = new Vector3f(
                        Math.clamp(Math.min(center - (16 - to.x()), (float) corner.getX() + from.x()), 0, 16),
                        Math.clamp(Math.min(center - (16 - to.y()), (float) corner.getY() + from.y()), 0, 16),
                        Math.clamp(Math.min(center - (16 - to.z()), (float) corner.getZ() + from.z()), 0, 16)
                );
                Vector3f qTo = new Vector3f(
                        to.x() < center ? to.x() : Math.max(center, (float) corner.getX() - (16 - to.x())),
                        to.y() < center ? to.y() : Math.max(center, (float) corner.getY() - (16 - to.y())),
                        to.z() < center ? to.z() : Math.max(center, (float) corner.getZ() - (16 - to.z()))
                );

                if (bakedBase != null) {
                    CuboidFace.UVs qUvs = getRelativeUVs(face, qFrom, qTo);
                    CuboidFace baseFace = new CuboidFace(cull, baseTintIndex, "", CTMLogic.NONE.remapUVs(qUvs), Quadrant.R0);
                    baseQuadList.add(FaceBakery.bakeQuad(baker, qFrom, qTo, baseFace, bakedBase, face, state, null, true, baseEmissivity));
                }
            }
            if (!baseQuadList.isEmpty()) {
                baseQuads.put(face, baseQuadList.toArray(new BakedQuad[0]));
            }

            CuboidFace.UVs faceUvs = getRelativeUVs(face, from, to);

            if ((variant.getModelType() == VariantModelType.MULTIBLOCK_2X2 || variant.getModelType() == VariantModelType.V4 || variant.getModelType() == VariantModelType.R4 || variant.getModelType() == VariantModelType.MULTI_LAYER_WATER_2X2) && (bakedOverlayV4 != null || bakedOverlayR4 != null || bakedOverlay2x2 != null)) {
                Material.Baked mat = bakedOverlayV4 != null ? bakedOverlayV4 : (bakedOverlayR4 != null ? bakedOverlayR4 : bakedOverlay2x2);
                BakedQuad[] quads = new BakedQuad[CTMLogicV4.values().length];
                Vector3f[] offsets = getOffsets(face, variant.getModelType(), from, to);
                for (CTMLogicV4 logic : CTMLogicV4.values()) {
                    CuboidFace connFace = new CuboidFace(cull, tintIndex, "", logic.remapUVs(faceUvs), Quadrant.R0);
                    if (connFace.cullForDirection() == null) unculledFaces.add(face);
                    quads[logic.ordinal()] = FaceBakery.bakeQuad(baker, offsets[0], offsets[1], connFace, mat, face, state, null, true, emissivity);
                }
                multiblock2x2Quads.put(face, quads);
            }

            if ((variant.getModelType() == VariantModelType.MULTIBLOCK_3X3 || variant.getModelType() == VariantModelType.V9 || variant.getModelType() == VariantModelType.R9 || variant.getModelType() == VariantModelType.MULTI_LAYER_WATER_3X3) && (bakedOverlayV9 != null || bakedOverlayR9 != null || bakedOverlay3x3 != null)) {
                Material.Baked mat = bakedOverlayV9 != null ? bakedOverlayV9 : (bakedOverlayR9 != null ? bakedOverlayR9 : bakedOverlay3x3);
                BakedQuad[] quads = new BakedQuad[CTMLogicV9.values().length];
                Vector3f[] offsets = getOffsets(face, variant.getModelType(), from, to);
                for (CTMLogicV9 logic : CTMLogicV9.values()) {
                    CuboidFace connFace = new CuboidFace(cull, tintIndex, "", logic.remapUVs(faceUvs), Quadrant.R0);
                    if (connFace.cullForDirection() == null) unculledFaces.add(face);
                    quads[logic.ordinal()] = FaceBakery.bakeQuad(baker, offsets[0], offsets[1], connFace, mat, face, state, null, true, emissivity);
                }
                multiblock3x3Quads.put(face, quads);
            }

            if ((variant.getModelType() == VariantModelType.MULTIBLOCK_4X4 || variant.getModelType() == VariantModelType.V16 || variant.getModelType() == VariantModelType.R16 || variant.getModelType() == VariantModelType.MULTI_LAYER_WATER_4X4) && (bakedOverlayV16 != null || bakedOverlayR16 != null || bakedOverlay4x4 != null)) {
                Material.Baked mat = bakedOverlayV16 != null ? bakedOverlayV16 : (bakedOverlayR16 != null ? bakedOverlayR16 : bakedOverlay4x4);
                BakedQuad[] quads = new BakedQuad[CTMLogicV16.values().length];
                Vector3f[] offsets = getOffsets(face, variant.getModelType(), from, to);

                for (CTMLogicV16 logic : CTMLogicV16.values()) {
                    CuboidFace connFace = new CuboidFace(cull, tintIndex, "", logic.remapUVs(faceUvs), Quadrant.R0);
                    if (connFace.cullForDirection() == null) unculledFaces.add(face);
                    quads[logic.ordinal()] = FaceBakery.bakeQuad(baker, offsets[0], offsets[1], connFace, mat, face, state, null, true, emissivity);
                }
                multiblock4x4Quads.put(face, quads);
            }
        }

        return new MultiblockCTMBlockStateModel(connectedFaces, unculledFaces, renderOverlayOnAllFaces, baseQuads, multiblock2x2Quads, multiblock3x3Quads, multiblock4x4Quads, bakedParticle != null ? bakedParticle.sprite() : null, variant);
    }

    private Vector3f[] getOffsets(Direction face, VariantModelType type, Vector3f from, Vector3f to) {
        float offset = 0.01f;
        Vector3f[] offsets = new Vector3f[] {
                new Vector3f(from), new Vector3f(to)
        };

        if(type == VariantModelType.MULTI_LAYER_WATER_2X2 || type == VariantModelType.MULTI_LAYER_WATER_3X3 || type == VariantModelType.MULTI_LAYER_WATER_4X4) {
            switch (face) {
                case DOWN -> {
                    offsets[0].y -= offset;
                    offsets[1].y -= offset;
                }
                case UP -> {
                    offsets[0].y += offset;
                    offsets[1].y += offset;
                }
                case NORTH -> {
                    offsets[0].z -= offset;
                    offsets[1].z -= offset;
                }
                case SOUTH -> {
                    offsets[0].z += offset;
                    offsets[1].z += offset;
                }
                case WEST -> {
                    offsets[0].x -= offset;
                    offsets[1].x -= offset;
                }
                case EAST -> {
                    offsets[0].x += offset;
                    offsets[1].x += offset;
                }
            }
        }
        return offsets;
    }
}
