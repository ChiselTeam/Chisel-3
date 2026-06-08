package io.github.chiselteam.chisel.block.family;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.*;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RedstoneLampFamily extends ChiselFamily {
    public RedstoneLampFamily(BlockBehaviour.Properties props) {
        family = builder("redstone_lamp")
                .addVariant(Blocks.REDSTONE_LAMP)
                .addVariant("redstone_lamp_square", RedstoneLampBlock::new, () -> props, REDSTONE_LAMP)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("redstone_lamp_square"), "Redstone Lamp", "Square");
    }
}
