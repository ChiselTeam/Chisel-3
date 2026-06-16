package io.github.chiselteam.chisel.client;

import io.github.chiselteam.chisel.client.feature.OffsetToolOverlayFeatureRenderer;
import io.github.chiselteam.chisel.core.variant.VariantFamily;
import io.github.chiselteam.chisel.registry.ChiselItems;
import io.github.chiselteam.chisel.util.VariantFinder;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.state.level.BlockOutlineRenderState;
import net.minecraft.client.renderer.state.level.LevelRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.util.ARGB;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.client.CustomBlockOutlineRenderer;
import net.neoforged.neoforge.client.submit.RenderPhaseKeys;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.atomic.AtomicBoolean;

public class ChiselOffsetToolOutlineRenderer implements CustomBlockOutlineRenderer {

    @SuppressWarnings("FieldCanBeLocal")
    private final int HIGH_CONTRAST_COLOR = -11010079;
    private final int LOW_CONTRAST_COLOR = ARGB.black(102);
    private final BlockHitResult hit;
    private final Vec3 cameraRelativePos;

    public ChiselOffsetToolOutlineRenderer(BlockHitResult hit, Vec3 cameraRelativePos) {
        this.hit = hit;
        this.cameraRelativePos = cameraRelativePos;
    }

    @Override
    public boolean render(@NonNull BlockOutlineRenderState state, SubmitNodeCollector collector, @NonNull PoseStack pose, @NonNull LevelRenderState levelState) {
        ClientLevel level = Minecraft.getInstance().level;
        BlockPos pos = state.pos();
        if (level == null) return false;
        Player player = Minecraft.getInstance().player;
        if (player == null) return false;
        if (cannotOffset(player, InteractionHand.MAIN_HAND, pos, level) && cannotOffset(player, InteractionHand.OFF_HAND, pos, level)) {
            return false;
        }
        int outlineColor = state.highContrast() ? HIGH_CONTRAST_COLOR : LOW_CONTRAST_COLOR;
        int triangleColor = ARGB.color(0xAA, 0xFF, 0xFF, 0xFF);

        collector.submitSpecial(RenderPhaseKeys.OUTLINE, new OffsetToolOverlayFeatureRenderer.Submit(pose, pos, hit, cameraRelativePos, outlineColor, triangleColor));
        return false;
    }

    private static boolean cannotOffset(Player player, InteractionHand hand, BlockPos pos, Level level) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getItem() == ChiselItems.OFFSET_TOOL.get()) {
            BlockState state = level.getBlockState(pos);
            VariantFamily family = VariantFinder.getFamilyForBlock(state.getBlock(), level.registryAccess());
            if(family == null) return true;

            AtomicBoolean checkVariant = new AtomicBoolean(false);

            family.getVariants().forEach(variant -> {
                if(state.is(variant.getBlock())) {
                    if(variant.getModelHandler().multiblockSize() > 0 && !variant.getModelHandler().usesRandomTexture()) checkVariant.set(true);
                }
            });

            return !checkVariant.get();
        }
        return true;
    }
}
