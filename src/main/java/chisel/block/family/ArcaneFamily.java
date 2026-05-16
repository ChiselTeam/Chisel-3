package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ArcaneFamily extends ChiselFamily {
    public ArcaneFamily(BlockBehaviour.Properties props) {
        family = builder("arcane")
                .addVariant("arcane_border", props, VariantModelType.CONNECTED)
                .addVariant("arcane_crack", props, VariantModelType.V9)
                .addVariant("arcane_matrix", props, VariantModelType.V9)
                .addVariant("arcane_tile", props, VariantModelType.CONNECTED)
                .addVariant("arcane_big_brick", props, VariantModelType.CONNECTED)
                .addVariant("arcane_border_brain", props, VariantModelType.CONNECTED)
                .addVariant("arcane_conduit", props, VariantModelType.CONNECTED)
                .addVariant("arcane_moon_engrave", props)
                .addVariant("arcane_moon_glow", props)
                .addVariant("arcane_runes", props, VariantModelType.V16)
                .addVariant("arcane_runes_glow", props, VariantModelType.V16)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("arcane_border"), "Arcane", "Border");
        lang.addBlock(getVariant("arcane_crack"), "Arcane", "Damaged");
        lang.addBlock(getVariant("arcane_matrix"), "Arcane", "Matrix");
        lang.addBlock(getVariant("arcane_tile"), "Arcane", "Tile");
        lang.addBlock(getVariant("arcane_big_brick"), "Arcane", "Big Brick");
        lang.addBlock(getVariant("arcane_border_brain"), "Arcane", "Border Brain");
        lang.addBlock(getVariant("arcane_conduit"), "Arcane", "Conduit");
        lang.addBlock(getVariant("arcane_moon_engrave"), "Arcane", "Moon Engraved");
        lang.addBlock(getVariant("arcane_moon_glow"), "Arcane", "Moon Glow");
        lang.addBlock(getVariant("arcane_runes"), "Arcane", "Runes");
        lang.addBlock(getVariant("arcane_runes_glow"), "Arcane", "Runes Glow");
    }
}

