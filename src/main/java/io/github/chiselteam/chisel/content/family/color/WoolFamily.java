package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.text.WordUtils;

public final class WoolFamily {
    private WoolFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var legacyColorName = WordUtils.capitalize(color.getName().replace("_", " "));
        var woolName = "wool_%s".formatted(color.getName());
        return ChiselFamily.build(woolName, builder -> builder
                .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(getVanillaWool(color))).blockName("%s Wool".formatted(legacyColorName)).model(ChiselModelHandlers.CONNECTED))
                .existingBlock(getVanillaWool(color))
                .variant("%s_legacy".formatted(woolName), v -> v.description("Legacy"))
                .variant("%s_llama".formatted(woolName), v -> v.description("Llama")));
    }

    private static Block getVanillaWool(DyeColor color) {
        return Blocks.WOOL.pick(color);
    }
}
