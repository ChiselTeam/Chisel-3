package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ThaumiumFamily extends ChiselFamily {
    public ThaumiumFamily(BlockBehaviour.Properties props) {
        family = builder("thaumium")
                .addVariant("thaumium_bevel", props)
                .addVariant("thaumium_block", props)
                .addVariant("thaumium_bricks", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_chunks", props)
                .addVariant("thaumium_lattice", props)
                .addVariant("thaumium_ornate", props)
                .addVariant("thaumium_planks", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_runes_purple", props, VariantModelType.V9)
                .addVariant("thaumium_runes", props, VariantModelType.V9)
                .addVariant("thaumium_small", props)
                .addVariant("thaumium_totem", props, VariantModelType.R4)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("thaumium_bevel"), "Thaumium", "Bevel");
        lang.addBlock(getVariant("thaumium_block"), "Thaumium", "Block");
        lang.addBlock(getVariant("thaumium_bricks"), "Thaumium", "Bricks");
        lang.addBlock(getVariant("thaumium_chunks"), "Thaumium", "Chunks");
        lang.addBlock(getVariant("thaumium_lattice"), "Thaumium", "Lattice");
        lang.addBlock(getVariant("thaumium_ornate"), "Thaumium", "Ornate");
        lang.addBlock(getVariant("thaumium_planks"), "Thaumium", "Planks");
        lang.addBlock(getVariant("thaumium_runes_purple"), "Thaumium", "Purple Runes");
        lang.addBlock(getVariant("thaumium_runes"), "Thaumium", "Runes");
        lang.addBlock(getVariant("thaumium_small"), "Thaumium", "Small");
        lang.addBlock(getVariant("thaumium_totem"), "Thaumium", "Totem");
    }
}
