package io.github.chiselteam.chisel.block.family.materials.copper;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.CONNECTED;
import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.TBS;

public class ExposedCopperFamily extends ChiselFamily {
    public ExposedCopperFamily(BlockBehaviour.Properties props) {
        family = builder("exposed_copper")
                .addVariant(Blocks.EXPOSED_COPPER)
                .addVariant(Blocks.EXPOSED_CHISELED_COPPER)
                .addVariant(Blocks.EXPOSED_CUT_COPPER)
                .addVariant(Blocks.EXPOSED_COPPER_GRATE)
                .addVariant("exposed_copper_bad_greggy", props, CONNECTED)
                .addVariant("exposed_copper_bolted", props)
                .addVariant("exposed_copper_caution", props, CONNECTED)
                .addVariant("exposed_copper_crate", props, CONNECTED)
                .addVariant("exposed_copper_machine", props)
                .addVariant("exposed_copper_scaffold", props, CONNECTED)
                .addVariant("exposed_copper_thermal", props, TBS)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("exposed_copper_bad_greggy"), "Exposed Copper", "An Old Relic from the land of Oneteufyv");
        lang.addBlock(getVariant("exposed_copper_bolted"), "Exposed Copper", "Fancy Bolted Plating");
        lang.addBlock(getVariant("exposed_copper_caution"), "Exposed Copper", "Caution Stripes");
        lang.addBlock(getVariant("exposed_copper_crate"), "Exposed Copper", "Shipping Crate");
        lang.addBlock(getVariant("exposed_copper_machine"), "Exposed Copper", "Machine");
        lang.addBlock(getVariant("exposed_copper_scaffold"), "Exposed Copper", "Scaffold");
        lang.addBlock(getVariant("exposed_copper_thermal"), "Exposed Copper", "Thermal");
    }
}

