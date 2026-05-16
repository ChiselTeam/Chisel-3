package chisel.client.ctm.baked;

import chisel.client.ctm.AbstractConnectedTextureBlockStateModel;
import chisel.client.ctm.ConnectedTextureBlockModelPart;
import chisel.client.ctm.logic.*;
import chisel.core.variant.Variant;
import chisel.events.client.OffsetToolClientHandler;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;

import java.util.*;

public class MultiblockCTMBlockStateModel extends AbstractConnectedTextureBlockStateModel {

    protected final Map<Direction, BakedQuad[]> multiblock2x2Quads;
    protected final Map<Direction, BakedQuad[]> multiblock3x3Quads;
    protected final Map<Direction, BakedQuad[]> multiblock4x4Quads;

    public MultiblockCTMBlockStateModel(Set<Direction> connectedFaces, Set<Direction> unculledFaces, boolean renderOverlayOnAllFaces, Map<Direction, BakedQuad[]> baseQuads,
                                        Map<Direction, BakedQuad[]> multiblock2x2Quads,
                                        Map<Direction, BakedQuad[]> multiblock3x3Quads,
                                        Map<Direction, BakedQuad[]> multiblock4x4Quads,
                                        TextureAtlasSprite particle, Variant variant) {
        super(connectedFaces, unculledFaces, renderOverlayOnAllFaces, baseQuads, particle, variant);
        this.multiblock2x2Quads = multiblock2x2Quads;
        this.multiblock3x3Quads = multiblock3x3Quads;
        this.multiblock4x4Quads = multiblock4x4Quads;
    }

    @Override
    protected CTMData computeCTMData(BlockAndTintGetter level, BlockPos pos, RandomSource random) {
        CTMLogic2x2[] logic2x2 = new CTMLogic2x2[6];
        CTMLogic3x3[] logic3x3 = new CTMLogic3x3[6];
        CTMLogic4x4[] logic4x4 = new CTMLogic4x4[6];
        CTMLogicV4[] logicV4 = new CTMLogicV4[6];
        CTMLogicV9[] logicV9 = new CTMLogicV9[6];
        CTMLogicV16[] logicV16 = new CTMLogicV16[6];
        CTMLogicR4[] logicR4 = new CTMLogicR4[6];
        CTMLogicR9[] logicR9 = new CTMLogicR9[6];
        CTMLogicR16[] logicR16 = new CTMLogicR16[6];

        BlockPos offsetPos = pos.offset(OffsetToolClientHandler.getOffset(new ChunkPos(pos.getX() >> 4, pos.getZ() >> 4)));

        // R-variants randomly pick ONE of N textures per block and use it on all faces.
        CTMLogicR4 sharedR4 = CTMLogicR4.get(random);
        CTMLogicR9 sharedR9 = CTMLogicR9.get(random);
        CTMLogicR16 sharedR16 = CTMLogicR16.get(random);

        for (Direction face : Direction.values()) {
            int i = face.get3DDataValue();
            logic2x2[i] = CTMLogic2x2.get(pos, face);
            logic3x3[i] = CTMLogic3x3.get(pos, face);
            logic4x4[i] = CTMLogic4x4.get(pos, face);
            logicV4[i] = CTMLogicV4.get(offsetPos, face);
            logicV9[i] = CTMLogicV9.get(offsetPos, face);
            logicV16[i] = CTMLogicV16.get(offsetPos, face);
            logicR4[i] = sharedR4;
            logicR9[i] = sharedR9;
            logicR16[i] = sharedR16;
        }

        return new CTMData(variant, null, logic2x2, logic3x3, logic4x4, null, null, logicV4, logicV9, logicV16, logicR4, logicR9, logicR16);
    }

    @Override
    protected ConnectedTextureBlockModelPart createPart(CTMData data) {
        Map<Direction, List<BakedQuad>> quadsMap = new EnumMap<>(Direction.class);
        List<BakedQuad> unculled = new ArrayList<>();
        int flags = 0;

        for (Direction side : Direction.values()) {
            List<BakedQuad> faceQuads = new ArrayList<>(2);

            BakedQuad[] base = baseQuads.get(side);
            if (base != null) {
                for (BakedQuad quad : base) {
                    if (quad != null) {
                        faceQuads.add(quad);
                    }
                }
            }

            // R-variants always render on all faces; other connected types respect the connectedFaces gate.
            boolean isRVariant = switch (variant.getModelType()) {
                case R4, R9, R16 -> true;
                default -> false;
            };
            if (isRVariant || connectedFaces.contains(side) || renderOverlayOnAllFaces) {
                switch (variant.getModelType()) {
                    case MULTIBLOCK_2X2, MULTI_LAYER_WATER_2X2 -> {
                        CTMLogic2x2 logic = data.get2x2(side);
                        BakedQuad[] quads = multiblock2x2Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case MULTIBLOCK_3X3, MULTI_LAYER_WATER_3X3 -> {
                        CTMLogic3x3 logic = data.get3x3(side);
                        BakedQuad[] quads = multiblock3x3Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case MULTIBLOCK_4X4, MULTI_LAYER_WATER_4X4 -> {
                        CTMLogic4x4 logic = data.get4x4(side);
                        BakedQuad[] quads = multiblock4x4Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case V4 -> {
                        CTMLogicV4 logic = data.getV4(side);
                        BakedQuad[] quads = multiblock2x2Quads.get(side);
                        if (quads != null && logic != null) {
                            // V4 uses 2x2 logic under the hood
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case V9 -> {
                        CTMLogicV9 logic = data.getV9(side);
                        BakedQuad[] quads = multiblock3x3Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case V16 -> {
                        CTMLogicV16 logic = data.getV16(side);
                        BakedQuad[] quads = multiblock4x4Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case R4 -> {
                        CTMLogicR4 logic = data.getR4(side);
                        BakedQuad[] quads = multiblock2x2Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case R9 -> {
                        CTMLogicR9 logic = data.getR9(side);
                        BakedQuad[] quads = multiblock3x3Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                    case R16 -> {
                        CTMLogicR16 logic = data.getR16(side);
                        BakedQuad[] quads = multiblock4x4Quads.get(side);
                        if (quads != null && logic != null) {
                            BakedQuad quad = quads[logic.ordinal()];
                            if (quad != null) faceQuads.add(quad);
                        }
                    }
                }
            }

            for (BakedQuad q : faceQuads) {
                if (q != null) {
                    flags |= q.materialInfo().flags();
                }
            }

            quadsMap.put(side, List.copyOf(faceQuads));

            if (unculledFaces.contains(side)) {
                unculled.addAll(faceQuads);
            }
        }

        return new ConnectedTextureBlockModelPart(
                quadsMap,
                List.copyOf(unculled),
                flags,
                new Material.Baked(particle, false)
        );
    }
}
