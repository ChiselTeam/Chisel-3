package io.github.chiselteam.chisel.content.compat.neovitae;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class NvRuneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("nv_rune", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Blank Rune"))
            .variant("neovitae_arranged", variant -> variant
                    .description("Arranged")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_corner"))
            .variant("neovitae_bricks", variant -> variant
                    .description("Blank Rune Bricks")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/nv_rune/neovitae_bricks-top")))
            .variant("neovitae_carved", variant -> variant
                    .description("Carved Blank Rune"))
            .variant("neovitae_carved_radial", variant -> variant
                    .description("Radial Carved Rune"))
            .variant("neovitae_classic", variant -> variant
                    .description("Classic"))
            .variant("neovitae_classic_panel", variant -> variant
                    .description("Classic Panel"))
            .variant("neovitae_diagonal_bricks", variant -> variant
                    .description("Diagonal Rune Bricks"))
            .variant("neovitae_diagonal_bricks_0", variant -> variant
                    .description("Diagonal Rune Bricks")
                    .model(ChiselModelHandlers.CONNECTED)
                    .texture(Chisel.prefix("block/nv_rune/neovitae_diagonal_bricks"))
                    .texture("ctm_corner", Chisel.prefix("block/nv_rune/neovitae_diagonal_bricks_0-ctm_corner"))
                    .texture("ctm_cornerless", Chisel.prefix("block/nv_rune/neovitae_diagonal_bricks_0-ctm_cornerless"))
                    .texture("ctm_horizontal", Chisel.prefix("block/nv_rune/neovitae_diagonal_bricks_0-ctm_horizontal"))
                    .texture("ctm_vertical", Chisel.prefix("block/nv_rune/neovitae_diagonal_bricks_0-ctm_vertical")))
            .variant("neovitae_diagonal_bricks_1", variant -> variant
                    .description("Diagonal Rune Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("neovitae_diagonal_bricks_2", variant -> variant
                    .description("Diagonal Rune Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("neovitae_diagonal_bricks_3", variant -> variant
                    .description("Diagonal Rune Bricks")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("neovitae_tiles", variant -> variant
                    .description("Tiles")));

    private NvRuneFamily() {
    }
}
