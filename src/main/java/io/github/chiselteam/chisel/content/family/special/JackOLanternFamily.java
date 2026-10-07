package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselCarvedPumpkinBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class JackOLanternFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("jack_o_lantern", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.JACK_O_LANTERN))
                    .blockName("Jack o'Lantern")
                    .model(ChiselModelHandlers.PUMPKIN)
                    .blockFactory(ChiselCarvedPumpkinBlock::new))
            .existingBlock(Blocks.JACK_O_LANTERN)
            .variant("jack_o_lantern_0", variant -> variant
                    .description("Suprised"))
            .variant("jack_o_lantern_1", variant -> variant
                    .description("Smiling open"))
            .variant("jack_o_lantern_2", variant -> variant
                    .description("Cheeky"))
            .variant("jack_o_lantern_3", variant -> variant
                    .description("Pensive"))
            .variant("jack_o_lantern_4", variant -> variant
                    .description("Disappointed"))
            .variant("jack_o_lantern_5", variant -> variant
                    .description("Smirking"))
            .variant("jack_o_lantern_6", variant -> variant
                    .description("Curious"))
            .variant("jack_o_lantern_7", variant -> variant
                    .description("Bored"))
            .variant("jack_o_lantern_8", variant -> variant
                    .description("Sad"))
            .variant("jack_o_lantern_9", variant -> variant
                    .description("Evil"))
            .variant("jack_o_lantern_10", variant -> variant
                    .description("Exited"))
            .variant("jack_o_lantern_11", variant -> variant
                    .description("Sleeping"))
            .variant("jack_o_lantern_12", variant -> variant
                    .description("Astonished"))
            .variant("jack_o_lantern_13", variant -> variant
                    .description("Neutral"))
            .variant("jack_o_lantern_14", variant -> variant
                    .description("Laughing out loud"))
            .variant("jack_o_lantern_15", variant -> variant
                    .description("Smiling Closed"))
            .variant("jack_o_lantern_16", variant -> variant
                    .description("Scary")));

    private JackOLanternFamily() {
    }
}
