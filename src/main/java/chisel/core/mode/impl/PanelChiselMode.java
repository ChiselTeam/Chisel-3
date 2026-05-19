package chisel.core.mode.impl;

import chisel.Chisel;
import chisel.core.mode.ChiselMode;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class PanelChiselMode extends ChiselMode {
    public PanelChiselMode() {
        super(Chisel.prefix("panel"));
    }

    @Override
    public List<BlockPos> getAffectedBlocks(Level level, Player player, BlockPos pos, Direction side, BlockState state) {
        List<BlockPos> affected = new ArrayList<>();
        Direction up = (side == Direction.UP || side == Direction.DOWN) ? Direction.NORTH : Direction.UP;
        Direction right = (side == Direction.UP || side == Direction.DOWN) ? Direction.EAST : side.getClockWise();

        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                affected.add(pos.relative(up, x).relative(right, y));
            }
        }
        return affected;
    }
}
