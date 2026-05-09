package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class DiabaseFamily extends ChiselFamily {
    public DiabaseFamily(BlockBehaviour.Properties props) {
        family = builder("diabase")
                .addVariant(Blocks.STONE)
                .addVariant("diabase_array", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("diabase_braid", props)
                .addVariant("diabase_chaotic_bricks", props, VariantModelType.MULTIBLOCK_3X3)
                .addVariant("diabase_chaotic_medium", props)
                .addVariant("diabase_chaotic_small", props)
                .addVariant("diabase_circular", props, VariantModelType.CONNECTED)
                .addVariant("diabase_cracked", props)
                .addVariant("diabase_cracked_bricks", props)
                .addVariant("diabase_cuts", props, VariantModelType.MULTIBLOCK_4X4)
                .addVariant("diabase_dent", props, VariantModelType.CONNECTED)
                .addVariant("diabase_encased_bricks", props, VariantModelType.CONNECTED)
                .addVariant("diabase_french_1", props)
                .addVariant("diabase_french_2", props)
                .addVariant("diabase_jellybean", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("diabase_layers", props)
                .addVariant("diabase_mosaic", props, VariantModelType.CONNECTED)
                .addVariant("diabase_ornate", props)
                .addVariant("diabase_panel", props)
                .addVariant("diabase_pillar", props, VariantModelType.TBS)
                .addVariant("diabase_prism", props)
                .addVariant("diabase_raw", props)
                .addVariant("diabase_road", props)
                .addVariant("diabase_slanted", props, VariantModelType.MULTIBLOCK_2X2)
                .addVariant("diabase_small_bricks", props)
                .addVariant("diabase_soft_bricks", props)
                .addVariant("diabase_solid_bricks", props)
                .addVariant("diabase_tiles_large", props, VariantModelType.CONNECTED)
                .addVariant("diabase_tiles_medium", props)
                .addVariant("diabase_tiles_small", props)
                .addVariant("diabase_triple_bricks", props)
                .addVariant("diabase_twisted", props, VariantModelType.TBS)
                .addVariant("diabase_weaver", props, VariantModelType.CONNECTED)
                .addVariant("diabase_zag", props, VariantModelType.AR)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("diabase_array"), "Diabase", "Diabase Pillar");
        lang.addBlock(getVariant("diabase_braid"), "Diabase", "Braid");
        lang.addBlock(getVariant("diabase_chaotic_bricks"), "Diabase", "Chaotic Bricks");
        lang.addBlock(getVariant("diabase_chaotic_medium"), "Diabase", "Diabase Bricks");
        lang.addBlock(getVariant("diabase_chaotic_small"), "Diabase", "Diabase Small Tiles");
        lang.addBlock(getVariant("diabase_circular"), "Diabase", "Circular");
        lang.addBlock(getVariant("diabase_cracked"), "Diabase", "Cracked");
        lang.addBlock(getVariant("diabase_cracked_bricks"), "Diabase", "Cracked Bricks");
        lang.addBlock(getVariant("diabase_cuts"), "Diabase", "Cuts");
        lang.addBlock(getVariant("diabase_dent"), "Diabase", "Dent");
        lang.addBlock(getVariant("diabase_encased_bricks"), "Diabase", "Encased Bricks");
        lang.addBlock(getVariant("diabase_french_1"), "Diabase", "French 1");
        lang.addBlock(getVariant("diabase_french_2"), "Diabase", "French 2");
        lang.addBlock(getVariant("diabase_jellybean"), "Diabase", "Jellybean");
        lang.addBlock(getVariant("diabase_layers"), "Diabase", "Layers");
        lang.addBlock(getVariant("diabase_mosaic"), "Diabase", "Mosaic");
        lang.addBlock(getVariant("diabase_ornate"), "Diabase", "Ornate Diabase");
        lang.addBlock(getVariant("diabase_panel"), "Diabase", "Panel");
        lang.addBlock(getVariant("diabase_pillar"), "Diabase", "Pillar");
        lang.addBlock(getVariant("diabase_prism"), "Diabase", "Prismatic Diabase");
        lang.addBlock(getVariant("diabase_raw"), "Diabase", "Raw");
        lang.addBlock(getVariant("diabase_road"), "Diabase", "Road");
        lang.addBlock(getVariant("diabase_slanted"), "Diabase", "Slanted");
        lang.addBlock(getVariant("diabase_small_bricks"), "Diabase", "Small Bricks");
        lang.addBlock(getVariant("diabase_soft_bricks"), "Diabase", "Soft Bricks");
        lang.addBlock(getVariant("diabase_solid_bricks"), "Diabase", "Solid Bricks");
        lang.addBlock(getVariant("diabase_tiles_large"), "Diabase", "Large Tiles");
        lang.addBlock(getVariant("diabase_tiles_medium"), "Diabase", "Medium Tiles");
        lang.addBlock(getVariant("diabase_tiles_small"), "Diabase", "Small Tiles");
        lang.addBlock(getVariant("diabase_triple_bricks"), "Diabase", "Triple Bricks");
        lang.addBlock(getVariant("diabase_twisted"), "Diabase", "Twisted");
        lang.addBlock(getVariant("diabase_weaver"), "Diabase", "Weaver");
        lang.addBlock(getVariant("diabase_zag"), "Diabase", "Zag");
    }
}
