package io.github.chiselteam.chisel.datagen.lang;

import io.github.chiselteam.chisel.util.LangHelper;

public final class HandbookLang {

    private HandbookLang() {
    }

    public static void addTranslations(LangHelper lang) {
        addGeneralGuideTranslations(lang);
        addUnderstandingBlockPalettes(lang);
        addCategories(lang);
        addItemGuides(lang);
    }

    private static void addGeneralGuideTranslations(LangHelper lang) {
        lang.add("chisel.builders_handbook.title", "Builders Handbook");
        lang.add("chisel.builders_handbook.contents", "Table of Contents");
        lang.add("chisel.builders_handbook.intro", "This book is meant to serve as inspiration for your builds, as well as helpful entries to take your builds to the next level!");
        lang.add("chisel.builders_handbook.empty", "There are no handbook entries available");
    }

    private static void addCategories(LangHelper lang) {
        lang.add("chisel.builders_handbook.all_guides", "All Guides");
        lang.add("chisel.builders_handbook.all_guides.description", "Browse every available guide, including guides without a category.");
        lang.add("chisel.builders_handbook.guides", "Guides");
        lang.add("chisel.handbook.category.getting_started.title", "Getting Started");
        lang.add("chisel.handbook.category.getting_started.description", "Learn the basics of choosing materials and planning your builds.");
        lang.add("chisel.handbook.category.palettes.title", "Palettes");
        lang.add("chisel.handbook.category.palettes.description", "Discover combinations of blocks and how to balance their roles and weights.");
        lang.add("chisel.handbook.category.items.title", "Chisel Items");
        lang.add("chisel.handbook.category.items.description", "Learn how to use Chisel's tools, machines, upgrades and throwable items.");
    }


    private static void addItemGuides(LangHelper lang) {
        addItemGuide(lang, "chisels",
                "Chisels",
                "Choose decorative variants and reshape blocks already placed in your build.",
                "Right click with an Iron, Diamond or Obsidian Chisel to open its interface. Put a supported block in the Chisel Slot, then choose a variant from the list.",
                "Left click a supported block in the world to chisel it. Leave a target block in the Chisel Slot to choose the result. Hold the Select Mode / Palette key, scroll to a mode, then release the key to confirm.",
                "Chiseling uses tool durability. Different materials have different durability, which can be changed by the server configuration.");
        addItemGuide(lang, "auto_chisel",
                "Auto Chisel",
                "Convert building materials in bulk using a chisel and a template.",
                "Place the Auto Chisel and right click to open it. Add a chisel to its tool slot, a block showing the desired variant to its template slot, and compatible materials to the input slots.",
                "The machine converts input from the template's variant family and stores the results in its output slots. Keep room for output and replace the chisel when it wears out.",
                "Install upgrades in their matching slots to process stacks, increase speed, enable automation or revert variants.");
        addItemGuide(lang, "auto_chisel_upgrades",
                "Auto Chisel Upgrades",
                "Customize the Auto Chisel with Stack, Speed, Automation and Reversion Upgrades.",
                "The Stack Upgrade processes multiple blocks per cycle, limited by available input, output space and chisel durability. Speed Upgrades shorten the time between processing cycles.",
                "The Automation Upgrade enables external item insertion into input slots and extraction from output slots. The Reversion Upgrade returns blocks to the first variant in their family and can work without a template.",
                "Upgrades belong in the Auto Chisel's matching upgrade slots. Keep its chisel supplied even when using reversion.");
        addItemGuide(lang, "offset_tool",
                "Ender Offset Wand",
                "Shift connected texture patterns to line them up with your build.",
                "Right click a supported Chisel block with the Ender Offset Wand. The edge of the face you click determines the direction in which the texture shifts.",
                "The wand changes the connected texture offset for the block's chunk. Other textures using that offset in the same chunk can shift too.",
                "Use the highlighted direction as a guide. This changes the texture alignment rather than moving the blocks.");
        addItemGuide(lang, "builders_guide",
                "Builder's Guide",
                "Plan shapes with a ghost block preview and fill them with building materials.",
                "Place the Builder's Guide. With an empty hand, sneak and right click to cycle through shapes such as cuboids, spheres, domes and cylinders.",
                "With an empty hand, right click the north or south face to increase or decrease length, east or west for width, and top or bottom for height. Right click with a block to place material into the preview.",
                "Right click with dye to change the preview color. Adjust the shape and size before filling it.");
        addItemGuide(lang, "measuring_tape",
                "Measuring Tape",
                "Measure block spans before laying out walls, rooms and details.",
                "Right click a block with the Measuring Tape to mark the first point. Right click a different block to mark the second point and display the distance in chat.",
                "The measurement includes both endpoints and uses the largest difference along any axis. After a completed measurement, the next click begins a new one.",
                "Sneak and right click to start again from the block you click. Align both endpoints on one axis to measure a straight span.");
        addItemGuide(lang, "builders_handbook",
                "Builder's Handbook",
                "Browse building advice and instructions for Chisel's items.",
                "Right click with the Builder's Handbook to open it. Click its cover to reach the table of contents, then choose a category and a guide.",
                "Use the arrows to turn pages or browse more entries. All Guides lists every available guide, including entries without a category.",
                "Servers and data packs can supply additional handbook categories and guides.");
        addItemGuide(lang, "palette_builder",
                "Palette Builder",
                "Create and save weighted block palettes for the Trowel.",
                "Right click with the Palette Builder to open your palette library. Create a new palette or choose an existing one to edit its name, icon and block entries.",
                "Add materials, adjust their weights and enable the entries you want to use. The preview shows a possible mixture. Save the palette when you are happy with it.",
                "Hold a Trowel and use the Select Mode / Palette key to choose a saved palette. A palette defines the mix; you still need its materials to build in survival.");
        addItemGuide(lang, "trowel",
                "Trowel",
                "Place a varied mix of blocks from your hotbar or a saved palette.",
                "Right click a block face with the Trowel to place a material. In Hotbar mode it randomly chooses from eligible block slots in your hotbar.",
                "Hold the Select Mode / Palette key, scroll to a saved palette or Hotbar, then release to confirm. A saved palette chooses available materials by weight and draws them from your inventory and offhand.",
                "Sneak and right click an accessible inventory to link it as an additional source for palette mode. Repeat on the same inventory to unlink it. Hotbar mode uses only your hotbar.");
        addItemGuide(lang, "ball_o_moss",
                "Ball O' Moss",
                "Add moss to nearby surfaces for an aged, overgrown look.",
                "Right click to throw a Ball O' Moss. On block impact it adds moss overlays to eligible full blocks around the impact point.",
                "The effect spreads unevenly, creating variation across nearby surfaces. Some blocks are excluded from mossing.",
                "Each throw consumes one ball in survival. Try it on a small area before weathering a larger build.");
        addItemGuide(lang, "cloud_in_a_bottle",
                "Cloud in a Bottle",
                "Create a cluster of cloud blocks around an impact point.",
                "Right click to throw a Cloud in a Bottle at a block. On impact it generates cloud blocks in nearby air spaces.",
                "Clouds spread around the impact point in an irregular shape. Leave open space around the target for the cloud cluster.",
                "Each throw consumes one bottle in survival. Aim where you want the cloud blocks to appear.");
        addItemGuide(lang, "smashing_rock",
                "Smashing Rock",
                "Transform nearby supported blocks into their crushed counterparts.",
                "Right click to throw a Smashing Rock. When it hits a block, it transforms supported blocks around the impact point according to smashing recipes.",
                "The effect varies with distance from the impact. Blocks without a matching smashing recipe remain unchanged.",
                "Each throw consumes one rock in survival. Test on spare materials before using it beside a finished build.");
    }

    private static void addItemGuide(LangHelper lang, String id, String title, String description, String usage, String details, String tip) {
        var key = "chisel.guide." + id;
        lang.add(key + ".title", title);
        lang.add(key + ".description", description);
        lang.add(key + ".usage", usage);
        lang.add(key + ".details", details);
        lang.add(key + ".tip", tip);
    }

    private static void addUnderstandingBlockPalettes(LangHelper lang) {
        var key = "chisel.guide.understanding_block_palettes";
        lang.add("%s.title".formatted(key), "Understanding Block Palettes");
        lang.add("%s.description".formatted(key), "Block palettes turn a group of materials into a reusable building style. Each block has a role and a weight that controls how often it appears.");
        lang.add("%s.roles".formatted(key), "Primary blocks establish the main surface and should appear most often. Secondary blocks add broad variation. Accent blocks create noticeable details, while rare blocks should be used sparingly to draw attention.");
        lang.add("%s.roles_tip".formatted(key), "A block's role explains why it belongs in the palette. Its weight controls how frequently the Mason's Trowel selects it.");
        lang.add("%s.weathered_stone".formatted(key), "Weathered Stone");
        lang.add("%s.weights".formatted(key), "Weights are relative. A block with weight 20 is twice as likely to be selected as a block with weight 10. They do not need to total 100, although totals of 100 are often easier to read.");
        lang.add("%s.variation_tip".formatted(key), "Pure randomness can look noisy. Let the primary material dominate, then use accents and rare blocks to create controlled variation.");
    }
}
