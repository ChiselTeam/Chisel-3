package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselRotatedPillarBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class SteampunkFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("steampunk", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Steampunk Block"))
            .variant("steampunk_rusted_metal_sheet", v -> v.description("Rusted Metal Sheet").model(ChiselModelHandlers.CONNECTED))
            .variant("steampunk_large_metal_sheets", v -> v.description("Large Metal Sheets").model(ChiselModelHandlers.V16))
            .variant("steampunk_pipes", v -> v.description("Pipes").model(ChiselModelHandlers.V16))
            .variant("steampunk_mechanical_clock", v -> v.description("Mechanical Clock").model(ChiselModelHandlers.V9))
            .variant("steampunk_mechanical_clock_transparent", v -> v.description("Mechanical Clock (Transparent)").properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()).model(ChiselModelHandlers.V9))
            .variant("steampunk_gear_train", v -> v.description("Gear Train").model(ChiselModelHandlers.V4))
            .variant("steampunk_gear_train_animated", v -> v.description("Gear Train (Animated)").model(ChiselModelHandlers.V4))
            .variant("steampunk_rusted_metal_plating", v -> v.description("Rusted Metal Plating").model(ChiselModelHandlers.V4))
            .variant("steampunk_encased_metal_plate", v -> v.description("Encased Metal Plate").model(ChiselModelHandlers.CONNECTED))
            .variant("steampunk_decorative_metal", v -> v.description("Decorative Metal").model(ChiselModelHandlers.CONNECTED))
            .variant("steampunk_riveted_plating", v -> v.description("Riveted Plating").model(ChiselModelHandlers.CONNECTED))
            .variant("steampunk_broken_plating", v -> v.description("Broken Plating").model(ChiselModelHandlers.CTMV).blockFactory(RotatedPillarBlock::new))
            .variant("steampunk_broken_plating_transparent", v -> v.description("Broken Plating (Transparent)").properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()).model(ChiselModelHandlers.CTMV).blockFactory(ChiselRotatedPillarBlock::new))
            .variant("steampunk_corrugated_sheet_metal", v -> v.description("Corrugated Sheet Metal").model(ChiselModelHandlers.V4))
            .variant("steampunk_diamond_plating", v -> v.description("Diamond Plating").model(ChiselModelHandlers.CONNECTED))
            .variant("steampunk_metal_grate", v -> v.description("Metal Grate").model(ChiselModelHandlers.CONNECTED))
            .variant("steampunk_metal_grate_transparent", v -> v.description("Metal Grate (Transparent)").properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()).model(ChiselModelHandlers.GLASS))
            .variant("steampunk_plating_dirty", v -> v.description("Dirty Plating").model(ChiselModelHandlers.R4))
            .variant("steampunk_plating_verdigris", v -> v.description("Verdigris Plating").model(ChiselModelHandlers.R4))
            .variant("steampunk_bolted_plate", v -> v.description("Bolted Plate").model(ChiselModelHandlers.CTMV).blockFactory(RotatedPillarBlock::new))
        );
    private SteampunkFamily() {
    }
}
