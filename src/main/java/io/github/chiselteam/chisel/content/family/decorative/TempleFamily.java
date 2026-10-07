package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class TempleFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("temple", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))
                    .blockName("Temple Block")
                    .eldritch())
            .variant("temple_cobble", variant -> variant
                    .description("Temple Cobblestone")
                    .model(ChiselModelHandlers.CONNECTED)
                    .textureFromBase("ctm_cornerless"))
            .variant("temple_bricks", variant -> variant
                    .description("Temple Bricks"))
            .variant("temple_bricks_disarray", variant -> variant
                    .description("Temple Bricks in disarray"))
            .variant("temple_bricks_large", variant -> variant
                    .description("Large Temple Bricks"))
            .variant("temple_bricks_worn", variant -> variant
                    .description("Worn Temple Bricks"))
            .variant("temple_column", variant -> variant
                    .description("Temple Column")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_tiles")))
            .variant("temple_ornate", variant -> variant
                    .description("Ornate Temple Block"))
            .variant("temple_plate", variant -> variant
                    .description("Temple Plate"))
            .variant("temple_plate_cracked", variant -> variant
                    .description("Cracked Temple Plate"))
            .variant("temple_stand", variant -> variant
                    .description("Temple Stand")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_plate")))
            .variant("temple_stand_creeper", variant -> variant
                    .description("Temple Creeper Stand")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_plate")))
            .variant("temple_stand_mosaic", variant -> variant
                    .description("Temple Mosaic Stand")
                    .model(ChiselModelHandlers.TBS)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/temple/temple_plate")))
            .variant("temple_tiles", variant -> variant
                    .description("Temple Tiles"))
            .variant("temple_tiles_light", variant -> variant
                    .description("Light Temple Tiles"))
            .variant("temple_tiles_small", variant -> variant
                    .description("Small Temple Tiles"))
            .variant("temple_tiles_small_light", variant -> variant
                    .description("Small Light Temple Tiles")));

    private TempleFamily() {
    }
}
