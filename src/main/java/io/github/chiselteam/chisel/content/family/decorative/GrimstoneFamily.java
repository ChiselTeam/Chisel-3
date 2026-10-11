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
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Grimstone").blockFactory((p) -> new SparklyConnectedTextureBlock(p, ChiselParticles.GRIMSTONE)))
            .variant("grimstone_blocks", v -> v.description("Grimstone Blocks").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_blocks_rough", v -> v.description("Rough Grimstone Blocks").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_bricks", v -> v.description("Grimstone Bricks").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_bricks_large", v -> v.description("Large Grimstone Bricks").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_chiseled", v -> v.description("Chiseled Grimstone").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/grimstone/grimstone_smooth")))
            .variant("grimstone_chunks", v -> v.description("Grimstone").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_construction", v -> v.description("Fancy Grimstone Construction").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_flaky", v -> v.description("Flaky Grimstone").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_hate", v -> v.description("Mysterious Grimstone Symbol").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_plate", v -> v.description("Grimstone Plate").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_plate_smooth", v -> v.description("Smooth Grimstone Plate").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_platform", v -> v.description("Grimstone Platform").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/grimstone/grimstone_raw")))
            .variant("grimstone_platform_tiles", v -> v.description("Grimstone Platform Tiles").model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/grimstone/grimstone_raw"))
                    .texture("side", Chisel.prefix("block/grimstone/grimstone_platform-side")))
            .variant("grimstone_raw", v -> v.description("Grimstone").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_smooth", v -> v.description("Smooth Grimstone").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)))
            .variant("grimstone_tiles", v -> v.description("Fancy Grimstone Tiles").properties(() -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))));

    private GrimstoneFamily() {
    }
}
