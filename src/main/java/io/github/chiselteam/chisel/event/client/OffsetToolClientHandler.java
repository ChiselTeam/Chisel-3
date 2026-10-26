package io.github.chiselteam.chisel.event.client;

import io.github.chiselteam.chisel.Chisel;
import io.github.chiselteam.chisel.client.render.ChiselOffsetToolOutlineRenderer;
import io.github.chiselteam.ctm.client.CTMOffsetClientHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderHighlightEvent;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class OffsetToolClientHandler {

    public static void setOffset(ChunkPos pos, BlockPos offset) {
        CTMOffsetClientHandler.setOffset(pos, offset);
    }

    public static BlockPos getOffset(ChunkPos pos) {
        return CTMOffsetClientHandler.getOffset(pos);
    }

    @SubscribeEvent
    public static void onBlockHighlight(RenderHighlightEvent.Block event) {
        Vec3 cameraPos = event.getCamera().getPosition();
        BlockPos blockPos = event.getTarget().getBlockPos();
        Vec3 cameraRelativePos = new Vec3(
                blockPos.getX() - cameraPos.x,
                blockPos.getY() - cameraPos.y,
                blockPos.getZ() - cameraPos.z
        );
        new ChiselOffsetToolOutlineRenderer(event.getTarget(), cameraRelativePos).render(event.getMultiBufferSource(), event.getPoseStack());
    }
}
