package chisel.block.family;

import chisel.block.util.ChiselFamily;
import static chisel.registry.ChiselModelHandlers.*;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class AntiblockFamily extends ChiselFamily {
    public AntiblockFamily(BlockBehaviour.Properties props) {
        family = builder("antiblock")
                .addVariant("antiblock_black", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_blue", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_brown", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_cyan", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_gray", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_green", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_light_blue", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_light_gray", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_lime", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_magenta", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_orange", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_pink", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_purple", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_red", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_white", props, MULTI_LAYER_CONNECTED_GLOW)
                .addVariant("antiblock_yellow", props, MULTI_LAYER_CONNECTED_GLOW)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        lang.addBlock(getVariant("antiblock_black"), "Antiblock", "Black Anti Block");
        lang.addBlock(getVariant("antiblock_blue"), "Antiblock", "Blue Anti Block");
        lang.addBlock(getVariant("antiblock_brown"), "Antiblock", "Brown Anti Block");
        lang.addBlock(getVariant("antiblock_cyan"), "Antiblock", "Cyan Anti Block");
        lang.addBlock(getVariant("antiblock_gray"), "Antiblock", "Gray Anti Block");
        lang.addBlock(getVariant("antiblock_green"), "Antiblock", "Green Anti Block");
        lang.addBlock(getVariant("antiblock_light_blue"), "Antiblock", "Light Blue Anti Block");
        lang.addBlock(getVariant("antiblock_light_gray"), "Antiblock", "Light Gray Anti Block");
        lang.addBlock(getVariant("antiblock_lime"), "Antiblock", "Lime Anti Block");
        lang.addBlock(getVariant("antiblock_magenta"), "Antiblock", "Magenta Anti Block");
        lang.addBlock(getVariant("antiblock_orange"), "Antiblock", "Orange Anti Block");
        lang.addBlock(getVariant("antiblock_pink"), "Antiblock", "Pink Anti Block");
        lang.addBlock(getVariant("antiblock_purple"), "Antiblock", "Purple Anti Block");
        lang.addBlock(getVariant("antiblock_red"), "Antiblock", "Red Anti Block");
        lang.addBlock(getVariant("antiblock_white"), "Antiblock", "White Anti Block");
        lang.addBlock(getVariant("antiblock_yellow"), "Antiblock", "Yellow Anti Block");
    }
}

