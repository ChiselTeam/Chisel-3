package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TallowFamily extends ChiselFamily {
    public TallowFamily(BlockBehaviour.Properties props) {
        family = builder("tallow")
                .addVariant(Blocks.WHITE_WOOL)
                .addVariant("tallow_array", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("tallow_braid", props)
                .addVariant("tallow_chaotic_bricks", props, VariantModelType.MULTIBLOCK_3X3)
                .addVariant("tallow_chaotic_medium", props)
                .addVariant("tallow_chaotic_small", props)
                .addVariant("tallow_circular", props, VariantModelType.CONNECTED)
                .addVariant("tallow_cracked", props)
                .addVariant("tallow_cracked_bricks", props)
                .addVariant("tallow_cuts", props, VariantModelType.MULTIBLOCK_4X4)
                .addVariant("tallow_dent", props, VariantModelType.CONNECTED)
                .addVariant("tallow_encased_bricks", props, VariantModelType.CONNECTED)
                .addVariant("tallow_french_1", props)
                .addVariant("tallow_french_2", props)
                .addVariant("tallow_jellybean", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("tallow_layers", props)
                .addVariant("tallow_mosaic", props, VariantModelType.CONNECTED)
                .addVariant("tallow_ornate", props)
                .addVariant("tallow_panel", props)
                .addVariant("tallow_pillar", props, VariantModelType.TBS)
                .addVariant("tallow_prism", props)
                .addVariant("tallow_raw", props)
                .addVariant("tallow_road", props)
                .addVariant("tallow_slanted", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("tallow_small_bricks", props)
                .addVariant("tallow_soft_bricks", props)
                .addVariant("tallow_solid_bricks", props)
                .addVariant("tallow_tiles_large", props, VariantModelType.CONNECTED)
                .addVariant("tallow_tiles_medium", props)
                .addVariant("tallow_tiles_small", props)
                .addVariant("tallow_triple_bricks", props)
                .addVariant("tallow_twisted", props, VariantModelType.TBS)
                .addVariant("tallow_weaver", props, VariantModelType.CONNECTED)
                .addVariant("tallow_zag", props, VariantModelType.AR)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("tallow_array"), "Tallow", "Tallow Pillar");
        lang.addBlock(getVariant("tallow_braid"), "Tallow", "Braid");
        lang.addBlock(getVariant("tallow_chaotic_bricks"), "Tallow", "Chaotic Bricks");
        lang.addBlock(getVariant("tallow_chaotic_medium"), "Tallow", "Tallow Bricks");
        lang.addBlock(getVariant("tallow_chaotic_small"), "Tallow", "Tallow Small Tiles");
        lang.addBlock(getVariant("tallow_circular"), "Tallow", "Circular");
        lang.addBlock(getVariant("tallow_cracked"), "Tallow", "Cracked");
        lang.addBlock(getVariant("tallow_cracked_bricks"), "Tallow", "Cracked Bricks");
        lang.addBlock(getVariant("tallow_cuts"), "Tallow", "Cuts");
        lang.addBlock(getVariant("tallow_dent"), "Tallow", "Dent");
        lang.addBlock(getVariant("tallow_encased_bricks"), "Tallow", "Encased Bricks");
        lang.addBlock(getVariant("tallow_french_1"), "Tallow", "French 1");
        lang.addBlock(getVariant("tallow_french_2"), "Tallow", "French 2");
        lang.addBlock(getVariant("tallow_jellybean"), "Tallow", "Jellybean");
        lang.addBlock(getVariant("tallow_layers"), "Tallow", "Layers");
        lang.addBlock(getVariant("tallow_mosaic"), "Tallow", "Mosaic");
        lang.addBlock(getVariant("tallow_ornate"), "Tallow", "Ornate Tallow");
        lang.addBlock(getVariant("tallow_panel"), "Tallow", "Panel");
        lang.addBlock(getVariant("tallow_pillar"), "Tallow", "Pillar");
        lang.addBlock(getVariant("tallow_prism"), "Tallow", "Prismatic Tallow");
        lang.addBlock(getVariant("tallow_raw"), "Tallow", "Raw");
        lang.addBlock(getVariant("tallow_road"), "Tallow", "Road");
        lang.addBlock(getVariant("tallow_slanted"), "Tallow", "Slanted");
        lang.addBlock(getVariant("tallow_small_bricks"), "Tallow", "Small Bricks");
        lang.addBlock(getVariant("tallow_soft_bricks"), "Tallow", "Soft Bricks");
        lang.addBlock(getVariant("tallow_solid_bricks"), "Tallow", "Solid Bricks");
        lang.addBlock(getVariant("tallow_tiles_large"), "Tallow", "Large Tiles");
        lang.addBlock(getVariant("tallow_tiles_medium"), "Tallow", "Medium Tiles");
        lang.addBlock(getVariant("tallow_tiles_small"), "Tallow", "Small Tiles");
        lang.addBlock(getVariant("tallow_triple_bricks"), "Tallow", "Triple Bricks");
        lang.addBlock(getVariant("tallow_twisted"), "Tallow", "Twisted");
        lang.addBlock(getVariant("tallow_weaver"), "Tallow", "Weaver");
        lang.addBlock(getVariant("tallow_zag"), "Tallow", "Zag");
    }
}
