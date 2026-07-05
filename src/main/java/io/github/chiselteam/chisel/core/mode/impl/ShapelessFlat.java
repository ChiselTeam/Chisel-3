package io.github.chiselteam.chisel.core.mode.impl;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.core.mode.ChiselMode;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.*;

public class ShapelessFlat extends ChiselMode {
    public ShapelessFlat() {
        super(Chisel.prefix("shapeless_flat"));
    }

    @Override
    public List<BlockPos> getAffectedBlocks(Level level, Player player, BlockPos pos, Direction side, BlockState state) {
        List<BlockPos> affected = new ArrayList<>();
        Queue<BlockPos> toProcess = new LinkedList<>();
        Set<BlockPos> visited = new HashSet<>();

        toProcess.add(pos);
        visited.add(pos);

        Direction up = (side == Direction.UP || side == Direction.DOWN) ? Direction.NORTH : Direction.UP;
        Direction right = (side == Direction.UP || side == Direction.DOWN) ? Direction.EAST : side.getClockWise();
        Direction[] planeDirs = {up, up.getOpposite(), right, right.getOpposite()};

        while (!toProcess.isEmpty()) {
            BlockPos current = toProcess.poll();
            if (isSameBlock(level, state, level.getBlockState(current))) {
                affected.add(current);

                for (Direction dir : planeDirs) {
                    BlockPos next = current.relative(dir);
                    if (!visited.contains(next) && 
                        Math.abs(next.getX() - pos.getX()) <= 10 &&
                        Math.abs(next.getY() - pos.getY()) <= 10 &&
                        Math.abs(next.getZ() - pos.getZ()) <= 10) {
                        visited.add(next);
                        toProcess.add(next);
                    }
                }
            }
        }
        return affected;
    }
}
