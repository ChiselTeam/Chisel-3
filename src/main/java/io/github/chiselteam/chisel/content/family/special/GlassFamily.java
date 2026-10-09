package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("glass", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))
                    .blockName("Glass")
                    .model(ChiselModelHandlers.GLASS)
                    .blockFactory(ChiselTransparentBlock::new))
            .existingBlock(Blocks.GLASS)
            .variant("glass_borderless", variant -> variant
                    .description("Borderless Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless")))
            .variant("glass_bubble", variant -> variant
                    .description("Bubble Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_streak")))
            .variant("glass_chinese", variant -> variant
                    .description("Chinese Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_chinese_2", variant -> variant
                    .description("Chinese Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_chrono", variant -> variant
                    .description("Chrono"))
            .variant("glass_dungeon", variant -> variant
                    .description("Dungeon Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_edge", variant -> variant
                    .description("Edge"))
            .variant("glass_edge_steel", variant -> variant
                    .description("Steel Edge")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless")))
            .variant("glass_fence", variant -> variant
                    .description("Modern Iron Fence")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_grid_thick", variant -> variant
                    .description("Thick Grid Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_grid_thin", variant -> variant
                    .description("Thin Grid Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_japanese", variant -> variant
                    .description("Japanese Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_japanese_2", variant -> variant
                    .description("Japanese Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_light", variant -> variant
                    .description("Light Glass"))
            .variant("glass_ornate", variant -> variant
                    .description("Ornate Steel Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_ornate_old", variant -> variant
                    .description("Old Ornate")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_screen", variant -> variant
                    .description("Screen")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_shale", variant -> variant
                    .description("Shale Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_steel", variant -> variant
                    .description("Steel Frame Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_stone", variant -> variant
                    .description("Stone Frame Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_streak", variant -> variant
                    .description("Streak Glass")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_frame_thick", variant -> variant
                    .description("Thick Frame"))
            .variant("glass_frame_thick_panel", variant -> variant
                    .description("Thick Frame Panel"))
            .variant("glass_tile", variant -> variant
                    .description("Tile")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_brick", variant -> variant
                    .description("Brick"))
            .variant("glass_line_vertical", variant -> variant
                    .description("Vertical Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_line_vertical_panel", variant -> variant
                    .description("Vertical Line Panel"))
            .variant("glass_line_horizontal", variant -> variant
                    .description("Horizontal Line")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_line_horizontal_panel", variant -> variant
                    .description("Horizontal Line Panel"))
            .variant("glass_arch_panel", variant -> variant
                    .description("Arch Panel"))
            .variant("glass_arch_panel_1", variant -> variant
                    .description("Arch Panel 1"))
            .variant("glass_arch_panel_2", variant -> variant
                    .description("Arch Panel 2"))
            .variant("glass_arch_panel_3", variant -> variant
                    .description("Arch Panel 3"))
            .variant("glass_scaffold", variant -> variant
                    .description("Scaffold"))
            .variant("glass_scaffold_left", variant -> variant
                    .description("Scaffold Left"))
            .variant("glass_scaffold_right", variant -> variant
                    .description("Scaffold Right"))
            .variant("glass_basketweave", variant -> variant
                    .description("Basketweave")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_mosaic_1", variant -> variant
                    .description("Mosaic 1"))
            .variant("glass_mosaic_2", variant -> variant
                    .description("Mosaic 2"))
            .variant("glass_round", variant -> variant
                    .description("Round"))
            .variant("glass_circle", variant -> variant
                    .description("Circle"))
            .variant("glass_rings", variant -> variant
                    .description("Rings"))
            .variant("glass_diamond", variant -> variant
                    .description("Diamond"))
            .variant("glass_frame_1", variant -> variant
                    .description("Frame 1")));

    private GlassFamily() {
    }
}
