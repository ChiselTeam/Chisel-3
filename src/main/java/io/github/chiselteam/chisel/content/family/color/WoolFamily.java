package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.StringUtils;

public final class WoolFamily {
    private WoolFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var legacyColorName = StringUtils.capitalize(color.getName());
        var woolName = "wool_%s".formatted(color.getName());
        return ChiselFamily.build(woolName, builder -> builder
                .defaults(variant -> variant
                        .properties(BlockBehaviour.Properties.ofFullCopy(getVanillaWool(color)))
                        .blockName("%s Wool".formatted(legacyColorName))
                        .model(ChiselModelHandlers.CONNECTED))
                .existingBlock(getVanillaWool(color))
                .variant("%s_legacy".formatted(woolName), variant -> variant
                        .description("Legacy"))
                .variant("%s_llama".formatted(woolName), variant -> variant
                        .description("Llama")));
    }

    private static Block getVanillaWool(DyeColor color) {
        return switch (color) {
            case WHITE -> Blocks.WHITE_WOOL;
            case ORANGE -> Blocks.ORANGE_WOOL;
            case MAGENTA -> Blocks.MAGENTA_WOOL;
            case LIGHT_BLUE -> Blocks.LIGHT_BLUE_WOOL;
            case YELLOW -> Blocks.YELLOW_WOOL;
            case LIME -> Blocks.LIME_WOOL;
            case PINK -> Blocks.PINK_WOOL;
            case GRAY -> Blocks.GRAY_WOOL;
            case LIGHT_GRAY -> Blocks.LIGHT_GRAY_WOOL;
            case CYAN -> Blocks.CYAN_WOOL;
            case PURPLE -> Blocks.PURPLE_WOOL;
            case BLUE -> Blocks.BLUE_WOOL;
            case BROWN -> Blocks.BROWN_WOOL;
            case GREEN -> Blocks.GREEN_WOOL;
            case RED -> Blocks.RED_WOOL;
            case BLACK -> Blocks.BLACK_WOOL;
        };
    }
}
