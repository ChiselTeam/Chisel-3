package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.api.model.VariantModelHandler;
import io.github.chiselteam.chisel.content.ChiselFamily;
import io.github.chiselteam.chisel.content.definition.VariantFamilyDefinitionBuilder;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.List;
import java.util.Locale;

public final class AntiblockFamily {
    public static final ChiselFamily FAMILY = buildAntiblock();

    private AntiblockFamily() {
    }

    private static ChiselFamily buildAntiblock() {
        var colors = List.of("Black", "Blue", "Brown", "Cyan", "Gray", "Green", "Light Blue", "Light Gray", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White", "Yellow");
        return ChiselFamily.build("antiblock", builder -> {
            builder.defaults(variant -> variant.blockName("Antiblock")
                    .properties(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0F, 5.0F)
                            .requiresCorrectToolForDrops().lightLevel((_) -> 15)));
            addAntiblockVariants(builder, colors, "", "%s Anti Block", ChiselModelHandlers.ANTIBLOCK);
            addAntiblockVariants(builder, colors, "_borderless", "%s Borderless Anti Block", ChiselModelHandlers.SHADELESS);
            addAntiblockVariants(builder, colors, "_dull", "%s Dull Anti Block", ChiselModelHandlers.MULTI_LAYER_CONNECTED_GLOW);
            addAntiblockVariants(builder, colors, "_dull_borderless", "%s Dull Borderless Anti Block", ChiselModelHandlers.CUBE_ALL);
        });
    }

    private static void addAntiblockVariants(VariantFamilyDefinitionBuilder builder, List<String> colors, String suffix, String description, VariantModelHandler modelHandler) {
        builder.defaults(variant -> variant.model(modelHandler));
        for (var colorName : colors) {
            var color = colorName.toLowerCase(Locale.ROOT).replace(' ', '_');
            var variantName = "antiblock_" + color + suffix;
            builder.variant(variantName, variant -> {
                variant.description(description.formatted(colorName));
                if (suffix.endsWith("_borderless")) {
                    variant.texture(Chisel.prefix("block/antiblock/antiblock_" + color));
                } else {
                    addAntiblockOverlayTextures(variant, color);
                }
            });
        }
    }

    private static void addAntiblockOverlayTextures(VariantFamilyDefinitionBuilder.VariantBuilder variant, String color) {
        var overlay = "block/antiblock/antiblock_overlay" + (color.equals("black") ? "_white" : "");
        variant.texture(Chisel.prefix(overlay))
                .texture("bg", Chisel.prefix("block/antiblock/antiblock_" + color))
                .texture("ctm_cornerless", Chisel.prefix("block/antiblock/antiblock_overlay-ctm_cornerless"));
        for (var suffix : List.of("ctm_corner", "ctm_horizontal", "ctm_vertical")) {
            variant.texture(suffix, Chisel.prefix(overlay + "-" + suffix));
        }
    }
}
