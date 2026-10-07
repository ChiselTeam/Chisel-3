package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.RoadlineBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RoadLineFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("road_line", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).noOcclusion().noCollision())
                    .blockName("Road Lines")
                    .model(ChiselModelHandlers.ROAD_LINES)
                    .blockFactory(RoadlineBlock::new))
            .variant("road_line_double_white_center", variant -> variant
                    .description("Double White"))
            .variant("road_line_double_white_long", variant -> variant
                    .description("Double White"))
            .variant("road_line_double_white_side", variant -> variant
                    .description("Double White"))
            .variant("road_line_double_yellow_center", variant -> variant
                    .description("Double Yellow"))
            .variant("road_line_double_yellow_long", variant -> variant
                    .description("Double Yellow"))
            .variant("road_line_double_yellow_side", variant -> variant
                    .description("Double Yellow"))
            .variant("road_line_white_center", variant -> variant
                    .description("White"))
            .variant("road_line_white_long", variant -> variant
                    .description("White"))
            .variant("road_line_white_side", variant -> variant
                    .description("White"))
            .variant("road_line_yellow_center", variant -> variant
                    .description("Yellow"))
            .variant("road_line_yellow_long", variant -> variant
                    .description("Yellow"))
            .variant("road_line_yellow_side", variant -> variant
                    .description("Yellow")));

    private RoadLineFamily() {
    }
}
