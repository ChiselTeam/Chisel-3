package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.family.VariantFamilyLookup;
import io.github.chiselteam.chisel.integration.BlockPermissions;
import io.github.chiselteam.ctm.api.texture.CTMBlockOffsets;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;

import java.awt.geom.Line2D;
import java.util.*;
import java.util.function.Consumer;

public class OffsetToolItem extends Item {
    public OffsetToolItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NonNull InteractionResult useOn(UseOnContext context) {
        BlockPos pos = context.getClickedPos();
        BlockState state = context.getLevel().getBlockState(pos);
        if (VariantFamilyLookup.getFamilyForBlock(state.getBlock(), context.getLevel().registryAccess()) != null) {
            if (context.getLevel().isClientSide()) {
                return InteractionResult.SUCCESS;
            } else {
                Direction facing = context.getClickedFace();
                Vec3 hit = context.getClickLocation();
                Direction moveDir = getMoveDir(facing, hit.x - pos.getX(), hit.y - pos.getY(), hit.z - pos.getZ());

                var level = (ServerLevel) context.getLevel();
                var currentOffset = CTMBlockOffsets.getOffset(level, pos);
                var newOffset = wrap(currentOffset.relative(moveDir.getOpposite()));

                try {
                    if (!canOffsetConnected(context)) return InteractionResult.FAIL;
                    CTMBlockOffsets.setConnectedOffset(level, pos, newOffset);
                } catch (IllegalArgumentException limitExceeded) {
                    if (context.getPlayer() != null) {
                        context.getPlayer().sendOverlayMessage(Component.translatable("item.chisel.offset_tool.too_many_blocks", CTMBlockOffsets.DEFAULT_LIMIT));
                    }
                    return InteractionResult.FAIL;
                }

                return InteractionResult.SUCCESS;
            }
        }
        return super.useOn(context);
    }

    public Direction getMoveDir(Direction face, double x, double y, double z) {
        Map<Double, Direction> map = new HashMap<>();
        if (face.getStepX() != 0) {
            fillMap(map, z, y, Direction.DOWN, Direction.UP, Direction.NORTH, Direction.SOUTH);
        } else if (face.getStepY() != 0) {
            fillMap(map, x, z, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST);
        } else if (face.getStepZ() != 0) {
            fillMap(map, x, y, Direction.DOWN, Direction.UP, Direction.WEST, Direction.EAST);
        }
        if (map.isEmpty()) return Direction.NORTH;
        List<Double> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        return map.get(keys.getFirst());
    }

    private boolean canOffsetConnected(UseOnContext context) {
        var level = context.getLevel();
        var block = level.getBlockState(context.getClickedPos()).getBlock();
        Set<BlockPos> visited = new HashSet<>();
        ArrayDeque<BlockPos> pending = new ArrayDeque<>();
        pending.add(context.getClickedPos());
        int count = 0;
        while (!pending.isEmpty()) {
            var pos = pending.removeFirst();
            if (!visited.add(pos) || !level.hasChunkAt(pos) || !level.getBlockState(pos).is(block)) continue;
            if (++count > CTMBlockOffsets.DEFAULT_LIMIT) throw new IllegalArgumentException("Connected block limit exceeded");
            if (!BlockPermissions.canEdit(context.getPlayer(), level, pos, context.getHand(), context.getItemInHand())) return false;
            for (var direction : Direction.values()) pending.addLast(pos.relative(direction));
        }
        return true;
    }

    private void fillMap(Map<Double, Direction> map, double x, double y, Direction... dirs) {
        map.put(Line2D.ptLineDistSq(0, 0, 1, 0, x, y), dirs[0]);
        map.put(Line2D.ptLineDistSq(0, 1, 1, 1, x, y), dirs[1]);
        map.put(Line2D.ptLineDistSq(0, 0, 0, 1, x, y), dirs[2]);
        map.put(Line2D.ptLineDistSq(1, 0, 1, 1, x, y), dirs[3]);
    }

    private BlockPos wrap(BlockPos pos) {
        return new BlockPos(positiveModulo(pos.getX()), positiveModulo(pos.getY()), positiveModulo(pos.getZ()));
    }

    private int positiveModulo(int num) {
        return (num % 16 + 16) % 16;
    }

    @Override
    public void appendHoverText(@NonNull ItemStack stack, @NonNull TooltipContext context, @NonNull TooltipDisplay display, @NonNull Consumer<Component> builder, @NonNull TooltipFlag flag) {
        builder.accept(Component.translatable("item.chisel.offset_tool.desc").withColor(0xAAAAAA));
        builder.accept(Component.translatable("item.chisel.offset_tool.desc2").withColor(0xAAAAAA));
    }
}
