package io.github.chiselteam.chisel.datagen.lang;

public final class HandbookLang {

    private LangHelper lang;

    private HandbookLang() {
    }

    public static void addTranslations(LangHelper lang) {
        addGeneralGuideTranslations(lang);
        GettingStartedLang.addTranslations(lang);
        addCategories(lang);
        addItemGuides(lang);
        addBlockGuides(lang);
    }

    private static void addGeneralGuideTranslations(LangHelper lang) {
        lang.add("chisel.guide.default_palette.usage", "Fancy this mix? It's already waiting in your palette library. Select it with a Trowel and get building, or open it with the Palette Brush to swap materials and make it your own.");
        lang.add("chisel.guide.default_palette.wall_tip", "Take this sample wall for a spin! Drag to rotate, Shift-drag to pan, scroll to zoom, and double-click to reset. It shows the material proportions; your Trowel rolls a fresh mix from the materials you have available.");
        lang.add("chisel.guide.default_palette.materials", "Materials and Weights");
        lang.add("chisel.handbook.recipe.shaped", "Crafting");
        lang.add("chisel.handbook.recipe.shapeless", "Shapeless");
        lang.add("chisel.handbook.recipe.unavailable", "Recipe unavailable");
        lang.add("chisel.handbook.bookmark.save", "Mark Page");
        lang.add("chisel.handbook.bookmark.saved", "Page Marked");
        lang.add("chisel.handbook.bookmark.open", "Read Bookmark");
        lang.add("chisel.handbook.bookmark.missing", "No saved bookmark, or its guide is unavailable.");
        lang.add("chisel.handbook.structure.example", "Take a peek from every angle: drag to rotate, Shift-drag to pan, scroll to zoom, and double-click to reset.");
        lang.add("chisel.handbook.image.example", "A little inspiration goes a long way. Borrow this warm sky's colors: sandy stone, pale highlights and a splash of cool blue. Instant holiday cottage?");
        lang.add("chisel.builders_handbook.title", "Builder's \nHandbook");
        lang.add("chisel.builders_handbook.contents", "Table of Contents");
        lang.add("chisel.builders_handbook.intro", "Got a pile of blocks and a big idea? Let's build something! Meet Chisel's tools, try a new palette and pick up a few tricks for making your next place feel like home.");
        lang.add("chisel.builders_handbook.empty", "No guides here yet. Your next building adventure is still getting its pages together!");
    }

    private static void addCategories(LangHelper lang) {
        lang.add("chisel.builders_handbook.all_guides", "All Guides");
        lang.add("chisel.builders_handbook.all_guides.description", "Have a browse and find your next building idea.");
        lang.add("chisel.builders_handbook.guides", "Guides");

        addCategory(lang, "getting_started", "Getting Started", "Start small, try a few tricks and make a build you love.");
        addCategory(lang, "palettes", "Palettes", "Find blocks that get along, then give your walls some personality.");
        addCategory(lang, "items", "Chisel Tools", "Meet your new building buddies, from trusty chisels to bottled clouds.");
        addCategory(lang, "blocks", "Chisel Blocks", "Go block shopping for your next big idea.");
    }

    private static void addCategory(LangHelper lang, String category, String title, String description) {
        lang.add("chisel.handbook.category.%s.title".formatted(category), title);
        lang.add("chisel.handbook.category.%s.description".formatted(category), description);
    }

    private static void addItemGuides(LangHelper lang) {
        addItemGuide(lang, "chisels",
                "Chisels",
                "One trusty tool, a whole new wardrobe for your blocks.",
                "Right click with a Chisel to open it. Pop a supported block in the Chisel slot and pick a decorative variant. Shift-click to give multiple stacks the same makeover.",
                "Want to work on the wall itself? Left click a supported block to chisel it in place. Leave a chosen block in the Chisel slot to use that variant. Hold Shift and the Select Mode / Palette key, then release to confirm your mode.",
                "Even trusty tools get tired: chiseling uses durability unless the server config disables it. Keep an eye on your Chisel while decorating.");
                
        addItemGuide(lang, "auto_chisel",
                "Auto Chisel",
                "Give your chiseling arm a break. This machine takes the next shift.",
                "Right click to open the Auto Chisel. Give it a Chisel in the tool slot and feed your building blocks into the input above.",
                "Put the variant you want in the center template slot. The machine chisels matching input blocks into that look and sends the results to the right. A fresh batch of fancy blocks, coming up!",
                "Planning a bigger project? Stack, Speed, Automation and Reversion Upgrades give this little workshop more ways to help.");

        addItemGuide(lang, "auto_chisel_upgrades",
                "Auto Chisel Upgrades",
                "Help your Auto Chisel keep up with those castle-sized plans.",
                "Stack processes a full stack per cycle, and Speed shortens the wait. Automation lets other inventories feed the machine and collect its output. Reversion takes blocks back to their family's first variant.",
                "Ready for a production line? Automation enables external insertion into input slots and extraction from output slots. Reversion can work without a template, which is handy when your spare blocks need a fresh start.",
                "Every upgrade has a home: pop it into the matching upgrade slot in the Auto Chisel.");

        addItemGuide(lang, "offset_tool",
                "Ender Offset Wand",
                "Nudge a big pattern until it sits just right. A little wand magic!",
                "Right click a supported Chisel block with the Ender Offset Wand. A triangular overlay shows where you can shift its multiblock texture.",
                "The wand shifts textures across the chunk, so step back and check the whole pattern after a nudge.",
                "Follow the highlighted direction to line things up. Your blocks stay put while their textures do the shuffling.");

        addItemGuide(lang, "builders_guide",
                "Builder's Guide",
                "Big dome dreams? Sketch the shape before hauling all those blocks.",
                "Place the Builder's Guide. With an empty hand, sneak and right click to cycle through cuboids, spheres, domes and cylinders. Pick a shape that suits your grand plan.",
                "With an empty hand, right click the north or south face to adjust length, east or west for width, and top or bottom for height. Once the outline looks right, right click with a block to place material into the preview.",
                "Can't see your outline clearly? Right click with dye to change its color. Set the shape and size before filling your masterpiece.");

        addItemGuide(lang, "measuring_tape",
                "Measuring Tape",
                "Settle the age-old question: will that roof actually fit?",
                "Right click a block with the Measuring Tape to mark your starting point. Right click another block and check chat for the distance. Much easier than counting windows and losing your place.",
                "Both endpoints count, and the measurement follows the largest difference along any axis. Once you've measured a span, your next click starts a new one.",
                "Sneak and right click to start again at that block. For a straight span, line both endpoints up on one axis. Measure twice, rebuild less!");

        addItemGuide(lang, "builders_handbook",
                "Builder's Handbook",
                "A pocketful of ideas for the moment you stare at a wall and think, 'Now what?'",
                "Right click with the Builder's Handbook, then click the cover to open the table of contents. Pick a category and follow whichever idea catches your eye.",
                "Use the arrows to turn pages or browse more entries. All Guides gathers every available guide, even ones without a category. Mark a favorite page with the bookmark so it's easy to come back.",
                "There's room for more inspiration: servers and data packs can add their own categories and guides.");

        addItemGuide(lang, "palette_builder",
                "Palette Brush",
                "A paint box for your blocks. Stir up a mix, try it on a wall and save your favorite recipe!",
                "Right click with the Palette Brush to open your library. Pick New palette for a fresh start, or open a starter mix and give it your own twist. Name it something you'll recognize when it's time to build.",
                "Shop for blocks on the left: search by name or use the color filters, then click a block to add it. On the right, adjust each entry's weight or switch it Off to audition the mix without removing it.",
                "Click Save when your mix makes you smile. Hold a Trowel, hold the Select Mode / Palette key, scroll to your saved palette and release. Bring the materials in survival; the palette remembers the recipe, and you supply the ingredients.");
        lang.add("chisel.guide.palette_builder.screenshot", "Your little mixing studio: block shopping on the left, a sample wall above your weighted ingredients on the right. This is the Weathered Castle starter mix, ready for a makeover.");
        lang.add("chisel.guide.palette_builder.weights", "More weight means more chances to appear. A weight of 20 is twice as likely as 10; the numbers don't need to total 100. Try mostly stone bricks with a little cobblestone and a pinch of moss. The percentages help you see the balance.");
        lang.add("chisel.guide.palette_builder.preview", "Take your wall for a spin: drag to rotate, Shift-drag to move, scroll to zoom and double-click to reset. Click Shuffle for another arrangement. Like the ingredients but want the moss beside a doorway? Place that special detail by hand.");
        
        addItemGuide(lang, "trowel",
                "Trowel",
                "Give your walls a happy shuffle, one block at a time.",
                "Right click a block face with the Trowel to place a material. In Hotbar mode, it picks randomly from eligible block slots in your hotbar. Load a few favorites and see what turns up!",
                "For a saved mix, hold the Select Mode / Palette key, scroll to a palette and release to confirm. The Trowel picks available materials by weight from your inventory and offhand. Choose Hotbar the same way whenever you fancy a change.",
                "Big wall, small pockets? Sneak and right click an accessible inventory to link extra materials for palette mode. Repeat on that inventory to unlink it. Hotbar mode draws only from your hotbar.");

        addItemGuide(lang, "ball_o_moss",
                "Ball O' Moss",
                "Instant 'this ruin has been here for ages' energy.",
                "Right click to throw a Ball O' Moss. When it hits a block, it adds a moss overlay to nearby full blocks. Your garden wall just got a little more garden.",
                "The moss spreads unevenly, giving nearby surfaces a patchy, overgrown look. Lovely for old ruins or that corner the gardener keeps forgetting.",
                "Each throw uses one Ball O' Moss. Try a small patch first to see how much wilderness your wall wants.");

        addItemGuide(lang, "cloud_in_a_bottle",
                "Cloud in a Bottle",
                "A little weather in your pocket. Forecast: fluffy.",
                "Right click to throw a Cloud in a Bottle at a block. On impact, nearby air fills with Cloud Blocks. An airy decoration, delivered with a splash.",
                "Each cloud takes a random shape around the impact point. Give it plenty of open air to puff out into, then see what the sky has cooked up.",
                "Each throw uses one bottle. Aim where you want the cloud to gather, and leave room for a little surprise.");

        addItemGuide(lang, "smashing_rock",
                "Smashing Rock",
                "For when your stonework could use a little less perfection.",
                "Right click to throw a Smashing Rock. On block impact, it transforms nearby supported blocks into their rougher or crushed counterparts. A very direct approach to weathering!",
                "What happens depends on the block: stone bricks become cracked stone bricks, while stone can go through cobblestone, gravel and sand. Try a small sample to find the finish you like.",
                "Each throw uses one Smashing Rock. Give your sample a look between throws; that charming old wall may only need one good bonk.");
    }

    private static void addBlockGuides(LangHelper lang) {
        lang.add("chisel.guide.cloud.title", "Cloud");
        lang.add("chisel.guide.cloud.description", "Put a little fluff in your skyline. Floating daydreams start here.");
        lang.add("chisel.guide.cloud.usage", "Throw a Cloud in a Bottle at a block to puff nearby air into cloud blocks. Then grab a Chisel and pick a decorative variant for your own little piece of sky.");
        lang.add("chisel.guide.chisel_concrete.title", "Chisel Concrete / Asphalt");
        lang.add("chisel.guide.chisel_concrete.description", "From fresh city streets to well-traveled roads, give your town somewhere to go.");
        lang.add("chisel.guide.chisel_concrete.usage", "Pop gravel in a furnace to make Chisel Concrete, then use a Chisel to pick asphalt, concrete blocks or a weathered finish. Your next street is one batch away.");
        lang.add("chisel.guide.energized_voidstone.title", "Energized Voidstone");
        lang.add("chisel.guide.energized_voidstone.description", "Give your otherworldly hideout a little extra spark.");
        lang.add("chisel.guide.factory.title", "Factory");
        lang.add("chisel.guide.factory.description", "Dress your workshop like it means business. The lunch break is up to you.");
        lang.add("chisel.guide.fantasy.title", "Fantasy");
        lang.add("chisel.guide.fantasy.description", "Build a storybook setting in base, purple, green, blue or red. Every castle deserves an outfit.");
        lang.add("chisel.guide.futura.title", "Futura");
        lang.add("chisel.guide.futura.description", "Tomorrow's control room, ready to build today. Bring your best spaceship ideas.");
        lang.add("chisel.guide.grimstone.title", "Grimstone");
        lang.add("chisel.guide.grimstone.description", "For towers with a dramatic entrance and rooms that enjoy a little mystery.");
        lang.add("chisel.guide.hex_plating.title", "Hex Plating");
        lang.add("chisel.guide.hex_plating.description", "Six sides, plenty of possibilities. Give a workshop floor a satisfying new pattern.");
        lang.add("chisel.guide.holystone.title", "Holystone");
        lang.add("chisel.guide.holystone.description", "Think grand temples, soaring towers and a monument to your favorite pet chicken.");
        lang.add("chisel.guide.kitchen.title", "Kitchen");
        lang.add("chisel.guide.kitchen.description", "Cook up a cozy kitchen with tiles that look good even when dinner is late.");
        lang.add("chisel.guide.laboratory.title", "Laboratory");
        lang.add("chisel.guide.laboratory.description", "A fresh, tidy home for your next brilliant experiment. Lab coat optional.");
        lang.add("chisel.guide.lavastone.title", "Lavastone");
        lang.add("chisel.guide.lavastone.description", "Give your walls a lava-inspired look and your fortress a dramatic welcome.");
        lang.add("chisel.guide.limestone.title", "Limestone");
        lang.add("chisel.guide.limestone.description", "Lovely limestone for a little courtyard, a grand facade or whatever you're dreaming up.");
        lang.add("chisel.guide.limestone.usage", "Grab a Chisel and give limestone a new look. Try a few variants beside your doorway; a little stone shopping can change the whole entrance.");
        lang.add("chisel.guide.liminal.title", "Liminal");
        lang.add("chisel.guide.liminal.description", "That hallway looks familiar... Build your own backrooms and remember where you put the exit.");
        lang.add("chisel.guide.marble.title", "Marble");
        lang.add("chisel.guide.marble.description", "Treat your floor, foyer or favorite monument to a little marble elegance.");
        lang.add("chisel.guide.marble.usage", "Use a Chisel to browse marble's decorative variants. Try one as a floor, a column or a bit of trim. Even a tiny foyer can feel rather grand.");
        lang.add("chisel.guide.military.title", "Military");
        lang.add("chisel.guide.military.description", "Kit out a sturdy base, then give the lookout somewhere nice to stand.");
        lang.add("chisel.guide.mossy_temple.title", "Mossy Temple");
        lang.add("chisel.guide.mossy_temple.description", "Let the greenery move in. These ruins have had plenty of time to get cozy.");
        lang.add("chisel.guide.nexus.title", "Nexus");
        lang.add("chisel.guide.nexus.description", "Give your next futuristic base the kind of walls a spaceship would envy.");
        lang.add("chisel.guide.paperwall.title", "Paperwall");
        lang.add("chisel.guide.paperwall.description", "Make a quiet corner, divide a room and give your tea table a lovely backdrop.");
        lang.add("chisel.guide.road_lines.title", "Road Lines");
        lang.add("chisel.guide.road_lines.description", "Point your town in the right direction with lanes, crossings and tidy intersections.");
        lang.add("chisel.guide.shingles.title", "Shingles");
        lang.add("chisel.guide.shingles.description", "Top off your cozy cottage or give that garden shed a roof worth admiring.");
        lang.add("chisel.guide.technical.title", "Technical");
        lang.add("chisel.guide.technical.description", "Panels for the machine room you've been planning. Looking busy is part of the charm.");
        lang.add("chisel.guide.temple.title", "Temple");
        lang.add("chisel.guide.temple.description", "Build an ancient wonder, then decide which corner deserves the mysterious doorway.");
        lang.add("chisel.guide.tyrian.title", "Tyrian");
        lang.add("chisel.guide.tyrian.description", "Give your doorway a bold frame and your grand hall a little swagger.");
        lang.add("chisel.guide.valentines.title", "Valentine's");
        lang.add("chisel.guide.valentines.description", "Build a sweetheart cottage or add a playful touch to a room you love.");
        lang.add("chisel.guide.voidstone.title", "Voidstone");
        lang.add("chisel.guide.voidstone.description", "A little mystery for your walls. What lives in that tower is entirely up to you.");
        lang.add("chisel.guide.warning_signs.title", "Warning Signs");
        lang.add("chisel.guide.warning_signs.description", "Give your questionable experiments a proper warning sign. Very professional.");
        lang.add("chisel.guide.waterstone.title", "Waterstone");
        lang.add("chisel.guide.waterstone.description", "Bring a water-inspired pattern to a bathhouse, fountain surround or seaside retreat.");
        lang.add("chisel.guide.lights.description", "Give your favorite corner its moment in the spotlight, with colors to suit the mood.");
        lang.add("chisel.guide.antiblock.title", "Antiblock");
        lang.add("chisel.guide.antiblock.description", "Play with bold color and give your next room a look all its own.");
        lang.add("chisel.guide.steampunk.title", "Steampunk");
        lang.add("chisel.guide.steampunk.description", "Gears, pipes and rusty plating for a workshop with wonderfully big ambitions.");
    }

    private static void addItemGuide(LangHelper lang, String id, String title, String description, String usage, String details, String tip) {
        var key = "chisel.guide." + id;
        lang.add(key + ".title", title);
        lang.add(key + ".description", description);
        lang.add(key + ".usage", usage);
        lang.add(key + ".details", details);
        lang.add(key + ".tip", tip);
    }

}
