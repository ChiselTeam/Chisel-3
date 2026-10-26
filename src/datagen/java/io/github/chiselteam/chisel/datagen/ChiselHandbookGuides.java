package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.content.ChiselFamilies;
import io.github.chiselteam.chisel.datagen.guide.GettingStartedGuides;
import io.github.chiselteam.chisel.datagen.guide.HandbookGuideBuilder;
import io.github.chiselteam.chisel.datagen.providers.HandbookGuideProvider;
import io.github.chiselteam.chisel.guide.HandbookGuide;
import io.github.chiselteam.chisel.guide.section.palette.PaletteRole;
import io.github.chiselteam.chisel.palette.DefaultPalettes;
import io.github.chiselteam.chisel.registry.ChiselBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public final class ChiselHandbookGuides extends HandbookGuideProvider {

    private BiConsumer<ResourceLocation, HandbookGuide> guideOutput;

    // Categories
    private final ResourceLocation BLOCKS = Chisel.prefix("blocks");
    private final ResourceLocation ITEMS = Chisel.prefix("items");
    private final ResourceLocation PALETTES = Chisel.prefix("palettes");

    public ChiselHandbookGuides(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildGuides(BiConsumer<ResourceLocation, HandbookGuide> output) {
        guideOutput = output;
        addBlockGuides();
        addItemGuides();
        addPaletteGuides();
        GettingStartedGuides.generate(output);
    }

    private void buildGuide(String name, HandbookGuide guide) {
        guideOutput.accept(Chisel.prefix(name), guide);
    }

    private void addBlockGuides() {
        // MARK: CUSTOM BLOCKS
        buildGuide("marble",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.marble.title"), Chisel.prefix("marble_raw"))
                        .description(Component.translatable("chisel.guide.marble.description"))
                        .category(BLOCKS)
                        .sortOrder(201)
                        .variantWall(ChiselFamilies.MARBLE)
                        .text(Component.translatable("chisel.guide.marble.usage"))
                        .build());

        buildGuide("limestone",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.limestone.title"), Chisel.prefix("limestone_raw"))
                        .description(Component.translatable("chisel.guide.limestone.description"))
                        .category(BLOCKS)
                        .sortOrder(202)
                        .variantWall(ChiselFamilies.LIMESTONE)
                        .text(Component.translatable("chisel.guide.limestone.usage"))
                        .build());

        buildGuide("antiblock",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.antiblock.title"), Chisel.prefix("antiblock_black"))
                        .description(Component.translatable("chisel.guide.antiblock.description"))
                        .category(BLOCKS)
                        .sortOrder(203)
                        .craftingRecipe(Chisel.prefix("antiblock_black"))
                        .build()
        );

        buildGuide("cloud",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.cloud.title"), Chisel.prefix("cloud_normal"))
                        .description(Component.translatable("chisel.guide.cloud.description"))
                        .category(BLOCKS)
                        .sortOrder(204)
                        .variantWall(ChiselFamilies.CLOUD)
                        .text(Component.translatable("chisel.guide.cloud.usage"))
                        .build());

        buildGuide("chisel_concrete",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.chisel_concrete.title"), Chisel.prefix("concrete_raw"))
                        .description(Component.translatable("chisel.guide.chisel_concrete.description"))
                        .category(BLOCKS)
                        .sortOrder(205)
                        .variantWall(ChiselFamilies.C_CONCRETE)
                        .text(Component.translatable("chisel.guide.chisel_concrete.usage"))
                        .build());

        buildGuide("factory",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.factory.title"), Chisel.prefix("factory_circuit"))
                        .description(Component.translatable("chisel.guide.factory.description"))
                        .category(BLOCKS)
                        .sortOrder(207)
                        .craftingRecipe(Chisel.prefix("factory_circuit"))
                        .variantWall(ChiselFamilies.FACTORY)
                        .build());

        buildGuide("fantasy",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.fantasy.title"), Chisel.prefix("fantasy_block"))
                        .description(Component.translatable("chisel.guide.fantasy.description"))
                        .category(BLOCKS)
                        .sortOrder(208)
                        .text(Component.literal("\n".repeat(9)))
                        .variantWall(ChiselFamilies.FANTASY)
                        .craftingRecipe(Chisel.prefix("fantasy_block"))
                        .craftingRecipe(Chisel.prefix("fantasy_purple_block"))
                        .variantWall(ChiselFamilies.FANTASY_PURPLE)
                        .craftingRecipe(Chisel.prefix("fantasy_green_block"))
                        .variantWall(ChiselFamilies.FANTASY_GREEN)
                        .craftingRecipe(Chisel.prefix("fantasy_blue_block"))
                        .variantWall(ChiselFamilies.FANTASY_BLUE)
                        .craftingRecipe(Chisel.prefix("fantasy_red_block"))
                        .variantWall(ChiselFamilies.FANTASY_RED)
                        .build());

        buildGuide("futura",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.futura.title"), Chisel.prefix("futura_controller"))
                        .description(Component.translatable("chisel.guide.futura.description"))
                        .category(BLOCKS)
                        .sortOrder(209)
                        .craftingRecipe(Chisel.prefix("futura_controller"))
                        .variantWall(ChiselFamilies.FUTURA)
                        .build());

        buildGuide("grimstone",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.grimstone.title"), Chisel.prefix("grimstone_blocks"))
                        .description(Component.translatable("chisel.guide.grimstone.description"))
                        .category(BLOCKS)
                        .sortOrder(210)
                        .craftingRecipe(Chisel.prefix("grimstone_blocks"))
                        .variantWall(ChiselFamilies.GRIMSTONE)
                        .build());

        buildGuide("holystone",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.holystone.title"), Chisel.prefix("holystone_blocks"))
                        .description(Component.translatable("chisel.guide.holystone.description"))
                        .category(BLOCKS)
                        .sortOrder(211)
                        .craftingRecipe(Chisel.prefix("holystone_blocks"))
                        .variantWall(ChiselFamilies.HOLYSTONE)
                        .build());

        buildGuide("hex_plating",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.hex_plating.title"), Chisel.prefix("hex_plating_0"))
                        .description(Component.translatable("chisel.guide.hex_plating.description"))
                        .category(BLOCKS)
                        .sortOrder(212)
                        .craftingRecipe(Chisel.prefix("hex_plating_0"))
                        .variantWall(ChiselFamilies.HEX_PLATING)
                        .build());

        buildGuide("kitchen",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.kitchen.title"), Chisel.prefix("kitchen_checker"))
                        .description(Component.translatable("chisel.guide.kitchen.description"))
                        .category(BLOCKS)
                        .sortOrder(213)
                        .craftingRecipe(Chisel.prefix("kitchen_checker"))
                        .variantWall(ChiselFamilies.KITCHEN)
                        .build());

        buildGuide("laboratory",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.laboratory.title"), Chisel.prefix("laboratory_checkerboard"))
                        .description(Component.translatable("chisel.guide.laboratory.description"))
                        .category(BLOCKS)
                        .sortOrder(214)
                        .craftingRecipe(Chisel.prefix("laboratory_checkerboard"))
                        .variantWall(ChiselFamilies.LABORATORY)
                        .build());

        buildGuide("lavastone",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.lavastone.title"), Chisel.prefix("lavastone_array"))
                        .description(Component.translatable("chisel.guide.lavastone.description"))
                        .category(BLOCKS)
                        .sortOrder(215)
                        .craftingRecipe(Chisel.prefix("lavastone_array"))
                        .variantWall(ChiselFamilies.LAVASTONE)
                        .build());

        buildGuide("waterstone",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.waterstone.title"), Chisel.prefix("waterstone_array"))
                        .description(Component.translatable("chisel.guide.waterstone.description"))
                        .category(BLOCKS)
                        .sortOrder(216)
                        .craftingRecipe(Chisel.prefix("waterstone_array"))
                        .variantWall(ChiselFamilies.WATERSTONE)
                        .build());

        // for (var color : DyeColor.values()) {
        //     var id = "light_" + color.getName();
        //     buildGuide(id,
        //             HandbookGuideBuilder.builder(Component.translatable("chisel.guide." + id + ".title"), Chisel.prefix(id + "_regular"))
        //                     .description(Component.translatable("chisel.guide.lights.description"))
        //                     .category(BLOCKS)
        //                     .sortOrder(16 + color.getId())
        //                     .craftingRecipe(Chisel.prefix(id + "_regular"))
        //                     .variantWall(ChiselFamilies.LIGHT.get(color.getId()))
        //                     .build());
        // }

        buildGuide("lights",
                HandbookGuideBuilder.builder(Component.literal("Lights"), Chisel.prefix("light_white_regular"))
                        .description(Component.translatable("chisel.guide.lights.description"))
                        .category(BLOCKS)
                        .sortOrder(217)
                        .text(Component.literal("\n".repeat(9)))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.WHITE.getId()))
                        .craftingRecipe(Chisel.prefix("light_white_regular"))
                        .craftingRecipe(Chisel.prefix("light_orange_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.ORANGE.getId()))
                        .craftingRecipe(Chisel.prefix("light_magenta_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.MAGENTA.getId()))
                        .craftingRecipe(Chisel.prefix("light_light_blue_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.LIGHT_BLUE.getId()))
                        .craftingRecipe(Chisel.prefix("light_yellow_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.YELLOW.getId()))
                        .craftingRecipe(Chisel.prefix("light_lime_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.LIME.getId()))
                        .craftingRecipe(Chisel.prefix("light_pink_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.PINK.getId()))
                        .craftingRecipe(Chisel.prefix("light_gray_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.GRAY.getId()))
                        .craftingRecipe(Chisel.prefix("light_light_gray_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.LIGHT_GRAY.getId()))
                        .craftingRecipe(Chisel.prefix("light_cyan_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.CYAN.getId()))
                        .craftingRecipe(Chisel.prefix("light_purple_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.PURPLE.getId()))
                        .craftingRecipe(Chisel.prefix("light_blue_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.BLUE.getId()))
                        .craftingRecipe(Chisel.prefix("light_brown_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.BROWN.getId()))
                        .craftingRecipe(Chisel.prefix("light_green_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.GREEN.getId()))
                        .craftingRecipe(Chisel.prefix("light_red_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.RED.getId()))
                        .craftingRecipe(Chisel.prefix("light_black_regular"))
                        .variantWall(ChiselFamilies.LIGHT.get(DyeColor.BLACK.getId()))
                        .build());

        buildGuide("liminal",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.liminal.title"), Chisel.prefix("liminal_wall_1"))
                        .description(Component.translatable("chisel.guide.liminal.description"))
                        .category(BLOCKS)
                        .sortOrder(233)
                        .craftingRecipe(Chisel.prefix("liminal_wall_1"))
                        .variantWall(ChiselFamilies.LIMINAL)
                        .build());

        buildGuide("military",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.military.title"), Chisel.prefix("military_imperial_camo"))
                        .description(Component.translatable("chisel.guide.military.description"))
                        .category(BLOCKS)
                        .sortOrder(235)
                        .craftingRecipe(Chisel.prefix("military_imperial_camo"))
                        .variantWall(ChiselFamilies.MILITARY)
                        .build());

        buildGuide("mossy_temple",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.mossy_temple.title"), Chisel.prefix("mossy_temple_bricks"))
                        .description(Component.translatable("chisel.guide.mossy_temple.description"))
                        .category(BLOCKS)
                        .sortOrder(236)
                        .craftingRecipe(Chisel.prefix("mossy_temple_bricks"))
                        .variantWall(ChiselFamilies.MOSSY_TEMPLE)
                        .build());

        buildGuide("nexus",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.nexus.title"), Chisel.prefix("nexus_core"))
                        .description(Component.translatable("chisel.guide.nexus.description"))
                        .category(BLOCKS)
                        .sortOrder(237)
                        .craftingRecipe(Chisel.prefix("nexus_core"))
                        .variantWall(ChiselFamilies.NEXUS)
                        .build());

        buildGuide("paperwall",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.paperwall.title"), Chisel.prefix("paperwall_boxed"))
                        .description(Component.translatable("chisel.guide.paperwall.description"))
                        .category(BLOCKS)
                        .sortOrder(238)
                        .craftingRecipe(Chisel.prefix("paperwall_boxed"))
                        .variantWall(ChiselFamilies.PAPERWALL)
                        .build());

        buildGuide("road_lines",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.road_lines.title"), Chisel.prefix("road_line_double_white_center"))
                        .description(Component.translatable("chisel.guide.road_lines.description"))
                        .category(BLOCKS)
                        .sortOrder(239)
                        .craftingRecipe(Chisel.prefix("road_line_double_white_center"))
                        .variantWall(ChiselFamilies.ROAD_LINE)
                        .build());

        buildGuide("shingles",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.shingles.title"), Chisel.prefix("shingles_1"))
                        .description(Component.translatable("chisel.guide.shingles.description"))
                        .category(BLOCKS)
                        .sortOrder(240)
                        .craftingRecipe(Chisel.prefix("shingles_1"))
                        .variantWall(ChiselFamilies.SHINGLE)
                        .build());

        buildGuide("technical",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.technical.title"), Chisel.prefix("technical_125"))
                        .description(Component.translatable("chisel.guide.technical.description"))
                        .category(BLOCKS)
                        .sortOrder(241)
                        .craftingRecipe(Chisel.prefix("technical_125"))
                        .variantWall(ChiselFamilies.TECHNICAL)
                        .build());

        buildGuide("temple",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.temple.title"), Chisel.prefix("temple_cobble"))
                        .description(Component.translatable("chisel.guide.temple.description"))
                        .category(BLOCKS)
                        .sortOrder(242)
                        .craftingRecipe(Chisel.prefix("temple_cobble"))
                        .variantWall(ChiselFamilies.TEMPLE)
                        .build());

        buildGuide("tyrian",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.tyrian.title"), Chisel.prefix("tyrian_black"))
                        .description(Component.translatable("chisel.guide.tyrian.description"))
                        .category(BLOCKS)
                        .sortOrder(243)
                        .craftingRecipe(Chisel.prefix("tyrian_black"))
                        .variantWall(ChiselFamilies.TYRIAN)
                        .build());

        buildGuide("valentines",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.valentines.title"), Chisel.prefix("valentines_block"))
                        .description(Component.translatable("chisel.guide.valentines.description"))
                        .category(BLOCKS)
                        .sortOrder(244)
                        .craftingRecipe(Chisel.prefix("valentines_block"))
                        .variantWall(ChiselFamilies.VALENTINES)
                        .build());

        buildGuide("voidstone",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.voidstone.title"), Chisel.prefix("voidstone_bevel"))
                        .description(Component.translatable("chisel.guide.voidstone.description"))
                        .category(BLOCKS)
                        .sortOrder(245)
                        .craftingRecipe(Chisel.prefix("voidstone_bevel"))
                        .variantWall(ChiselFamilies.VOIDSTONE)
                        .build());

        buildGuide("energized_voidstone",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.energized_voidstone.title"), Chisel.prefix("energized_voidstone_bevel"))
                        .description(Component.translatable("chisel.guide.energized_voidstone.description"))
                        .category(BLOCKS)
                        .sortOrder(246)
                        .craftingRecipe(Chisel.prefix("energized_voidstone_bevel"))
                        .variantWall(ChiselFamilies.ENERGIZED_VOIDSTONE)
                        .build());

        buildGuide("warning_signs",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.warning_signs.title"), Chisel.prefix("warning_biohazard"))
                        .description(Component.translatable("chisel.guide.warning_signs.description"))
                        .category(BLOCKS)
                        .sortOrder(247)
                        .craftingRecipe(Chisel.prefix("warning_biohazard"))
                        .variantWall(ChiselFamilies.WARNING)
                        .build());

        buildGuide("steampunk",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.steampunk.title"), Chisel.prefix("steampunk_rusted_metal_sheet"))
                        .description(Component.translatable("chisel.guide.steampunk.description"))
                        .category(BLOCKS)
                        .sortOrder(248)
                        .text(Component.literal("\n".repeat(9)))
                        .variantWall(ChiselFamilies.STEAMPUNK)
                        .craftingRecipe(Chisel.prefix("steampunk_rusted_metal_sheet"))
                        .build());
    }

//MARK: ITEM TOOLS
    private void addItemGuides() {
        // MARK: Utilities
        buildGuide("auto_chisel",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.auto_chisel.title"), Chisel.prefix("auto_chisel"))
                        .description(Component.translatable("chisel.guide.auto_chisel.description"))
                        .category(ITEMS)
                        .sortOrder(1)
                        .craftingRecipe(Chisel.prefix("auto_chisel"))
                        .structure(preview -> preview.block(0, 0, 0, ChiselBlocks.AUTO_CHISEL.get().defaultBlockState()))
                        .text(Component.translatable("chisel.guide.auto_chisel.usage"))
                        .text(Component.translatable("chisel.guide.auto_chisel.details"))
                        .tip(Component.translatable("chisel.guide.auto_chisel.tip"))
                        .build());

        buildGuide("builders_guide",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.builders_guide.title"), Chisel.prefix("builders_guide"))
                        .description(Component.translatable("chisel.guide.builders_guide.description"))
                        .category(ITEMS)
                        .sortOrder(2)
                        .craftingRecipe(Chisel.prefix("builders_guide"))
                        .structure(preview -> preview.block(0, 0, 0, ChiselBlocks.BUILDERS_GUIDE.get().defaultBlockState()))
                        .text(Component.translatable("chisel.guide.builders_guide.usage"))
                        .text(Component.translatable("chisel.guide.builders_guide.details"))
                        .tip(Component.translatable("chisel.guide.builders_guide.tip"))
                        .build());

        buildGuide("auto_chisel_upgrades",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.auto_chisel_upgrades.title"), Chisel.prefix("upgrade_stack"))
                        .description(Component.translatable("chisel.guide.auto_chisel_upgrades.description"))
                        .category(ITEMS)
                        .sortOrder(30)
                        .text(Component.translatable("chisel.guide.auto_chisel_upgrades.usage"))
                        .text(Component.translatable("chisel.guide.auto_chisel_upgrades.details"))
                        .tip(Component.translatable("chisel.guide.auto_chisel_upgrades.tip"))
                        .craftingRecipe(Chisel.prefix("upgrade_speed"))
                        .craftingRecipe(Chisel.prefix("upgrade_automation"))
                        .craftingRecipe(Chisel.prefix("upgrade_stack"))
                        .craftingRecipe(Chisel.prefix("upgrade_reversion"))
                        .build());

        buildGuide("ball_o_moss",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.ball_o_moss.title"), Chisel.prefix("ballomoss"))
                        .description(Component.translatable("chisel.guide.ball_o_moss.description"))
                        .category(ITEMS)
                        .sortOrder(100)
                        .text(Component.translatable("chisel.guide.ball_o_moss.usage"))
                        .text(Component.translatable("chisel.guide.ball_o_moss.details"))
                        .tip(Component.translatable("chisel.guide.ball_o_moss.tip"))
                        .craftingRecipe(Chisel.prefix("ballomoss"))
                        .build());

        buildGuide("builders_handbook",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.builders_handbook.title"), Chisel.prefix("builders_handbook"))
                        .description(Component.translatable("chisel.guide.builders_handbook.description"))
                        .category(ITEMS)
                        .sortOrder(70)
                        .image(Chisel.prefix("textures/gui/handbook/sky_warm_clouds_square.png"), 48, 48)
                        .text(Component.translatable("chisel.handbook.image.example"))
                        .text(Component.translatable("chisel.guide.builders_handbook.usage"))
                        .text(Component.translatable("chisel.guide.builders_handbook.details"))
                        .tip(Component.translatable("chisel.guide.builders_handbook.tip"))
                        .build());

        buildGuide("chisels",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.chisels.title"), Chisel.prefix("chisel_iron"))
                        .description(Component.translatable("chisel.guide.chisels.description"))
                        .category(ITEMS)
                        .sortOrder(10)
                        .text(Component.translatable("chisel.guide.chisels.usage"))
                        .text(Component.translatable("chisel.guide.chisels.details"))
                        .tip(Component.translatable("chisel.guide.chisels.tip"))
                        .craftingRecipe(Chisel.prefix("chisel_iron"))
                        .craftingRecipe(Chisel.prefix("chisel_diamond"))
                        .craftingRecipe(Chisel.prefix("chisel_obsidian"))
                        .build());

        buildGuide("cloud_in_a_bottle",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.cloud_in_a_bottle.title"), Chisel.prefix("cloudinabottle"))
                        .description(Component.translatable("chisel.guide.cloud_in_a_bottle.description"))
                        .category(ITEMS)
                        .sortOrder(110)
                        .text(Component.translatable("chisel.guide.cloud_in_a_bottle.usage"))
                        .text(Component.translatable("chisel.guide.cloud_in_a_bottle.details"))
                        .tip(Component.translatable("chisel.guide.cloud_in_a_bottle.tip"))
                        .craftingRecipe(Chisel.prefix("cloudinabottle"))
                        .build());

        buildGuide("measuring_tape",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.measuring_tape.title"), Chisel.prefix("measuring_tape"))
                        .description(Component.translatable("chisel.guide.measuring_tape.description"))
                        .category(ITEMS)
                        .sortOrder(60)
                        .text(Component.translatable("chisel.guide.measuring_tape.usage"))
                        .text(Component.translatable("chisel.guide.measuring_tape.details"))
                        .tip(Component.translatable("chisel.guide.measuring_tape.tip"))
                        .craftingRecipe(Chisel.prefix("measuring_tape"))
                        .build());

        buildGuide("offset_tool",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.offset_tool.title"), Chisel.prefix("offset_tool"))
                        .description(Component.translatable("chisel.guide.offset_tool.description"))
                        .category(ITEMS)
                        .sortOrder(40)
                        .text(Component.translatable("chisel.guide.offset_tool.usage"))
                        .text(Component.translatable("chisel.guide.offset_tool.details"))
                        .tip(Component.translatable("chisel.guide.offset_tool.tip"))
                        .craftingRecipe(Chisel.prefix("offset_tool"))
                        .build());

        buildGuide("palette_builder",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.palette_builder.title"), Chisel.prefix("palette_builder"))
                        .description(Component.translatable("chisel.guide.palette_builder.description"))
                        .category(ITEMS)
                        .category(PALETTES)
                        .sortOrder(80)
                        .text(Component.translatable("chisel.guide.palette_builder.usage"))
                        .image(Chisel.prefix("textures/gui/handbook/palette_builder.png"), 1860, 1050)
                        .text(Component.translatable("chisel.guide.palette_builder.screenshot"))
                        .text(Component.translatable("chisel.guide.palette_builder.details"))
                        .text(Component.translatable("chisel.guide.palette_builder.weights"))
                        .text(Component.translatable("chisel.guide.palette_builder.preview"))
                        .tip(Component.translatable("chisel.guide.palette_builder.tip"))
                        .craftingRecipe(Chisel.prefix("palette_builder"))
                        .build());

        buildGuide("smashing_rock",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.smashing_rock.title"), Chisel.prefix("smashingrock"))
                        .description(Component.translatable("chisel.guide.smashing_rock.description"))
                        .category(ITEMS)
                        .sortOrder(120)
                        .text(Component.translatable("chisel.guide.smashing_rock.usage"))
                        .text(Component.translatable("chisel.guide.smashing_rock.details"))
                        .tip(Component.translatable("chisel.guide.smashing_rock.tip"))
                        .craftingRecipe(Chisel.prefix("smashingrock"))
                        .build());

        buildGuide("trowel",
                HandbookGuideBuilder.builder(Component.translatable("chisel.guide.trowel.title"), Chisel.prefix("trowel"))
                        .description(Component.translatable("chisel.guide.trowel.description"))
                        .category(ITEMS)
                        .category(PALETTES)
                        .sortOrder(90)
                        .text(Component.translatable("chisel.guide.trowel.usage"))
                        .text(Component.translatable("chisel.guide.trowel.details"))
                        .tip(Component.translatable("chisel.guide.trowel.tip"))
                        .craftingRecipe(Chisel.prefix("trowel"))
                        .build());
    }

    private void addPaletteGuides() {
        int sortOrder = 100;
        for (var defaultPalette : DefaultPalettes.create()) {
            var definition = defaultPalette.definition();
            var id = "default_palette_" + definition.name().toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]+", "_");
            buildGuide(id,
                    HandbookGuideBuilder.builder(Component.literal(definition.name()), definition.icon())
                            .description(Component.literal(definition.description()))
                            .category(PALETTES)
                            .sortOrder(sortOrder++)
                            .text(Component.translatable("chisel.guide.default_palette.usage"))
                            .paletteWall(definition)
                            .tip(Component.translatable("chisel.guide.default_palette.wall_tip"))
                            .palette(Component.translatable("chisel.guide.default_palette.materials"), palette -> {
                                for (var entry : definition.entries()) {
                                    if (!entry.enabled()) continue;
                                    var role = entry.weight() >= 50 ? PaletteRole.PRIMARY
                                            : entry.weight() >= 15 ? PaletteRole.SECONDARY
                                            : entry.weight() >= 5 ? PaletteRole.ACCENT : PaletteRole.RARE;
                                    palette.entry(entry.block(), role, entry.weight());
                                }
                            })
                            .build());
        }

    }
}
