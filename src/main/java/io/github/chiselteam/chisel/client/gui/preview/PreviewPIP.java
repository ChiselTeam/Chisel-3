package io.github.chiselteam.chisel.client.gui.preview;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.QuadInstance;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelPart;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import org.joml.Quaternionf;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreviewPIP extends PictureInPictureRenderer<PreviewPIPState> {

    @SuppressWarnings("FieldCanBeLocal")
    private final long ANSWER_TO_LIFE_THE_UNIVERSE_AND_EVERYTHING = 42L;

    @Override
    public @NonNull Class<PreviewPIPState> getRenderStateClass() {
        return PreviewPIPState.class;
    }

    @Override
    protected float getTranslateY(int height, int guiScale) {
        return height / 2.0F;

    }

    @Override
    protected void renderToTexture(@NonNull PreviewPIPState state, @NonNull PoseStack pose, SubmitNodeCollector collector) {
        float scale = 30 * state.zoom() * state.previewScale();
        pose.scale(scale, scale, scale);
        pose.mulPose(new Quaternionf().rotateX((float) Math.toDegrees(180 + state.rotX())).rotateY((float) Math.toDegrees(state.rotY())));
        pose.translate(-state.centerX(), -state.centerY(), -0.5F);

        var modelSet = Minecraft.getInstance().getModelManager().getBlockStateModelSet();
        var getter = new PreviewGetter(state.blockState(), state.positions());
        var random = RandomSource.create();

        for(int[] position : state.positions()) {
            pose.pushPose();
            var pos = new BlockPos(position[0], position[1], position[2]);
            var block = getter.getBlockState(pos);
            var model = modelSet.get(block);
            pose.translate(pos.getX(), pos.getY(), pos.getZ());
            random.setSeed(ANSWER_TO_LIFE_THE_UNIVERSE_AND_EVERYTHING);
            List<BlockStateModelPart> parts = new ArrayList<>();
            model.collectParts(getter, pos, block, random, parts);

            parts.forEach(part -> {
                Arrays.stream(Direction.values()).forEach(side -> {
                    var neighborPos = pos.relative(side);
                    var neighborState = getter.getBlockState(neighborPos);

                    if(!block.skipRendering(neighborState, side)) {
                        bakeQuads(side, part, pose, collector);
                    }
                });

                bakeQuads(null, part, pose, collector);
            });
            pose.popPose();
        }
    }

    private void bakeQuads(Direction side, BlockStateModelPart part, PoseStack pose, SubmitNodeCollector collector) {
        part.getQuads(side).forEach(quad -> {
            collector.submitCustomGeometry(pose, getRenderTypeForLayer(quad.materialInfo().layer()), (entry, buffer) -> {
                var quads = new QuadInstance();
                quads.setColor(-1);
                quads.setLightCoords(15728880);

                buffer.putBakedQuad(entry, quad, quads);
            });
        });
    }

    private RenderType getRenderTypeForLayer(ChunkSectionLayer layer) {
        return switch(layer) {
            case SOLID -> RenderTypes.solidMovingBlock();
            case CUTOUT -> RenderTypes.cutoutMovingBlock();
            case TRANSLUCENT -> RenderTypes.translucentMovingBlock();
        };
    }

    @Override
    protected @NonNull String getTextureLabel() {
        return "Block preview";
    }
}
