package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.RoadlineBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RoadLineFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("road_line", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).noOcclusion().noCollission()).blockName("Road Lines").model(ChiselModelHandlers.ROAD_LINES).blockFactory(RoadlineBlock::new))
            .variant("road_line_double_white_center", v -> v.description("Double White"))
            .variant("road_line_double_white_long", v -> v.description("Double White"))
            .variant("road_line_double_white_side", v -> v.description("Double White"))
            .variant("road_line_double_yellow_center", v -> v.description("Double Yellow"))
            .variant("road_line_double_yellow_long", v -> v.description("Double Yellow"))
            .variant("road_line_double_yellow_side", v -> v.description("Double Yellow"))
            .variant("road_line_white_center", v -> v.description("White"))
            .variant("road_line_white_long", v -> v.description("White"))
            .variant("road_line_white_side", v -> v.description("White"))
            .variant("road_line_yellow_center", v -> v.description("Yellow"))
            .variant("road_line_yellow_long", v -> v.description("Yellow"))
            .variant("road_line_yellow_side", v -> v.description("Yellow")));

    private RoadLineFamily() {
    }
}
