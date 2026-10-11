package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.block.ChiselRotatedPillarBlock;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class FantasyFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("fantasy", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Fantasy Block"))
            .variant("fantasy_block", v -> v.description("Fantasy Block").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_brick", v -> v.description("Bricks"))
            .variant("fantasy_brick_chaotic", v -> v.description("Chaotic Bricks"))
            .variant("fantasy_brick_chaotic_worn", v -> v.description("Worn Chaotic Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_brick_faded", v -> v.description("Faded Bricks"))
            .variant("fantasy_brick_worn", v -> v.description("Worn Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_path", v -> v.description("Path").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_gold_decor_1", v -> v.description("Gold Decoration 1").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new)
                    .texture("top", Chisel.prefix("block/fantasy/fantasy_gold_decor_2-top"))
                    .texture("bottom", Chisel.prefix("block/fantasy/fantasy_gold_decor_2-bottom")))
            .variant("fantasy_gold_decor_2", v -> v.description("Gold Decoration 2").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            .variant("fantasy_gold_decor_3", v -> v.description("Gold Decoration 3").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            .variant("fantasy_gold_decor_4", v -> v.description("Gold Decoration 4").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            .variant("fantasy_pillar", v -> v.description("Pillar").model(ChiselModelHandlers.TBS))
            .variant("fantasy_pillar_2", v -> v.description("Pillar 2").model(ChiselModelHandlers.TBS))
            .variant("fantasy_pillar_3", v -> v.description("Pillar 3").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_plate", v -> v.description("Plate").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            );

    public static final ChiselFamily PURPLE_FAMILY = ChiselFamily.build("fantasy_purple", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Fantasy Block"))
            .variant("fantasy_purple_block", v -> v.description("Purple Fantasy Block").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_purple_brick", v -> v.description("Purple Bricks"))
            .variant("fantasy_purple_brick_chaotic", v -> v.description("Purple Chaotic Bricks"))
            .variant("fantasy_purple_brick_chaotic_worn", v -> v.description("Purple Worn Chaotic Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_purple_brick_faded", v -> v.description("Purple Faded Bricks"))
            .variant("fantasy_purple_brick_worn", v -> v.description("Purple Worn Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_purple_path", v -> v.description("Purple Path").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_purple_pillar", v -> v.description("Purple Pillar").model(ChiselModelHandlers.TBS))
            .variant("fantasy_purple_pillar_2", v -> v.description("Purple Pillar 2").model(ChiselModelHandlers.TBS))
            .variant("fantasy_purple_pillar_3", v -> v.description("Purple Pillar 3").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_purple_plate", v -> v.description("Purple Plate").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            );

    public static final ChiselFamily GREEN_FAMILY = ChiselFamily.build("fantasy_green", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Fantasy Block"))
            .variant("fantasy_green_block", v -> v.description("Green Fantasy Block").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_green_brick", v -> v.description("Green Bricks"))
            .variant("fantasy_green_brick_chaotic", v -> v.description("Green Chaotic Bricks"))
            .variant("fantasy_green_brick_chaotic_worn", v -> v.description("Green Worn Chaotic Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_green_brick_faded", v -> v.description("Green Faded Bricks"))
            .variant("fantasy_green_brick_worn", v -> v.description("Green Worn Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_green_path", v -> v.description("Green Path").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_green_pillar", v -> v.description("Green Pillar").model(ChiselModelHandlers.TBS))
            .variant("fantasy_green_pillar_2", v -> v.description("Green Pillar 2").model(ChiselModelHandlers.TBS))
            .variant("fantasy_green_pillar_3", v -> v.description("Green Pillar 3").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_green_plate", v -> v.description("Green Plate").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            );

    public static final ChiselFamily BLUE_FAMILY = ChiselFamily.build("fantasy_blue", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Fantasy Block"))
            .variant("fantasy_blue_block", v -> v.description("Blue Fantasy Block").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_blue_brick", v -> v.description("Blue Bricks"))
            .variant("fantasy_blue_brick_chaotic", v -> v.description("Blue Chaotic Bricks"))
            .variant("fantasy_blue_brick_chaotic_worn", v -> v.description("Blue Worn Chaotic Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_blue_brick_faded", v -> v.description("Blue Faded Bricks"))
            .variant("fantasy_blue_brick_worn", v -> v.description("Blue Worn Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_blue_path", v -> v.description("Blue Path").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_blue_pillar", v -> v.description("Blue Pillar").model(ChiselModelHandlers.TBS))
            .variant("fantasy_blue_pillar_2", v -> v.description("Blue Pillar 2").model(ChiselModelHandlers.TBS))
            .variant("fantasy_blue_pillar_3", v -> v.description("Blue Pillar 3").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_blue_plate", v -> v.description("Blue Plate").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            );

    public static final ChiselFamily RED_FAMILY = ChiselFamily.build("fantasy_red", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)).blockName("Fantasy Block"))
            .variant("fantasy_red_block", v -> v.description("Red Fantasy Block").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_red_brick", v -> v.description("Red Bricks"))
            .variant("fantasy_red_brick_chaotic", v -> v.description("Red Chaotic Bricks"))
            .variant("fantasy_red_brick_chaotic_worn", v -> v.description("Red Worn Chaotic Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_red_brick_faded", v -> v.description("Red Faded Bricks"))
            .variant("fantasy_red_brick_worn", v -> v.description("Red Worn Bricks").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_red_path", v -> v.description("Red Path").model(ChiselModelHandlers.CONNECTED))
            .variant("fantasy_red_pillar", v -> v.description("Red Pillar").model(ChiselModelHandlers.TBS))
            .variant("fantasy_red_pillar_2", v -> v.description("Red Pillar 2").model(ChiselModelHandlers.TBS))
            .variant("fantasy_red_pillar_3", v -> v.description("Red Pillar 3").model(ChiselModelHandlers.CTMV))
            .variant("fantasy_red_plate", v -> v.description("Red Plate").model(ChiselModelHandlers.TBS).blockFactory(ChiselRotatedPillarBlock::new))
            );

    private FantasyFamily() {
    }
}
