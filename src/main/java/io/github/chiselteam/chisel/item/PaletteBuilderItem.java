package io.github.chiselteam.chisel.item;

import io.github.chiselteam.chisel.network.OpenPaletteBuilderPacket;
import io.github.chiselteam.chisel.palette.PlayerPaletteManager;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.PacketDistributor;
import org.jetbrains.annotations.NotNull;

public final class PaletteBuilderItem extends Item {
    public PaletteBuilderItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull net.minecraft.world.InteractionResultHolder<net.minecraft.world.item.ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        if (player instanceof ServerPlayer owner) {
            PlayerPaletteManager.get(owner);
            PacketDistributor.sendToPlayer(owner, OpenPaletteBuilderPacket.INSTANCE);
        }
        return net.minecraft.world.InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide);
    }
}
