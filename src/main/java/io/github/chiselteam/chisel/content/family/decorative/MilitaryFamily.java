package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class MilitaryFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("military", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Military")
                    .model(ChiselModelHandlers.V4))
            .variant("military_imperial_camo", variant -> variant
                    .description("Camouflaged")
                    .textureFromBase("v4_top_left"))
            .variant("military_imperial_camo_secluded", variant -> variant
                    .description("Camouflaged (Secluded)")
                    .textureFromBase("v4_top_left"))
            .variant("military_imperial_caution_orange", variant -> variant
                    .description("Teamed Caution Tape")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("military_imperial_caution_white", variant -> variant
                    .description("White Caution Tape")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("military_imperial_plate", variant -> variant
                    .description("Bolted Plate")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("military_rebel_camo", variant -> variant
                    .description("Camouflaged")
                    .textureFromBase("v4_top_left"))
            .variant("military_rebel_camo_secluded", variant -> variant
                    .description("Camouflaged (Secluded)")
                    .textureFromBase("v4_top_left"))
            .variant("military_rebel_caution_red", variant -> variant
                    .description("Teamed Caution Tape")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("military_rebel_caution_white", variant -> variant
                    .description("White Caution Tape")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("military_rebel_plate", variant -> variant
                    .description("Bolted Plate")
                    .model(ChiselModelHandlers.CUBE_ALL)));

    private MilitaryFamily() {
    }
}
