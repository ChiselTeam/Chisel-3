package io.github.chiselteam.chisel.content;

import io.github.chiselteam.chisel.content.compat.CompatFamilies;
import io.github.chiselteam.chisel.content.compat.allthemods.AtmAncientStoneFamily;
import io.github.chiselteam.chisel.content.compat.appliedenergistics.Ae2CertusFamily;
import io.github.chiselteam.chisel.content.compat.appliedenergistics.Ae2SkyStoneFamily;
import io.github.chiselteam.chisel.content.compat.forbiddenarcanus.FaArcaneDarkstoneFamily;
import io.github.chiselteam.chisel.content.compat.moddedmetal.*;
import io.github.chiselteam.chisel.content.compat.neovitae.NvRuneFamily;
import io.github.chiselteam.chisel.content.compat.occultism.OcTallowFamily;
import io.github.chiselteam.chisel.content.family.color.*;
import io.github.chiselteam.chisel.content.family.decorative.*;
import io.github.chiselteam.chisel.content.family.metal.*;
import io.github.chiselteam.chisel.content.family.special.*;
import io.github.chiselteam.chisel.content.family.stone.*;
import io.github.chiselteam.chisel.content.family.wood.*;
import io.github.chiselteam.chisel.family.VariantFamilyRegistrar;
import net.minecraft.world.item.DyeColor;

import java.util.ArrayList;
import java.util.List;

public class ChiselFamilies {
    public static final ChiselFamily ACACIA = AcaciaFamily.FAMILY;
    public static final ChiselFamily ALUMINUM = AluminumFamily.FAMILY;
    public static final ChiselFamily ATM_ANCIENT_STONE = AtmAncientStoneFamily.FAMILY;
    public static final ChiselFamily ANDESITE = AndesiteFamily.FAMILY;
    public static final ChiselFamily ANTIBLOCK = AntiblockFamily.FAMILY;
    public static final ChiselFamily FA_ARCANE_DARKSTONE = FaArcaneDarkstoneFamily.FAMILY;
    public static final ChiselFamily BAMBOO = BambooFamily.FAMILY;
    public static final ChiselFamily BIRCH = BirchFamily.FAMILY;
    public static final ChiselFamily BLACKSTONE = BlackstoneFamily.FAMILY;
    public static final ChiselFamily GILDED_BLACKSTONE = GildedBlackstoneFamily.FAMILY;
    public static final ChiselFamily SEA_LANTERN = SeaLanternFamily.FAMILY;
    public static final ChiselFamily BOOKSHELF = BookshelfFamily.FAMILY;
    public static final ChiselFamily BRICKS = BricksFamily.FAMILY;
    public static final ChiselFamily BRONZE = BronzeFamily.FAMILY;
    public static final ChiselFamily AE2_CERTUS = Ae2CertusFamily.FAMILY;
    public static final ChiselFamily AE2_SKY_STONE = Ae2SkyStoneFamily.FAMILY;
    public static final ChiselFamily CHARCOAL = CharcoalFamily.FAMILY;
    public static final ChiselFamily CLOUD = CloudFamily.FAMILY;
    public static final ChiselFamily COAL = CoalFamily.FAMILY;
    public static final ChiselFamily COAL_COKE = CoalCokeFamily.FAMILY;
    public static final ChiselFamily COBALT = CobaltFamily.FAMILY;
    public static final ChiselFamily COBBLESTONE = CobblestoneFamily.FAMILY;
    public static final ChiselFamily C_CONCRETE = CConcreteFamily.FAMILY;
    public static final ChiselFamily COPPER = CopperFamily.FAMILY;
    public static final ChiselFamily EXPOSED_COPPER = ExposedCopperFamily.FAMILY;
    public static final ChiselFamily WEATHERED_COPPER = WeatheredCopperFamily.FAMILY;
    public static final ChiselFamily OXIDIZED_COPPER = OxidizedCopperFamily.FAMILY;
    public static final ChiselFamily CRIMSON = CrimsonFamily.FAMILY;
    public static final ChiselFamily WARPED = WarpedFamily.FAMILY;
    public static final ChiselFamily DARK_OAK = DarkOakFamily.FAMILY;
    public static final ChiselFamily CHERRY = CherryFamily.FAMILY;
    public static final ChiselFamily BASALT = BasaltFamily.FAMILY;
    public static final ChiselFamily DIAMOND = DiamondFamily.FAMILY;
    public static final ChiselFamily DIORITE = DioriteFamily.FAMILY;
    public static final ChiselFamily COBBLED_DEEPSLATE = CobbledDeepslateFamily.FAMILY;
    public static final ChiselFamily DEEPSLATE = DeepslateFamily.FAMILY;
    public static final ChiselFamily DIRT = DirtFamily.FAMILY;
    public static final ChiselFamily ELECTRUM = ElectrumFamily.FAMILY;
    public static final ChiselFamily EMERALD = EmeraldFamily.FAMILY;
    public static final ChiselFamily END_STONE = EndStoneFamily.FAMILY;
    public static final ChiselFamily ENERGIZED_VOIDSTONE = EnergizedVoidstoneFamily.FAMILY;
    public static final ChiselFamily FACTORY = FactoryFamily.FAMILY;
    public static final ChiselFamily FUTURA = FuturaFamily.FAMILY;
    public static final ChiselFamily GLASS = GlassFamily.FAMILY;
    public static final ChiselFamily STEEL_FRAMED_GLASS = SteelFramedGlassFamily.FAMILY;
    public static final ChiselFamily OAK_FRAMED_GLASS = OakFramedGlassFamily.FAMILY;
    public static final ChiselFamily BRIGHT_GLASS = BrightGlassFamily.FAMILY;
    public static final ChiselFamily GLASS_PANE = GlassPaneFamily.FAMILY;
    public static final ChiselFamily GLOWSTONE = GlowstoneFamily.FAMILY;
    public static final ChiselFamily GOLD = GoldFamily.FAMILY;
    public static final ChiselFamily GRANITE = GraniteFamily.FAMILY;
    public static final ChiselFamily GRIMSTONE = GrimstoneFamily.FAMILY;
    public static final ChiselFamily HEX_PLATING = HexPlatingFamily.FAMILY;
    public static final ChiselFamily HOLYSTONE = HolystoneFamily.FAMILY;
    public static final ChiselFamily ICE = IceFamily.FAMILY;
    public static final ChiselFamily INVAR = InvarFamily.FAMILY;
    public static final ChiselFamily IRON = IronFamily.FAMILY;
    public static final ChiselFamily IRON_BARS = IronBarsFamily.FAMILY;
    public static final ChiselFamily JACK_O_LANTERN = JackOLanternFamily.FAMILY;
    public static final ChiselFamily JUNGLE = JungleFamily.FAMILY;
    public static final ChiselFamily MANGROVE = MangroveFamily.FAMILY;
    public static final ChiselFamily LABORATORY = LaboratoryFamily.FAMILY;
    public static final ChiselFamily LAPIS = LapisFamily.FAMILY;
    public static final ChiselFamily LAVASTONE = LavastoneFamily.FAMILY;
    public static final ChiselFamily LEAD = LeadFamily.FAMILY;
    public static final ChiselFamily LEAF = LeafFamily.FAMILY;
    public static final ChiselFamily LIMESTONE = LimestoneFamily.FAMILY;
    public static final ChiselFamily MAGMA = MagmaFamily.FAMILY;
    public static final ChiselFamily MARBLE = MarbleFamily.FAMILY;
    public static final ChiselFamily MILITARY = MilitaryFamily.FAMILY;
    public static final ChiselFamily MOSSY_COBBLESTONE = MossyCobblestoneFamily.FAMILY;
    public static final ChiselFamily MOSSY_STONE = MossyStoneFamily.FAMILY;
    public static final ChiselFamily MOSSY_DEEPSLATE = MossyDeepslateFamily.FAMILY;
    public static final ChiselFamily MOSSY_BLACKSTONE = MossyBlackstoneFamily.FAMILY;
    public static final ChiselFamily MOSSY_TEMPLE = MossyTempleFamily.FAMILY;
    public static final ChiselFamily NV_RUNE = NvRuneFamily.FAMILY;
    public static final ChiselFamily NETHERBRICK = NetherbrickFamily.FAMILY;
    public static final ChiselFamily RED_NETHER_BRICKS = RedNetherBricksFamily.FAMILY;
    public static final ChiselFamily NETHERRACK = NetherrackFamily.FAMILY;
    public static final ChiselFamily NICKEL = NickelFamily.FAMILY;
    public static final ChiselFamily OAK = OakFamily.FAMILY;
    public static final ChiselFamily PALE_OAK = PaleOakFamily.FAMILY;
    public static final ChiselFamily OBSIDIAN = ObsidianFamily.FAMILY;
    public static final ChiselFamily CRYING_OBSIDIAN = CryingObsidianFamily.FAMILY;
    public static final ChiselFamily PAPERWALL = PaperwallFamily.FAMILY;
    public static final ChiselFamily PLATINUM = PlatinumFamily.FAMILY;
    public static final ChiselFamily QUARTZ = QuartzFamily.FAMILY;
    public static final ChiselFamily PRISMARINE = PrismarineFamily.FAMILY;
    public static final ChiselFamily PRISMARINE_BRICKS = PrismarineBricksFamily.FAMILY;
    public static final ChiselFamily DARK_PRISMARINE = DarkPrismarineFamily.FAMILY;
    public static final ChiselFamily PUMPKIN = PumpkinFamily.FAMILY;
    public static final ChiselFamily PURPUR = PurpurFamily.FAMILY;
    public static final ChiselFamily RED_SANDSTONE = RedSandstoneFamily.FAMILY;
    public static final ChiselFamily REDSTONE = RedstoneFamily.FAMILY;
    public static final ChiselFamily REDSTONE_LAMP = RedstoneLampFamily.FAMILY;
    public static final ChiselFamily ROAD_LINE = RoadLineFamily.FAMILY;
    public static final ChiselFamily SANDSTONE = SandstoneFamily.FAMILY;
    public static final ChiselFamily SHINGLE = ShingleFamily.FAMILY;
    public static final ChiselFamily SILVER = SilverFamily.FAMILY;
    public static final ChiselFamily SPRUCE = SpruceFamily.FAMILY;
    public static final ChiselFamily STEEL = SteelFamily.FAMILY;
    public static final ChiselFamily OC_TALLOW = OcTallowFamily.FAMILY;
    public static final ChiselFamily TECHNICAL = TechnicalFamily.FAMILY;
    public static final ChiselFamily TEMPLE = TempleFamily.FAMILY;
    public static final ChiselFamily TERRACOTTA = TerracottaFamily.FAMILY;
    public static final ChiselFamily THAUMIUM = ThaumiumFamily.FAMILY;
    public static final ChiselFamily TIN = TinFamily.FAMILY;
    public static final ChiselFamily TORCH = TorchFamily.FAMILY;
    public static final ChiselFamily TYRIAN = TyrianFamily.FAMILY;
    public static final ChiselFamily URANIUM = UraniumFamily.FAMILY;
    public static final ChiselFamily VALENTINES = ValentinesFamily.FAMILY;
    public static final ChiselFamily VOIDSTONE = VoidstoneFamily.FAMILY;
    public static final ChiselFamily WARNING = WarningFamily.FAMILY;
    public static final ChiselFamily WATERSTONE = WaterstoneFamily.FAMILY;
    public static final ChiselFamily CLAY = ClayFamily.FAMILY;
    public static final ChiselFamily TUFF = TuffFamily.FAMILY;
    public static final ChiselFamily CALCITE = CalciteFamily.FAMILY;
    public static final ChiselFamily NETHERITE = NetheriteFamily.FAMILY;
    public static final ChiselFamily DRIPSTONE = DripstoneFamily.FAMILY;
    public static final ChiselFamily MUD = MudFamily.FAMILY;
    public static final ChiselFamily PACKED_MUD = PackedMudFamily.FAMILY;
    public static final ChiselFamily RESIN = ResinFamily.FAMILY;
    public static final ChiselFamily NEXUS = NexusFamily.FAMILY;
    public static final ChiselFamily KITCHEN = KitchenFamily.FAMILY;
    public static final ChiselFamily LIMINAL = LiminalFamily.FAMILY;
    public static final ChiselFamily STONE = StoneFamily.FAMILY;
    public static final ChiselFamily SMOOTH_STONE = SmoothStoneFamily.FAMILY;
    public static final ChiselFamily RAW_COPPER = RawCopperFamily.FAMILY;
    public static final ChiselFamily RAW_IRON = RawIronFamily.FAMILY;
    public static final ChiselFamily RAW_GOLD = RawGoldFamily.FAMILY;
    public static final ChiselFamily AMETHYST = AmethystFamily.FAMILY;
    public static final ChiselFamily ANCIENT_DEBRIS = AncientDebrisFamily.FAMILY;
    public static final ChiselFamily SCULK = SculkFamily.FAMILY;
    public static final ChiselFamily PACKED_ICE = PackedIceFamily.FAMILY;
    public static final ChiselFamily BLUE_ICE = BlueIceFamily.FAMILY;
    public static final ChiselFamily SNOW = SnowFamily.FAMILY;
    public static final ChiselFamily BONE_BLOCK = BoneBlockFamily.FAMILY;
    public static final ChiselFamily SOUL_SOIL = SoulSoilFamily.FAMILY;

    public static final List<ChiselFamily> WOOLS = new ArrayList<>();
    public static final List<ChiselFamily> CONCRETE = new ArrayList<>();
    public static final List<ChiselFamily> STAINED_GLASS = new ArrayList<>();
    public static final List<ChiselFamily> OAK_FRAMED_STAINED_GLASS = new ArrayList<>();
    public static final List<ChiselFamily> STEEL_FRAMED_STAINED_GLASS = new ArrayList<>();
    public static final List<ChiselFamily> STAINED_GLASS_PANE = new ArrayList<>();
    public static final List<ChiselFamily> LIGHT = new ArrayList<>();
    public static final List<ChiselFamily> WOOD_FAMILIES = List.of(ACACIA, BAMBOO, BIRCH, CHERRY, CRIMSON, DARK_OAK, JUNGLE, MANGROVE, OAK, PALE_OAK, SPRUCE, WARPED);
    private static final List<ChiselFamily> FAMILIES;

    static {
        var families = new ArrayList<>(WOOD_FAMILIES);

        // Stone
        families.addAll(List.of(
                SMOOTH_STONE, STONE, ANDESITE, BASALT, BLACKSTONE, GILDED_BLACKSTONE, BRICKS, COBBLESTONE,
                COBBLED_DEEPSLATE, DEEPSLATE, DIORITE, DRIPSTONE, END_STONE, GRANITE, LIMESTONE, MARBLE,
                MOSSY_COBBLESTONE, MOSSY_STONE, MOSSY_DEEPSLATE, MOSSY_BLACKSTONE, RED_NETHER_BRICKS, NETHERBRICK, NETHERRACK, OBSIDIAN,
                CRYING_OBSIDIAN, PRISMARINE, PRISMARINE_BRICKS, DARK_PRISMARINE, PURPUR, QUARTZ, RED_SANDSTONE, SANDSTONE,
                TUFF, CALCITE, PACKED_MUD
        ));

        // Metal
        families.addAll(List.of(
                ANCIENT_DEBRIS, RAW_IRON, RAW_GOLD, RAW_COPPER, COPPER, EXPOSED_COPPER, WEATHERED_COPPER, OXIDIZED_COPPER,
                DIAMOND, EMERALD, GOLD, IRON, LAPIS, NETHERITE, COAL
        ));

        // Modded metals
        families.addAll(List.of(
                ALUMINUM, BRONZE, COBALT, ELECTRUM, INVAR, LEAD, NICKEL, PLATINUM,
                SILVER, STEEL, THAUMIUM, TIN, URANIUM, CHARCOAL, COAL_COKE
        ));

        // Special
        families.addAll(List.of(
                ANTIBLOCK, BOOKSHELF, GLASS, STEEL_FRAMED_GLASS, OAK_FRAMED_GLASS, BRIGHT_GLASS, GLASS_PANE, IRON_BARS,
                JACK_O_LANTERN, PUMPKIN, REDSTONE_LAMP, ROAD_LINE, TORCH
        ));

        // Decorative
        families.addAll(List.of(
                C_CONCRETE, CLOUD, DIRT, ENERGIZED_VOIDSTONE, FACTORY, FUTURA, GLOWSTONE, GRIMSTONE,
                HEX_PLATING, HOLYSTONE, ICE, PACKED_ICE, BLUE_ICE, SNOW, LABORATORY, LAVASTONE,
                LEAF, MAGMA, MILITARY, MOSSY_TEMPLE, PAPERWALL, REDSTONE, RESIN, SEA_LANTERN,
                SHINGLE, TECHNICAL, TEMPLE, TERRACOTTA, TYRIAN, VALENTINES, VOIDSTONE, WARNING,
                WATERSTONE, CLAY, NEXUS, KITCHEN, LIMINAL, MUD, AMETHYST, SCULK,
                BONE_BLOCK, SOUL_SOIL
        ));

        for (DyeColor color : DyeColor.values()) {
            var wool = WoolFamily.create(color);
            var light = LightFamily.create(color);
            var concrete = ConcreteFamily.create(color);
            var stainedGlass = StainedGlassFamily.create(color);
            var oakFramedStainedGlass = OakFramedStainedGlassFamily.create(color);
            var steelFramedStainedGlass = SteelFramedStainedGlassFamily.create(color);
            var stainedGlassPane = StainedGlassPaneFamily.create(color);

            WOOLS.add(wool);
            LIGHT.add(light);
            CONCRETE.add(concrete);
            STAINED_GLASS.add(stainedGlass);
            OAK_FRAMED_STAINED_GLASS.add(oakFramedStainedGlass);
            STEEL_FRAMED_STAINED_GLASS.add(steelFramedStainedGlass);
            STAINED_GLASS_PANE.add(stainedGlassPane);

            families.addAll(List.of(
                    wool, light, concrete, stainedGlass,
                    oakFramedStainedGlass, steelFramedStainedGlass, stainedGlassPane
            ));
        }
        families.addAll(CompatFamilies.families());
        FAMILIES = List.copyOf(families);
    }

    private ChiselFamilies() {
    }

    public static void register() {
        FAMILIES.forEach(VariantFamilyRegistrar::register);
    }

    public static List<ChiselFamily> getFamilies() {
        return FAMILIES;
    }
}
