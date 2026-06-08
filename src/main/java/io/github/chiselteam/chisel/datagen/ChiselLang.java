package io.github.chiselteam.chisel.datagen;

import io.github.chiselteam.chisel.registry.ChiselBlocks;
import io.github.chiselteam.chisel.registry.ChiselItems;
import io.github.chiselteam.chisel.util.LangHelper;
import net.minecraft.data.PackOutput;

public class ChiselLang extends LangHelper {

    public ChiselLang(PackOutput output) {
        super(output, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItems();
        addTabs();

        ChiselBlocks.getBlocks().forEach(block -> block.addTranslations(this));

        add("item.chisel.chisel.desc1", "Right click to open GUI");
        add("item.chisel.chisel.desc2", "Left click to chisel blocks in the world");
        add("item.chisel.chisel.desc3", "Target a block by leaving it in the Chisel Slot");

        add("item.chisel.offset_tool.desc", "Right click highlighted direction to shift texture");
        add("item.chisel.offset_tool.desc2", "Will only highlight on textures that can be offset");

        add("item.chisel.ball_o_moss.desc", "Right click to throw. Will change a variety of blocks into their mossy counterpart");
        add("item.chisel.cloud_in_a_bottle.desc", "Right click to throw. This will spawn clouds on impact.");
        add("item.chisel.smashing_rock.desc", "Right click to throw. Crushes blocks on impact.");

        add("block.chisel.auto_chisel", "Auto Chisel");
        add("item.chisel.auto_chisel", "Auto Chisel");

        addContainer("chisel", "Chisel");
        addContainer("auto_chisel", "Auto Chisel");

        add("chisel.gui.confirm", "Chisel");
        add("chisel.gui.search", "Search:");
        add("chisel.gui.mode", "Mode");

        addPreviewMode("donut", "Donut");
        addPreviewMode("panel", "Panel");
        addPreviewMode("plus", "Plus");
        addPreviewMode("single", "Single");
        addPreviewMode("column", "Column");
        addPreviewMode("row", "Row");

        addChiselMode("single", "Single");
        addChiselMode("panel", "Panel");
        addChiselMode("column", "Column");
        addChiselMode("row", "Row");
        addChiselMode("shapeless", "Shapeless");
        addChiselMode("shapeless_flat", "Shapeless Flat");

        add("stat.chisel.blocks_chiseled", "Blocks Chiseled");
    }

    private void addTabs() {
        add("itemGroup.tabChisel", "Chisel Items");
        add("itemGroup.tabModdedChiselBlocks", "Modded Chisel Blocks");
        add("itemGroup.tabMetalChiselBlocks", "Metal Chisel Blocks");
        add("itemGroup.tabWoodChiselBlocks", "Wood Chisel Blocks");
        add("itemGroup.tabStoneChiselBlocks", "Stone Chisel Blocks");
        add("itemGroup.tabOtherChiselBlocks", "Other Chisel Blocks");
    }

    private void addItems() {
        addItem(ChiselItems.BALL_O_MOSS, "Ball O' Moss");
        addItem(ChiselItems.CHISEL_DIAMOND, "Diamond Chisel");
        addItem(ChiselItems.CHISEL_IRON, "Chisel");
        addItem(ChiselItems.CHISEL_OBSIDIAN, "Obsidian Chisel");
        addItem(ChiselItems.OFFSET_TOOL, "Ender Offset Wand");
        addItem(ChiselItems.CLOUD_IN_A_BOTTLE, "Cloud in a Bottle");
        addItem(ChiselItems.SMASHING_ROCK, "Smashing Rock");
        addItem(ChiselItems.UPGRADE_AUTOMATION, "Automation Upgrade");
        addItem(ChiselItems.UPGRADE_REVERSION, "Reversion Upgrade");
        addItem(ChiselItems.UPGRADE_SPEED, "Speed Upgrade");
        addItem(ChiselItems.UPGRADE_STACK, "Stack Upgrade");
    }
}