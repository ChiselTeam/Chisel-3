package io.github.chiselteam.chisel.block.family.materials.copper;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.CONNECTED;
import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.TBS;

public class CopperFamily extends ChiselFamily {
    public CopperFamily(BlockBehaviour.Properties props) {
        family = builder("copper")
                .addVariant(Blocks.COPPER_BLOCK)
                .addVariant(Blocks.CHISELED_COPPER)
                .addVariant(Blocks.CUT_COPPER)
                .addVariant(Blocks.COPPER_GRATE)
                .addVariant("copper_bad_greggy", props, CONNECTED)
                .addVariant("copper_bolted", props)
                .addVariant("copper_caution", props, CONNECTED)
                .addVariant("copper_crate", props, CONNECTED)
                .addVariant("copper_machine", props)
                .addVariant("copper_scaffold", props, CONNECTED)
                .addVariant("copper_thermal", props, TBS)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("copper_bad_greggy"), "Block of Copper", "An Old Relic from the land of Oneteufyv");
        lang.addBlock(getVariant("copper_bolted"), "Block of Copper", "Fancy Bolted Plating");
        lang.addBlock(getVariant("copper_caution"), "Block of Copper", "Caution Stripes");
        lang.addBlock(getVariant("copper_crate"), "Block of Copper", "Shipping Crate");
        lang.addBlock(getVariant("copper_machine"), "Block of Copper", "Machine");
        lang.addBlock(getVariant("copper_scaffold"), "Block of Copper", "Scaffold");
        lang.addBlock(getVariant("copper_thermal"), "Block of Copper", "Thermal");
    }
}

