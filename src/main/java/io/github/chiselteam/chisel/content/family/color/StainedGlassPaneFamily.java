package io.github.chiselteam.chisel.content.family.color;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselStainedGlassPaneBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.StringUtils;

public final class StainedGlassPaneFamily {
    private StainedGlassPaneFamily() {
    }

    public static ChiselFamily create(DyeColor color) {
        var colorName = StringUtils.capitalize(color.getName().replace("_", " "));
        return ChiselFamily.build("stained_glass_pane_%s".formatted(color), builder -> builder
                .defaults(variant -> variant
                        .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE))
                        .blockName("%s Stained Glass Pane".formatted(colorName))
                        .model(ChiselModelHandlers.GLASS_PANE))
                .existingBlock(getVanillaStainedGlassPane(color))
                .variant("stained_glass_pane_%s_borderless".formatted(color), variant -> variant
                        .description("%s Borderless Glass Pane".formatted(colorName))
                        .blockFactory(p -> new ChiselStainedGlassPaneBlock(color, p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("stained_glass_pane_%s_borderless".formatted(color))))))
                        .texture(Chisel.prefix("block/stained_glass_%s/stained_glass_%s_borderless".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/stained_glass_pane_%s/stained_glass_pane_%s_borderless-top".formatted(color.getName(), color.getName()))))
                .variant("stained_glass_pane_%s_bubble".formatted(color), variant -> variant
                        .description("%s Bubble Glass Pane".formatted(colorName))
                        .blockFactory(p -> new ChiselStainedGlassPaneBlock(color, p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("stained_glass_pane_%s_bubble".formatted(color))))))
                        .texture(Chisel.prefix("block/stained_glass_%s/stained_glass_%s_bubble".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/stained_glass_pane_%s/stained_glass_pane_%s_quad-top".formatted(color.getName(), color.getName()))))
                .variant("stained_glass_pane_%s_panel".formatted(color), variant -> variant
                        .description("%s Glass Panel Pane".formatted(colorName))
                        .blockFactory(p -> new ChiselStainedGlassPaneBlock(color, p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("stained_glass_pane_%s_panel".formatted(color))))))
                        .texture(Chisel.prefix("block/stained_glass_%s/stained_glass_%s_panel".formatted(color.getName(), color.getName())))
                        .texture("top", Chisel.prefix("block/stained_glass_pane_%s/stained_glass_pane_%s_quad-top".formatted(color.getName(), color.getName()))))
                .variant("stained_glass_pane_%s_quad".formatted(color), variant -> variant
                        .description("%s Glass Quad Pane".formatted(colorName))
                        .blockFactory(p -> new ChiselStainedGlassPaneBlock(color, p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("stained_glass_pane_%s_quad".formatted(color)))))))
                .variant("stained_glass_pane_%s_fancy".formatted(color), variant -> variant
                        .description("%s Fancy Glass Panel Pane".formatted(colorName))
                        .blockFactory(p -> new ChiselStainedGlassPaneBlock(color, p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("stained_glass_pane_%s_fancy".formatted(color))))))
                        .texture("top", Chisel.prefix("block/stained_glass_pane_%s/stained_glass_pane_%s_quad-top".formatted(color.getName(), color.getName())))));
    }

    private static Block getVanillaStainedGlassPane(DyeColor color) {
        return switch (color) {
            case WHITE -> Blocks.WHITE_STAINED_GLASS_PANE;
            case ORANGE -> Blocks.ORANGE_STAINED_GLASS_PANE;
            case MAGENTA -> Blocks.MAGENTA_STAINED_GLASS_PANE;
            case LIGHT_BLUE -> Blocks.LIGHT_BLUE_STAINED_GLASS_PANE;
            case YELLOW -> Blocks.YELLOW_STAINED_GLASS_PANE;
            case LIME -> Blocks.LIME_STAINED_GLASS_PANE;
            case PINK -> Blocks.PINK_STAINED_GLASS_PANE;
            case GRAY -> Blocks.GRAY_STAINED_GLASS_PANE;
            case LIGHT_GRAY -> Blocks.LIGHT_GRAY_STAINED_GLASS_PANE;
            case CYAN -> Blocks.CYAN_STAINED_GLASS_PANE;
            case PURPLE -> Blocks.PURPLE_STAINED_GLASS_PANE;
            case BLUE -> Blocks.BLUE_STAINED_GLASS_PANE;
            case BROWN -> Blocks.BROWN_STAINED_GLASS_PANE;
            case GREEN -> Blocks.GREEN_STAINED_GLASS_PANE;
            case RED -> Blocks.RED_STAINED_GLASS_PANE;
            case BLACK -> Blocks.BLACK_STAINED_GLASS_PANE;
        };
    }
}
