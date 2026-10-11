package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselCarvedPumpkinBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class JackOLanternFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("jack_o_lantern", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.JACK_O_LANTERN)).blockName("Jack o'Lantern").model(ChiselModelHandlers.PUMPKIN).blockFactory(ChiselCarvedPumpkinBlock::new))
            .existingBlock(Blocks.JACK_O_LANTERN)
            .variant("jack_o_lantern_0", v -> v.description("Surprised"))
            .variant("jack_o_lantern_1", v -> v.description("Smiling Open"))
            .variant("jack_o_lantern_2", v -> v.description("Cheeky"))
            .variant("jack_o_lantern_3", v -> v.description("Pensive"))
            .variant("jack_o_lantern_4", v -> v.description("Disappointed"))
            .variant("jack_o_lantern_5", v -> v.description("Smirking"))
            .variant("jack_o_lantern_6", v -> v.description("Curious"))
            .variant("jack_o_lantern_7", v -> v.description("Bored"))
            .variant("jack_o_lantern_8", v -> v.description("Sad"))
            .variant("jack_o_lantern_9", v -> v.description("Evil"))
            .variant("jack_o_lantern_10", v -> v.description("Excited"))
            .variant("jack_o_lantern_11", v -> v.description("Sleeping"))
            .variant("jack_o_lantern_12", v -> v.description("Astonished"))
            .variant("jack_o_lantern_13", v -> v.description("Neutral"))
            .variant("jack_o_lantern_14", v -> v.description("Laughing out loud"))
            .variant("jack_o_lantern_15", v -> v.description("Smiling Closed"))
            .variant("jack_o_lantern_16", v -> v.description("Scary")));

    private JackOLanternFamily() {
    }
}
