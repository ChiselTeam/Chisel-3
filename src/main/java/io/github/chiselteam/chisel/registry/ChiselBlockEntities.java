package io.github.chiselteam.chisel.registry;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import io.github.chiselteam.chisel.block.entity.BuildersGuideBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ChiselBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Chisel.MODID);

    public static final Supplier<BlockEntityType<AutoChiselBlockEntity>> AUTO_CHISEL = BLOCK_ENTITIES.register("auto_chisel", () -> new BlockEntityType<>(AutoChiselBlockEntity::new, false, ChiselBlocks.AUTO_CHISEL.get()));
    public static final Supplier<BlockEntityType<BuildersGuideBlockEntity>> BUILDERS_GUIDE = BLOCK_ENTITIES.register("builders_guide", () -> new BlockEntityType<>(BuildersGuideBlockEntity::new, false, ChiselBlocks.BUILDERS_GUIDE.get()));
}
