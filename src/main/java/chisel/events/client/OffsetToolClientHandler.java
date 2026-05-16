package chisel.events.client;

import chisel.Chisel;
import chisel.client.ChiselOffsetToolOutlineRenderer;
import chisel.registry.ChiselItems;
import chisel.util.VariantFinder;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ExtractBlockOutlineRenderStateEvent;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent;

import java.util.HashMap;
import java.util.Map;

@EventBusSubscriber(modid = Chisel.MODID, value = Dist.CLIENT)
public class OffsetToolClientHandler {

    private static final Map<ChunkPos, BlockPos> chunkOffsets = new HashMap<>();

    public static void setOffset(ChunkPos pos, BlockPos offset) {
        chunkOffsets.put(pos, offset);
    }

    public static BlockPos getOffset(ChunkPos pos) {
        return chunkOffsets.getOrDefault(pos, BlockPos.ZERO);
    }

    @SubscribeEvent
    public static void onBlockHighlight(ExtractBlockOutlineRenderStateEvent event) {
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
