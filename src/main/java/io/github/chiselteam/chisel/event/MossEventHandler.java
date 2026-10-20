package io.github.chiselteam.chisel.event;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.moss.ClientMossData;
import io.github.chiselteam.chisel.network.MossChunkPacket;
import io.github.chiselteam.chisel.projectile.MossHelper;
import io.github.chiselteam.chisel.registry.ChiselAttachments;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;
import net.neoforged.neoforge.event.level.ChunkWatchEvent;
import net.neoforged.neoforge.network.PacketDistributor;

@EventBusSubscriber(modid = Chisel.MODID)
public final class MossEventHandler {
    private MossEventHandler() {
    }

    @SubscribeEvent
    public static void onChunkSent(ChunkWatchEvent.Sent event) {
        var data = event.getLevel().getData(ChiselAttachments.MOSS);
        PacketDistributor.sendToPlayer(event.getPlayer(), new MossChunkPacket(event.getPos(), data.inChunk(event.getPos())));
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onBrush(UseItemOnBlockEvent event) {
        if (event.getUsePhase() != UseItemOnBlockEvent.UsePhase.ITEM_BEFORE_BLOCK || !(event.getItemStack().getItem() instanceof BrushItem)) return;

        var player = event.getPlayer();
        var face = event.getFace();
        var level = event.getLevel();
        var pos = event.getPos();
        if (player == null || player.isSpectator() || face == null
                || !level.mayInteract(player, pos)
                || !player.mayUseItemAt(pos.relative(face), face, event.getItemStack())) return;

        if (level.isClientSide()) {
            if (ClientMossData.contains(pos)) {
                player.startUsingItem(event.getHand());
                event.cancelWithResult(InteractionResult.CONSUME);
            }
        } else if (level instanceof ServerLevel serverLevel && MossHelper.remove(serverLevel, pos)) {
            event.getItemStack().hurtAndBreak(1, player, event.getHand());
            if (!player.isUsingItem()) level.playSound(null, pos, SoundEvents.BRUSH_GENERIC, SoundSource.BLOCKS);
            player.startUsingItem(event.getHand());
            event.cancelWithResult(InteractionResult.CONSUME);
        }
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onBrushTick(LivingEntityUseItemEvent.Tick event) {
        if (!(event.getEntity() instanceof Player player) || !(player.level() instanceof ServerLevel level)
                || !(event.getItem().getItem() instanceof BrushItem) || event.getDuration() <= 0
                || !player.isUsingItem() || player.getUseItem() != event.getItem()) return;

        int elapsed = event.getItem().getUseDuration(player) - event.getDuration() + 1;
        if (elapsed % BrushItem.ANIMATION_DURATION != 5) return;

        var hit = ProjectileUtil.getHitResultOnViewVector(player, EntitySelector.CAN_BE_PICKED, player.blockInteractionRange());
        if (!(hit instanceof BlockHitResult blockHit) || hit.getType() != HitResult.Type.BLOCK
                || !level.hasData(ChiselAttachments.MOSS)
                || !level.getData(ChiselAttachments.MOSS).contains(blockHit.getBlockPos())) return;

        NeoForge.EVENT_BUS.post(new UseItemOnBlockEvent(new UseOnContext(player, event.getHand(), blockHit), UseItemOnBlockEvent.UsePhase.ITEM_BEFORE_BLOCK));
    }
}