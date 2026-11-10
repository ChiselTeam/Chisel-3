package io.github.chiselteam.chisel.client.render;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.renderpearl.api.pipeline.*;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.client.renderer.BindGroupLayouts;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.feature.ItemFeatureRenderer;
import net.minecraft.client.renderer.rendertype.*;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.neoforged.neoforge.client.event.RegisterRenderPipelinesEvent;

import java.util.function.Function;

public final class GhostRenderTypes {
    private static final RenderPipeline ARMOR_PIPELINE = armorPipeline("ghost_armor", false, false);
    private static final RenderPipeline ARMOR_GLINT_PIPELINE = armorPipeline("ghost_armor_glint", true, false);
    private static final RenderPipeline TRIM_DECAL_PIPELINE = armorPipeline("ghost_armor_decal", false, true);
    private static final RenderPipeline GLINT_PIPELINE = RenderPipeline.builder(RenderPipelines.GLOBALS_SNIPPET)
            .withBindGroupLayout(BindGroupLayouts.PROJECTION)
            .withBindGroupLayout(BindGroupLayouts.DYNAMIC_TRANSFORMS)
            .withBindGroupLayout(BindGroupLayouts.FOG)
            .withLocation(Chisel.prefix("pipeline/ghost_trimmed_armor_glint"))
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

    private static final Function<Identifier, RenderType> SKIN = Util.memoize(texture -> RenderType.create("chisel_ghost_skin",
            RenderSetup.builder(RenderPipelines.ENTITY_TRANSLUCENT)
                    .setOitPipelines(RenderPipelines.OIT_ENTITY)
                    .withTexture("Sampler0", texture).useLightmap().useOverlay()
                    .affectsCrumbling().sortOnUpload()
                    .setOutline(RenderSetup.OutlineProperty.AFFECTS_OUTLINE)
                    // Keep skin before its translucent equipment in the same model pass.
                    .withForcedSolidModelPhase().createRenderSetup()));
    private static final Function<Identifier, RenderType> ARMOR = Util.memoize(texture -> armorType(texture, ARMOR_PIPELINE, false));
    private static final Function<Identifier, RenderType> ARMOR_WITH_GLINT = Util.memoize(texture -> armorType(texture, ARMOR_GLINT_PIPELINE, true));
    private static final Function<Identifier, RenderType> TRIM_DECAL = Util.memoize(texture -> armorType(texture, TRIM_DECAL_PIPELINE, false));
    public static final RenderType ARMOR_GLINT = RenderType.create("chisel_ghost_trimmed_armor_glint",
            RenderSetup.builder(GLINT_PIPELINE)
                    .withTexture("Sampler0", ItemFeatureRenderer.ENCHANTED_GLINT_ARMOR)
                    .setTextureTransform(TextureTransform.ARMOR_ENTITY_GLINT_TEXTURING)
                    .setLayeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
                    .withForcedSolidModelPhase()
                    .createRenderSetup());

    private GhostRenderTypes() {
    }

    private static RenderPipeline armorPipeline(String name, boolean glint, boolean decal) {
        var builder = RenderPipeline.builder(RenderPipelines.ENTITY_SNIPPET)
                .withLocation(Chisel.prefix("pipeline/" + name))
                .withShaderDefine("ALPHA_CUTOUT", 0.1F)
                .withShaderDefine("NO_OVERLAY")
                .withShaderDefine("PER_FACE_LIGHTING")
                .withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT))
                .withCull(false);
        if (glint) builder.withSnippet(RenderPipelines.GLINT_SNIPPET)
                .withFragmentShader(Chisel.prefix("core/ghost_entity"))
                .withShaderDefine("GHOST_OPACITY", GhostAppearance.OPACITY);
        if (decal) builder.withDepthStencilState(new DepthStencilState(CompareOp.EQUAL, false));
        return builder.build();
    }

    private static RenderType armorType(Identifier texture, RenderPipeline pipeline, boolean glint) {
        var setup = RenderSetup.builder(pipeline).withTexture("Sampler0", texture)
                .useLightmap().useOverlay()
                .setLayeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
                .sortOnUpload().setOutline(RenderSetup.OutlineProperty.AFFECTS_OUTLINE)
                // These blended layers use the legacy model pass, not an OIT pipeline set.
                .withForcedSolidModelPhase();
        if (glint) setup.withTexture("GlintSampler", ItemFeatureRenderer.ENCHANTED_GLINT_ARMOR)
                .setTextureTransform(TextureTransform.ARMOR_ENTITY_GLINT_TEXTURING);
        return RenderType.create("chisel_ghost_armor", setup.createRenderSetup());
    }

    public static RenderType skin(Identifier texture) {
        return SKIN.apply(texture);
    }

    public static RenderType armor(Identifier texture, boolean glint) {
        return (glint ? ARMOR_WITH_GLINT : ARMOR).apply(texture);
    }

    public static RenderType armorTrim(Identifier texture, boolean decal) {
        return (decal ? TRIM_DECAL : ARMOR).apply(texture);
    }

    public static void registerPipelines(RegisterRenderPipelinesEvent event) {
        event.registerPipeline(ARMOR_PIPELINE);
        event.registerPipeline(ARMOR_GLINT_PIPELINE);
        event.registerPipeline(TRIM_DECAL_PIPELINE);
        event.registerPipeline(GLINT_PIPELINE);
    }
}
