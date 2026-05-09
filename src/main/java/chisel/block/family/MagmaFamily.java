package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MagmaFamily extends ChiselFamily {
    public MagmaFamily(BlockBehaviour.Properties props) {
        family = builder("magma")
                .addVariant(Blocks.STONE)
                .addVariant("magma_array", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("magma_braid", props)
                .addVariant("magma_chaotic_bricks", props, VariantModelType.MULTIBLOCK_3X3)
                .addVariant("magma_chaotic_medium", props)
                .addVariant("magma_chaotic_small", props)
                .addVariant("magma_circular", props, VariantModelType.CONNECTED)
                .addVariant("magma_cracked", props)
                .addVariant("magma_cracked_bricks", props)
                .addVariant("magma_cuts", props, VariantModelType.MULTIBLOCK_4X4)
                .addVariant("magma_dent", props, VariantModelType.CONNECTED)
                .addVariant("magma_encased_bricks", props, VariantModelType.CONNECTED)
                .addVariant("magma_french_1", props)
                .addVariant("magma_french_2", props)
                .addVariant("magma_jellybean", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("magma_layers", props)
                .addVariant("magma_mosaic", props, VariantModelType.CONNECTED)
                .addVariant("magma_ornate", props)
                .addVariant("magma_panel", props)
                .addVariant("magma_pillar", props, VariantModelType.TBS)
                .addVariant("magma_prism", props)
                .addVariant("magma_raw", props)
                .addVariant("magma_road", props)
                .addVariant("magma_slanted", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("magma_small_bricks", props)
                .addVariant("magma_soft_bricks", props)
                .addVariant("magma_solid_bricks", props)
                .addVariant("magma_tiles_large", props, VariantModelType.CONNECTED)
                .addVariant("magma_tiles_medium", props)
                .addVariant("magma_tiles_small", props)
                .addVariant("magma_triple_bricks", props)
                .addVariant("magma_twisted", props, VariantModelType.TBS)
                .addVariant("magma_weaver", props, VariantModelType.CONNECTED)
                .addVariant("magma_zag", props, VariantModelType.AR)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("magma_array"), "Magma", "Magma Pillar");
        lang.addBlock(getVariant("magma_braid"), "Magma", "Braid");
        lang.addBlock(getVariant("magma_chaotic_bricks"), "Magma", "Chaotic Bricks");
        lang.addBlock(getVariant("magma_chaotic_medium"), "Magma", "Magma Bricks");
        lang.addBlock(getVariant("magma_chaotic_small"), "Magma", "Magma Small Tiles");
        lang.addBlock(getVariant("magma_circular"), "Magma", "Circular");
        lang.addBlock(getVariant("magma_cracked"), "Magma", "Cracked");
        lang.addBlock(getVariant("magma_cracked_bricks"), "Magma", "Cracked Bricks");
        lang.addBlock(getVariant("magma_cuts"), "Magma", "Cuts");
        lang.addBlock(getVariant("magma_dent"), "Magma", "Dent");
        lang.addBlock(getVariant("magma_encased_bricks"), "Magma", "Encased Bricks");
        lang.addBlock(getVariant("magma_french_1"), "Magma", "French 1");
        lang.addBlock(getVariant("magma_french_2"), "Magma", "French 2");
        lang.addBlock(getVariant("magma_jellybean"), "Magma", "Jellybean");
        lang.addBlock(getVariant("magma_layers"), "Magma", "Layers");
        lang.addBlock(getVariant("magma_mosaic"), "Magma", "Mosaic");
        lang.addBlock(getVariant("magma_ornate"), "Magma", "Ornate Magma");
        lang.addBlock(getVariant("magma_panel"), "Magma", "Panel");
        lang.addBlock(getVariant("magma_pillar"), "Magma", "Pillar");
        lang.addBlock(getVariant("magma_prism"), "Magma", "Prismatic Magma");
        lang.addBlock(getVariant("magma_raw"), "Magma", "Raw");
        lang.addBlock(getVariant("magma_road"), "Magma", "Road");
        lang.addBlock(getVariant("magma_slanted"), "Magma", "Slanted");
        lang.addBlock(getVariant("magma_small_bricks"), "Magma", "Small Bricks");
        lang.addBlock(getVariant("magma_soft_bricks"), "Magma", "Soft Bricks");
        lang.addBlock(getVariant("magma_solid_bricks"), "Magma", "Solid Bricks");
        lang.addBlock(getVariant("magma_tiles_large"), "Magma", "Large Tiles");
        lang.addBlock(getVariant("magma_tiles_medium"), "Magma", "Medium Tiles");
        lang.addBlock(getVariant("magma_tiles_small"), "Magma", "Small Tiles");
        lang.addBlock(getVariant("magma_triple_bricks"), "Magma", "Triple Bricks");
        lang.addBlock(getVariant("magma_twisted"), "Magma", "Twisted");
        lang.addBlock(getVariant("magma_weaver"), "Magma", "Weaver");
        lang.addBlock(getVariant("magma_zag"), "Magma", "Zag");
    }
}
