package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselRedstoneLampBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class RedstoneLampFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("redstone_lamp", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)).blockName("Redstone Lamp").model(ChiselModelHandlers.REDSTONE_LAMP).blockFactory(ChiselRedstoneLampBlock::new))
            .existingBlock(Blocks.REDSTONE_LAMP)
            .variant("redstone_lamp_square", v -> v.description("Square"))
            .variant("redstone_lamp_basic", v -> v.description("Basic"))
            .variant("redstone_lamp_circle", v -> v.description("Circle"))
            .variant("redstone_lamp_cross", v -> v.description("Cross"))
            .variant("redstone_lamp_diamond", v -> v.description("Diamond"))
            .variant("redstone_lamp_grid", v -> v.description("Grid"))
            .variant("redstone_lamp_ornate", v -> v.description("Ornate"))
            .variant("redstone_lamp_slab", v -> v.description("Slab"))
            .variant("redstone_lamp_slab_vertical", v -> v.description("Vertical Slab")));

    private RedstoneLampFamily() {
    }
}
