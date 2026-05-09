package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CoalFamily extends ChiselFamily {
    public CoalFamily(BlockBehaviour.Properties props) {
        family = builder("coal")
                .addVariant(Blocks.STONE)
                .addVariant("coal_array", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("coal_braid", props)
                .addVariant("coal_chaotic_bricks", props, VariantModelType.MULTIBLOCK_3X3)
                .addVariant("coal_chaotic_medium", props)
                .addVariant("coal_chaotic_small", props)
                .addVariant("coal_circular", props, VariantModelType.CONNECTED)
                .addVariant("coal_cracked", props)
                .addVariant("coal_cracked_bricks", props)
                .addVariant("coal_cuts", props, VariantModelType.MULTIBLOCK_4X4)
                .addVariant("coal_dent", props, VariantModelType.CONNECTED)
                .addVariant("coal_encased_bricks", props, VariantModelType.CONNECTED)
                .addVariant("coal_french_1", props)
                .addVariant("coal_french_2", props)
                .addVariant("coal_jellybean", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("coal_layers", props)
                .addVariant("coal_mosaic", props, VariantModelType.CONNECTED)
                .addVariant("coal_ornate", props)
                .addVariant("coal_panel", props)
                .addVariant("coal_pillar", props, VariantModelType.TBS)
                .addVariant("coal_prism", props)
                .addVariant("coal_raw", props)
                .addVariant("coal_road", props)
                .addVariant("coal_slanted", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("coal_small_bricks", props)
                .addVariant("coal_soft_bricks", props)
                .addVariant("coal_solid_bricks", props)
                .addVariant("coal_tiles_large", props, VariantModelType.CONNECTED)
                .addVariant("coal_tiles_medium", props)
                .addVariant("coal_tiles_small", props)
                .addVariant("coal_triple_bricks", props)
                .addVariant("coal_twisted", props, VariantModelType.TBS)
                .addVariant("coal_weaver", props, VariantModelType.CONNECTED)
                .addVariant("coal_zag", props, VariantModelType.AR)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("coal_array"), "Coal", "Coal Pillar");
        lang.addBlock(getVariant("coal_braid"), "Coal", "Braid");
        lang.addBlock(getVariant("coal_chaotic_bricks"), "Coal", "Chaotic Bricks");
        lang.addBlock(getVariant("coal_chaotic_medium"), "Coal", "Coal Bricks");
        lang.addBlock(getVariant("coal_chaotic_small"), "Coal", "Coal Small Tiles");
        lang.addBlock(getVariant("coal_circular"), "Coal", "Circular");
        lang.addBlock(getVariant("coal_cracked"), "Coal", "Cracked");
        lang.addBlock(getVariant("coal_cracked_bricks"), "Coal", "Cracked Bricks");
        lang.addBlock(getVariant("coal_cuts"), "Coal", "Cuts");
        lang.addBlock(getVariant("coal_dent"), "Coal", "Dent");
        lang.addBlock(getVariant("coal_encased_bricks"), "Coal", "Encased Bricks");
        lang.addBlock(getVariant("coal_french_1"), "Coal", "French 1");
        lang.addBlock(getVariant("coal_french_2"), "Coal", "French 2");
        lang.addBlock(getVariant("coal_jellybean"), "Coal", "Jellybean");
        lang.addBlock(getVariant("coal_layers"), "Coal", "Layers");
        lang.addBlock(getVariant("coal_mosaic"), "Coal", "Mosaic");
        lang.addBlock(getVariant("coal_ornate"), "Coal", "Ornate Coal");
        lang.addBlock(getVariant("coal_panel"), "Coal", "Panel");
        lang.addBlock(getVariant("coal_pillar"), "Coal", "Pillar");
        lang.addBlock(getVariant("coal_prism"), "Coal", "Prismatic Coal");
        lang.addBlock(getVariant("coal_raw"), "Coal", "Raw");
        lang.addBlock(getVariant("coal_road"), "Coal", "Road");
        lang.addBlock(getVariant("coal_slanted"), "Coal", "Slanted");
        lang.addBlock(getVariant("coal_small_bricks"), "Coal", "Small Bricks");
        lang.addBlock(getVariant("coal_soft_bricks"), "Coal", "Soft Bricks");
        lang.addBlock(getVariant("coal_solid_bricks"), "Coal", "Solid Bricks");
        lang.addBlock(getVariant("coal_tiles_large"), "Coal", "Large Tiles");
        lang.addBlock(getVariant("coal_tiles_medium"), "Coal", "Medium Tiles");
        lang.addBlock(getVariant("coal_tiles_small"), "Coal", "Small Tiles");
        lang.addBlock(getVariant("coal_triple_bricks"), "Coal", "Triple Bricks");
        lang.addBlock(getVariant("coal_twisted"), "Coal", "Twisted");
        lang.addBlock(getVariant("coal_weaver"), "Coal", "Weaver");
        lang.addBlock(getVariant("coal_zag"), "Coal", "Zag");
    }
}
