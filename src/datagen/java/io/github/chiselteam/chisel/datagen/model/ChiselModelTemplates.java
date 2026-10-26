package io.github.chiselteam.chisel.datagen.model;

import io.github.chiselteam.chisel.Chisel;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

import static io.github.chiselteam.chisel.datagen.model.ChiselTextureSlots.CTM_BASE;
import static net.minecraft.data.models.model.TextureSlot.*;

public class ChiselModelTemplates  {

    public static final ModelTemplate CTM = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/cube_all")), Optional.empty(), PARTICLE, ALL);
    public static final ModelTemplate CTM_OVERLAY_ONLY = new ModelTemplate(Optional.empty(), Optional.empty(), PARTICLE);
    public static final ModelTemplate ICE_CTM_2X2 = new ModelTemplate(Optional.empty(), Optional.empty(), PARTICLE);
    public static final ModelTemplate ICE_CTM_3X3 = new ModelTemplate(Optional.empty(), Optional.empty(), PARTICLE);
    public static final ModelTemplate ICE_CTM_4X4 = new ModelTemplate(Optional.empty(), Optional.empty(), PARTICLE);
    public static final ModelTemplate CTM_TBS = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/cube_bottom_top_inner_faces")), Optional.empty(), PARTICLE, ALL, TOP, BOTTOM, SIDE);
    public static final ModelTemplate CTM_MULTI_PASS = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1, CTM_BASE);
    public static final ModelTemplate CTM_MULTI_PASS_NO_SHADE = create("chisel:cube_multi_pass_no_shade", PARTICLE, ALL, LAYER0, LAYER1, CTM_BASE);
    public static final ModelTemplate CTM_MULTI_PASS_TINTED = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_tinted")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1, CTM_BASE);
    public static final ModelTemplate CTM_MULTI_PASS_NO_GLOW = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_no_glow")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1, CTM_BASE);
    public static final ModelTemplate CTM_MULTIBLOCK_2x2 = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/cube_all")), Optional.empty(), PARTICLE, ALL);
    public static final ModelTemplate CTM_MULTIBLOCK_3x3 = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/cube_all")), Optional.empty(), PARTICLE, ALL);
    public static final ModelTemplate CTM_MULTIBLOCK_4x4 = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/cube_all")), Optional.empty(), PARTICLE, ALL);
    public static final ModelTemplate CTM_MULTIBLOCK_2x2_WATER = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_tinted")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1);
    public static final ModelTemplate CTM_MULTIBLOCK_2x2_LAVA = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1);
    public static final ModelTemplate CTM_MULTIBLOCK_3x3_WATER = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_tinted")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1);
    public static final ModelTemplate CTM_MULTIBLOCK_4x4_WATER = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_tinted")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1);
    public static final ModelTemplate CTM_HORIZONTAL = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/cube_bottom_top")), Optional.empty(), PARTICLE, ALL, TOP, BOTTOM, SIDE);
    public static final ModelTemplate CTM_VERTICAL = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/cube_bottom_top_inner_faces")), Optional.empty(), PARTICLE, ALL, TOP, BOTTOM, SIDE);
    public static final ModelTemplate CTM_HORIZONTAL_MULTI_PASS = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_top_bottom_side")), Optional.empty(), PARTICLE, TOP, BOTTOM, SIDE, LAYER0, LAYER1, CTM_BASE);

    public static final ModelTemplate SHADELESS = new ModelTemplate(Optional.of(Chisel.prefix("block/shadeless")), Optional.empty(), ALL);
    public static final ModelTemplate SHADELESS_MULTI_LAYER = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_no_shade")), Optional.empty(), LAYER0, LAYER1, PARTICLE);

    public static final ModelTemplate CUBE_MULTI_PASS = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass")), Optional.empty(), LAYER0, LAYER1, PARTICLE);
    public static final ModelTemplate CUBE_MULTI_PASS_TINTED = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_tinted")), Optional.empty(), LAYER0, LAYER1, PARTICLE);
    public static final ModelTemplate CUBE_MULTI_PASS_NO_GLOW = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_no_glow")), Optional.empty(), LAYER0, LAYER1, PARTICLE);
    public static final ModelTemplate CUBE_MULTI_PASS_TOP_BOTTOM_SIDE = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_top_bottom_side")), Optional.empty(), LAYER0, TOP, BOTTOM, SIDE, LAYER1, PARTICLE);
    public static final ModelTemplate CUBE_MULTI_PASS_TOP_BOTTOM_SIDE_TINTED = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_top_bottom_side_tinted")), Optional.empty(), LAYER0, TOP, BOTTOM, SIDE, LAYER1, PARTICLE);
    public static final ModelTemplate CUBE_MULTI_PASS_TOP_BOTTOM_SIDE_NO_GLOW = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass_top_bottom_side_no_glow")), Optional.empty(), LAYER0, TOP, BOTTOM, SIDE, LAYER1, PARTICLE);

    public static final ModelTemplate TORCH = new ModelTemplate(Optional.of(Chisel.prefix("block/torch")), Optional.empty(), TextureSlot.TORCH);
    public static final ModelTemplate WALL_TORCH = new ModelTemplate(Optional.of(Chisel.prefix("block/wall_torch")), Optional.empty(), TextureSlot.TORCH);
    public static final ModelTemplate ROAD_LINES = new ModelTemplate(Optional.of(Chisel.prefix("block/road_lines")), Optional.empty(), TextureSlot.TEXTURE);
    public static final ModelTemplate GLASS_PANE_SIDE = new ModelTemplate(Optional.of(Chisel.prefix("block/template_glass_pane_side")), Optional.of("_side"), PANE, EDGE);
    public static final ModelTemplate GLASS_PANE_SIDE_ALT = new ModelTemplate(Optional.of(Chisel.prefix("block/template_glass_pane_side_alt")), Optional.of("_side_alt"), PANE, EDGE);
    public static final ModelTemplate GLASS_PANE_END = new ModelTemplate(Optional.of(Chisel.prefix("block/template_glass_pane_end")), Optional.of("_end"), PANE, EDGE);
    public static final ModelTemplate GLASS_PANE_END_ALT = new ModelTemplate(Optional.of(Chisel.prefix("block/template_glass_pane_end_alt")), Optional.of("_end_alt"), PANE, EDGE);

    public static final ModelTemplate CTM_MULTI_PASS_MULTIBLOCK_2x2 = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1);
    public static final ModelTemplate CTM_MULTI_PASS_MULTIBLOCK_3x3 = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1);
    public static final ModelTemplate CTM_MULTI_PASS_MULTIBLOCK_4x4 = new ModelTemplate(Optional.of(Chisel.prefix("block/cube_multi_pass")), Optional.empty(), PARTICLE, ALL, LAYER0, LAYER1);
    public static final ModelTemplate BARS_POST_ENDS = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/iron_bars_post_ends")), Optional.of("_post_ends"), ChiselTextureSlots.BARS, EDGE);
    public static final ModelTemplate BARS_POST = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/iron_bars_post")), Optional.of("_post"), ChiselTextureSlots.BARS, EDGE);
    public static final ModelTemplate BARS_CAP = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/iron_bars_cap")), Optional.of("_cap"), ChiselTextureSlots.BARS, EDGE);
    public static final ModelTemplate BARS_CAP_ALT = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/iron_bars_cap_alt")), Optional.of("_cap_alt"), ChiselTextureSlots.BARS, EDGE);
    public static final ModelTemplate BARS_POST_SIDE = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/iron_bars_side")), Optional.of("_side"), ChiselTextureSlots.BARS, EDGE);
    public static final ModelTemplate BARS_POST_SIDE_ALT = new ModelTemplate(Optional.of(ResourceLocation.withDefaultNamespace("block/iron_bars_side_alt")), Optional.of("_side_alt"), ChiselTextureSlots.BARS, EDGE);
    private static ModelTemplate create(String name, TextureSlot... slots) { return new ModelTemplate(Optional.of(ResourceLocation.parse(name).withPath(p -> "block/" + p)), Optional.empty(), slots); }
}
