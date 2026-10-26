package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.block.ChiselRotatedPillarBlock;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class FactoryFamily {
        public static final ChiselFamily FAMILY = ChiselFamily.build("factory", builder -> builder
                .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)).blockName("Factory Block").model(ChiselModelHandlers.CONNECTED))
                .variant("factory_circuit", v -> v.description("Fancy Circuit Block"))
                .variant("factory_column", v -> v.description("Worn Metal Column").model(ChiselModelHandlers.CTMV).blockFactory(ChiselRotatedPillarBlock::new)
                        .texture("bottom", Chisel.prefix("block/factory/factory_column-top"))
                        .texture("vertical_both", Chisel.prefix("block/factory/factory_column-side")))
                .variant("factory_dots", v -> v.description("Rusty Metal Plate with Dotted Pattern"))
                .variant("factory_frame_blue", v -> v.description("Metallic Blue Circuit Plating"))
                .variant("factory_gold_plate", v -> v.description("Gold-Plated Fancy Circuit Block"))
                .variant("factory_gold_plating", v -> v.description("Gold-Plated Rusty Purple Block"))
                .variant("factory_grinder", v -> v.description("Grinder"))
                .variant("factory_hazard", v -> v.description("Yellow-Black Hazard Block"))
                .variant("factory_hazard_orange", v -> v.description("Orange-White Hazard Block"))
                .variant("factory_ice", v -> v.description("Ice"))
                .variant("factory_metal_box", v -> v.description("Fancy Metal Box").model(ChiselModelHandlers.TBS)
                        .texture("bottom", Chisel.prefix("block/factory/factory_metal_box-top")))
                .variant("factory_platex", v -> v.description("Plate"))
                        .variant("factory_plating", v -> v.description("Metal Plate").model(ChiselModelHandlers.V9)
                                .texture("v9_bottom_right", Chisel.prefix("block/factory/factory_plating-v9_top_right"))
                                .texture("v9_top_left", Chisel.prefix("block/factory/factory_plating")))
                .variant("factory_rust", v -> v.description("Very Rusty Metal Plate"))
                .variant("factory_rust2", v -> v.description("A Metal Plate with Little Rust"))
                .variant("factory_rust_plates", v -> v.description("Rusty Metal Plates"))
                .variant("factory_tile_mosaic", v -> v.description("Tile Mosaic"))
                .variant("factory_vent", v -> v.description("Worn Metal Wall with Ventilation Openings").model(ChiselModelHandlers.CTMV).blockFactory(ChiselRotatedPillarBlock::new)
                        .texture("bottom", Chisel.prefix("block/factory/factory_vent-top"))
                        .texture("vertical_both", Chisel.prefix("block/factory/factory_vent-side")))
                .variant("factory_wireframe", v -> v.description("Wireframe"))
                .variant("factory_wireframe_blue", v -> v.description("Blue Wireframe"))
                .variant("factory_wireframe_white", v -> v.description("White Wireframe"))
                );
        private FactoryFamily() {
        }
}
