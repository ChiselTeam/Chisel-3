package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class FactoryFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("factory", builder -> builder
            .defaults(variant -> variant
                    .properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
                    .blockName("Factory Block")
                    .model(ChiselModelHandlers.CONNECTED))
            .variant("factory_circuit", variant -> variant
                    .description("Fancy Circuit Block"))
            .variant("factory_column", variant -> variant
                    .description("Worn Metal Column")
                    .model(ChiselModelHandlers.CTMV)
                    .blockFactory(RotatedPillarBlock::new)
                    .texture("bottom", Chisel.prefix("block/factory/factory_column-top"))
                    .texture("vertical_both", Chisel.prefix("block/factory/factory_column-side")))
            .variant("factory_dots", variant -> variant
                    .description("Rusty Metal Plate with Dotted Pattern"))
            .variant("factory_frame_blue", variant -> variant
                    .description("Metallic Blue Circuit Plating"))
            .variant("factory_gold_plate", variant -> variant
                    .description("Gold-Plated Fancy Circuit Block"))
            .variant("factory_gold_plating", variant -> variant
                    .description("Gold-Plated Rusty Purple Block"))
            .variant("factory_grinder", variant -> variant
                    .description("Grinder"))
            .variant("factory_hazard", variant -> variant
                    .description("Yellow-Black Hazard Block"))
            .variant("factory_hazard_orange", variant -> variant
                    .description("Orange-White Hazard Block"))
            .variant("factory_ice", variant -> variant
                    .description("Ice"))
            .variant("factory_metal_box", variant -> variant
                    .description("Fancy Metal Box")
                    .model(ChiselModelHandlers.TBS)
                    .texture("bottom", Chisel.prefix("block/factory/factory_metal_box-top")))
            .variant("factory_platex", variant -> variant
                    .description("Plate"))
            .variant("factory_plating", variant -> variant
                    .description("Rusty Metal Plate")
                    .model(ChiselModelHandlers.CUBE_ALL))
            .variant("factory_rust", variant -> variant
                    .description("Very Rusty Metal Plate"))
            .variant("factory_rust2", variant -> variant
                    .description("A Metal Plate with Little Rust"))
            .variant("factory_rust_plates", variant -> variant
                    .description("Rusty Metal Plates"))
            .variant("factory_tile_mosaic", variant -> variant
                    .description("Tile Mosaic"))
            .variant("factory_vent", variant -> variant
                    .description("Worn Metal Wall with Ventilation Openings")
                    .model(ChiselModelHandlers.CTMV)
                    .blockFactory(RotatedPillarBlock::new)
                    .texture("bottom", Chisel.prefix("block/factory/factory_vent-top"))
                    .texture("vertical_both", Chisel.prefix("block/factory/factory_vent-side")))
            .variant("factory_wireframe", variant -> variant
                    .description("Wireframe"))
            .variant("factory_wireframe_blue", variant -> variant
                    .description("Wireframe in a Shade of Purple"))
            .variant("factory_wireframe_white", variant -> variant
                    .description("White Wireframe")));

    private FactoryFamily() {
    }
}
