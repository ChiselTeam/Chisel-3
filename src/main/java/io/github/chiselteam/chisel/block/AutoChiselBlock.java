package io.github.chiselteam.chisel.block;

import com.mojang.serialization.MapCodec;
import io.github.chiselteam.chisel.block.entity.AutoChiselBlockEntity;
import io.github.chiselteam.chisel.menu.AutoChiselMenu;
import io.github.chiselteam.chisel.registry.ChiselBlockEntities;
import io.github.chiselteam.chisel.registry.ChiselStats;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AutoChiselBlock extends BaseEntityBlock {

    public static final MapCodec<AutoChiselBlock> CODEC = simpleCodec(AutoChiselBlock::new);
    private static final VoxelShape COLLISION_SHAPE = Shapes.or(
            box(0, 0, 0, 16, 10, 16),
            box(0, 10, 0, 1, 16, 16),
            box(15, 10, 0, 16, 16, 16),
            box(0, 10, 0, 16, 16, 1),
            box(0, 10, 15, 16, 16, 16),
            box(0, 15, 0, 16, 16, 16)
    );

    private static final VoxelShape SELECTION_SHAPE = box(0, 0, 0, 16, 16, 16);

    public AutoChiselBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new AutoChiselBlockEntity(pos, state);
    }

    @Override
    protected @NotNull VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return COLLISION_SHAPE;
    }

    @Override
    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return SELECTION_SHAPE;
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if(!level.isClientSide) {
            player.openMenu(state.getMenuProvider(level, pos), pos);
            player.awardStat(ChiselStats.INTERACT_WITH_AUTO_CHISEL.get());
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    protected @Nullable MenuProvider getMenuProvider(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof AutoChiselBlockEntity autoChisel) {
            return new SimpleMenuProvider((id, inv, ignored) -> new AutoChiselMenu(id, inv, autoChisel, autoChisel.getData()), Component.translatable("container.auto_chisel"));
        }
        return super.getMenuProvider(state, level, pos);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> type) {
        return createTickerHelper(type, ChiselBlockEntities.AUTO_CHISEL.get(), AutoChiselBlockEntity::tick);
    }
}
