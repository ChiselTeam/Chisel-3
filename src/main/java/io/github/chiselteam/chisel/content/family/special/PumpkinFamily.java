package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselCarvedPumpkinBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PumpkinFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("pumpkin", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.PUMPKIN))
                    .blockName("Pumpkin")
                    .model(ChiselModelHandlers.PUMPKIN)
                    .blockFactory(ChiselCarvedPumpkinBlock::new))
            .existingBlock(Blocks.CARVED_PUMPKIN)
            .variant("pumpkin_0", variant -> variant
                    .description("Surprised"))
            .variant("pumpkin_1", variant -> variant
                    .description("Smiling open"))
            .variant("pumpkin_2", variant -> variant
                    .description("Cheeky"))
            .variant("pumpkin_3", variant -> variant
                    .description("Pensive"))
            .variant("pumpkin_4", variant -> variant
                    .description("Disappointed"))
            .variant("pumpkin_5", variant -> variant
                    .description("Smirking"))
            .variant("pumpkin_6", variant -> variant
                    .description("Curious"))
            .variant("pumpkin_7", variant -> variant
                    .description("Bored"))
            .variant("pumpkin_8", variant -> variant
                    .description("Sad"))
            .variant("pumpkin_9", variant -> variant
                    .description("Evil"))
            .variant("pumpkin_10", variant -> variant
                    .description("Exited"))
            .variant("pumpkin_11", variant -> variant
                    .description("Sleeping"))
            .variant("pumpkin_12", variant -> variant
                    .description("Astonished"))
            .variant("pumpkin_13", variant -> variant
                    .description("Neutral"))
            .variant("pumpkin_14", variant -> variant
                    .description("Laughing out loud"))
            .variant("pumpkin_15", variant -> variant
                    .description("Smiling Closed"))
            .variant("pumpkin_16", variant -> variant
                    .description("Scary")));

    private PumpkinFamily() {
    }
}
