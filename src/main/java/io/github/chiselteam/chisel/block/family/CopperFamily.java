package io.github.chiselteam.chisel.block.family;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.*;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CopperFamily extends ChiselFamily {
    public CopperFamily(BlockBehaviour.Properties props) {
        family = builder("copper")
                .addVariant(Blocks.COPPER_BLOCK.weathering().unaffected())
                .addVariant(Blocks.COPPER_BLOCK.weathering().exposed())
                .addVariant(Blocks.COPPER_BLOCK.weathering().weathered())
                .addVariant(Blocks.COPPER_BLOCK.weathering().oxidized())
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
        lang.addBlock(getVariant("copper_bad_greggy"), "Copper", "An Old Relic from the land of Oneteufyv");
        lang.addBlock(getVariant("copper_bolted"), "Copper", "Fancy Bolted Plating");
        lang.addBlock(getVariant("copper_caution"), "Copper", "Caution Stripes");
        lang.addBlock(getVariant("copper_crate"), "Copper", "Shipping Crate");
        lang.addBlock(getVariant("copper_machine"), "Copper", "Machine");
        lang.addBlock(getVariant("copper_scaffold"), "Copper", "Scaffold");
        lang.addBlock(getVariant("copper_thermal"), "Copper", "Thermal");
    }
}

