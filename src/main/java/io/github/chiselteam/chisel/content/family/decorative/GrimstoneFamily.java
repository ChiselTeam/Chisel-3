package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.SparklyConnectedTextureBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.registry.ChiselParticles;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GrimstoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("grimstone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Grimstone")
                    .blockFactory((p) -> new SparklyConnectedTextureBlock(p, ChiselParticles.GRIMSTONE)))
            .variant("grimstone_blocks", variant -> variant
                    .description("Grimstone Blocks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_blocks_rough", variant -> variant
                    .description("Rough Grimstone Blocks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_bricks", variant -> variant
                    .description("Grimstone Bricks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_bricks_large", variant -> variant
                    .description("Large Grimstone Bricks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_chiseled", variant -> variant
                    .description("Chiseled Grimstone")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/grimstone/grimstone_smooth")))
            .variant("grimstone_chunks", variant -> variant
                    .description("Grimstone")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_construction", variant -> variant
                    .description("Fancy Grimstone Construction")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_flaky", variant -> variant
                    .description("Flaky Grimstone")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_hate", variant -> variant
                    .description("Mysterious Grimstone Symbol")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_plate", variant -> variant
                    .description("Grimstone Plate")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_plate_smooth", variant -> variant
                    .description("Smooth Grimstone Plate")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_platform", variant -> variant
                    .description("Grimstone Platform")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/grimstone/grimstone_raw")))
            .variant("grimstone_platform_tiles", variant -> variant
                    .description("Grimstone Platform Tiles")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/grimstone/grimstone_raw"))
                    .texture("side", Chisel.prefix("block/grimstone/grimstone_platform-side")))
            .variant("grimstone_raw", variant -> variant
                    .description("Grimstone")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_smooth", variant -> variant
                    .description("Smooth Grimstone")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_tiles", variant -> variant
                    .description("Fancy Grimstone Tiles")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))));

    private GrimstoneFamily() {
    }
}
