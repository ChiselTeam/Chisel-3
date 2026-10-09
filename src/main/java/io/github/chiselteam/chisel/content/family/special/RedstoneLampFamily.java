package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselRedstoneLampBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RedstoneLampFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("redstone_lamp", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP))
                    .blockName("Redstone Lamp")
                    .model(ChiselModelHandlers.REDSTONE_LAMP)
                    .blockFactory(ChiselRedstoneLampBlock::new))
            .existingBlock(Blocks.REDSTONE_LAMP)
            .variant("redstone_lamp_square", variant -> variant
                    .description("Square")));

    private RedstoneLampFamily() {
    }
}
