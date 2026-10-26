package io.github.chiselteam.chisel.datagen.guide;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.section.palette.PaletteRole;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;

public final class GettingStartedGuides {
    private GettingStartedGuides() {
    }

    public static void generate(BiConsumer<ResourceLocation, HandbookGuide> output) {
        output.accept(Chisel.prefix("planning_your_build"), planning());
        output.accept(Chisel.prefix("understanding_block_palettes"), palettes());
        output.accept(Chisel.prefix("adding_shape_and_depth"), depth());
        output.accept(Chisel.prefix("using_texture_intentionally"), texture());
        output.accept(Chisel.prefix("details_and_lighting"), details());
        output.accept(Chisel.prefix("your_first_build"), firstBuild());
    }

    private static HandbookGuideBuilder lesson(String id, String icon, int order) {
        return HandbookGuideBuilder.builder(t(id, "title"), ResourceLocation.withDefaultNamespace(icon))
                .description(t(id, "description"))
                .category(Chisel.prefix("getting_started"))
                .sortOrder(order)
                .text(t(id, "goal"));
    }

    private static Component t(String id, String section) {
        return Component.translatable("chisel.guide." + id + "." + section);
    }

    private static HandbookGuideBuilder finish(HandbookGuideBuilder guide, String id) {
        return guide.text(t(id, "practice"))
                .tip(t(id, "check"))
                .text(t(id, "transfer"));
    }

    private static HandbookGuide planning() {
        var id = "planning_your_build";
        var guide = lesson(id, "crafting_table", 0)
                .text(t(id, "purpose"))
                .text(t(id, "footprint"))
                .image(Chisel.prefix("textures/gui/handbook/workshop_footprint.png"), 342, 240)
                .text(t(id, "compare"))
                .structure(GettingStartedExamples::shellComparison)
                .text(t(id, "silhouette"))
                .structure(wall -> GettingStartedExamples.workshop(wall, false, true))
                .text(t(id, "all_sides"));
        return finish(guide, id).build();
    }

    private static HandbookGuide palettes() {
        var id = "understanding_block_palettes";
        var guide = lesson(id, "stone_bricks", 10)
                .category(Chisel.prefix("palettes"))
                .text(t(id, "roles"))
                .tip(t(id, "roles_tip"))
                .text(t(id, "compare"))
                .structure(GettingStartedExamples::paletteComparison)
                .text(t(id, "hue"))
                .text(t(id, "contrast"))
                .text(t(id, "density"))
                .palette(t(id, "weathered_stone"), palette -> palette
                        .entry(ResourceLocation.withDefaultNamespace("stone_bricks"), PaletteRole.PRIMARY, 55)
                        .entry(ResourceLocation.withDefaultNamespace("cobblestone"), PaletteRole.SECONDARY, 20)
                        .entry(ResourceLocation.withDefaultNamespace("andesite"), PaletteRole.SECONDARY, 12)
                        .entry(ResourceLocation.withDefaultNamespace("cracked_stone_bricks"), PaletteRole.ACCENT, 8)
                        .entry(ResourceLocation.withDefaultNamespace("mossy_stone_bricks"), PaletteRole.RARE, 5))
                .text(t(id, "weights"))
                .tip(t(id, "variation_tip"));
        return finish(guide, id).build();
    }

    private static HandbookGuide depth() {
        var id = "adding_shape_and_depth";
        var guide = lesson(id, "stone_brick_stairs", 20)
                .text(t(id, "plane"))
                .text(t(id, "compare"))
                .structure(GettingStartedExamples::depthComparison)
                .text(t(id, "recess"))
                .text(t(id, "frame"))
                .structure(wall -> GettingStartedExamples.window(wall, 0, 2, false))
                .text(t(id, "edge"))
                .text(t(id, "restraint"));
        return finish(guide, id).build();
    }

    private static HandbookGuide texture() {
        var id = "using_texture_intentionally";
        var guide = lesson(id, "mossy_stone_bricks", 30)
                .text(t(id, "types"))
                .text(t(id, "compare"))
                .structure(GettingStartedExamples::textureComparison)
                .text(t(id, "group"))
                .structure(GettingStartedExamples::texturePatch)
                .text(t(id, "gradient"))
                .structure(GettingStartedExamples::gradient)
                .text(t(id, "story"));
        return finish(guide, id).build();
    }

    private static HandbookGuide details() {
        var id = "details_and_lighting";
        var guide = lesson(id, "lantern", 40)
                .text(t(id, "focus"))
                .text(t(id, "compare"))
                .structure(GettingStartedExamples::detailComparison)
                .text(t(id, "motif"))
                .structure(wall -> GettingStartedExamples.entry(wall, 0, true, false))
                .text(t(id, "lighting"))
                .tip(t(id, "preview"))
                .text(t(id, "night"));
        return finish(guide, id).build();
    }

    private static HandbookGuide firstBuild() {
        var id = "your_first_build";
        var guide = lesson(id, "oak_planks", 50)
                .text(t(id, "brief"))
                .text(t(id, "shape"))
                .structure(wall -> GettingStartedExamples.workshop(wall, false, false))
                .text(t(id, "palette"))
                .text(t(id, "depth"))
                .structure(wall -> GettingStartedExamples.window(wall, 0, 2, false))
                .text(t(id, "fade"))
                .text(t(id, "texture"))
                .text(t(id, "details"))
                .text(t(id, "adapt"))
                .structure(wall -> GettingStartedExamples.workshop(wall, true, true));
        return finish(guide, id).build();
    }
}
