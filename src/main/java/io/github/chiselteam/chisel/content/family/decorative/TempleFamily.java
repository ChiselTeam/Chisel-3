package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TempleFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("temple", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Temple Block").eldritch())
            .variant("temple_cobble", v -> v.description("Temple Cobblestone").model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("temple_bricks", v -> v.description("Temple Bricks"))
            .variant("temple_bricks_disarray", v -> v.description("Temple Bricks in disarray"))
            .variant("temple_bricks_large", v -> v.description("Large Temple Bricks"))
            .variant("temple_bricks_worn", v -> v.description("Worn Temple Bricks"))
            .variant("temple_column", v -> v.description("Temple Column").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_tiles")))
            .variant("temple_ornate", v -> v.description("Ornate Temple Block"))
            .variant("temple_plate", v -> v.description("Temple Plate"))
            .variant("temple_plate_cracked", v -> v.description("Cracked Temple Plate"))
            .variant("temple_stand", v -> v.description("Temple Stand").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_plate")))
            .variant("temple_stand_creeper", v -> v.description("Temple Creeper Stand").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_plate")))
            .variant("temple_stand_mosaic", v -> v.description("Temple Mosaic Stand").model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_plate")))
            .variant("temple_tiles", v -> v.description("Temple Tiles"))
            .variant("temple_tiles_light", v -> v.description("Light Temple Tiles"))
            .variant("temple_tiles_small", v -> v.description("Small Temple Tiles"))
            .variant("temple_tiles_small_light", v -> v.description("Small Light Temple Tiles")));

    private TempleFamily() {
    }
}
