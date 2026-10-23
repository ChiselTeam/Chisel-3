package io.github.chiselteam.chisel.datagen.lang;

public final class HandbookLang {

    private LangHelper lang;

    private HandbookLang() {
    }

    public static void addTranslations(LangHelper lang) {
        addGeneralGuideTranslations(lang);
        addUnderstandingBlockPalettes(lang);
        addCategories(lang);
        addItemGuides(lang);
        addBlockGuides(lang);
    }

    private static void addGeneralGuideTranslations(LangHelper lang) {
        lang.add("chisel.guide.default_palette.usage", "This starter palette is included in your palette library. Select it with a Trowel to build with this mix, or open it in the Palette Builder to adjust the materials and weights.");
        lang.add("chisel.guide.default_palette.wall_tip", "This wall shows a fixed example of the material proportions. Drag to rotate, Shift-drag to pan, scroll to zoom, and double-click to reset. Your Trowel places a fresh random mix using the materials you have available.");
        lang.add("chisel.guide.default_palette.materials", "Materials and Weights");
        lang.add("chisel.handbook.recipe.shaped", "Crafting");
        lang.add("chisel.handbook.recipe.shapeless", "Shapeless");
        lang.add("chisel.handbook.recipe.unavailable", "Recipe unavailable");
        lang.add("chisel.handbook.bookmark.save", "Mark Page");
        lang.add("chisel.handbook.bookmark.saved", "Page Marked");
        lang.add("chisel.handbook.bookmark.open", "Read Bookmark");
        lang.add("chisel.handbook.bookmark.missing", "No saved bookmark, or its guide is unavailable.");
        lang.add("chisel.handbook.structure.example", "Inspect this corner: drag to rotate, Shift-drag to pan, scroll to zoom, and double-click to reset.");
        lang.add("chisel.handbook.image.example", "Use illustrations to plan a mood: this warm sky pairs sandy stone with pale highlights and cool blue accents.");
        lang.add("chisel.builders_handbook.title", "Builders Handbook");
        lang.add("chisel.builders_handbook.contents", "Table of Contents");
        lang.add("chisel.builders_handbook.intro", "This book is meant to serve as inspiration for your builds, as well as helpful entries to take your builds to the next level!");
        lang.add("chisel.builders_handbook.empty", "There are no handbook entries available");
    }

    private static void addCategories(LangHelper lang) {
        lang.add("chisel.builders_handbook.all_guides", "All Guides");
        lang.add("chisel.builders_handbook.all_guides.description", "Browse every category.");
        lang.add("chisel.builders_handbook.guides", "Guides");

        addCategory(lang, "getting_started", "Getting Started", "Learn the basic concepts of what makes a great builder.");
        addCategory(lang, "palettes", "Palettes", "A guide on adding textures to your builds.");
        addCategory(lang, "items", "Chisel Tools", "Learn about all the helpful items / tools Chisel adds.");
        addCategory(lang, "blocks", "Chisel Blocks", "Custom blocks that Chisel adds.");
    }

    private static void addCategory(LangHelper lang, String category, String title, String description) {
        lang.add("chisel.handbook.category.%s.title".formatted(category), title);
        lang.add("chisel.handbook.category.%s.description".formatted(category), description);
    }

    private static void addItemGuides(LangHelper lang) {
        addItemGuide(lang, "chisels",
                "Chisels",
                "Choose decorative variants and change blocks in world. The main tool.",
                "Right click with any Chisel to open its GUI. Put a supported block in the Chisel slot, then choose a variant from the list. Shift + click to chisel multiple stacks",
                "Left click a supported block in the world to chisel it. Leave a selected block in the Chisel Slot to chisel to that variant. Holding Shift, Select Mode / Palette key, then release to confirm selection.",
                "Chiseling uses durability. Can be disabled in server configs.");
                
        addItemGuide(lang, "auto_chisel",
                "Auto Chisel",
                "Automatically Chisels for you",
                "Right click to open, add a chisel to its tool slot and a Chiseled block to the slot above.",
                "The machine auto chisel inputed blocks to the selected variants thats in the center slot. Results goes to right side",
                "Install upgrades to the machine to enable Automation, chisel Stack size, chiseling speed, and reversing to revert back to base block");

        addItemGuide(lang, "auto_chisel_upgrades",
                "Auto Chisel Upgrades",
                "Enables Auto Chisel with Stack, Speed, Automation and Reversion.",
                "The Stack Upgrade processes a full stack per cycle. Speed Upgrades shortens processing time. Automation enables items being piped in. Reversion processes block back to the base block.",
                "The Automation Upgrade enables external item insertion into input slots and extraction from output slots. The Reversion Upgrade returns blocks to the first variant in their family and can work without a template.",
                "Upgrades belong in the Auto Chisel's matching upgrade slots.");

        addItemGuide(lang, "offset_tool",
                "Ender Offset Wand",
                "Moves multiblock textures.",
                "Right click a supported Chisel block with the Ender Offset Wand. Supported blocks will have a triangle like overlay",
                "The wand moves the textures for all block's in a minecraft chunk.",
                "Use the highlighted direction as a guide. This shifts the texture, not the block itself.");

        addItemGuide(lang, "builders_guide",
                "Builder's Guide",
                "Builds simple shapes with any block",
                "Place the Builder's Guide. With an empty hand, sneak and right click to cycle through shapes such as cuboids, spheres, domes and cylinders.",
                "With an empty hand, right click the north or south face to increase or decrease length, east or west for width, and top or bottom for height. Right click with a block to place material into the preview.",
                "Right click with dye to change the preview color. Adjust the shape and size before filling it.");

        addItemGuide(lang, "measuring_tape",
                "Measuring Tape",
                "Measure block distance between 2 points",
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
                "Create and save block palettes for the Trowel",
                "Right click with the Palette Builder to open your palette library. Create a new palette or choose an existing one to edit its name, icon and block entries.",
                "Add materials, adjust their weights and enable the entries you want to use. The preview shows a possible mixture. Save the palette when you are happy with it.",
                "Hold a Trowel and use the Select Mode / Palette key to choose a saved palette. A palette defines the mix; you still need its materials to build in survival.");
        
        addItemGuide(lang, "trowel",
                "Trowel",
                "Places blocks from your hotbar or palette randomly",
                "Right click a block face with the Trowel to place a material. In Hotbar mode it randomly chooses from eligible block slots in your hotbar.",
                "Hold the Select Mode / Palette key, scroll to a saved palette or Hotbar, then release to confirm. A saved palette chooses available materials by weight and draws them from your inventory and offhand.",
                "Sneak and right click an accessible inventory to link it as an additional source for palette mode. Repeat on the same inventory to unlink it. Hotbar mode uses only your hotbar.");

        addItemGuide(lang, "ball_o_moss",
                "Ball O' Moss",
                "Adds a moss overlay on blocks in a AOE",
                "Right click to throw a Ball O' Moss. On block impact it adds a moss overlay to full blocks in a AOE.",
                "The effect spreads unevenly, creating variation across nearby surfaces.",
                "Item is used each throw. Use on a small area before using it in a large build.");

        addItemGuide(lang, "cloud_in_a_bottle",
                "Cloud in a Bottle",
                "Create Cloud Blocks in a AOE",
                "Right click to throw a Cloud in a Bottle. On impact it generates Cloud Blocks using the air blocks.",
                "Clouds spread around the impact point in an random shape. Use in a large open space to min max Cloud Blocks.",
                "Item is used each throw. Aim where you want the Cloud Blocks to appear.");

        addItemGuide(lang, "smashing_rock",
                "Smashing Rock",
                "Transform nearby supported blocks into their crushed counterparts.",
                "Right click to throw a Smashing Rock. When it hits a block, it transforms supported blocks.",
                "Effect varies. For example, Stone bricks > Cracked Stone Bricks. Stone > Cobblestone > Gravel > Sand",
                "Item is used each throw.");
    }

    private static void addBlockGuides(LangHelper lang) {
        lang.add("chisel.guide.cloud.title", "Cloud");
        lang.add("chisel.guide.cloud.description", "Soft cloud blocks for airy builds and floating forms.");
        lang.add("chisel.guide.cloud.usage", "Throw a Cloud in a Bottle at a block to create nearby cloud blocks, then use a Chisel to choose a decorative variant.");
        lang.add("chisel.guide.chisel_concrete.title", "Chisel Concrete / Asphalt");
        lang.add("chisel.guide.chisel_concrete.description", "Concrete and asphalt surfaces for roads and modern builds.");
        lang.add("chisel.guide.chisel_concrete.usage", "Smelt gravel in a furnace to make Chisel Concrete. Use a Chisel to select asphalt, concrete blocks or weathered variants.");
        lang.add("chisel.guide.energized_voidstone.title", "Energized Voidstone");
        lang.add("chisel.guide.energized_voidstone.description", "Decorative voidstone for otherworldly builds.");
        lang.add("chisel.guide.factory.title", "Factory");
        lang.add("chisel.guide.factory.description", "Industrial surfaces for workshops and machinery.");
        lang.add("chisel.guide.fantasy.title", "Fantasy");
        lang.add("chisel.guide.fantasy.description", "Fantasy blocks in base, purple, green, blue and red families.");
        lang.add("chisel.guide.futura.title", "Futura");
        lang.add("chisel.guide.futura.description", "Futuristic surfaces for control rooms and advanced machinery.");
        lang.add("chisel.guide.grimstone.title", "Grimstone");
        lang.add("chisel.guide.grimstone.description", "Dark masonry for imposing walls and moody interiors.");
        lang.add("chisel.guide.hex_plating.title", "Hex Plating");
        lang.add("chisel.guide.hex_plating.description", "Hexagonal plating for industrial floors and walls.");
        lang.add("chisel.guide.holystone.title", "Holystone");
        lang.add("chisel.guide.holystone.description", "Decorative stone for temples, towers and monuments.");
        lang.add("chisel.guide.kitchen.title", "Kitchen");
        lang.add("chisel.guide.kitchen.description", "Patterned surfaces for kitchens and tiled interiors.");
        lang.add("chisel.guide.laboratory.title", "Laboratory");
        lang.add("chisel.guide.laboratory.description", "Clean patterned blocks for laboratories and research rooms.");
        lang.add("chisel.guide.lavastone.title", "Lavastone");
        lang.add("chisel.guide.lavastone.description", "Lava-inspired blocks for dramatic surfaces.");
        lang.add("chisel.guide.limestone.title", "Limestone");
        lang.add("chisel.guide.limestone.description", "Decorative limestone for masonry and architectural details.");
        lang.add("chisel.guide.limestone.usage", "Use a Chisel on limestone to choose a decorative variant for your build.");
        lang.add("chisel.guide.liminal.title", "Liminal");
        lang.add("chisel.guide.liminal.description", "You fallen into the backrooms...");
        lang.add("chisel.guide.marble.title", "Marble");
        lang.add("chisel.guide.marble.description", "Decorative marble for polished interiors and monuments.");
        lang.add("chisel.guide.marble.usage", "Use a Chisel on marble to choose a decorative variant for your build.");
        lang.add("chisel.guide.military.title", "Military");
        lang.add("chisel.guide.military.description", "Military style blocks for bases and fortified builds.");
        lang.add("chisel.guide.mossy_temple.title", "Mossy Temple");
        lang.add("chisel.guide.mossy_temple.description", "Mossy masonry for overgrown ruins and ancient temples.");
        lang.add("chisel.guide.nexus.title", "Nexus");
        lang.add("chisel.guide.nexus.description", "Decorative blocks for futuristic builds.");
        lang.add("chisel.guide.paperwall.title", "Paperwall");
        lang.add("chisel.guide.paperwall.description", "Paperwall panels for room dividers and decorative interiors.");
        lang.add("chisel.guide.road_lines.title", "Road Lines");
        lang.add("chisel.guide.road_lines.description", "Road markings for streets, lanes and intersections.");
        lang.add("chisel.guide.shingles.title", "Shingles");
        lang.add("chisel.guide.shingles.description", "Shingle blocks for rooftops and exterior details.");
        lang.add("chisel.guide.technical.title", "Technical");
        lang.add("chisel.guide.technical.description", "Technical panels for machinery and industrial builds.");
        lang.add("chisel.guide.temple.title", "Temple");
        lang.add("chisel.guide.temple.description", "Decorative masonry for temples and ancient structures.");
        lang.add("chisel.guide.tyrian.title", "Tyrian");
        lang.add("chisel.guide.tyrian.description", "Ornamental blocks for bold architectural details.");
        lang.add("chisel.guide.valentines.title", "Valentine's");
        lang.add("chisel.guide.valentines.description", "Decorative blocks for romantic builds and playful accents.");
        lang.add("chisel.guide.voidstone.title", "Voidstone");
        lang.add("chisel.guide.voidstone.description", "Voidstone blocks for mysterious walls and monuments.");
        lang.add("chisel.guide.warning_signs.title", "Warning Signs");
        lang.add("chisel.guide.warning_signs.description", "Hazard markings for factories, laboratories and restricted areas.");
        lang.add("chisel.guide.waterstone.title", "Waterstone");
        lang.add("chisel.guide.waterstone.description", "Water-inspired blocks for decorative surfaces.");
        lang.add("chisel.guide.lights.description", "Lights illuminate builds. Comes in different colors.");
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
