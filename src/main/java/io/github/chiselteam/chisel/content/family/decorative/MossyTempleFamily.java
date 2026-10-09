package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MossyTempleFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("mossy_temple", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Mossy Temple Block")
                    .eldritch())
            .variant("mossy_temple_bricks", variant -> variant
                    .description("Mossy Temple Bricks"))
            .variant("mossy_temple_bricks_disarray", variant -> variant
                    .description("Mossy Temple Bricks in disarray"))
            .variant("mossy_temple_bricks_large", variant -> variant
                    .description("Large Mossy Temple Bricks"))
            .variant("mossy_temple_bricks_worn", variant -> variant
                    .description("Worn Mossy Temple Bricks"))
            .variant("mossy_temple_cobble", variant -> variant
                    .description("Mossy Temple Cobblestone"))
            .variant("mossy_temple_column", variant -> variant
                    .description("Mossy Temple Column")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_tiles")))
            .variant("mossy_temple_ornate", variant -> variant
                    .description("Ornate Mossy Temple Block"))
            .variant("mossy_temple_plate", variant -> variant
                    .description("Mossy Temple Plate"))
            .variant("mossy_temple_plate_cracked", variant -> variant
                    .description("Cracked Mossy Temple Plate"))
            .variant("mossy_temple_stand", variant -> variant
                    .description("Mossy Temple Stand")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_plate")))
            .variant("mossy_temple_stand_creeper", variant -> variant
                    .description("Mossy Temple Creeper Stand")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_plate")))
            .variant("mossy_temple_stand_mosaic", variant -> variant
                    .description("Mossy Temple Mosaic Stand")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_plate")))
            .variant("mossy_temple_tiles", variant -> variant
                    .description("Mossy Temple Tiles"))
            .variant("mossy_temple_tiles_light", variant -> variant
                    .description("Light Mossy Temple Tiles"))
            .variant("mossy_temple_tiles_small", variant -> variant
                    .description("Small Mossy Temple Tiles"))
            .variant("mossy_temple_tiles_small_light", variant -> variant
                    .description("Small Light Mossy Temple Tiles")));

    private MossyTempleFamily() {
    }
}
