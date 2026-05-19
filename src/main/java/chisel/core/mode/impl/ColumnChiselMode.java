package chisel.core.mode.impl;

import chisel.Chisel;
import chisel.core.mode.ChiselMode;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class ColumnChiselMode extends ChiselMode {
    public ColumnChiselMode() {
        super(Chisel.prefix("column"));
    }

    @Override
    public List<BlockPos> getAffectedBlocks(Level level, Player player, BlockPos pos, Direction side, BlockState state) {
        List<BlockPos> affected = new ArrayList<>();
        Direction up = (side == Direction.UP || side == Direction.DOWN) ? Direction.NORTH : Direction.UP;
        affected.add(pos);
        affected.add(pos.relative(up));
        affected.add(pos.relative(up.getOpposite()));
        return affected;
    }
}
