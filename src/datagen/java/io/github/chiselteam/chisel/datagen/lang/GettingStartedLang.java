package io.github.chiselteam.chisel.datagen.lang;

final class GettingStartedLang {
    private GettingStartedLang() {
    }

    static void addTranslations(LangHelper lang) {
        planning(lang);
        palettes(lang);
        depth(lang);
        texture(lang);
        details(lang);
        firstBuild(lang);
    }

    private static void add(LangHelper lang, String id, String section, String text) {
        lang.add("chisel.guide." + id + "." + section, text);
    }

    private static void planning(LangHelper lang) {
        var id = "planning_your_build";
        add(lang, id, "title", "Planning Your Build");
        add(lang, id, "description", "A few rough walls now can save a lot of pickaxe work later.");
        add(lang, id, "goal", "Let's give your workshop room for more than a crafting table and your elbows.");
        add(lang, id, "purpose", "What goes inside? For our workshop: a crafting table, storage and space to walk between them. Mark a spot 7 blocks wide and 9 deep. With one-block walls, that leaves a 5 by 7 interior. A simple rectangle is a perfectly good start.");
        add(lang, id, "footprint", "Here's the plan from above. Gray is the wall, cyan is your walking route, yellow is the workbench and orange is storage. The colors are just planning marks. Keep that cyan route clear and you can get to everything.");
        add(lang, id, "compare", "Same width, different amounts of elbow room. Both shells below are 7 blocks wide with three-block walls. The left is 5 blocks deep; the right is 9. The little one could make a nice kiosk. The longer one has room to spread out your workshop.");
        add(lang, id, "silhouette", "Pop a roof on the deeper shell and it starts looking like a building. This stepped gable sticks out one block past the walls. Try its height beside your neighbors, and leave yourself some headroom. A flat roof or a lower pitch could work here too.");
        add(lang, id, "all_sides", "Take a lap. Does the entrance face where people arrive? Does the back look finished? Drop a workbench and storage inside, then walk between them. If it feels cramped, move a wall now, before you've fallen in love with the flower boxes.");
        add(lang, id, "practice", "Grab some spare blocks and rough out your own workshop. Give it three-block walls, a two-block-high entrance and a temporary roof. Wander through it. Move things around until it feels useful; the fancy bits can wait.");
        add(lang, id, "check", "Before decorating, take one more lap: an easy-to-find door, room to work, and a roof that looks good from the back as well as the front. Happy with all three? Time to pick some materials.");
        add(lang, id, "transfer", "Fancy a different look? Keep the workbench and storage, but try a flat-roofed studio or a sturdy little shed. See how the same space can feel like a whole new place. Up next: Understanding Block Palettes.");
    }

    private static void palettes(LangHelper lang) {
        var id = "understanding_block_palettes";
        add(lang, id, "title", "Understanding Block Palettes");
        add(lang, id, "description", "Find a handful of blocks that look happy living next to each other.");
        add(lang, id, "goal", "That block you love in your hotbar? Let's find out whether it gets along with the wall.");
        add(lang, id, "roles", "Give your materials a job. Your primary block covers the main surface. Supporting blocks might make the base or roof. An accent picks out something special, like a doorway. A rare little detail can be lovely too; it doesn't have to turn up on every wall.");
        add(lang, id, "roles_tip", "A block's job and its random weight are different things. A high weight makes a tool pick it more often. It won't know that you wanted all those accents around the front door.");
        add(lang, id, "compare", "These windows have the same shape and glass, but a different wardrobe. Left: oak walls, stone-brick base, spruce trim. Right: smooth quartz, polished deepslate and cyan. Which would you use for a cozy workshop? How about a bright modern studio?");
        add(lang, id, "hue", "Color sets the mood. Warm wood and cool cyan take a build in different directions. Put a few blocks together at your actual building site; inventory icons don't tell the whole story.");
        add(lang, id, "contrast", "Light and dark help parts stand apart. Spruce outlines pale oak, and deepslate gives bright quartz a strong base. If your frame disappears into the wall, try a lighter or darker block before making the frame bigger.");
        add(lang, id, "density", "Some textures are busy; others give your eyes a rest. Cobblestone brings lots of little edges, while smoother blocks make quieter patches. Stand back to see how they mix. You don't need a magic number of blocks or a perfect percentage.");
        add(lang, id, "weathered_stone", "A Weathered Stone Mix");
        add(lang, id, "weights", "Here's one mix to play with. Weights are relative: 20 has twice the selection weight of 10, and they don't need to add up to 100. They choose how often a block comes up, so place important repairs and accents yourself.");
        add(lang, id, "variation_tip", "A saved palette remembers the mix, but you'll still need to bring the blocks. Chisel Tools: Palette Brush and Trowel covers saving and using it.");
        add(lang, id, "practice", "Make a little wall with a main material, a base and a bit of trim. Swap just the base, then step back. Better? Worse? Weirdly perfect? Keep the version you like.");
        add(lang, id, "check", "Give it a glance from walking distance. You should still be able to spot the main surface and that special accent. If everything is shouting for attention, give one material a little more room.");
        add(lang, id, "transfer", "Take your wooden workshop's palette shopping for a modern studio: a pale wall, a dark base and a splash of color. Same jobs, different blocks. Up next: Adding Shape and Depth.");
    }

    private static void depth(LangHelper lang) {
        var id = "adding_shape_and_depth";
        add(lang, id, "title", "Adding Shape and Depth");
        add(lang, id, "description", "A block forward or back can give a plain window a whole new look.");
        add(lang, id, "goal", "Let's see what happens when a window stops sitting flush with the wall.");
        add(lang, id, "plane", "Picture the front of a wall as a flat sheet. Put something behind it and you've made a recess; bring something forward and it sticks out. Our little sample is five blocks wide and five tall, with a window one block wide and two tall.");
        add(lang, id, "compare", "Left to right: flat glass, glass moved one block back, then the same recess with a frame in front. Spin them around and peek from the side. The wall stays put, so it's easier to spot what each change does.");
        add(lang, id, "recess", "The middle window only moves those two glass blocks back. From an angle, you can now see the edges of the opening. A tiny change makes the wall feel thicker.");
        add(lang, id, "frame", "The right window keeps that recess and adds a spruce ring one block in front of the wall. Now the window gets a little spotlight. The close-up below shows the same setup; turn it sideways to see the three layers.");
        add(lang, id, "edge", "Roofs can play this game too. An overhang sticks out past the wall and gives the roof a clear edge. Try a short strip before doing the whole building, and leave room for doors, paths and neighbors.");
        add(lang, id, "restraint", "You can stop at flat! A smooth modern wall might look great that way. Keep the extra depth where you like what it does. For actual shadows, have a look at the build in your world.");
        add(lang, id, "practice", "Build the flat window and move its glass back one block. Take a look, then put it back. Try again with a frame around the recess. A few blocks and a pickaxe are all you need to audition the options.");
        add(lang, id, "check", "Walk past your window as well as looking straight at it. If it looks good from both directions and nothing sticks into your path, you've found a keeper.");
        add(lang, id, "transfer", "Try a simple recess on a modern studio, or a chunky lintel over a shed door. Leave some flat wall around it so your favorite bit has room to stand out. Up next: Using Texture Intentionally.");
    }

    private static void texture(LangHelper lang) {
        var id = "using_texture_intentionally";
        add(lang, id, "title", "Using Texture Intentionally");
        add(lang, id, "description", "Give your walls a little history, or just a really good pattern.");
        add(lang, id, "goal", "A handful of different blocks can look like an old repair, a smooth fade or a very confused wall. Placement makes the difference.");
        add(lang, id, "types", "Mixing surfaces adds variation. Moving from one color or lightness to another makes a gradient. A patch of worn or mossy blocks can suggest age. Pick the look you're after, then let the arrangement help it along.");
        add(lang, id, "compare", "Here's the same wall three ways: clean bricks, scattered cobblestone, then a grouped patch. The last two both use six cobblestone blocks and nineteen stone bricks. Same ingredients, different arrangement. Which one looks like somebody came back to patch a hole?");
        add(lang, id, "group", "On the right, those six cobblestone blocks gather into a two-by-three patch at the lower left. The close-up below shows it clearly. The scattered version could suit a rough old wall too; it depends on the story you want to tell.");
        add(lang, id, "gradient", "Want a fade instead? This sample climbs from dark deepslate to lighter stone over five rows. The texture changes along with the color. Try a small strip first, and add gentler steps or different blocks if the jump feels too sudden.");
        add(lang, id, "story", "Maybe the base is damp. Maybe a corner got repaired. Maybe the owner keeps meaning to fix that panel. You're suggesting a history with blocks, rather than simulating real weathering. One small patch can do plenty of storytelling.");
        add(lang, id, "practice", "Shuffle nineteen stone bricks and six cobblestone into a five-by-five wall. Now gather the cobblestone into a patch, filling the old spots with bricks. Back up a few steps. Give the patch a new shape if it isn't reading how you hoped.");
        add(lang, id, "check", "If you can still spot the patch or fade from walking distance, it's doing its job. If the wall just looks busy, simplify a little and take another look.");
        add(lang, id, "transfer", "Keep a studio spotless with one neat band, or give a shed a few replacement panels by the service door. Both can have character. Up next: Details and Lighting.");
    }

    private static void details(LangHelper lang) {
        var id = "details_and_lighting";
        add(lang, id, "title", "Details and Lighting");
        add(lang, id, "description", "A welcoming door, a useful lantern and somewhere to put all that stuff.");
        add(lang, id, "goal", "Time for the finishing touches. Let's make the entrance easy to find and easy to get through.");
        add(lang, id, "focus", "Where do you want someone to look first? On our workshop, it's the entrance. A frame and a nearby lantern give it some attention. Let the rest of the wall relax a little so the door stays easy to spot.");
        add(lang, id, "compare", "The entrance on the left has a barrel in the way, two lanterns and a shiny gold strip above the frame. The right clears out the barrel, extra lantern and strip. Same doorway, less fuss. Which one would you rather come home to with a full inventory?");
        add(lang, id, "motif", "Here's the quieter doorway up close: one spruce frame and a lantern beside it. A little matching spruce around selected windows can tie the build together. Put storage where it's handy, with enough room to walk past it. The barrel doesn't need to guard the door.");
        add(lang, id, "lighting", "Pick a fixture that feels at home: a lantern by the wooden workshop, or a simple lamp arrangement for a studio or shed. Place it where the light will help you find the door, use the workbench or follow a path.");
        add(lang, id, "preview", "These previews keep everything bright so you can see the blocks. Check nighttime lighting in your world: a glowing texture may not cast light, and shaders can change the look.");
        add(lang, id, "night", "Come back after sunset and look from the same spot. Can you find the door and see your way inside? Move a fixture if the useful bit is still dark. Start with the ordinary game view, then enjoy any shader extras you like.");
        add(lang, id, "practice", "Add something useful, like storage by the workbench, and a light that fits the building. Then try removing one decoration. Sometimes the finishing touch is picking a block back up. Take a daytime and nighttime wander through the result.");
        add(lang, id, "check", "A door you can spot, a path you can walk and light where you need it: that's a welcoming little build. If a decoration gets in the way, give it a better home.");
        add(lang, id, "transfer", "Give a modern studio a simple frame and compact fixture, or repeat a sturdy support detail on a shed. You can leave a few walls quiet. Up next: Your First Build.");
    }

    private static void firstBuild(LangHelper lang) {
        var id = "your_first_build";
        add(lang, id, "title", "Your First Build");
        add(lang, id, "description", "Let's turn that pile of blocks into a place you'd actually use.");
        add(lang, id, "goal", "One little workshop, plenty of room to make it yours.");
        add(lang, id, "brief", "We'll start with the shape, pick some materials, play with depth, then add texture and finishing touches. Keep a crafting table, storage and a clear way in. The examples are here to borrow from; your workshop can take its own turns.");
        add(lang, id, "shape", "Start with the walls. Mark a 7 by 9 footprint and build three blocks high. Leave a centered doorway one block wide and two tall. You'll have a 5 by 7 interior. Leave side windows and try walking between a workbench and storage. The open shell below gives you a peek inside.");
        add(lang, id, "palette", "Pick an outfit. Oak walls, a stone-brick base and spruce roof or trim make a cozy start. For a modern look, try smooth quartz, polished deepslate and cyan. Put a few blocks together first and see which combination you want to come home to.");
        add(lang, id, "depth", "Give a window some depth. On a separate five-by-five wall, leave a one-wide, two-high opening. Move the glass one block behind the wall, then add a ring of trim one block in front. The close-up below shows how it fits together. Borrow the idea wherever it suits your workshop.");
        add(lang, id, "fade", "Your turn to improvise: give another window or the doorway a look you like. Flat, recessed or framed all work. Keep the materials the same while you try the shapes, and take a peek from the side before choosing.");
        add(lang, id, "texture", "Newly built or a little lived-in? Keep the walls clean, or add a small repair. Our workshop has two replacement wood panels on one side. Step back to see whether yours adds character or steals the show from the entrance.");
        add(lang, id, "details", "Put a roof over it. The example uses a stepped gable with a one-block overhang. Take a lap to see it from every side. Add your workbench, storage and a lantern by the approach, keeping the route clear. Visit after dark too; the preview can't show you the real lighting.");
        add(lang, id, "adapt", "Here's one way it could turn out. Yours might have a different palette, a door around the side or a spotless finish. Swap the workshop interior for cottage furniture if you'd rather live here. Make room for whatever you'll actually do inside.");
        add(lang, id, "practice", "Put the last few blocks on your workshop, then see what else the idea can become. A tiny studio? A garden shed? Keep a detail you love and change the rest to fit its new job.");
        add(lang, id, "check", "Take the grand tour: find the door, walk around inside, admire the back and come by after sunset. If it feels good to use and looks like a place you meant to build, call it home.");
        add(lang, id, "transfer", "Got another idea already? Start with a rough shape and follow it. The other guides are here whenever you want to try a new palette, window or finishing touch. There's always room for one more build.");
    }
}
