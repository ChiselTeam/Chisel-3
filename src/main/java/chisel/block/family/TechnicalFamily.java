package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TechnicalFamily extends ChiselFamily {
    public TechnicalFamily(BlockBehaviour.Properties props) {
        family = builder("technical")
                .addVariant("technical_125", props)
                .addVariant("technical_cables", props, VariantModelType.CONNECTED)
                .addVariant("technical_engineering", props, VariantModelType.CONNECTED)
                .addVariant("technical_engineering_1", props, VariantModelType.CONNECTED)
                .addVariant("technical_engineering_2", props, VariantModelType.CONNECTED)
                .addVariant("technical_engineering_3", props, VariantModelType.CONNECTED)
                .addVariant("technical_engineering_prototype", props, VariantModelType.CONNECTED)
                .addVariant("technical_exhaust", props, VariantModelType.CONNECTED)
                .addVariant("technical_fan_fast", props, VariantModelType.TBS)
                .addVariant("technical_fan_fast_transparent", props.noOcclusion(), VariantModelType.TBS)
                .addVariant("technical_fan_malfunction", props, VariantModelType.TBS)
                .addVariant("technical_fan_malfunction_slow", props, VariantModelType.TBS)
                .addVariant("technical_fan_massive", props, VariantModelType.V9)
                .addVariant("technical_fan_still", props, VariantModelType.TBS)
                .addVariant("technical_fan_still_transparent", props.noOcclusion(), VariantModelType.TBS)
                .addVariant("technical_gears", props)
                .addVariant("technical_grate", props, VariantModelType.CONNECTED)
                .addVariant("technical_grate_rusty", props, VariantModelType.CONNECTED)
                .addVariant("technical_hex_plating", props, VariantModelType.V9)
                .addVariant("technical_insulation", props, VariantModelType.CONNECTED)
                .addVariant("technical_makeshift_panels", props, VariantModelType.V9)
                .addVariant("technical_megacell", props, VariantModelType.TBS)
                .addVariant("technical_old", props)
                .addVariant("technical_oldtimeyserveranim", props)
                .addVariant("technical_panel_caution", props)
                .addVariant("technical_piping", props, VariantModelType.R9)
                .addVariant("technical_rusty", props, VariantModelType.R9)
                .addVariant("technical_scaffold", props, VariantModelType.CONNECTED)
                .addVariant("technical_scaffold_large", props, VariantModelType.CONNECTED)
                .addVariant("technical_scaffold_large_1", props, VariantModelType.CONNECTED)
                .addVariant("technical_scaffold_large_2", props, VariantModelType.CONNECTED)
                .addVariant("technical_scaffold_large_3", props, VariantModelType.CONNECTED)
                .addVariant("technical_scaffold_transparent", props.noOcclusion(), VariantModelType.CONNECTED)
                .addVariant("technical_spinning_stuff", props, VariantModelType.CONNECTED)
                .addVariant("technical_sturdy", props, VariantModelType.CONNECTED)
                .addVariant("technical_under_large", props, VariantModelType.CONNECTED)
                .addVariant("technical_under_small", props, VariantModelType.CONNECTED)
                .addVariant("technical_vents", props, VariantModelType.CONNECTED)
                .addVariant("technical_vents_glowing", props, VariantModelType.CONNECTED)
                .addVariant("technical_wall_pads", props, VariantModelType.CONNECTED)
                .addVariant("technical_weathered_green_panels", props, VariantModelType.R4)
                .addVariant("technical_weathered_orange_panels", props, VariantModelType.R4)
                .addVariant("technical_wires", props)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("technical_125"), "Technical Block", "125");
        lang.addBlock(getVariant("technical_cables"), "Technical Block", "Cables");
        lang.addBlock(getVariant("technical_engineering"), "Technical Block", "Engineering");
        lang.addBlock(getVariant("technical_engineering_1"), "Technical Block", "Engineering (Variant 1)");
        lang.addBlock(getVariant("technical_engineering_2"), "Technical Block", "Engineering (Variant 2)");
        lang.addBlock(getVariant("technical_engineering_3"), "Technical Block", "Engineering (Variant 3)");
        lang.addBlock(getVariant("technical_engineering_prototype"), "Technical Block", "Engineering Prototype");
        lang.addBlock(getVariant("technical_exhaust"), "Technical Block", "Exhaust");
        lang.addBlock(getVariant("technical_fan_fast"), "Technical Block", "Fan (Fast)");
        lang.addBlock(getVariant("technical_fan_fast_transparent"), "Technical Block", "Transparent Fast Fan");
        lang.addBlock(getVariant("technical_fan_malfunction"), "Technical Block", "Fan (Malfunctioning)");
        lang.addBlock(getVariant("technical_fan_malfunction_slow"), "Technical Block", "Slow Malfunctioning Fan");
        lang.addBlock(getVariant("technical_fan_massive"), "Technical Block", "Massive Fan");
        lang.addBlock(getVariant("technical_fan_still"), "Technical Block", "Fan (Off)");
        lang.addBlock(getVariant("technical_fan_still_transparent"), "Technical Block", "Transparent Still Fan");
        lang.addBlock(getVariant("technical_gears"), "Technical Block", "Gears and Flywheels");
        lang.addBlock(getVariant("technical_grate"), "Technical Block", "Grate");
        lang.addBlock(getVariant("technical_grate_rusty"), "Technical Block", "Rusty Grate");
        lang.addBlock(getVariant("technical_hex_plating"), "Technical Block", "Hex Plating");
        lang.addBlock(getVariant("technical_insulation"), "Technical Block", "Insulation");
        lang.addBlock(getVariant("technical_makeshift_panels"), "Technical Block", "Makeshift Panels");
        lang.addBlock(getVariant("technical_megacell"), "Technical Block", "Megacell");
        lang.addBlock(getVariant("technical_old"), "Technical Block", "An Old Relic from the land of Oneteufyv");
        lang.addBlock(getVariant("technical_oldtimeyserveranim"), "Technical Block", "Old-Timey Server");
        lang.addBlock(getVariant("technical_panel_caution"), "Technical Block", "Panels with Caution Tape");
        lang.addBlock(getVariant("technical_piping"), "Technical Block", "Piping");
        lang.addBlock(getVariant("technical_rusty"), "Technical Block", "Rusty");
        lang.addBlock(getVariant("technical_scaffold"), "Technical Block", "Scaffold");
        lang.addBlock(getVariant("technical_scaffold_large"), "Technical Block", "Large Scaffold");
        lang.addBlock(getVariant("technical_scaffold_large_1"), "Technical Block", "Large Scaffold (Variant 1)");
        lang.addBlock(getVariant("technical_scaffold_large_2"), "Technical Block", "Large Scaffold (Variant 2)");
        lang.addBlock(getVariant("technical_scaffold_large_3"), "Technical Block", "Large Scaffold (Variant 3)");
        lang.addBlock(getVariant("technical_scaffold_transparent"), "Technical Block", "Transparent Scaffold");
        lang.addBlock(getVariant("technical_spinning_stuff"), "Technical Block", "Spinning Stuff");
        lang.addBlock(getVariant("technical_sturdy"), "Technical Block", "Sturdy");
        lang.addBlock(getVariant("technical_under_large"), "Technical Block", "Under-Pipe (Large Pipe)");
        lang.addBlock(getVariant("technical_under_small"), "Technical Block", "Under-Pipe (Small Pipes)");
        lang.addBlock(getVariant("technical_vents"), "Technical Block", "Vents");
        lang.addBlock(getVariant("technical_vents_glowing"), "Technical Block", "Glowing Vents");
        lang.addBlock(getVariant("technical_wall_pads"), "Technical Block", "Wall Pads");
        lang.addBlock(getVariant("technical_weathered_green_panels"), "Technical Block", "Weathered Green Panels");
        lang.addBlock(getVariant("technical_weathered_orange_panels"), "Technical Block", "Weathered Orange Panels");
        lang.addBlock(getVariant("technical_wires"), "Technical Block", "Wires");
    }
}

