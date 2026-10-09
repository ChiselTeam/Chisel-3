package io.github.chiselteam.chisel.content.family.special;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselIronBarsBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class IronBarsFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("iron_bars", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS))
                    .blockName("Iron Bars")
                    .model(ChiselModelHandlers.IRON_BARS))
            .existingBlock(Blocks.IRON_BARS)
            .variant("iron_bars_barbed_wire", variant -> variant
                    .description("Menacing Iron Bars")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_barbed_wire"))))))
            .variant("iron_bars_bars", variant -> variant
                    .description("Iron Bars without Frame")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_bars"))))))
            .variant("iron_bars_borderless", variant -> variant
                    .description("Iron Bars without Frame")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_borderless"))))))
            .variant("iron_bars_cage", variant -> variant
                    .description("Iron Cage Bars")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_cage"))))))
            .variant("iron_bars_classic", variant -> variant
                    .description("Menacing Iron Bars")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_classic"))))))
            .variant("iron_bars_classic_new", variant -> variant
                    .description("Vertical Iron Bars")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_classic_new"))))))
            .variant("iron_bars_fence", variant -> variant
                    .description("Ornate Iron Pane Fence")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_fence"))))))
            .variant("iron_bars_modern", variant -> variant
                    .description("Modern")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_modern"))))))
            .variant("iron_bars_ornate_steel", variant -> variant
                    .description("Ornate Steel")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_ornate_steel")))))
                    .texture(Chisel.prefix("block/glass/glass_ornate_old")))
            .variant("iron_bars_spikes", variant -> variant
                    .description("Iron Spikes")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_spikes"))))))
            .variant("iron_bars_thick_grid", variant -> variant
                    .description("Thick Iron Grid")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_thick_grid")))))
                    .texture(Chisel.prefix("block/glass/glass_grid_thick")))
            .variant("iron_bars_thin_grid", variant -> variant
                    .description("Thin Iron Grid")
                    .blockFactory((p) -> new ChiselIronBarsBlock(p.setId(ResourceKey.create(Registries.BLOCK, Chisel.prefix("iron_bars_thin_grid")))))
                    .texture(Chisel.prefix("block/glass/glass_grid_thin"))));

    private IronBarsFamily() {
    }
}
