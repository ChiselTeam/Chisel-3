package io.github.chiselteam.chisel.block.family;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.*;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DarkOakFamily extends ChiselFamily {
    public DarkOakFamily(BlockBehaviour.Properties props) {
        family = builder("dark_oak_planks")
                .addVariant(Blocks.DARK_OAK_PLANKS)
                .addVariant("dark_oak_planks_braced", props, CONNECTED_TBS)
                .addVariant("dark_oak_planks_braid", props, CONNECTED)
                .addVariant("dark_oak_planks_crude_horizontal", props, MULTIBLOCK_3X3)
                .addVariant("dark_oak_planks_crude_paneling", props)
                .addVariant("dark_oak_planks_crude_vertical", props, MULTIBLOCK_3X3)
                .addVariant("dark_oak_planks_encased", props, CONNECTED)
                .addVariant("dark_oak_planks_encased_large", props, CONNECTED)
                .addVariant("dark_oak_planks_encased_smooth", props, CONNECTED)
                .addVariant("dark_oak_planks_large", props)
                .addVariant("dark_oak_planks_log_bordered", props, CONNECTED)
                .addVariant("dark_oak_planks_log_cabin_ns", props, CONNECTED)
                .addVariant("dark_oak_planks_log_cabin_ew", props, CONNECTED)
                .addVariant("dark_oak_planks_paneling", props, CONNECTED)
                .addVariant("dark_oak_planks_shipping", props, CONNECTED)
                .addVariant("dark_oak_planks_smooth", props, CONNECTED)
                .addVariant("dark_oak_planks_stacked", props)
                .addVariant("dark_oak_planks_vertical", props)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("dark_oak_planks_braced"), "Dark Oak Wood Planks", "Dark Oak Wood Panel");
        lang.addBlock(getVariant("dark_oak_planks_braid"), "Dark Oak Wood Planks", "Dark Oak Wood Braid");
        lang.addBlock(getVariant("dark_oak_planks_crude_horizontal"), "Dark Oak Wood Planks", "Vertical Dark Oak Wood Planks in Disarray");
        lang.addBlock(getVariant("dark_oak_planks_crude_paneling"), "Dark Oak Wood Planks", "Dark Oak Wood Planks in Disarray");
        lang.addBlock(getVariant("dark_oak_planks_crude_vertical"), "Dark Oak Wood Planks", "Vertical Dark Oak Wood Planks in Disarray");
        lang.addBlock(getVariant("dark_oak_planks_encased"), "Dark Oak Wood Planks", "Encased Dark Oak Wood Panel");
        lang.addBlock(getVariant("dark_oak_planks_encased_large"), "Dark Oak Wood Planks", "Large Long Dark Oak Wood Planks");
        lang.addBlock(getVariant("dark_oak_planks_encased_smooth"), "Dark Oak Wood Planks", "Smooth Dark Oak Wood Planks");
        lang.addBlock(getVariant("dark_oak_planks_large"), "Dark Oak Wood Planks", "Large Long Dark Oak Wood Planks");
        lang.addBlock(getVariant("dark_oak_planks_log_bordered"), "Dark Oak Wood Planks", "Log Bordered Dark Oak Wood Panel");
        lang.addBlock(getVariant("dark_oak_planks_log_cabin_ns"), "Dark Oak Wood Planks", "Dark Oak Wood Log Cabin (North-South)");
        lang.addBlock(getVariant("dark_oak_planks_log_cabin_ew"), "Dark Oak Wood Planks", "Dark Oak Wood Log Cabin (East-West)");
        lang.addBlock(getVariant("dark_oak_planks_paneling"), "Dark Oak Wood Planks", "Dark Oak Wood Panel");
        lang.addBlock(getVariant("dark_oak_planks_shipping"), "Dark Oak Wood Planks", "Dark Oak Wood Crate");
        lang.addBlock(getVariant("dark_oak_planks_smooth"), "Dark Oak Wood Planks", "Smooth Dark Oak Wood Planks");
        lang.addBlock(getVariant("dark_oak_planks_stacked"), "Dark Oak Wood Planks", "Stacked Dark Oak Wood Tiles");
        lang.addBlock(getVariant("dark_oak_planks_vertical"), "Dark Oak Wood Planks", "Vertical Dark Oak Wood Planks");
    }
}

