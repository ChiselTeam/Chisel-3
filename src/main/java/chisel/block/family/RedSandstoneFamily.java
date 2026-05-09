package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RedSandstoneFamily extends ChiselFamily {
    public RedSandstoneFamily(BlockBehaviour.Properties props) {
        family = builder("red_sandstone")
                .addVariant(Blocks.STONE)
                .addVariant("red_sandstone_array", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("red_sandstone_braid", props)
                .addVariant("red_sandstone_chaotic_bricks", props, VariantModelType.MULTIBLOCK_3X3)
                .addVariant("red_sandstone_chaotic_medium", props)
                .addVariant("red_sandstone_chaotic_small", props)
                .addVariant("red_sandstone_circular", props, VariantModelType.CONNECTED)
                .addVariant("red_sandstone_cracked", props)
                .addVariant("red_sandstone_cracked_bricks", props)
                .addVariant("red_sandstone_cuts", props, VariantModelType.MULTIBLOCK_4X4)
                .addVariant("red_sandstone_dent", props, VariantModelType.CONNECTED)
                .addVariant("red_sandstone_encased_bricks", props, VariantModelType.CONNECTED)
                .addVariant("red_sandstone_french_1", props)
                .addVariant("red_sandstone_french_2", props)
                .addVariant("red_sandstone_jellybean", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("red_sandstone_layers", props)
                .addVariant("red_sandstone_mosaic", props, VariantModelType.CONNECTED)
                .addVariant("red_sandstone_ornate", props)
                .addVariant("red_sandstone_panel", props)
                .addVariant("red_sandstone_pillar", props, VariantModelType.TBS)
                .addVariant("red_sandstone_prism", props)
                .addVariant("red_sandstone_road", props)
                .addVariant("red_sandstone_slanted", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("red_sandstone_small_bricks", props)
                .addVariant("red_sandstone_soft_bricks", props)
                .addVariant("red_sandstone_solid_bricks", props)
                .addVariant("red_sandstone_tiles_large", props, VariantModelType.CONNECTED)
                .addVariant("red_sandstone_tiles_medium", props)
                .addVariant("red_sandstone_tiles_small", props)
                .addVariant("red_sandstone_triple_bricks", props)
                .addVariant("red_sandstone_twisted", props, VariantModelType.TBS)
                .addVariant("red_sandstone_weaver", props, VariantModelType.CONNECTED)
                .addVariant("red_sandstone_zag", props, VariantModelType.AR)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("red_sandstone_array"), "Red Sandstone", "Red Sandstone Pillar");
        lang.addBlock(getVariant("red_sandstone_braid"), "Red Sandstone", "Braid");
        lang.addBlock(getVariant("red_sandstone_chaotic_bricks"), "Red Sandstone", "Chaotic Bricks");
        lang.addBlock(getVariant("red_sandstone_chaotic_medium"), "Red Sandstone", "Red Sandstone Bricks");
        lang.addBlock(getVariant("red_sandstone_chaotic_small"), "Red Sandstone", "Red Sandstone Small Tiles");
        lang.addBlock(getVariant("red_sandstone_circular"), "Red Sandstone", "Circular");
        lang.addBlock(getVariant("red_sandstone_cracked"), "Red Sandstone", "Cracked");
        lang.addBlock(getVariant("red_sandstone_cracked_bricks"), "Red Sandstone", "Cracked Bricks");
        lang.addBlock(getVariant("red_sandstone_cuts"), "Red Sandstone", "Cuts");
        lang.addBlock(getVariant("red_sandstone_dent"), "Red Sandstone", "Dent");
        lang.addBlock(getVariant("red_sandstone_encased_bricks"), "Red Sandstone", "Encased Bricks");
        lang.addBlock(getVariant("red_sandstone_french_1"), "Red Sandstone", "French 1");
        lang.addBlock(getVariant("red_sandstone_french_2"), "Red Sandstone", "French 2");
        lang.addBlock(getVariant("red_sandstone_jellybean"), "Red Sandstone", "Jellybean");
        lang.addBlock(getVariant("red_sandstone_layers"), "Red Sandstone", "Layers");
        lang.addBlock(getVariant("red_sandstone_mosaic"), "Red Sandstone", "Mosaic");
        lang.addBlock(getVariant("red_sandstone_ornate"), "Red Sandstone", "Ornate Red Sandstone");
        lang.addBlock(getVariant("red_sandstone_panel"), "Red Sandstone", "Panel");
        lang.addBlock(getVariant("red_sandstone_pillar"), "Red Sandstone", "Pillar");
        lang.addBlock(getVariant("red_sandstone_prism"), "Red Sandstone", "Prismatic Red Sandstone");
        lang.addBlock(getVariant("red_sandstone_road"), "Red Sandstone", "Road");
        lang.addBlock(getVariant("red_sandstone_slanted"), "Red Sandstone", "Slanted");
        lang.addBlock(getVariant("red_sandstone_small_bricks"), "Red Sandstone", "Small Bricks");
        lang.addBlock(getVariant("red_sandstone_soft_bricks"), "Red Sandstone", "Soft Bricks");
        lang.addBlock(getVariant("red_sandstone_solid_bricks"), "Red Sandstone", "Solid Bricks");
        lang.addBlock(getVariant("red_sandstone_tiles_large"), "Red Sandstone", "Large Tiles");
        lang.addBlock(getVariant("red_sandstone_tiles_medium"), "Red Sandstone", "Medium Tiles");
        lang.addBlock(getVariant("red_sandstone_tiles_small"), "Red Sandstone", "Small Tiles");
        lang.addBlock(getVariant("red_sandstone_triple_bricks"), "Red Sandstone", "Triple Bricks");
        lang.addBlock(getVariant("red_sandstone_twisted"), "Red Sandstone", "Twisted");
        lang.addBlock(getVariant("red_sandstone_weaver"), "Red Sandstone", "Weaver");
        lang.addBlock(getVariant("red_sandstone_zag"), "Red Sandstone", "Zag");
    }
}
