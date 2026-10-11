package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselCarvedPumpkinBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class PumpkinFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("pumpkin", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.PUMPKIN)).blockName("Pumpkin").model(ChiselModelHandlers.PUMPKIN).blockFactory(ChiselCarvedPumpkinBlock::new))
            .existingBlock(Blocks.CARVED_PUMPKIN)
            .variant("pumpkin_0", v -> v.description("Surprised"))
            .variant("pumpkin_1", v -> v.description("Smiling open"))
            .variant("pumpkin_2", v -> v.description("Cheeky"))
            .variant("pumpkin_3", v -> v.description("Pensive"))
            .variant("pumpkin_4", v -> v.description("Disappointed"))
            .variant("pumpkin_5", v -> v.description("Smirking"))
            .variant("pumpkin_6", v -> v.description("Curious"))
            .variant("pumpkin_7", v -> v.description("Bored"))
            .variant("pumpkin_8", v -> v.description("Sad"))
            .variant("pumpkin_9", v -> v.description("Evil"))
            .variant("pumpkin_10", v -> v.description("Excited"))
            .variant("pumpkin_11", v -> v.description("Sleeping"))
            .variant("pumpkin_12", v -> v.description("Astonished"))
            .variant("pumpkin_13", v -> v.description("Neutral"))
            .variant("pumpkin_14", v -> v.description("Laughing out loud"))
            .variant("pumpkin_15", v -> v.description("Smiling Closed"))
            .variant("pumpkin_16", v -> v.description("Scary")));

    private PumpkinFamily() {
    }
}
