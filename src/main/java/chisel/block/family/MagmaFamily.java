package chisel.block.family;

import chisel.block.util.ChiselFamily;
import chisel.core.variant.VariantModelType;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MagmaFamily extends ChiselFamily {
    public MagmaFamily(BlockBehaviour.Properties props) {
        family = builder("magma")
                .addVariant("magma_array", props, VariantModelType.LAVA_2x2)
                .addVariant("magma_braid", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_chaotic_bricks", props, VariantModelType.LAVA_3x3)
                .addVariant("magma_chaotic_medium", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_chaotic_small", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_circular", props, VariantModelType.MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("magma_cracked", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_cracked_bricks", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_cuts", props, VariantModelType.LAVA_4x4)
                .addVariant("magma_dent", props, VariantModelType.MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("magma_encased_bricks", props, VariantModelType.MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("magma_french_1", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_french_2", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_jellybean", props, VariantModelType.LAVA_2x2)
                .addVariant("magma_layers", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_mosaic", props, VariantModelType.MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("magma_ornate", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_panel", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_pillar", props, VariantModelType.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                .addVariant("magma_prism", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_raw", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_road", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_slanted", props, VariantModelType.LAVA_2x2)
                .addVariant("magma_small_bricks", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_soft_bricks", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_solid_bricks", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_tiles_large", props, VariantModelType.MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("magma_tiles_medium", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_tiles_small", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_triple_bricks", props, VariantModelType.MULTI_LAYER_LAVA)
                .addVariant("magma_twisted", props, VariantModelType.MULTI_LAYER_LAVA_TOP_BOTTOM_SIDE)
                .addVariant("magma_weaver", props, VariantModelType.MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("magma_zag", props, VariantModelType.MULTI_LAYER_LAVA_AR)
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
