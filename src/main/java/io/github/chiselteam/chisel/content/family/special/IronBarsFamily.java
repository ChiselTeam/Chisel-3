package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselIronBarsBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class IronBarsFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("iron_bars", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)).blockName("Iron Bars").model(ChiselModelHandlers.IRON_BARS))
            .existingBlock(Blocks.IRON_BARS)
            .variant("iron_bars_barbed_wire", v -> v.description("Menacing Iron Bars").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_bars", v -> v.description("Iron Bars without Frame").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_borderless", v -> v.description("Iron Bars without Frame").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_cage", v -> v.description("Iron Cage Bars").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_classic", v -> v.description("Menacing Iron Bars").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_classic_new", v -> v.description("Vertical Iron Bars").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_fence", v -> v.description("Ornate Iron Pane Fence").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_modern", v -> v.description("Modern").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_ornate_steel", v -> v.description("Ornate Steel").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_ornate_old")))
            .variant("iron_bars_spikes", v -> v.description("Iron Spikes").blockFactory((p) -> new ChiselIronBarsBlock(p)))
            .variant("iron_bars_thick_grid", v -> v.description("Thick Iron Grid").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_grid_thick")))
            .variant("iron_bars_thin_grid", v -> v.description("Thin Iron Grid").blockFactory((p) -> new ChiselIronBarsBlock(p))
                    .texture(Chisel.prefix("block/glass/glass_grid_thin"))));

    private IronBarsFamily() {
    }
}
