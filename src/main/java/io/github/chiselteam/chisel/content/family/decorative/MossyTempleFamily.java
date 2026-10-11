package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MossyTempleFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("mossy_temple", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Mossy Temple Block").eldritch())
            .variant("mossy_temple_bricks", v -> v.description("Mossy Temple Bricks"))
            .variant("mossy_temple_bricks_disarray", v -> v.description("Mossy Temple Bricks in disarray"))
            .variant("mossy_temple_bricks_large", v -> v.description("Large Mossy Temple Bricks"))
            .variant("mossy_temple_bricks_worn", v -> v.description("Worn Mossy Temple Bricks"))
            .variant("mossy_temple_cobble", v -> v.description("Mossy Temple Cobblestone"))
            .variant("mossy_temple_column", v -> v.description("Mossy Temple Column").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_tiles")))
            .variant("mossy_temple_ornate", v -> v.description("Ornate Mossy Temple Block"))
            .variant("mossy_temple_plate", v -> v.description("Mossy Temple Plate"))
            .variant("mossy_temple_plate_cracked", v -> v.description("Cracked Mossy Temple Plate"))
            .variant("mossy_temple_stand", v -> v.description("Mossy Temple Stand").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_plate")))
            .variant("mossy_temple_stand_creeper", v -> v.description("Mossy Temple Creeper Stand").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_plate")))
            .variant("mossy_temple_stand_mosaic", v -> v.description("Mossy Temple Mosaic Stand").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/mossy_temple/mossy_temple_plate")))
            .variant("mossy_temple_tiles", v -> v.description("Mossy Temple Tiles"))
            .variant("mossy_temple_tiles_light", v -> v.description("Light Mossy Temple Tiles"))
            .variant("mossy_temple_tiles_small", v -> v.description("Small Mossy Temple Tiles"))
            .variant("mossy_temple_tiles_small_light", v -> v.description("Small Light Mossy Temple Tiles")));

    private MossyTempleFamily() {
    }
}
