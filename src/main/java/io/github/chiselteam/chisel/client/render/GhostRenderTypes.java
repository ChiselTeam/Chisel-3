package io.github.chiselteam.chisel.client.render;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import net.minecraft.client.renderer.BindGroupLayouts;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.feature.ItemFeatureRenderer;
import net.minecraft.client.renderer.rendertype.*;
import net.neoforged.neoforge.client.event.RegisterRenderPipelinesEvent;

public final class GhostRenderTypes {
    private static final RenderPipeline TRIM_DECAL_PIPELINE = RenderPipeline.builder(RenderPipelines.ENTITY_SNIPPET)
            .withLocation(Chisel.prefix("pipeline/ghost_armor_decal"))
            .withShaderDefine("ALPHA_CUTOUT", 0.1F)
            .withShaderDefine("NO_OVERLAY")
            .withShaderDefine("PER_FACE_LIGHTING")
            .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT))
            .withCull(false)
            .withDepthStencilState(new DepthStencilState(CompareOp.EQUAL, false))
            .build();

    private static final RenderPipeline GLINT_PIPELINE = RenderPipeline.builder(
                    RenderPipelines.GLOBALS_SNIPPET)
            .withBindGroupLayout(BindGroupLayouts.MATRICES_PROJECTION)
            .withBindGroupLayout(BindGroupLayouts.FOG)
            .withLocation(Chisel.prefix("pipeline/ghost_armor_glint"))
            .withVertexShader("core/glint")
            .withFragmentShader(Chisel.prefix("core/ghost_glint"))
            .withShaderDefine("GHOST_OPACITY", GhostAppearance.OPACITY)
            .withBindGroupLayout(BindGroupLayouts.SAMPLER0)
            .withCull(false)
            .withColorTargetState(new ColorTargetState(BlendFunction.GLINT))
            .withVertexBinding(0, DefaultVertexFormat.POSITION_TEX)
            .withPrimitiveTopology(PrimitiveTopology.QUADS)
            .withDepthStencilState(new DepthStencilState(CompareOp.EQUAL, false))
            .build();

    private static final RenderType TRIM_DECAL = RenderType.create("chisel_ghost_armor_decal",
            RenderSetup.builder(TRIM_DECAL_PIPELINE)
                    .withTexture("Sampler0", Sheets.ARMOR_TRIMS_SHEET)
                    .useLightmap().useOverlay()
                    .setLayeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
                    .sortOnUpload().setOutline(RenderSetup.OutlineProperty.AFFECTS_OUTLINE)
                    .createRenderSetup());

    public static final RenderType ARMOR_GLINT = RenderType.create("chisel_ghost_armor_glint",
            RenderSetup.builder(GLINT_PIPELINE)
                    .withTexture("Sampler0", ItemFeatureRenderer.ENCHANTED_GLINT_ARMOR)
                    .setTextureTransform(TextureTransform.ARMOR_ENTITY_GLINT_TEXTURING)
                    .setLayeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
                    .createRenderSetup());

    private GhostRenderTypes() {
    }

    public static RenderType armorTrim(boolean decal) {
        return decal ? TRIM_DECAL : RenderTypes.armorTranslucent(Sheets.ARMOR_TRIMS_SHEET);
    }

    public static void registerPipelines(RegisterRenderPipelinesEvent event) {
        event.registerPipeline(TRIM_DECAL_PIPELINE);
        event.registerPipeline(GLINT_PIPELINE);
    }
}
