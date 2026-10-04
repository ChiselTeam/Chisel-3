package io.github.chiselteam.chisel.content.family;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.api.model.VariantModelHandler;
import io.github.chiselteam.chisel.block.*;
import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.content.definition.VariantFamilyDefinitionBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.List;
import java.util.Locale;

public class SpecialFamilies {
    public static final ChiselFamily ANTIBLOCK, BOOKSHELF, GLASS, STEEL_FRAMED_GLASS, OAK_FRAMED_GLASS, BRIGHT_GLASS, GLASS_PANE, IRON_BARS, JACK_O_LANTERN, PUMPKIN, REDSTONE_LAMP, ROAD_LINE, TORCH;
    private static final List<ChiselFamily> FAMILIES;

    static {
        ANTIBLOCK = buildAntiblock();

        BOOKSHELF = buildBookshelf(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF));

        GLASS = ChiselFamily.build("glass", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                .addVariant(Blocks.GLASS)
                .addVariant("glass_borderless", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_borderless", "Glass", "Borderless Glass")
                .texture("glass_borderless", "ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless"))
                .addVariant("glass_bubble", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_bubble", "Glass", "Bubble Glass")
                .texture("glass_bubble", "ctm_cornerless", Chisel.prefix("block/glass/glass_streak"))
                .addVariant("glass_chinese", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_chinese", "Glass", "Chinese Glass")
                .addVariant("glass_chinese_2", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_chinese_2", "Glass", "Chinese Glass")
                .addVariant("glass_chrono", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_chrono", "Glass", "Chrono")
                .addVariant("glass_dungeon", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_dungeon", "Glass", "Dungeon Glass")
                .addVariant("glass_edge", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_edge", "Glass", "Edge")
                .addVariant("glass_edge_steel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_edge_steel", "Glass", "Steel Edge")
                .texture("glass_edge_steel", "ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless"))
                .addVariant("glass_fence", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_fence", "Glass", "Modern Iron Fence")
                .addVariant("glass_grid_thick", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_grid_thick", "Glass", "Thick Grid Glass")
                .addVariant("glass_grid_thin", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_grid_thin", "Glass", "Thin Grid Glass")
                .addVariant("glass_japanese", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_japanese", "Glass", "Japanese Glass")
                .addVariant("glass_japanese_2", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_japanese_2", "Glass", "Japanese Glass")
                .addVariant("glass_light", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_light", "Glass", "Light Glass")
                .addVariant("glass_ornate", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_ornate", "Glass", "Ornate Steel Glass")
                .texture("glass_ornate", "ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless"))
                .addVariant("glass_ornate_old", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_ornate_old", "Glass", "Old Ornate")
                .addVariant("glass_screen", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_screen", "Glass", "Screen")
                .addVariant("glass_shale", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_shale", "Glass", "Shale Glass")
                .texture("glass_shale", "ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless"))
                .addVariant("glass_steel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_steel", "Glass", "Steel Frame Glass")
                .texture("glass_steel", "ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless"))
                .addVariant("glass_stone", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_stone", "Glass", "Stone Frame Glass")
                .texture("glass_stone", "ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless"))
                .addVariant("glass_streak", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_streak", "Glass", "Streak Glass")

                .addVariant("glass_frame_thick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_frame_thick", "Glass", "Thick Frame")
                .addVariant("glass_frame_thick_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_frame_thick_panel", "Glass", "Thick Frame Panel")
                .addVariant("glass_tile", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_tile", "Glass", "Tile")
                .addVariant("glass_brick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_brick", "Glass", "Brick")
                .addVariant("glass_line_vertical", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_line_vertical", "Glass", "Vertical Line")
                .addVariant("glass_line_vertical_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_line_vertical_panel", "Glass", "Vertical Line Panel")
                .addVariant("glass_line_horizontal", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_line_horizontal", "Glass", "Horizontal Line")
                .addVariant("glass_line_horizontal_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_line_horizontal_panel", "Glass", "Horizontal Line Panel")
                .addVariant("glass_arch_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_arch_panel", "Glass", "Arch Panel")
                .addVariant("glass_arch_panel_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_arch_panel_1", "Glass", "Arch Panel 1")
                .addVariant("glass_arch_panel_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_arch_panel_2", "Glass", "Arch Panel 2")
                .addVariant("glass_arch_panel_3", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_arch_panel_3", "Glass", "Arch Panel 3")
                .addVariant("glass_scaffold", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_scaffold", "Glass", "Scaffold")
                .addVariant("glass_scaffold_left", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_scaffold_left", "Glass", "Scaffold Left")
                .addVariant("glass_scaffold_right", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_scaffold_right", "Glass", "Scaffold Right")
                .addVariant("glass_basketweave", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("glass_basketweave", "Glass", "Basketweave")
                .addVariant("glass_mosaic_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_mosaic_1", "Glass", "Mosaic 1")
                .addVariant("glass_mosaic_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_mosaic_2", "Glass", "Mosaic 2")
                .addVariant("glass_round", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_round", "Glass", "Round")
                .addVariant("glass_circle", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_circle", "Glass", "Circle")
                .addVariant("glass_rings", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_rings", "Glass", "Rings")
                .addVariant("glass_diamond", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_diamond", "Glass", "Diamond")
                .addVariant("glass_frame_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("glass_frame_1", "Glass", "Frame 1")
                .build());

        STEEL_FRAMED_GLASS = ChiselFamily.build("steel_framed_glass", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                .addVariant("steel_framed_glass", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass", "Steel Framed Glass", "Steel Framed Glass")

                .addVariant("steel_framed_glass_panel_fancy", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_panel_fancy", "Steel Framed Glass", "Fancy Panel")
                .addVariant("steel_framed_glass_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_panel", "Steel Framed Glass", "Panel")
                .addVariant("steel_framed_glass_bubble", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_bubble", "Steel Framed Glass", "Bubble")
                .addVariant("steel_framed_glass_frame_thick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_frame_thick", "Steel Framed Glass", "Thick Frame")
                .addVariant("steel_framed_glass_frame_thick_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_frame_thick_panel", "Steel Framed Glass", "Thick Frame Panel")
                .addVariant("steel_framed_glass_tile", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("steel_framed_glass_tile", "Steel Framed Glass", "Tile")
                .addVariant("steel_framed_glass_brick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_brick", "Steel Framed Glass", "Brick")
                .addVariant("steel_framed_glass_line_vertical", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("steel_framed_glass_line_vertical", "Steel Framed Glass", "Vertical Line")
                .addVariant("steel_framed_glass_line_vertical_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_line_vertical_panel", "Steel Framed Glass", "Vertical Line Panel")
                .addVariant("steel_framed_glass_line_horizontal", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("steel_framed_glass_line_horizontal", "Steel Framed Glass", "Horizontal Line")
                .addVariant("steel_framed_glass_line_horizontal_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_line_horizontal_panel", "Steel Framed Glass", "Horizontal Line Panel")
                .addVariant("steel_framed_glass_arch_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_arch_panel", "Steel Framed Glass", "Arch Panel")
                .addVariant("steel_framed_glass_arch_panel_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_arch_panel_1", "Steel Framed Glass", "Arch Panel 1")
                .addVariant("steel_framed_glass_arch_panel_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_arch_panel_2", "Steel Framed Glass", "Arch Panel 2")
                .addVariant("steel_framed_glass_arch_panel_3", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_arch_panel_3", "Steel Framed Glass", "Arch Panel 3")
                .addVariant("steel_framed_glass_scaffold", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_scaffold", "Steel Framed Glass", "Scaffold")
                .addVariant("steel_framed_glass_scaffold_left", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_scaffold_left", "Steel Framed Glass", "Scaffold Left")
                .addVariant("steel_framed_glass_scaffold_right", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_scaffold_right", "Steel Framed Glass", "Scaffold Right")
                .addVariant("steel_framed_glass_basketweave", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("steel_framed_glass_basketweave", "Steel Framed Glass", "Basketweave")
                .addVariant("steel_framed_glass_mosaic_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_mosaic_1", "Steel Framed Glass", "Mosaic 1")
                .addVariant("steel_framed_glass_mosaic_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_mosaic_2", "Steel Framed Glass", "Mosaic 2")
                .addVariant("steel_framed_glass_round", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_round", "Steel Framed Glass", "Round")
                .addVariant("steel_framed_glass_circle", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_circle", "Steel Framed Glass", "Circle")
                .addVariant("steel_framed_glass_rings", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_rings", "Steel Framed Glass", "Rings")
                .addVariant("steel_framed_glass_diamond", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_diamond", "Steel Framed Glass", "Diamond")
                .addVariant("steel_framed_glass_frame_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("steel_framed_glass_frame_1", "Steel Framed Glass", "Frame 1")
                .build());

        OAK_FRAMED_GLASS = ChiselFamily.build("oak_framed_glass", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                .addVariant("oak_framed_glass", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass", "Oak Framed Glass", "Oak Framed Glass")

                .addVariant("oak_framed_glass_panel_fancy", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_panel_fancy", "Oak Framed Glass", "Fancy Panel")
                .addVariant("oak_framed_glass_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_panel", "Oak Framed Glass", "Panel")
                .addVariant("oak_framed_glass_bubble", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_bubble", "Oak Framed Glass", "Bubble")
                .addVariant("oak_framed_glass_frame_thick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_frame_thick", "Oak Framed Glass", "Thick Frame")
                .addVariant("oak_framed_glass_frame_thick_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_frame_thick_panel", "Oak Framed Glass", "Thick Frame Panel")
                .addVariant("oak_framed_glass_tile", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("oak_framed_glass_tile", "Oak Framed Glass", "Tile")
                .addVariant("oak_framed_glass_brick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_brick", "Oak Framed Glass", "Brick")
                .addVariant("oak_framed_glass_line_vertical", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("oak_framed_glass_line_vertical", "Oak Framed Glass", "Vertical Line")
                .addVariant("oak_framed_glass_line_vertical_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_line_vertical_panel", "Oak Framed Glass", "Vertical Line Panel")
                .addVariant("oak_framed_glass_line_horizontal", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("oak_framed_glass_line_horizontal", "Oak Framed Glass", "Horizontal Line")
                .addVariant("oak_framed_glass_line_horizontal_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_line_horizontal_panel", "Oak Framed Glass", "Horizontal Line Panel")
                .addVariant("oak_framed_glass_arch_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_arch_panel", "Oak Framed Glass", "Arch Panel")
                .addVariant("oak_framed_glass_arch_panel_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_arch_panel_1", "Oak Framed Glass", "Arch Panel 1")
                .addVariant("oak_framed_glass_arch_panel_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_arch_panel_2", "Oak Framed Glass", "Arch Panel 2")
                .addVariant("oak_framed_glass_arch_panel_3", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_arch_panel_3", "Oak Framed Glass", "Arch Panel 3")
                .addVariant("oak_framed_glass_scaffold", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_scaffold", "Oak Framed Glass", "Scaffold")
                .addVariant("oak_framed_glass_scaffold_left", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_scaffold_left", "Oak Framed Glass", "Scaffold Left")
                .addVariant("oak_framed_glass_scaffold_right", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_scaffold_right", "Oak Framed Glass", "Scaffold Right")
                .addVariant("oak_framed_glass_basketweave", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("oak_framed_glass_basketweave", "Oak Framed Glass", "Basketweave")
                .addVariant("oak_framed_glass_mosaic_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_mosaic_1", "Oak Framed Glass", "Mosaic 1")
                .addVariant("oak_framed_glass_mosaic_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_mosaic_2", "Oak Framed Glass", "Mosaic 2")
                .addVariant("oak_framed_glass_round", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_round", "Oak Framed Glass", "Round")
                .addVariant("oak_framed_glass_circle", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_circle", "Oak Framed Glass", "Circle")
                .addVariant("oak_framed_glass_rings", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_rings", "Oak Framed Glass", "Rings")
                .addVariant("oak_framed_glass_diamond", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_diamond", "Oak Framed Glass", "Diamond")
                .addVariant("oak_framed_glass_frame_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("oak_framed_glass_frame_1", "Oak Framed Glass", "Frame 1")
                .build());
        
        BRIGHT_GLASS = ChiselFamily.build("bright_glass", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).lightLevel(state -> 15))
                .addVariant("bright_glass", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass", "Bright Glass", "Bright Glass")

                .addVariant("bright_glass_panel_fancy", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_panel_fancy", "Bright Glass", "Fancy Panel")
                .addVariant("bright_glass_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_panel", "Bright Glass", "Panel")
                .addVariant("bright_glass_bubble", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_bubble", "Bright Glass", "Bubble")
                .addVariant("bright_glass_borderless", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_borderless", "Bright Glass", "Borderless")
                .addVariant("bright_glass_frame_thick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_frame_thick", "Bright Glass", "Thick Frame")
                .addVariant("bright_glass_frame_thick_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_frame_thick_panel", "Bright Glass", "Thick Frame Panel")
                .addVariant("bright_glass_tile", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("bright_glass_tile", "Bright Glass", "Tile")
                .addVariant("bright_glass_brick", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_brick", "Bright Glass", "Brick")
                .addVariant("bright_glass_line_vertical", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("bright_glass_line_vertical", "Bright Glass", "Vertical Line")
                .addVariant("bright_glass_line_vertical_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_line_vertical_panel", "Bright Glass", "Vertical Line Panel")
                .addVariant("bright_glass_line_horizontal", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("bright_glass_line_horizontal", "Bright Glass", "Horizontal Line")
                .addVariant("bright_glass_line_horizontal_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_line_horizontal_panel", "Bright Glass", "Horizontal Line Panel")
                .addVariant("bright_glass_arch_panel", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_arch_panel", "Bright Glass", "Arch Panel")
                .addVariant("bright_glass_arch_panel_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_arch_panel_1", "Bright Glass", "Arch Panel 1")
                .addVariant("bright_glass_arch_panel_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_arch_panel_2", "Bright Glass", "Arch Panel 2")
                .addVariant("bright_glass_arch_panel_3", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_arch_panel_3", "Bright Glass", "Arch Panel 3")
                .addVariant("bright_glass_scaffold", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_scaffold", "Bright Glass", "Scaffold")
                .addVariant("bright_glass_scaffold_left", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_scaffold_left", "Bright Glass", "Scaffold Left")
                .addVariant("bright_glass_scaffold_right", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_scaffold_right", "Bright Glass", "Scaffold Right")
                .addVariant("bright_glass_basketweave", ChiselTransparentBlock::new, ChiselModelHandlers.CUBE_ALL).translation("bright_glass_basketweave", "Bright Glass", "Basketweave")
                .addVariant("bright_glass_mosaic_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_mosaic_1", "Bright Glass", "Mosaic 1")
                .addVariant("bright_glass_mosaic_2", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_mosaic_2", "Bright Glass", "Mosaic 2")
                .addVariant("bright_glass_round", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_round", "Bright Glass", "Round")
                .addVariant("bright_glass_circle", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_circle", "Bright Glass", "Circle")
                .addVariant("bright_glass_rings", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_rings", "Bright Glass", "Rings")
                .addVariant("bright_glass_diamond", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_diamond", "Bright Glass", "Diamond")
                .addVariant("bright_glass_frame_1", ChiselTransparentBlock::new, ChiselModelHandlers.GLASS).translation("bright_glass_frame_1", "Bright Glass", "Frame 1")
                .build());

        GLASS_PANE = ChiselFamily.build("glass_pane", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE))
                .addVariant(Blocks.GLASS_PANE)
                .addVariant("glass_pane_borderless", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("glass_pane_borderless")))), ChiselModelHandlers.GLASS_PANE).translation("glass_pane_borderless", "Glass Pane", "Borderless Glass Pane")
                .addVariant("glass_pane_bubble", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("glass_pane_bubble")))), ChiselModelHandlers.GLASS_PANE).translation("glass_pane_bubble", "Glass Pane", "Bubble Glass Pane")
                .texture("glass_pane_bubble", Chisel.prefix("block/glass/glass_bubble"))
                .texture("glass_pane_bubble", "top", Chisel.prefix("block/glass_pane/glass_pane_bubble-top"))
                .addVariant("glass_pane_chinese", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("glass_pane_chinese")))), ChiselModelHandlers.GLASS_PANE).translation("glass_pane_chinese", "Glass Pane", "Chinese Glass Pane")
                .texture("glass_pane_chinese", Chisel.prefix("block/glass/glass_chinese"))
                .texture("glass_pane_chinese", "top", Chisel.prefix("block/glass_pane/glass_pane_chinese-top"))
                .addVariant("glass_pane_chinese_gold", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("glass_pane_chinese_gold")))), ChiselModelHandlers.GLASS_PANE).translation("glass_pane_chinese_gold", "Glass Pane", "Chinese Glass Pane with Golden Frame")
                .texture("glass_pane_chinese_gold", Chisel.prefix("block/glass/glass_chinese_2"))
                .texture("glass_pane_chinese_gold", "top", Chisel.prefix("block/glass_pane/glass_pane_chinese_gold-top"))
                .addVariant("glass_pane_japanese", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("glass_pane_japanese")))), ChiselModelHandlers.GLASS_PANE).translation("glass_pane_japanese", "Glass Pane", "Japanese Glass Pane")
                .texture("glass_pane_japanese", Chisel.prefix("block/glass/glass_japanese"))
                .texture("glass_pane_japanese", "top", Chisel.prefix("block/glass_pane/glass_pane_japanese-top"))
                .addVariant("glass_pane_japanese2", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("glass_pane_japanese2")))), ChiselModelHandlers.GLASS_PANE).translation("glass_pane_japanese2", "Glass Pane", "Ornate Japanese Glass Pane")
                .texture("glass_pane_japanese2", Chisel.prefix("block/glass/glass_japanese_2"))
                .texture("glass_pane_japanese2", "top", Chisel.prefix("block/glass_pane/glass_pane_japanese-top"))
                .addVariant("glass_pane_streak", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("glass_pane_streak")))), ChiselModelHandlers.GLASS_PANE).translation("glass_pane_streak", "Glass Pane", "Streak Glass Pane")
                .texture("glass_pane_streak", Chisel.prefix("block/glass/glass_streak"))
                .texture("glass_pane_streak", "top", Chisel.prefix("block/magma/magma_dent-ctm_cornerless"))
                .build());

        IRON_BARS = ChiselFamily.build("iron_bars", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS))
                .addVariant(Blocks.IRON_BARS)
                .addVariant("iron_bars_barbed_wire", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_barbed_wire")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_barbed_wire", "Iron Bars", "Menacing Iron Bars")
                .addVariant("iron_bars_bars", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_bars")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_bars", "Iron Bars", "Iron Bars without Frame")
                .addVariant("iron_bars_borderless", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_borderless")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_borderless", "Iron Bars", "Iron Bars without Frame")
                .addVariant("iron_bars_cage", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_cage")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_cage", "Iron Bars", "Iron Cage Bars")
                .addVariant("iron_bars_classic", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_classic")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_classic", "Iron Bars", "Menacing Iron Bars")
                .addVariant("iron_bars_classic_new", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_classic_new")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_classic_new", "Iron Bars", "Vertical Iron Bars")
                .addVariant("iron_bars_fence", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_fence")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_fence", "Iron Bars", "Ornate Iron Pane Fence")
                .addVariant("iron_bars_modern", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_modern")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_modern", "Iron Bars", "Modern")
                .addVariant("iron_bars_ornate_steel", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_ornate_steel")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_ornate_steel", "Iron Bars", "Ornate Steel")
                .texture("iron_bars_ornate_steel", Chisel.prefix("block/glass/glass_ornate_old"))
                .addVariant("iron_bars_spikes", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_spikes")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_spikes", "Iron Bars", "Iron Spikes")
                .addVariant("iron_bars_thick_grid", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_thick_grid")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_thick_grid", "Iron Bars", "Thick Iron Grid")
                .texture("iron_bars_thick_grid", Chisel.prefix("block/glass/glass_grid_thick"))
                .addVariant("iron_bars_thin_grid", (p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_thin_grid")))), ChiselModelHandlers.IRON_BARS).translation("iron_bars_thin_grid", "Iron Bars", "Thin Iron Grid")
                .texture("iron_bars_thin_grid", Chisel.prefix("block/glass/glass_grid_thin"))
                .build());

        JACK_O_LANTERN = ChiselFamily.build("jack_o_lantern", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.JACK_O_LANTERN))
                .addVariant(Blocks.JACK_O_LANTERN)
                .addVariant("jack_o_lantern_0", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_0", "Jack o'Lantern", "Suprised")
                .addVariant("jack_o_lantern_1", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_1", "Jack o'Lantern", "Smiling open")
                .addVariant("jack_o_lantern_2", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_2", "Jack o'Lantern", "Cheeky")
                .addVariant("jack_o_lantern_3", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_3", "Jack o'Lantern", "Pensive")
                .addVariant("jack_o_lantern_4", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_4", "Jack o'Lantern", "Disappointed")
                .addVariant("jack_o_lantern_5", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_5", "Jack o'Lantern", "Smirking")
                .addVariant("jack_o_lantern_6", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_6", "Jack o'Lantern", "Curious")
                .addVariant("jack_o_lantern_7", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_7", "Jack o'Lantern", "Bored")
                .addVariant("jack_o_lantern_8", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_8", "Jack o'Lantern", "Sad")
                .addVariant("jack_o_lantern_9", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_9", "Jack o'Lantern", "Evil")
                .addVariant("jack_o_lantern_10", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_10", "Jack o'Lantern", "Exited")
                .addVariant("jack_o_lantern_11", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_11", "Jack o'Lantern", "Sleeping")
                .addVariant("jack_o_lantern_12", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_12", "Jack o'Lantern", "Astonished")
                .addVariant("jack_o_lantern_13", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_13", "Jack o'Lantern", "Neutral")
                .addVariant("jack_o_lantern_14", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_14", "Jack o'Lantern", "Laughing out loud")
                .addVariant("jack_o_lantern_15", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_15", "Jack o'Lantern", "Smiling Closed")
                .addVariant("jack_o_lantern_16", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("jack_o_lantern_16", "Jack o'Lantern", "Scary")
                .build());

        PUMPKIN = ChiselFamily.build("pumpkin", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.PUMPKIN))
                .addVariant(Blocks.CARVED_PUMPKIN)
                .addVariant("pumpkin_0", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_0", "Pumpkin", "Surprised")
                .addVariant("pumpkin_1", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_1", "Pumpkin", "Smiling open")
                .addVariant("pumpkin_2", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_2", "Pumpkin", "Cheeky")
                .addVariant("pumpkin_3", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_3", "Pumpkin", "Pensive")
                .addVariant("pumpkin_4", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_4", "Pumpkin", "Disappointed")
                .addVariant("pumpkin_5", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_5", "Pumpkin", "Smirking")
                .addVariant("pumpkin_6", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_6", "Pumpkin", "Curious")
                .addVariant("pumpkin_7", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_7", "Pumpkin", "Bored")
                .addVariant("pumpkin_8", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_8", "Pumpkin", "Sad")
                .addVariant("pumpkin_9", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_9", "Pumpkin", "Evil")
                .addVariant("pumpkin_10", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_10", "Pumpkin", "Exited")
                .addVariant("pumpkin_11", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_11", "Pumpkin", "Sleeping")
                .addVariant("pumpkin_12", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_12", "Pumpkin", "Astonished")
                .addVariant("pumpkin_13", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_13", "Pumpkin", "Neutral")
                .addVariant("pumpkin_14", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_14", "Pumpkin", "Laughing out loud")
                .addVariant("pumpkin_15", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_15", "Pumpkin", "Smiling Closed")
                .addVariant("pumpkin_16", ChiselCarvedPumpkinBlock::new, ChiselModelHandlers.PUMPKIN).translation("pumpkin_16", "Pumpkin", "Scary")
                .build());

        REDSTONE_LAMP = ChiselFamily.build("redstone_lamp", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP))
                .addVariant(Blocks.REDSTONE_LAMP)
                .addVariant("redstone_lamp_square", ChiselRedstoneLampBlock::new, ChiselModelHandlers.REDSTONE_LAMP).translation("redstone_lamp_square", "Redstone Lamp", "Square")
                .build());

        ROAD_LINE = ChiselFamily.build("road_line", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).noOcclusion().noCollision())
                .addVariant("road_line_double_white_center", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_double_white_center", "Road Lines", "Double White")
                .addVariant("road_line_double_white_long", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_double_white_long", "Road Lines", "Double White")
                .addVariant("road_line_double_white_side", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_double_white_side", "Road Lines", "Double White")
                .addVariant("road_line_double_yellow_center", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_double_yellow_center", "Road Lines", "Double Yellow")
                .addVariant("road_line_double_yellow_long", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_double_yellow_long", "Road Lines", "Double Yellow")
                .addVariant("road_line_double_yellow_side", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_double_yellow_side", "Road Lines", "Double Yellow")
                .addVariant("road_line_white_center", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_white_center", "Road Lines", "White")
                .addVariant("road_line_white_long", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_white_long", "Road Lines", "White")
                .addVariant("road_line_white_side", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_white_side", "Road Lines", "White")
                .addVariant("road_line_yellow_center", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_yellow_center", "Road Lines", "Yellow")
                .addVariant("road_line_yellow_long", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_yellow_long", "Road Lines", "Yellow")
                .addVariant("road_line_yellow_side", RoadlineBlock::new, ChiselModelHandlers.ROAD_LINES).translation("road_line_yellow_side", "Road Lines", "Yellow")
                .build());

        TORCH = ChiselFamily.build("torch", builder -> builder
                .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH))
                .addVariant(Blocks.TORCH)
                .addTorchVariant("torch_1", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_1", "Torch", "Wax Candle")
                .addTorchVariant("torch_2", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_2", "Torch", "Tall Wax Candle")
                .addTorchVariant("torch_3", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_3", "Torch", "White Lamp")
                .addTorchVariant("torch_4", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_4", "Torch", "Embroidered White Lamp")
                .addTorchVariant("torch_5", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_5", "Torch", "Small Black Lamp")
                .addTorchVariant("torch_6", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_6", "Torch", "Tall Black Lamp")
                .addTorchVariant("torch_7", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_7", "Torch", "Red Lamp")
                .addTorchVariant("torch_8", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_8", "Torch", "Embroidered Red Lamp")
                .addTorchVariant("torch_9", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_9", "Torch", "Light Bulb")
                .addTorchVariant("torch_10", NoParticleTorchBlock::new, NoParticleWallTorchBlock::new).translation("torch_10", "Torch", "Clear Light Bulb")
                .build());

        FAMILIES = List.of(ANTIBLOCK, BOOKSHELF, GLASS, STEEL_FRAMED_GLASS, OAK_FRAMED_GLASS, BRIGHT_GLASS, GLASS_PANE, IRON_BARS, JACK_O_LANTERN, PUMPKIN, REDSTONE_LAMP, ROAD_LINE, TORCH);
    }

    private SpecialFamilies() {
    }

    public static List<ChiselFamily> families() {
        return FAMILIES;
    }

    private static ChiselFamily buildAntiblock() {
        var colors = List.of("Black", "Blue", "Brown", "Cyan", "Gray", "Green", "Light Blue", "Light Gray", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White", "Yellow");
        return ChiselFamily.build("antiblock", builder -> {
            builder.properties(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0F, 5.0F)
                    .requiresCorrectToolForDrops().lightLevel((_) -> 15));
            addAntiblockVariants(builder, colors, "", "%s Anti Block", ChiselModelHandlers.ANTIBLOCK);
            addAntiblockVariants(builder, colors, "_borderless", "%s Borderless Anti Block", ChiselModelHandlers.SHADELESS);
            addAntiblockVariants(builder, colors, "_dull", "%s Dull Anti Block", ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW);
            addAntiblockVariants(builder, colors, "_dull_borderless", "%s Dull Borderless Anti Block", ChiselModelHandlers.CUBE_ALL);
        });
    }

    private static void addAntiblockVariants(VariantFamilyDefinitionBuilder builder, List<String> colors, String suffix, String description, VariantModelHandler modelHandler) {
        for (var colorName : colors) {
            var color = colorName.toLowerCase(Locale.ROOT).replace(' ', '_');
            var variant = "antiblock_" + color + suffix;
            builder.addVariant(variant, modelHandler).translation(variant, "Antiblock", description.formatted(colorName));
            if (suffix.endsWith("_borderless")) {
                builder.texture(variant, Chisel.prefix("block/antiblock/antiblock_" + color));
            } else {
                addAntiblockOverlayTextures(builder, variant, color);
            }
        }
    }

    private static void addAntiblockOverlayTextures(VariantFamilyDefinitionBuilder builder, String variant, String color) {
        var overlay = "block/antiblock/antiblock_overlay" + (color.equals("black") ? "_white" : "");
        builder.texture(variant, Chisel.prefix(overlay))
                .texture(variant, "bg", Chisel.prefix("block/antiblock/antiblock_" + color))
                .texture(variant, "ctm_cornerless", Chisel.prefix("block/antiblock/antiblock_overlay-ctm_cornerless"));
        for (var suffix : List.of("ctm_corner", "ctm_horizontal", "ctm_vertical")) {
            builder.texture(variant, suffix, Chisel.prefix(overlay + "-" + suffix));
        }
    }

    private static ChiselFamily buildBookshelf(BlockBehaviour.Properties properties) {
        String[] woods = {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "cherry", "pale_oak", "bamboo", "crimson", "warped"};
        String[] woodNames = {"Oak", "Spruce", "Birch", "Jungle", "Acacia", "Dark Oak", "Mangrove", "Cherry", "Pale Oak", "Bamboo", "Crimson", "Warped"};
        String[] types = {"abandoned", "brim", "cans", "historian", "hoarder", "necromancer", "necromancer_apprentice", "papers", "rainbow", "tomes"};
        String[] typeNames = {"Abandoned", "Brim", "Cans", "Historian", "Hoarder", "Necromancer", "Necromancer Apprentice", "Papers", "Rainbow", "Tomes"};

        return ChiselFamily.build("bookshelf", builder -> {
            builder.properties(properties).addVariant(Blocks.BOOKSHELF);
            for (int wood = 0; wood < woods.length; wood++) {
                for (int type = 0; type < types.length; type++) {
                    String description = typeNames[type];
                    switch (types[type]) {
                        case "abandoned" -> description = "Abandoned Bookshelf";
                        case "brim" -> description = "Bookshelf filled to the brim with boring Pastel Books";
                        case "historian" -> description = "Historian's Bookshelf";
                        case "hoarder" -> description = "Hoarder's Bookshelf";
                        case "necromancer" -> description = "Necromancer's Bookshelf";
                        case "necromancer_apprentice" -> description = "Necromancer’s Apprentice Bookshelf";
                        case "rainbow" -> description = "Bookshelf with Rainbow Books";
                        case "tomes" -> description = "Bookshelf with Red Tomes";
                    }
                    String variant = "bookshelf_%s_%s".formatted(woods[wood], types[type]);
                    builder.addVariant(variant, ChiselModelHandlers.BOOKSHELF).translation(variant, "%s Bookshelf".formatted(woodNames[wood]), description)
                            .texture(variant, "horizontal_none", Chisel.prefix("block/bookshelf/bookshelf_%s".formatted(types[type])));
                }
            }
        });
    }
}
