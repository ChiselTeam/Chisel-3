package io.github.chiselteam.chisel.content.family.decorative;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.api.model.ChiselModelHandlers;
import io.github.chiselteam.chisel.content.ChiselFamily;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class NexusFamily {
    public static final ChiselFamily FAMILY = ChiselFamily.build("nexus", builder -> builder
            .defaults(v -> v.properties(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(3.0F, 5.0F).lightLevel((_) -> 10)).blockName("Nexus Block"))
            .variant("nexus_core", v -> v.description("Nexus Core"))
            .variant("nexus_grate_pillar", v -> v.description("Nexus Grate Pillar").model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/nexus/nexus_grate_pillar-bottom")))
            .variant("nexus_junction", v -> v.description("Nexus Junction"))
            .variant("nexus_link", v -> v.description("Nexus Link"))
            .variant("nexus_path", v -> v.description("Nexus Path").model(ChiselModelHandlers.CONNECTED))
            .variant("nexus_plate", v -> v.description("Nexus Plate"))
            .variant("nexus_plating_pillar", v -> v.description("Nexus Plating Pillar").model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/nexus/nexus_plating_pillar-bottom")))
            .variant("nexus_weave_pillar", v -> v.description("Nexus Weave Pillar").model(ChiselModelHandlers.TBS)
                    .texture("top", Chisel.prefix("block/nexus/nexus_weave_pillar-bottom")))
            .variant("nexus_railing_pillar", v -> v.description("Nexus Railing Pillar").model(ChiselModelHandlers.CTMV)
                    .textureAlias("bottom", "top")
                    .texture("top", Chisel.prefix("block/nexus/nexus_railing_pillar-side"))
                    .textureAlias("vertical_bottom", "top")
                    .textureAlias("vertical_none", "top")
                    .textureAlias("vertical_top", "top")));

    private NexusFamily() {
    }
}
