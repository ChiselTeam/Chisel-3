package chisel.lib.ctm.baked;

import chisel.lib.ctm.CTMKind;
import chisel.lib.ctm.CTMVariant;
import chisel.lib.ctm.MultiblockOffsetProvider;
import chisel.lib.ctm.util.CTMPartBuilder;
import chisel.lib.ctm.ConnectedTextureBlockModelPart;
import chisel.lib.ctm.geometry.MultiblockCTMKey;
import chisel.lib.ctm.logic.*;
import chisel.lib.ctm.util.MultiblockQuadSelector;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;

import java.util.*;

public class MultiblockCTMBlockStateModel extends AbstractConnectedTextureBlockStateModel<MultiblockCTMKey> {

    protected final Map<Direction, BakedQuad[]> multiblock2x2Quads;
    protected final Map<Direction, BakedQuad[]> multiblock3x3Quads;
    protected final Map<Direction, BakedQuad[]> multiblock4x4Quads;
    private final MultiblockQuadSelector selector;

    public MultiblockCTMBlockStateModel(Set<Direction> connectedFaces,
                                        Set<Direction> unculledFaces,
                                        boolean renderOverlayOnAllFaces,
                                        Map<Direction, BakedQuad[]> baseQuads,
                                        Map<Direction, BakedQuad[]> multiblock2x2Quads,
                                        Map<Direction, BakedQuad[]> multiblock3x3Quads,
                                        Map<Direction, BakedQuad[]> multiblock4x4Quads,
                                        TextureAtlasSprite particle,
                                        CTMVariant variant) {
        super(connectedFaces, unculledFaces, renderOverlayOnAllFaces, baseQuads, particle, variant);
        this.multiblock2x2Quads = multiblock2x2Quads;
        this.multiblock3x3Quads = multiblock3x3Quads;
        this.multiblock4x4Quads = multiblock4x4Quads;
        this.selector = createSelector(variant.kind());
    }

    @Override
    protected MultiblockCTMKey computeCTMKey(BlockAndTintGetter level, BlockPos pos, RandomSource random) {
        BlockPos offsetPos = MultiblockOffsetProvider.get().offsetFor(pos);

        CTMLogicR4 sharedR4 = CTMLogicR4.values()[randomIndex(pos, 4, 4)];
        CTMLogicR9 sharedR9 = CTMLogicR9.values()[randomIndex(pos, 9, 9)];
        CTMLogicR16 sharedR16 = CTMLogicR16.values()[randomIndex(pos, 16, 16)];

        int mb2x2 = 0; int mb3x3 = 0; int mb4x4 = 0;
        int v4 = 0; int v9 = 0; int v16 = 0;
        int r4 = 0; int r9 = 0; int r16 = 0;

        for(Direction face : Direction.values()) {
            mb2x2 |= MultiblockCTMKey.pack(face, CTMLogic2x2.get(pos, face));
            mb3x3 |= MultiblockCTMKey.pack(face, CTMLogic3x3.get(pos, face));
            mb4x4 |= MultiblockCTMKey.pack(face, CTMLogic4x4.get(pos, face));

            v4 |= MultiblockCTMKey.pack(face, CTMLogicV4.get(offsetPos, face));
            v9 |= MultiblockCTMKey.pack(face, CTMLogicV9.get(offsetPos, face));
            v16 |= MultiblockCTMKey.pack(face, CTMLogicV16.get(offsetPos, face));

            r4 |= MultiblockCTMKey.pack(face, sharedR4);
            r9 |= MultiblockCTMKey.pack(face, sharedR9);
            r16 |= MultiblockCTMKey.pack(face, sharedR16);
        }

        return new MultiblockCTMKey(mb2x2, mb3x3, mb4x4, v4, v9, v16, r4, r9, r16);
    }

    @Override
    protected ConnectedTextureBlockModelPart createPart(MultiblockCTMKey key) {
        return CTMPartBuilder.create(
                baseQuads,
                unculledFaces,
                particleMaterial,
                (side, faceQuads) -> {
                    if (shouldRenderMultiblockOverlay(side)) {
                        appendMultiblockQuad(key, side, faceQuads);
                    }
                }
        );
    }

    private boolean shouldRenderMultiblockOverlay(Direction side) {
        return isRandomVariant()
                || connectedFaces.contains(side)
                || renderOverlayOnAllFaces;
    }

    private boolean isRandomVariant() {
        return variant.kind().usesRandomTexture();
    }

    private void appendMultiblockQuad(MultiblockCTMKey key, Direction side, List<BakedQuad> faceQuads) {
        selector.append(key, side, faceQuads);
    }

    private MultiblockQuadSelector createSelector(CTMKind kind) {
        // V*: deterministic multiblock tiling that follows the offset provider.
        if (kind.isV4()) {
            return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                    multiblock2x2Quads.get(side),
                    key.v4(side).ordinal(),
                    faceQuads
            );
        }
        if (kind.isV9()) {
            return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                    multiblock3x3Quads.get(side),
                    key.v9(side).ordinal(),
                    faceQuads
            );
        }
        if (kind.isV16()) {
            return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                    multiblock4x4Quads.get(side),
                    key.v16(side).ordinal(),
                    faceQuads
            );
        }
        // R*: random per-position tiling.
        if (kind.isR4()) {
            return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                    multiblock2x2Quads.get(side),
                    key.r4(side).ordinal(),
                    faceQuads
            );
        }
        if (kind.isR9()) {
            return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                    multiblock3x3Quads.get(side),
                    key.r9(side).ordinal(),
                    faceQuads
            );
        }
        if (kind.isR16()) {
            return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                    multiblock4x4Quads.get(side),
                    key.r16(side).ordinal(),
                    faceQuads
            );
        }
        // Fixed multiblock (MULTIBLOCK_NxN and MULTI_LAYER_WATER_NxN).
        if (kind.usesMultiblockCTM()) {
            switch (kind.multiblockSize()) {
                case 2 -> {
                    return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                            multiblock2x2Quads.get(side),
                            key.mb2x2(side).ordinal(),
                            faceQuads
                    );
                }
                case 3 -> {
                    return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                            multiblock3x3Quads.get(side),
                            key.mb3x3(side).ordinal(),
                            faceQuads
                    );
                }
                case 4 -> {
                    return (key, side, faceQuads) -> CTMPartBuilder.appendIndexedQuad(
                            multiblock4x4Quads.get(side),
                            key.mb4x4(side).ordinal(),
                            faceQuads
                    );
                }
            }
        }
        return (_, _, _) -> {};
    }

    private static int randomIndex(BlockPos pos, int salt, int bound) {
        long seed = pos.asLong();
        seed ^= salt * 0x9E3779897F4A7C15L;
        seed ^= seed >>> 33;
        seed *= 0xff51afd7ed558ccdL;
        seed ^= seed >>> 33;
        seed *= 0xc4ceb9fe1a85ec53L;
        seed ^= seed >>> 33;

        return Math.floorMod((int) seed, bound);
    }
}
