package io.github.chiselteam.chisel.block.family;

import io.github.chiselteam.chisel.block.util.ChiselFamily;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static io.github.chiselteam.chisel.registry.ChiselModelHandlers.*;

public class MangroveFamily extends ChiselFamily {
    public MangroveFamily(BlockBehaviour.Properties props) {
        family = builder("mangrove_planks")
                .addVariant(Blocks.MANGROVE_PLANKS)
                .addVariant("mangrove_planks_braced", props, CONNECTED_TBS)
                .addVariant("mangrove_planks_braid", props, CONNECTED)
                .addVariant("mangrove_planks_crude_horizontal", props, MULTIBLOCK_3X3)
                .addVariant("mangrove_planks_crude_paneling", props)
                .addVariant("mangrove_planks_crude_vertical", props, MULTIBLOCK_3X3)
                .addVariant("mangrove_planks_encased", props, CONNECTED)
                .addVariant("mangrove_planks_encased_large", props, CONNECTED)
                .addVariant("mangrove_planks_encased_smooth", props, CONNECTED)
                .addVariant("mangrove_planks_large", props)
                .addVariant("mangrove_planks_log_bordered", props, CONNECTED)
                .addVariant("mangrove_planks_log_cabin_ns", props, CONNECTED)
                .addVariant("mangrove_planks_log_cabin_ew", props, CONNECTED)
                .addVariant("mangrove_planks_paneling", props, CONNECTED)
                .addVariant("mangrove_planks_shipping", props, CONNECTED)
                .addVariant("mangrove_planks_smooth", props, CONNECTED)
                .addVariant("mangrove_planks_stacked", props)
                .addVariant("mangrove_planks_vertical", props)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("mangrove_planks_braced"), "Mangrove Wood Planks", "Mangrove Wood Panel");
        lang.addBlock(getVariant("mangrove_planks_braid"), "Mangrove Wood Planks", "Mangrove Wood Braid");
        lang.addBlock(getVariant("mangrove_planks_crude_horizontal"), "Mangrove Wood Planks", "Vertical Mangrove Wood Planks in Disarray");
        lang.addBlock(getVariant("mangrove_planks_crude_paneling"), "Mangrove Wood Planks", "Mangrove Wood Planks in Disarray");
        lang.addBlock(getVariant("mangrove_planks_crude_vertical"), "Mangrove Wood Planks", "Vertical Mangrove Wood Planks in Disarray");
        lang.addBlock(getVariant("mangrove_planks_encased"), "Mangrove Wood Planks", "Encased Mangrove Wood Panel");
        lang.addBlock(getVariant("mangrove_planks_encased_large"), "Mangrove Wood Planks", "Large Long Mangrove Wood Planks");
        lang.addBlock(getVariant("mangrove_planks_encased_smooth"), "Mangrove Wood Planks", "Smooth Mangrove Wood Planks");
        lang.addBlock(getVariant("mangrove_planks_large"), "Mangrove Wood Planks", "Large Long Mangrove Wood Planks");
        lang.addBlock(getVariant("mangrove_planks_log_bordered"), "Mangrove Wood Planks", "Log Bordered Mangrove Wood Panel");
        lang.addBlock(getVariant("mangrove_planks_log_cabin_ns"), "Mangrove Wood Planks", "Mangrove Wood Log Cabin (North-South)");
        lang.addBlock(getVariant("mangrove_planks_log_cabin_ew"), "Mangrove Wood Planks", "Mangrove Wood Log Cabin (East-West)");
        lang.addBlock(getVariant("mangrove_planks_paneling"), "Mangrove Wood Planks", "Mangrove Wood Panel");
        lang.addBlock(getVariant("mangrove_planks_shipping"), "Mangrove Wood Planks", "Mangrove Wood Crate");
        lang.addBlock(getVariant("mangrove_planks_smooth"), "Mangrove Wood Planks", "Smooth Mangrove Wood Planks");
        lang.addBlock(getVariant("mangrove_planks_stacked"), "Mangrove Wood Planks", "Stacked Mangrove Wood Tiles");
        lang.addBlock(getVariant("mangrove_planks_vertical"), "Mangrove Wood Planks", "Vertical Mangrove Wood Planks");
    }
}
