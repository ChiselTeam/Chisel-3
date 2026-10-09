package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.SparklyConnectedTextureBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.registry.ChiselParticles;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class HolystoneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("holystone", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Holystone")
                    .blockFactory((p) -> new SparklyConnectedTextureBlock(p, ChiselParticles.HOLYSTONE)))
            .variant("holystone_blocks", variant -> variant
                    .description("Holystone Blocks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_blocks_rough", variant -> variant
                    .description("Rough Holystone Blocks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_bricks", variant -> variant
                    .description("Holystone Bricks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_bricks_large", variant -> variant
                    .description("Large Holystone Bricks")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_chiseled", variant -> variant
                    .description("Chiseled Holystone")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/holystone/holystone_smooth")))
            .variant("holystone_construction", variant -> variant
                    .description("Fancy Holystone Construction")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_love", variant -> variant
                    .description("Mysterious Holystone Symbol")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_plate", variant -> variant
                    .description("Holystone Plate")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_plate_smooth", variant -> variant
                    .description("Smooth Holystone Plate")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_platform", variant -> variant
                    .description("Holystone Platform")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/holystone/holystone_platform-side")))
            .variant("holystone_platform_tiles", variant -> variant
                    .description("Holystone Platform Tiles")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/holystone/holystone_raw")))
            .variant("holystone_raw", variant -> variant
                    .description("Holystone")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_smooth", variant -> variant
                    .description("Smooth Holystone")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("holystone_tiles", variant -> variant
                    .description("Fancy Holystone Tiles")
                    .properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))));

    private HolystoneFamily() {
    }
}
