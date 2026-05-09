package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ThaumiumFamily extends ChiselFamily {
    public ThaumiumFamily(BlockBehaviour.Properties props) {
        family = builder("thaumium")
                .addVariant(Blocks.IRON_BLOCK)
                .addVariant("thaumium_array", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("thaumium_braid", props)
                .addVariant("thaumium_chaotic_bricks", props, VariantModelType.MULTIBLOCK_3X3)
                .addVariant("thaumium_chaotic_medium", props)
                .addVariant("thaumium_chaotic_small", props)
                .addVariant("thaumium_circular", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_cracked", props)
                .addVariant("thaumium_cracked_bricks", props)
                .addVariant("thaumium_cuts", props, VariantModelType.MULTIBLOCK_4X4)
                .addVariant("thaumium_dent", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_encased_bricks", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_french_1", props)
                .addVariant("thaumium_french_2", props)
                .addVariant("thaumium_jellybean", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("thaumium_layers", props)
                .addVariant("thaumium_mosaic", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_ornate", props)
                .addVariant("thaumium_panel", props)
                .addVariant("thaumium_pillar", props, VariantModelType.TBS)
                .addVariant("thaumium_prism", props)
                .addVariant("thaumium_raw", props)
                .addVariant("thaumium_road", props)
                .addVariant("thaumium_slanted", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("thaumium_small_bricks", props)
                .addVariant("thaumium_soft_bricks", props)
                .addVariant("thaumium_solid_bricks", props)
                .addVariant("thaumium_tiles_large", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_tiles_medium", props)
                .addVariant("thaumium_tiles_small", props)
                .addVariant("thaumium_triple_bricks", props)
                .addVariant("thaumium_twisted", props, VariantModelType.TBS)
                .addVariant("thaumium_weaver", props, VariantModelType.CONNECTED)
                .addVariant("thaumium_zag", props, VariantModelType.AR)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("thaumium_array"), "Thaumium", "Thaumium Pillar");
        lang.addBlock(getVariant("thaumium_braid"), "Thaumium", "Braid");
        lang.addBlock(getVariant("thaumium_chaotic_bricks"), "Thaumium", "Chaotic Bricks");
        lang.addBlock(getVariant("thaumium_chaotic_medium"), "Thaumium", "Thaumium Bricks");
        lang.addBlock(getVariant("thaumium_chaotic_small"), "Thaumium", "Thaumium Small Tiles");
        lang.addBlock(getVariant("thaumium_circular"), "Thaumium", "Circular");
        lang.addBlock(getVariant("thaumium_cracked"), "Thaumium", "Cracked");
        lang.addBlock(getVariant("thaumium_cracked_bricks"), "Thaumium", "Cracked Bricks");
        lang.addBlock(getVariant("thaumium_cuts"), "Thaumium", "Cuts");
        lang.addBlock(getVariant("thaumium_dent"), "Thaumium", "Dent");
        lang.addBlock(getVariant("thaumium_encased_bricks"), "Thaumium", "Encased Bricks");
        lang.addBlock(getVariant("thaumium_french_1"), "Thaumium", "French 1");
        lang.addBlock(getVariant("thaumium_french_2"), "Thaumium", "French 2");
        lang.addBlock(getVariant("thaumium_jellybean"), "Thaumium", "Jellybean");
        lang.addBlock(getVariant("thaumium_layers"), "Thaumium", "Layers");
        lang.addBlock(getVariant("thaumium_mosaic"), "Thaumium", "Mosaic");
        lang.addBlock(getVariant("thaumium_ornate"), "Thaumium", "Ornate Thaumium");
        lang.addBlock(getVariant("thaumium_panel"), "Thaumium", "Panel");
        lang.addBlock(getVariant("thaumium_pillar"), "Thaumium", "Pillar");
        lang.addBlock(getVariant("thaumium_prism"), "Thaumium", "Prismatic Thaumium");
        lang.addBlock(getVariant("thaumium_raw"), "Thaumium", "Raw");
        lang.addBlock(getVariant("thaumium_road"), "Thaumium", "Road");
        lang.addBlock(getVariant("thaumium_slanted"), "Thaumium", "Slanted");
        lang.addBlock(getVariant("thaumium_small_bricks"), "Thaumium", "Small Bricks");
        lang.addBlock(getVariant("thaumium_soft_bricks"), "Thaumium", "Soft Bricks");
        lang.addBlock(getVariant("thaumium_solid_bricks"), "Thaumium", "Solid Bricks");
        lang.addBlock(getVariant("thaumium_tiles_large"), "Thaumium", "Large Tiles");
        lang.addBlock(getVariant("thaumium_tiles_medium"), "Thaumium", "Medium Tiles");
        lang.addBlock(getVariant("thaumium_tiles_small"), "Thaumium", "Small Tiles");
        lang.addBlock(getVariant("thaumium_triple_bricks"), "Thaumium", "Triple Bricks");
        lang.addBlock(getVariant("thaumium_twisted"), "Thaumium", "Twisted");
        lang.addBlock(getVariant("thaumium_weaver"), "Thaumium", "Weaver");
        lang.addBlock(getVariant("thaumium_zag"), "Thaumium", "Zag");
    }
}
