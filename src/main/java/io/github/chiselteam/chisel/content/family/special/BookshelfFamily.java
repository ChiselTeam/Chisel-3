package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class BookshelfFamily {
    public static final ChiselFamily FAMILY = buildBookshelf(BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF));

    private BookshelfFamily() {
    }

    private static ChiselFamily buildBookshelf(BlockBehaviour.Properties properties) {
        String[] woods = {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "cherry", "pale_oak", "bamboo", "crimson", "warped"};
        String[] woodNames = {"Oak", "Spruce", "Birch", "Jungle", "Acacia", "Dark Oak", "Mangrove", "Cherry", "Pale Oak", "Bamboo", "Crimson", "Warped"};
        String[] types = {"abandoned", "brim", "cans", "historian", "hoarder", "necromancer", "necromancer_apprentice", "papers", "rainbow", "tomes"};
        String[] typeNames = {"Abandoned", "Brim", "Cans", "Historian", "Hoarder", "Necromancer", "Necromancer Apprentice", "Papers", "Rainbow", "Tomes"};

        return ChiselFamily.build("bookshelf", builder -> {
            builder.defaults(variant -> variant.properties(properties).model(ChiselModelHandlers.BOOKSHELF))
                    .existingBlock(Blocks.BOOKSHELF);
            for (int wood = 0; wood < woods.length; wood++) {
                for (int type = 0; type < types.length; type++) {
                    String description = switch (types[type]) {
                        case "abandoned" -> "Abandoned Bookshelf";
                        case "brim" -> "Bookshelf filled to the brim with boring Pastel Books";
                        case "historian" -> "Historian's Bookshelf";
                        case "hoarder" -> "Hoarder's Bookshelf";
                        case "necromancer" -> "Necromancer's Bookshelf";
                        case "necromancer_apprentice" -> "Necromancer’s Apprentice Bookshelf";
                        case "rainbow" -> "Bookshelf with Rainbow Books";
                        case "tomes" -> "Bookshelf with Red Tomes";
                        default -> typeNames[type];
                    };
                    String variant = "bookshelf_%s_%s".formatted(woods[wood], types[type]);
                    String blockName = "%s Bookshelf".formatted(woodNames[wood]);
                    var texture = Chisel.prefix("block/bookshelf/bookshelf_%s".formatted(types[type]));
                    builder.variant(variant, settings -> settings.blockName(blockName)
                            .description(description).texture("horizontal_none", texture));
                }
            }
        });
    }
}
