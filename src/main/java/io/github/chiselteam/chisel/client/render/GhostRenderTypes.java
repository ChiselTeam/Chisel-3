package io.github.chiselteam.chisel.client.render;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import io.github.chiselteam.chisel.Chisel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.Util;
import net.neoforged.neoforge.client.event.RegisterShadersEvent;
import java.io.IOException;
import java.util.function.Function;

public abstract class GhostRenderTypes extends RenderType {
    private static ShaderInstance glintShader;
    private static final Function<ResourceLocation, RenderType> ARMOR = Util.memoize(texture -> armor(texture, false));
    private static final RenderType TRIM_DECAL = armor(Sheets.ARMOR_TRIMS_SHEET, true);
    public static final RenderType ARMOR_GLINT = create("chisel_ghost_armor_glint",
            DefaultVertexFormat.POSITION_TEX, VertexFormat.Mode.QUADS, 1536,
            CompositeState.builder()
                    .setShaderState(new ShaderStateShard(() -> glintShader))
                    .setTextureState(new TextureStateShard(ItemRenderer.ENCHANTED_GLINT_ENTITY, true, false))
                    .setWriteMaskState(COLOR_WRITE).setCullState(NO_CULL)
                    .setDepthTestState(EQUAL_DEPTH_TEST).setTransparencyState(GLINT_TRANSPARENCY)
                    .setTexturingState(ENTITY_GLINT_TEXTURING).setLayeringState(VIEW_OFFSET_Z_LAYERING)
                    .createCompositeState(false));

    private GhostRenderTypes(String name, VertexFormat format, VertexFormat.Mode mode, int size,
                             boolean crumbling, boolean sort, Runnable setup, Runnable clear) {
        super(name, format, mode, size, crumbling, sort, setup, clear);
    }

    private static RenderType armor(ResourceLocation texture, boolean decal) {
        return create(decal ? "chisel_ghost_armor_decal" : "chisel_ghost_armor", DefaultVertexFormat.NEW_ENTITY,
                VertexFormat.Mode.QUADS, 1536, true, true, CompositeState.builder()
                        .setShaderState(RENDERTYPE_ENTITY_TRANSLUCENT_SHADER)
                        .setTextureState(new TextureStateShard(texture, false, false))
                        .setTransparencyState(TRANSLUCENT_TRANSPARENCY).setCullState(NO_CULL)
                        .setLightmapState(LIGHTMAP).setOverlayState(OVERLAY)
                        .setLayeringState(VIEW_OFFSET_Z_LAYERING)
                        .setDepthTestState(decal ? EQUAL_DEPTH_TEST : LEQUAL_DEPTH_TEST)
                        .setWriteMaskState(decal ? COLOR_WRITE : COLOR_DEPTH_WRITE)
                        .createCompositeState(true));
    }

    public static RenderType armorTranslucent(ResourceLocation texture) {
        return ARMOR.apply(texture);
    }

    public static RenderType armorTrim(boolean decal) {
        return decal ? TRIM_DECAL : armorTranslucent(Sheets.ARMOR_TRIMS_SHEET);
    }

    public static void registerShaders(RegisterShadersEvent event) throws IOException {
        event.registerShader(new ShaderInstance(event.getResourceProvider(), Chisel.prefix("ghost_glint"),
                DefaultVertexFormat.POSITION_TEX), shader -> glintShader = shader);
    }
}
