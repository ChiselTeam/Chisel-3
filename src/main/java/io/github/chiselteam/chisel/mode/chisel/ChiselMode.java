package io.github.chiselteam.chisel.mode.chisel;

import com.mojang.serialization.Codec;
import io.github.chiselteam.chisel.api.family.Variant;
import io.github.chiselteam.chisel.api.family.VariantFamily;
import io.github.chiselteam.chisel.family.VariantFamilyLookup;
import io.github.chiselteam.chisel.item.ChiselItem;
import io.github.chiselteam.chisel.registry.ChiselModes;
import io.github.chiselteam.chisel.registry.ChiselSounds;
import io.github.chiselteam.chisel.registry.ChiselStats;
import io.github.chiselteam.chisel.registry.ChiselTags;
import io.github.chiselteam.chisel.util.TorchStates;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ChiselMode {

    public static final Codec<ChiselMode> CODEC = Identifier.CODEC.xmap(
            id -> ChiselModes.REGISTRY.getOptional(id).orElseGet(() -> new ChiselMode(id))
            , ChiselMode::registryName
    );

    public static final StreamCodec<ByteBuf, ChiselMode> STREAM_CODEC = Identifier.STREAM_CODEC.map(
            id -> ChiselModes.REGISTRY.getOptional(id).orElseGet(() -> new ChiselMode(id))
            , ChiselMode::registryName
    );

    private final Identifier registryName;

    public ChiselMode(Identifier registryName) {
        this.registryName = registryName;
    }

    public List<BlockPos> getAffectedBlocks(Level level, Player player, BlockPos pos, Direction side, BlockState state) {
        return Collections.singletonList(pos);
    }

    public Component getDescription() {
        return Component.translatable("chisel.mode.%s".formatted(registryName.getPath()));
    }

    public void onLeftClick(Level level, Player player, InteractionHand hand, BlockPos pos, Direction side, BlockState state, ItemStack chisel) {
        List<BlockPos> affected = getAffectedBlocks(level, player, pos, side, state);
        VariantFamily family = VariantFamilyLookup.getFamilyForBlock(state.getBlock(), level.registryAccess());
        if (family == null) return;

        var nextState = nextState(family, state);
        if (nextState == null) return;

        boolean changed = false;
        for (BlockPos p : affected) {
            var before = level.getBlockState(p);
            chiselBlock(level, player, hand, p, nextState, chisel);
            changed |= level.getBlockState(p) != before;
        }
        if (changed) {
            playEffects(level, player, pos, nextState);
        }
    }

    static @Nullable BlockState nextState(VariantFamily family, BlockState state) {
        List<Block> variants = family.getAllVariants().stream().map(Variant::getBlock).toList();
        var currentBlock = state.getBlock();
        if (TorchStates.isTorch(currentBlock)) {
            currentBlock = TorchStates.standingBlock(currentBlock);
            variants = variants.stream().filter(TorchStates::isTorch).map(TorchStates::standingBlock).distinct().toList();
        }
        int index = variants.indexOf(currentBlock);
        return index < 0 ? null : variants.get((index + 1) % variants.size()).defaultBlockState();
    }

    protected void chiselBlock(Level level, Player player, InteractionHand hand, BlockPos pos, BlockState state, ItemStack chisel) {
        var current = level.getBlockState(pos);
        var replacement = TorchStates.replacement(level, pos, current, state);
        if (replacement == null || replacement == current || !level.setBlockAndUpdate(pos, replacement)) return;
        player.awardStat(ChiselStats.BLOCKS_CHISELED.get());
        ChiselItem.hurtAndBreak(chisel, 1, player, hand);
    }

    protected void playEffects(Level level, Player player, BlockPos hitPos, BlockState state) {
        level.addDestroyBlockEffect(hitPos, state);
        level.playSound(null, player.getX(), player.getY(), player.getZ(),
                state.is(ChiselTags.WOOD) ? ChiselSounds.WOOD.value() : ChiselSounds.FALLBACK.value(),
                SoundSource.PLAYERS);
    }

    protected boolean isSameBlock(Level level, BlockState base, BlockState test) {
        var family = VariantFamilyLookup.getFamilyForBlock(base.getBlock(), level.registryAccess());
        if (family == null) return false;
        return family.isBlockInFamily(test.getBlock());
    }

    @Override
    public @NonNull String toString() {
        return registryName.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var that = (ChiselMode) o;
        return registryName.equals(that.registryName);
    }

    public Identifier registryName() {
        return registryName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryName);
    }
}
