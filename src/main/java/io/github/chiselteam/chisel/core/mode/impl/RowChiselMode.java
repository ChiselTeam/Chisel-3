package io.github.chiselteam.chisel.core.mode.impl;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.core.mode.ChiselMode;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class RowChiselMode extends ChiselMode {
    public RowChiselMode() {
        super(Chisel.prefix("row"));
    }

    @Override
    public List<BlockPos> getAffectedBlocks(Level level, Player player, BlockPos pos, Direction side, BlockState state) {
        List<BlockPos> affected = new ArrayList<>();
        Direction right;
        if (side == Direction.UP || side == Direction.DOWN) {
            right = Direction.EAST;
        } else {
            right = side.getClockWise();
        }
        affected.add(pos);
        affected.add(pos.relative(right));
        affected.add(pos.relative(right.getOpposite()));
        return affected;
    }
}
