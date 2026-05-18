package chisel.block.family;

import chisel.block.util.ChiselFamily;
import static chisel.registry.ChiselModelHandlers.*;
import chisel.util.LangHelper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.StringUtils;

public class WoolFamily extends ChiselFamily {
    public WoolFamily(BlockBehaviour.Properties props, String color, Block vanilla) {
        String name = color.toLowerCase();
        family = builder("wool_%s".formatted(name))
                .addVariant(vanilla)
                .addVariant("wool_%s_legacy".formatted(name), props, CONNECTED)
                .addVariant("wool_%s_llama".formatted(name), props, CONNECTED)
                .family();
    }

    @Override
    public void addTranslations(LangHelper lang) {
        String familyName = family.getFamilyName();
        String color = StringUtils.capitalize(familyName.substring(5)); // Remove "wool_"
        String baseName = "%s Wool".formatted(color);
        String variantPrefix = "%s_".formatted(familyName);

        lang.addBlock(getVariant("%slegacy".formatted(variantPrefix)), baseName, "Legacy");
        lang.addBlock(getVariant("%sllama".formatted(variantPrefix)), baseName, "Llama");
    }
}
