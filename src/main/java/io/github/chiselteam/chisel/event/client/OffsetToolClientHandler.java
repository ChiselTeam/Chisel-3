package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.render.ChiselOffsetToolOutlineRenderer;
import io.github.chiselteam.ctm.client.CTMOffsetClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ExtractBlockOutlineRenderStateEvent;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class OffsetToolClientHandler {

    public static void setOffset(ChunkPos pos, BlockPos offset) {
        CTMOffsetClientHandler.setOffset(pos, offset);
    }

    public static BlockPos getOffset(ChunkPos pos) {
        return CTMOffsetClientHandler.getOffset(pos);
    }

    @SubscribeEvent
    public static void onBlockHighlight(ExtractBlockOutlineRenderStateEvent event) {
        var player = Minecraft.getInstance().player;
        if (player == null) return;
        var pos = event.getBlockPos();
        if (!ChiselOffsetToolOutlineRenderer.canOffset(player, InteractionHand.MAIN_HAND, pos, player.level())
                && !ChiselOffsetToolOutlineRenderer.canOffset(player, InteractionHand.OFF_HAND, pos, player.level())) return;

        Vec3 cameraPos = event.getCamera().position();
        BlockPos blockPos = event.getBlockPos();
        Vec3 cameraRelativePos = new Vec3(
                blockPos.getX() - cameraPos.x,
                blockPos.getY() - cameraPos.y,
                blockPos.getZ() - cameraPos.z
        );
        event.addCustomRenderer(new ChiselOffsetToolOutlineRenderer(event.getHitResult(), cameraRelativePos));
    }
}
