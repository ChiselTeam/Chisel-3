package io.github.chiselteam.chisel.block.family.materials.copper;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.CONNECTED;
import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.TBS;

public class OxidizedCopperFamily extends ChiselFamily {
    public OxidizedCopperFamily(BlockBehaviour.Properties props) {
        family = builder("oxidized_copper")
                .addVariant(Blocks.OXIDIZED_COPPER)
                .addVariant(Blocks.OXIDIZED_CHISELED_COPPER)
                .addVariant(Blocks.OXIDIZED_CUT_COPPER)
                .addVariant(Blocks.OXIDIZED_COPPER_GRATE)
                .addVariant("oxidized_copper_bad_greggy", props, CONNECTED)
                .addVariant("oxidized_copper_bolted", props)
                .addVariant("oxidized_copper_caution", props, CONNECTED)
                .addVariant("oxidized_copper_crate", props, CONNECTED)
                .addVariant("oxidized_copper_machine", props)
                .addVariant("oxidized_copper_scaffold", props, CONNECTED)
                .addVariant("oxidized_copper_thermal", props, TBS)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("oxidized_copper_bad_greggy"), "Oxidized Copper", "An Old Relic from the land of Oneteufyv");
        lang.addBlock(getVariant("oxidized_copper_bolted"), "Oxidized Copper", "Fancy Bolted Plating");
        lang.addBlock(getVariant("oxidized_copper_caution"), "Oxidized Copper", "Caution Stripes");
        lang.addBlock(getVariant("oxidized_copper_crate"), "Oxidized Copper", "Shipping Crate");
        lang.addBlock(getVariant("oxidized_copper_machine"), "Oxidized Copper", "Machine");
        lang.addBlock(getVariant("oxidized_copper_scaffold"), "Oxidized Copper", "Scaffold");
        lang.addBlock(getVariant("oxidized_copper_thermal"), "Oxidized Copper", "Thermal");
    }
}

