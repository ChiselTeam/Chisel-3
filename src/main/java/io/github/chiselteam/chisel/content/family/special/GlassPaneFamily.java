package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselIronBarsBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GlassPaneFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("glass_pane", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE)).blockName("Glass Pane").model(ChiselModelHandlers.GLASS_PANE))
            .existingBlock(Blocks.GLASS_PANE)
            .variant("glass_pane_borderless", v -> v.description("Borderless Glass Pane").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("glass_pane_bubble", v -> v.description("Bubble Glass Pane").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_bubble"))
                    .texture("top", Chisel.prefix("block/glass_pane/glass_pane_bubble-top")))
            .variant("glass_pane_chinese", v -> v.description("Chinese Glass Pane").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_chinese"))
                    .texture("top", Chisel.prefix("block/glass_pane/glass_pane_chinese-top")))
            .variant("glass_pane_chinese_gold", v -> v.description("Chinese Glass Pane with Golden Frame").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_chinese_2"))
                    .texture("top", Chisel.prefix("block/glass_pane/glass_pane_chinese_gold-top")))
            .variant("glass_pane_japanese", v -> v.description("Japanese Glass Pane").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_japanese"))
                    .texture("top", Chisel.prefix("block/glass_pane/glass_pane_japanese-top")))
            .variant("glass_pane_japanese2", v -> v.description("Ornate Japanese Glass Pane").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_japanese_2"))
                    .texture("top", Chisel.prefix("block/glass_pane/glass_pane_japanese-top")))
            .variant("glass_pane_streak", v -> v.description("Streak Glass Pane").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_streak"))
                    .texture("top", Chisel.prefix("block/magma/magma_dent-ctm_cornerless"))));

    private GlassPaneFamily() {
    }
}
