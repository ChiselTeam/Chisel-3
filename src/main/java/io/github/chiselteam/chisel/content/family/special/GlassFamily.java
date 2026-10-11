package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselTransparentBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GlassFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("glass", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)).blockName("Glass").model(ChiselModelHandlers.GLASS).blockFactory(ChiselTransparentBlock::new))
            .existingBlock(Blocks.GLASS)
            .variant("glass_borderless", v -> v.description("Borderless Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless")))
            .variant("glass_bubble", v -> v.description("Bubble Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_streak")))
            .variant("glass_chinese", v -> v.description("Chinese Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_chinese_2", v -> v.description("Chinese Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_chrono", v -> v.description("Chrono"))
            .variant("glass_dungeon", v -> v.description("Dungeon Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_edge", v -> v.description("Edge"))
            .variant("glass_edge_steel", v -> v.description("Steel Edge")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_edge-ctm_cornerless")))
            .variant("glass_fence", v -> v.description("Modern Iron Fence").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_grid_thick", v -> v.description("Thick Grid Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_grid_thin", v -> v.description("Thin Grid Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_japanese", v -> v.description("Japanese Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_japanese_2", v -> v.description("Japanese Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_light", v -> v.description("Light Glass"))
            .variant("glass_ornate", v -> v.description("Ornate Steel Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_ornate_old", v -> v.description("Old Ornate").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_screen", v -> v.description("Screen").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_shale", v -> v.description("Shale Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_steel", v -> v.description("Steel Frame Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_stone", v -> v.description("Stone Frame Glass")
                    .texture("ctm_cornerless", Chisel.prefix("block/glass/glass_light-ctm_cornerless")))
            .variant("glass_streak", v -> v.description("Streak Glass").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_frame_thick", v -> v.description("Thick Frame"))
            .variant("glass_frame_thick_panel", v -> v.description("Thick Frame Panel"))
            .variant("glass_tile", v -> v.description("Tile").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_brick", v -> v.description("Brick"))
            .variant("glass_line_vertical", v -> v.description("Vertical Line").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_line_vertical_panel", v -> v.description("Vertical Line Panel"))
            .variant("glass_line_horizontal", v -> v.description("Horizontal Line").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_line_horizontal_panel", v -> v.description("Horizontal Line Panel"))
            .variant("glass_arch_panel", v -> v.description("Arch Panel"))
            .variant("glass_arch_panel_1", v -> v.description("Arch Panel 1"))
            .variant("glass_arch_panel_2", v -> v.description("Arch Panel 2"))
            .variant("glass_arch_panel_3", v -> v.description("Arch Panel 3"))
            .variant("glass_scaffold", v -> v.description("Scaffold"))
            .variant("glass_scaffold_left", v -> v.description("Scaffold Left"))
            .variant("glass_scaffold_right", v -> v.description("Scaffold Right"))
            .variant("glass_basketweave", v -> v.description("Basketweave").model(ChiselModelHandlers.CUBE_ALL))
            .variant("glass_mosaic_1", v -> v.description("Mosaic 1"))
            .variant("glass_mosaic_2", v -> v.description("Mosaic 2"))
            .variant("glass_round", v -> v.description("Round"))
            .variant("glass_circle", v -> v.description("Circle"))
            .variant("glass_rings", v -> v.description("Rings"))
            .variant("glass_diamond", v -> v.description("Diamond"))
            .variant("glass_frame_1", v -> v.description("Frame 1")));

    private GlassFamily() {
    }
}
