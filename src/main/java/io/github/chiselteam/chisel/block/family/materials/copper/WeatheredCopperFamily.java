package io.github.chiselteam.chisel.block.family.materials.copper;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.CONNECTED;
import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.TBS;

public class WeatheredCopperFamily extends ChiselFamily {
    public WeatheredCopperFamily(BlockBehaviour.Properties props) {
        family = builder("weathered_copper")
                .addVariant(Blocks.WEATHERED_COPPER)
                .addVariant(Blocks.WEATHERED_CHISELED_COPPER)
                .addVariant(Blocks.WEATHERED_CUT_COPPER)
                .addVariant(Blocks.WEATHERED_COPPER_GRATE)
                .addVariant("weathered_copper_bad_greggy", props, CONNECTED)
                .addVariant("weathered_copper_bolted", props)
                .addVariant("weathered_copper_caution", props, CONNECTED)
                .addVariant("weathered_copper_crate", props, CONNECTED)
                .addVariant("weathered_copper_machine", props)
                .addVariant("weathered_copper_scaffold", props, CONNECTED)
                .addVariant("weathered_copper_thermal", props, TBS)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("weathered_copper_bad_greggy"), "Weathered Copper", "An Old Relic from the land of Oneteufyv");
        lang.addBlock(getVariant("weathered_copper_bolted"), "Weathered Copper", "Fancy Bolted Plating");
        lang.addBlock(getVariant("weathered_copper_caution"), "Weathered Copper", "Caution Stripes");
        lang.addBlock(getVariant("weathered_copper_crate"), "Weathered Copper", "Shipping Crate");
        lang.addBlock(getVariant("weathered_copper_machine"), "Weathered Copper", "Machine");
        lang.addBlock(getVariant("weathered_copper_scaffold"), "Weathered Copper", "Scaffold");
        lang.addBlock(getVariant("weathered_copper_thermal"), "Weathered Copper", "Thermal");
    }
}

