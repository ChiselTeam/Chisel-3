package io.github.chiselteam.chisel.core.mode.impl;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.core.mode.ChiselMode;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Collections;
import java.util.List;

public class SingleChiselMode extends ChiselMode {
    public SingleChiselMode() {
        super(Chisel.prefix("single"));
    }

    @Override
    public List<BlockPos> getAffectedBlocks(Level level, Player player, BlockPos pos, Direction side, BlockState state) {
        return Collections.singletonList(pos);
    }
}
